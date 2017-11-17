
package POOExercicio4;

public class MedicamentoMain {
    
    public static void main(String[] args){
    
        Medicamento Med1 = new Medicamento();
        Med1.setID(19874);
        Med1.setNome("Tylenol");
        Med1.setPrincipioAtivo("Qsr");
        Med1.setUnd("3 cx");
        Med1.setQtdeEstoque(65);
        Med1.setDataValidade("05/2018");
        
        
        Medicamento Med2 = new Medicamento( 112231, "Doril", "Act", "1 cx", 12, "02/2018");
        
        
        System.out.println(Med1.Imprimir());
        System.out.println(Med2.Imprimir());
    
    }
    
}
