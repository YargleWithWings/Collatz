import java.util.Arrays;

public class Collatz{
   private int startNum;
   
   public Collatz(){
      startNum = 1;
   }
   
   public Collatz(int num){
      startNum = num;
   }
   
   public int steps(){
      int numSteps = 1;
      int currentNum = startNum;
      while(currentNum != 1){
         if (currentNum % 2 == 0){
            currentNum /= 2;
         }
         else {
            currentNum = currentNum*3 + 1;
         }
         numSteps++;
      }
      return numSteps;
   }
   
   public int[] sequence(){
      int currentNum = startNum;
      int[] nums = new int[steps()];
      nums[0] = startNum;
      int i = 1;
      while(currentNum != 1){
         if (currentNum % 2 == 0){
            currentNum /= 2;
         }
         else {
            currentNum = currentNum*3 + 1;
         }
         nums[i] = currentNum;
         i++;
      }
      return nums;
   } 
   
   public int maxValue(){
      int[] numArray = sequence();
      int largestNum = 1;
      for(int i : numArray){
         if (i>largestNum){
            largestNum = i;
         }
      }
      return largestNum;
   }
   
   public int minOddValue(){
      int[] numArray = sequence();
      int min = Integer.MAX_VALUE;
      for(int i : numArray){
         if (i%2 == 1 && i < min && i != 1){
            min = i;
         }
      }
      return min;
   }
   
   public int[] oddValues(){
      int[] numArray = sequence();
      int numOdds = 0;
      for(int i : numArray){
         if(i%2 == 1){
            numOdds++;
         }
      }
      int[] oddArray = new int[numOdds];
      int placeInList = 0;
      for(int i : numArray){
         if(i%2 == 1){
            oddArray[placeInList] = i;
            placeInList++;
         }
      }
      return oddArray;
   }
   
   public int sumValues(){
      int[] numArray = sequence();
      int sum = 0;
      for(int i : numArray){
         sum+=i;
      }
      return sum;
   }
   
   public String toString(){
      return "Starting number " + startNum + " takes " + steps() + " steps";
   }

}