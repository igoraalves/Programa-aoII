public class Funcionario {
	private String nome;
	private String cpf;
	private double salario;
	TipoFuncionario tipoFuncionario;
	
	public Funcionario (String nome, String cpf, TipoFuncionario tipoFuncionario) {
		this.nome = nome;
		this.cpf = cpf;
		this.tipoFuncionario = tipoFuncionario;
		this.salario = tipoFuncionario.getSalario();
		
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getNome() {
		return this.nome;
	}
	
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	
	public String getCpf() {
		return this.cpf;
	}
	
	public double getSalario() {
		return this.salario;
	}
	public TipoFuncionario getTipo () {
		return this.tipoFuncionario;
	}
}


//////////////////////
public class Main {
	public static void main(String args[]){
		
		ArrayList<Funcionario> administrativo = new ArrayList();
		ArrayList<Funcionario> empressarial = new ArrayList();
		ArrayList<Funcionario> executivo = new ArrayList();
		ArrayList<Funcionario> todoFuncionarios = new ArrayList();
		
		Funcionario f1 = new Funcionario("asd", "asaddsa", TipoFuncionario.EXECUTIVO);	
		executivo.add(0, f1);
		todoFuncionarios.add(0, f1);
		Funcionario f2 = new Funcionario("qwqw", "12312", TipoFuncionario.EMPRESSARIAL);
		empressarial.add(0, f2);
		todoFuncionarios.add(1, f2);
		Funcionario f3 = new Funcionario("zxc", "0987", TipoFuncionario.ADIMINISTRATIVO);
		administrativo.add(0, f3);
		todoFuncionarios.add(2, f3);
		
	}
}
////////////////////
public enum TipoFuncionario {
	
	EXECUTIVO(1500), ADIMINISTRATIVO(2000), EMPRESSARIAL(2500);
	
	private double salario;
	
	TipoFuncionario(double salario){
		this.salario = salario;
	}
	
	public double getSalario() {
		return this.salario;
	}
	
	

}
