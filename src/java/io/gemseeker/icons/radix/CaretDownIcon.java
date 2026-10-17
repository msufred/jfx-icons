package io.gemseeker.icons.radix;

import io.gemseeker.icons.SVGIcon;
import javafx.scene.shape.SVGPath;
import javafx.scene.shape.Shape;

/**
 *
 * @author Gem Seeker
 */
public class CaretDownIcon extends SVGIcon {
    
    public CaretDownIcon() {
        super(DEFAULT_SIZE);
    }
    
    public CaretDownIcon(double size) {
        super(size * 0.5, size * 0.25);
    }

    @Override
    protected Shape createShape() {
        SVGPath path = new SVGPath();
        path.setContent("M7.50022 9.95001C7.6195 9.94996 7.73423 9.90252 7.81858 9.81818L10.8186 6.81818C10.9941 6.64242 10.9942 6.35713 10.8186 6.18146C10.6429 6.00579 10.3576 6.00592 10.1819 6.18146L7.50022 8.8631L4.81858 6.18146L4.74827 6.12384C4.57365 6.00838 4.33571 6.02779 4.18186 6.18146C4.02803 6.33529 4.00876 6.57318 4.12424 6.74786L4.18186 6.81818L7.18186 9.81818C7.26625 9.90257 7.38087 9.95001 7.50022 9.95001Z");
        return path;
    }

}
