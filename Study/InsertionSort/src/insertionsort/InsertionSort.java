
package insertionsort;


public class InsertionSort {

    public static void insertionSort(int[] arr){
        int i, j, newValue;
        for(i=1; i< arr.length; i++){
            newValue = arr[i];
            j=i;
            while(j>0&&arr[j-1]>newValue){
                arr[j]=arr[j-1];
                j--;
            }
            arr[j] = newValue;
            print(arr);
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
        
        insertionSort(item);
        System.out.println();
        for(int i=0; i< item.length; i++)
            System.out.print(item[i]+" ");
        System.out.println();
    }
    
}
