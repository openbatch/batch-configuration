package org.openbatch.configuration.dataobjects;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.openbatch.configuration.enums.ConfigurationType;

/**
 * Definition of an external configuration file that should be
 * included within your Base Configuration.
 */
@Getter
@Setter
@EqualsAndHashCode
@NoArgsConstructor
@JsonPropertyOrder(alphabetic = true)
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_EMPTY)
public class ExternalSetting {

  @JsonProperty("name")
  private String name;

  @JsonProperty("type")
  private ConfigurationType type;

  @JsonProperty("filePath")
  private String filePath;

}
