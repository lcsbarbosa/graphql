package poc.graphql.service;

import org.springframework.stereotype.Service;
import poc.entitie.Moeda;
import poc.graphql.service.factory.DataFactory;

import java.util.Collection;
import java.util.HashMap;

@Service
public class MoedaService extends DataFactory {

    public Collection<Moeda> findAll(){
        return moedaRepository;
    }

    public Moeda findById(Integer id){
        return moedaRepository.get(id);
    }

    public String criarMockDados(Integer quantidade){
        return moedaFactory(quantidade) ? "Criado": "Falha";
    }

    public String resetarMockDados(){
        return resetarDados() ? "Resetado": "Falha";
    }
}
