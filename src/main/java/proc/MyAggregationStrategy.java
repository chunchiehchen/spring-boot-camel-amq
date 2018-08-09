package proc;

import org.apache.camel.Exchange;
import org.apache.camel.processor.aggregate.AggregationStrategy;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MyAggregationStrategy implements AggregationStrategy {

    static Logger log = LoggerFactory.getLogger(MyAggregationStrategy.class);

    public Exchange aggregate(Exchange oldExchange, Exchange newExchange) {

        log.error("==> here 1");

        if (oldExchange == null) {
            log.error("==> here 2-1");
            return newExchange;
        }

        if (newExchange == null) {
            log.error("==> here 2-1");
        }

        log.error("==> here 3");

        String oldBody = oldExchange.getIn().getBody(String.class).trim();
        log.error("==> here 4");

        String newBody = newExchange.getIn().getBody(String.class).trim();
        log.error("==> here 5");

        String body = oldBody + newBody;
        log.error("==> here 6");

        oldExchange.getIn().setBody(body);
        log.error("==> here 7");

        return oldExchange;
    }

}
