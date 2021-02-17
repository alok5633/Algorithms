import java.util.*;

public class InsertFirst{
    public static void main(String args[]) {
      
      ArrayList<Integer> arr=new ArrayList<>();
      
      arr.add(3);
      arr.add(3);
      arr.add(5);
      arr.add(5);
      arr.add(6);
      
      insert(arr,4);
      
      for(Integer i:arr){
          
          System.out.print(i+" ");
          
      }
      
    }
    
    public static void insert(ArrayList<Integer> arr,int val){
        
        if(arr.size()==0){
            arr.add(val);
            return;
        }
        
        int low=0,high=arr.size()-1,mid=0;
        
        while(low<=high){
            
            mid=low+(high-low)/2;
            
            if(val<=arr.get(mid)){
                high=mid-1;
            }
            else{
                low=mid+1;
            }
            
        }
        
        System.out.println(mid);
        
        if(arr.get(mid)>val)
          arr.add(mid,val);
        else
          arr.add(mid+1,val);
        
    }
    
}