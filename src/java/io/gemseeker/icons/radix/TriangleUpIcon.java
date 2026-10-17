package io.gemseeker.icons.radix;

import io.gemseeker.icons.SVGIcon;
import javafx.scene.shape.SVGPath;
import javafx.scene.shape.Shape;

/**
 *
 * @author Gem Seeker
 */
public class TriangleUpIcon extends SVGIcon {
    
    public TriangleUpIcon() {
        super(DEFAULT_SIZE);
    }
    
    public TriangleUpIcon(double size) {
        super(size * 0.75, size * 0.5);
    }

    @Override
    protected Shape createShape() {
        SVGPath path = new SVGPath();
        path.setContent("M7.5 4.5L4 9H11L7.5 4.5Z");
        return path;
    }

}
