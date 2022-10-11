package com.example.demo;

import org.springframework.beans.factory.ObjectFactory;
import org.springframework.beans.factory.config.Scope;

public class CustomScope implements Scope {

    @Override
    public Object get(String s, ObjectFactory<?> objectFactory) {
        System.out.println("Scope get");
        return new Inject();
    }

    @Override
    public Object remove(String s) {
        System.out.println("Scope remove");
        return null;
    }

    @Override
    public void registerDestructionCallback(String s, Runnable runnable) {
        System.out.println("Scope registerDestructionCallback");
    }

    @Override
    public Object resolveContextualObject(String s) {
        System.out.println("Scope resolveContextualObject");
        return null;
    }

    @Override
    public String getConversationId() {
        System.out.println("Scope getConversationId");
        return null;
    }
}
