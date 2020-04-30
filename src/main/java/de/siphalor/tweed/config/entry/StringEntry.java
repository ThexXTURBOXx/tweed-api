package de.siphalor.tweed.config.entry;

import de.siphalor.tweed.config.value.ConfigValue;
import de.siphalor.tweed.data.DataContainer;
import de.siphalor.tweed.data.DataValue;
import net.minecraft.network.PacketByteBuf;

@Deprecated
public class StringEntry extends AbstractValueEntry<String, StringEntry> {
	public StringEntry(String defaultValue) {
		super(defaultValue, ConfigValue.stringSerializer());
	}

	@Override
	public String readValue(DataValue<?> json) {
        return json.asString();
	}

	@Override
	public String readValue(PacketByteBuf buf) {
		return buf.readString(32767);
	}

	@Override
	public <Key> void writeValue(DataContainer<?, Key> parent, Key name, String value) {
		parent.set(name, value);
	}

	@Override
	public void writeValue(String value, PacketByteBuf buf) {
		buf.writeString(value);
	}

}
