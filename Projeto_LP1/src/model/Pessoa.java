package model;
import java.time.format.DateTimeFormatter;
public  class Pessoa {
    private String nome;
    private String cpf ;
    private String data_nascimento;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

//    @Override
//    public String toString() {
//        return "Pessoa{" +
//                "nome='" + nome + '\'' +
//                ", idade=" + idade +
//                '}';
//    }
}