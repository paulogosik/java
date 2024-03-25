package Aula04Teste;

public class Automovel {
    String placa, marca, modelo;
    int ano;
    private boolean ligado = false;

    public void Ligar(){
        ligado = true;
    }

    public void Desligar(){
        ligado = false;
    }

    public String VerificarEstado(){
        if (ligado){
            return "Está ligado!";
        } else{
            return "Está desligado!";
        }
    }

    public void CarroInfos(){
        System.out.println("Placa: " + placa);
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Ano: " + ano);
    }
}
