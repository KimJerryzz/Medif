package kr.or.medif.repository;

import kr.or.medif.domain.entity.Expert;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ExpertRepo extends JpaRepository<Expert, Long> {
}
