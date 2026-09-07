import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String S = sc.next();
        String[] strArr = S.split(":");

        int h = Integer.parseInt(strArr[0]);
        int m = Integer.parseInt(strArr[1]);

        h += 1;


        System.out.printf("%d:%d", h, m);
    }
}