package com.project.util.hikvision;

import static com.project.util.hikvision.ArtemisTest.cameras;

public class HikTest {
    public static void main(String[] args) throws Exception {
        CamerasRequest camerasRequest = new CamerasRequest();
        String cameras_Result=cameras(camerasRequest);
		System.out.println("cameras_Result="+cameras_Result);
    }
}
