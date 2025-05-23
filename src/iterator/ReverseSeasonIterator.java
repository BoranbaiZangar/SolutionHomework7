package iterator;
import java.util.*;
class ReverseSeasonIterator implements EpisodeIterator {
    private Season season;
    private int index;

    public ReverseSeasonIterator(Season season) {
        this.season = season;
        this.index = season.getEpisodes().size() - 1;
    }

    @Override
    public boolean hasNext() {
        return index >= 0;
    }

    @Override
    public Episode next() {
        if (!hasNext()) throw new NoSuchElementException();
        return season.getEpisodes().get(index--);
    }
}