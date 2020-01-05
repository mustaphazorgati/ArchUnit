/*
 * Copyright 2014-2020 TNG Technology Consulting GmbH
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
 */
package com.tngtech.archunit.lang.syntax.elements;

import com.tngtech.archunit.PublicAPI;
import com.tngtech.archunit.core.domain.JavaClass;
import com.tngtech.archunit.lang.ArchCondition;
import com.tngtech.archunit.lang.ArchRule;

import static com.tngtech.archunit.PublicAPI.Usage.ACCESS;

public interface ClassesShouldConjunction extends ArchRule {
    @PublicAPI(usage = ACCESS)
    ClassesShouldConjunction andShould(ArchCondition<? super JavaClass> condition);

    @PublicAPI(usage = ACCESS)
    ClassesShould andShould();

    @PublicAPI(usage = ACCESS)
    ClassesShouldConjunction orShould(ArchCondition<? super JavaClass> condition);

    @PublicAPI(usage = ACCESS)
    ClassesShould orShould();
}
