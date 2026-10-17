package io.gemseeker.icons.radix;

import io.gemseeker.icons.SVGIcon;
import javafx.scene.shape.SVGPath;
import javafx.scene.shape.Shape;

/**
 *
 * @author Gem Seeker
 */
public class PilcrowIcon extends SVGIcon {
    
    public PilcrowIcon() {
        super(DEFAULT_SIZE);
    }
    
    public PilcrowIcon(double size) {
        super(size * 0.75, size);
    }

    @Override
    protected Shape createShape() {
        SVGPath path = new SVGPath();
        path.setContent("M3 5.5C3 7.983 4.99169 9 7 9V12.5C7 12.7761 7.22386 13 7.5 13C7.77614 13 8 12.7761 8 12.5V9V3.0998H9V12.5C9 12.7761 9.22386 13 9.5 13C9.77614 13 10 12.7761 10 12.5V3.0998H11.5L11.6113 3.08906C11.8617 3.03762 12.0498 2.81564 12.0498 2.55C12.0498 2.28436 11.8617 2.06238 11.6113 2.01094L11.5 2.0002H9.51411C9.50942 2.00007 9.50472 2 9.5 2C9.49528 2 9.49058 2.00007 9.48589 2.0002H8V2H7.5H7C4.99169 2 3 3.017 3 5.5Z");
        return path;
    }

}
