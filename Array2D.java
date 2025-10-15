import java.util.*;
public class Array2D {
    public static void main(String []args){
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the no. of rows : ");
    int rows = sc.nextInt();
    System.out.print("Enter the no. of columns : ");
    int cols = sc.nextInt();
    System.out.println("Enter the elements of array : ");
    int A[][] = new int[rows][cols];
    //input
    for(int i =0; i<rows; i++){
        for(int j=0;j<cols; j++){
            A[i][j] = sc.nextInt();
        }
        System.out.println();
    }
    System.out.print("Enter the element to find :");
    int x = sc.nextInt();
    //output
    System.out.println("Entered matrix is : ");
    for(int i =0; i<rows; i++){
        for(int j=0;j<cols; j++){
            System.out.print(A[i][j] + " ");
        }
        System.out.println();
    }       
    for(int i =0; i<rows; i++){
        for(int j=0;j<cols; j++){
            if(A[i][j]==x)
            System.out.print("Element found at index (row,column): " + i + "," + j);
        }
        System.out.println();
    }
    sc.close();
    }
}