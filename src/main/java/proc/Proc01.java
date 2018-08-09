package proc;

import org.apache.camel.Exchange;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import dto.WhateverRequest;

public class Proc01 extends ProcAbstract {

    public static final Logger log = LoggerFactory.getLogger(Proc01.class);

    @Override
    public void process(Exchange exchange) throws Exception {

        WhateverRequest request = exchange.getIn().getBody(WhateverRequest.class);

        String data = request.toString();
        log.error(">>> data = " + data);

        exchange.getIn().setBody(String.format("%04d%s", data.length(), data));
    }

}
