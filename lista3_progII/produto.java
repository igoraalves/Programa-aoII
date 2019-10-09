public class Produto {
private String nome;
private double precoCusto;
private double precoVenda;
private double margemLucro;
public String getNome() {
	return nome;
}
public void setNome(String nome) {
	this.nome = nome;
}
public double getPrecoCusto() {
	return precoCusto;
}
public void setPrecoCusto(double precoCusto) {
	this.precoCusto = precoCusto;
}
public double getPrecoVenda() {
	return precoVenda;
}
public void setPrecoVenda(double precoVenda) {
	if(precoVenda<precoCusto) {
		System.out.println("PREÇO DE VENDA NÃO PODE SER INFERIOR AO DE COMPRA");
	}
	else {
	this.precoVenda = precoVenda;
	}
}
public double getMargemLucroPorcentagem() {
	return (margemLucro*100)/precoCusto;
}
public void calcularMargemLucro() {
	margemLucro=precoVenda-precoCusto;
}

}

public class TesteProduto {
	public static void main(String[] args) {
		Produto pro=new Produto();
		pro.setPrecoCusto(20);
		pro.setPrecoVenda(30);
		pro.calcularMargemLucro();
		pro.getMargemLucroPorcentagem();
	}
}