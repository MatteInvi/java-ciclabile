package org.excercise.java.ciclabile;

public class IntegerClass {

    public int[] interi = {};

    public IntegerClass(int[] interi) {
        this.interi = interi;
    }

    public int getElementoSuccessivo(int indice) {

        return interi[indice];
    }

    public boolean hasAncoraElementi(int indice, int lunghezzaArray) {
        boolean risultato = true;
        if (indice == lunghezzaArray - 1) {
            risultato = false;
        }
        return risultato;
    }

    public int[] getInteri() {
        return this.interi;
    }

    public void setInteri(int[] interi) {
        this.interi = interi;
    }

}
