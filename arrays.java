// import java.util.*;
import java.util.Scanner;

public class arrays {
    // Method to print all pairs of elements in the array
    public static void pairs_array(int numbers[]) {
        System.out.println("Pairs in the array:");
        for (int i = 0; i < numbers.length; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                System.out.println("(" + numbers[i] + ", " + numbers[j] + ")");
            }
        }
    }


    public static void printsubarrays(int numbers[]){
        for(int i=0;i<numbers.length;i++){    // to find the start 
            int start=i;
            for(int j=i;j<numbers.length;j++){// to find the end of subarray    
                int end=j;
                for(int k=start;k<end;k++){ //loop to print subarray
                    System.out.print(numbers[k]+ " ");
                }
                System.out.println();
            }
            System.out.println();
        }
    }

    public static void Maxsubarray(int numbers[]){ //compare maxsum with currsum
        int currSum=0;
        int maxSum=Integer.MIN_VALUE;

        for(int i=0;i<numbers.length;i++){    // to find the start 
            int start=i;
            for(int j=i;j<numbers.length;j++){// to find the end of subarray    
                int end=j;
                currSum=0;
                for(int k=start;k<end;k++){
                    currSum+= numbers[k];  
                }
                System.out.print(currSum);
                System.out.println();
                System.out.println();
                if(currSum>maxSum){
                    maxSum=currSum;
                }
            }
            
        }
        System.out.println("Max sum is: "+ maxSum);
    }

    public static void kadanes(int numbers[]){  //simple way to calculate maxsum of subarrays
        int ms=Integer.MIN_VALUE;  //maxsum
        int cs=0;                  //current sum

        for(int i=0;i<numbers.length;i++){
            cs+=numbers[i];
            if(cs<0){
                cs=0;
            }
            if(cs>ms){
                ms=cs;
            }
            ms=Math.max(cs,ms);

        }
        System.out.println("Max sum is: "+ ms);
    }





    


    // TRAPPED RAINWATER QUESTION

    public static int trappedRainwater(int height[]){
        int n=height.length;                 //n>2 
        Scanner sc= new Scanner(System.in);
        int width =sc.nextInt();
        sc.close();
        // calculate left max boundary
        int[] left_max= new int [n];
        left_max[0]=height[0];
        for(int i=1; i<n; i++){
            left_max[i]=Math.max(height[i],left_max[i-1]);
        }
        // calculate right max boundary 
        int[] right_max= new int[n];
        right_max[n-1]=height[n-1];
        for(int i= n-2;i>=0;i--){
            right_max[i]=Math.max(height[i],right_max[i+1]);
        }
        // loop 
        int trappedwater=0;
        for (int i=0;i<n;i++){
            int water_level=Math.min(left_max[i],right_max[i]);
            trappedwater+=(water_level-height[i])*width;
        }
        return trappedwater;
        // water level = min(right max, left max )
        // trapped water = water level - height *width 
    }








    // Best time to buy and sell stock
    public static int buyAndSellStock(int prices[]){
         int buyprice=Integer.MIN_VALUE;
         int maxprofit=0;

         for(int i=0;i<prices.length;i++){
            if(buyprice<maxprofit){
                int profit = prices[i]-buyprice; //todays profit 
                maxprofit=Math.max(maxprofit,profit);
            } else{
                buyprice=prices[i];
            }
         }
         return maxprofit;
    }
    public static void main(String args[]) {
        // Initialize the array
        int numbers[] = {2, 4, 6, 8, 10, 12};
        int arrays[]={1,-3,5,15,11,-9};
        int height[]={4,2,0,6,3,2,5};
        int prices[]={7,1,5,3,6,4};

        // Call the pairs_array method
        pairs_array(numbers);
        printsubarrays(numbers);
        Maxsubarray(arrays);
        kadanes(numbers);
        kadanes(arrays);
        System.out.print(trappedRainwater(height));
        System.out.print(buyAndSellStock(prices));
    }
}
