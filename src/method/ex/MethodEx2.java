package method.ex;

public class MethodEx2 {
    public static void main(String[] args) {
        say("Hello, world!", 3);
        say("Hello, java!", 5);
        say("Linux", 7);
    }
    public static void say(String message, int times) {
        for (int i = 0; i < times; i++) {
            System.out.println(message);
        }
    }
}
