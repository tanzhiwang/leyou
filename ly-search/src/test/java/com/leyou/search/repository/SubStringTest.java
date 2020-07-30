package com.leyou.search.repository;

import org.junit.Test;

public class SubStringTest {

    @Test
    public void testSubString(){
        String str = "[{\"group\":\"主体\",\"params\":[{\"k\":\"品牌\",\"searchable\":false,\"global\":true,\"v\":\"黑马\"},{\"k\":\"型号\",\"searchable\":false,\"global\":true,\"v\":\"黑马3号\"},{\"k\":\"上市年份\",\"searchable\":false,\"global\":true,\"numerical\":true,\"unit\":\"年\",\"v\":\"2019\"}]},{\"group\":\"基本信息\",\"params\":[{\"k\":\"机身颜色\",\"searchable\":false,\"global\":false},{\"k\":\"机身重量（g）\",\"searchable\":false,\"global\":true,\"numerical\":true,\"unit\":\"g\",\"v\":\"198\"},{\"k\":\"机身材质工艺\",\"searchable\":false,\"global\":true,\"v\":\"金属\"}]},{\"group\":\"操作系统\",\"params\":[{\"k\":\"操作系统\",\"searchable\":true,\"global\":true,\"v\":\"安卓\"}]},{\"group\":\"主芯片\",\"params\":[{\"k\":\"CPU品牌\",\"searchable\":true,\"global\":true,\"v\":\"骁龙（Snapdragon)\"},{\"k\":\"CPU型号\",\"searchable\":false,\"global\":true,\"v\":\"骁龙845\"},{\"k\":\"CPU核数\",\"searchable\":true,\"global\":true,\"v\":\"八核\"},{\"k\":\"CPU频率\",\"searchable\":true,\"global\":true,\"numerical\":true,\"unit\":\"GHz\",\"v\":\"2.6\"}]},{\"group\":\"存储\",\"params\":[{\"k\":\"内存\",\"searchable\":true,\"global\":false,\"numerical\":false,\"unit\":\"\"},{\"k\":\"机身存储\",\"searchable\":true,\"global\":false,\"numerical\":false,\"unit\":\"\"}]},{\"group\":\"屏幕\",\"params\":[{\"k\":\"主屏幕尺寸（英寸）\",\"searchable\":true,\"global\":true,\"numerical\":true,\"unit\":\"英寸\",\"v\":\"5.9\"},{\"k\":\"分辨率\",\"searchable\":false,\"global\":true,\"v\":\"2180*1280\"}]},{\"group\":\"摄像头\",\"params\":[{\"k\":\"前置摄像头\",\"searchable\":true,\"global\":true,\"numerical\":true,\"unit\":\"万\",\"v\":\"1200\"},{\"k\":\"后置摄像头\",\"searchable\":true,\"global\":true,\"numerical\":true,\"unit\":\"万\",\"v\":\"1800\"}]},{\"group\":\"电池信息\",\"params\":[{\"k\":\"电池容量（mAh）\",\"searchable\":true,\"global\":true,\"numerical\":true,\"unit\":\"mAh\",\"v\":\"4000\"}]}]";

        if(str.startsWith("[")){
            System.out.println(1);
        }
        System.out.print("返回值 :" );
        System.out.println(str.substring(1) );
        System.out.print("返回值 :" );
        System.out.println(str.substring(1,str.length()-1) );
        System.out.println("str:"+str);

//        System.out.print("返回值 :" );
//        System.out.println(Str.substring(4, 10) );
    }
}
