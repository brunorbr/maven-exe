package com.pucrs;

import java.io.FileReader;
import java.io.Reader;
import java.util.ArrayList;
import com.pucrs.Motorista.FormaPagamento;
import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVRecord;

public class PersistenciaPassageiro {
    private ArrayList<Passageiro> listaPassageiro;

    public PersistenciaPassageiro(){
        this.listaPassageiro = new ArrayList<Passageiro>();
    }

    public ArrayList<Passageiro> carregaPassageiro(String csvPath) {
        try {
            Reader in = new FileReader(csvPath);
            Iterable<CSVRecord> records = CSVFormat.DEFAULT.parse(in);

            for(CSVRecord record : records){
                listaPassageiro.add(new Passageiro(record.get("cpf"),
                                              record.get("nome"),
                                              Enum.valueOf(FormaPagamento.class, 
                                              record.get("formaPgto")),
                                              record.get("nroCartao")));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return listaPassageiro;
    }   
}