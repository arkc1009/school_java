public class ParameterTimesTable {
    public static void main(String[] args) {

        timesTable(3);
        timesTable(8);

    }

    public static void timesTable(int step) {
        System.out.println("\n" + step + "단");
        for(int i=1; i<=9; i++) {
            System.out.println(step + " * " + i + " = " + step * i);
        }
    }
}
