package utils;

import org.json.JSONObject;

public class apiPayloadConstants {
	
	public static String createEmployeePayload() {
		
		String createEmployeePayload = "{\n"
				+ "  \"emp_firstname\": \"Syntax\",\n"
				+ "  \"emp_lastname\": \"API\",\n"
				+ "  \"emp_middle_name\": \"Instructor\",\n"
				+ "  \"emp_gender\": \"F\",\n"
				+ "  \"emp_birthday\": \"1990-07-10\",\n"
				+ "  \"emp_status\": \"Employee\",\n"
				+ "  \"emp_job_title\": \"Healer\"\n"
				+ "}";
		
		return createEmployeePayload;
	}
	
	public static String createEmployeeBody() {
		
		JSONObject obj = new JSONObject();
		obj.put("emp_firstname", "Syntax");
		obj.put("emp_lastname", "API");
		obj.put("emp_middle_name", "Instructor");
		obj.put("emp_gender", "F");
		obj.put("emp_birthday", "1990-07-10");
		obj.put("emp_status", "Employee");
		obj.put("emp_job_title", "Healer");
		
		return obj.toString();
		
		
	}

}
