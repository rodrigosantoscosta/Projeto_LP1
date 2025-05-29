package model;

import java.util.List;

public class Veiculo {
    private String placa;
    private String modelo;
    private String chassi;
    private int ano;
    private int quilometragem;



    // Criando o construtor
    public Veiculo(String placa, String modelo, String chassi, int ano, int quilometragem ){
        this.placa = placa;
        this.modelo = modelo;
        this.ano = ano;
        this.chassi = chassi;
        this.quilometragem = quilometragem;
    }
    // Setters dos atributos

    public void setPlaca(String placa){
        this.placa = placa;
    }
    public void setModelo(String modelo){
        this.modelo = modelo;
    }
    public void setChassi(String chassi){
        this.chassi = chassi;
    }
    public void setAno(int ano) {
        this.ano = ano;
    }
    public void setQuilometragem(int quilometragem) {
        this.quilometragem = quilometragem;
    }

    // Getters dos atributos

    public String getPlaca(){
        return placa;
    }
    public String getModelo() {
        return modelo;
    }
    public String getChassi() {
        return chassi;
    }
    public int getAno() {
        return ano;
    }
    public int getQuilometragem() {
        return quilometragem;
    }


    @Override
    public String toString() {
        return "Veiculo{" +
                "placa='" + placa + '\'' +
                ", modelo='" + modelo + '\'' +
                ", chassi='" + chassi + '\'' +
                ", ano=" + ano +
                ", quilometragem=" + quilometragem +
                '}';
    }
}
