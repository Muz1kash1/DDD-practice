package curriculum;

import lombok.Builder;
import lombok.Getter;
import schoolclass.Teacher;
import valueobjects.Rate;
import valueobjects.Subject;

import java.time.DayOfWeek;
import java.time.LocalDate;
@Getter
public class ScheduledLesson {
    int change;
    Subject subjectName;
    DayOfWeek dayOfWeek;
    Rate rate;
    Teacher teacher;

    protected ScheduledLesson(){}

    public ScheduledLesson createScheduledLesson(){
        return new ScheduledLesson();
    }
}
