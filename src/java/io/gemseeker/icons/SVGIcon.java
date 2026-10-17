package io.gemseeker.icons;

import javafx.geometry.Insets;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.CornerRadii;
import javafx.scene.layout.Region;
import javafx.scene.paint.Color;
import javafx.scene.shape.Shape;

/**
 *
 * @author Gem Seeker
 */
public abstract class SVGIcon extends Region {
    
    protected static final double DEFAULT_SIZE = 12;
    protected double WIDTH = DEFAULT_SIZE;
    protected double HEIGHT = DEFAULT_SIZE;
    
    protected Background lightModeColor = new Background(new BackgroundFill(Color.gray(0.25), CornerRadii.EMPTY, Insets.EMPTY));
    protected Background darkModeColor = new Background(new BackgroundFill(Color.WHITE, CornerRadii.EMPTY, Insets.EMPTY));
    protected Background mColor = lightModeColor;
    
    public SVGIcon() {
        this(DEFAULT_SIZE);
    }
    
    public SVGIcon(double size) {
        this(size, size);
    }
    
    public SVGIcon(double width, double height) {
        super();
        setPrefSize(width, height);
        setMinSize(width, height);
        setMaxSize(width, height);
        setShape(createShape());
        // setBackground(new Background(new BackgroundFill(Color.gray(0.25), CornerRadii.EMPTY, Insets.EMPTY)));
        setBackground(mColor);
        this.WIDTH = width;
        this.HEIGHT = height;
    }
    
    protected abstract Shape createShape();
    
    public void setLightModeColor(Background color) {
        this.lightModeColor = color;
    }
    
    public void setDarkModeColor(Background color) {
        this.darkModeColor = color;
    }
    
    public void toggleColor() {
        if (mColor == lightModeColor) mColor = darkModeColor;
        else mColor = lightModeColor;
        setBackground(mColor);
    }
    
    public void setColorMode(String mode) {
        if (!mode.isEmpty()) {
            if (mode.toLowerCase().contains("dark")) {
                mColor = darkModeColor;
            } else {
                mColor = lightModeColor;
            }
            setBackground(mColor);
        }
    }
}
