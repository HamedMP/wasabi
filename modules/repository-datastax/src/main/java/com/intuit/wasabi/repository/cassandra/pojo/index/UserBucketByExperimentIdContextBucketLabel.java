/*******************************************************************************
 * Copyright 2016 Intuit
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *******************************************************************************/
package com.intuit.wasabi.repository.cassandra.pojo.index;

import com.datastax.driver.mapping.annotations.ClusteringColumn;
import com.datastax.driver.mapping.annotations.Column;
import com.datastax.driver.mapping.annotations.PartitionKey;
import com.datastax.driver.mapping.annotations.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
import java.util.UUID;

@Table(name="user_bucket_index")
@Data
@Builder(toBuilder = true)
@NoArgsConstructor
@AllArgsConstructor
public class UserBucketByExperimentIdContextBucketLabel {

    @PartitionKey(0)
    @Column(name = "experiment_id")
    UUID experimentId;

    @PartitionKey(1)
    String context;

    @PartitionKey(2)
    @Column(name = "bucket_label")
    String bucketLabel;

    @ClusteringColumn(0)
    @Column(name = "user_id")
    String userId;

    Date assigned;

}