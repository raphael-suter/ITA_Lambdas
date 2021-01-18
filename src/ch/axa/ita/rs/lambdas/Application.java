package ch.axa.ita.rs.lambdas;

public class Application {
    public Application() {
        new CapsLocker("src/ch/axa/ita/rs/lambdas/wiesel.txt");
        new TextCounter("src/ch/axa/ita/rs/lambdas/wiesel.txt", "Das");
        new TextEraser("src/ch/axa/ita/rs/lambdas/wiesel.txt", "e");
        new ReadPersons("src/ch/axa/ita/rs/lambdas/personen.txt");
        new SearchPersons("src/ch/axa/ita/rs/lambdas/personen.txt", "Hanspeter");
    }

    public static void main(String[] args) {
        new Application();
    }
}
