package com.chacha.properties.property;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * <p>
 *      项目配置
 * </p>
 *
 * @package: com.chacha.properties.property
 * @description: 项目配置
 * @author: Chacha
 */
@Data
@Component
public class ApplicationProperty {
    @Value("${application.name}")
    private String name;

    @Value("${application.version}")
    private String version;
}
