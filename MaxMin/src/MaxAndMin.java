import java.util.Scanner;

public class MaxAndMin {
    static int max = -2147483648;
    static int min = 2147483647;
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("입력하는 숫자들의 최대값과 최소값을 판별합니다.");
        System.out.println("입력할 숫자는 몇개인가요? : ");
        int userInput = sc.nextInt();

        judgeNum(userInput);

    }

    private static void judgeNum(int userInput) { //주석은 제가 해보고 싶었던 방법입니당.
        //int mmax = -2147483648;
        //int mmin = 2147483647;
        for(int i=1; i<=userInput; i++) {
            System.out.println(i + "번째 수를 입력하세요 : ");
            int input = sc.nextInt();
           // mmax = Integer.max(mmax, input);
           // mmin = Integer.min(mmin, input);
            if(input > max) max=input;
            if(input < min) min=input;
        }
        System.out.println("최대값은 " + max + " 최솟값은 " + min + "입니다.");
        //System.out.println("최대값은 " + mmax + " 최솟값은 " + mmin + "입니다.");
    }
}
