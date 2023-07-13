package estruturaIphone.aparelho;

import estruturaIphone.dispositivoMultifuncional.DispositivoMultifuncional;

public class Iphone {
    public static void main(String[] args) {

        DispositivoMultifuncional dm = new DispositivoMultifuncional();

        //Ações Telefone
        dm.atender();
        dm.ligar();
        dm.inicarCorreioVoz();

        //Ações Reprodutor Musical
        dm.tocar();
        dm.pausar();
        dm.selecionarMusica();

        //Navegador Internet
        dm.exibirPagina();
        dm.adicionarNovaAba();
        dm.atualizarPagina();
        
    }
    
}
