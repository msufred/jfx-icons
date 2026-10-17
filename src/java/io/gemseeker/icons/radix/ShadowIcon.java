package io.gemseeker.icons.radix;

import io.gemseeker.icons.SVGIcon;
import java.util.ArrayList;
import java.util.Arrays;
import javafx.geometry.Insets;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.CornerRadii;
import javafx.scene.paint.Color;
import javafx.scene.paint.CycleMethod;
import javafx.scene.paint.LinearGradient;
import javafx.scene.paint.Stop;
import javafx.scene.shape.Circle;
import javafx.scene.shape.SVGPath;
import javafx.scene.shape.Shape;

/**
 *
 * @author Gem Seeker
 */
public class ShadowIcon extends SVGIcon {

    public ShadowIcon() {
        super(DEFAULT_SIZE);
    }

    public ShadowIcon(double size) {
        super(size);
    }

    @Override
    protected Shape createShape() {
        // TODO gradient background
        Circle circle = new Circle(WIDTH / 2);
        Stop[] stops = new Stop[]{
            new Stop(0.0, Color.WHITE),
            new Stop(1.0, Color.gray(0.25))
        };
        LinearGradient gradient = new LinearGradient(0, 0, 1, 0, true, CycleMethod.NO_CYCLE, stops);
        if (mColor == lightModeColor) {
            setBackground(new Background(new BackgroundFill(gradient, CornerRadii.EMPTY, Insets.EMPTY)));
        }
        return circle;
    }

}
