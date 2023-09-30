package minecraft2d;

import minecraft2d.view.Janela;

public class Main {
    /*O padrão de projeto memento é do tipo comportamental e permite que você salve e restaure os estados.
    Descrição:o padrão memento consiste em alguns componentes principais:
    Originator:Nesse caso é a classe janela que é o objeto que desejamos capturar os estados
    Memento e ConcreteMemento: o memento é uma interface com os métodos padrões que serão implementados
    na classe ConcreteMemento que vai armazenar o estsado interno que desejamos salvar
    Caretaker:é quem vai guardar e restaurar os mementos que fizermos
    
    O uso desse padrão é principalmente utilizado quando estamos falando de aplicações que precisam do famoso:
    "CTRL Z", ou seja, voltar a um estado anterior.
    
    Eu escolhi aplicar esse padrão no minecraft 2d pois agora o jogo tem a função de salvar, então, quando o
    usuário clicar S, ele salva um estado e ao clicar backspace ele volta ao estado salvo, literalmente funcionando
    como um save_state de emuladores.
    
    Além disso, um problema nesse código era que se você mexesse muito no mundo, clocando blocosl, você teria que
    apagar manualmente, agora, no ínicio o memento é aplicadp, então caso queira resetar o mundo, apenas clique em R
    No saldo, agora o jogador pode salvar manualmente seus estados ou apenas clicar em  R
    */

    public static void main(String[] args) {
        new Janela();
    }   
}
