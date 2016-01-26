
package selectionsort;


public class SelectionSort {

    public static void selectionSort(int[] arr){
        int i, j, minIndex, temp;
        for(i=0; i<arr.length-1; i++){
            minIndex = i;
            for(j=i+1; j< arr.length; j++)
                if(arr[j] < arr[minIndex])
                    minIndex = j;
            if(minIndex!=i){
                temp = arr[i];
                arr[i] = arr[minIndex];
                arr[minIndex]= temp;
            }
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
        
        selectionSort(item);
        System.out.println();
        for(int i=0; i< item.length; i++)
            System.out.print(item[i]+" ");
        System.out.println();
    }
    
}
