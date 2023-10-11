package iphone;

import functionsIphone.Navegador.NavegadorInternetInterface;
import functionsIphone.ReprodutorMusica.ReprodutorMusicalInterface;
import functionsIphone.SistemaLigacoes.AparelhoTelefonicoInterface;

public class AppIphone implements NavegadorInternetInterface, ReprodutorMusicalInterface, AparelhoTelefonicoInterface {

    //SAFARI

    public void exibirPagina() {
        System.out.println("Exibir Nova Pagina");
    }

    public void adicionarNovaAba() {
        System.out.println("Adicionar Nova Aba");
    }

    public void atualizarPagina() {
        System.out.println("Atualizar Pagina");
    }

    //IPOD
    public void tocar() {
        System.out.println("Tocar Musica");
    }

    public void pausar() {
        System.out.println("Pausar Musica");
    }

    public void selecionarMusica() {
        System.out.println("Selecionar Musica");
    }


    //LIGAÇÕES

    public void ligar() {
        System.out.println("Realizando Ligação");
    }

    public void atender() {
        System.out.println("Atendendo Ligação");
    }

    public void iniciarCorreioVoz() {
        System.out.println("Iniciar Correio de Voz");
    }
}

