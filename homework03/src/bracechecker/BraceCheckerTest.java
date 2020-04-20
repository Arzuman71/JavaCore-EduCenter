package bracechecker;

public class BraceCheckerTest {
    public static void main(String[] args) {
        String text = "({java {java]";
        BraceChecker braceChecker = new BraceChecker(text);
        braceChecker.check();
    }
}
