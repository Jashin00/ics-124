
public class NumberChanger {
    public static int [] changeNumbers(int[] numberArray, int changeFrom, int changeTo) {
      // Complete Part A
      for (int i = 0; i < numberArray.length; i++){
         if (numberArray[i] == changeFrom){
            numberArray[i] = changeTo;
         }
      }
      return numberArray;
    }
    
    public static void printArray(int[] numberArray) {
      // Complete Part B
      boolean firstVal = true;
      for (int i = 0; i < numberArray.length; i++){
         if (firstVal){
            System.out.print(numberArray[i]);
            firstVal = false;
         }else
            System.out.print(" " + numberArray[i]);
      }
    }

   public static void main(String args[]) {
      int [] testArray = {1, 3, 5, 3, 7, 7, 8, 1, 5, 3};
      int [] changedArray = changeNumbers(testArray, 3, 5);

      System.out.println("Expected output: 1 5 5 5 7 7 8 1 5 5");
      System.out.print("Your output: "); 
      printArray(changedArray);
   } 
}
