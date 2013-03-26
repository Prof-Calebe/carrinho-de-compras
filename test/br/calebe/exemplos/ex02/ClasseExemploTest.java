package br.calebe.exemplos.ex02;

import br.calebe.exemplos.ex02.controller.ClasseExemploController;
import junit.framework.Assert;
import org.easymock.EasyMock;
import org.junit.Before;
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
@PrepareForTest({ClasseExemploController.class})
public class ClasseExemploTest {

    @Before
    public void before() throws Exception {
        ClasseExemploController controller = PowerMock.createMock(ClasseExemploController.class);
        PowerMock.expectNew(ClasseExemploController.class);
        EasyMock.expect(controller.metodo(10)).andReturn("Resposta: 10");
        PowerMock.replayAll();
    }

    @Test
    public void executandoClasseExemplo() throws Exception {
        ClasseExemplo e = new ClasseExemplo();
        e.run(10);
        Assert.assertEquals("Resposta: 10", e.getAnswer());
    }
}
