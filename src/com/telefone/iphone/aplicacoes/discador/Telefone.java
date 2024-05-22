package com.telefone.iphone.aplicacoes.discador;

import java.util.Scanner;

public class Telefone {

    private boolean dialer = false ;
    private boolean inbox = false;
    private boolean voiceemail = false;


    public void dialer (){
        dialer = true ;
        Scanner tc = new Scanner(System.in);
        long   number;
        dialer  = true ;
        System.out.println("Please provide a telephone number: ");
       number =   tc.nextLong();
        System.out.printf("dialing of the numero:%d" ,number);

    }
    public void dialerClose (){
        this.dialer = false;
        System.out.println("dialer close");

    }

    public void answellCall (){
        System.out.println("call answered successfully");
    }

    public void voiceMail (){
        this.voiceemail = true;
        Scanner tc = new Scanner(System.in);
        String  mensager;
        System.out.println("Please provide a telephone number: ");
        long number =   tc.nextLong();
        System.out.println("write  your message:");
        mensager = tc.nextLine();
        tc.next();
        System.out.printf("Message to number %d sent successfully!!" , number);
    }
    public void voiceemailClose (){
        this.voiceemail = false;
        System.out.println("voice email close");
    }

    public void inbox (){
        this.inbox = true;
        System.out.println("emails recevid below: ");
        System.out.println(" leticia: oi gatao to com saudades ");
        System.out.println("leo: fala irmao aquela parada deu merda ");
    }
    public void inboxClose (){
        this.inbox = false;
        System.out.println("inbox close");
    }
}
