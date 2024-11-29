import java.io.File;

public class Type {

	public static String checkType(File file) {
		return file.isDirectory() ? "Ordner" : "Datei";
	}

}
