package models.lombok;

import lombok.Data;
import pages.TextBoxPage;
@Data
public class TitileItem1InBasketLombok extends TextBoxPage {
    String nameBasketItem1;
    public String getBasketNameItem1() {
        return nameBasketItem1;
    }
    public void setBasketNameItem1(String findBasketTitleOfItem) {
        this.nameBasketItem1 = findBasketTitleOfItem;
    }
}

