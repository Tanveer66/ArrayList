
package listdemo;

public interface ListInterfaces <Type>{
    
    //Domian is Generic(Type)
    
    //Operations
    int size();                 //signature
    
    boolean isEmpty();           //signature
    
    Type get(int index);          //signature
    
    Type replacValue(int index , Type Value);     //signature
    
    void add(int index , Type Value);              //signature
    
    Type remove(int index);                         //signature
    
    void add(Type value);
    
    void showList();
    
    void expandArray(int capacity);
    
    
    
}
