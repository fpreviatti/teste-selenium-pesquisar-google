import org.junit.Assert;
import org.junit.Test;

public class TesteAutomatizadoTest {
    TesteAutomatizado teste = new TesteAutomatizado();

    @Test
    public void verificaSeEncontrouNoGoogle(){
        Boolean verificaSeEncontrou = teste.procuraNoGoogle("UTFPR");
        Assert.assertTrue(verificaSeEncontrou);
    }

}
