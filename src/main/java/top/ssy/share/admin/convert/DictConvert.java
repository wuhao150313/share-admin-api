package top.ssy.share.admin.convert;

import top.ssy.share.admin.model.dto.DictRequestDTO;
import top.ssy.share.admin.model.entity.Dict;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface DictConvert {
    DictConvert INSTANCE = Mappers.getMapper(DictConvert.class);


    Dict convertToDict(DictRequestDTO dto);
}
