//Bubble sort
//Bubble Sort is the simplest sorting algorithm 
// works by repeatedly swapping the adjacent elements
//   if they are in the wrong order. 
//   not suitable for large data sets 
//optimised


class BubbleSort{

  public static void BS(int arr[]){
    boolean swapped=false;
    //first loop for the passes
    for (int i = 0 ; i <arr.length-1;i++){
      // inner loop for the swapping
      // n-1-i because ele getting swapped with the adjacent 
      for (int j=0; j< arr.length-i-1;j++){
        if (arr[j]>arr[j+1]){
          int temp = arr[j+1];
          arr[j+1]= arr[j];
          arr[j]=temp;

          //optimisation for inner loop
          swapped=true;
          
        }
       
        }
      if (swapped==false){
        break;
      }
        
      }
   
    }
}
   
  


class Main{
  public static void main(String[] args){
    int [] testArr = {2,1,7,5};
    BubbleSort.BS(testArr);
    for(Integer ele : testArr){
      System.out.println(testArr[ele]);
    }
    
   
    
  }
}
