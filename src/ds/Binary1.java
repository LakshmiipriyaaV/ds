package ds;

public class Binary1 {

	public static void main(String[] args) {
		int[] arr= {10,20,30,50,70,90};    
        int key = 50;
        int h=arr.length-1;
        int l=0;
        int m=(l+h)/2;
        while (l <= h) {
            if (arr[m] < key) {
                l = m + 1;
            } else if (arr[m] == key) {
            	System.out.println(key + " is  present in index" +m);
                break;
            } else {
                h = m - 1;
            }
            m = (l +h) / 2;
        }
        if (l > h) {
            System.out.println(key + " is not present in the list.\n");
        }
    }
}
 
