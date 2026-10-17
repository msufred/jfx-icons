package io.gemseeker.icons.radix;

import io.gemseeker.icons.SVGIcon;
import javafx.scene.shape.SVGPath;
import javafx.scene.shape.Shape;

/**
 *
 * @author Gem Seeker
 */
public class SquareIcon extends SVGIcon {
    
    public SquareIcon() {
        super(DEFAULT_SIZE);
    }
    
    public SquareIcon(double size) {
        super(size);
    }

    @Override
    protected Shape createShape() {
        SVGPath path = new SVGPath();
        path.setContent("M14 14H1V1H14V14ZM2 13H13V2H2V13Z");
        return path;
    }

}
