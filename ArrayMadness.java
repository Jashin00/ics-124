
public class ArrayMadness {
    public static int findMax(int [] numbersArray) {
       // Complete Part A
       int maxValue = 0;
       for (int i = 0; i < numbersArray.length; i++){
           if(numbersArray[i] > maxValue){
               maxValue = numbersArray[i];
           }
       }
       return maxValue;
    }
 
    public static int findMin(int [] numbersArray) {
       // Complete Part B
       int minValue = numbersArray[0];
       for (int i = 1; i < numbersArray.length; i++){
           if(numbersArray[i] < minValue){
            minValue = numbersArray[i];
           }
       }
       return minValue;
    }
 
    public static int totalMaxMin(int [] numbersArray) {
       // Complete Part C
       int sumMaxMin = 0;
       int minValue = numbersArray[0];
       int maxValue = 0;

       for (int i = 1; i < numbersArray.length; i++){
           if(numbersArray[i] < minValue){
            minValue = numbersArray[i];
           }
       }

       
       for (int i = 0; i < numbersArray.length; i++){
           if(numbersArray[i] > maxValue){
               maxValue = numbersArray[i];
           }
       }
       sumMaxMin = maxValue + minValue;
       return sumMaxMin;
    }
   
    public static void main(String[] args) {
       int [] testValues = {6, 20, 31, 2, 7, 14};
                 
       if (findMax(testValues) == 31) {
          System.out.println("Part A is correct.");
       }
       else {
          System.out.println("Part A is incorrect.");
       }
       
       if (findMin(testValues) == 2) {
          System.out.println("Part B is correct.");
       }
       else {
          System.out.println("Part B is incorrect.");
       }      
       
       if (totalMaxMin(testValues) == 33) {
          System.out.println("Part C is correct.");
       }
       else {
          System.out.println("Part C is incorrect.");
       }         
    }
 }
 