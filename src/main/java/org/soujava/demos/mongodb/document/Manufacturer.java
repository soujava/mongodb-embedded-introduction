package org.soujava.demos.mongodb.document;

import jakarta.nosql.Column;
import jakarta.nosql.Embeddable;


@Embeddable(Embeddable.EmbeddableType.GROUPING)
public record Manufacturer(@Column String name, @Column String address, @Column String contactNumber) {

}