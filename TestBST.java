public class TestBST {
    
    public static void main(String[] args) {

        BST<String> bst = new BST<String>();
        
        try {
            bst.insert("R");
            bst.insert("I");
            bst.insert("C");
            bst.insert("H");
            bst.insert("A");
            bst.insert("R");
            bst.insert("T");
            System.out.println(bst.toString());
        } catch (Exception e) {
            System.out.println(e.getMessage());
            System.out.println(bst.toString());
        }        

    }
}
