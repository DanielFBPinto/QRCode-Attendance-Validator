package simulacao.si.services;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import simulacao.si.classes.Aluno;
import simulacao.si.repositories.AlunoRepo;

@Service
public class AlunoService {
    @Autowired
    private AlunoRepo alunoRepo;

    /**
     * Utilizado nos testes
     */
    public void save(Aluno aluno) {
        alunoRepo.save(aluno);
    }
}
