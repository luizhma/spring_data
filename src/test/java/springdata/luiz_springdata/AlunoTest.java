package springdata.luiz_springdata;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import springdata.luiz_springdata.model.bean.Aluno;
import springdata.luiz_springdata.repository.AlunoRepository;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class AlunoTest {
    @Autowired
    AlunoRepository alunoRepo;

    @Test
    public void testInsertAluno () {
        Aluno a = new Aluno();
        a.setNome("Luiz Henrique");
        a.setFone("123456");
        a.setEmail("luiz@gmail.com");
        a = alunoRepo.save(a);
        System.out.println(a.getId());
    }
    @Test
    public void testFindAll (){
        List<Aluno> lista = alunoRepo.findAll();
        System.out.println(lista);
    }
    @Test
    public void testCount (){
        System.out.println(alunoRepo.count());
    }
    @Test
    public void testDeleteById (){
        Aluno a = new Aluno();
        a.setId(1L);
        alunoRepo.delete(a);
    }
    @Test
    public void testFindById(){
        alunoRepo.findById(1L);
    }


}
