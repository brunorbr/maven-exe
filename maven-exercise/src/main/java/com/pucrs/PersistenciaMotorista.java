package com.pucrs;

import java.io.FileReader;
import java.io.Reader;
import java.util.ArrayList;

import com.pucrs.Motorista.FormaPagamento;

import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVRecord;

public class PersistenciaMotorista {

    private ArrayList<Motorista> listaMotorista;

    public PersistenciaMotorista(){
        this.listaMotorista = new ArrayList<Motorista>();
    }

    public ArrayList<Motorista> carregaMotorista(String csvPath) {
        try {
            Reader in = new FileReader(csvPath);
            Iterable<CSVRecord> records = CSVFormat.DEFAULT.parse(in);

            for(CSVRecord record : records){
                listaMotorista.add(new Motorista(record.get("cpf"),
                                              record.get("nome"),
                                              PersistenciaVeiculo.getVeiculoByPlate(record.get("veiculo")),
                                              Enum.valueOf(FormaPagamento.class, 
                                              record.get("formaPgto"))));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return listaMotorista;
    }
    
}