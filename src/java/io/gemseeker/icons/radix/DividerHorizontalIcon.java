package io.gemseeker.icons.radix;

import io.gemseeker.icons.SVGIcon;
import javafx.scene.shape.SVGPath;
import javafx.scene.shape.Shape;

/**
 *
 * @author Gem Seeker
 */
public class DividerHorizontalIcon extends SVGIcon {
    
    public DividerHorizontalIcon() {
        super(DEFAULT_SIZE, DEFAULT_SIZE * 0.05);
    }
    
    public DividerHorizontalIcon(double size) {
        super(size, size * 0.05);
    }

    @Override
    protected Shape createShape() {
        SVGPath path = new SVGPath();
        path.setContent("M12.5 7C12.7761 7 13 7.22386 13 7.5C13 7.77614 12.7761 8 12.5 8H2.5C2.22386 8 2 7.77614 2 7.5C2 7.22386 2.22386 7 2.5 7H12.5Z");
        return path;
    }

}
