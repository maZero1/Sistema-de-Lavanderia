package Model;

public class Peca {
//- id: Long - nome: String - preco: Double + alterarPreco()
    private Long id;
    private String nome;
    private double preco;

    public Peca(Long id, String nome, double preco){
        this.id = id;
        this.nome = nome;
        this.preco = preco;
    }
    public boolean alterarPreco(double preco){
        if(preco < 0){
            this.preco = preco;
            return true;
        }else{
            return false;
        }
    }
}
