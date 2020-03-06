
/**
 * Write a description of class PlanoFornecimento here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class PlanoFornecimento
{
    // instance variables - replace the example below with your own
    private Camioes camiao;
   private  EstacoesAbastecedoras Abastecedora;
   private Lojas loja;
   private PacksDeBens packs;
   private Contentor contentor;
   private CentralProdutos centralP;
  private  CentralCamioes ventralC ;

    /**
     * Constructor for objects of class PlanoFornecimento
     */
    public PlanoFornecimento()
    {
        create();
    }

  
    private  void  create()
    {
       packs= new PacksDeBens("feijao", 10, 00001,0.10,0.5);
       Abastecedora= new EstacoesAbastecedoras(10, 3, 2);
       loja= new Lojas(4, 4,"Loja diGuetto");
       camiao= new Camioes(2,"XMX");
       contentor= new Contentor(4);
       createCentrals();
    }
    public void run()
    {
        loadContainer();
        loadTruck();
        moveToStation();
        loadFromStation();
    }
    //4
    private void loadFromStation()
    {
        Abastecedora.carregarCamiao(4,  camiao);
    }
    //3
    private void moveToStation()
    {
       camiao.moverCamiao(3,2) ;
    }
    //2
    private void loadTruck()
    {
         camiao.carregarCamiao(contentor) ;
    }
    //1
    private void loadContainer()
    {
        contentor.receberBem(packs);
    }
    private void  createCentrals()
    {
         centralP = new CentralProdutos("centalProd", 4,5);
         ventralC = new CentralCamioes("centalProd",4,4);
       
    }
}
