public class TecnicoManutencao extends Prestador {

    private String tipoEquipamento; // ex.: "notebooks", "desktops", "impressoras"

    public TecnicoManutencao(String nome, String telefone, String endereco, String tipoEquipamento) {
        super(nome, telefone, endereco, "Manutenção de computadores");
        this.tipoEquipamento = tipoEquipamento;
    }

    public String getTipoEquipamento() { return tipoEquipamento; }
    public void setTipoEquipamento(String tipoEquipamento) { this.tipoEquipamento = tipoEquipamento; }

    @Override
    public void realizarAtendimento() {
        System.out.println("Técnico " + getNome() + " iniciou a manutenção de " + tipoEquipamento + ":");
        System.out.println(" - Diagnóstico do defeito");
        System.out.println(" - Limpeza e reparo ou troca de peças");
        System.out.println(" - Teste final do equipamento");
    }
}