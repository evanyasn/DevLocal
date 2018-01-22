package com.uangteman.vendor.service.master;

import com.uangteman.common.model.constant.StateType;
import com.uangteman.vendor.model.MrTemplate;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface MrTemplateService {

    public MrTemplate findById(Integer id);

    public MrTemplate findByIdAndState(Integer id, StateType state);

    public MrTemplate findByIdAndStateNot(Integer id, StateType state);

    public Page<MrTemplate> findAll(Pageable page);

    public List<MrTemplate> findAll();

    public Page<MrTemplate> findAllAndState(Pageable pageable, StateType state);

    public List<MrTemplate> findAllAndState(StateType state);

    public Page<MrTemplate> findAllAndStateNot(Pageable pageable, StateType state);

    public List<MrTemplate> findAllAndStateNot(StateType state);

    public Page<MrTemplate> findByExample(Pageable pageable, MrTemplate mrTemplate);

    public List<MrTemplate> findByExample(MrTemplate mrTemplate);

    public Page<MrTemplate> findByParam(Pageable pageable, String attribut, String value);

    public MrTemplate save(MrTemplate mrTemplate);

    public void delete(Integer id);

    public void harDelete(Integer id);

    public void delete(MrTemplate mrTemplate);

    public void harDelete(MrTemplate mrTemplate);

}
