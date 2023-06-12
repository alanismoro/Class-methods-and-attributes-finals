package find_error;

public class Test {

	public static void main(String[] args) {
		MessageError err = new MessageError ();
		System.out.println(err.getMessageError(err.OUTERR));
		System.out.println(err.getMessageError(err.DISKERR));

	}

}
