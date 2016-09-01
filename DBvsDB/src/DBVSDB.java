import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

import tools.CompareFiles;
import tools.ReadMyFile;

public class DBVSDB {
	
	public  static void main(String[] data){
		String folderpath = "/Users/iustinoctavian/Documents/DiffProdDev/";
		ReadMyFile fProd =  new ReadMyFile(folderpath + "PROD_DDL.sql");
		ReadMyFile fDev =  new ReadMyFile(folderpath + "DEV_DDL.sql");
		
		String result =  new CompareFiles(fProd,fDev).setMode(CompareFiles.Comparator.PROD_OVER_DEV).outputDiffToString();
		
		try {
			String outFile = folderpath + "outputDIFF.txt";
			Files.deleteIfExists(Paths.get(outFile));
			BufferedWriter writer =  new BufferedWriter(new FileWriter(outFile));
			writer.write(result);
			writer.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}

