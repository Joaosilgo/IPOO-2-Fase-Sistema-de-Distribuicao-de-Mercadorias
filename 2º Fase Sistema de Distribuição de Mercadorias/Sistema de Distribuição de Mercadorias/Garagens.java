import java.util.*;
/**
 * Write a description of class Garagens here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Garagens
{

    private String nome;
    private CoordenadasGeograficas posicao;//(longitude, latitude)
    private int numeroLugar;
    //private  int index = numeroLugar -1;
    private int maximoLugares;
    // private Camioes[] estacionamento;//
    //private boolean [] estacionamentoBolean;
    // private Contentor[] c;
    //  private boolean []temContentor;
    private ArrayList<Camioes> estacionamentoForaDaGaragem;
    private HashMap<String , Camioes> estacionamento;// matricula e ocamiao
    //private Camioes camiao;
    private int lugaresOcupados;

    // private ArrayList<Camioes,Contentor> lugares;
    //private Camiao camiao;

    /**
     * Constructor for objects of class Garagens
     * @argum: nome -hjhjghjgh
     *               longitude -
     */
    public Garagens(  String nome,double longitude, double latitude,int maximoLugares )// garagem vai ter 
    {
        this.maximoLugares=maximoLugares;
        this.nome=nome;
        this.posicao= new CoordenadasGeograficas(longitude,latitude);
        // estacionamento= new Camioes[maximoLugares];
        //estacionamentoBolean= new boolean[maximoLugares];
        //c= new Contentor[maximoLugares];
        //temContentor = new boolean[maximoLugares];
        // for(int i=0 ; i<estacionamentoBolean.length ;i++)
        // {
        //    estacionamentoBolean[i]=true;
        // }
        estacionamentoForaDaGaragem = new ArrayList<>();
        estacionamento= new HashMap<>();
        lugaresOcupados=0;
    }

    public boolean estacionarCamiao(Camioes camiao)
    {
        // numeroLugar=lugar;
        if(camiao.getPosicao().getLongitude()==posicao.getLongitude() && camiao.getPosicao().getLatitude()==posicao.getLatitude() )
        {
            // if(lugar-1<=estacionamento.size() && lugar>=1)
            // {
            // if(estacionamento[lugar-1]==null)
            // {
            if(camiao!=null)
            {
                if(lugaresOcupados<maximoLugares)
                {
                    //estacionamento[lugar-1]=camiao;
                    //estacionamentoBolean[lugar-1]=false;
                    estacionamento.put(camiao.getDesignacao(), camiao);
                    lugaresOcupados++;
                    return true;
                }
                else
                {

                    System.out.println("Lugares maximos ocupados");
                    return false;
                }
            }
            else
            {
                System.out.println("Camiao a null");
                return false;
            }
            // }
            // else
            // {
            //    System.out.println("Estacionamento ja esta ocupado");
            // }
        }
        else
        {
            System.out.println(" lugar de Estacionamento inadvertido ");
             return false;
        }
    }
    //   else
    // {
    //   System.out.println("Camiao não esta em posicao");
    //}

    public boolean inspecionarCamiaoLugar(String matricula)
    {
        for(String item : estacionamento.keySet() )
        {
            if(estacionamento.containsKey(matricula))
            {
                estacionamento.get(item).Inspecao();
                //item.Inspecao();
                System.out.println("check");
                return true;
            }
        }
        System.out.println("Estacionamento nao tem camiao");
        return false;

    }

    public void inspecionarCamiaoId(int idcamiao)
    {

        if(idcamiao>=0){
            for(Map.Entry item : estacionamento.entrySet() )
            {
                if(estacionamento.get(item).getIdCamiao()==idcamiao)
                {
                    estacionamento.get(item).Inspecao();
                    System.out.println("check");
                }
                else
                {
                    System.out.println("Camiao Nao se encontra dentro do estacionamento da garagem");
                }
            }
        }
        else
        {
            System.out.println("Id de camiao inadvertifo");
        }
    }
    //Conferir estacionamentos, percorrendo a lista de camiões estacionados
    //a verificar se estes se encontram mesmo na garagem (posição igual à da garagem).
    public void conferirEstacionamento()
    {
        String inf=toString();
        for(Map.Entry item : estacionamento.entrySet() )
        {
            inf+=estacionamento.get(item).getDesignacao()+" iD:"+estacionamento.get(item).getIdCamiao();
        }
        System.out.println(inf);
    }

    public void conferirEstacionamentoGaragem()
    {
        String inf=toString();
        for(Map.Entry item : estacionamento.entrySet() )
        {
            if(estacionamento.get(item)==null)
            {
                inf+="Vazio\n";
            }
            else
            {
                if(estacionamento.get(item).getPosicao().getLongitude()==posicao.getLongitude() && estacionamento.get(item).getPosicao().getLatitude()==posicao.getLatitude())
                {
                    inf+=estacionamento.get(item).getDesignacao()+" iD:"+estacionamento.get(item).getIdCamiao() + "  Esta na Garagem\n";
                }
                else
                {
                    inf+=estacionamento.get(item).getDesignacao()+" iD:"+estacionamento.get(item).getIdCamiao()+"  Não está na garagem \n";
                }
            }
        }
        System.out.println(inf);
    }

    @Override 
    public String toString()
    {
        String inf="\n  Garagem  ";
        inf+=nome + "\n "+
        "Localizado "+posicao.toString()+"\n"+
        "Com :"+ getMaximoLugares() + "Lugares"+"\n"+
        "Lugares Usados:"+ lugaresOcupados()+"\n"+
        "Restantes: "+ restantes()+"\n"+
        "Camioes:\n";

        return inf;
    }

    private int restantes()
    {
        int i=0;
        i+=getMaximoLugares() - lugaresOcupados();
        return i;
    }

    public int getMaximoLugares()
    {
        return maximoLugares;
    }

    public int lugaresOcupados()
    {
        int i=0;
        for(Map.Entry item : estacionamento.entrySet() )
        {
            if(estacionamento.get(item)!=null)
            {
                i++;   
            }

        }
        return i;
    }

    public CoordenadasGeograficas getPosicao()
    {
        return posicao;
    }

    public void DescarregarContentorCamiao( String matricula)
    {
        if(estacionamento.containsKey(matricula))
        {
            estacionamento.get(matricula).descarregar();
        }
        else
        {
            System.out.println("Nao existe esse camiao  contentor");
        }

    
        // if(lugar-1<=estacionamento.length && lugar>=1)
        //{
        //  if(estacionamento[lugar-1]!=null)
        //  {
        //     if(estacionamentoBolean[lugar-1]==false)
        //         if(c[lugar-1]==null)
        //      {
        //          estacionamento[lugar-1].descarregar();
        //          System.out.println("Contentor decarregado no lugar "+ lugar);

        //     }

        //     else
        //    {
        //        System.out.println("lugar ja possui um contentor");
        //   }
        // }
        //  else
        // {
        //    System.out.println("estacionamento vazio");
        // }
        // }
        //  else
        // {
        //     System.out.println("estacionamento ocupado por " +estacionamento[lugar-1].getDesignacao());
        // }
        //  }
        // else
        // {
        //    System.out.println("numero de lugar invalido");
        // }
    }

    public void TrocarContentorCamiao(Contentor cont, String matricula)
    {

        if(estacionamento.containsKey(matricula))
        {
            if(cont!=null)
            {
                estacionamento.get(matricula).descarregar();
                // estacionamento[lugar-1].descarregar();
                estacionamento.get(matricula).carregarCamiao(cont);
                //   estacionamento[lugar-1].carregarCamiao(cont);
                System.out.println("Contentor descarregado e careegado com contentor id: "+ cont.getIdContentor() );
            }
            else
            {
                estacionamento.get(matricula).descarregar();
                System.out.println("Contentor decarregado ");

            }
            // estacionamento.get(estacionamento).descarregar();
        }

        // if(lugar-1<=estacionamento.length && lugar>=1)
        //{
        //   if(estacionamento[lugar-1]!=null)
        //   {
        //       if(estacionamentoBolean[lugar-1]==false)
        //      {
        //     if(c[lugar-1]==null)
        //    {
        //         if(cont!=null)
        //      {
        //           estacionamento[lugar-1].descarregar();
        //           estacionamento[lugar-1].carregarCamiao(cont);
        //          System.out.println("Contentor descarregado e careegado com contentor id: "+ cont.getIdContentor() );
        //     }
        //     else
        //    {
        //      estacionamento[lugar-1].descarregar();
        //      System.out.println("Contentor decarregado no lugar "+ lugar);

        // }
        //  }
        // else
        // {
        //    System.out.println("lugar ja possui um contentor");
        //  }
        // }
        // else
        //{
        //     System.out.println("estacionamento vazio");
        // }
        //}
        //else
        //{
        //    System.out.println("estacionamento ocupado por " +estacionamento[lugar-1].getDesignacao());
        // }
    }
    //else
    // {
    //    System.out.println("numero de lugar invalido");
    //}
}

