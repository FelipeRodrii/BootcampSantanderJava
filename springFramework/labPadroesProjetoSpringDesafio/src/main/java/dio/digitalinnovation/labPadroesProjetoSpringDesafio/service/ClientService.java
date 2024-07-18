package dio.digitalinnovation.labPadroesProjetoSpringDesafio.service;

import dio.digitalinnovation.labPadroesProjetoSpringDesafio.model.Client;
import dio.digitalinnovation.labPadroesProjetoSpringDesafio.model.Book;
import java.util.ArrayList;

public interface ClientService {

    Iterable<Client> findAll();

    Client findById(Long id);

    void insert(Client client, ArrayList<Book> book);

    void update(Long id, Client client);

    void delete(Long id);
}
