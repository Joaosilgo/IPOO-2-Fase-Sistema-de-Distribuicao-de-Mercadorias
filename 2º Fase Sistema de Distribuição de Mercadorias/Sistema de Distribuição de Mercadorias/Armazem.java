import java.util.*;
/**
 * Write a description of class Armazem here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Armazem{
    
    private  ArrayList<PacksDeBens> armazem;
    

    /**
     * Constructor,creates a new store with a certain dimension.
     */
    public Armazem()
    {
        armazem = new  ArrayList<>();
    }

    
    public ArrayList<PacksDeBens> getArmazem()
    {
         ArrayList<PacksDeBens> a;
        a=armazem;
        return a;
    }
    /**
     * Method to count the number of products in the store.
     * @return a: products in the store.
     */
    private int countProducts()
    {
       int a=0;
        for(PacksDeBens item : armazem)
        {
            if(item!=null)
            {
                a++;
            }
        }
        return a;
    }
    private int getDimensao()
    {
       int i=armazem.size();
        return i ;
    }
    public boolean isFull()
    {
        if(this.countProducts()==this.getDimensao())
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    /**
     * Method to put products in the store, 
     */
    public void receiveProducts(PacksDeBens bens )
    {
         for(PacksDeBens item : armazem)
        {
            if(item!=null)
            {
                if(item.getCodigoDoProduto()==item.getCodigoDoProduto())
                {
                    item.addQuantity( bens.getQuantity());
                }
                else if(item==null)
                {
                    armazem.add(bens);
                }
            }
            
        }
    }
    
}
