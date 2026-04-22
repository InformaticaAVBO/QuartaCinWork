public class Nodo<T> {

  private T info;
  private Nodo<T> left, right;

  public Nodo( T info ) {
    this.info = info;
    left = right = null;
  }

  public T getInfo() {
    return info;
  }

  public void setInfo(T info) {
    this.info = info;
  }

  public Nodo<T> getLeft() {
    return left;
  }

  public void setLeft(Nodo<T> left) {
    this.left = left;
  }

  public Nodo<T> getRight() {
    return right;
  }

  public void setRight(Nodo<T> right) {
    this.right = right;
  }

  @Override
  public String toString() {
    return "" + info;
  }

}
