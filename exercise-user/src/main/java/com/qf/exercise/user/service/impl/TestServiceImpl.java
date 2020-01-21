package com.qf.exercise.user.service.impl;

import com.qf.exercise.user.entity.Test;
import com.qf.exercise.user.mapper.TestMapper;
import com.qf.exercise.user.service.ITestService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author xiongjun
 * @since 2020-01-22
 */
@Service
public class TestServiceImpl extends ServiceImpl<TestMapper, Test> implements ITestService {

}
