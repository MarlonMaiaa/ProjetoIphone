package com.telefone.iphone.aplicacoes.navegador;

public class Navegador {
    private boolean safari = false ;
    private int aba = 1;
    public void openSafari (){

        safari = true ;
        System.out.println("Home page");
        System.out.printf("quantity of aba %d " , this.aba);
    }

    public void  openNewAba (){

        if (safari){
            int  a = 1;
            aba = aba + a ;
            System.out.println("enter an addres :");
            System.out.printf("quantity abas: %d ", aba);
        }
        else {
            throw new IllegalArgumentException("Option invalid");
        }
    }
    public void updatesPagina (){
        if (safari) {
            System.out.println("pages update carried out  at success");
        }
        else {
            throw new IllegalArgumentException("Option invalid");
        }
    }

    public void close (){
        if (safari) {
            this.safari = false;
            System.out.println(" finishing  safari");
        }
        else {
            throw new IllegalArgumentException("Option invalid");
        }
        }
}
