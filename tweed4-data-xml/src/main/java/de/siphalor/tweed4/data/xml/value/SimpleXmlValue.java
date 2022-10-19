/*
 * Copyright 2021-2022 Siphalor
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

package de.siphalor.tweed4.data.xml.value;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.w3c.dom.Element;

import java.util.function.Supplier;

public class SimpleXmlValue implements XmlValue {
	private final Element element;

	public SimpleXmlValue(Element element) {
		this.element = element;
	}

	@Override
	public @NotNull String getText() {
		return element.getTextContent();
	}

	@Override
	public @Nullable String getType() {
		return element.getAttribute("type");
	}

	@Override
	public @NotNull Element getElement(Supplier<Element> elementSupplier) {
		return element;
	}

	@Override
	public boolean equals(Object obj) {
		return defaultEquals(obj);
	}
}
