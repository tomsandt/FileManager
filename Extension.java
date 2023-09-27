import java.io.File;

public class Extension {
	
	public static String getExtension(File file) {
		
		int index = file.getName().lastIndexOf(".");
		if(index > 0) {
			String extension = file.getName().substring(index + 1);
			
			return extension;
				
		}else {
			return "Ordner haben keine Erweiterungen";
		}
		
	}

}
