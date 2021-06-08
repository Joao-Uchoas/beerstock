package br.aprendendo.dio.beerstock.mapper;

import br.aprendendo.dio.beerstock.dto.BeerDTO;
import br.aprendendo.dio.beerstock.entity.Beer;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface BeerMapper {

    BeerMapper INSTANCE = Mappers.getMapper(BeerMapper.class);

    Beer toModel(BeerDTO beerDTO);

    BeerDTO toDTO(Beer beer);
}
