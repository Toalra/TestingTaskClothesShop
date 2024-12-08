package models.lombok;
import lombok.Data;
import pages.TextBoxPage;


@Data

public class TitleItems1Lombok extends TextBoxPage {

    String nameItem1;

    public String getNameItem1() {
        return nameItem1;
    }
    public void setNameItem1(String findTitleOfItem) {
        this.nameItem1 = findTitleOfItem;
    }
}
