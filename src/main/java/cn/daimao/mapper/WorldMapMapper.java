package cn.daimao.mapper;

import cn.daimao.pojo.CountryStation;
import org.springframework.stereotype.Component;

import java.util.List;


@Component
public interface WorldMapMapper {
     List<CountryStation> getWorldMap();


}
