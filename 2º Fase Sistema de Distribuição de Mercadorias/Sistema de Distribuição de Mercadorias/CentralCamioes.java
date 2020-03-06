import java.util.*;
/**
 * Write a description of class CentralCamioes here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class CentralCamioes
{
    // instance variables - replace the example below with your own
    private String nome;
    private ArrayList<Camioes>listaCamioes;
    private CoordenadasGeograficas posicao;//posiçao central

    /**
     * Constructor for objects of class CentralCamioes
     */
    public CentralCamioes(String nome, double longitude, double latitude)
    {
        this .nome= validateString( nome);
        listaCamioes= new ArrayList<>();
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

    public boolean registarCamiao(int idCamiao, String designacao)
    {
        Camioes camiao = new  Camioes( idCamiao,   designacao);// falta validar mas nao é precso pois o construtor de camiaoes ja faz

        if(!listaCamioes.contains(camiao))//faço a comparaçao com o obje
        {

            listaCamioes.add(camiao);
            System.out.println("Camaio registado");
            return true;
        }
        System.out.println("Camiao nao registado");
        return false;

    }
    public Camioes getCamiao(String designacao)
    {
         for(Camioes i : listaCamioes)
         {
         
              if(i.getDesignacao().equals(designacao))
              {
                  return i;
                }
            }
            return null;
               
         
    }

    public boolean registarCamiaoMatricula(int idCamiao, String designacao)
    {
        Camioes camiao = new  Camioes( idCamiao,   designacao);
        for(Camioes i : listaCamioes)
        {
            if((i.getDesignacao()!=camiao.getDesignacao()))
            {
                listaCamioes.add(camiao);
                System.out.println("Camaio registado");
                return true;
            }
            
            
        }
        System.out.println("Camiao nao registado matricula ja utilizada");
        return false;

    }

    public boolean AnularCamiao(int idCamiao, String designacao)
    {

        for(Camioes i : listaCamioes)
        {
            if(i.getIdCamiao()==idCamiao && i.getDesignacao().equals(designacao))
            {

                listaCamioes.remove(i);
                System.out.println("Camaio removido");
                return true;
            }
        }
        System.out.println("Camiao nao encontrado");
        return false;

    }
    //Listar todos os camiões existentes.
    public String camioesemCirculacao()
    {
        int numero=1;
        String inf="";
        inf+="\n Camioes em circulaçao:";
        for(Camioes i : listaCamioes)
        {
            inf+="\n "+ numero+ "-"+i.getDesignacao()+ "Mat: "+i.getIdCamiao()+
            "\n Posicao :" +i.getPosicao().toString()+
            "*******************************************************";
            numero++;
        }
        return inf;
    }
    //Listar todos os camiões num raio de X quilómetros em relação a uma determinada posição
    public void camioesNoRaioDeX(double km)
    {
        //CoordenadasGeograficas p= new CoordenadasGeograficas(longitude,latitude);
        //posicao
        for(Camioes item :listaCamioes )
        {
            double p1=posicao.getLongitude()-item.getPosicao().getLongitude();
            double p2=posicao.getLatitude()-item.getPosicao().getLatitude();
            double i=Math.sqrt(Math.pow(p1,2)+Math.pow(p2,2));
            double milhas = i * 60;
            double t = (milhas * 1.852);
            if(t<=km)
            {
                System.out.println(item.toString());
            }
        }
    }
    //Contar e identificar quais os camiões que têm necessidade de inspeção 
    //(já percorreram
    //mais de 10.000Km desde a última inspeção).
    public void precisaInspespecao()
    {
        int i=0;
        for(Camioes item :listaCamioes )
        {
           if(item.getQuilometrosPecorridosInspecao()>10000)
           {
               System.out.println(item.toString());
               i++;
            }
        }
        System.out.println("Total: "+i);
    }
    //Contar o número de camiões “novos” (com menos de 50.000Km).
     public void camioesNovos()
    {
        int i=0;
        for(Camioes item :listaCamioes )
        {
           if(item.getQuilometrosPercorridos()<50000)
           {
               System.out.println(item.toString());
               i++;
            }
        }
        System.out.println("Total: "+i);
    }
    public ArrayList<Camioes> getLista()
    {
        ArrayList<Camioes> c = new ArrayList<>();
        c=listaCamioes;
        return c;// nao se deve fazer mas tou com pouco tempo ou nao
        //ja ta melhor
    }
}
