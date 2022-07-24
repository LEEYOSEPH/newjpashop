package newjpabook.newjpashop.domain.item;

import lombok.Getter;
import lombok.Setter;
import newjpabook.newjpashop.domain.Item;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("A")
@Getter
@Setter
public class Album extends Item {

    private String artist;

    private String etc;
}
