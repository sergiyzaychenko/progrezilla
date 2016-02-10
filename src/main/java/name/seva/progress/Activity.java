package name.seva.progress;

import java.util.ArrayList;

import java.util.Date;
import java.util.List;

/**
 * Created by seva on 03.02.16.
 *
 */

public class Activity {

    private final List<HistoryEntry> history = new ArrayList<>();

    private final String name;

    private final Date startDate;

    private final Date lastActivityDate;

    private final int lastScore;

    public Activity(Date lastActivityDate, String name, Date startDate, int lastScore) {

        this.lastActivityDate = lastActivityDate;

        this.name = name;

        this.startDate = startDate;

        this.lastScore = lastScore;

    }

    public List<HistoryEntry> getHistory() {
        return history;
    }

    public Date getLastActivityDate() {
        return lastActivityDate;
    }

    public int getLastScore() {
        return lastScore;
    }

    public String getName() {
        return name;
    }

    public Date getStartDate() {

        return startDate;

    }
}

