package base;

import asbtractions.ResultOutput;
import config.Config;

public class PrintToDisplay implements ResultOutput{

	private StringBuilder _dataSB = null;
	
	public PrintToDisplay(String data){
		setData(new StringBuilder(data));
	}
	
	public PrintToDisplay(StringBuilder data){
		setData(data);
	}

	public PrintToDisplay setData(String data){
		_dataSB = new StringBuilder(data);
		return this;
	}
	public PrintToDisplay setData(StringBuilder dataSB){
		_dataSB = dataSB;
		return this;
	}
	
	public PrintToDisplay append(String data){
		_dataSB.append(data).append(Config.EOL);
		return this;
	}
	
	public PrintToDisplay clearData(){
		_dataSB.setLength(0);
		return this;
	}
	@Override
	public PrintToDisplay execute() {
		System.out.println(_dataSB.toString());
		return this;
	}

}
