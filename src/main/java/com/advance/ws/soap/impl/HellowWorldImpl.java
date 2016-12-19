package com.advance.ws.soap.impl;

import com.advance.ws.soap.HellowWorld;

import javax.jws.WebService;

/**
 * Created by advance on 12/19/16.
 */
@WebService(endpointInterface = "com.advance.ws.soap.HellowWorld")
public class HellowWorldImpl implements HellowWorld {
    public String sayHello(String name) {
        return "Hola chugcha madre " + name;
    }
}
