package agenda;

import exceptions.ObjNull;
import java.util.GregorianCalendar;

public class Main {
    static void mostraDados(ContBasico obj){
        System.out.println(obj.getDados());
        if(obj instanceof Contato)
            System.out.println(((Contato)obj).getIdade());
            System.out.println("to com fome");
    }
    
    public static void main(String[] args) throws ObjNull {
        Agenda a;
        a = new Agenda();
        
        Contato cb;
           cb= new Contato("Teste",new GregorianCalendar(1980,10,28));
           cb.setTelefone(new Telefone("3333-5555 ","Telefone residencial"));
           cb.setTelefone(new Telefone("99111-1111 ","Telefone celular"));
           a.inserir(cb);

           ContComercial cc;
           cc = new ContComercial("Lanchonete ", "Lanches", "Lan");
           cc.setTelefone(new Telefone("2222-0000 "," Telefone residencial"));
           a.inserir(cc);
           
           a.inserir(new EContato("Exemplo",new GregorianCalendar(1975,2,22),
                "exemplo@gmail.com","www.exemplo.com.br"));
           
           ContBasico obj=a.buscar("Teste");
           
           if(obj!=null)
            mostraDados(obj);
           else
            throw new ObjNull("Contato não encontrado!");
    }
    
}
