package com.github.nicopulido.testdemo;

public class AgendaBuscador {

    /**
     *
     * @param agenda La agenda en la que se va a buscar el contacto
     * @param nombre El nombre de contacto a buscar
     * @return El objeto encontrado o null si no encuentra ninguna coincidencia
     */
    public static Contacto buscar(Agenda agenda, String nombre) {
        for (Contacto c : agenda.getContactos()) {
            if (c.getNombre().equalsIgnoreCase(nombre)) {
                return c;
            }
        }
        return null;
    }
}