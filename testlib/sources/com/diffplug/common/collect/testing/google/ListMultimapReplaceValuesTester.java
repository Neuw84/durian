/*
 * Original Guava code is copyright (C) 2015 The Guava Authors.
 * Modifications from Guava are copyright (C) 2016 DiffPlug.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.diffplug.common.collect.testing.google;

import static com.diffplug.common.collect.testing.features.MapFeature.SUPPORTS_PUT;
import static com.diffplug.common.collect.testing.features.MapFeature.SUPPORTS_REMOVE;

import java.util.Arrays;
import java.util.List;

import com.diffplug.common.annotations.GwtCompatible;
import com.diffplug.common.collect.ListMultimap;
import com.diffplug.common.collect.testing.features.MapFeature;

/**
 * Testers for {@link ListMultimap#replaceValues(Object, Iterable)}.
 *
 * @author Louis Wasserman
 */
@GwtCompatible
public class ListMultimapReplaceValuesTester<K, V> extends AbstractListMultimapTester<K, V> {
	@MapFeature.Require({SUPPORTS_PUT, SUPPORTS_REMOVE})
	public void testReplaceValuesPreservesOrder() {
		@SuppressWarnings("unchecked")
		List<V> values = Arrays.asList(
				v3(),
				v1(),
				v4());

		for (K k : sampleKeys()) {
			resetContainer();
			multimap().replaceValues(k, values);
			assertGet(k, values);
		}
	}
}