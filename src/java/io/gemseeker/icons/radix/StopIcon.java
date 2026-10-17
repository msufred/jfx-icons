package io.gemseeker.icons.radix;

import io.gemseeker.icons.SVGIcon;
import javafx.scene.shape.SVGPath;
import javafx.scene.shape.Shape;

/**
 *
 * @author Gem Seeker
 */
public class StopIcon extends SVGIcon {
    
    public StopIcon() {
        super(DEFAULT_SIZE);
    }
    
    public StopIcon(double size) {
        super(size, size);
    }

    @Override
    protected Shape createShape() {
        SVGPath path = new SVGPath();
        path.setContent("M12 2C12.5523 2 13 2.44772 13 3V12C13 12.5523 12.5523 13 12 13H3C2.44772 13 2 12.5523 2 12V3C2 2.44772 2.44772 2 3 2H12ZM3 12H12V3H3V12Z");
        return path;
    }

}
