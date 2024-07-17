package lanchonete;

import lanchonete.area_cliente.Cliente;
import lanchonete.atendimento.Atendente;
import lanchonete.atendimento.cozinha.Almoxarife;
import lanchonete.atendimento.cozinha.Cozinheiro;

public class Estabelecimento {
    public static void main(String[] args) {
        Cozinheiro cozinheiro = new Cozinheiro();
		//ações que não precisam estarem disponíveis para toda a aplicação 
        /* 
        cozinheiro.lavarIngredientes();
        cozinheiro.baterVitaminaLiquificador();
        cozinheiro.selecionarIngredientesVitamina();
        cozinheiro.prepararLanche();
        cozinheiro.prepararVitamina();
        cozinheiro.prepararVitamina();
        */
		//ações que estabelecimento precisa ter ciência
        cozinheiro.adicionandoSucoNoBalcao();
        cozinheiro.adicionarLancheNoBalcao();
        cozinheiro.adicionarComboNoBalcao();

        Almoxarife almoxarife = new Almoxarife();
        //ações que não precisam estarem disponíveis para toda a aplicação



        Atendente atendente = new Atendente();
        atendente.servindoMesa();
        atendente.receberPagamento();

		//ação que somente o seu pacote cozinha precisa conhecer (default)

        Cliente cliente = new Cliente();
        cliente.escolherLanche();
        cliente.fazerPedido();
        cliente.pagarConta();

        //não deveria, mas o estabelecimento
		//ainda não definiu normas de atendimento
        cliente.pegarPedidoBalcao();

        //esta ação é muito sigilosa, qua tal ser privada ?
        cliente.consultarSaldoAplicativo();

        //já pensou os clientes ouvindo que o gás acabou?
        /* 
        cozinheiro.pedirParaTrocarGas(atendente);
        cozinheiro.pedirParaTrocarGas(almoxarife);
        */
    
    
    
    }
}
