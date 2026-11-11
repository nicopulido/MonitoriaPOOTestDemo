package com.github.nicopulido.testdemo;

public class AgendaContador {
    public static int total(Agenda agenda) {
        return agenda.getContactos().size();
    }
}