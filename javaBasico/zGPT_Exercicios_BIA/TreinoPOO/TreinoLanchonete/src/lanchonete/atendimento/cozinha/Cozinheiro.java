package lanchonete.atendimento.cozinha;

import lanchonete.atendimento.Atendente;

public class Cozinheiro {
    public void adicionarLancheNoBalcao(){
        System.out.println("ADICIONANDO LANCHE NATURAL HAMBÚRGUES NO BALCÃO");
    }
    public void adicionandoSucoNoBalcao(){
        System.out.println("ADICIONANDO SUCO NO BALCÃO");
    }
    public void adicionarComboNoBalcao(){
        adicionarLancheNoBalcao();
        adicionandoSucoNoBalcao();
    }
    private void prepararLanche(){
        selecionarIngredientesLanche();
        lavarIngredientes();
        fritarIngredientesLanche();
        System.out.println("PREPARANDO LANCHE TIPO HAMBURGUER ");
    }
    private void prepararVitamina(){
        lavarIngredientes();
        selecionarIngredientesVitamina();
        baterVitaminaLiquificador();
        System.out.println("PREPARANDO SUCO");
    }
    private void prepararCombo(){
        selecionarIngredientesLanche();
        selecionarIngredientesVitamina();
        lavarIngredientes();
        prepararLanche();
        prepararVitamina();
    }
    private void selecionarIngredientesLanche(){
        System.out.println("SELECIONADO O PÃO, SALADA, OVO E CARNE");
    }
    private void selecionarIngredientesVitamina(){
        System.out.println("SELECIONADO FRUTA, LEITE E SUCO");
    }
    private void lavarIngredientes(){
        System.out.println("LAVANDO INGREDINETES");
    }
    private void baterVitaminaLiquificador(){
        System.out.println("BATENDO VITAMINA NO LIQUIDIFICADOR");
    }
    private void fritarIngredientesLanche(){
        System.out.println("FRITANDO A CARNE E OVOS");
    }
    private void pedirParaTrocarGas(Almoxarife meuAmigo){
        meuAmigo.trocarGas();
    }
    private void pedirIngredientes(Almoxarife almoxarife){
        almoxarife.entregarIngredientes();
    }   
}
