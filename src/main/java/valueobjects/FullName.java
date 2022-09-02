package valueobjects;

import lombok.Getter;
import lombok.Value;

@Value
public class FullName {
    String name;
    String surname;
    String patronymic;
}
