package io.gemseeker.icons.radix;

import io.gemseeker.icons.SVGIcon;
import javafx.scene.shape.SVGPath;
import javafx.scene.shape.Shape;

/**
 *
 * @author Gem Seeker
 */
public class TriangleRightIcon extends SVGIcon {
    
    public TriangleRightIcon() {
        super(DEFAULT_SIZE);
    }
    
    public TriangleRightIcon(double size) {
        super(size * 0.5, size * 0.75);
    }

    @Override
    protected Shape createShape() {
        SVGPath path = new SVGPath();
        path.setContent("M10.5 7.5L6 11L6 4L10.5 7.5Z");
        return path;
    }

}
