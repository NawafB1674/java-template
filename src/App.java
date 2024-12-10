//import java.util.Arrays;
//import java.util.List;
import java.util.Scanner;
public class App
{
 static Song bAF = new Song("I Built a Friend", "Alec Benjamin", "English");
 static Song paperCrown = new Song("Paper Crown", "Alec Benjamin", "English");
 static Song mHBtWind = new Song("Must Have Been the Wind", "Alec Benjamin", "English");
 static Song devilsDB = new Song("Devil Doesn't Bargain", "Alec Benjamin", "English");
 static Song jLA = new Song("Jesus in LA", "Alec Benjamin", "English");
 static Song therapist2therapy = new Song("I Sent my Therapist to Therapy", "Alec Benjamin", "English");
 static Song kS4U = new Song("If I Killed Someone for You", "Alec Benjamin", "English");
 static Song annabellesHW = new Song("Annabelle's Homework", "Alec Benjamin", "English");
 static Song faded = new Song("Faded", "Alan Walker", "English");
 static Song unity = new Song("Unity", "Alan Walker", "English");
 static Song specter = new Song("Specter", "Alan Walker", "English");
 static Song lily = new Song("Lily", "Alan Walker", "English");
 static Song HUMBLE = new Song("HUMBLE.", "Kendrick Lamar", "English");
 static Song DNA = new Song("DNA.", "Kendrick Lamar", "English");
 static Song Alright = new Song("Alright.", "Kendrick Lamar", "English");
 static Song NotLikeUs = new Song("Not Like Us.", "Kendrick Lamar", "English");
 static Song tMB = new Song("Take My Breath", "The Weekend", "English");
 static Song Starboy = new Song("Starboy", "The Weekend", "English");
 static Song Popular = new Song("Popular", "The Weekend", "English");
 static Song wMYB = new Song("What Makes You Beautiful", "One Direction", "English");
 static Song oneThing = new Song("One Thing", "One Direction", "English");
 static Song rckMe = new Song("Rock Me", "One Direction", "English");
 static Song mLJ = new Song("Moves Like Jagger", "Maroon 5", "English");
 static Song Memories = new Song("Memories", "Maroon 5", "English");
 static Song Wait = new Song("Wait", "Maroon 5", "English");
 static Song Cold = new Song("Cold", "Maroon 5", "English");
 static Song wLD = new Song("What Lovers Do", "Maroon 5", "English");
 static Song gLU = new Song("Girls Like You", "Maroon 5", "English");
 static Song CA = new Song("California", "U2", "English");
 static Song CedarwoodRd = new Song("Cedarwood Road", "U2", "English");
 static Song eBW = new Song("Every Breaking Wave", "U2", "English");
 static Song hMC = new Song("Hold Me Close", "U2", "English");
 static Song theMiracle = new Song("The Miracle(of Joey Ramon)", "U2", "English");
 static Song rBW = new Song("Raised by Wolves", "U2", "English");
 static Song s4S = new Song("Song for Someone", "U2", "English");
 static Song whereUcanReachMe = new Song("This is Where You Can Reach Me Now", "U2", "English");
 static Song theTroubles = new Song("The Troubles", "U2", "English");
 static Song Volcano = new Song("Volcano", "U2", "English");
 static Song tOL = new Song("Thinking Out Loud", "Ed Sheeran", "English");
 static Song Shivers = new Song("Shivers", "Ed Sheeran", "English");
 static Song badHabits = new Song("Bad Habits", "Ed Sheeran", "English");
 static Song beautPeeps = new Song("Beautiful People", "Ed Sheeran", "English");
 static Song shapeOfU = new Song("Shape of You", "Ed Sheeran", "English");
 static Song SZX = new Song("手掌心(Palm)", "丁噹(Della Ding)", "Chinese");
 static Song bNMA = new Song("最好不要再遇见你(Better to Never Meet Again)", "丁噹(Della Ding)", "Chinese");
 static Song Dramaturgy = new Song("Dramaturgy", "Eve", "Japanese");
 static Song FS = new Song("Fight Song", "Eve", "Japanese");
 static Song HtEL = new Song("How to Eat Life", "Eve", "Japanese");
 static Song nEC = new Song("Nothing Ever Changes", "Nico Collins", "English");
 static Song timeBomb = new Song("Timebomb", "Nico Collins", "English");
 static Song Alone = new Song("Alone", "Nico Collins", "English");
 static Song Ghost = new Song("Ghost", "Nico Collins", "English");





//CREATE INSTANCE VARIABLES HERE. Ensure they are Static Song.
//May want to create an array of goodbye answers.` Static Song String[] goodBye = {"bye"};


static String[] notFound = {"Sorry, I don't understand.", "Apologies, could you repeat that, please?",
"Apologies, I don't quite understand.", "Sorry, do you mind repeating that?"};


public static void main(String[] args){
 try (Scanner in = new Scanner (System.in)) {
   Scanner in2 = new Scanner (System.in); //Creates a second scanner object. Not needed(?).
    String[] disagree = {"No", "Nah", "Nope"};
   String[] agree = {"Yes", "Yeah", "Okay", "Of course"};
  //  AllSongs allSongs = new AllSongs();
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




          else if(findString(userResp, "Alec Benjamin")){
            System.out.println("Here you go:");
            System.out.println(bAF.toString());
            System.out.println(paperCrown.toString());
            System.out.println(mHBtWind.toString());
            return;
           }
           else if(findString(userResp, "Alan Walker")){
            System.out.println("Here you go:");
            System.out.println(faded.toString());
            System.out.println(unity.toString());
            System.out.println(specter.toString());
            return;
           }
           else if(findString(userResp, "Kendrick Lamar")){
            System.out.println("Here you go:");
            System.out.println(HUMBLE.toString());
            System.out.println(DNA.toString());
            System.out.println(NotLikeUs.toString());
            return;
           }
           else if(findString(userResp, "The Weekend")){
            System.out.println("Here you go:");
            System.out.println(Starboy.toString());
            System.out.println(tMB.toString());
            System.out.println(Popular.toString());
            return;
           }
           else if(findString(userResp, "One Direction") || findString(userResp, "1D")){
            System.out.println("Here you go:");
            System.out.println(wMYB.toString());
            System.out.println(rckMe.toString());
            System.out.println(oneThing.toString());
            return;
           }
           else if(findString(userResp, "Maroon 5")){
            System.out.println("Here you go:");
            System.out.println(mLJ.toString());
            System.out.println(Memories.toString());
            System.out.println(Cold.toString());
            return;
           }
           else if(findString(userResp, "U2")){
            System.out.println("Here you go:");
            System.out.println(CA.toString());
            System.out.println(hMC.toString());
            System.out.println(s4S.toString());
            return;
           }
           else if(findString(userResp, "Ed Sheeran")){
            System.out.println("Here you go:");
            System.out.println(tOL.toString());
            System.out.println(shapeOfU.toString());
            System.out.println(beautPeeps.toString());
            return;
           }
           else if(findString(userResp, "Nico Collins")){
            System.out.println("Here you go:");
            System.out.println(nEC.toString());
            System.out.println(timeBomb.toString());
            System.out.println(Ghost.toString());
            return;
           }
           else if(findString(userResp, "丁噹") || findString(userResp, "Della Ding")){
            System.out.println("Here you go:");
            System.out.println(SZX.toString());
            System.out.println(bNMA.toString());
            return;
           }
           else if(findString(userResp, "Eve")){
            System.out.println("Here you go:");
            System.out.println(Dramaturgy.toString());
            System.out.println(FS.toString());
            System.out.println(HtEL.toString());
            return;
           }





       }








       else if(findString(userResp, "New Song")){
         System.out.println("Do you prefer English, Chinese, or Japanese songs?");
         userResp = in.nextLine();








         if(findString(userResp, "Bye")){
           System.out.println("Goodbye!");
           return;
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




         else if(findString(userResp, "English")){
           System.out.println("Here are some authors who sing in English:");
           System.out.println("Alec Benjamin.");
           System.out.println("The Weekend.");
           System.out.println("Alan Walker.");
           System.out.println("Kendrick Lamar.");
           System.out.println("This system is currently not very user-friendly. Typing would loop you back to the start." +
           "When going through the dialogue again, please choose 'author' if you have someone in mind this time." +
           "If not, choose a different language from the 'new songs' list.");
         } 

           else if(findString(userResp, "Japanese")){
            System.out.println("Here are some authors who sing in Japanese:");
            System.out.println("Eve");
            System.out.println("This system is currently not very user-friendly. Typing would loop you back to the start." +
            "When going through the dialogue again, please choose 'author' if you have someone in mind this time." +
            "If not, choose a different language from the 'new songs' list."); 
           
 














           //for(int i = 0; English.size()>i; i++){
             //System.out.println(English.get(i).getAuthorName());
          // }
           userResp = in2.nextLine();








           // List<Song> authors = allSongs.songsFromSameLanguage("English");
           // for(int i = 0; i < authors.size())); i++){
           //   Static Song Songs = authors.get(i);
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
          }








         else if(findString(userResp, "Japanese")){
           System.out.println("Here are some authors who sing in Japanese:");
          //  int z = Japanese.size();
          //  int y = (int)(Math.random()*z);
          //  System.out.println(Japanese.get(y).getAuthorName());
          //  System.out.println(Japanese.get(y).getAuthorName());
          //  System.out.println(Japanese.get(y).getAuthorName());
          System.out.println("Eve.");
           System.out.println("This system is currently not very user-friendly. Typing would loop you back to the start." +
           "When going through the dialogue again, please choose 'author' if you have someone in mind this time." +
           "If not, choose a different language from the 'new songs' list.");           
          }








         else{
            int x = (int)(Math.random()*4);
            System.out.println(notFound[x]);
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
       System.out.println("Thanks for using our chatBOT!");
       break;
      }








      else{
       int x = (int)(Math.random()*4);
       System.out.println(notFound[x]);
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




//  Static Song ArrayList<Song> Chinese = new ArrayList<>();
//  for(Static Song song:allSongs) {
//    if(song.getLanguage().equals("Chinese")){
//      Chinese.add(song);
//     }
//   }
 //   Static Song ArrayList<Song> English = new ArrayList<>();
//    for(Static Song Songsongs:allSongs) {
//      if(songs.getLanguage().equals("Chinese")){
//        English.add(song);
//       }
//     }
 //   Static Song ArrayList<Song> Japanese = new ArrayList<>();
//   for(Static Song Songsongz:allSongs) {
//    if(songz.getLanguage().equals("Japanese")){
//       Japanese.add(song);
//     }
//   }


}
