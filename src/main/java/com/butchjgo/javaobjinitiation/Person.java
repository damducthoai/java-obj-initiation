/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.butchjgo.javaobjinitiation;

import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author butchjgo
 */
public class Person {
    private static List<String> listStep = new LinkedList<>();
    private String name = nameFactory();
    private static String lastName = lastNameFactory();
    
    {
        listStep.add("curly brace activated");
    }
    
    static {
        listStep.add("static curly brace activated");
        
    }
    
    public Person() {
        listStep.add("constructor activated");
    }
    
    String nameFactory(){
        listStep.add("nameFactory activated");
        return "Nguyen";
    }
    static String lastNameFactory(){
        listStep.add("lastName factory activated");
        return "Peter";
    }

    public List<String> getListStep() {
        return listStep;
    }
}
