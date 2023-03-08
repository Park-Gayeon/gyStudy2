package org.example;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        new CustomWebApplicationServer(8080).start();
    }
}
//GET /calculate?operand1=11&operator=*&operand2=55 HTTP/1.1  >> Request line
//Host: localhost:8080  >> Header
//Connection: Keep-Alive  >> Blank line
//User-Agent: Apache-HttpClient/4.5.13 (Java/17.0.5)  >>Body
//Accept-Encoding: br,deflate,gzip,x-gzip