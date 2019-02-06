package difference_of_diagonals;
import java.util.Scanner;

public class Difference_of_diagonals {
static int find_difference(int[][] arr){
    int i,j;
    int sum_right = 0; // sum of right/ diagonal elements
    int sum_left = 0; // sum of left\ diagonal elements
    int dif;           
    for(i=0; i<arr.length; i++){
        for(j=0; j<arr.length; j++){
        if(i==j) sum_left += arr[i][j];
        if(i+j==arr.length-1) sum_right += arr[i][j];
        }
    } 
    dif = sum_left - sum_right;  
    return  Math.abs(dif);
    /*
    00 01 02 03
    10 11 12 13
    20 21 22 23
    30 31 32 33
    */} 
    public static void main(String[] args) {
      Scanner scan = new Scanner(System.in);
      int size = scan.nextInt();
      int[][] my_arr = new int[size][size];
      
      for(int i=0; i<size; i++){
          for(int j=0; j<size; j++)
              my_arr[i][j] = scan.nextInt();
      } 
      System.out.println(find_difference(my_arr));
    }    
}
