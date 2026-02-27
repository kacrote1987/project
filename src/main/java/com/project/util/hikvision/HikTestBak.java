package com.project.util.hikvision;

import org.json.JSONException;

import java.util.List;
import java.util.Map;

import static com.project.util.ApiDemo.reuqest;

public class HikTestBak {
    public static void main(String[] args) throws JSONException {
//		参数
        String Accept = "*/*";
        String ContentType = "application/json";
        String XCaKey = "27327626";
        String XCaSecret = "NyY1YD7w1WEOi2iMzGA9";
        String XCaNonce = "344d17af-d3be-42a1-8299-e9632cbdfe8c";
        String XCaTimestamp = "1772154973763";
        String XCaSignatureHeaders = "x-ca-key,x-ca-nonce,x-ca-timestamp";
        String XCaSignature = "BcIiCwtTth9+oO+zmXsPH0KJ6bSicd6l5pIHL+30xJI=";
        String body = "{\n" +
                "    \"pageNo\": 1,\n" +
                "    \"pageSize\": 20,\n" +
                "    \"treeCode\": \"0\"\n" +
                "}";

//		调用
        String url = "https://10.100.10.3:444/artemis/api/resource/v1/cameras";
        String method = "POST";
        String httpArg = "Accept=" + Accept;
        httpArg = httpArg + "&ContentType=" + ContentType;
        httpArg = httpArg + "&X-Ca-Key=" + XCaKey;
        httpArg = httpArg + "&X-Ca-Nonce=" + XCaNonce;
        httpArg = httpArg + "&X-Ca-Timestamp=" + XCaTimestamp;
        httpArg = httpArg + "&X-Ca-Signature-Headers=" + XCaSignatureHeaders;
        httpArg = httpArg + "&X-Ca-Signature=" + XCaSignature;
        List<Map<String, Object>> result = reuqest(url,httpArg,method);

//		解析数据
        for(int i=0;i<result.size();i++){
            System.out.println("requestSecret=" + result.get(i).get("requestSecret").toString());
        }
    }
}
