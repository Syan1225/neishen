package org.jeecg.modules.business.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Param;
import org.jeecg.modules.business.entity.Client;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

/**
 * @Description: 客户
 * @Author: jeecg-boot
 * @Date:   2021-04-02
 * @Version: V1.0
 */
@Repository
public interface ClientMapper extends BaseMapper<Client> {

    String getClientEntity(@Param("id") String id);
    Map<String, String> getClientsEntity(@Param("ids") List<String> ids);
    String getClientByInternalCode(@Param("code") String code);
}