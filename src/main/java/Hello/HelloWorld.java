package Hello;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class HelloWorld {

    public static void main(String[] args) {
       String texto="este é um texto ";
        String texto2 ="ddfdfdgdg";

        User usuario = new User();
        usuario.nome = "rrsrererr";
        usuario.cpf = 333345555;

        User usuario2 = new User();
        usuario2.nome = "teste";
        usuario2.cpf = 6666;

        List<User> usuarios = new ArrayList<>();
        usuarios.add(usuario);
        usuarios.add(usuario2);

        usuarios.forEach(user -> {
            print(user.nome);
            print(user.cpf.toString());
        });

    }

    private static void print(final String texto) {
        System.out.println(texto);
    }
}
