package ch.axa.ita.rs.lambdas;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.time.LocalDate;

public class SearchPersons {
    public SearchPersons(String file, String query) {
        super();

        System.out.println("SearchPersons");
        int currentYear = LocalDate.now().getYear();

        try {
            Files
                    .lines(Paths.get(file))
                    .filter((line) -> line.contains(query + ";"))
                    .forEach((line) -> {
                        String[] data = line.split(";");
                        System.out.println(data[1] + " " + data[0] + ", " + (currentYear - Integer.parseInt(data[2])));
                    });
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println();
    }
}
