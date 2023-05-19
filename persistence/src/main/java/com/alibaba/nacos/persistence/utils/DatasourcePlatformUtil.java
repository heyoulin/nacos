/*
 * Copyright 1999-2022 Alibaba Group Holding Ltd.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.alibaba.nacos.persistence.utils;

import com.alibaba.nacos.common.utils.StringUtils;
import com.alibaba.nacos.persistence.constants.PersistenceConstant;
import com.alibaba.nacos.sys.env.EnvUtil;

/**
 * get datasource platform util.
 *
 * @author lixiaoshuang
 */
public class DatasourcePlatformUtil {
    
    /**
     * get datasource platform.
     *
     * @param defaultPlatform default platform.
     * @return platform
     */
    public static String getDatasourcePlatform(String defaultPlatform) {
        String platform = EnvUtil.getProperty(PersistenceConstant.DATASOURCE_PLATFORM_PROPERTY_NEW);
        if (StringUtils.isBlank(platform)) {
            platform = EnvUtil.getProperty(PersistenceConstant.DATASOURCE_PLATFORM_PROPERTY);
        }
        if (StringUtils.isBlank(platform)) {
            platform = EnvUtil.getProperty(PersistenceConstant.DATASOURCE_PLATFORM_PROPERTY_OLD);
        }
        if (StringUtils.isBlank(platform)) {
            return defaultPlatform;
        }
        return platform;
    }
}
