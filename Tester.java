public class Tester{
  public static void main (String[] args){
    int[] arr1 = {1,4,5,-19,60};
    int[] arr2 = {1000,20,11,19};
    int[] arr3 = {-85};
    int[] empty = {};
    System.out.println(ArrayOps.sum(empty));
    System.out.println(ArrayOps.sum(arr1));
    System.out.println(ArrayOps.sum(arr2));
    System.out.println(ArrayOps.sum(arr3));
    System.out.println(ArrayOps.largest(arr1));
    System.out.println(ArrayOps.largest(arr2));
    System.out.println(ArrayOps.largest(arr3));
  }
}
