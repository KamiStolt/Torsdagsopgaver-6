import java.util.ArrayList;

public class ShapeBuilder {
ArrayList<Shape>shapes = new ArrayList<>();
public void addShape(Shape s){
shapes.add(s);

}
public double getTotalArea(){
 double result = 0;

    for (int i = 0; i < shapes.size(); i++) {
       result += shapes.get(i).getArea();
       //result = result+shapes.get(i).getArea();
        // to forskellige måder at skrive det på

    }
    return result;
}
}
