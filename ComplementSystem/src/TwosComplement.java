public class TwosComplement {
    public static int[] getTwos(int[] arr) {
        int len = arr.length;
        int[] twosComplement = new int[len];
        int carry=1;

        int[] onesComplement=OnesComplement.getOnes(arr);

        for(int i=len-1; i>=0; i--) {
            twosComplement[i]=onesComplement[i] + carry;
            twosComplement[i]%=2;
            carry*=onesComplement[i];
        }

        return twosComplement;
    }
}
