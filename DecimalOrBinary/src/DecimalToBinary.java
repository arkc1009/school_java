public class DecimalToBinary {
    /*

    String의 성질을 이용해서 출력.
    정수인 마지막 몫까지 String화

     */
    public static String DToB(int decimal) {
        int binary = 2;
        String output = "";
        while(((float)decimal / (float)binary) >= 0.5) {
            output = decimal % binary + output;
            System.out.println(output);
            decimal/=binary;
        }
        return output;
    }
}
