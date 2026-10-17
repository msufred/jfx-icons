package io.gemseeker.icons.radix;

import io.gemseeker.icons.SVGIcon;
import javafx.scene.shape.SVGPath;
import javafx.scene.shape.Shape;

/**
 *
 * @author Gem Seeker
 */
public class TriangleLeftIcon extends SVGIcon {
    
    public TriangleLeftIcon() {
        super(DEFAULT_SIZE);
    }
    
    public TriangleLeftIcon(double size) {
        super(size * 0.5, size * 0.75);
    }

    @Override
    protected Shape createShape() {
        SVGPath path = new SVGPath();
        path.setContent("M4.5 7.5L9 4L9 11L4.5 7.5Z");
        return path;
    }

}
