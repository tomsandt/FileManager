import java.io.File;
import java.io.IOException;
import java.nio.file.attribute.FileTime;
import java.text.SimpleDateFormat;

public class DirReader {
	
	String type;
	String fpath;
	String filename;
	String filenamewithoutextension;
	String extension;
	FileTime fileTime;
	String modDate;
	long creationDate;
	long size;

	
	public DirReader(String type, String path, String filename, String filenamewithoutextension, String extension, FileTime fileTime, String modDate, long size) {
		
		this.type = type;
		this.fpath = path;
		this.filename = filename;
		this.filenamewithoutextension = filenamewithoutextension;
		this.extension = extension;
		this.fileTime = fileTime;
		this.modDate = modDate;
		this.size = size;
		
	}
	
	public static void FileRead() throws IOException {
		
		File folder = new File("");
		File file[] = folder.listFiles();
		
		for(int i=0; i!=file.length; i++) {
			
			SimpleDateFormat simpleDateFormat = new SimpleDateFormat("MM/dd/yyyy HH:mm:ss");
			
			
			DirReader dirReader = new DirReader(Type.checkType(file[i]), file[i].getPath(), file[i].getName(), file[i].getName().replaceAll("\\.\\w+", ""), Extension.getExtension(file[i]),creationTime.getCreationTime(file[i]), simpleDateFormat.format(file[i].lastModified()), file[i].length());
				
			
			System.out.println("----------------------------------------------------------------------------");
			System.out.println("Dateityp: " + dirReader.getType());
			System.out.println("Dateipfad: " + dirReader.getfPath());
			System.out.println("Dateiname: " + dirReader.getFilename());
			System.out.println("Dateiname ohne Erweiterung: " + dirReader.getFilenamewithoutextension());
			System.out.println("Dateierweiterung: " + dirReader.getExtension());
			System.out.println("Erstellungsdatum: " + dirReader.getFileTime());
			System.out.println("Letztes Bearbeitungsdatum: " + dirReader.getModDate());
			System.out.println("Dateigröße: " + dirReader.getSize());
			System.out.println("----------------------------------------------------------------------------");
			System.out.println("");
			
		}
		
	}

	public FileTime getFileTime() {
		return fileTime;
	}

	public void setFileTime(FileTime fileTime) {
		this.fileTime = fileTime;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getfPath() {
		return fpath;
	}

	public void setfPath(String path) {
		this.fpath = path;
	}

	public String getFilename() {
		return filename;
	}

	public void setFilename(String filename) {
		this.filename = filename;
	}

	public String getFilenamewithoutextension() {
		return filenamewithoutextension;
	}

	public void setFilenamewithoutextension(String filenamewithoutextension) {
		this.filenamewithoutextension = filenamewithoutextension;
	}

	public String getExtension() {
		return extension;
	}

	public void setExtension(String extension) {
		this.extension = extension;
	}

	public String getModDate() {
		return modDate;
	}

	public void setModDate(String modDate) {
		this.modDate = modDate;
	}

	public long getCreationDate() {
		return creationDate;
	}

	public void setCreationDate(long creationDate) {
		this.creationDate = creationDate;
	}

	public double getSize() {
		return size;
	}

	public void setSize(long size) {
		this.size = size;
	}

}
