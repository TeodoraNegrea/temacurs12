package ro.fasttrackit.temacurs12.ex4;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class DaySchedule {
    private final DaysOfTheWeek days;
    private final List<DaysOfTheWeek> daysOfTheWeeks = new ArrayList<>();


    public DaySchedule(DaysOfTheWeek days) {
        this.days = days;

    }

    public DaysOfTheWeek getDays() {
        return days;
    }



    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        DaySchedule that = (DaySchedule) o;
        return days == that.days && Objects.equals(daysOfTheWeeks, that.daysOfTheWeeks);
    }

    @Override
    public int hashCode() {
        return Objects.hash(days, daysOfTheWeeks);
    }

    @Override
    public String toString() {
        return "DaySchedule{" +
                "days=" + days +
                ", daysOfTheWeeks=" + daysOfTheWeeks +
                '}';
    }
}

   /* public List<DaysOfTheWeek> getActivitiesInEveryDayOfTheWeek(String activities) {
        List<DaysOfTheWeek> result = new ArrayList<>();
        for (DaySchedule daySchedule : daySchedules) {
            if (daySchedule.getDays() == days) {
                result.add(daySchedule);
            }
        }
        return result;
}*/


