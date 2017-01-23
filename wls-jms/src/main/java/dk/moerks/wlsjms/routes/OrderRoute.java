package dk.moerks.wlsjms.routes;

import dk.moerks.wlsjms.schemas.OrderRequest;
import org.apache.camel.ExchangePattern;
import org.apache.camel.builder.RouteBuilder;
import org.apache.camel.model.dataformat.JaxbDataFormat;

public class OrderRoute extends RouteBuilder {
    public void configure() throws Exception {
        JaxbDataFormat jaxb = new JaxbDataFormat();
        jaxb.setContextPath(OrderRequest.class.getPackage().getName());

        from("spring-ws:rootqname:{http://moerks.dk/wlsjms/schemas}OrderRequest?endpointMapping=#endpointMapping")
                .setExchangePattern(ExchangePattern.InOnly)
                .to("jms:queue:./OrderSystemModule!OrderQueue");
    }
}
