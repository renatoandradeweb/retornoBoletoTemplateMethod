/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.manoelcampos.retornoboleto;

import java.time.LocalDate;

/**
 *
 * @author Renato Andrade
 */
public class LeituraRetornoBancoBradesco extends ProcessarBoletos {

    @Override
    protected Boleto processarLinhaArquivo(String[] vetorLinhaArq) {

        Boleto boleto = new Boleto();
        boleto.setId(Integer.parseInt(vetorLinhaArq[0]));
        boleto.setCodBanco(vetorLinhaArq[1]);
        boleto.setAgencia(vetorLinhaArq[2]);
        boleto.setContaBancaria(vetorLinhaArq[3]);
        boleto.setDataVencimento(LocalDate.parse(vetorLinhaArq[4], FORMATO_DATA));
        boleto.setDataPagamento(LocalDate.parse(vetorLinhaArq[5], FORMATO_DATA_HORA).atTime(0, 0, 0));
        boleto.setCpfCliente(vetorLinhaArq[6]);
        boleto.setValor(Double.parseDouble(vetorLinhaArq[7]));
        boleto.setMulta(Double.parseDouble(vetorLinhaArq[8]));
        boleto.setJuros(Double.parseDouble(vetorLinhaArq[9]));
        return boleto;
    }
    
}
