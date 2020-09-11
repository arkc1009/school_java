import java.util.Scanner;

public class SelectionSortMain {
    static int numbers;
    public static void main(String[] args) {
        System.out.print("몇개의 랜덤 문자를 가지고 선택정렬을 시작할까요? : ");
        Scanner sc = new Scanner(System.in);
        numbers = sc.nextInt();

        char[] element = new char[numbers];
        for(int i=0; i<numbers; i++) {
            element[i] = (char)((int)(Math.random()*26) + 97);
        }
        System.out.println("\n생성된 " + numbers + "개의 요소는 다음과 같습니다.\n");
        for(int i=0; i<numbers; i++) System.out.printf("%c " , element[i]);

        SelectionSort.selection(element);
        System.out.println("\n\n * 오름차순 정렬 : 기본값\n * 내림차순 정렬 : 2");
        int selOrder = sc.nextInt();
        if(selOrder == 2) {
            System.out.println("\n내림차순으로 정렬합니다.");
            for (int i=numbers-1; i>=0; i--) System.out.printf("%c ", element[i]);
        }
        else {
            System.out.println("\n오름차순으로 정렬합니다.");
            for (int i=0; i<numbers; i++) System.out.printf("%c ", element[i]);
        }
        return;
    }
}
