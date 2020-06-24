/*
  2진수의 가장 끝자리 가중치는 (string의 길이-1)
  ex) 4자리 2진수의 최대 가중치는 (string의 길이)4-1 = 3
  2의 3승
 */

public class BinaryToDecimal {

    public static int BToD(String input) {
        int column=0;
        int output=0;
        int binary=2;
        int i=input.length()-1;
        while (column < input.length()) {
            int digitNum = Integer.parseInt(input.substring(column++, column));
            System.out.println(digitNum*(int)Math.pow(binary, i));
            output+=(digitNum*(int)Math.pow(binary, i--));
        }
        return output;
    }
}
