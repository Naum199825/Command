/*
 * Função:
 * Copia os dados do editor ao seleciona-lo
 * 
 */
package br.edu.ifnmg.poo.command;

/**
 *
 * @author Naum
 */
public class CopiaCommand extends Command {

    public CopiaCommand(Editor editor) {
        super(editor);
    }

    // Utiliza um metodo cpliboard para receber um texto selecionado 
    // no campo de edição de texto para a copia
    @Override
    public boolean execute() {
        editor.clipboard = editor.textField.getSelectedText();
        return false;
    }
}