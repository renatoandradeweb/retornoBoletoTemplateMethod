import com.manoelcampos.retornoboleto.LeituraRetornoBancoBradesco;
import com.manoelcampos.retornoboleto.LeituraRetornoBancoBrasil;
import com.manoelcampos.retornoboleto.ProcessarBoletos;

import java.net.URISyntaxException;

/**
 * Classe para ver o funcionamento da leitura de boletos.
 *
 * @author Manoel Campos da Silva Filho
 */
public class Principal {
    public static void main(String[] args) throws URISyntaxException {
  ProcessarBoletos processador = new LeituraRetornoBancoBradesco();
//        String bancoBrasil = "banco-brasil-1.csv";
        String bancoBradesco = "bradesco-1.csv";
        processador.processar(bancoBradesco);
    }
}
