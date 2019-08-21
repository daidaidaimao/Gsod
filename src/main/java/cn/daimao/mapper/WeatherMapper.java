package cn.daimao.mapper;

import cn.daimao.pojo.Weather2016;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;


import java.util.List;

@Component
public interface WeatherMapper {
    List<Weather2016> getData(@Param("stn")String stn, @Param("wban")String wban);
}
