package agenda;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class Contato extends ContBasico {
    protected Calendar nascimento;
    
    public Contato(String nome, Calendar nascimento){
        super(nome);
        this.nascimento = nascimento;
    }

    @Override
    public String getDados() {
        return super.getDados()+"Nascido em "+ 
                nascimento.get(Calendar.DATE)+"/"+
                nascimento.get(Calendar.MONTH)+"/"+
                nascimento.get(Calendar.YEAR)+"\nIdade:"; //To change body of generated methods, choose Tools | Templates.
    }
    public int getIdade(){
        Calendar hoje = new GregorianCalendar();
        int idade = hoje.get(Calendar.YEAR) - nascimento.get(Calendar.YEAR);
        hoje.set(Calendar.YEAR, nascimento.get(Calendar.YEAR));
        if(hoje.before(nascimento))
            idade--;
        return idade;
    }
    
}
