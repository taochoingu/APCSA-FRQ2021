import java.util.*;

public class ArrayResizer{  //a
  public static boolean isNonZeroRow(int[][] array2D,int r){
    for(int x : array2D[r]){
      if(x == 0) return false;
    }
    return true;
  }
  /*public static int numNonZeroRow(int[][] array2D){
    int count = 0;
    for(int i =0;i<array2D.length;i++){
      if(isNonZeroRow(array2D,i)) count++;
  }
  return count;*/
}
  public static int[][] resize(int [][] array2D){ //b
    int[][] arr = new int[numNonZeroRow(array2D)][array2D[0].length];
    int k =0;
    for(int i =0;i< array2D.length;i++){
      if(isNonZeroRow(array2D,i)){
        for (int j = 0;j<array2D[0].length;j++){
          arr[k][j]= array2D[i][j];
        }
      k++;
    }
  }
  return arr;
  }
  /*public static void main(String[] args){
    int[][] arr = {{2,1,0},{1,3,2},{0,0,0},{4,5,6}};
    System.out.println(isNonZeroRow(arr,0));
    System.out.println(isNonZeroRow(arr,1));
    System.out.println(isNonZeroRow(arr,2));
    System.out.println(isNonZeroRow(arr,3));
    int[][] smaller = resize(arr);
    for(int i =0;i<smaller.length;i++){
      for(int j = 0 ;j<smaller[0].length;j++)
       System.out.print(smaller[i][j]+"  ");
      System.out.println();
}
  }*/
}
