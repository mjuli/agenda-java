package agenda;

public class Contato {
  
  private String nome;
  private String ddd;
  private String telefone;
  private String endereco;
  
  public Contato(String nome, String ddd, String telefone, String endereco) {
    super();
    this.nome = nome;
    this.ddd = ddd;
    this.telefone = telefone;
    this.endereco = endereco;
  }

  public String getNome() {
    return nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public String getDdd() {
    return ddd;
  }

  public void setDdd(String ddd) {
    this.ddd = ddd;
  }

  public String getTelefone() {
    return telefone;
  }

  public void setTelefone(String telefone) {
    this.telefone = telefone;
  }

  public String getEndereco() {
    return endereco;
  }

  public void setEndereco(String endereco) {
    this.endereco = endereco;
  }

  @Override
  public String toString() {
    return "\nNome: " + nome + 
        "\nTelefone: (" + ddd + ") " + telefone + 
        "\nEndereço: " + endereco;
  }  
  
}
