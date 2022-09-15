package ds;

public class Linear1 {
  
    public static void main(String args[]){    
        int[] arr= {10,20,30,50,70,90};    
        int key = 50;
        int temp=0;
        for(int i=0;i<arr.length;i++){    
            if(arr[i] == key){
        System.out.println(key+" is found at index: "+ i); 
        temp=temp+1;
    }    
}    
    if(temp==0) {
	System.out.println(key+" is  not found at  any index");
}
}
}