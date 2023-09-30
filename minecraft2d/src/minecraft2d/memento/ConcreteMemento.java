package minecraft2d.memento;

public class ConcreteMemento implements Memento {
    //Atributos
    private int[] tela;
    private int posAv,PoseAv;
    private boolean olhandoDireita;

    //Construtor
    public ConcreteMemento(int[] tela, int posAv, int PoseAv, boolean olhandoDireita) {
        this.tela=tela;
        this.posAv=posAv;
        this.PoseAv=PoseAv;
        this.olhandoDireita=olhandoDireita;
    }

    //Métodos memento
    @Override
    public int[] getTela() {
       return tela; 
    }

    @Override
    public void setTela(int[] tela) {
        this.tela=tela;
    }
    
    @Override
    public int getPosAv(){
        return posAv;
    }

    @Override
    public void setPosAv(int posAv){
        this.posAv = posAv;
    }

    @Override
    public int getPoseAv() {
        return PoseAv;
    }

    @Override
    public void setPoseAv(int PoseAv) {
        this.PoseAv = PoseAv;
    }
    
    @Override
    public boolean getOlhandoDireita(){
        return olhandoDireita;
    }
    
    @Override
    public void setOlhandoDireita(boolean OlhandoDireita){
        this.olhandoDireita = OlhandoDireita;
    }
}