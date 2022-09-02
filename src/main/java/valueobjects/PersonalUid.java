package valueobjects;

import lombok.Getter;
import lombok.Value;

@Value
public class PersonalUid {
    String personalUid;
    int schoolNumber;
    int region;
    int personalNumber;
}
