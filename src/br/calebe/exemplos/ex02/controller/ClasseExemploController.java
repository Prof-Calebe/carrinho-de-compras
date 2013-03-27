package br.calebe.exemplos.ex02.controller;

import br.calebe.exemplos.ex02.EJBStatelessExemploInterface;
import java.io.FileInputStream;
import java.util.Properties;
import javax.naming.InitialContext;

/**
 *
 * @author Calebe de Paula Bianchini
 */
public class ClasseExemploController implements EJBStatelessExemploInterface {

    private EJBStatelessExemploInterface ejb;

    public ClasseExemploController() throws Exception {
        Properties props = new Properties();
        props.load(new FileInputStream("jndi.properties"));
        InitialContext ctx = new InitialContext(props);
        ejb = (EJBStatelessExemploInterface) ctx.lookup("ejb/EJBStatelessExemplo");
    }

    @Override
    public String metodo(int i) {
        return ejb.metodo(i);
    }
}
