package pr.senac.br;

public class Cliente{
	public String cpf;
	public int anoNascimento;
	public String nome;
	public String email;
	
	public String retornaCliente(){
		  return "CPF: " + this.cpf + " Ano nascimento: " + this.anoNascimento + " Nome: " + this.nome + " e-mail: " + this.email;
	}
	
}



