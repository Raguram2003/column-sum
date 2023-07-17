import java.util.Arrays;
import java.util.Scanner;

class Solution{
    public int[] columncount(int[][] arr){
        int ro =arr.length;
        int col = arr[0].length;
        int[] array = new int[col];
        for(int i=0;i<col;i++){
            int sum=0;
            for(int j=0;j<ro;j++){
                sum = sum+arr[j][i];
            }
            array[i] = sum;
        }
        return array;
    }
}

public class ColumnSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the rows size: ");
        int rows = sc.nextInt();
        System.out.print("enter the column size: ");
        int column = sc.nextInt();
        System.out.print("Enter the array elements : ");
        int[][] arr = new int[rows][column];
        for(int i=0;i<rows;i++){
            for(int j=0;j<column;j++){
                arr[i][j]=sc.nextInt();
            }
        }
        Solution answer = new Solution();
        System.out.println(Arrays.toString(answer.columncount(arr)));

    }
}
