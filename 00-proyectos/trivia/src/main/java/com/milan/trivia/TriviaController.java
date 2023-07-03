package com.milan.trivia;

import com.milan.trivia.entities.Category;
import com.milan.trivia.entities.Question;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TriviaController {
     Category[] _categoryArray = new Category[6];
     Question[] _questionArray = new Question[6];

     @GetMapping("/categories")
    public Category[] _getAllCategories() {
        Category _categoryCivilizations = new Category();
        _categoryCivilizations.setCategory("Civilizaciones");
        _categoryCivilizations.setDescription("Preguntas relacionadas con culturas antiguas y modernas.");
        _categoryArray[0] = _categoryCivilizations;
        Category _categorySoccer = new Category();
        _categorySoccer.setCategory("Futbol");
        _categorySoccer.setDescription("Preguntas relacionadas con el deporte #1 a nivel mundial.");
        _categoryArray[1] = _categorySoccer;
        Category _categoryHealth = new Category();
        _categoryHealth.setCategory("Salud");
        _categoryHealth.setDescription("Preguntas relacionadas con nutricion, salud y bienestar del ser humano.");
        _categoryArray[2] = _categoryHealth;
        Category _categoryCountries = new Category();
        _categoryCountries.setCategory("Paises");
        _categoryCountries.setDescription("Preguntas relacionadas con geografia, turismo y demografia.");
        _categoryArray[3] = _categoryCountries;
        Category _categorySocieties = new Category();
        _categorySocieties.setCategory("Sociedades");
        _categorySocieties.setDescription("Preguntas relacionadas con usos y costumbres, tradiciones, creencias y leyes de las distintas sociedades del mundo.");
        _categoryArray[4] = _categorySocieties;
        Category _categoryFinances = new Category();
        _categoryFinances.setCategory("Finanzas");
        _categoryFinances.setDescription("Preguntas relacionadas con divisas extranjeras, economia, comercio y gestion de la riqueza a nivel global.");
        _categoryArray[5] = _categoryFinances;
        return _categoryArray;
    }

     @GetMapping("/question")
     public Question[] _getAllQuestion() {
         Question _questionCivilizations = new Question();
         _questionCivilizations.setCategory("Civilizaciones");
         _questionCivilizations.setQuestion("¿Cual de los siguientes inventos fue un aporte de la cultura maya?");
         String[] _optionsCivilization = {"El Calendario Azteca", "El Papel", "El cero"};
         _questionCivilizations.setOptions(_optionsCivilization);
         _questionCivilizations.setAnswer(2);
         _questionCivilizations.setExplanation("Los mayas fueron una de las primeras culturas en desarrollar el concepto de cero como marcador de posición numérico. Su sistema numérico, que incluía un símbolo para el cero, permitía cálculos matemáticos avanzados y observaciones astronómicas.");
         _questionArray[0] = _questionCivilizations;
         Question _questionSoccer = new Question();
         _questionSoccer.setCategory("Futbol");
         _questionSoccer.setQuestion("¿Cual es el jugador que mas goles ha anotado en Copas del Mundo?");
         String[] _optionsSoccer = {"Diego A Maradona", "Miroslav Klose", "Edson A Do Nascimiento Pele"};
         _questionSoccer.setOptions(_optionsSoccer);
         _questionSoccer.setAnswer(1);
         _questionSoccer.setExplanation("El futbolista que tiene el récord de mayor número de goles marcados en la historia de la Copa Mundial de la FIFA es Miroslav Klose de Alemania. Klose anotó un total de 16 goles en cuatro torneos de la Copa del Mundo (2002, 2006, 2010 y 2014).");
         _questionArray[1] = _questionSoccer;
         Question _questionHealth = new Question();
         _questionHealth.setCategory("Salud");
         _questionHealth.setQuestion("¿Cuantos kilometros debe correr una persona promedio para quemar las calorias consumidas al comer una rebanada de pizza de peperoni y queso?");
         String[] _optionsHealth = {"5.31 Km", "2.57 Km", "3.61 Km"};
         _questionHealth.setOptions(_optionsHealth);
         _questionHealth.setAnswer(2);
         _questionHealth.setExplanation("Una persona necesitaría correr aproximadamente 3,61 kilómetros para quemar el estimado de 325 calorías consumidas en una sola porción de pizza de pepperoni y queso.");
         _questionArray[2] = _questionHealth;
         Question _questionCountries = new Question();
         _questionCountries.setCategory("Paises");
         _questionCountries.setQuestion("¿Cuantas islas componen el archipielago de Japon?");
         String[] _optionsCountries = {"114", "6,852", "4"};
         _questionCountries.setOptions(_optionsCountries);
         _questionCountries.setAnswer(1);
         _questionCountries.setExplanation("El archipiélago de Japón está compuesto por aproximadamente 6,852 islas. Sin embargo, es importante tener en cuenta que no todas estas islas están habitadas o tienen un tamaño significativo. Las cuatro islas más grandes, conocidas como \"islas principales\" o \"islas de origen\", son Honshu, Hokkaido, Kyushu y Shikoku.");
         _questionArray[3] = _questionCountries;
         Question _questionSocieties = new Question();
         _questionSocieties.setCategory("Sociedades");
         _questionSocieties.setQuestion("¿A los cuantos años se considera la mayoria de edad en Israel?");
         String[] _optionsSocieties = {"18", "13", "21"};
         _questionSocieties.setOptions(_optionsSocieties);
         _questionSocieties.setAnswer(0);
         _questionSocieties.setExplanation("En Israel, la edad legal considerada como mayoría de edad, es de 18 años. A esta edad, las personas se consideran adultas y tienen varios derechos y responsabilidades, incluida la capacidad de votar, celebrar contratos y tomar decisiones legales independientes. Sin embargo, existen algunas excepciones y regulaciones específicas para ciertas actividades, como el consumo de alcohol y el servicio militar, que pueden tener diferentes requisitos de edad.");
         _questionArray[4] = _questionSocieties;
         Question _questionFinances = new Question();
         _questionFinances.setCategory("Finanzas");
         _questionFinances.setQuestion("¿Que pais del mundo ha sufrido la mayor cantidad de crisis economicas a lo largo de su historia?");
         String[] _optionsFinances = {"Grecia", "Zimbabwe", "Argentina"};
         _questionFinances.setOptions(_optionsFinances);
         _questionFinances.setAnswer(2);
         _questionFinances.setExplanation("Argentina ha enfrentado numerosas crisis económicas, incluidas la hiperinflación, las devaluaciones de la moneda, los incumplimientos de pago de la deuda y los períodos de inestabilidad económica. Estas crisis han tenido impactos significativos en la economía y la población del país.");
         _questionArray[5] = _questionFinances;
         return _questionArray;
     }

     @GetMapping("/question/{category}")
     public Question _getQuestion(@PathVariable String category) {
          Question _question = new Question();

          switch (category) {
               case "Civilizaciones":
                    _question = _questionArray[0];
                    break;
               case "Futbol":
                    _question = _questionArray[1];
                    break;
               case "Salud":
                    _question = _questionArray[2];
                    break;
               case "Paises":
                    _question = _questionArray[3];
                    break;
               case "Sociedades":
                    _question = _questionArray[4];
                    break;
               case "Finanzas":
                    _question = _questionArray[5];
                    break;
          }
          return _question;
     }
}
