package io.gemseeker.icons.radix;

import io.gemseeker.icons.SVGIcon;
import javafx.scene.shape.SVGPath;
import javafx.scene.shape.Shape;

/**
 *
 * @author Gem Seeker
 */
public class Half2Icon extends SVGIcon {
    
    public Half2Icon() {
        super(DEFAULT_SIZE);
    }
    
    public Half2Icon(double size) {
        super(size);
    }

    @Override
    protected Shape createShape() {
        SVGPath path = new SVGPath();
        path.setContent("M7.49915 0.876892C11.1566 0.876892 14.1218 3.84163 14.1222 7.49896C14.1222 11.1566 11.1568 14.122 7.49915 14.122C3.84181 14.1216 0.877075 11.1564 0.877075 7.49896C0.877487 3.84188 3.84206 0.877303 7.49915 0.876892ZM7.49915 1.82611C4.36673 1.82652 1.82671 4.36655 1.82629 7.49896C1.82629 10.6317 4.36648 13.1714 7.49915 13.1718L7.50012 13.1708V1.82611H7.49915Z");
        return path;
    }

}
