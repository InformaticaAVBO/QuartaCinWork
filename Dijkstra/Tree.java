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

  

  @Override
  public String toString() {
    String s = "Contenuto dell'albero:\n";

    return "Tree [root=" + root + "]";
  }

  

}
