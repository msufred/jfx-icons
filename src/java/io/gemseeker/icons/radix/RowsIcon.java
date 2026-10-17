package io.gemseeker.icons.radix;

import io.gemseeker.icons.SVGIcon;
import javafx.scene.shape.SVGPath;
import javafx.scene.shape.Shape;

/**
 *
 * @author Gem Seeker
 */
public class RowsIcon extends SVGIcon {
    
    public RowsIcon() {
        super(DEFAULT_SIZE);
    }
    
    public RowsIcon(double size) {
        super(size * 0.95, size);
    }

    @Override
    protected Shape createShape() {
        SVGPath path = new SVGPath();
        path.setContent("M14 12.8492L14 14.15L1 14.15L1 12.8492L14 12.8492ZM14 8.84921L14 10.15L1 10.15L1 8.84921L14 8.84921ZM14 4.84921L14 6.14999L1 6.14999L1 4.84921L14 4.84921ZM14 0.849213L14 2.14999L1 2.14999L1 0.849213L14 0.849213Z");
        return path;
    }

}
