package schoolclass;

import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import valueobjects.FullName;
import valueobjects.PersonalUid;
import valueobjects.Subject;

import javax.validation.Valid;
import javax.validation.constraints.Min;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;
@Getter
public class Teacher {
    FullName fullname;
    PersonalUid uid;
    List<Subject> specializations;
    int workingExperience;
    LocalDate dateOfBith;


    protected Teacher(){
    }

}
