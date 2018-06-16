package uam.admision.pruebaimprimir.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import uam.admision.pruebaimprimir.Model.Table01Entity;
import uam.admision.pruebaimprimir.Service.Table01EntityService;

import java.util.List;

@Controller
public class PrincipalController {

    @Autowired
    private Table01EntityService table01EntityService;

    @GetMapping("/inicio")
    @ResponseBody
    public List<Table01Entity> listaloTodo() {
        System.out.println("Inicia petición");
        List<Table01Entity> todosRegistros = table01EntityService.listaTodo();
        for (int i = 0; i < todosRegistros.size(); i++) {
            System.out.println(todosRegistros.get(i).toString());
        }
        System.out.println("Inicia petición");
                return table01EntityService.listaTodo();
    }

}
