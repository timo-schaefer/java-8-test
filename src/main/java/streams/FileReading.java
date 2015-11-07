package streams;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.logging.Level;
import java.util.logging.Logger;

public class FileReading {

	public static void main(String[] args) {

		Path path = Paths.get("tmp.txt");
		try {
			Files.lines(path).distinct()
				.forEach(s->System.out.println(s));
		} catch (IOException e) {
			Logger.getLogger(FileReading.class.getName())
				.log(Level.SEVERE, "IO Error", e);
		}
	}

}
