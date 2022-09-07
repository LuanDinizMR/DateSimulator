package Event;

import com.mycompany.jogovn.GameManager;

public class Event01 {
    GameManager gm;
    public Event01(GameManager gm){
        this.gm = gm;
    }
    //Robson
    public void falarR(){
        if(gm.player.hasPencil==0){
           gm.ui.text.setText("Robson, O Cambista:\nCoé quer comprar ingresso pra festa?\nDançar quadrilha? Eu até iria, mas perdi meu Lapís, to tendo que anotar as vendas com um giz de cera que eu achei\nSe vc achar pra mim eu vou com você\n Até agora a pouco quando eu tava na quadra eu tava com ele, não sei oque aconteceu."); 
        }
        else{
            gm.sc.finalRobson();
            gm.ui.text.setText("Ele fica muito grato por ter seu lápis de volta e vocês vão juntos a quadrilha, infelizmente ele para a cada 3 segundos para tentar vender ingressos de festa para alguem. Ao menos você conseguiu um par..."); 
        }
        
    }
    public void flertarR(){
        gm.ui.text.setText("Oi tchutchuca, quer comprar um ingresso?"); 
    }
    public void ofenderR(){
        gm.ui.text.setText("Oloko! Era só falar que não queria comprar o ingresso.");
    }
    //Arbusto
    public void falarArb(){
        gm.ui.text.setText("Arbusto:\n*Ele não responde*\nEstranho seria se ele respondesse...");
    } 
    public void olharArb(){
        if(gm.player.hasCoin==0){
           gm.ui.text.setText("Você olha no arbusto e embaixo dele encontra uma moeda estranha, a qual você não reconhece de qual valor ou país ela é."); 
           gm.player.hasCoin=1;
           gm.player.updateInventario();
        }
        else{
            gm.ui.text.setText("Você olha no arbusto e não vê nada além do esperado..."); 
        }
        
    }
    public void baterArb(){
        gm.ui.text.setText("*Algumas folhas caem do arbusto*");
    }
    //Samuel
    public void falarS(){
        if(gm.player.hasCoin==0){
           gm.ui.text.setText("Samuel, o valentão:\nTá olhando oque!?\nEu ir na quadrilha com você? Agora não dá tenho que achar aquele moleque, ele sumiu com minha moeda da sorte, tenho certeza que foi ele..."); 
        }
        else{
            gm.sc.finalSamuel();
            gm.ui.text.setText("Ao entregar a moeda ele diz:' Olha só você achou a *moedinha da sorte* , até que você não foi de toda inutil. Eu vou com você na porcaria do Arraial.'\nVocês vão ao arraial e o muita gente olha assutada para o belo casal que foi formado... Mas o que importa é que você tem um par."); 
        }
    }
    public void flertarS(){
        gm.ui.text.setText("Eu sei que todas querem um pouco de mim, mas agora eu to sem tempo pra melação."); 
    }
    public void ofenderS(){
        gm.ui.text.setText("*Ouch!*\nEle te da um peteleco\n$#@*&!");
    }
    //Rafael
     public void falarRa(){
        if(gm.player.hasCard==0){
            gm.ui.text.setText("Rafael, o Jogador de Vôlei:\nEu? Dançar quadrilha com você? Nem morto\n Sai pra lá escória, que eu tenho que pegar o meu... CADE MEU CARTÃO DE CRÉDITO!!\nRapido cadelinha me ajuda a achar ele! Ele tava por aqui... Ou será que ta na sala de aula..."); 
        }
        else{
            gm.sc.finalRafa();
            gm.ui.text.setText("Ao entregar a carteira ele diz: 'Olha você achou meu carttão... Espero que não tenha usado pra comprar nada...\nMas bom como você me ajudou acho que posso ir ao arraial com você, mas não me encosta.'\n Vocês vão ao arraial porem na hora da dança, ele te olha estranho toda vez que você encosta nele, mesmo sem querer... mas bom ao menos você tem um par."); 
        }
        
    }
    public void flertarRa(){
        gm.ui.text.setText("Se enxerga, sou areia demais pro seu caminhãozinho."); 
    }
    public void ofenderRa(){
        gm.ui.text.setText("*Ele te ignora C O M P L E T A M E N T E*");
    }
    //Lucas
    public void falarL(){
        if(gm.player.hasCoin==0){
           gm.ui.text.setText("Lucas, o Nerdola:\nAHH! Ufa achei que fosse o Samuel ele ta me perseguindo desde a entrada, ele tava olhando perto de um arbusto e Falou:'Você que pegou minha moeda da sorte né nerdola?' e começou a me perseguir.\nOlha...Acho que não é a melhor hora pra falar de quadrilha, mas se você me trazer a moeda daquelo troglodita eu me livro dele e vou com você."); 
        }
        else{
            gm.sc.finalLucas();
            gm.ui.text.setText("Ao devolver a moeda ele diz: 'Olha você achou a moeda, vou devolver pra ele, ai ele vai parar de correr atrás de mim e vamos poder ir ao arraial'.\nVocê escuta uns barulhos vndos do corredor e ele volta com um olho roxo.\n Porêm você vai para o arraial com ele, e acaba se divertindo muito, parece que ao final das contas ele tinha um bom coração."); 
        }
        
    }
    public void flertarL(){
        gm.ui.text.setText("Q...QuE...Quem? Eu?"); 
    }
    public void ofenderL(){
        gm.ui.text.setText("Só não me bate...\n*Ele se encolhe*");
    }
    //Cartão
    public void pegarCartao(){
        if(gm.player.hasCard==0){
           gm.ui.text.setText("Você Pega o cartão"); 
           gm.player.hasCard=1;
           gm.player.updateInventario();
        }
        else{
            gm.ui.text.setText("Você olha para mesa e lhe vem a mente aquele cartão que você pegou, até parece que ele ainda está lá, você tenta pega-lo mas falha miseravelmente.\nVocê vê algumas pessoas olhando torto para você."); 
        }
    }
    public void falarCartao(){
        gm.ui.text.setText("Cartão:\n*Ele não responde*\nAlgumas pessoas da sala te olham de canto de olho...\nVocê escuta alguem sussurando:'Que garota estranha'.");
    } 
    public void olharCartao(){
        if(gm.player.hasCard==0){
           gm.ui.text.setText("Você vê um cartão com o nome 'Rafael' Escrito nele."); 
        }
        else{
            gm.ui.text.setText("Você olha para mesa e lhe vem a mente aquele cartão que você pegou, até parece que ele ainda está lá, mas deve ser apenas uma brincadeira da sua mente diante de tanto desespero para conseguir um par."); 
        }
    } 
    public void olharBola(){
        if(gm.player.hasPencil==0){
           gm.ui.text.setText("Você vê uma bola furada, você analisa para ver onde é o furo e encontra um lápis. Você o Pega."); 
           gm.player.hasPencil=1;
           gm.player.updateInventario();
        }
        else{
            gm.ui.text.setText("Você olha para a bola furada e não vê mais nada de interessante nela."); 
        }
    }
    public void falarBola(){
        gm.ui.text.setText("Bola Furada:\n*Ela não responde*\nUm aluno passando perto diz 'Não adianta essa aí naõ está mais entre nós', ele faz uma reverência a bola e sai.");
    } 
    public void chutarBola(){
        if(gm.player.hasPencil==0){
           gm.ui.text.setText("Você chuta a bola e sente algo espetar seu pé.\n*Doi muito*"); 
        }
        else{
            gm.ui.text.setText("Você chuta a bola e ela se arrasta um pouco e para totalmente vazia agora."); 
        }
    }
}
