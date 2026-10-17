package io.gemseeker.icons.radix;

import io.gemseeker.icons.SVGIcon;
import javafx.scene.shape.SVGPath;
import javafx.scene.shape.Shape;

/**
 *
 * @author Gem Seeker
 */
public class DividerVerticalIcon extends SVGIcon {
    
    public DividerVerticalIcon() {
        super(DEFAULT_SIZE * 0.05, DEFAULT_SIZE);
    }
    
    public DividerVerticalIcon(double size) {
        super(size * 0.05, size);
    }

    @Override
    protected Shape createShape() {
        SVGPath path = new SVGPath();
        path.setContent("M7.5 2C7.77614 2 8 2.22386 8 2.5V12.5C8 12.7761 7.77614 13 7.5 13C7.22386 13 7 12.7761 7 12.5V2.5C7 2.22386 7.22386 2 7.5 2Z");
        return path;
    }

}
