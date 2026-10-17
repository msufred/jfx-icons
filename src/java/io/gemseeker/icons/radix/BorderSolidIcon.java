package io.gemseeker.icons.radix;

import io.gemseeker.icons.SVGIcon;
import javafx.scene.shape.SVGPath;
import javafx.scene.shape.Shape;

/**
 *
 * @author Gem Seeker
 */
public class BorderSolidIcon extends SVGIcon {
    
    public BorderSolidIcon() {
        super(DEFAULT_SIZE, DEFAULT_SIZE * 0.075);
    }
    
    public BorderSolidIcon(double size) {
        super(size, size * 0.075);
    }

    @Override
    protected Shape createShape() {
        SVGPath path = new SVGPath();
        path.setContent("M13.3506 7.00977C13.5786 7.05629 13.75 7.25829 13.75 7.5C13.75 7.74171 13.5786 7.94371 13.3506 7.99023L13.25 8H1.75C1.47386 8 1.25 7.77614 1.25 7.5C1.25 7.22386 1.47386 7 1.75 7H13.25L13.3506 7.00977Z");
        return path;
    }

}
