package com.milan.peoplemanagement;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.Objects;

@RestController
public class UserManagementController {

    String[] _peopleArray = {"RAMON CUEVAS", "VIANEY VEGA", "ABRIL CUEVAS", "ISABELLA CACERES", "TOMAS CUEVAS", "ESTHER ESCOBAR", "MILAN CUEVAS", "BRENDA CUEVAS", "MONSERRAT HIDALGO", "ISARY URIBE"};

    @GetMapping("/users/search/{_userName}")
    public String[] _getSearchResults(@PathVariable String _userName) {
        String[] _resultsArray = new String[10];
        Integer _indexResultsArray = 0;
        Boolean _searchValueFound = Boolean.FALSE;
        for (String _personName : _peopleArray) {
            if (_personName.contains(_userName.toUpperCase())) {
                _searchValueFound = Boolean.TRUE;
                _resultsArray[_indexResultsArray] = _personName;
                _indexResultsArray++;
            }
        }
        if (!_searchValueFound) _resultsArray[0] = "No se encontraron personas que coincidan con ese criterio.";
        return _resultsArray;
    }

    @GetMapping("/users/view/all")
    public String[] _getAllUsers() {
        return _peopleArray;
    }

    @GetMapping("/users/remove/{_userName}")
    public String[] _getUserRemoved(@PathVariable String _userName) {
        String[] _resultsArray = new String[10];
        Boolean _searchValueFound = Boolean.FALSE;
        Integer _resultArrayIndex = 0;
        for (String _personName : _peopleArray) {
            if (_personName != null && _personName.contains(_userName.toUpperCase())) {
                _searchValueFound = Boolean.TRUE;
            }
            else {
                _resultsArray[_resultArrayIndex] = _personName;
                _resultArrayIndex++;
            }
        }
        if (!_searchValueFound) {
            _resultsArray = new String[]{"No se encontraron personas que coincidan con ese criterio.", "", "", "", "", "", "", "", "", ""};
            return _resultsArray;
        } else return _peopleArray = _resultsArray;
    }

    @GetMapping("/users/add/{_userName}")
    public String[] _getUserAdded(@PathVariable String _userName) {
        String[] _resultsArray = new String[10];
        Boolean _userNameAdded = Boolean.FALSE;
        Integer _resultsArrayIndex = 0;
        for (String _personName : _peopleArray) {
            if (_personName != null && _personName.contains(_userName.toUpperCase())) {
                _resultsArray = new String[]{"Esa persona ya existe en la lista.", "", "", "", "", "", "", "", "", ""};
                return _resultsArray;
            } else {
                if (_personName == null && !_userNameAdded) {
                    _resultsArray[_resultsArrayIndex] = _userName.toUpperCase();
                    _userNameAdded = Boolean.TRUE;
                }
                else _resultsArray[_resultsArrayIndex] = _personName;
                _resultsArrayIndex++;
            }
        }
        if (!_userNameAdded) _resultsArray = new String[]{"No hay espacio en la lista.", "", "", "", "", "", "", "", "", ""};
        else _peopleArray = _resultsArray;
        return _resultsArray;
    }

    @GetMapping("/users/add/")
    public String[] _getErrorUserEmptyAdded() {
       String[] _resultsArray = {"Ingrese un valor para el nombre de usuario.", "", "", "", "", "", "", "", "", ""};
       return _resultsArray;
    }

    @GetMapping("/users/remove/")
    public String[] _getErrorUserEmptyRemoved() {
        String[] _resultsArray = {"Ingrese un valor para el nombre de usuario.", "", "", "", "", "", "", "", "", ""};
        return _resultsArray;
    }
}

