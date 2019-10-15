package DAO;

import java.util.Properties;

import com.yedam.lch.collection.map.PropertiesExample;

public class DAO {
	Properties prop = new Properties();
	String path = PropertiesExample.class.getResource("/config/database.properties").getPath();

}
