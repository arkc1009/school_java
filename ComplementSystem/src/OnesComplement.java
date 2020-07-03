public class OnesComplement {

    public static int[] getOnes(int[] arr) {
        int len = arr.length;
        int[] onesComplement;
        onesComplement = new int[len];

        for(int i=0; i<len; i++) {
            onesComplement[i]=(1-arr[i]);
        }

        return onesComplement;
    }

}
