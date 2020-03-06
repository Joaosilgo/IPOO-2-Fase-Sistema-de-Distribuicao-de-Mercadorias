import java.util.*;
/**
 * Write a description of class CentralProdutos here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class CentralProdutos
{
    // instance variables - replace the example below with your own
   // private ArrayList<PacksDeBens>listaBens;//Não vou utilizar
    private HashMap<String , PacksDeBens> listaBens; 
     private String nome;
      private CoordenadasGeograficas posicao;//posiçao central
     
    /**
     * Prefiro usar um hasmap para ter uma key que neste caso é o nome do produto
     * e o ovalor que é o propri produto mesmo que o array tivesse sido mais facil
     * pois mesmo o que o proprio produto mude ou seja actualizaçoes
     * a sua chave tem de ser igual ou seja patente/nome
     */

    /**
     * Constructor for objects of class CentralProdutos
     */
    public CentralProdutos(String nome,double longitude, double latitude)
    {
        listaBens= new HashMap<>();
        this.nome= validateString( nome);
         posicao= new CoordenadasGeograficas(longitude,latitude);
    }
     private String validateString( String s)
    {
        if(s!= null)
        {
            return s;
        }
        else
        {
            return "";
        }
    }
    // cria logo o produto
    public boolean registarProduto(String name,int quantity,int codeOfProduct,double unitaryWeight, double unitaryVolume)
    {
        PacksDeBens pack = new  PacksDeBens( name,   quantity,codeOfProduct,unitaryWeight,unitaryVolume);// falta validar mas nao é precso pois o construtor de packs ja faz

        if(!listaBens.containsKey(name))//faço a comparaçao com o obje
        {

            listaBens.put(name,pack);
            System.out.println("pack registado");
            return true;
        }
        System.out.println("pack nao registado");
        return false;

    } 
    public String produtosEmCirculacao()
    {
        int numero=0;
         String inf="";
         inf+="\n Produtos em circulaçao:";
         for(Map.Entry i : listaBens.entrySet())
        {
            inf+="\n "+ i.getKey()+
            "*******************************************************";
            numero++;
        }
        return inf+"\n tOTAL> "+ numero;
    }
         
    }

    

