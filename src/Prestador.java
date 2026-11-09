public abstract class Prestador extends Pessoa {

    private String especialidade;
    private boolean disponivel;

    public Prestador(String nome, String telefone, String endereco, String especialidade) {
        super(nome, telefone, endereco);
        this.especialidade = especialidade;
        this.disponivel = true; // todo prestador começa disponível
    }

    public String getEspecialidade() { return especialidade; }
    public void setEspecialidade(String especialidade) { this.especialidade = especialidade; }

    public boolean isDisponivel() { return disponivel; }
    public void setDisponivel(boolean disponivel) { this.disponivel = disponivel; }

    public abstract void realizarAtendimento();
}