package io.gemseeker.icons.radix;

import io.gemseeker.icons.SVGIcon;
import javafx.scene.shape.SVGPath;
import javafx.scene.shape.Shape;

/**
 *
 * @author Gem Seeker
 */
public class AlignTopIcon extends SVGIcon {
    
    public AlignTopIcon() {
        super(DEFAULT_SIZE * 0.9, DEFAULT_SIZE);
    }
    
    public AlignTopIcon(double size) {
        super(size * 0.9, size);
    }

    @Override
    protected Shape createShape() {
        SVGPath path = new SVGPath();
        path.setContent("M13.5 7.62939e-06C13.7761 7.82267e-06 14 0.223865 14 0.500008C14 0.77615 13.7761 1.00001 13.5 1.00001H9V12C9 12.5523 8.55228 13 8 13H7C6.44772 13 6 12.5523 6 12V1.00001H1.5C1.22386 1.00001 1 0.77615 1 0.500008C1 0.223865 1.22386 7.63946e-06 1.5 7.62939e-06H13.5Z");
        return path;
    }

}
