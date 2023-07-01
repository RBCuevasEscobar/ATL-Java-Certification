
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class ClassPersona {
    private Integer _personId;
    private String _personName;
    private LocalDate _personDateOfBirth;
    private String _personDNI;

    public ClassPersona(Integer _personIdParm, String _personNameParm, LocalDate _personDateOfBirthParm, String _personDNIParm) {
        this._personId = _personIdParm;
        this._personName = _personNameParm;
        this._personDateOfBirth = _personDateOfBirthParm;
        this._personDNI = _personDNIParm;
    }

    public void _getPersona() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        System.out.println("Id: " + this._personId);
        System.out.println("Nombre: " + this._personName);
        System.out.println("Fecha de Nacimiento: " + formatter.format(this._personDateOfBirth));
        System.out.println("DNI: " + this._personDNI);
    }
}
