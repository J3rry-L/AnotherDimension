public class ArrayOps{
  public static int sum(int[] arr){
    int total = 0;
    for (int i = 0; i < arr.length; i++){
      total += arr[i];
    }
    return total;
  }

  public static int largest(int[]arr){
    int max = arr[0];
    for (int i = 1; i < arr.length; i++){
      if (arr[i] > max){
        max = arr[i];
      }
    }
    return max;
  }

  public static int[] sumRows(int[][] matrix) {
    int[] result;
    result = new int[matrix.length];
    for (int i = 0; i < matrix.length; i++){
      result[i] = sum(matrix[i]);
    }
    return result;
  }

  public static int[] largestInRows(int[][] matrix) {
    int[] result;
    result = new int[matrix.length];
    for (int i = 0; i < matrix.length; i++){
      result[i] = largest(matrix[i]);
    }
    return result;
  }

  public static int sum(int[][] arr) {
    return sum(sumRows(arr));
  }

  public static int[] sumCols(int[][] matrix) {
    int[] result;
    result = new int[matrix[0].length];
    for (int i = 0; i < matrix.length; i++){
      for (int j = 0; j < matrix[0].length; j++){
        result[j] += matrix[i][j];
      }
    }
    return result;
  }

}
