package com.uangteman.vendor.repository.master;

import com.uangteman.common.model.constant.StateType;
import com.uangteman.vendor.model.MrTemplate;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;

@RepositoryRestResource(exported = false)
public interface MrTemplateRepository extends JpaRepository<MrTemplate, Integer> {

    MrTemplate findById(Integer id);

    MrTemplate findByIdAndState(Integer id, StateType state);

    MrTemplate findByIdAndStateNot(Integer id, StateType state);

    Page<MrTemplate> findAll(Pageable pageable);

    List<MrTemplate> findAll();

    Page<MrTemplate> findByState(Pageable pageable, StateType state);

    List<MrTemplate> findByState(StateType state);

    Page<MrTemplate> findByStateNot(Pageable pageable, StateType state);

    List<MrTemplate> findByStateNot(StateType state);

}
