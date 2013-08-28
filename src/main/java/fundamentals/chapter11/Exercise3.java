package fundamentals.chapter11;

public class Exercise3 {

    public static void main(String... args) {
        int i1 = Integer.parseInt(args[0]);
        int i2 = Integer.parseInt(args[1]);
        int i3 = Integer.parseInt(args[2]);

        System.out.println(((i1 == i2) && (i2 == i3)) ? "equal" : "not equal");
    }
}
