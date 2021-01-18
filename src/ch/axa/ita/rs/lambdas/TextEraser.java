package ch.axa.ita.rs.lambdas;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class TextEraser {
    public TextEraser(String file, String query) {
        super();
        System.out.println("TextEraser");

        try {
            Stream<String> lines = Files.lines(Paths.get(file));
            lines.forEach((line) -> System.out.println(line.replace(query, "")));
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println();
    }
}
