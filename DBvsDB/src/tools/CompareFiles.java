package tools;

import java.util.ArrayList;
import java.util.List;

public class CompareFiles {
	
	public static enum Comparator{
		PROD_OVER_DEV,
		DEV_OVER_PROD;
	}
	
	private ReadMyFile _fProd =  null;
	private ReadMyFile _fDev =  null;
	private List<String> _diffBuffer =  new ArrayList<String>();
	
	public CompareFiles(ReadMyFile fProd, ReadMyFile fDev) {
		_fProd = fProd;
		_fDev = fDev;
	}

	private void  createDiffBuffer(List<String> source, List<String> destination){
		boolean found = false;
		for (int i = 0; i < source.size(); i++){
			for (int j = 0; j < destination.size(); j++){
				if ( found = (source.get(i).equalsIgnoreCase(destination.get(j)))){
					break;
				}
			}
			if(!found){
				_diffBuffer.add(source.get(i));
			}
		}
	}
	
	public CompareFiles setMode(Comparator comparator) {
		_diffBuffer.clear();
		_diffBuffer.add("DBVSDB internal tool@ IA");
		switch(comparator){
		case PROD_OVER_DEV:
			_diffBuffer.add("Mode is : PRODUCTION OVER DEVELOPMENT");
			createDiffBuffer(_fProd.getContent().AsList(), _fDev.getContent().AsList());
			break;
		case DEV_OVER_PROD:
			_diffBuffer.add("Mode is : DEVELOPMENT OVER PRODUCTION");
			createDiffBuffer(_fDev.getContent().AsList(), _fProd.getContent().AsList());
			break;
			default:
				break;
		}
		return this;
	}

	public String outputDiffToString() {
		String eol = System.getProperty("line.separator");
		StringBuilder sb =  new StringBuilder();
		for (String s : _diffBuffer){
			sb.append(s).append(eol);
		}
		_diffBuffer.clear();
		return sb.toString();
	}

}
