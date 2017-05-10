package Factory;

import javax.swing.JPanel;

public abstract class AbstractFactory {
public abstract JPanel getColor(int color);
public abstract JPanel getShape();
}
