package iterator;
import java.util.*;
class Season implements Iterable<Episode> {
    private List<Episode> episodes = new ArrayList<>();

    public void addEpisode(Episode e) {
        episodes.add(e);
    }

    @Override
    public Iterator<Episode> iterator() {
        return new SeasonIterator(this);
    }

    public List<Episode> getEpisodes() {
        return episodes;
    }
}