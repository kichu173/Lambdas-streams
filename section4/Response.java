package lambdas_streams_ajayIyengar.section4;

public class Response {

	private String message;

	private int code;

	public Response(int code, String message) {
		this.code = code;
		this.message = message;

	}

	public String getMessage() {
		return message;
	}

	public int getCode() {
		return code;
	}

}
