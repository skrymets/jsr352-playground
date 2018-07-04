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
package my.jsr352.playground.shell;

import javax.batch.operations.JobOperator;
import javax.batch.runtime.BatchRuntime;
import org.springframework.shell.standard.ShellComponent;
import org.springframework.shell.standard.ShellMethod;
import org.springframework.shell.standard.ShellOption;

/**
 *
 * @author skrymets
 */
@ShellComponent
public class InternalShell {
    
    @ShellMethod("Stops an execution by it's id.")
    public void stopJob(@ShellOption long executionId) {
        JobOperator jobOp = BatchRuntime.getJobOperator();
        jobOp.stop(executionId);
    }
    
    /**
     * @ShellMethodAvailability("methodAviability")
     * public void command1() {
     * }
     *
     * public Availability methodAviability() {
     * return ...
     * }
     */
}
