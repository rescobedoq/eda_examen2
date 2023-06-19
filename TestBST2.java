public class TestBST2 {
    
    public static void main(String[] args) {

        BST<Integer> bst = new BST<Integer>();
        
        try {
            bst.insert(1);
            bst.insert(2);
            bst.insert(3);
            bst.insert(4);
            bst.insert(5);
            bst.insert(6);
            bst.insert(7);
            System.out.println(bst.toString());
        } catch (Exception e) {
            System.out.println(e.getMessage());
            System.out.println(bst.toString());
        }        

    }
}
