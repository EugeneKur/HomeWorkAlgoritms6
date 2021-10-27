package homework6;

public class Test {
    public static void main(String[] args) {

        Tree<Integer> tree1 = new TreeImpl<>();
        Tree<Integer> tree2 = new TreeImpl<>();
        Tree<Integer> tree3 = new TreeImpl<>();
        Tree<Integer> tree4 = new TreeImpl<>();
        Tree<Integer> tree5 = new TreeImpl<>();
        Tree<Integer> tree6 = new TreeImpl<>();
        Tree<Integer> tree7 = new TreeImpl<>();
        Tree<Integer> tree8 = new TreeImpl<>();
        Tree<Integer> tree9 = new TreeImpl<>();
        Tree<Integer> tree10 = new TreeImpl<>();
        Tree<Integer> tree11 = new TreeImpl<>();
        Tree<Integer> tree12 = new TreeImpl<>();
        Tree<Integer> tree13 = new TreeImpl<>();
        Tree<Integer> tree14 = new TreeImpl<>();
        Tree<Integer> tree15 = new TreeImpl<>();
        Tree<Integer> tree16 = new TreeImpl<>();
        Tree<Integer> tree17 = new TreeImpl<>();
        Tree<Integer> tree18 = new TreeImpl<>();
        Tree<Integer> tree19 = new TreeImpl<>();
        Tree<Integer> tree20 = new TreeImpl<>();

        generateRandomTree(tree1);
        generateRandomTree(tree2);
        generateRandomTree(tree3);
        generateRandomTree(tree4);
        generateRandomTree(tree5);
        generateRandomTree(tree6);
        generateRandomTree(tree7);
        generateRandomTree(tree8);
        generateRandomTree(tree9);
        generateRandomTree(tree10);
        generateRandomTree(tree11);
        generateRandomTree(tree12);
        generateRandomTree(tree13);
        generateRandomTree(tree14);
        generateRandomTree(tree15);
        generateRandomTree(tree16);
        generateRandomTree(tree17);
        generateRandomTree(tree18);
        generateRandomTree(tree19);
        generateRandomTree(tree20);

        tree1.display();
        tree2.display();
        tree3.display();
        tree4.display();
        tree5.display();
        tree6.display();
        tree7.display();
        tree8.display();
        tree9.display();
        tree10.display();
        tree11.display();
        tree12.display();
        tree13.display();
        tree14.display();
        tree15.display();
        tree16.display();
        tree17.display();
        tree18.display();
        tree19.display();
        tree20.display();

 //       tree1.isBalanced((Node) tree1); - Не понимаю почему не могу передать дерево



    }

    private static void generateRandomTree(Tree<Integer> tree) {  //добавил к коду урока 6
        int level = 0;
        while (level < 5) {
            int a = -25 + (int)(Math.random()*((25 + 25) + 1));
            tree.add(a);
            level = tree.getLevel(a);
        }
    }


}
