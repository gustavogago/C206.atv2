package funcionalidade;

public class Twitter extends RedeSocial {
    @Override
    public void postarFoto() {
        System.out.println("postou uma foto no Twitter!");
    }

    @Override
    public void postarVideo() {
        System.out.println("postou um vídeo no Twitter!");
    }

    @Override
    public void postarComentario() {
        System.out.println("postou um comentário no Twitter!");
    }

    @Override
    public void curtirPublicacao() {
        System.out.println("curtiu uma publicação no Twitter!");
    }
}
