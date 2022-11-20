package org.example;

public class New {
    public static void main(String[] args) {
        Tree tree = new Tree();


        tree.add(4);
        tree.add(5);
        tree.add(1);
        tree.add(10);

        System.out.println(tree.contains(tree.root, 2));
        tree.min();
        tree.max();
    }
}
