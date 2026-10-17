package io.gemseeker.icons.radix;

import io.gemseeker.icons.SVGIcon;
import javafx.scene.shape.SVGPath;
import javafx.scene.shape.Shape;

/**
 *
 * @author Gem Seeker
 */
public class CaretRightIcon extends SVGIcon {
    
    public CaretRightIcon() {
        super(DEFAULT_SIZE);
    }
    
    public CaretRightIcon(double size) {
        super(size * 0.25, size * 0.5);
    }

    @Override
    protected Shape createShape() {
        SVGPath path = new SVGPath();
        path.setContent("M9.95012 7.50023C9.95007 7.61951 9.90263 7.73425 9.81828 7.81859L6.81828 10.8186C6.64253 10.9941 6.35724 10.9943 6.18156 10.8186C6.00589 10.6429 6.00602 10.3576 6.18156 10.1819L8.8632 7.50023L6.18156 4.81859L6.12395 4.74828C6.00848 4.57366 6.0279 4.33572 6.18156 4.18188C6.33539 4.02805 6.57328 4.00878 6.74797 4.12426L6.81828 4.18188L9.81828 7.18188C9.90267 7.26627 9.95012 7.38089 9.95012 7.50023Z");
        return path;
    }

}
