package data;

import com.google.common.collect.ImmutableMap;

public class EventList {

   private static final ImmutableMap<String, String> eventMap =
           new ImmutableMap.Builder<String, String>()
                   .put("pre sale event", "0D00513BAC67888F")
                   .put("regular event", "0B005051EC9B32CB")
                   .build();

   public static ImmutableMap<String, String> getEventMapping() {
       return eventMap;
   }
}
