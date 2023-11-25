public class UsaLista{

    public static void main(String[] args){
        ListaSimple lista = new ListaSimple();

        lista.insertaPrimerNodo("H");
        lista.insertaAntesPrimerNodo("R");
        lista.insertaAlFinal("O");
        lista.insertaEntreNodos("Z","O");
        lista.imprimir();

        // Llamada a los nuevos métodos
        //Buscar un nodo por su clave y imprimir su referencia
        String valorBuscado = "H";
        Node nodoBuscado = lista.buscarPorValor(valorBuscado);

        if (nodoBuscado != null) {
            System.out.println("Nodo [ " + valorBuscado + " ] encontrado con valor: " + nodoBuscado);
        } else {
            System.out.println("Nodo con valor " + valorBuscado + " no encontrado.");
        }
        //Intercambiar nodos
        lista.intercambiarNodo("Y","O");
        System.out.println("Intercambiar Nodo [ O ] por [ Y ]");
        lista.imprimir();
        //Insertar un nuevo nodo después de un nodo con un valor específico
        System.out.println("Insertar Nodo [ A ] despues de [ Z ]");
        lista.insertarDespues("A", "Z");
        lista.imprimir();

    }
}
