package dk.moerks.soapws.processors;

import dk.moerks.soapws.schemas.WeatherRequest;
import dk.moerks.soapws.schemas.WeatherResponse;
import org.apache.camel.Exchange;
import org.apache.camel.Processor;

public class WeatherProcessor implements Processor {

    public void process(Exchange exchange) throws Exception {
        WeatherRequest request = exchange.getIn().getBody(WeatherRequest.class);
        WeatherResponse response = new WeatherResponse();
        response.setForecast("Cloudy");
        response.setTempCelsius(10);
        exchange.getOut().setBody(response);

    }
}
