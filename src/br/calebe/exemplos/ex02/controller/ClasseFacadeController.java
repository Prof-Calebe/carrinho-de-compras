package br.calebe.exemplos.ex02.controller;

import br.calebe.exemplos.ex02.EJBStatelessInterface;
import java.io.FileInputStream;
import java.util.Properties;
import javax.naming.InitialContext;

/**
 *
 * @author Calebe de Paula Bianchini
 */
public class ClasseFacadeController implements EJBStatelessInterface {

    private EJBStatelessInterface ejb;

    public ClasseFacadeController() throws Exception {
        Properties props = new Properties();
        props.load(new FileInputStream("jndi.properties"));
        InitialContext ctx = new InitialContext(props);
        ejb = (EJBStatelessInterface) ctx.lookup("ejb/EJBStatelessExemplo");
    }

    @Override
    public String metodo(int i) {
        return ejb.metodo(i);
    }
}
