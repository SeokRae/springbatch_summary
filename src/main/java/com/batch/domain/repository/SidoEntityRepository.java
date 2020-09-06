package com.batch.domain.repository;

import com.batch.domain.batch.Sido;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface SidoEntityRepository extends JpaRepository<Sido, Integer> {
    List<Sido> findAllByCtprvnNm(String ctprvnNm);

    Sido findByCtprvnNm(String ctprvnNm);

    Sido findByCtprvnCode(Integer ctprvnCode);
}