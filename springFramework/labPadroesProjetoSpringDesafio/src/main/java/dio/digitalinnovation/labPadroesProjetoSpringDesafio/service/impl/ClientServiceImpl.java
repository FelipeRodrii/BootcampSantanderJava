package dio.digitalinnovation.labPadroesProjetoSpringDesafio.service.impl;

import dio.digitalinnovation.labPadroesProjetoSpringDesafio.model.Book;
import dio.digitalinnovation.labPadroesProjetoSpringDesafio.model.BookRepository;
import dio.digitalinnovation.labPadroesProjetoSpringDesafio.model.Client;
import dio.digitalinnovation.labPadroesProjetoSpringDesafio.model.ClientRepository;
import dio.digitalinnovation.labPadroesProjetoSpringDesafio.service.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Optional;

@Service
public class ClientServiceImpl implements ClientService {
    @Autowired
    private ClientRepository clientRepository;
    @Autowired
    private BookRepository bookRepository;


    @Override
    public Iterable<Client> findAll() {
        return clientRepository.findAll();
    }

    @Override
    public Client findById(Long id) {
        Optional<Client> client = clientRepository.findById(id);
        return client.get();
    }

    @Override
    public void insert(Client client, ArrayList<Book> book) {
        clientRepository.save(client);
    }

    @Override
    public void update(Long id, Client client) {
        Optional<Client> clientBd = clientRepository.findById(id);
        if(clientBd.isPresent()){
            clientRepository.save(client);
        }

    }

    @Override
    public void delete(Long id) {
        clientRepository.deleteById(id);
    }
}
