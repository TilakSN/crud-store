/*
 * Copyright 2022. Live the Oogway, Tushar Naik
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except in
 * compliance with the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License is
 * distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing permissions and limitations
 * under the License.
 */

package com.livetheoogway.crudstore.aerospike;

import com.aerospike.client.IAerospikeClient;
import com.fasterxml.jackson.databind.ObjectMapper;

public class TestAerospikeStore extends AerospikeStore<TestData> {

    protected TestAerospikeStore(final IAerospikeClient client,
                                 final NamespaceSet namespaceSet,
                                 final ObjectMapper mapper,
                                 final ErrorHandler<TestData> errorHandler) {
        super(client, namespaceSet, mapper, TestData.class, errorHandler);
    }

    @Override
    public boolean isValidDataItem(final TestData testData) {
        return true;
    }
}
