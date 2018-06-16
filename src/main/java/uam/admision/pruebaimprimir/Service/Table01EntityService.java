package uam.admision.pruebaimprimir.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import uam.admision.pruebaimprimir.Model.Table01Entity;
import uam.admision.pruebaimprimir.Repository.Table01EntityRepository;

import java.util.List;

@Service
public class Table01EntityService {

    @Autowired
    Table01EntityRepository table01EntityRepository;

    public List<Table01Entity> listaTodo() {
        return table01EntityRepository.findAll();
    }
}
