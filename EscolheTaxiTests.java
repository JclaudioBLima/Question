
import org.junit.Test;
import static org.junit.Assert.*;
public class EscolheTaxiTests {
  @Test
  public void teste() {
    String expected0 = "Empresa 1 quando a distância < 10.0, Tanto faz quando a distância = 10.0, Empresa 2 quando a distância > 10.0";
    String actual0 = Challenge.escolheTaxi("2.5","1.0","5.0","0.75");
    assertEquals(expected0, actual0);
  }
}
    