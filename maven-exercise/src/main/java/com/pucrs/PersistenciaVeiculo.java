package com.pucrs;

import java.io.FileReader;
import java.io.Reader;
import java.util.ArrayList;
import com.pucrs.Veiculo.CategoriaVeiculo;
import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVRecord;

public class PersistenciaVeiculo {
    private static ArrayList<Veiculo> listaVeiculos;

    public static ArrayList<Veiculo> carregaVeiculo(String csvPath) {
        try {
            Reader in = new FileReader(csvPath);
            Iterable<CSVRecord> records = CSVFormat.DEFAULT.parse(in);
            for(CSVRecord record : records){
                listaVeiculos.add(new Veiculo(record.get("Placa"),
                                              record.get("Marca"),
                                              record.get("Cor"),
                                              Enum.valueOf(CategoriaVeiculo.class, 
                                              record.get("Categoria"))));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return listaVeiculos;
    }

    public static Veiculo getVeiculoByPlate(String plate){
        Veiculo veiculo = null;
        for(Veiculo v: listaVeiculos){
            if(v.getPlaca().equals(plate))
                veiculo = v;
        }
        return veiculo;
    }
}