public class Conta {
private String nome;
private int numero;
private double saldo;
public Conta(String nome, int numero, double saldo) {
	super();
	this.nome = nome;
	this.numero = numero;
	this.saldo = saldo;
}
public String getNome() {
	return nome;
}
public void setNome(String nome) {
	this.nome = nome;
}
public int getNumero() {
	return numero;
}
public void setNumero(int numero) {
	this.numero = numero;
}
public double getSaldo() { 
	return saldo;
}
public void setSaldo(double saldo) {
	this.saldo = saldo;
}
public boolean saca(double valor) {
	if(valor<=saldo) {
		saldo=saldo-valor;
		return true;
	}
	else {
		return false;
	}
}
public void deposita(double valor) {
	saldo=saldo+valor;
}
public void transferir(Conta de,Conta para, double valor) {
	para.saldo=para.saldo+valor;
	de.saldo=de.saldo-valor;
}
public String imprimir() {
	return nome+" "+saldo;
}

}


public class ContaTeste {

	public static void main(String[] args) {
		Conta c1 =new Conta("Igor",2947,100);
		Conta c2 =new Conta("Bernardo",6553,4000);
		c1.saca(2500);
		c1.deposita(300);
		c2.saca(1000);
		c1.getSaldo();
		c2.getSaldo();
		c1.transferir(c2, c1, 2000);
		c1.transferir(c1, c2, 2500);
		c1.imprimir();
		c2.imprimir();
		c1.setNome("Igor Alves");
		c1.imprimir();
	}
}