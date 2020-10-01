package com.chacha.properties.property;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * <p>
 *      开发人员配置信息
 * </p>
 *
 * @package: com.chacha.properties.property
 * @description: 开发人员配置信息
 * @author: Chacha
 */
@Data
@ConfigurationProperties(prefix = "developer")
@Component
public class DeveloperProperty {
    private String name;
    private String website;
    private String mobile;
}
