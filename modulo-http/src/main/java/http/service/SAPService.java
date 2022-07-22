package http.service;

import http.gateway.GatewaySAPClient;

import java.net.URISyntaxException;

public class SAPService {
    public void integra() throws URISyntaxException {
        GatewaySAPClient gateway = new GatewaySAPClient();
        gateway.integra();
    }
}
