import java.util.Scanner;

public class Union {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); //꼭 static 전역변수로 빼지 않아도 된다고 생각. 메인 메소드 외에 메인클래스에서 scan을 사용하려면 static으로 선언해야함.

        System.out.println("십의 자리와 일의 자리를 조합합니다.");
        System.out.println("\n 십의 자리 숫자를 입력해주세요.");
        int t = TenthDigit.key(sc.nextInt());

        System.out.println("\n 일의 자리 숫자를 입력해주세요.");
        int u = UnitDigit.key(sc.nextInt());

        System.out.println("입력하신 숫자는 " + (t+u) + "입니다.");
    }

}
