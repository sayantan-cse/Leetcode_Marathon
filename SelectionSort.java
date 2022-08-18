//selection sort



class SelectionSort{

  public static void SS(int arr[]){
    int n= arr.length;
    boolean swapped=false;
   // outer loop fo reach pass
    for (int i =0; i <n-1; i++){

      // inner loop fo rfinding least element 
      for (int j=i+1; j<n; j++){
        int minimum_index=i;
        if (arr[j]<arr[minimum_index]){
          int temp = arr[minimum_index];
          arr[minimum_index]=arr[j];
          arr[j]=temp;
          swapped=true;
          
        }
        
        }
      if (swapped==false){
          break;
      }
    }
    }
    
  
  public static void printArray(int arr[]){
    for (int ele : arr){
      System.out.println(arr[ele]);
    }
  }
}

class Main{
  public static void main(String[] args){
    int [] testArray = {2,3,88,9,1,5};
    SelectionSort.SS(testArray);
    SelectionSort.printArray(testArray);
    
  }
}
