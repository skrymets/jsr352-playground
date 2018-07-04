/*
 * Copyright 2018 skrymets.
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
package my.jsr352.playground.jobs;

import javax.batch.api.AbstractBatchlet;
import javax.batch.api.BatchProperty;
import javax.inject.Inject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 *
 * @author skrymets
 */
public class MyJSRBatchlet extends AbstractBatchlet {

    private static final Logger LOG = LoggerFactory.getLogger(MyJSRBatchlet.class);

    @Inject
    @BatchProperty
    private String userProperty;
    
    public MyJSRBatchlet() {
    }

    public String getUserProperty() {
        return userProperty;
    }

    public void setUserProperty(String userProperty) {
        this.userProperty = userProperty;
    }

    @Override
    public String process() throws Exception {
        LOG.info("The processing is tarted by {} with {}", MyJSRBatchlet.class.getName(), userProperty);
        return "";
    }

    @Override
    public void stop() throws Exception {
        LOG.info("Stop the job.");
    }

}
