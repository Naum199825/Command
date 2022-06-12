/*
 * Função:
 * Historico dos Comandos efetuados, ou seja, uma pilha para salvar tudo aquilo que foi feito
 * no editor, quando se usa o Crtl+Z, retira da pilha as coisas salvas do ultimo até o primeiro
 */
package br.edu.ifnmg.poo.command;

import java.util.Stack;

/**
 *
 * @author Naum
 */
public class HistoricoCommand {
    private Stack<Command> history = new Stack<>();

    public void push(Command c) {
        history.push(c);
    }

    public Command pop() {
        return history.pop();
    }

    public boolean isEmpty() { return history.isEmpty(); }
}