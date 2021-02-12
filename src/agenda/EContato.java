package agenda;

import java.util.Calendar;

public class EContato extends Contato {
    protected String email, homepage;
    
    public EContato(String nome, Calendar nascimento, String email, String hp){
        super(nome, nascimento);
        this.email = email;
        homepage = hp;
    }

    @Override
    public String getDados() {
        return super.getDados()+"email:" +email+
                "\nhomeage:" +homepage+ "\nIdade:"; //To change body of generated methods, choose Tools | Templates.
    }
    
    public String getEmail(){
        return email;
    }
    
    public String getHomepage(){
        return homepage;
    }
    
}
