public class ListaSimple{
    Node top;
    //Métodos para los casos de inserción de nodos
    public boolean insertaPrimerNodo(String dato)
    {
        if (top == null) 
        { //La lista no está vacía
            top = new Node();
            top.name = dato;
            top.next = null;

            return true;
        }
        else 
        {
            return false;
        }
    }

    public void insertaAntesPrimerNodo(String nombre)
    {
        Node temp; 
        temp = new Node ();
        temp.name = nombre;
        temp.next = this.top;
        this.top = temp;
        temp = null;
    }

    public void insertaAlFinal(String nombre)
    {
        Node temp = new Node ();
        temp.name = nombre;
        temp.next = null;
        //Node temp2;
        Node temp2 = this.top;

        while (temp2.next != null)
            temp2 = temp2.next;

        temp2.next = temp;
        temp = null;
        temp2 = null;
    }

    public boolean insertaEntreNodos(String nombre, String buscado)
    {
        Node temp = new Node();
        temp.name = nombre;
        Node temp2 = this.top;

        //boolean NodoNoEncontrado = true;

        while ( (temp2 != null) 
        && temp2.name.equals(buscado) == false ) 
        {    
            temp2 = temp2.next;
        }

        if (temp2 != null)
        {  //Nodo buscado se encontró
            temp.next = temp2.next;
            temp2.next = temp;
            temp = null;
            temp2 = null;
            return true;
        }
        else return false;
    } 

    public void imprimir()
    {
        for (Node temp = this.top; temp != null; temp = temp.next)
        {
            System.out.print("[ " + temp.name + " ] -> ");
        }

        System.out.print("[X]\n"); 
    }

    public String toString()
    {
        String cadAux = "";
        for (Node temp = this.top; temp != null; temp = temp.next)
        {
            cadAux += "[ " + temp.name + " ] -> ";
        }

        cadAux += "[X]\n"; 

        return cadAux;
    }

    //Métodos de borrado
    public void borrarPrimerNodo()
    {
        this.top = this.top.next;
    }

    //Borrar cualquier nodo que no sea el primero
    public boolean borrarCualquierNodo(String buscado)
    {
        Node temp = this.top;

        while ( (temp != null) 
        && temp.name.equals(buscado) == false ) 
        {    
            temp = temp.next;
        }

        if (temp != null)
        {  //Nodo buscado se encontró
            temp.next = temp.next.next;
            temp = null;

            return true;
        }
        else return false;
    }

    // Método para buscar un nodo por el valor de su campo clave y devolver una referencia
    public Node buscarPorValor(String valor) 
    {
        Node temp = this.top;

        while (temp != null && !temp.name.equals(valor)) 
        {
            temp = temp.next;
        }

        return temp;
    }
    // Método para buscar un nodo por su campo clave e insertar un nuevo nodo después de él
    public boolean intercambiarNodo(String nombre, String buscado)
    {
        Node temp = new Node();
        temp.name = nombre;
        Node tempAnterior = null;
        Node temp2 = this.top;

        //boolean NodoNoEncontrado = true;

        while (temp2 != null && !temp2.name.equals(buscado)) 
        {
            tempAnterior = temp2;
            temp2 = temp2.next;
        }

        if (temp2 != null) 
        {  // Nodo buscado se encontró
            // Si tempAnterior es null, el nodo buscado es el primer nodo
            if (tempAnterior != null) 
            {
                temp.next = temp2.next;
                temp2.next = temp;
                tempAnterior.next = temp;
            } 
            else 
            {
                temp.next = temp2.next;
                temp2.next = temp;
                this.top = temp;
            }

            return true;
        } 
        else 
        {
            System.out.println("Nodo con valor '" + buscado + "' no encontrado.");
            return false;
        }
    } 
    // Método para intercambiar un nodo por otro buscado
    public boolean insertarDespues(String nombre, String buscado)
    {
        Node nuevoNodo = new Node();
        nuevoNodo.name = nombre;

        Node temp = new Node();
        temp.name = buscado;
        Node temp2 = this.top;

        while (temp2 != null && !temp2.name.equals(buscado)) {
            temp2 = temp2.next;
        }

        if (temp2 != null) {  // Nodo con clave encontrada
            nuevoNodo.next = temp2.next;
            temp2.next = nuevoNodo;
            return true;
        } else {
            System.out.println("Nodo con clave '" + buscado + "' no encontrado.");
            return false;
        }
    } 
}
