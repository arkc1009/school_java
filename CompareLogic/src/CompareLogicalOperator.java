import java.util.Scanner;

public class CompareLogicalOperator {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        boolean compareAB;

        System.out.println("첫 번째 값을 입력 : ");
        int a = sc.nextInt();
        System.out.println("두 번째 값을 입력 : ");
        int b = sc.nextInt();

        compareAB = a > b;
        System.out.println("a > b" + "\t" + compareAB);
        compareAB = a < b;
        System.out.println("a < b" + "\t" + compareAB);
        compareAB = a == b;
        System.out.println("a == b" + "\t" + compareAB);
        compareAB = a != b;
        System.out.println("a != b" + "\t" + compareAB);

        compareAB = (a > b || b++ > 0);
        System.out.println("a > b || b++ > 0" + "\t" + compareAB);
        System.out.println("a : " + a + "\tb : " + b + "\n");

        compareAB = (a > b && b++ > 0);
        System.out.println("a > b && b++ > 0" + "\t" + compareAB);
        System.out.println("a : " + a + "\tb : " + b + "\n");

    }
}
