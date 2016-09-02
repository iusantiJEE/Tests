package config;

public class Messages {
	private static final String TOKEN_TEMPLATE = "[ %TOKEN% ]: ";
	private static final String TOKEN_WARN	=	TOKEN_TEMPLATE.replace("%TOKEN%", "WARN");
	@SuppressWarnings("unused")
	private static final String TOKEN_INFO	=	TOKEN_TEMPLATE.replace("%TOKEN%", "INFO");
	@SuppressWarnings("unused")
	private static final String TOKEN_ERROR	=	TOKEN_TEMPLATE.replace("%TOKEN%", "ERROR!");
	
	public static final String WARN_OUTPUT_EMPTY = TOKEN_WARN +  "the diff buffer is empty!";
	public static final String WARN_OUTPUT_NULL  =  TOKEN_WARN  + "the diff buffer has not been initialised.Null detected!";
}
