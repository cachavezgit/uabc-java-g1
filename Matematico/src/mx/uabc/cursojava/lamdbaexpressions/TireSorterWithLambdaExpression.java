package mx.uabc.cursojava.lamdbaexpressions;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class TireSorterWithLambdaExpression {
    public static void main (String[] args) {
        List<Tire> tires = List.of(
                new Tire(17),
                new Tire(16),
                new Tire(18),
                new Tire(14),
                new Tire(15),
                new Tire(16)
        );

        Comparator<Tire> ordenador = (t1, t2) ->
            t2.size - t1.size;

        List<Tire> sorted = new ArrayList<>(tires);
        sorted.sort(ordenador);

        sorted.forEach((n) -> System.out.println(n));
    }

    public static final class Tire {
        private final int size;

        public Tire(int size) {
            this.size = size;
        }

        @Override
        public String toString() {
            return "Tire{" +
                    "size=" + String.valueOf(size) +
                    '}';
        }
    }
}
