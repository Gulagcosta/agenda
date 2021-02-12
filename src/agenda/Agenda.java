package agenda;

import java.util.ArrayList;

public class Agenda {
    
    private ArrayList<ContBasico>contatos;
    
    Agenda(){
        contatos = new ArrayList();
    }
    public void inserir(ContBasico c){
        contatos.add(c);
    }
    
    public ContBasico buscar(String nome){
        for(int i = 0; i<contatos.size(); i++){
            ContBasico c = contatos.get(i);
            if(c.getNome().equalsIgnoreCase(nome))
                return contatos.get(i);
        }
        return null;
    }
    public ContBasico buscar(int pos){
        if(pos >= 0 && pos < contatos.size()){
            return contatos.get(pos);
        }
        return null;
    }
    
    public EContato buscarEmail(String email){
        for(int i=0; i<contatos.size(); i++){
            if(contatos.get(i) instanceof EContato){
                EContato c = (EContato)contatos.get(i);
                if(c.getEmail().equalsIgnoreCase(email))
                return (EContato)contatos.get(i);
            }
        }
        return null;
    }
    
    public Contato[] buscarGeral(String palavraChave){
        ArrayList<ContBasico>todos = new ArrayList();
        for(int i=0; i<contatos.size(); i++){
            ContBasico c = contatos.get(i);
            if(c.getDados().contains(palavraChave))
                todos.add(c);
        }
        Contato[] vet = new Contato [todos.size()];
        return (todos.toArray(vet));
    }
    public Contato [] buscarTodos(){
        Contato[] vet = new Contato[contatos.size()];
        return (contatos.toArray(vet));
    }
    public int getQuantidade(){
        return contatos.size();
    }
}
