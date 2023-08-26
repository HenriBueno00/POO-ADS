package appproduto;
import java.util.Scanner;
import org.me.Produto.Produto;
public class AppProduto {
    public static void main(String[] args) {
        Produto p1 = new Produto();
        Scanner leia = new Scanner(System.in);
        String desc;
        int qtde;
        double preco;
            System.out.println("Digite a descrição do produto: ");
            desc = leia.nextLine();
            System.out.println("Digite a quantidade: ");
            qtde = leia.nextInt();
            System.out.println("Digite o preço: ");
            preco = leia.nextDouble();
            
            p1.setDescricao(desc);
            p1.setQtde(qtde);
            p1.setPreco(preco);
            
            System.out.printf("Descrição do Produto %s \n", p1.getDescricao());
            System.out.printf("Quantidade do Produto %s \n", p1.getQtde());
            System.out.printf("Preço do Produto %s \n", p1.getPreco());
            
    }
}
