package ch.axa.ita.rs.lamdas;

public class Application {
    public Application() {
        new CapsLocker("src/ch/axa/ita/rs/lamdas/wiesel.txt");
        new TextCounter("src/ch/axa/ita/rs/lamdas/wiesel.txt", "ie");
    }

    public static void main(String[] args) {
        new Application();
    }
}
