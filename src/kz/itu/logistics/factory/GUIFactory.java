package kz.itu.logistics.factory;

import kz.itu.logistics.ui.Button;
import kz.itu.logistics.ui.Checkbox;

public interface GUIFactory {
    Button createButton();
    Checkbox createCheckbox();
}