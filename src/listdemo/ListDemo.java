
package listdemo;

public class ListDemo {

   
    public static void main(String[] args) {
        
        ListOperations<Integer>  List = new ListOperations();
       
      //Add  vlues in List  
        List.add(5);
        List.add(6);
        List.add(7);
        List.add(8);
        List.add(9);
        
       
       System.out.println("List Before Modification:");
     
       List.showList();
       
       System.out.println("\nElements Store in List :" + List.size());
       
       List.length();
        
       Integer remItem =  List.remove(2);   //remove item from list
           
       System.out.println("\nList After  Modification:");
      
       List.showList();
       
        System.out.println("\nRemoved Item is : " + remItem);
        
       System.out.println("Elements Store in List :" + List.size());
       
      List.length();
     
       
      
      
          
    }
    
}
