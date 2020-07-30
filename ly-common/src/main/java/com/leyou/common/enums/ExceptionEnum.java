package com.leyou.common.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
@AllArgsConstructor
//枚举是具有固定实例个数的类，提前创建好了实例
public enum ExceptionEnum {
    PRICE_CANNOT_BE_NULL(400,"价格不能为空！"),//等同于public static final ...=new ...
    CATEGORY_NOT_FUND(404,"商品分类没查到"),
    SPEC_GROUP_NOT_FUND(404,"商品规格组不存在"),
    SPEC_PARAM_NOT_FUND(404,"商品规格参数不存在" ),
    GOODS_NOT_FUND(404,"商品不存在" ),
    GOODS_DETAIL_NOT_FUND(404,"商品详情不存在" ),
    GOODS_SKU_NOT_FUND(404,"商品SKU不存在" ),
    GOODS_STOCK_NOT_FUND(404,"商品SKU不存在" ),
    BRAND_NOT_FOUND(404,"品牌不存在"),
    BRAND_SAVE_ERROR(500,"新增品牌失败" ),
    UPLOAD_FILE_ERROR(500,"文件上传失败" ),
    INVALID_FILE_TYPE(400,"无效的文件类型" ),
    GOODS_SAVE_ERROR(500,"新增商品失败" ),
    GOODS_UPDATE_ERROR(500,"更新商品失败" ),
    GOODS_ID_CANNOT_BE_NULL(400,"更新商品失败" ),
    ;
    private int code;
    private String msg;
}
