package org.excercise.java.ciclabile;

public class Main {

  public static void main(String[] args) {

    int[] mynumber = { 23, 324, 234, 23453, 877 };

    IntegerClass numeri = new IntegerClass(mynumber);

    for (int i = 0; i < numeri.interi.length; i++) {

      System.out.println(numeri.getElementoSuccessivo(i));
      System.out.println(numeri.hasAncoraElementi(i, numeri.interi.length));

    }

  }

}
