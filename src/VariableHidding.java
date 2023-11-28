import com.data.Product;
public class VariableHidding {
    public static void main(String[] args) {
        Child child = new Child();
        child.doIt();
        Parent parent = (Parent) child;
        parent.doIt();
        Product product = new Product();
    }
}
