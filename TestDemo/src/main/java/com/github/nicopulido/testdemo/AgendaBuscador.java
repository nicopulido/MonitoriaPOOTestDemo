public class AgendaBuscador {
    public static Contacto buscar(Agenda agenda, String nombre) {
        for (Contacto c : agenda.getContactos()) {
            if (c.getNombre().equalsIgnoreCase(nombre)) {
                return c;
            }
        }
        return null;
    }
}