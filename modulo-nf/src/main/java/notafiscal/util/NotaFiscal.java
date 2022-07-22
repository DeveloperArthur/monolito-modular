package notafiscal.util;

import dominio.Cliente;

public class NotaFiscal {
    private Cliente donoDaNota;

    public NotaFiscal(Cliente donoDaNota) {
        this.donoDaNota = donoDaNota;
    }

    public String getDonoDaNota() {
        return donoDaNota.getCpf();
    }
}
