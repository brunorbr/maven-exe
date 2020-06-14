package com.pucrs;

import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;

public class App 
{
    private static ArrayList<Veiculo> veiculos;
    private static ArrayList<Motorista> motoristas;
    private static ArrayList<Passageiro> passageiros;


    public static void main( String[] args ){


        Path veiculosPath = Paths.get("Veiculo.csv").toAbsolutePath();
        Path motoristasPath = Paths.get("Motorista.csv").toAbsolutePath();
        Path passageirosPath = Paths.get("Passageiro.csv").toAbsolutePath();


        veiculos = new PersistenciaVeiculo().carregaVeiculo(veiculosPath.toString().replace('/', '\\'));
        motoristas = new PersistenciaMotorista().carregaMotorista(motoristasPath.toString().replace('/', '\\'));
        passageiros = new PersistenciaPassageiro().carregaPassageiro(passageirosPath.toString().replace('/', '\\'));

        for(Veiculo v : veiculos){
            v.toString();
        }

        for(Passageiro p : passageiros){
            p.toString();
        }

        for(Motorista m : motoristas){
            m.toString();
        }
    }
}
