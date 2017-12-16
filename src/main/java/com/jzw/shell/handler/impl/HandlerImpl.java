package com.jzw.shell.handler.impl;

import com.jzw.shell.handler.Handler;
import org.springframework.stereotype.Component;

@Component("handler")
public class HandlerImpl implements Handler {
    public void handle() {
        System.out.println("handle");
    }
}
