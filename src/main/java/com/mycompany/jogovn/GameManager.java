package com.mycompany.jogovn;

import Event.Event01;
import java.net.URL;

/**
 *
 * @authores Luan/Rafael/Robson/Samuel/Lucas
 */
public class GameManager {
    ActionHandler aHandler = new ActionHandler(this);
    public UI ui = new UI(this);
    public Player player = new Player(this);
    public SceneChanger sc = new SceneChanger(this);
    Music music = new Music();
    SE se = new SE();
    
    public Event01 ev1 = new Event01(this);
    //public URL entradaM = getClass().getClassLoader().getResource("rez//entrada.wav");
    public URL currentMusic;
    public static void main(String[] args) {
       new GameManager(); 
    }

    public GameManager() {
        //currentMusic = entradaM;
        //playMusic(currentMusic);
        
        player.defaultInventory();
        player.updateInventario();
        sc.showMenu();
    }
    /*
    public void playSE(URL url){
        se.setFile(url);
        se.play(url);
    }
    public void playMusic(URL url){
        music.setFile(url);
        music.play(url);
        music.loop(url);
    }
    public void stopMusic(URL url){
        music.stop(url);
    }*/
}
