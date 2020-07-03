import java.util.Random;
import java.util.Scanner;

public class UpDownGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tc=10;
        int ansNum = (int)(Math.random()*100)+1;
        int userNum;
        boolean clear = false;

        System.out.println(ansNum);

        notice();

        while(tc-->0) {
            System.out.println("남은 기회는 " + (tc+1) + "번 입니다.");
            System.out.print("답을 입력해주세요 : ");
            userNum = sc.nextInt();

            if(userNum==ansNum) {
                clear=true;
                break;
            }
            if(tc!=0) System.out.println((userNum>ansNum) ? "==Down!==" : "==Up!==");
        }

        ending(clear);

    }

    public static void notice() {
        System.out.println("UP/DOWN 게임입니다.\n 1~100의 숫자가 랜덤으로 정답으로 할당됩니다.");
        System.out.println("총 10번의 기회를 가집니다.");
    }

    public static void ending(boolean clearSW) {
        System.out.println();
        if(clearSW) {
            System.out.println("정답을 맞추셨습니다! \n\n게임이 종료됩니다.");
        }
        else {
            System.out.println("실패! 기회를 모두 소진하셨습니다.\n\n게임이 종료됩니다.");
        }
    }
}
