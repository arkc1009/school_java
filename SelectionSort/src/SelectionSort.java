public class SelectionSort {
    static void selection(char[] element) {
        int numbers = SelectionSortMain.numbers;
        for(int i=0; i<numbers-1; i++) {
            int selIdx = i;
            for(int j=i+1; j<numbers; j++) {
                if(element[selIdx] > element[j]) {
                    selIdx = j;
                }
            }
            SelectionSortSwap.swap(element, i, selIdx);
        }
    }
}
