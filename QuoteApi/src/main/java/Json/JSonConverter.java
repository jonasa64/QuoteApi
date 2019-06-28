/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Json;

import com.JonasApps.Entity.Qoute;
import com.google.gson.Gson;

/**
 *
 * @author Jonas
 */
public class JSonConverter {
     public static String getJSONFromPerson(Qoute q) {
        return new Gson().toJson(q);
    }
}
