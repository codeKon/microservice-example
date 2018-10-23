package de.service.test.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ManyToMany;
import javax.persistence.OrderColumn;
import java.util.List;

@Entity
public class Book extends AbstractEntity {

    @Column
    @Getter
    @Setter
    private String name;

    @Getter
    @Setter
    @ManyToMany
    @OrderColumn
    private List<Author> author;

    @Column
    @Getter
    @Setter
    private String ISBN;

    @Column
    @Getter
    @Setter
    private String year;

    @Column
    @Getter
    @Setter
    private String publishingCompany;
}
