package com.milan.autocompletesearch;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SearchController {

    @GetMapping("/search/{_searchCriteria}")
    public String[] _getAutocompleteResults(@PathVariable String _searchCriteria) {

        String[] _searchAutocompleteResults = {"java", "javascript library network graph", "javascript", "java download", "java jdk", "java online", "javascript online", "java runtime environment", "java 17", "javascript map"};
        String[] _searchResultArray = new String[10];
        Integer _indexResultArray = 0;
        Boolean _searchValueFound = Boolean.FALSE;
        for (String _searchResult : _searchAutocompleteResults) {
            if (_searchResult.contains(_searchCriteria)) {
                _searchValueFound = Boolean.TRUE;
                _searchResultArray[_indexResultArray] = _searchResult;
                _indexResultArray++;
            }
        }
        if (!_searchValueFound) _searchResultArray[0] = "No se encontraron resultados que coincidan con ese criterio.";
        return _searchResultArray;
    }

}

