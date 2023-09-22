import java.util.*;

import java.io.*;
public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello! Welcome to Guess the Number game");
        System.out.println("Enter the number of tries you want");
        Scanner scn= new Scanner(System.in);
        int t= scn.nextInt();
        //int will convert double
        int num= 1+ (int)(100*Math.random());
        //System.out.println(num);
        System.out.println(
			"A number is chosen between 1 to 100. Guess the number within limited trials.");
        
            int i;
        System.out.println("Guess the number:");
        for(i=1; i<=t; i++){
            
            int ans= scn.nextInt();
            if(num==ans){

                System.out.println("Congratulations, Thats the correct guess in "+t+" attemps.");
                break;
            }
            else if(num< ans && i!=t-1)
            {
                System.out.println("The number is smaller than "+ ans+". You now have "+(t-i)+" trails left.");
                //t--;
            }
            else if(num>ans && i!=t-1){
                System.out.println("The number is greater than "+ ans+". You now have "+(t-i) +" trails left.");
                //t--;
            }
            if(i==t){
                System.out.println("You have exhausted the number of trials in this game");
                System.out.println("The number was: "+ num);}
    
        }
        

    }
}
