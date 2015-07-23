package edu.sust.test.Composite_Pattern;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by envy15
 * on 2015/7/23 0023.
 * used by TestJava8_Two
 * 作为root和leaf之间的分支用来连接的树枝
 */
public class Composite extends Component {
    List<Component> componentList = new ArrayList<Component>();

    public Composite(String name) {
        super(name);
    }

    public Composite() {
    }

    @Override
    public void Add(Component component) {
        componentList.add(component);
    }

    @Override
    public void Remove(Component component) {
        componentList.remove(component);
    }

    @Override
    public void Display(int depth) {
        for (int i = 0; i < depth; i++) System.out.print("-");
        System.out.println(name);
        for (Component component : componentList) component.Display(depth + 2);
    }
}
