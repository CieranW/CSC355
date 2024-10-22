public class Insertion {  
    public static int insertionSort(int array[], int count) {  
        int n = array.length;  
        for (int j = 1; j < n; j++) {  
            int key = array[j];  
            int i = j-1;  
            while ( (i > -1) && ( array [i] > key ) ) {  
                array [i+1] = array [i];  
                i--;  
                count++;
            }  
            array[i+1] = key;  
        }  
        return count;
    }  
       
    public static void main(String a[]){    
        int[] arr1 = {8, 1, 2, 9, 0, 3};    
        int count = 0;
        System.out.println("Before Insertion Sort");    
        for(int i:arr1){    
            System.out.print(i+" ");    
        }    
        System.out.println();    
            
        count = insertionSort(arr1, count);//sorting array using insertion sort    
           
        System.out.println("After Insertion Sort");    
        for(int i:arr1){    
            System.out.print(i+" ");    
        }    

        System.out.println();
        System.out.println("Number of iterations: " + count);
    }    
}    