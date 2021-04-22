package gt.edu.umg.ingenieria.sistemas.ingenieria_software.parcial2.gnome_sort;

import gt.edu.umg.ingenieria.sistemas.ingenieria_software.parcial2.gnome_sort.service.GnomeSortService;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class GnomeSortApplicationTests {

    @Autowired
    private GnomeSortService gss;

    @Test
    public void whenArrayOsStringIsNoSort_thenSortByGnome() {
        //Given
        final String[] cadena = {"casa", "perro", "patito", "pelota", "computadora", "curso", "carrera", "carro", "elefante"};
        final String[] actualString;
        final String[] expectedString = {"casa", "computadora", "curso", "carrera", "carro", "elefante", "perro", "patito", "pelota"};
        //When
        actualString = gss.gnomeSort(cadena);
        //Then
        Assertions.assertThatObject(actualString).isEqualTo(expectedString);
        //implementar moksdocke
    }

}
