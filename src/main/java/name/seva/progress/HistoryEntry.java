package name.seva.progress;

import java.util.Date;

/**
 * Created by seva on 03.02.16.
 *
 */
public class HistoryEntry {


    private final Date entryDate;

    private final int entryResult;


    public HistoryEntry(Date entryDate, int entryResult) {

        this.entryDate = entryDate;

        this.entryResult = entryResult;

    }

    public Date getEntryDate() {

        return entryDate;

    }

    public int getEntryResult() {

        return entryResult;

    }

}
