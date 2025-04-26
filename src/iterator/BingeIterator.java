package iterator;
import java.util.*;
class BingeIterator implements Iterator<Episode> {
    private Iterator<Episode> currentIterator;
    private List<Season> seasons;
    private int currentSeasonIndex = 0;

    public BingeIterator(List<Season> seasons) {
        this.seasons = seasons;
        this.currentIterator = seasons.get(currentSeasonIndex).iterator();
    }

    @Override
    public boolean hasNext() {
        while (!currentIterator.hasNext() && currentSeasonIndex < seasons.size() - 1) {
            currentSeasonIndex++;
            currentIterator = seasons.get(currentSeasonIndex).iterator();
        }
        return currentIterator.hasNext();
    }

    @Override
    public Episode next() {
        if (!hasNext()) throw new NoSuchElementException();
        return currentIterator.next();
    }
}