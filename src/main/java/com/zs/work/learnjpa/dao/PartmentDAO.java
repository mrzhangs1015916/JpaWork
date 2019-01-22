package com.zs.work.learnjpa.dao;

import com.zs.work.learnjpa.entity.Partment;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface PartmentDAO extends JpaRepository<Partment,Long> {
    Partment findByPartid(int partid);
    List<Partment> findAllBy();
}
