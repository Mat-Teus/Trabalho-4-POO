package minecraft2d.memento;

import java.util.Stack;

public class Caretaker {
   //Atributos
   private Stack<Memento> mementos = new Stack<>();//Pilha de mementos
   private int topo=-1;
    
    //Mementos
    public void saveState(Memento memento) {
        mementos.push(memento);
        topo++;
    }

    public Memento loadState() {
            return mementos.get(topo);
    }
    
    public Memento ResetMundo(){
            return mementos.get(0);
    }
}