package io.gemseeker.icons.radix;

import io.gemseeker.icons.SVGIcon;
import javafx.scene.shape.SVGPath;
import javafx.scene.shape.Shape;

/**
 *
 * @author Gem Seeker
 */
public class DotFilledIcon extends SVGIcon {
    
    public DotFilledIcon() {
        super(DEFAULT_SIZE);
    }
    
    public DotFilledIcon(double size) {
        super(size * 0.4);
    }

    @Override
    protected Shape createShape() {
        SVGPath path = new SVGPath();
        path.setContent("M7.5 5.125C8.81168 5.125 9.875 6.18832 9.875 7.5C9.875 8.81168 8.81168 9.875 7.5 9.875C6.18832 9.875 5.125 8.81168 5.125 7.5C5.125 6.18832 6.18832 5.125 7.5 5.125Z");
        return path;
    }

}
