import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String S = sc.next();
        String[] strArr=S.split("-");
        String temp;
        temp = strArr[1];
        strArr[1]=strArr[2];
        strArr[2]=temp;

        System.out.printf("%s-%s-%s", strArr[0], strArr[1], strArr[2]);
    }
}