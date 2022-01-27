package Stack;
        
/**
 *
 * @author BAP
 */
public class Main {

    public static void main(String[] args) { 
        LinkedStack stack = new LinkedStack();
       
        
        NamaProduk GranitTile = new NamaProduk(1,"GranitTile",185000);
        NamaProduk KeramikTile = new NamaProduk(2,"KeramikTile",67000);
        NamaProduk ListProfil= new NamaProduk(3,"ListProfil",73000);
        
        
        stack.push(GranitTile);
        stack.push(KeramikTile);
        stack.push(ListProfil);
        
        
        System.out.println("Initial Nama Produk");
        System.out.println("============================");
        stack.printstack();

        
        stack.pop();


        System.out.println("============================");
        System.out.println("Data Nama Produk Sudah pop");
        System.out.println("============================");
        stack.printstack();
        
        System.out.print(" STACK SIZE = " + stack.size());

    }
    
}
