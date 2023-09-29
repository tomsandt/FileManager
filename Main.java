
public class Main {

    // an exception has to be handled, i.e. it doesn't make sense to throw an exception in the main function
    // see https://rollbar.com/guides/java/how-to-throw-exceptions-in-java/
	public static void main(String[] args) {

		DirReader.FileRead(args[0]);

	}

}
