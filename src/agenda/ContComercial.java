package agenda;

public class ContComercial extends ContBasico {
    protected String atividade;
    protected String funcionario;

public ContComercial(String nome, String atividade, String funcionario){
    super(nome);
    this.atividade = atividade;
    this.funcionario = funcionario;
}

    @Override
    public String getDados() {
        String s = super.getDados();
        s += atividade +"\n" + "contato Sr(a):"+ funcionario;
        return s;
    }
}
