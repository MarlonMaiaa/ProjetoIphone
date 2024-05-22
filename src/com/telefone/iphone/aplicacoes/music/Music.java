package com.telefone.iphone.aplicacoes.music;

public class Music {

   private  boolean play = false;

    private int music = 0;


    public void pause (){

        if (play) {


            System.out.println("stop music");

        }
        else {
            throw new IllegalArgumentException ("Invalid option");
        }
    }
    public void playMusic (){  // é necessario abri o play music para explorar as opções
        this.play = true;
        int m = 1;
        this.music = this.music+ m;

        System.out.println("welcome playmusic ");
        System.out.println("playing music range " + this.music);
        System.out.println("playmusic on" );
    }

    public void playMusicOff (){
        if (play) {
            this.play = false;

            System.out.println("leaving come back often ");
            System.out.println("playmusic off");
        }
        else {
            throw new IllegalArgumentException("Invalid option");
        }

    }
    public void next (){
        if (this.play) {


            int m = 1;
            this.music = this.music + m;
            System.out.println(" music next , current music is range " + this.music);
        }
        else {
            throw new IllegalArgumentException ("Invalid option");
        }
        }

    public void back (){
        if (this.play) {
            int m = 1;
            this.music = this.music - m;
            System.out.println(" music back , current music is range " + this.music);
        } else {
            throw new IllegalArgumentException ("Invalid option");
        }
        }

    public void selectmusic (int music){
        if (this.play) {
            this.music = music;
            System.out.println("music select " + music);
            System.out.println("playing selected music ...  ");
        }
        else {
            throw new IllegalArgumentException ("Invalid option");

        }
    }
    public void playnow (){
        System.out.println("music playing is range " + this.music);

    }

    public void playMusicClose (){
        this.play = true ;
        System.out.println("playmusic close");
    }

}

