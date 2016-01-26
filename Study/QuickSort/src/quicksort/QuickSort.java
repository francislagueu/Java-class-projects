
package quicksort;


public class QuickSort {

    public static int partition(int[] arr, int left, int right){
        int i =left, j=right;
        int temp;
        int pivot = arr[(left+right)/2];
        while(i<=j){
            while(arr[i]<pivot)
                i++;
            while(arr[j]>pivot)
                j--;
            if(i<=j){
                temp =arr[i];
                arr[i]=arr[j];
                arr[j] = temp;
                i++;
                j--;
            }
        }
        return i;
    }
    
    public static void quickSort(int[] arr, int left, int right){
        int n = partition(arr, left,right);
        print(arr);
        if(left<n-1)
            quickSort(arr, left, n-1);
        if(n<right)
            quickSort(arr, n, right);
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
        
        quickSort(item,0,9);
        System.out.println();
        for(int i=0; i< item.length; i++)
            System.out.print(item[i]+" ");
        System.out.println();
    }
    
}
