import java.util.*;


public class Matrices{

    public static boolean Search(int Matrix[][],int Key){
        Scanner sc=new Scanner(System.in); 
        sc.close();
        for(int i=0; i<Matrix.length;i++){                  //Input for 2D array
            for(int j=0; j<Matrix[0].length;j++){
                if(Matrix[i][j]==Key){
                    System.out.print("Foundkey at ("+ i +","+j+")");
                    return true;
                }
            }
        }
        System.out.print("Key not found");
        return false;
    }






    // Printing spiral meethod question
    public static void PrintSpiral(int[][] matrix){
        int startRow=0;
        int endRow=matrix.length-1;
        int startCol=0;
        int endCol=matrix[0].length-1;


        while(startRow<=endRow && startCol<=endCol){
            //Top 
            for(int j=startCol;j<=endCol;j++){
                System.out.print(matrix[startRow][j]+ " ");
            }

            //Right
            for(int i=startRow+1;i<=endRow;i++){
                System.out.print(matrix[i][endCol]+ " ");
            }
            //Bottom
            for(int j=endCol-1;j>=startCol;j--){
                if(startRow==endRow){
                    break;
                }
                System.out.print(matrix[endRow][j]+ " ");
            }

            // Left
            for(int i=endRow-1;i>=startRow+1;i--){
                if(startCol==endCol){
                    break;
                }
                System.out.print(matrix[i][startCol]+" ");
            }

            startRow++;
            startCol++;
            endCol--;
            endRow--;
        }
        System.out.println();

    }


    //Diagnoll sum ques
    public static int DiagonalSum(int matrix[][]){  //O(n^2) not a best approach
        int sum=0;

        //Primary daigonal {i==j}
        for (int i=0;i<matrix.length;i++){
            for (int j=0;j<matrix[0].length;j++){
                if(i==j){
                    sum+=matrix[i][j];
                }
                else if(i+j==matrix.length-1){
                    sum+=matrix[i][j];
                }
            }
        }
        return sum;
    }



    public static int DiagonalSum2(int matrix[][]){  //Optimal approach
        int sum=0;
        for (int i=0;i<matrix.length;i++){
            //Primary diagnol
            sum+=matrix[i][i];
            //secondary diagonal(i+j=n-1) i.e (j=n-1-i)
            if(i != matrix.length-1-i){    //otherwise some values will be overlaped
                sum+=matrix[i][matrix.length-1-i];
            }
        }
        return sum;
    }


    // Search in sortex matrix
    public static boolean Staircasesearch(int matrix[][],int key){
        int row=0; int coloum= matrix[0].length-1;  // row= n-1  and coloum=0
        while(row<matrix.length && coloum> 0){
            if(matrix[row][coloum]==key){
                System.out.print("Key found at ("+row+","+coloum+")");
                return true;
            }
            else if (key > matrix[row][coloum]){   //Move bottom
                row++;
            }

            else if(key < matrix[row][coloum]){   //Move left 
                coloum--;
            }
        }
        System.out.print("Key not found");
        return false;
    }



    
    public static void main(String args[]){
        // int Matrix[][]= new int[3][3];
        // int n=Matrix.length;      // no of rows
        // int m=Matrix[0].length;   // no of coloums 

        // Scanner sc=new Scanner(System.in);  
        // sc.close();
        // for(int i=0; i<n;i++){                  //Input for 2D array
        //     for(int j=0; j<m;j++){
        //         Matrix[i][j]=sc.nextInt();
        //     }
        //     // System.out.println();
        // }

        // for(int i=0; i<n;i++){                  //Output for 2D array
        //     for(int j=0; j<m;j++){
        //         System.out.print(Matrix[i][j]+ " ");
        //     }
        //     System.out.println();
        // }


        // Search(Matrix,5);



        int matrix[][] = {
            {1, 2, 3, 4},
            {5, 6, 7, 8},
            {9, 10, 11, 12},
            {13, 14, 15, 16}
        };

        // PrintSpiral(matrix);
        DiagonalSum(matrix);

        int matrix2[][]={
            {10,20,30,40},
            {15,25,35,45},
            {27,29,37,48},
            {32,33,39,50}
        };
        int key=33;

        Staircasesearch(matrix2, key);
        
        
    }
}