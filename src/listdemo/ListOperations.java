
package listdemo;


public class ListOperations <Type> implements ListInterfaces{

    private int nItems , index = 0;
    
    private Type[] arrList ;
    
    public  int capacity = 4 ;
    
    public  ListOperations()
    {
        
        this.arrList =(Type[]) new Object[capacity];
        
        nItems = 0 ;
        
    }
    
    @Override
    public int size() {
       
        return nItems ;
        
    }

    @Override
    public boolean isEmpty() {
        
        return (nItems == 0);
        
    }

    @Override
    public Type get(int index) {
        
        return arrList[index];
        
    }

  @Override
    public Type replacValue(int index, Object Value) {
        
       Type oldValue = arrList[index];
       
       arrList[index] = (Type)Value ;
       
       return oldValue ;
        
    }

     @Override
    public void add(int index, Object Value) {
        
       
        
         if(nItems == arrList.length)
       {
           expandArray(2*arrList.length);
       }
      
       for(byte n =(byte)nItems; n >= index ; n--)
        {
           
             if(n==index)
             {
                 arrList[n]=(Type)Value;
                break;
             }
             
             arrList[n] =arrList[n-1]; 
         }
       
        
        nItems++;
        
    }

    @Override
    public Type remove(int index) {
        
        Type remValue = arrList[index];
        
       
       for(byte n =(byte)index ; n < nItems ; n++)
       {
          
           if(n==index)
           {
               arrList[n] =arrList[n+1];
               continue;
               
           }
           
        arrList[n] = arrList[n+1];
           
       }
        
        nItems--;
        
        return remValue ;
    }

    @Override
    public void add(Object value) {
        
       if(nItems ==arrList.length)
       {
           expandArray(2*arrList.length);
       }
        nItems++;
        
        arrList[index] =(Type)value ;
      
        ++index;
    }

    @Override
    public void showList() {
         
        System.out.print(" List->[ ");
        for(byte i = 0 ; i < nItems ; i++)
        {
            
            System.out.print(" "+arrList[i]);
            
        }
        System.out.print(" ]");
    }

    @Override
    public void expandArray(int capacity) {
         
        Type[] newArr = (Type[])new Object[capacity]; 
        
        for(byte i = 0 ; i < nItems ; i++)
        {
            
            newArr[i] =arrList[i];
            
        }
        
        arrList = newArr;
    }
//to find length of List
    public void length()
    {
        
        System.out.println("Length of List is : " + arrList.length);
    }

   
    
    
}
