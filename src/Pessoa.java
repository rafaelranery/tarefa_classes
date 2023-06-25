import java.time.Year;

/**
 * @author rafael
 * @version 1.0
 */

public class Pessoa {
    private String nome;
    private String cpf;
    private String genero;
    private int anoDeNascimento;
    private double altura;

    // função construtora

    /**
     * Função construtora default da classe Pessoa.
     */
    public Pessoa() {
        this.nome = "Anônimo";
        this.anoDeNascimento = -1;
        this.genero = "Gênero desconhecido";
        this.cpf = "CPF desconhecido";
        this.altura = -1.0;
    }

    /**
     * Função construtora básica da classe Pessoa.
     * @param nome Nome da pessoa.
     * @param anoDeNascimento Ano de nascimento da pessoa.
     */
    public Pessoa(String nome, int anoDeNascimento, String genero) {
        this.nome = nome;
        this.anoDeNascimento = anoDeNascimento;
        this.genero = genero;
        this.cpf = "CPF desconhecido";
        this.altura = -1.0;
    }

    /**
     * Função construtora complexa da classe Pessoa.
     * @param nome Nome da pessoa.
     * @param anoDeNascimento Ano de nascimento da pessoa.
     * @param genero Gênero da pessoa.
     * @param cpf CPF de onze dígitos, sem pontuação
     * @param altura Altura em metros
     */
    public Pessoa(String nome, int anoDeNascimento, String genero, String cpf, double altura) {
        this.nome = nome;
        this.anoDeNascimento = anoDeNascimento;
        this.genero = genero;
        this.cpf = cpf;
        this.altura = altura;
    }

    // getters & setters
    public String getNome() {
        return nome;
    }

    /**
     * Método para declaração do nome do objeto Pessoa.
     * @deprecated Para definição de nomes, de preferência utilizar a função construtora da classe.
     * @see Pessoa Pessoa()
     * @param nome - Nome da pessoa.
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        if(cpf.length() != 11) {
            System.out.println("CPF inválido. Insira um CPF válido, sem pontuação.");
            return;
        }
        this.cpf = cpf;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public int getAnoDeNascimento() {
        return anoDeNascimento;
    }

    public void setAnoDeNascimento(int anoDeNascimento) {
        if (anoDeNascimento <= 0 || anoDeNascimento > Year.now().getValue()) {
            System.out.println("Ano de nascimento inválido.");
            return;
        }
        this.anoDeNascimento = anoDeNascimento;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        if(altura <= 0) {
            System.out.println("Altura inválida");
            return;
        }
        this.altura = altura;
    }

    // métodos
    public int idade() {
        Year y = Year.now();
        return y.minusYears(this.anoDeNascimento).getValue();
    }

    public String declararIdade() {
        return "Eu, " + this.nome + ", tenho " + idade() + " anos.";
    }

    public String apresentacao() {
        return "Olá! Eu me chamo " + this.nome + ". Tudo bem?";
    }

    public String despedida() {
        return "Adeus! Estou indo embora!";
    }

    /**
     * Método que representa a ação de andar.
     *
     * @return A confimação da ação de andar.
     */
    public String andar() {
        return this.nome + " andou...";
    }

    /**
     * Método que representa a ação de andar um número de metros estabelecido.
     *
     * @param metros Metros a serem percorridos
     *
     * @return A descrição da quantidade de metros percorridos pela ação.
     */
    public String andar(int metros) {
        return this.nome + " andou " + metros + " metros.";
    }

}
