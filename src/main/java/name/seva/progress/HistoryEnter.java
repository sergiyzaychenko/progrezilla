package name.seva.progress;

import java.util.Date;

/**
 * Created by seva on 03.02.16.
 *
 */
public class HistoryEnter {



        private final Date entryDate;

        private final int entryResult;


        public HistoryEnter(Date entryDate, int entryResult) {

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
