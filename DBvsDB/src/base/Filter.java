package base;

import java.util.ArrayList;
import java.util.List;

import config.Config;
import config.Messages;

public class Filter {
	public static enum FilterType {
		NO_FILTER(""), 
		DDL_FILTER_TABLES("CREATE TABLE"),
		DDL_FILTER_SCHEMAS("CREATE SCHEMA"), 
		DDL_FILTER_TRIGGERS("TRIGGER"),
		DDL_FILTER_PROCEDURES("PROCEDURE");

		private String _filterValue = null;

		FilterType(String filterValue) {
			_filterValue = filterValue;
		}

		public String getValue() {
			return _filterValue;
		}
	}

	private FilterType _filterType = null;
	private List<String> _source = null;
	private StringBuilder _output = null;

	public Filter() {
		this(Filter.FilterType.NO_FILTER, new ArrayList<String>());
	}

	public Filter(FilterType filterType, List<String> source) {
		_filterType = filterType;
		_source = source;
		_output =  new StringBuilder();
	}

	public void setFilterType(FilterType filterType) {
		_filterType = filterType;
	}

	public void setSource(List<String> source) {
		_source = source;
	}

	public Filter execute() {
		_output.setLength(0);
		
		if (_source != null) {
			for (String s : _source) {
				if (s.startsWith(_filterType.getValue())) {
					_output.append(s).append(Config.EOL);
				}
			} 
		}
		return this;
	}

	public String getFilteredText() {
		if ( _output != null ){
			return _output.length() != 0 ? _output.toString() : Messages.WARN_OUTPUT_EMPTY;
		}
		else{
			return Messages.WARN_OUTPUT_NULL;
		}
	}
}
