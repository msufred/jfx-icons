package io.gemseeker.icons.radix;

import io.gemseeker.icons.SVGIcon;
import javafx.scene.shape.SVGPath;
import javafx.scene.shape.Shape;

/**
 *
 * @author Gem Seeker
 */
public class AllSidesIcon extends SVGIcon {
    
    public AllSidesIcon() {
        super(DEFAULT_SIZE);
    }
    
    public AllSidesIcon(double size) {
        super(size);
    }

    @Override
    protected Shape createShape() {
        SVGPath path = new SVGPath();
        path.setContent("M7.5 14.25L5.25 12H9.75L7.5 14.25ZM3 9.75L0.75 7.5L3 5.25V9.75ZM14.25 7.5L12 9.75V5.25L14.25 7.5ZM9.75 3H5.25L7.5 0.75L9.75 3Z");
        return path;
    }

}
