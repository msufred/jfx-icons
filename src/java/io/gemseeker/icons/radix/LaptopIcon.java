package io.gemseeker.icons.radix;

import io.gemseeker.icons.SVGIcon;
import javafx.scene.shape.SVGPath;
import javafx.scene.shape.Shape;

/**
 *
 * @author Gem Seeker
 */
public class LaptopIcon extends SVGIcon {
    
    public LaptopIcon() {
        super(DEFAULT_SIZE);
    }
    
    public LaptopIcon(double size) {
        super(size, size * 0.65);
    }

    @Override
    protected Shape createShape() {
        SVGPath path = new SVGPath();
        path.setContent("M12.75 3C13.4404 3 14 3.55964 14 4.25V12H15V12.5C15 12.7761 14.7761 13 14.5 13H0.5C0.223858 13 0 12.7761 0 12.5V12H1V4.25C1 3.55964 1.55964 3 2.25 3H12.75ZM2.25 4C2.11193 4 2 4.11193 2 4.25V11.5H13V4.25C13 4.11193 12.8881 4 12.75 4H2.25Z");
        return path;
    }

}
