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
package my.jsr352.playground;

import java.util.Properties;
import javax.annotation.PostConstruct;
import javax.batch.operations.JobOperator;
import javax.batch.runtime.BatchRuntime;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

/**
 *
 * @author skrymets
 */
@Component
public class Starter {
    
    private static final Logger LOG = LoggerFactory.getLogger(Starter.class);
    
    @PostConstruct
    public void init() {
        
        JobOperator jobOp = BatchRuntime.getJobOperator();
        Properties jobParameters = new Properties();
        
        long executionId = jobOp.start("dummyJob", jobParameters);
        
        LOG.info("A new job was executed wit id: {}", executionId);
        
    }
        
}
