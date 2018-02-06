/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pack1;

import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.ejb.Stateless;

/**
 *
 * @author entrar
 */
@WebService(serviceName = "Calcular")
@Stateless()
public class Calcular {
    

    /**
     * This is a sample web service operation
     */
    @WebMethod(operationName = "hello")
    public String hello(@WebParam(name = "name") String txt) {
        return "Hello " + txt + " !";
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "sumar")
    public int sumar(@WebParam(name = "in1") int in1, @WebParam(name = "in2") int in2) {
        return in1+in2;
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "restar")
    public int restar(@WebParam(name = "in1") int in1, @WebParam(name = "in2") int in2) {
        //TODO write your implementation code here:
        return in1-in2;
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "multiplicar")
    public int multiplicar(@WebParam(name = "in1") int in1, @WebParam(name = "in2") int in2) {
        //TODO write your implementation code here:
        return in1*in2;
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "dividir")
    public int dividir(@WebParam(name = "in1") int in1, @WebParam(name = "in2") int in2) {
        //TODO write your implementation code here:
        return in1/in2;
    }
}
