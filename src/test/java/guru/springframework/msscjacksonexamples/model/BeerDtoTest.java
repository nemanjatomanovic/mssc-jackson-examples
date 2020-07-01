package guru.springframework.msscjacksonexamples.model;

import com.fasterxml.jackson.core.JsonProcessingException;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.autoconfigure.json.JsonTest;

import java.io.IOException;


@JsonTest
class BeerDtoTest extends BaseTest {


    @Test
    void testSerializeDto() throws JsonProcessingException {
        BeerDto beerDto = getDto();

        String jsonString = objectMapper.writeValueAsString(beerDto);

        System.out.println(jsonString);
    }

    @Test
    void testDeserialize() throws IOException {

        String json = "{\"beer-name\":\"BeerName\",\"beer-style\":\"Ale\",\"upc\":32131241242,\"price\":\"12.99\",\"created-date\":\"2020-07-01T09:41:18.5482393+02:00\",\"last-updated-date\":\"2020-07-01T09:41:18.5498128+02:00\",\"my-local-date\":\"20200701\",\"beerId\":\"96b75be7-ceb4-4f42-9795-08b38be10c7d\"}\n";

        BeerDto dto = objectMapper.readValue(json, BeerDto.class);

        System.out.println(dto);

    }
}