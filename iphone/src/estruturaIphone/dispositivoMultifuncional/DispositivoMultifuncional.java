package estruturaIphone.dispositivoMultifuncional;

import estruturaIphone.dispositivos.AparelhoTelefonico;
import estruturaIphone.dispositivos.NavegadorInternet;
import estruturaIphone.dispositivos.ReprodutorMusical;

public class DispositivoMultifuncional implements AparelhoTelefonico, NavegadorInternet, ReprodutorMusical{

    @Override
     public void ligar(){
            System.out.println("Realizando ligação");
        }


    @Override
    public void atender(){
        System.out.println("Antendendo ligação");
    }

    @Override
    public void exibirPagina(){
            System.out.println("Navegando na internet");
        }


    @Override
    public void tocar(){
        System.out.println("Reproduzindo música");
    }

    @Override
   public void pausar(){
        System.out.println("Pausando música");
    }


    @Override
    public void inicarCorreioVoz() {
      System.out.println("Iniciando Correio de Voz");
    }


    @Override
    public void selecionarMusica() {
       System.out.println("Selecionando música");
    }


    @Override
    public void adicionarNovaAba() {
        System.out.println("Adicionado uma nova página");
    }


    @Override
    public void atualizarPagina() {
         System.out.println("Atualizando pagina");
    }
    
}
