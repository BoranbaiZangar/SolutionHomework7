package iterator;
import java.util.*;
class SeasonIterator implements EpisodeIterator {
    private Season season;
    private int index;

    public SeasonIterator(Season season) {
        this.season = season;
        this.index = 0;
    }

    @Override
    public boolean hasNext() {
        return index < season.getEpisodes().size();
    }

    @Override
    public Episode next() {
        if (!hasNext()) throw new NoSuchElementException();
        return season.getEpisodes().get(index++);
    }
}