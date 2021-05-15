
package parte2;

public class Var {
    
//Variáveis usadas na lista do anúncio
    private String nome;
    private String cliente;
    private String dataIni;
    private String dataFim;
    private Double inves;


//Ponteiros das variáveis da lista
    public Var(String nome, String cliente, String dataIni, String dataFim, Double inves) {
        this.nome = nome;
        this.cliente = cliente;
        this.dataIni = dataIni;
        this.dataFim = dataFim;
        this.inves = inves;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public String getDataIni() {
        return dataIni;
    }

    public void setDataIni(String dataIni) {
        this.dataIni = dataIni;
    }

    public String getDataFim() {
        return dataFim;
    }

    public void setDataFim(String dataFim) {
        this.dataFim = dataFim;
    }

    public Double getInves() {
        return inves;
    }

    public void setValorInves(Double Inves) {
        this.inves = Inves;
    }
   
    
}
