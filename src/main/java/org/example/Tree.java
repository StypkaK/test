package org.example;

public class Tree {

    Node root = null;
    int min = 0;
    int max = 0;

    public void add(int value){
        if(this.root==null){
            this.root = new Node();
            this.root.setValue(value);
        }
        addNode(value, this.root);

    }

    public boolean contains(Node node, int value){
        if(node == null){
            return false;
        }
        if(node.getValue() == value){
            return true;
        }
            boolean res1 = contains(node.getLeft(), value);
            if(res1) return true;

            boolean res2 = contains(node.getRight(), value);
            return res2;

    }


    public void addNode(int value, Node node){
        if(node.getValue() < value){
            this.max = value;
            if(node.getRight() == null){
                node.setRight(new Node());
                node.getRight().setValue(value);
            }
            else addNode(value, node.getRight());
        }
        if(node.getValue() > value){
            this.min = value;
            if(node.getLeft() == null){
                node.setLeft(new Node());
                node.getLeft().setValue(value);
            }
            else addNode(value, node.getLeft());
        }
        if(node.getValue() == value){
            return;
        }
    }
    public int max (){
        System.out.println(this.max);
        return max;
    }

    public int min (){
        System.out.println(this.min);
        return min;
    }

}
