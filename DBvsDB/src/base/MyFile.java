package base;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class MyFile {
	private String _filepath  =  null;
	private String _buffer = null;
	private List<String> _content=  new ArrayList<String>();
	
	public MyFile(String filepath){
		_filepath = filepath;
	}
	
	public MyFile getContent(){
		try {
			BufferedReader reader = new BufferedReader(new FileReader(_filepath));
			try {
				while( (_buffer = reader.readLine()) != null){
					_content.add(_buffer);
				}
				reader.close();
				return this;
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return this;
	}
	
	public List<String> AsList(){
		return  _content;
	}
}
