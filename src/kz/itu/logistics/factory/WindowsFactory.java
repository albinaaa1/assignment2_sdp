package kz.itu.logistics.factory;

import kz.itu.logistics.ui.Button;
import kz.itu.logistics.ui.Checkbox;
import kz.itu.logistics.ui.WindowsButton;
import kz.itu.logistics.ui.WindowsCheckbox;

public class WindowsFactory implements GUIFactory {
    @Override
    public Button createButton() {
        return new WindowsButton();
    }

    @Override
    public Checkbox createCheckbox() {
        return new WindowsCheckbox();
    }
}