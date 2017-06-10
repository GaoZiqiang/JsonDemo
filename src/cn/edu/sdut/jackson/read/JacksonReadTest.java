package cn.edu.sdut.jackson.read;

import java.io.IOException;

import cn.edu.sdut.jackson.write.JacksonWriteTest;
import net.sf.json.JSONArray;
import net.sf.json.JSONObject;

public class JacksonReadTest {
	public static void main(String[] args) throws IOException {
		//ObjectMapper objMapper = new ObjectMapper();
		//JsonNode rootNode = objMapper.readTree(new JacksonWriteTest().Test());
		//String strResult = rootNode.toString();
		//JSONArray jsonArray = JSONArray.fromObject(new JacksonWriteTest().Test());
		//int size = jsonArray.size();
		//System.out.println(strResult);
		/*for (int i = 0; i < size; i++) {
			JSONObject jsonObject = jsonArray.getJSONObject(i);
			System.out.println("[" + i + "]name=" + jsonObject.get("name"));
			System.out.println("[" + i + "]package_name=" + jsonObject.get("age"));
		}*/
		/*JSONArray jsonArray;
		
		String array="[\"11\",\"22\",\"33\"]";
		jsonArray = JSONArray.fromObject(array);
		System.out.println(jsonArray.getString(1));*/
		/*for (int i = 0; i < size; i++) {
			JSONObject jsonObject = jsonArray.getJSONObject(i);
			System.out.println("[" + i + "]name=" + jsonObject.get("name"));
			System.out.println("[" + i + "]package_name=" + jsonObject.get("age"));
		}*/
		
		
		JSONArray jsonarray;
        //JSONObject jsonObj;
        //读取JSONArray，用下标索引获取
        String array="[\"11\",\"22\",\"33\"]";
        jsonarray = JSONArray.fromObject(array); 
        System.out.println(jsonarray.getString(1));    //输出为：22
		//JSONObject jsonObj;
		//读取JSONObject
        //String object="{\"NO1\":[\"44\",\"55\",\"66\"],\"NO2\":{\"NO1\":\"第一个\"}}";
//		String t = new JacksonWriteTest().Test();
//		System.out.println(t);
//        jsonObj  = JSONObject.fromObject(t);
//        
//        System.out.println(jsonObj.get("name"));    //输出为：["44","55","66"]
	}
}
