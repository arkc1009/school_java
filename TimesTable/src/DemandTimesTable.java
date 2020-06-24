import java.util.Scanner;

public class DemandTimesTable {
    public static void main(String[] args) {
        ParameterTimesTable pt = new ParameterTimesTable();

        String input;
        Scanner scan = new Scanner(System.in);
        System.out.println("구구단 몇 단을 출력할까요?");
        input=scan.next();
        scan.close();

        int key=Integer.parseInt(input);
        // pt.timesTable(key); 해보고 싶었던 방법! ParameterTimesTable에서 가져옴.
        timesTable(key);

    }

    public static void timesTable(int step) {
        System.out.println("\n" + step + "단");
        for(int i=1; i<10; i++) {
            System.out.println(step + " * " + i + " = " + step*i);
        }
    }

}
