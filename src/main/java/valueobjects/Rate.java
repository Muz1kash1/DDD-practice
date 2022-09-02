package valueobjects;

import lombok.Builder;
import lombok.Getter;

import java.time.LocalDate;
@Builder
@Getter
public class Rate {
    String rateValue;
    LocalDate date;
    Subject subject;
}
