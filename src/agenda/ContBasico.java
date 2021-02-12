package agenda;

import java.util.ArrayList;

abstract public class ContBasico {
    protected String nome;
    protected ArrayList<Telefone>telefones;
    
    public ContBasico(){
        nome = "";
        telefones = new ArrayList();
    }
    
    public ContBasico(String nome){
        this.nome = nome;
        telefones = new ArrayList();
    }
    
    public String getNome(){
        return nome;
    }
    
    public void setNome(String nome){
        this.nome = nome;
    }
    
    public void setTelefone(Telefone x){
        telefones.add(x);
    }
    public String getDados(){
        String s = nome+"\n";
        for(Telefone t:telefones){
            s+=t.getTelefone()+"\n";
        }
        return s;
    }
}
