/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 */
package org.apache.jmeter.report.processor.graph;

import org.apache.jmeter.report.core.Sample;

/**
 * The class ElapsedTimeValueSelector provides a projection from a sample to its
 * elapsed time.
 *
 * @since 2.14
 */
public class ElapsedTimeValueSelector implements GraphValueSelector {

    /*
     * (non-Javadoc)
     * 
     * @see
     * org.apache.jmeter.report.csv.processor.GraphValueSelector#select(java
     * .lang.String, java.lang.Object, org.apache.jmeter.report.csv.core.Sample)
     */
    @Override
    public double select(String series, Sample sample) {
        return sample.getElapsedTime();
    }

}
