package com.telefone.iphone.aplicacoes.home;

import com.telefone.iphone.aplicacoes.music.Music;
import com.telefone.iphone.aplicacoes.navegador.Navegador;
import com.telefone.iphone.aplicacoes.discador.Telefone;

public class Iphone {
    public static void main(String[] args) {
        Music m1 = new Music();
        // acesse o aplicativo de musica com o metodo playmusic

        m1.playMusic();   // Abrir o app de musica
        m1.selectmusic(11);  // selecionar musica
        m1.back(); // volta musica
        m1.next(); // avanca musica
        m1.pause();  // parar musica
        m1.playnow(); // tocar musica
        m1.playMusicClose(); // encerra o app de musica;


        Telefone t1= new Telefone();


        t1.voiceMail();  // escrever e enviar uma mensagem de texto.
        t1.inbox();   // caixa de entrada
        t1.dialer();  // discador
        t1.answellCall(); // atender ligação
        t1.dialerClose(); // sair do discador

        Navegador n1 = new Navegador();

        n1.openSafari(); // Abrir o navegador na pagina inicial
        n1.openNewAba(); // abrir uma nova aba
        n1.updatesPagina(); // atualizar a pagina
        n1.close();  // sair do navegador








    }
}
