package top.ssy.share.admin.convert;

import top.ssy.share.admin.model.dto.DictConfigRequestDTO;
import top.ssy.share.admin.model.entity.DictConfig;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface DictConfigConvert {
    DictConfigConvert INSTANCE = Mappers.getMapper(DictConfigConvert.class);


    DictConfig convertToConfig(DictConfigRequestDTO dto);
}
