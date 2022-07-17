package agenda;

import java.util.ArrayList;

public class Agenda {
  
  private static ArrayList<Contato> agenda = new ArrayList();
  
  private static void novoContato(String nome, String ddd, String telefone, String endereco) {
    Contato contato = new Contato(nome, ddd, telefone, endereco);
    
    agenda.add(contato);
  }
  
  private static void listarContatos() {
    for (Contato contato : agenda) {
      System.out.println(contato);
    }
  }
  
  public static void main(String[] args) {
    
    novoContato("Cacau", "83", "9999-9999", null);
    novoContato("Amora", "83", "8889-9999", null);
    
    listarContatos();
    
  }

}
