
public class Cadeira {

	private float altura;
	private float largura;
	private String cor;
	private String material;
	
	
	public float getAltura() {
		return this.altura;
	}
	public void setAltura(float novoAltura){
		this.altura = novoAltura;
	}
	
	public float getLargura(){
		return this.largura;
	}
	public void setLargura(float novoLargura){
		this.largura = novoLargura;
	}
	
	public String getCor() {
		return this.cor;
	}
	public void setCor(String novoCor){
		this.cor = novoCor;
	}
	
	public String getMaterial() {
		return this.material;
	}
	public void setMaterial(String novoMaterial) {
		this.material = novoMaterial;
	}
	
	
	public String retorno() {
		return "CADEIRINHA v1" +"\nAltura: " +altura + "\nLargura: " +largura + "\nCor: " +cor +"\nMaterial: " +material;
	}
	
}



