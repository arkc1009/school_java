import java.util.Scanner;

public class Change {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("10진수 -> 2진수 : 숫자1 입력");
        System.out.println("2진수 -> 10진수 : 숫자2 입력");
        System.out.println("\n메뉴선택 : ");
        int select = sc.nextInt();

        switch (select) {
            case 1:
                System.out.println("2진수로 표현할 10진수 입력 : ");
                int inputDecimal = sc.nextInt();
                System.out.println("\n변환 결과 : " + DecimalToBinary.DToB(inputDecimal));
                break;
            case 2:
                System.out.println("10진수로 표현할 2진수 입력 : ");
                String inputBinary = sc.next();
                System.out.println("\n변환결과 : " + BinaryToDecimal.BToD(inputBinary));
                break;
        }

    }
}
