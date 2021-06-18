package in.con.redhat;

public class CustomException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 7651393722265921234L;
	
	public CustomException(String errorMessage) {
		super(errorMessage);
	}
	
	public CustomException(String errorMessage, Throwable error) {
		super(errorMessage, error);
	}

}
