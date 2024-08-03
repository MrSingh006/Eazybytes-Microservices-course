package com.eazybytes.accounts.dto;

import org.springframework.boot.context.properties.ConfigurationProperties;

import java.util.List;
import java.util.Map;

/*Record is the new java class introduced in java 17. Sometimes we only need our pojo class
 or DTO class to act as a data carriers. To do that our record class have all fields as final,
 there is no setter methods only getter methods are present. Fields name should be same as the
 field names that we have provided in our YML file.*/
@ConfigurationProperties(prefix = "accounts")
public record AccountsContactInfoDto(String message, Map<String,String> contactDetails,
                                     List<String> onCallSupport) {

}
