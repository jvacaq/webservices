package com.advance.ws.soap;

import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;

/**
 * Created by advance on 12/19/16.
 */
@WebService
@SOAPBinding(style = SOAPBinding.Style.RPC)
public interface HellowWorld {
    @WebMethod
    String sayHello(String name);
}
