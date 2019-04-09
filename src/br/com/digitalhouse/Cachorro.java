package br.com.digitalhouse;

public class Cachorro extends Animal{

    private String nome;

    //construtor
    public Cachorro(String novoNome,String novoTamanho, String novsRaca){

        //construtor do pai
        super(novoTamanho,novsRaca);
        nome = novoNome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String novoNome) {
        nome = nome;
    }

    //sobrescreve o comportamento da classe pai
    @Override
    //obrigado a ser usado este metodo por causa do metodo abstrato
    public boolean ehMamifero() {
        //return super.ehMamifero();
        System.out.println("Printando se é mamifero");
        return true;
    }
}
