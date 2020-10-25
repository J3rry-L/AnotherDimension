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

  public static boolean isRowMagic(int[][] matrix) {
    int[] rowSums = sumRows(matrix);
    for (int i = 1; i < rowSums.length; i++){
      if (rowSums[i] != rowSums[i-1]){
        return false;
      }
    }
    return true;
  }

  public static boolean isColMagic(int[][] matrix) {
    int[] rowCols = sumCols(matrix);
    for (int i = 1; i < rowCols.length; i++){
      if (rowCols[i] != rowCols[i-1]){
        return false;
      }
    }
    return true;
  }

  public static boolean isLocationMagic(int[][] matrix, int row, int col) {
    return(sumRows(matrix)[row] == sumCols(matrix)[col]);
  }
}

//Method names have been double checked with those posted on GClass.
