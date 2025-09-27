
public class LargestElement {

    public static void main(String []args){

        int [] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 199, 20};
        
        if (arr.length < 2) {
            System.out.println("Index: "+0+" Value: "+arr[0]); 
            return;
        }

        int max = arr[0];
        int maxIndex = 0;

        for(int i = 1; i < arr.length; i++){
            if (arr[i] > max){
                max = arr[i];
                maxIndex = i;
            }
        }
        System.out.println("Index: "+maxIndex+" Value: "+max);
    }
}
