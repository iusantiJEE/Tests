package base;

import asbtractions.ResultOutput;
import tools.WriteFile;

public class PrintToFile implements ResultOutput {

	private WriteFile _wf =  null;
	public PrintToFile(WriteFile wf){
		_wf = wf;
	}
	
	@Override
	public PrintToFile execute() {
		_wf.write().close();
		return this;
	}

}
