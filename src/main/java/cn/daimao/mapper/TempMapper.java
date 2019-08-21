package cn.daimao.mapper;

import cn.daimao.pojo.Temp;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface TempMapper {
    List<Temp> getTemp(String stn, String wban);}
