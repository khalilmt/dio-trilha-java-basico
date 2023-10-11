package iphone;

import functionsIphone.Navegador.NavegadorInternetInterface;
import functionsIphone.ReprodutorMusica.ReprodutorMusicalInterface;
import functionsIphone.SistemaLigacoes.AparelhoTelefonicoInterface;

public class Iphone {
    public static void main(String[] args) {
        AppIphone appIphone = new AppIphone();

        //App Navegador
        System.out.println("\n Safari");

        NavegadorInternetInterface safari = appIphone;
        safari.exibirPagina();
        safari.adicionarNovaAba();
        safari.exibirPagina();

        //App Reprodutor de Musica
        System.out.println("\n Ipod");

        ReprodutorMusicalInterface ipod = appIphone;
        ipod.selecionarMusica();
        ipod.tocar();
        ipod.pausar();

        //App Sistema de Ligações
        System.out.println("\n Ligações");

        AparelhoTelefonicoInterface call = appIphone;
        call.atender();
        call.ligar();
        call.iniciarCorreioVoz();
    }
}
