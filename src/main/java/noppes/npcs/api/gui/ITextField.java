//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package noppes.npcs.api.gui;

public interface ITextField extends ICustomGuiComponent {
    int getWidth();

    int getHeight();

    ITextField setSize(int width, int height);

    String getText();

    ITextField setText(String text);
}
