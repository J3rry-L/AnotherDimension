import java.util.Arrays;
public class Tester{
  public static void main (String[] args){
    int[][] A = { {  1,  0, 12, -1 },
                  {  7, -2,  2,  1 },
                  { -5, -2,  2, -9 }
               };
    int[] B = {  1, 3, 5 };
    int[][] C = { {  1,  2, 3, 4 },
                { 2, 3,  4,  1 },
                { 3, 4,  1, 2 } };
    int[][] D = { {  1,  1, 1 },
                { 2, 2, 2 },
                { 3, 3, 3 } };
    int[] arr1 = {1,4,5,-19,60};
    int[] arr2 = {1000,20,11,19};
    int[] arr3 = {-85};
    int[] empty = {};
    int[][] matrix1 = {arr1, arr2, arr3};
    int[][] matrix2 = {arr1, arr2, arr3, empty};
    System.out.println( ArrayOps.sum(B));
    System.out.println(ArrayOps.sum(empty));
    System.out.println(ArrayOps.sum(arr1));
    System.out.println(ArrayOps.sum(arr2));
    System.out.println(ArrayOps.sum(arr3));
    System.out.println(ArrayOps.largest(arr1));
    System.out.println(ArrayOps.largest(arr2));
    System.out.println(ArrayOps.largest(arr3));
    System.out.println(Arrays.toString(ArrayOps.sumRows(A)));
    System.out.println(Arrays.toString(ArrayOps.sumRows(matrix1)));
    System.out.println(Arrays.toString(ArrayOps.sumRows(matrix2)));
    System.out.println(Arrays.toString(ArrayOps.largestInRows(A)));
    System.out.println(Arrays.toString(ArrayOps.largestInRows(matrix1)));
    System.out.println(ArrayOps.sum(A));
    System.out.println(ArrayOps.sum(matrix1));
    System.out.println(ArrayOps.sum(matrix2));
    System.out.println(Arrays.toString(ArrayOps.sumCols(A)));
    System.out.println(ArrayOps.isRowMagic(C));
    System.out.println(ArrayOps.isRowMagic(D));
  }

}
