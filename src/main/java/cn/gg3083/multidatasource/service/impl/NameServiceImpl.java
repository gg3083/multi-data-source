package cn.gg3083.multidatasource.service.impl;

import cn.gg3083.multidatasource.annotation.Master;
import cn.gg3083.multidatasource.domain.Name;
import cn.gg3083.multidatasource.mapper.NameMapper;
import cn.gg3083.multidatasource.service.NameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class NameServiceImpl implements NameService {

    @Autowired
    private NameMapper nameMapper;

    @Override
    public int insert(String name) {
        return nameMapper.insert(name);
    }

    @Master
    @Override
    public int save(String name) {
        return nameMapper.insert(name);
    }

    @Override
    public List<Name> selectAll() {
        return nameMapper.selectAll();
    }

    @Override
    @Master
    public List<Name> getList() {
        return nameMapper.selectAll();
    }

//    @Master
//    @Override
//    public String getToken(String appId) {
//        //  有些读操作必须读主数据库
//        //  比如，获取微信access_token，因为高峰时期主从同步可能延迟
//        //  这种情况下就必须强制从主数据读
//        return null;
//    }
}