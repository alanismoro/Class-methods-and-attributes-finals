package find_error;

public final class MessageError {
	// Attributes
	final int OUTERR;
	final int INERR;
	final int DISKERR;
	final int INDEXERR;
	
	public MessageError() {
		this.OUTERR = 0;
		this.INERR = 1;
		this.DISKERR = 2;
		this.INDEXERR = 3;
	}
	
	String msgs[] = {
		"Output Error",
		"Input Error",
		"Disk Full",
		"Index Out-Of-Bounds"
	};
	
	//Returns the error message
	public final String getMessageError (int i) {
		if(i >=0 & i < msgs.length)
			return msgs[i];
		else 
			return "Invalid Error Code";
	}
}
