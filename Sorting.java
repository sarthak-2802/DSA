// import java.util.*;
import java.util.Arrays;
// import java.util.Collections;

public class Sorting{ 
    //Arrange in a order is called sorting   eg. increasing ,decreasing 

    public static void BubbleSorting(int arr[]){  //push big element at back 
        for(int turn=0;turn<arr.length-1;turn++){
            for(int j=0;j<=arr.length-2;j++){
                if(arr[j]>arr[j+1]){
                    //Swap 
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }  
            }
        }
    }

    public static void SelectionSorting(int arr[]){   //push samllest element at first 
        for(int i=0;i<arr.length-1;i++){
            int minPos= i;
            for(int j=i+1;j<arr.length-1;j++){
                if(arr[minPos]<arr[i]){
                    minPos=j;
                }
            }
            // Swap
            int temp=arr[minPos];
            arr[minPos]=arr[i];
            arr[i]=temp;
        }
    }


    public static void insertionSort(int arr[]){  // pick an elemnt from unsorted part and put it at the right place in sorted array
        for(int i=1;i<arr.length;i++){
            int curr=i;
            int prev=i-1;
            //finding the coorect position to insert 
            while(prev>0 && arr[curr]<arr[prev]){
                arr[prev+1]=arr[prev];
            }
            // Insertion
            arr[prev+1]=curr;
        }

    }



    public static void printarray(int arr[]){
        for (int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }

    public static void main(String[] args){
        int  arr[]={5,4,1,3,2};

        BubbleSorting(arr);
        printarray(arr);
        SelectionSorting(arr);
        printarray(arr);
        insertionSort(arr);
        printarray(arr);
        Arrays.sort(arr);  // In built function for sorting 
        // Arrays.sort(arr,0,2,Collections.reverseOrder()); // for decending order  
    }
    
} 