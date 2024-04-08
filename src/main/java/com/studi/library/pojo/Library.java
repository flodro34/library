package com.studi.library.pojo;

import com.studi.library.pojo.embeddedId.LibraryId;
import jakarta.persistence.Embeddable;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;

//table de liaison
@Entity
@Getter
@Setter
public class Library {

    @EmbeddedId
    private LibraryId librairyId;
}
