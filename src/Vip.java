public class Vip extends Ingressos{
    protected int numero_camarote;
    protected boolean open_bar;

    public Vip(String nome, String local, double preco_ingresso, int numero_camarote, boolean open_bar){
        super(nome,local,preco_ingresso);
        this.numero_camarote = numero_camarote;
        this.open_bar = open_bar;
    }


    protected void imprimirIngresso() {
        if (!open_bar){
            System.out.println("A festa não é open bar e o número do camarote é: "+this.numero_camarote);
            System.out.println("INGRESSO: "+nome+"\nValor: R$"+preco_ingresso+"\nLOCAL: "+local);
        }
        else {
            System.out.println("BORAAAA!!!! A FESTA é open bar e o número do camarote é: "+this.numero_camarote);
            System.out.println("INGRESSO: "+nome+"\nValor: R$"+preco_ingresso+"\nLOCAL: "+local);
        }
    }
}
