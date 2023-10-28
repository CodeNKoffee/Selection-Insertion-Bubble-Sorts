// Online Java Compiler
// Use this editor to write, compile and run your Java code online

class HelloWorld {
  public static void main(String[] args) {
    int[] arr = {64, 25, 12, 22, 11};
    System.out.println("Original Array:");
    printArray(arr);
    System.out.println("---------------------");

    System.out.println("Selection Sort:");
    printArray(selectionSort(arr));
    System.out.println("---------------------");
    System.out.println("Insertion Sort:");
    printArray(insertionSort(arr));
    System.out.println("---------------------");
    System.out.println("Bubble Sort:");
    printArray(bubbleSort(arr));
  }
  
  // Selection Sort
  public static int[] selectionSort(int[] arr) {
    int length = arr.length;
    for (int i = 0; i < length - 1; i++) {
      int minIndex = i;
      int min = arr[minIndex];
      for (int j = i + 1; j < length; j++) {
        if (min > arr[j]) {
          minIndex = j;
          min = arr[minIndex];
        }
      }
      int temp = arr[minIndex];
      arr[minIndex] = arr[i];
      arr[i] = temp;
    }
    return arr;
  }
  
  // Insertion Sort
  public static int[] insertionSort(int[] arr) {
    for (int i = 1; i < arr.length; i++) {
      int key = arr[i];
      int j;
      for (j = i-1; j >= 0 && arr[j] > key; j--)
        arr[j+1] = arr[j];
      arr[j+1] = key;
    }
    return arr;
  }
  
  // Bubble Sort
  public static int[] bubbleSort(int[] arr) {
    boolean swap = true;
    int tmp;
    while (swap) {
      swap = false;
      for (int j = 0; j <= arr.length - 2; j++) {
        if (arr[j+1] < arr[j]) {
          tmp = arr[j];
          arr[j] = arr[j+1];
          arr[j+1] = tmp;
          swap = true;
        }
      }
    }
    return arr;
  }
  
  // Print an array
  public static void printArray(int[] arr) {
    for (int value : arr) {
      System.out.print(value + " ");
    }
    System.out.println(); // Add a newline for better formatting
  }
}