package com.project.util.hikvision;

import com.alibaba.fastjson.JSON;
import com.hikvision.artemis.sdk.ArtemisHttpUtil;

import java.util.HashMap;
import java.util.Map;


/**
 * Auto Create on 2026-02-27 09:21:34
 */
public class ArtemisTest {
	/**
	 * STEP1：设置平台参数，根据实际情况,设置host appkey appsecret 三个参数.
	 *
	 * ip:port : 平台门户/nginx的IP和端口（必须使用https协议，https端口默认为443）
	 * appKey : 请填入appKey
	 * appSecret : 请填入appSecret
	 */
//	private static ArtemisConfig artemisConfig = new ArtemisConfig("10.100.10.3:444", "27327626", "NyY1YD7w1WEOi2iMzGA9");

	/**
	 * STEP2：设置OpenAPI接口的上下文
	 */

	//修改监控点经纬度
//	public static String modifyCameraOperationResource(ModifyCameraOperationResourceRequest modifyCameraOperationResourceRequest) throws Exception {
//		String modifyCameraOperationResourceDataApi = ARTEMIS_PATH +"/api/resource/v1/camera/modifyCameraOperationResource";
//		Map<String,String> path = new HashMap<String,String>(2){
//			{
//				put("https://",modifyCameraOperationResourceDataApi);
//			}
//		};
//		String body= JSON.toJSONString(modifyCameraOperationResourceRequest);
//		String result = ArtemisHttpUtil.doPostStringArtemis(artemisConfig, path, body, null,  null, application/json);
//		return result;
//	}

	//分页获取监控点资源
	public static String cameras(CamerasRequest camerasRequest) throws Exception {
		String camerasDataApi = "/artemis/api/resource/v1/cameras";
		Map<String,String> path = new HashMap<String,String>(2){
			{
				put("https://",camerasDataApi);
			}
		};
		String body=JSON.toJSONString(camerasRequest);
		String result = ArtemisHttpUtil.doPostStringArtemis(path, body, null,  null, "application/json", null);
		return result;
	}

	//根据区域编号获取下级监控点列表
//	public static String cameras(CamerasRequest camerasRequest) throws Exception {
//		String camerasDataApi = ARTEMIS_PATH +"/api/resource/v1/regions/regionIndexCode/cameras";
//		Map<String,String> path = new HashMap<String,String>(2){
//			{
//				put("https://",camerasDataApi);
//			}
//		};
//		String body=JSON.toJSONString(camerasRequest);
//		String result = ArtemisHttpUtil.doPostStringArtemis(artemisConfig, path, body, null,  null, application/json);
//		return result;
//	}

	//根据空间条件分页查询监控点资源
//	public static String getCamerasBySpatialIndexWithPage(GetCamerasBySpatialIndexWithPageRequest getCamerasBySpatialIndexWithPageRequest) throws Exception {
//		String getCamerasBySpatialIndexWithPageDataApi = ARTEMIS_PATH +"/api/resource/v1/camera/getCamerasBySpatialIndexWithPage";
//		Map<String,String> path = new HashMap<String,String>(2){
//			{
//				put("https://",getCamerasBySpatialIndexWithPageDataApi);
//			}
//		};
//		String body=JSON.toJSONString(getCamerasBySpatialIndexWithPageRequest);
//		String result = ArtemisHttpUtil.doPostStringArtemis(artemisConfig, path, body, null,  null, application/json);
//		return result;
//	}

	//根据编号获取监控点详细信息
//	public static String indexCode(IndexCodeRequest indexCodeRequest) throws Exception {
//		String indexCodeDataApi = ARTEMIS_PATH +"/api/resource/v1/cameras/indexCode";
//		Map<String,String> path = new HashMap<String,String>(2){
//			{
//				put("https://",indexCodeDataApi);
//			}
//		};
//		String body=JSON.toJSONString(indexCodeRequest);
//		String result = ArtemisHttpUtil.doPostStringArtemis(artemisConfig, path, body, null,  null, application/json);
//		return result;
//	}


//		String modifyCameraOperationResource_Result=modifyCameraOperationResource();
//		System.out.println(modifyCameraOperationResource_Result);
//
//		String cameras_Result=cameras();
//		System.out.println(cameras_Result);
//
//		String cameras_Result=cameras();
//		System.out.println(cameras_Result);
//
//		String getCamerasBySpatialIndexWithPage_Result=getCamerasBySpatialIndexWithPage();
//		System.out.println(getCamerasBySpatialIndexWithPage_Result);
//
//		String indexCode_Result=indexCode();
//		System.out.println(indexCode_Result);


}
