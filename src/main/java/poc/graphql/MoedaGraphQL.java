package poc.graphql;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.graphql.data.method.annotation.SchemaMapping;
import org.springframework.stereotype.Controller;
import poc.entitie.Moeda;
import poc.graphql.service.MoedaService;
import poc.graphql.service.factory.DataFactory;

import java.util.Collection;

@Controller
public class MoedaGraphQL {

    @Autowired
    private MoedaService moedaService;

    @SchemaMapping(typeName = "Query")
    public Collection<Moeda> moedas(){
        return moedaService.findAll();
    }

    @QueryMapping
    public String gerarMockDados(@Argument("quantidade") Integer quantidade){
        return moedaService.criarMockDados(quantidade);
    }

    @QueryMapping
    public String resetarMockDados(){
        return moedaService.resetarMockDados();
    }

}
