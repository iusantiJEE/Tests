package tools;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

import config.Messages;

public class WriteFile {
	
	private String _text = null;
	private String _filePath =  null;
	
	public WriteFile(String filePath, String textToWrite){
		_text =  textToWrite != null ? textToWrite : Messages.WARN_OUTPUT_EMPTY;
		_filePath = filePath;
	}
	
	public WriteFile write(){
		
		try {
			Files.deleteIfExists(Paths.get(_filePath));
			BufferedWriter bw =  new BufferedWriter(new FileWriter(_filePath));
			bw.write(_text);
			bw.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return this;
	}
	
	public WriteFile close(){
		_text  = null;
		_filePath =  null;
		return this;
	}
	
}
