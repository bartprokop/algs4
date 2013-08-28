package fundamentals.chapter11;

public class Exercise5 {

    public static void main(String... args) {
        System.out.println(isBeetween0And1(-0.5));
        System.out.println(isBeetween0And1(-0.0));
        System.out.println(isBeetween0And1(0.0));
        System.out.println(isBeetween0And1(0.5));
        System.out.println(isBeetween0And1(1.0));
        System.out.println(isBeetween0And1(1.5));
    }

    private static boolean isBeetween0And1(double d) {
        return (d >= 0.0 && d <= 1.0);
    }
}
