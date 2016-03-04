package name.seva.progress;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Created by seva on 14.02.16.
 *
 */

public class ActivityController {

    private List<Activity> activity = new ArrayList<>();

    List<Activity> getActivity() {

        return activity;

    }

    void updateActivity(Date lastActivityDate, int lastScore) {


    }

    Activity createNewActivity(String name) {

        Activity newOne = new Activity(LocalDate.now(), name, LocalDate.now(), 0);

        activity.add(newOne);

        return newOne;

    }


}
