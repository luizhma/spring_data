package springdata.luiz_springdata;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import springdata.luiz_springdata.model.bean.Cidade;
import springdata.luiz_springdata.repository.CidadeRepository;

@RunWith(SpringRunner.class)
@SpringBootTest
public class CidadeQueryTest {

    @Autowired
    CidadeRepository cidadeRepo;

    @Test
    public void testInsertCidade() {
        Cidade c = new Cidade();
        c.setLatitude("123");
        c.setLongitude("456");
        c.setNome("São Paulo");
        cidadeRepo.save(c);
        System.out.println(c.getId());
    }
    @Test
    public void testFindByLatAndLongi(){
        Cidade cidade = cidadeRepo.findByLatitudeAndLongitude("123", "456");
        System.out.println(cidade);
    }
    @Test
    public void testFindByName(){
        Cidade cidade = cidadeRepo.findByNome("São Paulo");
        System.out.println(cidade);
    }
    @Test
    public void testFindByNameIgnoreCase(){
        Cidade cidade = cidadeRepo.findByNomeIgnoreCase("são paulo");
        System.out.println(cidade);
    }

}
