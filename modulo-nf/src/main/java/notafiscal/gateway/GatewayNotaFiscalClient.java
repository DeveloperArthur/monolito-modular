package notafiscal.gateway;

import notafiscal.util.NotaFiscal;

public class GatewayNotaFiscalClient {
    public void integra(NotaFiscal notaFiscal){
        System.out.println("emitindo notafiscal do cliente de cpf "+notaFiscal.getDonoDaNota());
    }
}
