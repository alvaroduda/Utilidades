package DataeHora;

import java.time.ZoneId;


public class DataeHora2 {
    

    public static void listarZonas1() {
    for (String lista : ZoneId.getAvailableZoneIds()) {
        System.out.println(lista);
      }
    
      
      }
 }

