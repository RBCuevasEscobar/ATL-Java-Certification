package Clase10;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

import static java.time.format.DateTimeFormatter.*;

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
        DateTimeFormatter formatter = ofPattern("dd/MM/yyyy");

        System.out.println("Id: " + this._personId);
        System.out.println("Nombre: " + this._personName);
        System.out.println("Fecha de Nacimiento: " + formatter.format(this._personDateOfBirth));
        System.out.println("DNI: " + this._personDNI);
    }

    public Boolean _getIsAdult() {
        Integer _legalAdultAge = 18;
        LocalDate _todayDate = LocalDate.now();
        Period _periodBetweenDates = Period.between(this._personDateOfBirth,_todayDate);
        Integer _differenceInYears = _periodBetweenDates.getYears();
        if (_differenceInYears >= _legalAdultAge) return Boolean.TRUE;
        else return Boolean.FALSE;
    }
}
