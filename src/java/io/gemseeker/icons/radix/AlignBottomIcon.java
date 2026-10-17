package io.gemseeker.icons.radix;

import io.gemseeker.icons.SVGIcon;
import javafx.scene.shape.SVGPath;
import javafx.scene.shape.Shape;

/**
 *
 * @author Gem Seeker
 */
public class AlignBottomIcon extends SVGIcon {
    
    public AlignBottomIcon() {
        super(DEFAULT_SIZE * 0.9, DEFAULT_SIZE);
    }
    
    public AlignBottomIcon(double size) {
        super(size * 0.9, size);
    }

    @Override
    protected Shape createShape() {
        SVGPath path = new SVGPath();
        path.setContent("M8 2C8.55228 2 9 2.44772 9 3V14H13.5C13.7761 14 14 14.2239 14 14.5C14 14.7761 13.7761 15 13.5 15H1.5C1.22386 15 1 14.7761 1 14.5C1 14.2239 1.22386 14 1.5 14H6V3C6 2.44772 6.44772 2 7 2H8Z");
        return path;
    }

}
