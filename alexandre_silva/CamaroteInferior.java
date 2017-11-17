package boate;

/**
 *
 * @author alexandre
 */
public class CamaroteInferior extends VIP {
    private boolean lateral1;
    private boolean lateral2;
    private boolean central1;
    private boolean central2;
    private boolean selected;
    
    
    CamaroteInferior(){
        adicional();
    }
    
    public void selecionar(int esc){
        if((esc==1)&&(this.lateral1==false)&&(selected==false)){
            this.lateral1=true;
            selected=true;
        } else if((esc==2)&&(this.lateral2==false)&&(selected==false)){
                this.lateral2=true;
                selected=true;
        } else if((esc==3)&&(this.central1==false)&&(selected==false)){
                    this.central1=true;
                    selected=true;
        } else if((esc==4)&&(this.central2==false)&&(selected==false)){
                        this.central2=true;
                        selected=true;
        }
    }
    
    public void remover(int esc){
        if((esc==1)&&(this.lateral1==true)){
            this.lateral1=false;
            selected=false;
        } else if((esc==2)&&(this.lateral2==true)){
                this.lateral2=false;
                selected=false;
        } else if((esc==3)&&(this.central1==true)){
                    this.central1=false;
                    selected=false;
        } else if((esc==4)&&(this.central2==true)){
                        this.central2=false;
                        selected=false;
        }
    }
    
    public String disponives(){
        String sit = "\n";
        if(this.lateral1==false)
            sit += "[1] - Lateral1\n";
            if(this.lateral2==false)
                sit += "[2] - Lateral2\n";
                if(this.central1==false)
                    sit += "[3] - Central1\n";
                    if(this.central2==false)
                        sit += "[4] - Central2"; 
        return sit;
    }
    
    
    public String selec(){
        String sit = "";
        if(this.lateral1==!false)
            sit += "\n[1] - Lateral1";
            if(this.lateral2==!false)
                sit += "\n[2] - Lateral2";
                if(this.central1==!false)
                    sit += "\n[3] - Central1";
                    if(this.central2==!false)
                        sit += "\n[4] - Central2";
        if(sit.isEmpty()==true){
            return "\n       Nenhum selecionado";
        } else {          
            return sit;
        }
    }
    
    @Override
    public double getValor() {
        return valor;
    }
}
