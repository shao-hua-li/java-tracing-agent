package dakaraphi.devtools.tracing.config;

import org.junit.Test;

import dakaraphi.devtools.tracing.ClassMethodSelector;

public class ConfigurationSerializer_Test {

	@Test
	public void canReadJsonFile() {
		System.setProperty(ConfigurationSerializer.FILE_PROPERTY_KEY, System.getProperty("user.dir") + "/config.json");
		ConfigurationSerializer serializer = new ConfigurationSerializer();
		serializer.map(new ClassMethodSelector());
	}
}
