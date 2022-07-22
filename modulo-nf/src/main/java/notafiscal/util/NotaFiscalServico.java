package notafiscal.util;

import notafiscal.gateway.GatewayNotaFiscalClient;

public class NotaFiscalServico {

    public void integra(NotaFiscal notaFiscal){
        GatewayNotaFiscalClient gateway = new GatewayNotaFiscalClient();
        gateway.integra(notaFiscal);
    }
}
