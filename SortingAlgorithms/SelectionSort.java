public class SelectionSort {  
    public static int selectionSort(int[] arr, int count){  
        for (int i = 0; i < arr.length - 1; i++)  
        {  
            int index = i; 
            
            for (int j = i + 1; j < arr.length; j++){  
                if (arr[j] < arr[index]){  
                    index = j;//searching for lowest index
                    // System.out.println("Lowest Element = " + arr[index]); 
                    count++;
                }  
            }  
            int smallerNumber = arr[index];   
            arr[index] = arr[i];  
            arr[i] = smallerNumber;  
        } 
        return count; 
    }  
       
    public static void main(String a[]){  
        int[] arr1 = {8, 1, 2, 9, 0, 3};  
        int count = 0;
        System.out.println("Before Selection Sort");  
        for(int i:arr1){  
            System.out.print(i+" ");  
        }  
        System.out.println();  
          
        count = selectionSort(arr1, count);//sorting array using selection sort  
         
        System.out.println("After Selection Sort");  
        for(int i:arr1){  
            System.out.print(i+" ");  
        }  

        System.out.println();
        System.out.println("Number of iterations: " + count);
    }  
}