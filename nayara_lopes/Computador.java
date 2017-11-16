
public class Computador {
	
	private String processador;
	private float memoria;
	private float hd;
	private float preco;
	
	public String getProcessador() {
		return this.processador;
	}
		public void setProcessador(String novoProcessador) {
		this.processador = novoProcessador;
	}
	
	public float getMemoria() {
		return this.memoria;
	}
		public void setMemoria (float novoMemoria) {
		this.memoria = novoMemoria;
	}
	
	public float getHd(){
		return this.hd;
	}
		public void setHd (float novoHd){
		this.hd = novoHd;
	}
	
	public float getPreco() {
		return this.preco;
	}
	public void setPreco (float novoPreco) {
		this.preco = novoPreco;
	}
	
	public String retorno() {
		return "PCZINHO v1" +"\nProcessador: " +processador + "\nMemória: " +memoria + "\nHD: " +hd +"\nPreço: " +preco;
	}
	
}
