public class Main {
    public static void main(String[] args) {
        int a = 5, b = 6, c = 7;
        int temp;

        temp = c;
        c = b;
        b = a;
        a = temp;

        System.out.printf("%d\n", a);
        System.out.printf("%d\n", b);
        System.out.printf("%d\n", c);
    }
}