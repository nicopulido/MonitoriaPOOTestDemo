package com.github.nicopulido.testdemo;

import com.sun.

public class TestDemo{
    static void mostrarBienvenida() {
        System.out.println("Bienvenido a la Agenda");
    }

    public static void main(String[] args) {
        mostrarBienvenida();
        Agenda agenda = new Agenda();
        agenda.agregar(new Contacto("Ana", "3001112233"));
        agenda.agregar(new Contacto("Luis", "3004445566"));
        agenda.listar();
    }
}