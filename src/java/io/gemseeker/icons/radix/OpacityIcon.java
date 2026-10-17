package io.gemseeker.icons.radix;

import io.gemseeker.icons.SVGIcon;
import javafx.scene.shape.SVGPath;
import javafx.scene.shape.Shape;

/**
 *
 * @author Gem Seeker
 */
public class OpacityIcon extends SVGIcon {
    
    public OpacityIcon() {
        super(DEFAULT_SIZE);
    }
    
    public OpacityIcon(double size) {
        super(size * 0.75, size);
    }

    @Override
    protected Shape createShape() {
        SVGPath path = new SVGPath();
        path.setContent("M7.5 1.5C10.5 4.25 12 6.5 12 9C12 11.4853 9.98528 13.5 7.5 13.5C5.01472 13.5 3 11.4853 3 9C3 6.5 4.5 4.25 7.5 1.5ZM7.5 2.87598C5.02773 5.27379 4 7.11234 4 9C4 10.933 5.567 12.5 7.5 12.5C9.433 12.5 11 10.933 11 9C11 7.11234 9.97227 5.27379 7.5 2.87598Z");
        return path;
    }

}
