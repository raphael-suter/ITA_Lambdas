package ch.axa.ita.rs.lamdas;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class TextCounter {
    public TextCounter(String file, String query) {
        super();

        try {
            String content = new String(Files.readAllBytes(Paths.get(file)));
            System.out.println(content.split(query).length - 1);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
