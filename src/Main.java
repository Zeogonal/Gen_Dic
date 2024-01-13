import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

public class Main {
    public static void main(String[] args) {
        String text = "местные жители пытаются с вами коммуницировать, записывая непонятные слова на бумажке";
        Function<String, List<String>> function = (a) ->
                Arrays.stream(a.split(" ")).sorted().distinct().toList();
        function.apply(text).forEach(System.out::println);
        //Программа написана в функциональном стиле, в связи с использованием функционального интерфейса Function.
        //Также исп. Stream API.
    }
}