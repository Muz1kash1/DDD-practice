package schoolclass;

import lombok.*;
import valueobjects.*;

@Getter
@Builder
public class Student {
    private FullName fullName;
    private PersonalUid uid;
    private Snils snils;
    private BirthCertificate birthCertificate;
    private Passport passport;

    public void modifyPassport(Passport passport){}

    public void modifyBirthCertificate(BirthCertificate birthCertificate){}

    public void modifySnils(Snils snils){}
}
