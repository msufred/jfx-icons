package io.gemseeker.icons.radix;

import io.gemseeker.icons.SVGIcon;
import javafx.scene.shape.SVGPath;
import javafx.scene.shape.Shape;

/**
 *
 * @author Gem Seeker
 */
public class DashIcon extends SVGIcon {
    
    public DashIcon() {
        super(DEFAULT_SIZE);
    }
    
    public DashIcon(double size) {
        super(size * 0.5, size * 0.075);
    }

    @Override
    protected Shape createShape() {
        SVGPath path = new SVGPath();
        path.setContent("M9.60059 7.00977C9.82855 7.05629 10 7.25829 10 7.5C10 7.74171 9.82855 7.94371 9.60059 7.99023L9.5 8H5.5C5.22386 8 5 7.77614 5 7.5C5 7.22386 5.22386 7 5.5 7H9.5L9.60059 7.00977Z");
        return path;
    }

}
