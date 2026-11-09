public class Solicitante extends Pessoa {

    // Atributos específicos do solicitante.
    private String endereco;
    private String bairro;

    // Construtor da classe.
    public Solicitante(String nome, String cpf, String telefone,
                       String endereco, String bairro) {

        super(nome, cpf, telefone);

        this.endereco = endereco;
        this.bairro = bairro;
    }

    // Getter do endereço.
    public String getEndereco() {
        return endereco;
    }

    // Setter do endereço.
    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    // Getter do bairro.
    public String getBairro() {
        return bairro;
    }

    // Setter do bairro.
    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    // Método para solicitar ajuda.
    public void solicitarAjuda() {
        System.out.println("\nSolicitação de ajuda iniciada!");
        System.out.println("Solicitante: " + getNome());
        System.out.println("Telefone: " + getTelefone());
        System.out.println("Endereço: " + endereco);
        System.out.println("Bairro: " + bairro);
    }
}