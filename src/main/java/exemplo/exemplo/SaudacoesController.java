package exemplo.exemplo;

import java.util.concurrent.atomic.AtomicLong;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
public class SaudacoesController {
    private String modelo = "Hello, %s!"; 
    private AtomicLong cont = new AtomicLong();
    
    @GetMapping("/saudacoes")
    public Saudacoes saudacoes(@RequestParam(value="name", defaultValue="World") String name) {
        return new Saudacoes(cont.incrementAndGet(), String.format(modelo, name));
    }
    
}
