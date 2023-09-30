package minecraft2d.memento;

import java.util.Stack;

public class Caretaker {
   //Atributos
   private Stack<Memento> mementos = new Stack<>();//Pilha de mementos
   private int topo=-1;

    public void saveState(Memento memento) {
        mementos.push(memento);
        topo++;
    }

    public Memento loadState() {
        if (!mementos.isEmpty()) {
            return mementos.get(topo);
        }
        return null;
    }
}