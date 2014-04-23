package br.calebe.exemplos.ex02;

import br.calebe.exemplos.ex02.controller.ClasseFacadeController;

/**
 *
 * @author Calebe de Paula Bianchini
 */
public class ClasseExemplo {

    private ClasseFacadeController controller;
    private String answer;

    public ClasseExemplo() throws Exception {
        controller = new ClasseFacadeController();
    }

    public void run(int i) {
        answer = controller.metodo(i);
    }
    
    public String getAnswer() {
        return answer;
    }
}
