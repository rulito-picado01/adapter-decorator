package composite1ADAPTER;

public interface Panel {

    public void pintarCirculo(Coordenada Coordenada, int radio);

    public void pintarTexto(Coordenada Coordenada, String texto);

    public void pintarLinea(Coordenada Coordenada, int longitud);
}
