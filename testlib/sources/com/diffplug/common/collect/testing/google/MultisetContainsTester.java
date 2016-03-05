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

import static com.diffplug.common.collect.testing.features.CollectionSize.ZERO;

import java.util.Arrays;

import com.diffplug.common.annotations.GwtCompatible;
import com.diffplug.common.collect.testing.features.CollectionSize;

/**
 * Tests for {@code Multiset.containsAll} not already addressed by {@code CollectionContainsTester}.
 *
 * @author Louis Wasserman
 */
@GwtCompatible
public class MultisetContainsTester<E> extends AbstractMultisetTester<E> {
	@CollectionSize.Require(absent = ZERO)
	public void testContainsAllMultisetIgnoresFrequency() {
		assertTrue(getMultiset()
				.containsAll(getSubjectGenerator().create(e0(), e0(), e0())));
	}

	@CollectionSize.Require(absent = ZERO)
	public void testContainsAllListIgnoresFrequency() {
		assertTrue(getMultiset().containsAll(Arrays.asList(e0(), e0(), e0())));
	}
}