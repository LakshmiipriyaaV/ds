package ds;

public class Binary2 {

	public static void main(String[] args) {
		String [] arr= {"aa","as","sd","fe"};  
        String key = "df";
        int h=arr.length-1,l=0;
        int m=(l+h)/2;
        while (l <= h) {
            if (arr[m] ==key) {
            
            	System.out.println(key + " is  present in index" +m);
                break;
            } else if(key.compareTo(arr[m])>0) {
                l= m + 1;
            }
            else {
            	h=m-1;
            }
            m = (l +h) / 2;
        }
        if (l > h) {
            System.out.println(key + " is not present in the list.\n");
        }
    }

 

	}


