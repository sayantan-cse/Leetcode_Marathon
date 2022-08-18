// Given an array of integers, return the indices of the two 
// numbers whose sum is equal to a given target.
//Brute-force approach
//o(n^2)
// import java.util.*;
// import java.io.*;

// class TwoSumBruteForce{

//   public static int[] twosumBF(int[] arrayInt, int target){
//     for (int i=0; i < arrayInt.length-1; i++){
//       for (int j=i+1; j<arrayInt.length; j++){
//         if (arrayInt[i]+arrayInt[j]== target){
//           return new int [] {i,j};
          
//         }
//       }
//     }
//     return new int[]{};
//   }
// }

// class Main{
//   public static void main(String[] args){
//     Scanner input = new Scanner (System.in);
//     int numberOfElements= input.nextInt();
//     int [] testArray = new int[numberOfElements];
//     for (int k=0; k<testArray.length;k++){
//       testArray[k]=input.nextInt();
//     }
//     int target = input.nextInt();
//     int[] desiredIndices =TwoSumBruteForce. twosumBF(testArray,target);
//     System.out.println(desiredIndices);
//   }
// }

// most efficient HashMap approach
// 0(n)
import java.util.*;
class TwoSumOptimised{

  public static int[] twosumOP(int arr[],int target){
    // initialising a hashmap for storing array elements and 
    //   their indexes
    Map <Integer,Integer> arrayMap = new HashMap<>();

    //iterating over array
    for(int i= 0; i<arr.length;i++){
      int complement = target - arr[i];
      if (arrayMap.containsKey(complement)){
        return new int[] {arrayMap.get(complement),i};
        
      }
      else{
        //storing the array elemnt in hashmap for future lookup
        arrayMap.put(i,arr[i]);
      }
      
    }
    return new int[] {};
  }
}

class Main{
  public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    int numOfElementsTestArray = input.nextInt();
    int [] testArray = new int [numOfElementsTestArray];
    for (int k = 0; k< testArray.length; k++){
      testArray[k]=input.nextInt();
    }
    int target = input.nextInt();  
    int [] desiredIndices = TwoSumOptimised.twosumOP(testArray,target);
    System.out.println(desiredIndices.length);
    
  }
}
