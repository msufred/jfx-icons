package io.gemseeker.icons.radix;

import io.gemseeker.icons.SVGIcon;
import java.util.ArrayList;
import java.util.Arrays;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Shape;

/**
 *
 * @author Gem Seeker
 */
public class DragHandleDots1Icon extends SVGIcon {

    public DragHandleDots1Icon() {
        super(DEFAULT_SIZE);
    }

    public DragHandleDots1Icon(double size) {
        super(size * 0.625, size);
    }

    @Override
    protected Shape createShape() {
        ArrayList<Shape> shapes = new ArrayList(Arrays.asList(
                new Circle(4.5, 2.5, 0.6),
                new Circle(4.5, 4.5, 0.6),
                new Circle(4.5, 6.499, 0.6),
                new Circle(4.5, 8.499, 0.6),
                new Circle(4.5, 10.498, 0.6),
                new Circle(4.5, 12.498, 0.6),
                new Circle(6.5, 2.5, 0.6),
                new Circle(6.5, 4.5, 0.6),
                new Circle(6.5, 6.499, 0.6),
                new Circle(6.5, 8.499, 0.6),
                new Circle(6.5, 10.498, 0.6),
                new Circle(6.5, 12.498, 0.6),
                new Circle(8.499, 2.5, 0.6),
                new Circle(8.499, 4.5, 0.6),
                new Circle(8.499, 6.499, 0.6),
                new Circle(8.499, 8.499, 0.6),
                new Circle(8.499, 10.498, 0.6),
                new Circle(8.499, 12.498, 0.6),
                new Circle(10.499, 2.5, 0.6),
                new Circle(10.499, 4.5, 0.6),
                new Circle(10.499, 6.499, 0.6),
                new Circle(10.499, 8.499, 0.6),
                new Circle(10.499, 10.498, 0.6),
                new Circle(10.499, 12.498, 0.6)
        ));
        
        Shape combined = shapes.get(0);
        for (int i = 1; i < shapes.size(); i++) {
            combined = Shape.union(combined, shapes.get(i));
        }
        
        return combined;
    }

}
