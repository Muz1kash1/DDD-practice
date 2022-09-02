package curriculum;

import lombok.Builder;
import lombok.Getter;

import java.util.List;

@Builder
@Getter
public class Curriculum {
    private static List<ScheduledLesson> scheduledLessonList;

    public void addLesson(ScheduledLesson lesson){

    }

}
