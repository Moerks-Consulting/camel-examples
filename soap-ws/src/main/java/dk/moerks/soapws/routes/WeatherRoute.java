package dk.moerks.soapws.routes;

import dk.moerks.soapws.processors.WeatherProcessor;
import dk.moerks.soapws.schemas.WeatherRequest;
import org.apache.camel.builder.RouteBuilder;
import org.apache.camel.model.dataformat.JaxbDataFormat;

public class WeatherRoute extends RouteBuilder{
    public void configure() throws Exception {
        JaxbDataFormat jaxb = new JaxbDataFormat();
        jaxb.setContextPath(WeatherRequest.class.getPackage().getName());

        WeatherProcessor weatherProcessor = new WeatherProcessor();

        from("spring-ws:rootqname:{http://moerks.dk/soapws/schemas}WeatherRequest?endpointMapping=#endpointMapping")
                .unmarshal(jaxb)
                .process(weatherProcessor)
                .marshal(jaxb);
    }
}
