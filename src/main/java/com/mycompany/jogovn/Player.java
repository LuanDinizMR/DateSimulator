package com.mycompany.jogovn;

public class Player {
    GameManager gm;

    public Player(GameManager gm) {
        this.gm = gm;
    }
    public int hasCoin=0;
    public int hasCard=0;
    public int hasPencil=0;
    public int hasFone =0;
    public void defaultInventory(){
        hasCoin = 0;
        hasCard=0;
        hasPencil=0;
        hasFone=0;
        
    }
    public void updateInventario(){
        if (hasCoin==0) {
            gm.ui.slotInv[1].setVisible(false);
        }
        if (hasCard==0) {
            gm.ui.slotInv[2].setVisible(false);
        }
        if (hasPencil==0) {
            gm.ui.slotInv[3].setVisible(false);
        }
        if (hasCoin==1) {
            gm.ui.slotInv[1].setVisible(true);
        }
        if (hasCard==1) {
            gm.ui.slotInv[2].setVisible(true);
        }
        if (hasPencil==1) {
            gm.ui.slotInv[3].setVisible(true);
        }
        if (hasFone==0) {
            gm.ui.slotInv[4].setVisible(false);
        }
        if (hasFone==1) {
            gm.ui.slotInv[4].setVisible(true);}
    }
}
