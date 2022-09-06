package com.mycompany.jogovn;

import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JPopupMenu;
import javax.swing.JTextArea;
import javax.swing.SwingUtilities;


public class UI {
    GameManager gm;
    JFrame window;
    public JTextArea text;
    public JPanel bgPanel[] = new JPanel[20];
    public JLabel bgLabel[] = new JLabel[20];
    //player
    JPanel painelInv;
    JLabel slotInv[] = new JLabel[11];
    
    
    public UI(GameManager gm) {
        this.gm = gm;
        creatMainField();
        creatPlayerField();
        generateScene();
        
        window.setVisible(true);    
    }
    public void creatMainField(){
        window = new JFrame();
        window.setName("Um par para a quadrilha");
        window.setSize(800,750);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.getContentPane().setBackground(Color.black);
        window.setLocationRelativeTo(null);
        window.setLayout(null);
        text = new JTextArea("Daqui a 30 minutos é a quadrilha e você não tem ninguem para dançar!\nVocê precisa achar um parceiro ou todos rirão de você!");
        text.setBounds(50,410,700,400);
        text.setBackground(Color.black);
        text.setForeground(Color.white);
        text.setEditable(false);
        text.setLineWrap(true);
        text.setWrapStyleWord(true);
        text.setFont(new Font("Book Antiqua",Font.PLAIN, 26));
        window.add(text);
    }
    public void creatBG(int bgNum, String bgFile){
        bgPanel[bgNum] = new JPanel();
        bgPanel[bgNum].setBounds(50,50,700,350);
        bgPanel[bgNum].setLayout(null);
        window.add(bgPanel[bgNum]);
        bgLabel[bgNum] = new JLabel();
        bgLabel[bgNum].setBounds(0,0,700,350);  //Servirá para colocar a imagem
        ImageIcon bgIcon = new ImageIcon(bgFile);
        bgLabel[bgNum].setIcon(bgIcon);

    }
    public void creatObj(int bgNum, int objx,int objy, int objWhidth, int objHeight, String objFile,
         String ch1, String ch2, String ch3, String ch1C, String ch2C, String ch3C){
        //Criar PopMenu
        JPopupMenu popMenu = new JPopupMenu() ;
        //Criar os itens do menu
        JMenuItem menuItem[] = new JMenuItem[4]; 
        menuItem[1] = new JMenuItem(ch1);
        menuItem[1].addActionListener(gm.aHandler);
        menuItem[1].setActionCommand(ch1C);
        popMenu.add(menuItem[1]);
        
        menuItem[2] = new JMenuItem(ch2);
        menuItem[2].addActionListener(gm.aHandler);
        menuItem[2].setActionCommand(ch2C);
        popMenu.add(menuItem[2]);
        
        menuItem[3] = new JMenuItem(ch3);
        menuItem[3].addActionListener(gm.aHandler);
        menuItem[3].setActionCommand(ch3C);
        popMenu.add(menuItem[3]);
        //Criação dos objetos
        JLabel objLabel = new JLabel();
 //       objLabel.setOpaque(true);
 //       objLabel.setBackground(Color.red);
        objLabel.setBounds(objx, objy, objWhidth, objHeight);
        ImageIcon objIcon = new ImageIcon(objFile);
        objLabel.setIcon(objIcon);
        
        objLabel.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
            }
            @Override
            public void mousePressed(MouseEvent e) {
                if(SwingUtilities.isRightMouseButton(e)){
                    popMenu.show(objLabel, e.getX(), e.getY());
                }
            }
            @Override
            public void mouseReleased(MouseEvent e) {
            }
            @Override
            public void mouseEntered(MouseEvent e) {
            }
            @Override
            public void mouseExited(MouseEvent e) {
            }
        });
        
        bgPanel[bgNum].add(objLabel);
        
        }
    public void creatArrow(int bgNum, int x,int y, int whidth, int height, String end, String comand){
        ImageIcon arrowIcon = new ImageIcon(end);
        JButton arrowButton = new JButton();
        arrowButton.setBounds(x,y,whidth,height);
        arrowButton.setBackground(null);
        arrowButton.setContentAreaFilled(false);
        arrowButton.setFocusPainted(false);
        arrowButton.setIcon(arrowIcon);
        arrowButton.addActionListener(gm.aHandler);
        arrowButton.setActionCommand(comand);
        arrowButton.setBorderPainted(false);
        
        bgPanel[bgNum].add(arrowButton);
    }
    public void creatPlayerField(){
        painelInv = new JPanel();
        painelInv.setBounds(50,0,250,50);
        painelInv.setBackground(Color.black);
        painelInv.setLayout(new GridLayout(1,5));
        window.add(painelInv);
        
        
        
    //Itens
    ImageIcon coin = new ImageIcon("rez\\coin.png");
    slotInv[1] = new JLabel();
    slotInv[1].setIcon(coin);
    painelInv.add(slotInv[1]);
    
    ImageIcon cartao = new ImageIcon("rez\\cartao.png");
    slotInv[2] = new JLabel();
    slotInv[2].setIcon(cartao);
    painelInv.add(slotInv[2]);
    
    ImageIcon lapis = new ImageIcon("rez\\pencil.png");
    slotInv[3] = new JLabel();
    slotInv[3].setIcon(lapis);
    painelInv.add(slotInv[3]);
    
    ImageIcon fone = new ImageIcon("rez\\headphone.png");
    slotInv[4] = new JLabel();
    slotInv[4].setIcon(fone);
    painelInv.add(slotInv[4]);

    }
    
    public void generateScene(){
        //Menu
        creatBG(0, "rez\\menu.png");
        creatArrow(0,300,200,100,42,"rez\\Jogar.png","goEnt");
        creatArrow(0,300,250,100,42,"rez\\comj.png", "inst");
        creatArrow(0,300,300,100,42,"rez\\cred.png", "cred");
        bgPanel[0].add(bgLabel[0]);
        
        // Entrada
        creatBG(1, "rez\\c1.jpg");
        creatObj(1,200, 150, 200, 200, "rez\\p2.png","Conversar","Flertar", "Ofender","falarR", "flertarR","ofenderR");
        creatObj(1,30, 200, 80, 60, "rez\\Blank.png","Falar","Olhar", "Bater","falarArb", "olharArb","baterArb");
        creatArrow(1,100,120,60,60,"rez\\esq.png","goQuadra");
        creatArrow(1,550,150,60,60,"rez\\up.png", "goCorredor");
        //creatArrow(1,0,290,60,60,"rez\\esq.png","goJardim");
        bgPanel[1].add(bgLabel[1]);
        
        
        //Quadra
        
        creatBG(2, "rez\\c2.jpg");
        creatObj(2,200, -50, 225, 400, "rez\\ra.png","Conversar","Flertar", "Ofender","falarRa", "flertarRa","ofenderRa");
        creatObj(2,510, 280, 50, 50, "rez\\bola.png","Chutar","Olhar", "Falar","chutarBola", "olharBola","falarBola");
        creatArrow(2,0,150,70,70,"rez\\esq.png","goEnt");
        bgPanel[2].add(bgLabel[2]);
        
    //Corredor
        creatBG(3, "rez\\corredor.jpg");
        creatObj(3,100, -120, 400, 600, "rez\\p32.png","Conversar","Flertar", "Ofender","falarS", "flertarS","ofenderS");
        creatArrow(3,500,150,70,70,"rez\\dir.png","goSala");
        creatArrow(3,0,150,70,70,"rez\\esq.png","goEnt");
        bgPanel[3].add(bgLabel[3]);
        
        //Sala
        creatBG(4, "rez\\c3.jpg");
        creatObj(4,200, 100, 250, 300, "rez\\lucas.png","Conversar","Flertar", "Ofender","falarL", "flertarL","ofenderL");
        creatObj(4,510, 280, 35, 35, "rez\\cartao.png","Olhar","Conversar", "Pegar","olharCartao", "falarCartao","pegarCartao");
        creatArrow(4,50,150,70,70,"rez\\esq.png","goCorredor");
        bgPanel[4].add(bgLabel[4]);
        //bad ending
        creatBG(5,"rez\\badEnd.jpg");
        bgPanel[5].add(bgLabel[5]);
        //Ending Robson
        creatBG(6,"rez\\fimRobson.jpeg");
        bgPanel[6].add(bgLabel[6]);
        //Ending Rafael
        creatBG(7,"rez\\fimRafa.jpeg");
        bgPanel[7].add(bgLabel[7]);
        //Ending Lucas
        creatBG(8,"rez\\fimLucas.jpeg");
        bgPanel[8].add(bgLabel[8]);
        //Ending Samuel
        creatBG(9,"rez\\fimSamuel.jpeg");
        bgPanel[9].add(bgLabel[9]);
        //Como Jogar
        creatBG(10,"rez\\tutorial.png");
        creatArrow(10,0,-5,40,40,"rez\\esq2.png","goMenu");
        bgPanel[10].add(bgLabel[10]);
        //Créditos
        creatBG(11,"rez\\creditos.png");
        creatArrow(11,0,-5,40,40,"rez\\esq2.png","goMenu");
        bgPanel[11].add(bgLabel[11]);
    }
}
