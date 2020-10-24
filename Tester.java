import java.util.Arrays;
public class Tester{
  public static void main (String[] args){
    int[] arr1 = {1,4,5,-19,60};
    int[] arr2 = {1000,20,11,19};
    int[] arr3 = {-85};
    int[] empty = {};
    int[][] matrix1 = {arr1, arr2, arr3};
    int[][] matrix2 = {arr1, arr2, arr3, empty};
    System.out.println(ArrayOps.sum(empty));
    System.out.println(ArrayOps.sum(arr1));
    System.out.println(ArrayOps.sum(arr2));
    System.out.println(ArrayOps.sum(arr3));
    System.out.println(ArrayOps.largest(arr1));
    System.out.println(ArrayOps.largest(arr2));
    System.out.println(ArrayOps.largest(arr3));
    System.out.println(Arrays.toString(ArrayOps.sumRows(matrix1)));
    System.out.println(Arrays.toString(ArrayOps.sumRows(matrix2)));
    System.out.println(Arrays.toString(ArrayOps.largestInRows(matrix1)));
    System.out.println(ArrayOps.sum(matrix1));
    System.out.println(ArrayOps.sum(matrix2));
  }

}
