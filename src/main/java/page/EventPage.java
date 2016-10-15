package page;

import element.EventPageElement;
import org.openqa.selenium.By;

public class EventPage {

    public static By getListItem(int i) {
      return EventPageElement.getListItem(i);
    }

    public static By getTicketInfo() {
        return EventPageElement.getTicketInfo();
    }
}
