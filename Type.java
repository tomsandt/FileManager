import java.io.File;

public class Type {
	
	public static String checkType(File file) {
		
		if(file.isDirectory() == true) {
			
			return "Ordner";
			
		}else {
			return "Datei";	
		}	
	}

}
