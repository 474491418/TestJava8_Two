package edu.sust.test.Composite_Pattern;

/**
 * Created by envy15
 * on 2015/7/23 0023.
 * used by TestJava8_Two
 */
public class Test {
    public static void main(String[] args) {
        Composite root = new Composite("Root");
        root.Add(new Leaf("Leaf A"));
        root.Add(new Leaf("Leaf B"));
        Composite branchX = new Composite("Branch X");
        branchX.Add(new Leaf("Leaf XA"));
        branchX.Add(new Leaf("Leaf Xb"));
        Composite branchXX = new Composite("Branch XX");
        branchXX.Add(new Leaf("Leaf XXA"));
        branchXX.Add(new Leaf("Leaf XXb"));
        branchX.Add(branchXX);

        root.Add(branchX);
        root.Add(new Leaf("Leaf C"));
        root.Display(1);
    }
}
