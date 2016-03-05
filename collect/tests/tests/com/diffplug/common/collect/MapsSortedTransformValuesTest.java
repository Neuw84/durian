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
package com.diffplug.common.collect;

import java.util.Map;
import java.util.SortedMap;

import com.diffplug.common.annotations.GwtCompatible;
import com.diffplug.common.base.Function;
import com.diffplug.common.base.Functions;

/**
 * Tests for {@link Maps#transformValues(SortedMap, Function)}.
 * 
 * @author Louis Wasserman
 */
@GwtCompatible
public class MapsSortedTransformValuesTest extends MapsTransformValuesTest {

	@Override
	protected SortedMap<String, String> makeEmptyMap() {
		return Maps.transformValues(Maps.<String, String> newTreeMap(),
				Functions.<String> identity());
	}

	@Override
	protected SortedMap<String, String> makePopulatedMap() {
		SortedMap<String, Integer> underlying = Maps.newTreeMap();
		underlying.put("a", 1);
		underlying.put("b", 2);
		underlying.put("c", 3);
		return Maps.transformValues(underlying, Functions.toStringFunction());
	}

	public void testTransformValuesSecretlySortedMap() {
		Map<String, String> sortedMap = Maps.newTreeMap();
		assertTrue(Maps.transformValues(sortedMap, Functions.<String> identity()) instanceof SortedMap);
	}
}