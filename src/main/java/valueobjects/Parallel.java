package valueobjects;

import lombok.Value;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;

@Value
public class Parallel {
    @Min(1)
    @Max(11)
    int grade;
    String classLetter;
}
