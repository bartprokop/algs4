package fundamentals.chapter11;

public class Exercise2 {

    public static void main(String... args) {
        println((1 + 2.236) / 2);
        println(1 + 2 + 3 + 4.0);
        println(4.1 >= 4);
        println(1 + 2 + "3");
    }

    private static void println(Object o) {
        System.out.println(o.getClass() + " : " + o);
    }
}
