package com.advance.client;

import com.advance.ws.soap.HellowWorld;

import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import java.net.MalformedURLException;
import java.net.URL;

/**
 * Created by advance on 12/19/16.
 */
public class HellowWorldClient {
    public static void main(String [] a) throws MalformedURLException {
        URL url = new URL("http://localhost:9999/soap-ws/hello?wsdl");
        QName qname = new QName("http://impl.soap.ws.advance.com/","HellowWorldImplService");
        Service service = Service.create(url, qname);
        HellowWorld hello = service.getPort(HellowWorld.class);

        System.out.println(hello.sayHello("Soap puto"));
    }
}
