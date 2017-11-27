package exercicio0811.classes;

public class Empregado{

	private String nome;
	private String sexo;
	private float salario;
	private HorarioTrabalho horarios;

	public Empregado (String n, String s, float sal, String entrada, String saida){
		nome = n;
		sexo = s;
		salario = sal;
		horarios = new HorarioTrabalho (entrada, saida);
	}

	public void aumentarSalario(float percentual){
		salario = salario * (1+percentual/100);
	}

	public void print(){
		System.out.println("Nome....: "+nome);
		System.out.println("Sexo....: "+sexo);
		System.out.println("Salario.: "+salario);
		System.out.println("Entrada.: "+horarios.horaEntrada);
		System.out.println("Saida...: "+horarios.horaSaida);
	}
}
