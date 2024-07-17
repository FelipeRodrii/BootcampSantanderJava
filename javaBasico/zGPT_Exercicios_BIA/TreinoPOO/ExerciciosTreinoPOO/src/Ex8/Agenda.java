package Ex8;

import java.util.ArrayList;
import java.util.List;

public class Agenda {
    List<Contato> contatos = new ArrayList<>();

    protected void adicionaContato(Contato contato){
        this.contatos.add(contato);
    }
    protected void removerUltimoContato(){
        this.contatos.remove(contatos.size()-1);
    }
    protected void listarContatos(){
        for (Contato contato : contatos) {
            System.out.println(contato.contato +" "+contato.telefone +" "+ contato.email);
        }
    }

}   
