import java.util.List;
import java.util.Scanner;
public class App
{
   //CREATE INSTANCE VARIABLES HERE. Ensure they are static.
   //May want to create an array of goodbye answers.
 static String[] goodBye = {"bye"};
 public static void main(String[] args){
   try (Scanner in = new Scanner (System.in)) {
     Scanner in2 = new Scanner (System.in); //Creates a second scanner object. Not needed(?).
    
     String[] disagree = {"No", "Nah", "Nope"};
     String[] agree = {"Yes", "Yeah", "Okay", "Of course"};
     AllSongs allSongs = new AllSongs();
     while (true){
       System.out.println("Hello, user! Are you here to find a song to listen to?");
       String userResp = in.nextLine(); //in.nextLine() uses the scanner object to get the user's response as a String


       if (findArray(userResp, disagree)){
         System.out.println("Apologies, then I cannot assist you.");
         break;
       }




       else if (findArray(userResp, agree)){
         System.out.println("Are you looking for a completely new song,"
         + " or do you already have an author you want recommendations about in mind?" +
         " By the way, you can exit at anytime by typing 'Bye'.");
         userResp = in2.nextLine();


         if(findString(userResp, "Bye")){
           System.out.println("Goodbye!");
           return;
         }


         if(findString(userResp, "Author")){
           System.out.println("Alright, which author would you like to hear more songs of?");
           userResp = in.nextLine();


           if(findString(userResp, "Bye")){
             System.out.println("Goodbye!");
             return;
           }


           else{
             System.out.println("This direction of inquiry is currently unfinished."
             + "Please return to the start and pick the other option.");
           }
         }




         else if(findString(userResp, "New Song")){
           System.out.println("Do you prefer English, Chinese, or Japanese songs?");
           userResp = in.nextLine();


           if(findString(userResp, "Bye")){
             System.out.println("Goodbye!");
             return;
           }




           else if(findString(userResp, "English")){
             System.out.println("Here are some authors who sing in English:");
             System.out.println("Alec Benjamin.");
             System.out.println("The Weekend.");
             System.out.println("Alan Walker.");
             System.out.println("Kendrick Lamar.");
             System.out.println("This system is currently not very user-friendly. Typing would loop you back to the start." +
             "When going through the dialogue again, please choose 'author' if you have someone in mind this time." +
             "If not, choose a different language from the 'new songs' list.");    




             //for(int i = 0; English.size()>i; i++){
               //System.out.println(English.get(i).getAuthorName());
            // }
             userResp = in2.nextLine();


             // List<Song> authors = allSongs.songsFromSameLanguage("English");
             // for(int i = 0; i < authors.size())); i++){
             //   Song s = authors.get(i);
             //   System.out.println(s.getAuthorName());
             // }
           }


           else if(findString(userResp, "Chinese")){
             System.out.println("Here are some authors who sing in Chinese:");
             System.out.println("丁噹(Della Ding).");
             System.out.println("凤凰传奇(Phoenix Legend).");
             System.out.println("王朝(Wang Chao).");
             System.out.println("玥夏(YueXia).");
             System.out.println("This system is currently not very user-friendly. Typing would loop you back to the start." +
             "When going through the dialogue again, please choose 'author' if you have someone in mind this time." +
             "If not, choose a different language from the 'new songs' list.");
             userResp = in2.nextLine();
           }


           else if(findString(userResp, "Japanese")){
             System.out.println("Here are some authors who sing in Japanese:");
             System.out.println("Eve.");
             System.out.println("This system is currently not very user-friendly. Typing would loop you back to the start." +
             "When going through the dialogue again, please choose 'author' if you have someone in mind this time." +
             "If not, choose a different language from the 'new songs' list.");             
             userResp = in2.nextLine();
           }


           else{
             System.out.println("Sorry, please choose one of the three languages.");
           }
         }




         else{
           System.out.println("Sorry, I don't quite understand. Could you repeat your statement?");
           userResp = in.nextLine();


           if(findString(userResp, "Bye")){
             System.out.println("Goodbye!");
             return;
           }
         }
       }


       if (findString(userResp, "Coders")){
         System.out.println("A time not so long ago, in a galaxy not very far away...");
         System.out.println("Two coders were scratching their head over a random piece of code.");
         System.out.println("This Chatbot was coded by:");
         System.out.println("Nawaf Bhuiyan.");
         System.out.println("Yu Zhu.");
         System.out.println("Thanks for using our chatbot!");
         break;
       }


       else{
         System.out.println("Apologies, I don't quite understand.");
       }
     }
    
    
     //List<Song> findArraySongsFromSameAuthor = new AllSongs().findArrayAllSongsFromSameAuthorOfSong(SecondResp);
     in.close();
     in2.close();
   }
 } 
      
 private static boolean findArray(String userResponse, String[] array) {
   for(int i = 0; i < array.length; i++) {
     if( userResponse.toLowerCase().contains(array[i].toLowerCase())){
       return true;
     }
   }
   return false;
 }


 private static boolean findString(String userResponse, String str){
   for(int i = 0; i < userResponse.length(); i++) {
     if( userResponse.toLowerCase().contains(str.toLowerCase())){
       return true;
     }
   }
   return false;
 }


 }
