/**
 *recursion to compare two strings and find minimum of a group of strings
 */ 
 
import java.util.*; 

public class StringCompare
{
    //explicit default constructor
    public StringCompare() {
    }
    
    /**
     * @require s1!=null && s2!=null
     * @param s1 and s2 are the strings to be compared
     * @ensure compareTo(s1,s2)==-1||compareTo(s1,s2)==0||compareTo(s1,s2)==1
     */ 
    public static int compareTo(String s1, String s2)
    {
        //change both strings to Upper case/Lower case
            
        //if none of the strings are empty
        if(s1.length()>0 && s2.length()>0){
            
        	//compare first characters of the strings
            if(c1>c2){
             
            }
            else if(c1<c2){
                
            }
            else if(c1==c2)
            {
                //recursively call compareTo on the rest of the characters of the strings
            }
        }
        
        
        
        //if both strings are empty
        
        //if s1 is empty and s2 is not
        
        //if s2 is empty and s1 is not
        
    }
    
    
    public static String findMinimum(ArrayList<String> stringArray)
    {
        return findMinimum(stringArray, stringArray.size());
    }
    
    /**
     * helper method
     * @require size!=0
     */
    private static String findMinimum(ArrayList<String> stringArray, int size)
    {
        String min = stringArray.get(0);
        
        //base case: if only one string exists
        
        
        //otherwise: find minimum from rest of the list
        //use compareTo to compare strings

    }
    
}

