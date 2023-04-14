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

package com.alibaba.nacos.plugin.datasource.impl.postgresql;

import com.alibaba.nacos.common.utils.StringUtils;
import com.alibaba.nacos.plugin.datasource.constants.DataSourceConstant;
import com.alibaba.nacos.plugin.datasource.impl.derby.ConfigInfoTagsRelationMapperByDerby;

import java.util.Map;

/**
 * The mysql implementation of ConfigTagsRelationMapper.
 *
 * @author hyx
 **/

public class ConfigTagsRelationMapperByPostgreSql extends ConfigInfoTagsRelationMapperByDerby {

    @Override
    public String getDataSource() {
        return DataSourceConstant.POSTGRESQL;
    }
}
