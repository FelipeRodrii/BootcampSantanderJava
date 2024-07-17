package Ex9;

public class Terminal9 {
    public static void main(String[] args) {
        Funcionario felipe = new Funcionario("Felipe", 72086, "DEV JR", 2500);
        Funcionario giovana = new Funcionario("Giovana", 85413, "DEV PL", 5500);
        Funcionario bruno = new Funcionario("Bruno", 546398, "DEV SR", 9500);

        Empresa devMedia = new Empresa();
        devMedia.nomeEmpresa = "DEVMEDIA";

        System.out.println("ADICIONANDO FUNIONÁRIOS: CHECK");
        devMedia.adicionarFuncionario(felipe);
        devMedia.adicionarFuncionario(giovana);
        devMedia.adicionarFuncionario(bruno);

        System.out.println("\n");

        System.out.println("CALCULO DO BÔNUS SALARIAL: CHECK");
        System.out.println(devMedia.calculoBonusSalario(felipe));
        System.out.println(devMedia.calculoBonusSalario(giovana));
        System.out.println(devMedia.calculoBonusSalario(bruno));

        System.out.println("\n");

        System.out.println("LISTA DE FUNCIONÁRIOS");
        devMedia.listarFuncionarios();

        System.out.println("\n");

        System.out.println("REMOVENDO O ULTIMO FUNCIONÁRIO");
        devMedia.removerUltimo();
        System.out.println("\n");


        System.out.println("LISTA DE FUNCIONÁRIOS RESTANTES");
        devMedia.listarFuncionarios();
        
        
    }
    
}
