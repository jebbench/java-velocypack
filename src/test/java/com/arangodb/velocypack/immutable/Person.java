/*
 * DISCLAIMER
 *
 * Copyright 2016 ArangoDB GmbH, Cologne, Germany
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
 *
 * Copyright holder is ArangoDB GmbH, Cologne, Germany
 */

package com.arangodb.velocypack.immutable;

import com.arangodb.velocypack.annotations.VPackPOJOBuilder;
import org.immutables.value.Value;

import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * @author Michele Rastelli
 */
@Value.Immutable
@Value.Style(init = "with*",
			 build = "buildIt")
public abstract class Person {

	@VPackPOJOBuilder(buildMethodName = "buildIt",
					  withSetterPrefix = "with")
	public static ImmutablePerson.Builder builderFunction() {
		return ImmutablePerson.builder();
	}

	abstract String getName();

	abstract int getAge();

	abstract Set<String> getSecondNames();

	abstract List<Map<String, String>> getAddresses();

}
