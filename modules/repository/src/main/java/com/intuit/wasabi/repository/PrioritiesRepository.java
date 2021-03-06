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
package com.intuit.wasabi.repository;

import com.intuit.wasabi.experimentobjects.Application;
import com.intuit.wasabi.experimentobjects.Experiment;
import com.intuit.wasabi.experimentobjects.PrioritizedExperimentList;

import java.util.List;

/**
 * Interface to priorities repo
 *
 * @see Application
 * @see Experiment
 */
public interface PrioritiesRepository {

    /**
     * Returns the priority list for an application
     * 
     * @param applicationName  name of application
     * @return PrioritizedExperimentList
     */
    PrioritizedExperimentList getPriorities(Application.Name applicationName);

    /**
     * Returns the length of the priority list for an application
     * 
     * @param applicationName   name of application
     * @return length of the list
     */
    int getPriorityListLength(Application.Name applicationName);

    /**
     * Upserts the priority list for an application
     *
     * @param applicationName           name of application
     * @param experimentPriorityList    list of experiments as their priorities
     */
    void createPriorities(Application.Name applicationName, List<Experiment.ID> experimentPriorityList);

    /**
     * Get priority list by application name
     * 
     * @param applicationName     name of application
     * @return list of expriement ids
     */
    List<Experiment.ID> getPriorityList(Application.Name applicationName);
}
