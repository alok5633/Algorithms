import java.util.*;
public class CountSubStrings {
    public static void main(String args[]) {
      
      String s="aaaaa";
      String p="aa";
      
      int pf[]=prefix(p);
      int count=0,i=0,j=0;
      
      
      
      while(i<s.length()){
          
          
          
          if(s.charAt(i)==p.charAt(j)){
              
              if(j==p.length()-1){
                  
                  
                  count++;
                  i=i-p.length()+2;
                  j=0;
                  
              }
              else{
                  
                  i++;
                  j++;
              }
              
              
              
          }
          
          else if(j>0){
              j=pf[j-1]+1;
          }
          else{
              i++;
          }
          
          
      }
      
      
      System.out.println(count);
      
      
    }
	
	public static int[] prefix(String p){
        
        int pf[]=new int[p.length()];
        
        for(int i=0;i<pf.length;i++){
            pf[i]=-1;
        }
        
        int i=1,j=0;
        
        while(i<pf.length){
            
            if(p.charAt(i)==p.charAt(j)){
                
                pf[i]=j;
                i++;
                j++;
                
            }
            
            else if(j>0){
                j=pf[j-1]+1;
            }
            
            else{
                i++;
            }
            
            
        }
        
        return pf;
        
    }
    
}