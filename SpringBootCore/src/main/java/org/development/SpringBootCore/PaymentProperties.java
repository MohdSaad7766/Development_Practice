package org.development.SpringBootCore;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties("payment.property")
public class PaymentProperties {

    private String type;
    private int retryCount;
    private int timeOut;
    private boolean enabled;


    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getRetryCount() {
        return retryCount;
    }

    public void setRetryCount(int retryCount) {
        this.retryCount = retryCount;
    }

    public int getTimeOut() {
        return timeOut;
    }

    public void setTimeOut(int timeOut) {
        this.timeOut = timeOut;
    }

    public boolean isEnabled() {
        return enabled;
    }

    public void setEnabled(boolean enabled) {
        this.enabled = enabled;
    }

    @Override
    public String toString() {
        return "PaymentProperties{" +
                "type='" + type + '\'' +
                ", retryCount=" + retryCount +
                ", timeOut=" + timeOut +
                ", enabled=" + enabled +
                '}';
    }
}
