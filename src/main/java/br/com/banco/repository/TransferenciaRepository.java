package br.com.banco.repository;

import br.com.banco.model.Transferencia;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.time.LocalDateTime;
import java.util.List;

@Repository
public interface TransferenciaRepository extends JpaRepository<Transferencia, Long> {

    List<Transferencia> findByDataTransferenciaBeforeAndNomeOperadorTransacao(
            LocalDateTime dataFim, String nomeOperador);

    List<Transferencia> findByDataTransferenciaAfterAndNomeOperadorTransacao(
            LocalDateTime dataInicio, String nomeOperador);

    List<Transferencia> findByDataTransferenciaBetweenAndNomeOperadorTransacao(
            LocalDateTime dataInicio, LocalDateTime dataFim, String nomeOperador);

    List<Transferencia> findByNomeOperadorTransacao(String nomeOperador);
}
