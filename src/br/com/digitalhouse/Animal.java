package br.com.digitalhouse;

//classe abstrata
public abstract class Animal {

    private String tamanho;
    private String raca;

    //construtor
    public Animal(){

    }

    //construtor especifico
    public Animal(String novoTamanho, String novaRaca){
        tamanho = novoTamanho;
        raca = novaRaca;
    }

    public String getTamanho() {
        return tamanho;
    }

    public void setTamanho(String novoTamanho) {
        tamanho = novoTamanho;
    }

    public String getRaca() {
        return raca;
    }

    public void setRaca(String novaRaca) {
        raca = novaRaca;
    }

    //metodo abstrato-não pode ser implementado
    public abstract boolean ehMamifero();
}
