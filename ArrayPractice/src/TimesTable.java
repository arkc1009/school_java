import java.util.Scanner;

public class TimesTable {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] row = new int[1];
        int[] column = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9};

        System.out.println("원하시는 곰셈표(구구단)를 입력해주세요. \n");
        System.out.print("숫자 입력 : ");
        row[0] = sc.nextInt();

        for(int i=0; i<9; i++) {
            System.out.println(row[0] + " * " + column[i] + " = " + row[0]*column[i]);
        }
    }
}
