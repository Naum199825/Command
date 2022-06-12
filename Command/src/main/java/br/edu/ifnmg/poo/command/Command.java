


/*
    Command Base Abstract
*/
package br.edu.ifnmg.poo.command;

/**
 *
 * @author Naum
 */

public abstract class Command {
    public Editor editor;
    private String backup;

    Command(Editor editor) {
        this.editor = editor;
    }

    
    // Copia dos dados dos campos de texto e envia para uma String Backup, 
    // ou seja, pega os caracteres do campo de texto 
    void backup() {
        backup = editor.textField.getText();    
    }
    
    // undo serve para pegar os dados salvos e coloca-los no campo de texto
    public void undo() {
        editor.textField.setText(backup);
    }
    
    // Método abstrato para que os filhos sobrescrevam para realizar suas funções
    public abstract boolean execute();
}