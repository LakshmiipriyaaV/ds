package ds;

public class Linear2 {

	public static void main(String[] args) {
		String [] arr= {"aa","as","sd","fe"};    
        String  key = "dd";
        String temp=null;
        for(int i=0;i<arr.length;i++){    
            if(arr[i] == key){
        System.out.println(key+" is found at index: "+ i); 
        temp=temp+1;
    }    
}    
    if(temp==null) {
	System.out.println(key+" is  not found at  any index");

	}

}
}
