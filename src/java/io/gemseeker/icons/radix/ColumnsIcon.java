package io.gemseeker.icons.radix;

import io.gemseeker.icons.SVGIcon;
import javafx.scene.shape.SVGPath;
import javafx.scene.shape.Shape;

/**
 *
 * @author Gem Seeker
 */
public class ColumnsIcon extends SVGIcon {
    
    public ColumnsIcon() {
        super(DEFAULT_SIZE);
    }
    
    public ColumnsIcon(double size) {
        super(size, size * 0.95);
    }

    @Override
    protected Shape createShape() {
        SVGPath path = new SVGPath();
        path.setContent("M2.15079 14H0.850006V1H2.15079V14ZM6.15079 14H4.85001V1H6.15079V14ZM10.1508 14H8.85001V1H10.1508V14ZM14.1508 14H12.85V1H14.1508V14Z");
        return path;
    }

}
