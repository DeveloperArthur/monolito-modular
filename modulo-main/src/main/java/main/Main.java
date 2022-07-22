package main;

import dominio.Cliente;
import http.SAPService;
import notafiscal.NotaFiscal;
import notafiscal.NotaFiscalServico;

import java.net.URISyntaxException;

public class Main {
    public static void main(String[] args) {
        var cliente = new Cliente("123456");
        NotaFiscal notaFiscal = new NotaFiscal(cliente);

        try {
            NotaFiscalServico notaFiscalServico = new NotaFiscalServico();
            notaFiscalServico.integra(notaFiscal);

            SAPService sapService = new SAPService();
            sapService.integra();
        } catch (URISyntaxException e) {
            throw new RuntimeException(e);
        }
    }
}
