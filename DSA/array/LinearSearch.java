
public class LinearSearch {
    
    
    public static void main(String []args){
        
        int[] num = {2, 4, 5,7,8,9,0};
        int key = 9;
        
        for(int i = 0; i < num.length; i++){
            if(num[i]==key){
                System.out.println("Index: "+i);
                return;
            }
        }

        System.out.println("Index: "+-1);
    }
}
