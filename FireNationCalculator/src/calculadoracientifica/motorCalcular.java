package calculadoracientifica;

import java.util.ArrayList;
import java.lang.Math; 

public class motorCalcular {    
    String opera ;
    
    
    //Métodos

    public String getOpera() {
        return opera;
    }

    public void setOpera(String opera) {
        this.opera = calcOpera(opera);
    }
    
    private String calcOpera(String strBase){
        //string utilizada para teste parcial durante o desenvolvimento 
        //strBase = "6/6+01*23.4+56*7-890*3-9+10.0/10*990f"; //string deve ser recebida com f no final para indicar o fim da operação
       
        //Separo operandos e operadores em um ArrayList
        ArrayList<String> listOperando = new ArrayList();
        int j = 0;
        int i = 0;
        
        for(i = 0; i < strBase.length(); i++){
            
            if(!Character.isDigit(strBase.charAt(i)) || i==strBase.length()){
                if(strBase.charAt(i)=='.'){
                    continue;
                }
                else{
                    if(j==0){
                        listOperando.add(strBase.substring(j, i));
                    }
                    else{
                        listOperando.add(strBase.substring(j, j+1));
                        listOperando.add(strBase.substring(j+1, i));
                    }
                    j=i;
                }
            }
        }
        
        //Percorro o ArrayList procurando/resolvendo operandos de elevação (^) e Porcentagem (%)
        i=0;
        j=0;
        while(j!=1){
            j=1;
            for(i=0; i<listOperando.size(); i++){
                
                if( listOperando.get(i).charAt(0) == '^' || listOperando.get(i).charAt(0) == '%' ){
                    listOperando.set(i-1, solveOpe(listOperando.get(i-1), listOperando.get(i), listOperando.get(i+1))); 
                    listOperando.remove(i);
                    listOperando.remove(i); //removo os termos já calculados
                    j=0; //limite do loop externo
                    break; //vou somente até o primeiro cálculo depois reinicio
                }
            }
        }
        
        //Percorro o ArrayList procurando/resolvendo operandos de Mult e Div
        i=0;
        j=0;
        while(j!=1){
            j=1;
            for(i=0; i<listOperando.size(); i++){
                
                if( listOperando.get(i).charAt(0) == 'x' || listOperando.get(i).charAt(0) == '/' ){
                    listOperando.set(i-1, solveOpe(listOperando.get(i-1), listOperando.get(i), listOperando.get(i+1))); 
                    listOperando.remove(i);
                    listOperando.remove(i); //removo os termos já calculados
                    j=0; //limite do loop externo
                    break; //vou somente até o primeiro cálculo depois reinicio
                }
            }
        }
        
        //Percorro o ArrayList procurando/resolvendo operandos de Soma e Sub
        i=0;
        j=0;
        while(j!=1){
            j=1;
            for(i=0; i<listOperando.size(); i++){
                
                if( listOperando.get(i).charAt(0) == '+' || listOperando.get(i).charAt(0) == '-' && listOperando.get(i).length()==1 ){
                    listOperando.set(i-1, solveOpe(listOperando.get(i-1), listOperando.get(i), listOperando.get(i+1))); 
                    listOperando.remove(i);
                    listOperando.remove(i); //removo os termos já calculados
                    j=0; //limite do loop externo
                    break; //vou somente até o primeiro cálculo depois reinicio
                }
            }
        }
        return listOperando.toString();
    }
        
    public static String solveOpe(String termo1, String termo2, String termo3){
        float termoNum1 = Float.valueOf(termo1);
        float termoNum3 = Float.valueOf(termo3);
        float varial; 
        
        if(termo2.charAt(0)== 'x'){
            varial = termoNum1*termoNum3;
            return String.valueOf(varial);
        }
        
        if(termo2.charAt(0)== '/'){
            varial = termoNum1/termoNum3;
            return String.valueOf(varial);
        }
        
        if(termo2.charAt(0)== '+'){
            varial = termoNum1+termoNum3;
            return String.valueOf(varial);
        }
        
        if(termo2.charAt(0)== '-'){
            varial = termoNum1-termoNum3;
            return String.valueOf(varial);
        }
        
        if(termo2.charAt(0)== '^'){
            varial = (float) Math.pow(termoNum1, termoNum3);
            return String.valueOf(varial);
        }
        
        if(termo2.charAt(0)== '%'){
            varial = 100*(termoNum1/termoNum3);
            return String.valueOf(varial);
        }
        
        return String.valueOf(0.0);        
    } 
    
}
