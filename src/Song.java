public class Song {
    private String songName;
    private String authorName;
    private String language;
 //------------
    public Song(String s, String a, String l){
        songName = s;
        authorName = a;
        language = l;
    }
 //------------   
    //Getters
    public String getSongName(){
        return songName;
    }
 
 
    public String getAuthorName(){
        return authorName;
    }
 
 
    public String getLanguage(){
        return language;
    }
 //------------
    //Setters
    public void setSongName(String s){
        songName = s;
    }
 
 
    public void setAuthorName(String a){
        authorName = a;
    }
 
 
    public void setLanguage(String l){
        language = l;
    }
 public String toString(){
        return songName + " by " + authorName + "(" + language + ")";
    }
 }
 