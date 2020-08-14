package com.marksandspencer.search.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@ToString
@NoArgsConstructor
public class Metadata {

    private String isHidden;
    private String viewType;
    private String imageLandscape;

}