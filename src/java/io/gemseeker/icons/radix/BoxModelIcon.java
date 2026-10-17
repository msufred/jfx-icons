package io.gemseeker.icons.radix;

import io.gemseeker.icons.SVGIcon;
import javafx.scene.shape.SVGPath;
import javafx.scene.shape.Shape;

/**
 *
 * @author Gem Seeker
 */
public class BoxModelIcon extends SVGIcon {
    
    public BoxModelIcon() {
        super(DEFAULT_SIZE);
    }
    
    public BoxModelIcon(double size) {
        super(size);
    }

    @Override
    protected Shape createShape() {
        SVGPath path = new SVGPath();
        path.setContent("M13 1C13.5523 1 14 1.44772 14 2V13C14 13.5523 13.5523 14 13 14H2C1.44772 14 1 13.5523 1 13V2C1 1.44772 1.44772 1 2 1H13ZM2 13H13V2H2V13ZM10.6006 4.00977C10.8285 4.0563 11 4.25829 11 4.5V10.5C11 10.7761 10.7761 11 10.5 11H4.5C4.22386 11 4.00001 10.7761 4 10.5V4.5L4.00977 4.39941C4.05629 4.17145 4.25829 4 4.5 4H10.5L10.6006 4.00977ZM5 10H10V5H5V10Z");
        return path;
    }

}
