public class Node<T> {

  public T data;
  public Node<T> left;
  public Node<T> right;
  

  public Node(T data, Node<T> left, Node<T> right) {
    this.data = data;
    this.left = left;
    this.right = right;
  } 

  public Node(T data) {
    this(data, null, null);
  }

  public void setData(T data){
    this.data = data;
  }

  public T getData(){
    return this.data;
  }

  public void setLeft(Node<T> left){
    this.left = left;
  }

  public Node<T> getLeft(){
    return this.left;
  }

  public void setRight(Node<T> right){
    this.right = right;
  }

  public Node<T> getRight(){
    return this.right;
  }

}
