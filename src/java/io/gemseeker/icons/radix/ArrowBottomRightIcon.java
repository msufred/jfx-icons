package io.gemseeker.icons.radix;

import io.gemseeker.icons.SVGIcon;
import javafx.scene.shape.SVGPath;
import javafx.scene.shape.Shape;

/**
 *
 * @author Gem Seeker
 */
public class ArrowBottomRightIcon extends SVGIcon {
    
    public ArrowBottomRightIcon() {
        super(DEFAULT_SIZE);
    }
    
    public ArrowBottomRightIcon(double size) {
        super(size * 0.85);
    }

    @Override
    protected Shape createShape() {
        SVGPath path = new SVGPath();
        path.setContent("M11.4998 12C11.6322 12 11.7596 11.9471 11.8533 11.8535C11.9468 11.7599 11.9997 11.6323 11.9998 11.5V6L11.99 5.89844C11.9432 5.67099 11.7411 5.50009 11.4998 5.5C11.2582 5.50009 11.0561 5.67154 11.0096 5.89941L10.9998 6V10.293L4.35333 3.64648C4.15816 3.45132 3.84158 3.45152 3.6463 3.64648C3.45133 3.84177 3.45114 4.15835 3.6463 4.35352L10.2928 11H5.99981C5.7238 11 5.49996 11.224 5.49981 11.5C5.49996 11.776 5.7238 12 5.99981 12H11.4998Z");
        return path;
    }

}
