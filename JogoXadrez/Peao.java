
/**
 * Escreva a descrição da classe Peao aqui.
 * 
 * @author (seu nome) 
 * @version (número de versão ou data)
 */
public class Peao extends Peca
{
    private int direcao;
    private boolean primeiroMovimento;
    /**
     * Construtor para objetos da classe Peao
     */
    public Peao(Casa casa, int tipo)
    {
        super(casa, tipo);
        this.casa = casa;
        if(tipo == PEAO_BRANCO) {
            direcao = 1;
        }
        else if(tipo == PEAO_PRETO){
            direcao = -1;
        }
        primeiroMovimento = true;
    }
    
    /**
     * Movimenta o Peão para uma nova casa
     * @param destino nova casa que irá conter o Peão
     */
    public void mover(Casa destino){
        //if - Verifica se o primeiroMovimento é verdadeiro e se o destino possui peça
        //else if - Se o primeiroMovimento é falso então o peão só anda uma casa
        if(primeiroMovimento && !destino.possuiPeca()){
            //if - verifica se o peão é branco e se o movimento é apenas para cima
            //else if - verifica se o peão é preto e se o movimento é apenas para baixo
            if(tipo == PEAO_BRANCO && (casa.getX() == destino.getX() && (casa.getY()+2 == destino.getY() || casa.getY()+1 == destino.getY()))){
              super.mover(destino);   
               primeiroMovimento = false;
            }
            else if(tipo == PEAO_PRETO && (casa.getX() == destino.getX() && (casa.getY()-2 == destino.getY() || casa.getY()-1 == destino.getY()))){
               super.mover(destino);   
               primeiroMovimento = false;
            }
        }
        else if(!primeiroMovimento && !destino.possuiPeca()){
            if(casa.getX() == destino.getX() && (casa.getY()+direcao == destino.getY())){
                super.mover(destino);  
            }
        }
    }
    
    /**
     * Faz a captura de uma peça 
     * @param destino casa que contém a peça e nova casa que irá conter o peão
     */
    public void capturar(Casa destino){
        //movimento nas diagonais, mais a direção no Y para não capturar para trás
        if((casa.getX()+1 == destino.getX() || casa.getX()-1 == destino.getX()) && casa.getY()+direcao == destino.getY()){
                    super.capturar(destino);   
        }
    }
    
}
