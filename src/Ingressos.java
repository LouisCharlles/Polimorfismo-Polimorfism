public class Ingressos {
    protected String nome,local;
    protected double preco_ingresso;

    public Ingressos(String nome,String local, double preco_ingresso){
        this.nome = nome;
        this.local = local;
        this.preco_ingresso = preco_ingresso;
    }
    protected void imprimirIngresso(){
        System.out.println("INGRESSO: "+nome+"\nValor: R$"+preco_ingresso+"\nLOCAL: "+local);
    }
}
