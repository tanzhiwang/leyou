package com.leyou.item.mapper;


import com.leyou.item.pojo.Brand;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;

public interface BrandMapper extends Mapper<Brand> {
    @Insert("insert into tb_category_brand (category_id,brand_id) values (#{cid},#{bid})")
    int insertCategoryBrand(@Param("cid")Long cid,@Param("bid")Long bid);

    @Select("select b.id,b.name,b.letter,b.image from tb_brand b inner join tb_category_brand cb on b.id=cb.brand_id where cb.category_id=76")
    List<Brand> queryByCategoryId(@Param("cid")Long cid);
}
