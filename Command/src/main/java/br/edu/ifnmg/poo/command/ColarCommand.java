/*
 * Função: 
 * Colar os dados Copiados ou Recortados na area do editor
 * 
 */
package br.edu.ifnmg.poo.command;

/**
 *
 * @author Naum
 */
public class ColarCommand extends Command {

    public ColarCommand(Editor editor) {
        super(editor);
    }
    
    // 
    @Override
    public boolean execute() {
        
        // Caso nada tenha salvo/copiado no clipboard, não retornará nada no Crtl+V/ Colar
        if (editor.clipboard == null || editor.clipboard.isEmpty()) return false; 
        // Caso tenha, backup recebera os dados selecionados
        backup();
        // ao salvar os dados no backup, pegas os dados do clipboard e insere na seguinte posição do editor
        editor.textField.insert(editor.clipboard, editor.textField.getCaretPosition());
        return true;
    }
}
