import java.util.List;
import java.util.Scanner;

import asbtractions.Render;
import base.Filter;
import base.Filter.FilterType;
import base.MyFile;
import base.PrintToDisplay;
import base.PrintToFile;
import config.Config;
import tools.CompareFiles;
import tools.WriteFile;

public class DBVSDB {
	
	public  static void main(String[] data){
		
		String folderpath = "/Users/iustinoctavian/Documents/DiffProdDev/";
		String outFile = folderpath + "outputDIFF.txt";
		MyFile fProd =  new MyFile(folderpath + "PROD_DDL.sql");
		MyFile fDev =  new MyFile(folderpath + "DEV_DDL.sql");
		List<String> resultList =  null;
		String resultString =  null;
		
		PrintToDisplay display =  new PrintToDisplay("");
		display.append(Config.BUILD_NAME);
		display.append("Select an option:");
		display.append("[1] DIFF OF PRODUCTION OVER DEVELOPMENT");
		display.append("[2] DIFF OF DEVELOPMENT OVER PRODUCTION");
		display.append("[30] FILTER THE DIFF BY TABLES/VIEWS");
		display.append("[31] FILTER THE DIFF BY SCHEMAS");
		display.append("[32] FILTER THE DIFF BY PROCEDURES");
		display.append("[33] FILTER THE DIFF BY TRIGGERS");
		display.append("[99] REMOVE FILTERS(IF ANY)");
		display.append("[100] PRINT DIFF(FILTERED/UNFILTERED TO SCREEN)"); 
		display.append("[101] WRITE DIFF(FILTERED/UNFILTERED) TO FILE");
		display.append("[0] EXIT THE APPLICATION");
		Render.to(display);
		display.clearData();

		Scanner scanner =  new Scanner(System.in);
		int code = -1;

		Filter filter =  new Filter();
		FilterType filterType = Filter.FilterType.NO_FILTER;;
		while( (code = scanner.nextInt()) != 0 ){
			switch (code) {

			case 1:
				 resultList =  new CompareFiles(fProd,fDev).setMode(CompareFiles.Comparator.PROD_OVER_DEV).outputDiffToListOfStrings();
				 break;
			case 2:
				resultList = new CompareFiles(fProd, fDev).setMode(CompareFiles.Comparator.DEV_OVER_PROD).outputDiffToListOfStrings();
				break;
			case 30:
				filterType = Filter.FilterType.DDL_FILTER_TABLES;
				break;
			case 31:
				filterType = Filter.FilterType.DDL_FILTER_SCHEMAS;
				break;
			case 32:
				filterType = Filter.FilterType.DDL_FILTER_PROCEDURES;
				break;
			case 33:
				filterType = Filter.FilterType.DDL_FILTER_TRIGGERS;
				break;
			case 99:
				filterType = Filter.FilterType.NO_FILTER;
				break;
				
			case 100:
				Render.to(display);
				break;
			case 101:
				Render.to(new PrintToFile(new WriteFile(outFile, resultString)));
				break;
			default:
				display.setData("scenario not implemented");
				Render.to(display);
				break;
			}
				filter.setFilterType(filterType);
				filter.setSource(resultList);
				resultString = filter.execute().getFilteredText();
				display.setData(resultString);
		}
		scanner.close();
		Render.to(display.setData("Exiting..."));
		
	}
}

