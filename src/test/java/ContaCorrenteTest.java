import org.example.ContaCorrente;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ContaCorrenteTest {

    @Test
    public void testDepositoConta() {
        // Arrange (preparação)
        ContaCorrente conta = new ContaCorrente(123, "Tio", 100.0);

        // Act (ação)
        conta.depositoConta(50.0);

        // Assert (Verificação)
        assertEquals(150.0, conta.getSaldo(), 5.0);
    }

    @Test
    public void testSaqueConta() {
        // Arrange (preparação)
        ContaCorrente conta = new ContaCorrente(123, "Carol", 100.0);

        // Act  // Act (ação)
        conta.saqueConta(20.0);

        // Assert Verificação)
        assertEquals(80.0, conta.getSaldo(), 5.0);
    }

    @Test
    public void testValorMenorQue5Reais() {
        // Arrange (preparação)
        ContaCorrente conta = new ContaCorrente(123, "Joy", 100.0);

        // Act  // Act (ação)
        conta.saqueConta(3.0);

        // Assert Verificação)
        assertEquals(100.0, conta.getSaldo(), 5.0);
    }

    @Test
    public void testSaldoInsuficiente() {
        // Arrange  (preparação)
        ContaCorrente conta = new ContaCorrente(123, "Francisco", 100.0);

        // Act  // Act (ação)
        conta.saqueConta(120.0);

        // Assert Verificação)
        assertEquals(100.0, conta.getSaldo(), 5.0);
    }
}
