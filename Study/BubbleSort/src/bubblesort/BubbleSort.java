
package bubblesort;

public class BubbleSort {

    
    public static void bubbleSort(int[] arr){
        
        boolean swapped = true;
        int j=0;
        int temp;
        while(swapped){
            swapped = false;
            j++;
            for(int i=0; i< arr.length-j; i++){
                if(arr[i] > arr[i+1]){
                    temp = arr[i];
                    arr[i] = arr[i+1];
                    arr[i+1] = temp;
                    swapped = true;
                    print(arr);
                }
            }
        }
        
    }
    
    public static void print(int[] arr){
        for(int i=0; i<arr.length; i++)
            System.out.print(arr[i]+" ");
        System.out.println();
    }
    public static void main(String[] args) {
        int[] item = {9, 4,6,1,0,7,3,8,5,2};
        
        for(int i=0; i< item.length; i++)
            System.out.print(item[i]+" ");
        System.out.println();
        
        bubbleSort(item);
        System.out.println();
        for(int i=0; i< item.length; i++)
            System.out.print(item[i]+" ");
        System.out.println();
    }
    
}
