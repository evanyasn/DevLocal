package com.uangteman.vendor.service.impl.master;

import com.uangteman.common.model.constant.StateType;
import com.uangteman.vendor.model.MrTemplate;
import com.uangteman.vendor.repository.master.MrTemplateRepository;
import com.uangteman.vendor.service.master.MrTemplateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.ExampleMatcher;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service("mrTemplateService")
@Transactional
public class MrTemplateServiceImpl implements MrTemplateService {

    @Autowired
    private MrTemplateRepository repo;

    @Override
    public MrTemplate findById(Integer id) {
        return repo.findById(id);
    }

    @Override
    public MrTemplate findByIdAndState(Integer id, StateType state) {
        return repo.findByIdAndState(id, state);
    }

    @Override
    public MrTemplate findByIdAndStateNot(Integer id, StateType state) {
        return repo.findByIdAndStateNot(id, state);
    }

    @Override
    public Page<MrTemplate> findAll(Pageable page) {
        return repo.findAll(page);
    }

    @Override
    public List<MrTemplate> findAll() {
        return repo.findAll();
    }

    @Override
    public Page<MrTemplate> findAllAndState(Pageable pageable, StateType state) {
        return repo.findByState(pageable, state);
    }

    @Override
    public List<MrTemplate> findAllAndState(StateType state) {
        return repo.findByState(state);
    }

    @Override
    public Page<MrTemplate> findAllAndStateNot(Pageable pageable, StateType state) {
        return repo.findByStateNot(pageable, state);
    }

    @Override
    public List<MrTemplate> findAllAndStateNot(StateType state) {
        return repo.findByState(state);
    }

    @Override
    public Page<MrTemplate> findByExample(Pageable pageable, MrTemplate mrTemplate) {
        ExampleMatcher matcher = ExampleMatcher.matching().withStringMatcher(ExampleMatcher.StringMatcher.CONTAINING).withIgnoreCase();
        Example<MrTemplate> example = Example.of(mrTemplate, matcher);

        return repo.findAll(example, pageable);
    }

    @Override
    public List<MrTemplate> findByExample(MrTemplate mrTemplate) {
        ExampleMatcher matcher = ExampleMatcher.matching().withStringMatcher(ExampleMatcher.StringMatcher.CONTAINING).withIgnoreCase();
        Example<MrTemplate> example = Example.of(mrTemplate, matcher);

        return repo.findAll(example);
    }

    @Override
    public Page<MrTemplate> findByParam(Pageable pageable, String attribut, String value) {
        return null;
    }

    @Override
    public MrTemplate save(MrTemplate mrTemplate) {
        return repo.save(mrTemplate);
    }

    @Override
    public void delete(Integer id) {
        MrTemplate mrTemplate = repo.findById(id);
        mrTemplate.setIsDelete(StateType.Y);
        repo.save(mrTemplate);
    }

    @Override
    public void harDelete(Integer id) {
        repo.delete(id);
    }

    @Override
    public void delete(MrTemplate mrTemplate) {
        mrTemplate.setIsDelete(StateType.Y);
    }

    @Override
    public void harDelete(MrTemplate mrTemplate) {
        repo.delete(mrTemplate);
    }
}
