package edu.jsu.mcis;

import org.junit.*;
import static org.junit.Assert.*;
import org.json.simple.*;
import org.json.simple.parser.*;

import databasetest.*;

public class JSONParseTest {
    
    private JSONParser parser;
    private JSONArray jsonDataOriginal;
    
    DatabaseTest dbTest;

    @Before
    public void setUp() {
        
        dbTest = new DatabaseTest();
        
        // Prepare JSON Data
        
        parser = new JSONParser();
        
        String jsonString = "[ {\"firstname\": \"Judith\", \"middleinitial\": \"K\", \"lastname\": \"Rogers\", \"address\": \"313 Steele Street\", \"city\": \"Lombard\", \"state\": \"IL\", \"zip\": \"60148\"}, {\"firstname\": \"Jerry\", \"middleinitial\": \"J\", \"lastname\": \"Caldwell\", \"address\": \"4602 Roosevelt Street\", \"city\": \"San Francisco\", \"state\": \"CA\", \"zip\": \"94112\"}, {\"firstname\": \"Lavina\", \"middleinitial\": \"R\", \"lastname\": \"Jones\", \"address\": \"2792 Stanley Avenue\", \"city\": \"Great Neck\", \"state\": \"NY\", \"zip\": \"11021\"}, {\"firstname\": \"David\", \"middleinitial\": \"C\", \"lastname\": \"Snyder\", \"address\": \"2704 Lost Creek Road\", \"city\": \"Birdsboro\", \"state\": \"PA\", \"zip\": \"19508\"}, {\"firstname\": \"Carmen\", \"middleinitial\": \"G\", \"lastname\": \"Stewart\", \"address\": \"3788 Overlook Drive\", \"city\": \"Indianapolis\", \"state\": \"IN\", \"zip\": \"46202\"}, {\"firstname\": \"Tiffany\", \"middleinitial\": \"P\", \"lastname\": \"Strawn\", \"address\": \"3602 Clement Street\", \"city\": \"Atlanta\", \"state\": \"GA\", \"zip\": \"30303\"}, {\"firstname\": \"Stevie\", \"middleinitial\": \"D\", \"lastname\": \"Snow\", \"address\": \"1869 Clair Street\", \"city\": \"Waco\", \"state\": \"TX\", \"zip\": \"76710\"}, {\"firstname\": \"Pauline\", \"middleinitial\": \"B\", \"lastname\": \"Ward\", \"address\": \"102 Godfrey Road\", \"city\": \"New York\", \"state\": \"NY\", \"zip\": \"10038\"}, {\"firstname\": \"Thomas\", \"middleinitial\": \"J\", \"lastname\": \"Beckwith\", \"address\": \"2629 Willis Avenue\", \"city\": \"Jacksonville\", \"state\": \"FL\", \"zip\": \"32216\"}, {\"firstname\": \"Courtney\", \"middleinitial\": \"B\", \"lastname\": \"Eckhoff\", \"address\": \"3540 Leverton Cove Road\", \"city\": \"Warren\", \"state\": \"MA\", \"zip\": \"01083\"}, {\"firstname\": \"Timothy\", \"middleinitial\": \"S\", \"lastname\": \"Freeman\", \"address\": \"1538 Cardinal Lane\", \"city\": \"Westville\", \"state\": \"IL\", \"zip\": \"61883\"}, {\"firstname\": \"Kathy\", \"middleinitial\": \"F\", \"lastname\": \"Cox\", \"address\": \"4245 Hazelwood Avenue\", \"city\": \"West Des Moines\", \"state\": \"IA\", \"zip\": \"50266\"}, {\"firstname\": \"Barbara\", \"middleinitial\": \"A\", \"lastname\": \"Freda\", \"address\": \"1383 Hamilton Drive\", \"city\": \"Beaumont\", \"state\": \"TX\", \"zip\": \"77701\"}, {\"firstname\": \"Cindy\", \"middleinitial\": \"N\", \"lastname\": \"Leavitt\", \"address\": \"3201 Chipmunk Lane\", \"city\": \"Portland\", \"state\": \"ME\", \"zip\": \"04101\"}, {\"firstname\": \"Robert\", \"middleinitial\": \"R\", \"lastname\": \"Holder\", \"address\": \"3760 Walton Street\", \"city\": \"Salt Lake City\", \"state\": \"UT\", \"zip\": \"84111\"}, {\"firstname\": \"Ali\", \"middleinitial\": \"S\", \"lastname\": \"Peters\", \"address\": \"3946 Victoria Street\", \"city\": \"Albany\", \"state\": \"LA\", \"zip\": \"70711\"}, {\"firstname\": \"Stephanie\", \"middleinitial\": \"T\", \"lastname\": \"Johnson\", \"address\": \"2025 Poplar Street\", \"city\": \"Schaumburg\", \"state\": \"IL\", \"zip\": \"60173\"}, {\"firstname\": \"Betty\", \"middleinitial\": \"R\", \"lastname\": \"Hoffmann\", \"address\": \"4060 Hinkle Deegan Lake Road\", \"city\": \"Binghamton\", \"state\": \"NY\", \"zip\": \"13901\"}, {\"firstname\": \"Robert\", \"middleinitial\": \"G\", \"lastname\": \"Waddell\", \"address\": \"2500 Pinchelone Street\", \"city\": \"Virginia Beach\", \"state\": \"VA\", \"zip\": \"23464\"}, {\"firstname\": \"Shannon\", \"middleinitial\": \"A\", \"lastname\": \"Hartmann\", \"address\": \"4709 Boundary Street\", \"city\": \"St Augustine\", \"state\": \"FL\", \"zip\": \"32092\"} ]";
        
        try {
        
            jsonDataOriginal = (JSONArray)parser.parse(jsonString);
            
        }
        
        catch(ParseException e) { e.printStackTrace(); }
        
    }
    
    @Test
    public void testConvertCSVtoJSON() {
        
        JSONArray jsonData = dbTest.getJsonData();
        assertEquals(jsonDataOriginal, jsonData);
        
    }
    
}