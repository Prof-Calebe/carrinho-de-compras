package br.calebe.exemplos.ex02;

import br.calebe.exemplos.ex02.controller.ClasseFacadeController;
import junit.framework.Assert;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.powermock.api.easymock.PowerMock;
import org.powermock.core.classloader.annotations.PrepareForTest;
import org.powermock.modules.junit4.PowerMockRunner;

/**
 *
 * @author Calebe de Paula Bianchini
 */
@RunWith(PowerMockRunner.class)
@PrepareForTest({ClasseExemplo.class})
public class ClasseExemploTest {

    @Test
    public void executandoClasseExemplo() throws Exception {
        // 1a PARTE: Faz a gravação e configuração de como o teste acontecerá - RECORD
        // Cria o objeto Mock da classe ClasseExemploController
        ClasseFacadeController controllerMock = PowerMock.createMock(ClasseFacadeController.class);
        // Espera que toda instanciação dessa classe seja substituída pelo objeto mockado
        PowerMock.expectNew(ClasseFacadeController.class).andReturn(controllerMock);
        // E espera que a resposta pela chamada do método seja determinado
        EasyMock.expect(controllerMock.metodo(10)).andReturn("Resposta: 10");
        // "Executa" a configuração programada
        PowerMock.replay(controllerMock, ClasseFacadeController.class);
        
        // 2a PARTE: Executa o teste, de acordo com o que foi gravado - PLAY
        // Chama a classe - internamente, a classe mockada será utilizada
        ClasseExemplo tested = new ClasseExemplo();
        tested.run(10);
        
        // Faz a verificaçao agendada
        Assert.assertEquals("Resposta: 10", tested.getAnswer());
        
        // FINAL: Informa que os passos de execução se encerraram
        // Executa todas as verificação
        PowerMock.verifyAll();
    }
}
