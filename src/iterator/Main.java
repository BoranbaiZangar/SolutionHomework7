package iterator;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        // Демонстрация
        Season season1 = new Season();
        season1.addEpisode(new Episode("Episode 1", 30));
        season1.addEpisode(new Episode("Episode 2", 35));

        Season season2 = new Season();
        season2.addEpisode(new Episode("Episode 3", 40));
        season2.addEpisode(new Episode("Episode 4", 50));

        // Тест Binge Iterator
        List<Season> series = new ArrayList<>();
        series.add(season1);
        series.add(season2);

        BingeIterator bingeIterator = new BingeIterator(series);
        while (bingeIterator.hasNext()) {
            Episode e = bingeIterator.next();
            System.out.println(e.getTitle());
        }
    }
}
