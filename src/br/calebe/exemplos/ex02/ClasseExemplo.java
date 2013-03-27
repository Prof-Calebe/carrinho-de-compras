package br.calebe.exemplos.ex02;

import br.calebe.exemplos.ex02.controller.ClasseExemploController;

/**
 *
 * @author Calebe de Paula Bianchini
 */
public class ClasseExemplo {

    private ClasseExemploController controller;
    private String answer;

    public ClasseExemplo() throws Exception {
        controller = new ClasseExemploController();
    }

    public void run(int i) {
        answer = controller.metodo(i);
    }
    
    public String getAnswer() {
        return answer;
    }
}
