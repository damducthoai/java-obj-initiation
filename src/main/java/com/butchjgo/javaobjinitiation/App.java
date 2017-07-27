/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.butchjgo.javaobjinitiation;

/**
 *
 * @author butchjgo
 */
public class App {
    public static void main(String[] args) {
        Person person = new Person();
        for(String info : person.getListStep()){
            System.out.println(info);
        }
    }
}
