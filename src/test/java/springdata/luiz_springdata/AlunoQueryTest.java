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
public class AlunoQueryTest {
    @Autowired
    AlunoRepository alunoRepo;

    @Test
    public void findOneTest(){
        Aluno a = alunoRepo.findByEmail("luiz@gmail.com");
        System.out.println(a);
    }
    @Test
    public void findManyTest(){
        List<Aluno> alunos = alunoRepo.queryByNome("Luiz Henrique");
        System.out.println(alunos);
    }
    @Test
    public void deleteTest(){
        System.out.println(alunoRepo.deleteByFone("123456"));
    }
    @Test
    public void countTest(){
        System.out.println(alunoRepo.countByEmail("luiz@gmail"));
    }
    @Test
    public void testFindWithAnd() {
        List<Aluno> alunos = alunoRepo.findByFoneAndNome("123456", "Luiz Henrique");
        System.out.println(alunos);
    }
    @Test
    public void testFindWithOr(){
        List<Aluno> alunos = alunoRepo.findByFoneOrNome("123456", "Luiz Henrique");
        System.out.println(alunos);
    }


}
