import java.util.Scanner;

public class Complement {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("2진수를 입력하시면 보수로 바꿔줍니다.");
        String input=sc.nextLine();
        int len = input.length();
        int[] binary = new int[len];
        int[] print_arr;

        for(int i=0; i<len; i++) {
            binary[i] = Integer.parseInt(input.substring(i, i+1));
        }

        System.out.println("\n입력값");

        for(int i=0; i<binary.length; i++) {
            System.out.print(binary[i] + " ");
        }

        System.out.println("\n1의보수");

        print_arr=OnesComplement.getOnes(binary);
        for(int i=0; i<print_arr.length; i++) {
            System.out.print(print_arr[i] + " ");
        }

        System.out.println("\n2의보수");

        print_arr=TwosComplement.getTwos(binary);
        for(int i=0; i<print_arr.length; i++) {
            System.out.print(print_arr[i] + " ");
        }
    }
}
