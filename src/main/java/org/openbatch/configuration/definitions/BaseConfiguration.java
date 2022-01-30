package org.openbatch.configuration.definitions;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import java.util.List;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import org.openbatch.configuration.enums.ConfigurationType;

/**
 * Abstract implementation of the Base Configuration that contains the shared
 * members of a Open Batch Configuration.
 */
@JsonPropertyOrder(alphabetic = true)
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonIgnoreProperties(ignoreUnknown = true)
@Getter
@Setter
@EqualsAndHashCode
public abstract class BaseConfiguration {

  @JsonProperty("name")
  private String name;

  @JsonProperty("enabled")
  private boolean enabled;

  @JsonProperty("type")
  private ConfigurationType type;

  @JsonProperty("externalSettings")
  private List<ExternalSetting> externalSettings;
}
