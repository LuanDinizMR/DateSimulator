package com.mycompany.jogovn;

public class SceneChanger {
    GameManager gm;
    int i = 0;

    public SceneChanger(GameManager gm) {
        this.gm = gm;
    }
    public void showMenu(){
        gm.ui.bgPanel[11].setVisible(false);
        gm.ui.bgPanel[10].setVisible(false);
        gm.ui.bgPanel[9].setVisible(false);
        gm.ui.bgPanel[8].setVisible(false);
        gm.ui.bgPanel[7].setVisible(false);
        gm.ui.bgPanel[6].setVisible(false);
        gm.ui.bgPanel[5].setVisible(false);
        gm.ui.bgPanel[3].setVisible(false);
        gm.ui.bgPanel[1].setVisible(false);
        gm.ui.bgPanel[2].setVisible(false);
        gm.ui.bgPanel[0].setVisible(true);
        gm.ui.bgPanel[4].setVisible(false);
        gm.ui.text.setText("Daqui a 30 minutos é a quadrilha e você não tem ninguem para dançar!\nVocê precisa achar um parceiro ou todos rirão de você!");
        
    }
    public void showScene1(){
        i +=1;
        gm.ui.bgPanel[11].setVisible(false);
        gm.ui.bgPanel[10].setVisible(false);
        gm.ui.bgPanel[9].setVisible(false);
        gm.ui.bgPanel[8].setVisible(false);
        gm.ui.bgPanel[7].setVisible(false);
        gm.ui.bgPanel[6].setVisible(false);
        gm.ui.bgPanel[5].setVisible(false);
        gm.ui.bgPanel[4].setVisible(false);
        gm.ui.bgPanel[3].setVisible(false);
        gm.ui.bgPanel[1].setVisible(true);
        gm.ui.bgPanel[2].setVisible(false);
        gm.ui.bgPanel[0].setVisible(false);
        gm.ui.text.setText("Você ve um galante rapaz na entrada da escola, segurando mexendo no celular e tentando chamar a atenção de algumas pessoas\nTalvez ele de um bom par.");
    }
    public void showScene2(){
        i +=1;
        gm.ui.bgPanel[11].setVisible(false);
        gm.ui.bgPanel[10].setVisible(false);
        gm.ui.bgPanel[9].setVisible(false);
        gm.ui.bgPanel[8].setVisible(false);
        gm.ui.bgPanel[7].setVisible(false);
        gm.ui.bgPanel[6].setVisible(false);
        gm.ui.bgPanel[5].setVisible(false);
        gm.ui.bgPanel[4].setVisible(false);
        gm.ui.bgPanel[3].setVisible(false);
        gm.ui.bgPanel[1].setVisible(false);
        gm.ui.bgPanel[2].setVisible(true);
        gm.ui.bgPanel[0].setVisible(false);
        gm.ui.text.setText("Você vê um rapaz na quadra utilizando uma camisa de vôlei, quem sabe ele não aceite ser seu par.");

    }
    public void showScene3(){
        i +=1;
        gm.ui.bgPanel[11].setVisible(false);
        gm.ui.bgPanel[10].setVisible(false);
        gm.ui.bgPanel[9].setVisible(false);
        gm.ui.bgPanel[8].setVisible(false);
        gm.ui.bgPanel[7].setVisible(false);
        gm.ui.bgPanel[6].setVisible(false);
        gm.ui.bgPanel[5].setVisible(false);
        gm.ui.bgPanel[4].setVisible(false);
        gm.ui.bgPanel[1].setVisible(false);
        gm.ui.bgPanel[3].setVisible(true);
        gm.ui.bgPanel[2].setVisible(false);
        gm.ui.bgPanel[0].setVisible(false);
        gm.ui.text.setText("Ao caminho da sala de aula, ao passar pelos corredores você se depara com a cena de um garoto dando um cuecão em outro o botando para corer. De uma coisa você sabe, ninguem deve tê lo convidado para o arraial");

    }
    public void showScene4(){
        i +=1;
        gm.ui.bgPanel[11].setVisible(false);
        gm.ui.bgPanel[10].setVisible(false);
        gm.ui.bgPanel[9].setVisible(false);
        gm.ui.bgPanel[8].setVisible(false);
        gm.ui.bgPanel[7].setVisible(false);
        gm.ui.bgPanel[6].setVisible(false);
        gm.ui.bgPanel[5].setVisible(false);
        gm.ui.bgPanel[3].setVisible(false);
        gm.ui.bgPanel[1].setVisible(false);
        gm.ui.bgPanel[4].setVisible(true);
        gm.ui.bgPanel[2].setVisible(false);
        gm.ui.bgPanel[0].setVisible(false);
        gm.ui.text.setText("Você ve um garoto tentando se esconder na sala. Nem você sabe se é uma boa ideia chama-lo para o arraial, talvez zombem mais de você por ir com ele doque por não ir com ninguem.");

    }
    //FinalRobson
    public void finalRobson(){
        gm.ui.bgPanel[11].setVisible(false);
        gm.ui.bgPanel[10].setVisible(false);
        gm.ui.bgPanel[9].setVisible(false);
        gm.ui.bgPanel[8].setVisible(false);
        gm.ui.bgPanel[7].setVisible(false);
        gm.ui.bgPanel[6].setVisible(true);
        gm.ui.bgPanel[4].setVisible(false);
        gm.ui.bgPanel[3].setVisible(false);
        gm.ui.bgPanel[1].setVisible(false);
        gm.ui.bgPanel[2].setVisible(false);
        gm.ui.bgPanel[0].setVisible(false);
        gm.ui.bgPanel[5].setVisible(false);
    }
    //final Rafa
    public void finalRafa(){
        gm.ui.bgPanel[11].setVisible(false);
        gm.ui.bgPanel[10].setVisible(false);
        gm.ui.bgPanel[9].setVisible(false);
        gm.ui.bgPanel[8].setVisible(false);
        gm.ui.bgPanel[7].setVisible(true);
        gm.ui.bgPanel[6].setVisible(false);
        gm.ui.bgPanel[4].setVisible(false);
        gm.ui.bgPanel[3].setVisible(false);
        gm.ui.bgPanel[1].setVisible(false);
        gm.ui.bgPanel[2].setVisible(false);
        gm.ui.bgPanel[0].setVisible(false);
        gm.ui.bgPanel[5].setVisible(false);
    }
    public void finalLucas(){
        gm.ui.bgPanel[11].setVisible(false);
        gm.ui.bgPanel[10].setVisible(false);
        gm.ui.bgPanel[9].setVisible(false);
        gm.ui.bgPanel[8].setVisible(true);
        gm.ui.bgPanel[7].setVisible(false);
        gm.ui.bgPanel[6].setVisible(false);
        gm.ui.bgPanel[4].setVisible(false);
        gm.ui.bgPanel[3].setVisible(false);
        gm.ui.bgPanel[1].setVisible(false);
        gm.ui.bgPanel[2].setVisible(false);
        gm.ui.bgPanel[0].setVisible(false);
        gm.ui.bgPanel[5].setVisible(false);
    }
    public void finalSamuel(){
        gm.ui.bgPanel[11].setVisible(false);
        gm.ui.bgPanel[10].setVisible(false);
        gm.ui.bgPanel[9].setVisible(true);
        gm.ui.bgPanel[8].setVisible(false);
        gm.ui.bgPanel[7].setVisible(false);
        gm.ui.bgPanel[6].setVisible(false);
        gm.ui.bgPanel[4].setVisible(false);
        gm.ui.bgPanel[3].setVisible(false);
        gm.ui.bgPanel[1].setVisible(false);
        gm.ui.bgPanel[2].setVisible(false);
        gm.ui.bgPanel[0].setVisible(false);
        gm.ui.bgPanel[5].setVisible(false);
    }

    public void badEnding1(){
        gm.ui.bgPanel[11].setVisible(false);
        gm.ui.bgPanel[10].setVisible(false);
        gm.ui.bgPanel[9].setVisible(false);
        gm.ui.bgPanel[8].setVisible(false);
        gm.ui.bgPanel[7].setVisible(false);
        gm.ui.bgPanel[6].setVisible(false);
        gm.ui.bgPanel[4].setVisible(false);
        gm.ui.bgPanel[3].setVisible(false);
        gm.ui.bgPanel[1].setVisible(false);
        gm.ui.bgPanel[2].setVisible(false);
        gm.ui.bgPanel[0].setVisible(false);
        gm.ui.bgPanel[5].setVisible(true);
        gm.ui.text.setText("Quem muito procura pouco acha:\nVocê perdeu muito tempo passeando pelo colégio e não achou um par...");
    }
    //Tutorial
    public void tutorial(){
        gm.ui.bgPanel[11].setVisible(false);
        gm.ui.bgPanel[10].setVisible(true);
        gm.ui.bgPanel[9].setVisible(false);
        gm.ui.bgPanel[8].setVisible(false);
        gm.ui.bgPanel[7].setVisible(false);
        gm.ui.bgPanel[6].setVisible(false);
        gm.ui.bgPanel[4].setVisible(false);
        gm.ui.bgPanel[3].setVisible(false);
        gm.ui.bgPanel[1].setVisible(false);
        gm.ui.bgPanel[2].setVisible(false);
        gm.ui.bgPanel[0].setVisible(false);
        gm.ui.bgPanel[5].setVisible(false);
        gm.ui.text.setText("Descrições e falas aparecerão aqui.");
    }
    //Créditos
    public void creditos(){
        gm.ui.bgPanel[11].setVisible(true);
        gm.ui.bgPanel[10].setVisible(false);
        gm.ui.bgPanel[9].setVisible(false);
        gm.ui.bgPanel[8].setVisible(false);
        gm.ui.bgPanel[7].setVisible(false);
        gm.ui.bgPanel[6].setVisible(false);
        gm.ui.bgPanel[4].setVisible(false);
        gm.ui.bgPanel[3].setVisible(false);
        gm.ui.bgPanel[1].setVisible(false);
        gm.ui.bgPanel[2].setVisible(false);
        gm.ui.bgPanel[0].setVisible(false);
        gm.ui.bgPanel[5].setVisible(false);
        gm.ui.text.setText("");
    }
    
}
