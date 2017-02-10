/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.zombieSurvivalIsland.control;

/**
 *
 * @author FamiliaLezcano
 */
public class GameControl2 {
    
    /**
     *
     * @param level1
     * @param level2
     * @param level3
     * @param level
     * @return
     */
    public int startNewGame(int level1, int level2, int level3, byte level){
       
      
        if (level1 != 1 || level2 != 2 || level3 != 3){
        return -1;
    }
        
        
        

    
byte message=  level;

        return message;
    }
      
  
    public String SaveGame(String player){
     player = "";
        String location = "My Documents";
        String specialChars  = ("+ - * = % & # ! ? ^ “ ‘ ~  < > ( ) [ ] { } : ; . ,");
        if(location != "My Documents"){
           
return null;
        }
        
if(player.contains(specialChars)){
return null;
}
String message = player + "your session was saved in " + location;
return  message;

    }
    
    
    public String initializeMap( String column, int row) {
        
       String columns = "abcdefghi";
       
       if (!columns.contains(column)){
               return "-1";
   }
       
       if (row < 1 || row > 11) {
       
           return "-1";
        }
       
       String coordinate =  column + row; 
        return  coordinate;
       
   }
    public String createNewPlayer() {
       
     String intro = "You will be: ";
     String player = "";
     String specialChar= "*";
    if(player.contains(specialChar)){
        return null;
    }
     
    String message = intro +  player;
   
   return message;
}
   

}
    
