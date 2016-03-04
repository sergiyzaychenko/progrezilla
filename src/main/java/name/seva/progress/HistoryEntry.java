package name.seva.progress;

import java.time.LocalDate;
import java.util.Date;

/**
 * Created by seva on 03.02.16.
 *
 */
public class HistoryEntry {


    private final LocalDate entryDate;

    private final int entryResult;


    public HistoryEntry(LocalDate entryDate, int entryResult) {

        this.entryDate = entryDate;

        this.entryResult = entryResult;

    }

    public LocalDate getEntryDate() {

        return entryDate;

    }

    public int getEntryResult() {

        return entryResult;

    }

}
