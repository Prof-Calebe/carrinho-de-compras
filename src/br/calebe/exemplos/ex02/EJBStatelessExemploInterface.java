package br.calebe.exemplos.ex02;

import javax.ejb.Remote;

/**
 *
 * @author Calebe de Paula Bianchini
 */
@Remote
public interface EJBStatelessExemploInterface {

    String metodo(int i);
}
