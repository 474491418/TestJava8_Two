package edu.sust.test.Composite_Pattern;

/**
 * Created by envy15
 * on 2015/7/23 0023.
 * used by TestJava8_Two
 * 叶子节点无法继续添加操作，为根节点
 */
public class Leaf extends Component {
    public Leaf(String name) {
        super(name);
    }

    public Leaf() {
    }

    @Override
    public void Add(Component component) {
        System.out.println("This is leaf,cannot add any one");
    }

    @Override
    public void Remove(Component component) {
        System.out.println("This is leaf,cannot remove any one");
    }

    @Override
    public void Display(int depth) {
        for (int i = 0; i < depth; i++) System.out.print("-");
        System.out.println(name);
    }
}
