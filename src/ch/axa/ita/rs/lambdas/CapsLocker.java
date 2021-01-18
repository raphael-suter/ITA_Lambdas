package ch.axa.ita.rs.lambdas;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class CapsLocker {
    public CapsLocker(String file) {
        super();
        System.out.println("CapsLocker");

        try {
            Stream<String> lines = Files.lines(Paths.get(file));
            lines.forEach((line) -> System.out.println(line.toUpperCase()));
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println();
    }
}
