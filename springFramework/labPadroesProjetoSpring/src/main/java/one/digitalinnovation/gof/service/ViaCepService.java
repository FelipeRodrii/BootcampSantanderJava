package one.digitalinnovation.gof.service;

import one.digitalinnovation.gof.model.Endereco;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;


/**
 * Client HTTP, criado via <b>OpenFeign</b>, para consumo da API do <b>ViaCep</b>.
 *
 * @see <a href="https://spring.io/projects/spring-cloud-openfeign"> Cloud OpenFeign</a>
 * @see <a h=ref="https://viacep.com.br">ViaCEP<a/>
 *
 * @author FelipeRodrii
 */
@FeignClient(name = "viacep", url = "https://viacep.com.br/ws")
public interface ViaCepService {

    @GetMapping("/{cep}/json/")
    Endereco consultarCep(@PathVariable("cep") String cep);


}
