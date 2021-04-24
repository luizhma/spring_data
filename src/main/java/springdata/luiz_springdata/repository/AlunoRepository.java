package springdata.luiz_springdata.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import springdata.luiz_springdata.model.bean.Aluno;

import javax.transaction.Transactional;
import java.util.List;


public interface AlunoRepository extends JpaRepository <Aluno, Long> {
    public Aluno findByEmail (String email);

    public Aluno getByEmail (String email);

    public int countByEmail (String email);

    @Transactional
    public long deleteByFone (String fone);

    public List<Aluno> queryByNome (String nome);

    public List<Aluno> findByFoneAndNome(String fone, String nome);

    public List<Aluno> findByFoneOrNome(String fone, String nome);

}
