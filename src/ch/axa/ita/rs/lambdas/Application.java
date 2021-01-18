package ch.axa.ita.rs.lambdas;

public class Application {
    public Application() {
        new CapsLocker("src/ch/axa/ita/rs/lambdas/wiesel.txt");
        new TextCounter("src/ch/axa/ita/rs/lambdas/wiesel.txt", "Das");
        new TextEraser("src/ch/axa/ita/rs/lambdas/wiesel.txt", "ie");
    }

    public static void main(String[] args) {
        new Application();
    }
}
