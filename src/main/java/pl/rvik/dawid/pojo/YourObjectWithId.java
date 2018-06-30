package pl.rvik.dawid.pojo;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

/**
 * @author Rvik
 */
@Data
public class YourObjectWithId {
    @JsonProperty
    private String externalId;
    @JsonProperty
    private Integer externalId2;
}
