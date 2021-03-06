package kotify.models

import com.fasterxml.jackson.annotation.JsonIgnoreProperties
import com.fasterxml.jackson.annotation.JsonProperty

@JsonIgnoreProperties(ignoreUnknown = true)
data class Artist(
        @JsonProperty("external_urls") val externalUrls: Map<String, String>,
        val name: String, val id: String
)