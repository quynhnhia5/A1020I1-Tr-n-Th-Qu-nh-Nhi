package binarysearch;

public class Search {
  public void sortArray(int[] arr) {
    for (int i = 0; i < arr.length - 1; i++) {

      for (int j = i + 1; j < arr.length; j++) {
        if (arr[i] > arr[j]) {
          int temp = arr[i];
          arr[i] = arr[j];
          arr[j] = temp;
        }
      }

      for (int j = 0; j < arr.length; j++) {
        System.out.println(arr[j]);

      }

    }
  }
}
