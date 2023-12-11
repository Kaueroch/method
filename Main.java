import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
     Scanner scan = new Scanner(System.in);
     int valorSalario;
    String nome;
    String Sobrenome;
    String emprego;
    System.out.println("Qual o seu nome?");
    nome = scan.nextLine();
    System.out.println("Qual o seu Sobrenome?");
    Sobrenome = scan.nextLine();
    //posso usar nextLine() ao inves de ToString(), funciona bem melhor para Strings.
    nomecompleto(nome,Sobrenome);
    System.out.println("Qual o seu emprego?");
    emprego = scan.nextLine();
    emprego(emprego);
    //nao precisa colocar o tipo de variavel quando for chamar por conta que já esta sendo definida
    //dentro do escopo do metodo e da Main.
    System.out.println("digite o seu salario");
    valorSalario = scan.nextInt();
    verificaSalario(valorSalario);
    }
    //colocar a função com a variavel igual ao da variavel que vai computar o valor,
    // funciona muito bem para mostrar na tela
    public static void verificaSalario(int valorSalario){
        if(valorSalario > 5000){
            System.out.println("Salário alto");
        } else if (valorSalario <= 2999  || valorSalario <= 2100) {
            System.out.println("Salário médio");
        }
        else {
            System.out.println("Salário Minimo");
        }
    }
    public static void nomecompleto(String nome,String Sobrenome){
        System.out.println("Seu nome completo é: " + nome + "" + Sobrenome);
    }
    public static String emprego(String emprego){
        return "Seu emprego é: " + emprego;
    }
    //o uso de public static void indica a visibilidade, a natureza estática e o tipo de retorno do método
    //public: É um modificador de acesso que indica que o método pode ser acessado de qualquer lugar,
    // seja dentro da mesma classe, em classes do mesmo pacote, ou em classes de pacotes diferentes.
    //static: Indica que o método pertence à classe, não a instâncias específicas dessa classe.
    // Isso significa que o método pode ser chamado sem criar uma instância da classe.
    //void: Indica que o método não retorna nenhum valor. Se um método retorna um valor,
    // você especificaria o tipo de dado que está sendo retornado (por exemplo, int, String, etc.).
    //Se você se deparar com algo como static void na prática,
    // é provável que seja um erro de sintaxe ou um equívoco na declaração do método.
}
