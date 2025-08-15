package funcionarioo;
import funcionarioo.Funcionario;   
public class Master {
    public static void main (String args[]) {
        Funcionario f1 = new Funcionario();
        f1.cadastro("João", "Desenvolvedor", 5000, 30);
        f1.imprimir();
    }
}
