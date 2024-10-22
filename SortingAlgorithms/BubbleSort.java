public class BubbleSort {  
    static int bubbleSort(int[] arr, int count) {  
        int n = arr.length;  
        int temp = 0;  
         for(int i=0; i < n; i++){  
                 for(int j=1; j < (n-i); j++){  
                          if(arr[j-1] > arr[j]){  
                                 //swap elements  
                                 temp = arr[j-1];  
                                 arr[j-1] = arr[j];  
                                 arr[j] = temp;
                                count++;
                          }
                          
                 }  
         }  
        return count;
    }  
    public static void main(String[] args) {  
                int arr[] ={8, 1, 2, 9, 0, 3};  
                int count = 0;
                 
                System.out.println("Array Before Bubble Sort");  
                for(int i=0; i < arr.length; i++){  
                        System.out.print(arr[i] + " ");  
                }  
                System.out.println();  
                  
                count = bubbleSort(arr, count);//sorting array elements using bubble sort  
                 
                System.out.println("Array After Bubble Sort");  
                for(int i=0; i < arr.length; i++){  
                        System.out.print(arr[i] + " ");  
                }  
                System.out.println();
                System.out.println("Number of iterations: " + count);
   
        }  
}  