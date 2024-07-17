package Equipamentos.Estabelecimento;

import Equipamentos.Impressora.Deskjet;
import Equipamentos.Impressora.Impressora;
import Equipamentos.Impressora.Laserjet;
import Equipamentos.MultiFuncional.EquipamentoMultiFuncional;

public class Fabrica {
    public static void main(String[] args) {
        Impressora impressora = new EquipamentoMultiFuncional();
        Deskjet dek = new Deskjet();
        
        impressora.imprimir();
    }
}
