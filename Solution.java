package hackerRank;

import java.util.Arrays;
import java.util.Scanner;


public class Solution{
        public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int limit = input.nextInt(); 
        String typeOfCommand = input.next().toLowerCase();
        
        int [] numArray = new int [limit];
        
        
            switch(typeOfCommand){
            case "asc" -> {
                for(int i = 0; i < numArray.length; i++){
                    numArray[i] = input.nextInt();  
                }
                int temp;
                for(int i = 0; i < numArray.length; i++){
                    for(int j = i+1; j < numArray.length; j++ ){
                        if(numArray[i] > numArray[j]){
                            temp = numArray[i];
                            numArray[i] = numArray[j];
                            numArray[j] = temp;
                        }
                    }   
                } 
                System.out.println(Arrays.toString(numArray));
                break;
            }
            case "des" -> {
                for(int i = 0; i < numArray.length; i++){
                    numArray[i] = input.nextInt();  
                }
                int temp;
                for(int i = 0; i < numArray.length; i++){
                    for(int j = i+1; j < numArray.length; j++ ){
                        if(numArray[i] < numArray[j]){
                            temp = numArray[j];
                            numArray[j] = numArray[i];
                            numArray[i] = temp;
                        }
                    }   
                } 
                System.out.println(Arrays.toString(numArray));
                break;
            }
            
        }
    }
}
