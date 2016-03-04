package name.seva.progress;

import java.time.LocalDate;
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

    private final LocalDate startDate;

    private final LocalDate lastActivityDate;

    private final int lastScore;


    public Activity(LocalDate lastActivityDate, String name, LocalDate startDate, int lastScore) {

        this.lastActivityDate = lastActivityDate;

        this.name = name;

        this.startDate = startDate;

        this.lastScore = lastScore;

    }



    public List<HistoryEntry> getHistory() {

        return history;

    }

    public LocalDate getLastActivityDate() {

        return lastActivityDate;

    }

    public int getLastScore() {

        return lastScore;

    }

    public String getName() {

        return name;

    }

    public LocalDate getStartDate() {

        return startDate;

    }


}

