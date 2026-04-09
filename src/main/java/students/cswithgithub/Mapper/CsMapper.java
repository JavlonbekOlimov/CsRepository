package students.cswithgithub.Mapper;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import students.cswithgithub.DAO.CsDAO;
import students.cswithgithub.DTO.CsDTO;

import java.util.List;


    @Mapper(componentModel = "spring")
    public interface CsMapper {

        @Mapping(target = "id", ignore = true)
        CsDAO toDao(CsDTO csDTO);

        CsDTO toDto(CsDAO csDAO);

        List<CsDTO> toDTOList(List<CsDAO>menuDAOListO);
    }
