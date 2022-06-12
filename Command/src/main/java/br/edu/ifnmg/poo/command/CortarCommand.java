/*
 * Função:
 * Recorta os dados selecionados do editor
 * 
 */
package br.edu.ifnmg.poo.command;

/**
 *
 * @author Naum
 */
public class CortarCommand extends Command {

    public CortarCommand(Editor editor) {
        super(editor);
    }

    @Override
    public boolean execute() {
        // Se não houver nada recortado, retorna falso, ou seja, verifica se houve algo selecionado
        if (editor.textField.getSelectedText().isEmpty()) return false;
        backup();
        // coloca o texto pego do campo de texto e coloca em uma variavel local source
        String source = editor.textField.getText();
        // clipboard recebe o texto selecionado
        editor.clipboard = editor.textField.getSelectedText();
        // e o texto selecionado é tirado do editor
        editor.textField.setText(CortarString(source));
        return true;
    }
    
    //Serve para tirar a string selecionada 
    private String CortarString(String source) {
        String start = source.substring(0, editor.textField.getSelectionStart());
        String end = source.substring(editor.textField.getSelectionEnd());
        return start + end;
    }
}
