class Cow implements Animal {     
     protected String myType;     
     protected String mySound;      
     public Cow(String type, String sound)     {         
         myType = type;         
         mySound = sound;     
     }     
     public Cow()     {         
         myType = "bull";         
         mySound = "Mess with the bull and you'll get the horns!!";     
     }      
     public String getSound(){
     	return mySound;
     }     
     public String getType(){
     	return myType;
     } 
}
 