package ch.axa.ita.rs.lambdas;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.time.LocalDate;
import java.util.stream.Stream;

public class ReadPersons {
    public ReadPersons(String file) {
        super();

        System.out.println("ReadPersons");
        int currentYear = LocalDate.now().getYear();

        try {
            Stream<String> lines = Files.lines(Paths.get(file));

            lines.forEach((line) -> {
                String[] data = line.split(";");
                System.out.println(data[1] + " " + data[0] + ", " + (currentYear - Integer.parseInt(data[2])));
            });
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println();
    }
}
