package br.com.digitalhouse;

public class Main {

    //metodo de execução
    public static void main(String[] args) {

        Cachorro cachorro = new Cachorro("Bidu","20","vira-lata");

        System.out.println("Esse cachorro é mamifero? " + cachorro.ehMamifero());

        //Animal animal = new Animal();
        //animal.setTamanho("1m");
        //animal.setRaca("Ave");
    }
}
