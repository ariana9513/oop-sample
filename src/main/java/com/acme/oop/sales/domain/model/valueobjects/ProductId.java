package com.acme.oop.sales.domain.model.valueobjects;

import java.util.Objects;
import java.util.UUID;

/**
 * Value Object representing a Product Identifier
 * @param value the UUID value of the ProductId
 *
 * @author Open-Source Application Development Team
 * @version 1.0
 */
public record ProductId(UUID value) {
    /**
     * Constructor with validation
     * @param value the UUID value of the ProductId
     */
    public ProductId {
        if (Objects.isNull(value))
            throw new IllegalArgumentException("ProductId cannot be null");
    }

    /**
     * Default constructor generating a random UUID
     */
    public ProductId() {
        this(UUID.randomUUID());
    }
}
