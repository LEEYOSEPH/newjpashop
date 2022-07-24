package newjpabook.newjpashop.domain.item;

import lombok.Getter;
import lombok.Setter;
import newjpabook.newjpashop.domain.Item;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;


@Entity
@DiscriminatorValue("B")
@Getter
@Setter
public class Book extends Item {

    private String author;

    private String isbn;
}
