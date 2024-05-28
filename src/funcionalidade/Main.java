package funcionalidade;

import excecoes.ExcecaoChecked;
import excecoes.ExcecaoUnchecked;

import java.util.HashMap;

public class Main {
    public static void main(String[] args) {

        try {

            // Criação das redes sociais
            RedeSocial facebook = new Facebook();
            RedeSocial twitter = new Twitter();
            RedeSocial instagram = new Instagram();
            RedeSocial googlePlus = new GooglePlus();

            // Adiciona as redes sociais ao HashMap
            HashMap<String, RedeSocial> redesSociais = new HashMap<>();
            redesSociais.put("Facebook", facebook);
            redesSociais.put("Twitter", twitter);
            redesSociais.put("Instagram", instagram);
            redesSociais.put("Google Plus", googlePlus);

            // Criação do usuário com as redes sociais
            Usuario usuario = new Usuario("Wellington Rato", "WellingtonRato@gmail.com", redesSociais);

            // Uso das redes sociais
            usuario.usarRedeSocial("Facebook");
            usuario.usarRedeSocial("Twitter");
            usuario.usarRedeSocial("Instagram");
            usuario.usarRedeSocial("Google Plus");



        } catch (ExcecaoChecked e ) {
            System.out.println("Tratando exceção: " + e.getMessage());
        }


    }
}
