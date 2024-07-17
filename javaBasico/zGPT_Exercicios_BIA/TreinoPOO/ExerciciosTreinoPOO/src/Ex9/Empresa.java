package Ex9;
import java.util.ArrayList;
import java.util.List;

public class Empresa {
    String nomeEmpresa;
    List<Funcionario> funcionarios = new ArrayList<>();

    protected void adicionarFuncionario(Funcionario funcionario){
        funcionarios.add(funcionario);
    }
    protected void removerUltimo(){
        funcionarios.remove(funcionarios.size()-1);
    }
    protected void listarFuncionarios(){
        for (Funcionario funcionario : funcionarios) {
            System.out.println(funcionario.id +" "+funcionario.nome +" "+ funcionario.cargo);
            
        }
    }

    protected String calculoBonusSalario(Funcionario funcionario){ 
        
        double bonus = funcionario.salario *= 0.2;
        String frase = "O bonus salarial do funcionario" +funcionario.nome+ " é: "+ bonus;
            return frase;
    }
    
}
