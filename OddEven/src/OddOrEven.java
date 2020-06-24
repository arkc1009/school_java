import java.util.Scanner;

public class OddOrEven {
    static Scanner scan = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("입력한 숫자가 홀수인지 짝수인지 판별합니다.");
        System.out.println("몇 개의 숫자를 입력하시나요? : ");

        int numbers=scan.nextInt();
        judgeNum(numbers);

    }

    private static void judgeNum(int numbers) {
        for(int i=1; i<=numbers; i++) {
            System.out.println(i + "번째 수를 입력하세요 : ");
            int input = scan.nextInt();
            if(input%2==0)
                System.out.println(i + "번째 수 " + input + "은 짝수입니다.");
            else
                System.out.println(i + "번째 수 " + input + "은 홀수입니다.");

        }
    }
}
