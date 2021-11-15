package one.digitalinnovationone.beerstock.mapper;

import one.digitalinnovationone.beerstock.dto.BeerDTO;
import one.digitalinnovationone.beerstock.entity.Beer;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface BeerMapper {

    BeerMapper INSTANCE = Mappers.getMapper(BeerMapper.class);

    Beer toModel(BeerDTO beerDTO);

    BeerDTO toDTO(Beer beer);
}
