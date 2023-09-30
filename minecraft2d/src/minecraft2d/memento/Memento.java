package minecraft2d.memento;

public interface Memento {
    //Métodos
    int[] getTela();
    void setTela(int[] tela);
    int getPosAv();
    void setPosAv(int PosAv);
    int getPoseAv();
    void setPoseAv(int PoseAv);
    boolean getOlhandoDireita();
    void setOlhandoDireita(boolean OlhandoDireita);
}
