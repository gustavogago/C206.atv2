package funcionalidade;

import java.util.HashMap;
import excecoes.ExcecaoChecked;

public class Usuario {
    private String nome;
    private String email;
    private HashMap<String, RedeSocial> redesSociais;

    public Usuario(String nome, String email, HashMap<String, RedeSocial> redesSociais) {
        this.nome = nome;
        this.email = email;
        this.redesSociais = redesSociais;
    }

    public void usarRedeSocial(String nomeRede) throws ExcecaoChecked {
        RedeSocial redeSocial = redesSociais.get(nomeRede);
        if (redeSocial != null) {
            redeSocial.postarFoto();
            redeSocial.postarVideo();
            redeSocial.postarComentario();
            // Exemplo de uso: somente as redes que implementam Compartilhamento
            if (redeSocial instanceof Compartilhamento) {
                ((Compartilhamento) redeSocial).compartilhar();
            }
            // Exemplo de uso: somente as redes que implementam VideoConferencia
            if (redeSocial instanceof VideoConferencia) {
                ((VideoConferencia) redeSocial).fazStreaming();
            }
        } else {
            System.out.println("Rede social não encontrada.");
        }
    }
}
