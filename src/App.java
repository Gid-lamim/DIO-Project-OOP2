import funcionarios.*;
import funcionarios.models.Endereco;
import funcionarios.models.FuncionarioCLT;
import funcionarios.models.FuncionarioPJ;

public class App {
    public static void main(String[] args) {
        Endereco endereco = new Endereco("Ordália Albino Roseiro", 565,"esquina", "Santa Claudia");
        System.out.println("---------");

        FuncionarioCLT vendedor1 =
                new Vendedor("Judicléia", "3322299", 1000d, endereco, 2);

        FuncionarioCLT caixa1 =
                new OperadorDeCaixa("Jiraela","1233325",1233d, new Endereco("Ondeju Dasper Deuasbotas", 123, "nada", "Lugarnem hum" ));

        FuncionarioCLT caixa2 =
                new OperadorDeCaixa("Jiraela","1233325",1233d, new Endereco("Asmar Gura", 142, "nada", "Móka lôr" ));

        FuncionarioCLT caixa3 =
                new OperadorDeCaixa("Jude Creu" , "23456768" , 3455d , new Endereco("Ismair Genero", 2322, "nada", "Penerir da Silva" ));

        FuncionarioPJ gerente =
                new Gerente("Janio Nada de Desvair", "123123123", 20, 100, new Endereco("Panela de Pressão", 2322, "nada", "Panamera de Rebocréia" ), 12);

        System.out.println(vendedor1);
        System.out.println(caixa1);
        System.out.println(caixa2);
        System.out.println(gerente);
    }
}
