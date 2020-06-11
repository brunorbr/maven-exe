package com.pucrs;

/**
 * Hello world!
 * ALO
 */
public class App 
{
    private PersistenciaVeiculo veiculos;
    private PersistenciaMotorista motoristas;
    private PerstienciaPassageiro passageiros;


    public static void main( String[] args ){
        motoristas = new PersistenciaMotorista();
        passageiros = new PerstienciaPassageiro();
        veiculos = new PersistenciaVeiculo();

        PersistenciaMotorista.forEach(motoristas -> motoristas.toString);

        veiculos.carregaVeiculo("pathToCsv");
        passageiros.carregaPassageiro("pathToCsv");
        motoristas.carregaMotorista("pathToCsv");

        for(Veiculos v : veiculos){
            v.toString();
        }

        for(Passageiros p : passageiros){
            p.toString();
        }

        for(Motorista m : motoristas){
            m.toString();
        }
    }
}
