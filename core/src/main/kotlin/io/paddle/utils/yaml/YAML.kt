package io.paddle.utils.yaml

import org.snakeyaml.engine.v2.api.Load
import org.snakeyaml.engine.v2.api.LoadSettings

internal object YAML {
    private val yaml = Load(LoadSettings.builder().build())

    inline fun <reified V> parse(text: String): V {
        return yaml.loadFromString(text) as V
    }
}

