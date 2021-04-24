package springdata.luiz_springdata.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import springdata.luiz_springdata.model.bean.Cidade;

public interface CidadeRepository extends JpaRepository <Cidade, Long> {

    public Cidade findByLatitudeAndLongitude (String latitude, String longitude);

    public Cidade findByNome(String nome);

    public Cidade findByNomeIgnoreCase(String nome);
}
