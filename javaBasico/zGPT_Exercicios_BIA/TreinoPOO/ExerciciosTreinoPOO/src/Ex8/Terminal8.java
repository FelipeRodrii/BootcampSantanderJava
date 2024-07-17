package Ex8;

public class Terminal8 {
    public static void main(String[] args) {


        Agenda  agenda1= new Agenda(); 
        Contato felipe = new Contato("Felipe", 972008066, "feliperodr@gamil.com");
        Contato bruno = new Contato("Bruno", 45645112, "bruno@gamil.com");
        Contato giovana = new Contato("Giovana", 9785451, "Gio@gamil.com");

        agenda1.adicionaContato(felipe);
        agenda1.adicionaContato(bruno);
        agenda1.adicionaContato(giovana);
        agenda1.listarContatos();
        agenda1.removerUltimoContato();
        agenda1.listarContatos();
            
                
    }
    
}
