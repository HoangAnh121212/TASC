package com.example.demojavacore.OOP.ClassAndInstance;

public class Person implements PersonA , PersonB {

    @Override
    public void voice() {
        System.out.println("HiHi");
    }

    public static void main(String[] args) {
        Person nhiMuBu = new Person();
        nhiMuBu.voice();
        PersonA person = new Person();
        person.voice();
        PersonB cat = new Person();
        cat.voice();
    }
}
