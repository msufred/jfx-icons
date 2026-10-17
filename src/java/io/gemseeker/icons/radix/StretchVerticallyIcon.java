package io.gemseeker.icons.radix;

import io.gemseeker.icons.SVGIcon;
import javafx.scene.shape.SVGPath;
import javafx.scene.shape.Shape;

/**
 *
 * @author Gem Seeker
 */
public class StretchVerticallyIcon extends SVGIcon {
    
    public StretchVerticallyIcon() {
        super(DEFAULT_SIZE * 0.9, DEFAULT_SIZE);
    }
    
    public StretchVerticallyIcon(double size) {
        super(size * 0.9, size);
    }

    @Override
    protected Shape createShape() {
        SVGPath path = new SVGPath();
        path.setContent("M13.4999 14C13.776 14 13.9999 14.2239 13.9999 14.5C13.9999 14.7761 13.776 15 13.4999 15H1.49988C1.22373 15 0.999877 14.7761 0.999877 14.5C0.999877 14.2239 1.22373 14 1.49988 14H5.99987V1.00001H1.49988C1.22373 1.00001 0.999877 0.776157 0.999877 0.500015C0.999877 0.223873 1.22373 1.52688e-05 1.49988 1.52588e-05H13.4999C13.776 1.5452e-05 13.9999 0.223873 13.9999 0.500015C13.9999 0.776157 13.776 1.00001 13.4999 1.00001H8.99987V14H13.4999Z");
        return path;
    }

}
