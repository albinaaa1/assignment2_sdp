package kz.itu.logistics.factory;

import kz.itu.logistics.ui.Button;
import kz.itu.logistics.ui.Checkbox;
import kz.itu.logistics.ui.MacOSButton;
import kz.itu.logistics.ui.MacOSCheckbox;

public class MacOSFactory implements GUIFactory {
    @Override
    public Button createButton() {
        return new MacOSButton();
    }

    @Override
    public Checkbox createCheckbox() {
        return new MacOSCheckbox();
    }
}