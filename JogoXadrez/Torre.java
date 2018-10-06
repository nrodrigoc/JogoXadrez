
/**
 * Escreva a descrição da classe Torre aqui.
 * 
 * @author (seu nome) 
 * @version (número de versão ou data)
 */
public class Torre extends Peca
{
    private boolean primeiroMovimento = false;
    /**
     * Construtor para objetos da classe Torre
     */
    public Torre(Casa casa, int tipo)
    {
        super(casa, tipo);
        primeiroMovimento = false;
    }

    public void movimento(Casa destino){
        //if - movimentação para cima e para baixo
        //else if - movimentação para os lados;
        if(casa.getX() == destino.getX() && (casa.getY()+1 == destino.getY() || casa.getY()-1 == destino.getY() || casa.getY()+2 == destino.getY() || 
            casa.getY()-2 == destino.getY() || casa.getY()+3 == destino.getY() || casa.getY()-3 == destino.getY() || casa.getY()+4 == destino.getY() || 
            casa.getY()-4 == destino.getY() || casa.getY()+5 == destino.getY() || casa.getY()-5 == destino.getY() || casa.getY()+6 == destino.getY() || 
            casa.getY()-6 == destino.getY() || casa.getY()+7 == destino.getY() || casa.getY()-7 == destino.getY())){
            super.mover(destino);
            primeiroMovimento = true;
            return;
        }
        else if(casa.getY() == destino.getY() && (casa.getX()+1 == destino.getX() || casa.getX()-1 == destino.getX() || casa.getX()+2 == destino.getX() || 
                 casa.getX()-2 == destino.getX() || casa.getX()+3 == destino.getX() || casa.getX()-3 == destino.getX() || casa.getX()+4 == destino.getX() || 
                 casa.getX()-4 == destino.getX() || casa.getX()+5 == destino.getX() || casa.getX()-5 == destino.getX() || casa.getX()+6 == destino.getX() || 
                 casa.getX()-6 == destino.getX() || casa.getX()+7 == destino.getX() || casa.getX()-7 == destino.getX())){
                super.mover(destino);
                primeiroMovimento = true;
        }
    }
    
    public void capturar(Casa destino){
        if(casa.getX() == destino.getX() && (casa.getY()+1 == destino.getY() || casa.getY()-1 == destino.getY() || casa.getY()+2 == destino.getY() || 
            casa.getY()-2 == destino.getY() || casa.getY()+3 == destino.getY() || casa.getY()-3 == destino.getY() || casa.getY()+4 == destino.getY() || 
            casa.getY()-4 == destino.getY() || casa.getY()+5 == destino.getY() || casa.getY()-5 == destino.getY() || casa.getY()+6 == destino.getY() || 
            casa.getY()-6 == destino.getY() || casa.getY()+7 == destino.getY() || casa.getY()-7 == destino.getY())){
                super.capturar(destino);
                primeiroMovimento = true;
        }
        else if(casa.getY() == destino.getY() && (casa.getX()+1 == destino.getX() || casa.getX()-1 == destino.getX() || casa.getX()+2 == destino.getX() || 
            casa.getX()-2 == destino.getX() || casa.getX()+3 == destino.getX() || casa.getX()-3 == destino.getX() || casa.getX()+4 == destino.getX() || 
            casa.getX()-4 == destino.getX() || casa.getX()+5 == destino.getX() || casa.getX()-5 == destino.getX() || casa.getX()+6 == destino.getX() || 
            casa.getX()-6 == destino.getX() || casa.getX()+7 == destino.getX() || casa.getX()-7 == destino.getX())){
                super.capturar(destino);
                primeiroMovimento = true;
        }
    }
}
