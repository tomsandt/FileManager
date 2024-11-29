import java.io.File;

public class Extension {

	public static String getExtension(File file) {

		int index = file.getName().lastIndexOf(".");

		// variables only make sense when the value they store is called at least twice
		if(index > 0) return file.getName().substring(index + 1);
		return "Ordner";

	}

}
