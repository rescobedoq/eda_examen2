public class TestBST3 {
    
    public static void main(String[] args) {

        BST<Integer> bst = new BST<Integer>();
        
        try {
            bst.insert(15);
            bst.insert(9);
            bst.insert(20);
            bst.insert(6);
            bst.insert(14);
            bst.insert(17);
            bst.insert(64);
            bst.insert(13);
            bst.insert(26);
            bst.insert(72);
            System.out.println(bst.toString());
        } catch (Exception e) {
            System.out.println(e.getMessage());
            System.out.println(bst.toString());
        }        

    }
}
