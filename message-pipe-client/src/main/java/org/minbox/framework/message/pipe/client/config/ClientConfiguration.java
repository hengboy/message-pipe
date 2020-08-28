package org.minbox.framework.message.pipe.client.config;

import lombok.Data;
import lombok.experimental.Accessors;
import org.minbox.framework.message.pipe.core.untis.InternetAddressUtils;

/**
 * Related configuration items needed to build the client
 *
 * @author 恒宇少年
 */
@Data
@Accessors(chain = true)
public class ClientConfiguration {
    /**
     * Local processing message server port
     */
    private int localPort = 5201;
    /**
     * Register the target server address
     */
    private String serverAddress = "localhost";
    /**
     * Register the target server port
     */
    private int serverPort = 5200;
    /**
     * Registration retries
     */
    private int retryRegisterTimes = 3;
    /**
     * Time interval when retrying to register to Server, unit: millisecond
     *
     * @see java.util.concurrent.TimeUnit#MILLISECONDS
     */
    private long retryRegisterIntervalMilliSeconds = 1000;
    /**
     * Time interval for sending heartbeat, unit: second
     *
     * @see java.util.concurrent.TimeUnit#SECONDS
     */
    private int heartBeatIntervalSeconds = 10;

    /**
     * Get local host
     *
     * @return local host
     */
    public String getLocalHost() {
        return InternetAddressUtils.getLocalIpByNetCard();
    }
}
