package dio.bootcamp.java.one.digitalInnovation.gof.facade;

import dio.bootcamp.java.subsistema1.crm.CrmService;
import dio.bootcamp.java.subsistema2.cep.CepAPI;

public class Facade {

    public void migrarClient(String nome, String cep){
        String cidade = CepAPI.getInstancia().recuperarCidade(cep);
        String estado = CepAPI.getInstancia().recuperarEstado(cep);

        CrmService.gravarClient(nome, cep, cidade, estado);

    }
}
