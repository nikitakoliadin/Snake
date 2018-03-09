package com.game.snake.view.swing.gui.mainmenu.component;

import lombok.Getter;
import lombok.NonNull;
import lombok.Setter;

import javax.swing.*;
import java.awt.*;

/**
 * @author Koliadin Nikita
 * @version 1.14
 */
public class LabelTop implements MainMenuComponent {

    private final Container container;
    private final GridBagConstraints gridBagConstraints;

    private JLabel jLabelTop;

    @Getter @Setter private String resourceName = String.valueOf("/MainMenuTop.gif");

    public LabelTop(@NonNull final Container container,
                    @NonNull final GridBagConstraints gridBagConstraints) {
        this.container = container;
        this.gridBagConstraints = gridBagConstraints;
    }

    @Override
    public void init() {
        loadResource();
        gridBagConstraints.gridy++;
        gridBagConstraints.insets = new Insets(50, 0, 0, 0);
        container.add(jLabelTop, gridBagConstraints);
    }

    @Override
    public void setAction() {
        /* Do nothing */
    }

    private void loadResource() {
        if (jLabelTop == null) {
            jLabelTop = new JLabel(new ImageIcon(getClass().getResource(resourceName)));
        }
    }
}
