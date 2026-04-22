public class Tree<T> {

  private Nodo<T> root;

  public Tree() {
    root = null;
  }

  public void add( T x ) {
    // per ora aggiungiamo in testa
    Nodo<T> n = new Nodo<>( x );
    if (root==null) root = n;
    else {
      n.setRight(root);
      root = n;
    }
  }

  public String visita( Nodo<T> n ) {
    // visita simmetrica
    String s = "";
    if (n==null) return s;
    s += visita(n.getLeft());
    T i = n.getInfo();
    s += i + "\n";
    s += visita(n.getRight());
    return s;
  }

  @Override
  public String toString() {
    return "Contenuto dell'albero:\n" + this.visita(root);
  }

}
