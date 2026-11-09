public class InstrutorInclusaoDigital extends Prestador {

    private String nivelCurso;

    public InstrutorInclusaoDigital(String nome, String telefone, String endereco, String nivelCurso) {
        super(nome, telefone, endereco, "Inclusão digital");
        this.nivelCurso = nivelCurso;
    }

    public String getNivelCurso() { return nivelCurso; }
    public void setNivelCurso(String nivelCurso) { this.nivelCurso = nivelCurso; }

    @Override
    public void realizarAtendimento() {
        System.out.println("Instrutor " + getNome() + " iniciou uma aula de inclusão digital (nível " + nivelCurso + "):");
        System.out.println(" - Apresentação do computador, do celular e da internet");
        System.out.println(" - Atividade prática com o aluno");
        System.out.println(" - Tira-dúvidas e orientações finais");
    }
}