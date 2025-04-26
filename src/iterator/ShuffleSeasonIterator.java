package iterator;
import java.util.*;
class ShuffleSeasonIterator implements EpisodeIterator {
    private Season season;
    private List<Episode> shuffledEpisodes;
    private int index;

    public ShuffleSeasonIterator(Season season, long seed) {
        this.season = season;
        shuffledEpisodes = new ArrayList<>(season.getEpisodes());
        Collections.shuffle(shuffledEpisodes, new Random(seed));
        index = 0;
    }

    @Override
    public boolean hasNext() {
        return index < shuffledEpisodes.size();
    }

    @Override
    public Episode next() {
        if (!hasNext()) throw new NoSuchElementException();
        return shuffledEpisodes.get(index++);
    }
}