package io.gemseeker.icons.radix;

import io.gemseeker.icons.SVGIcon;
import javafx.scene.shape.SVGPath;
import javafx.scene.shape.Shape;

/**
 *
 * @author Gem Seeker
 */
public class MinusIcon extends SVGIcon {
    
    public MinusIcon() {
        super(DEFAULT_SIZE);
    }
    
    public MinusIcon(double size) {
        super(size, size * 0.075);
    }

    @Override
    protected Shape createShape() {
        SVGPath path = new SVGPath();
        path.setContent("M12.25 7C12.5261 7 12.75 7.22386 12.75 7.5C12.75 7.77614 12.5261 8 12.25 8H2.75C2.47386 8 2.25 7.77614 2.25 7.5C2.25 7.22386 2.47386 7 2.75 7H12.25Z");
        return path;
    }

}
