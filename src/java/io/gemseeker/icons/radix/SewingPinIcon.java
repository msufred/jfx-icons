package io.gemseeker.icons.radix;

import io.gemseeker.icons.SVGIcon;
import javafx.scene.shape.SVGPath;
import javafx.scene.shape.Shape;

/**
 *
 * @author Gem Seeker
 */
public class SewingPinIcon extends SVGIcon {
    
    public SewingPinIcon() {
        super(DEFAULT_SIZE);
    }
    
    public SewingPinIcon(double size) {
        super(size * 0.35, size);
    }

    @Override
    protected Shape createShape() {
        SVGPath path = new SVGPath();
        path.setContent("M7.5 1C8.88071 1 10 2.11929 10 3.5C10 4.70943 9.14105 5.71753 8 5.94922V13.5C8 13.7761 7.77614 14 7.5 14C7.22386 14 7 13.7761 7 13.5V5.94922C5.85895 5.71753 5 4.70943 5 3.5C5 2.11929 6.11929 1 7.5 1ZM7.5 2C6.67157 2 6 2.67157 6 3.5C6 4.32843 6.67157 5 7.5 5C8.32843 5 9 4.32843 9 3.5C9 2.67157 8.32843 2 7.5 2Z");
        return path;
    }

}
