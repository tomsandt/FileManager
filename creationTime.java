import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.BasicFileAttributes;
import java.nio.file.attribute.FileTime;

public class creationTime {
	
	public static FileTime getCreationTime(File file) throws IOException {
		
		Path path = Paths.get(file.getPath());
		
		BasicFileAttributes attributes = Files.readAttributes(path, BasicFileAttributes.class);
		
		return attributes.creationTime();
		
	}


}
