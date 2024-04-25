package com.husu.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.husu.pojo.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @author huyong(husu)
 * @date 4/25/2024 4:28 PM
 */
@Mapper
public interface UserMapper extends BaseMapper<User> {
    List<User> findAll();
}
