package Aula04Teste;

public class Main {
    public static void main(String[] args){
        Ult Ult = new Ult();

        Automovel virtus = new Automovel();
        virtus.placa = "RSD4A10";
        virtus.marca = "Volkswagen";
        virtus.modelo = "Virtus";
        virtus.ano = 2022;

//        virtus.CarroInfos();
        virtus.Ligar();
//        System.out.println(virtus.VerificarEstado());

        Automovel uno = new Automovel();
        uno.placa = "JEX9222";
        uno.marca = "Fiat";
        uno.modelo = "Uno";
        uno.ano = 2016;

//        virtus.CarroInfos();
//        virtus.Desligar();
//        System.out.println(virtus.VerificarEstado());
//        Ult.Linha();

        Ult.Linha();
        System.out.println(virtus.placa + " - " + virtus.VerificarEstado());
        System.out.println(uno.placa + " - " + uno.VerificarEstado());
        Ult.Linha();

    }
}
