package diary;

import lombok.Getter;
import valueobjects.CompletedHomework;
import valueobjects.Rate;

@Getter
public class Homework {
    String task;
    String uid;
    CompletedHomework completedHomework;
    Rate rate;


    protected Homework(){}

}
