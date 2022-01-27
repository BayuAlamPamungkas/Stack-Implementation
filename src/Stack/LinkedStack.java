package Stack;

import java.util.LinkedList;
import java.util.ListIterator;

/**
 *
 * @author BAP
 */
public class LinkedStack {
    final private LinkedList<NamaProduk> stack;
    
    public LinkedStack(){
        stack = new LinkedList <NamaProduk>();
       
    }
    
    public void push(NamaProduk namaProduk){
        stack.push(namaProduk);
    }
    
    public NamaProduk pop(){
        return stack.pop();
    }
    
    public NamaProduk peek(){
        return stack.peek();
    }
    
    public boolean isEmpty(){
        return stack.isEmpty();
    }
    
    public int size(){
        return stack.size();
        
    }
    
    void printstack(){
        ListIterator<NamaProduk> iterator = stack.listIterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}

   
