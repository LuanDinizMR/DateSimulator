package com.mycompany.jogovn;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;



public class ActionHandler implements ActionListener{
    GameManager gm;

    public ActionHandler(GameManager gm) {
        this.gm = gm;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String yourChoice = e.getActionCommand();
        switch (yourChoice){
            //Robson
            case "falarR": gm.ev1.falarR(); break;
            case "flertarR": gm.ev1.flertarR(); break;
            case "ofenderR": gm.ev1.ofenderR(); break;
            //mudar cenas
            case"goEnt":
                if (gm.sc.i!=30){
                gm.sc.showScene1();}
                else{
                    gm.sc.badEnding1();
                }
                 break;
            case"goQuadra":
                if (gm.sc.i!=30){
                gm.sc.showScene2();}
                else{
                    gm.sc.badEnding1();
                }
                break;
            case"goCorredor":
                if (gm.sc.i!=30){
                gm.sc.showScene3();}
                else{
                    gm.sc.badEnding1();
                }
                break;
            case"goSala": gm.sc.showScene4(); break;
            //Arbusto
            case "falarArb": gm.ev1.falarArb(); break;
            case "olharArb": gm.ev1.olharArb(); break;
            case "baterArb": gm.ev1.baterArb(); break;
            //Cartão
            case "falarCartao": gm.ev1.falarCartao();break;
            case "olharCartao": gm.ev1.olharCartao(); break;
            case "pegarCartao": gm.ev1.pegarCartao(); break;
            //Samuel
            case "falarS": gm.ev1.falarS(); break;
            case "flertarS": gm.ev1.flertarS(); break;
            case "ofenderS": gm.ev1.ofenderS(); break;
            //Rafael
            case "falarRa": gm.ev1.falarRa(); break;
            case "flertarRa": gm.ev1.flertarRa(); break;
            case "ofenderRa": gm.ev1.ofenderRa(); break;
            //Luacas
            case "falarL": gm.ev1.falarL(); break;
            case "flertarL": gm.ev1.flertarL(); break;
            case "ofenderL": gm.ev1.ofenderL(); break;
            //Bola
            case "chutarBola": gm.ev1.chutarBola();break;
            case "olharBola": gm.ev1.olharBola(); break;
            case "falarBola": gm.ev1.falarBola(); break;
            //menu
            case "inst": gm.sc.tutorial(); break;
            case "cred": gm.sc.creditos(); break;
            case "goMenu": gm.sc.showMenu(); break;
        }
        
    }
    
}
