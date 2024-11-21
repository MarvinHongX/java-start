package method;

public class Method2 {
    public static void main(String[] args) {
        printHeader();
        System.out.println("running...");
        printFooter();
    }
    public static void printHeader() {
        System.out.println("Start Program");
        return;
    }
    public static void printFooter() {
        System.out.println("End Program");
    }
}
