package guru.springframework.msscjacksonexamples.model;


import com.fasterxml.jackson.core.JsonProcessingException;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.autoconfigure.json.JsonTest;
import org.springframework.test.context.ActiveProfiles;

import java.io.IOException;

@ActiveProfiles("kebab")
@JsonTest
public class BeerDtoKebabTest extends BaseTest{

    @Test
    void testKebab() throws JsonProcessingException {
        BeerDto beerDto = getDto();

        String json = objectMapper.writeValueAsString(beerDto);

        System.out.println(json);
    }

    @Test
    void testDeserialize() throws IOException {

        String json = "{\"beer-name\":\"BeerName\",\"beer-style\":\"Ale\",\"upc\":32131241242,\"price\":\"12.99\",\"created-date\":\"2020-07-01T09:44:26+0200\",\"last-updated-date\":\"2020-07-01T09:44:26.4577581+02:00\",\"my-local-date\":\"20200701\",\"beerId\":\"3ef6d75e-bd84-4f43-b417-6d5fb5e41039\"}\n";

        BeerDto dto = objectMapper.readValue(json, BeerDto.class);

        System.out.println(dto);

    }
}

