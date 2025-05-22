import java.util.List;
import java.util.function.UnaryOperator;

public class Accumulate {

    public static <T> List<T> accumulate(List<T> list, UnaryOperator<T> operator) {
        return list.stream().map(i -> operator.apply(i)).toList();
    }

}
