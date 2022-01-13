package com.rymcu.forest.mapper;

import com.rymcu.forest.core.mapper.Mapper;
import com.rymcu.forest.entity.ForestFile;
import org.apache.ibatis.annotations.Param;

/**
 * @author caterpillar
 * @date 2022-1-12 22:33:16
 */
public interface ForestFileMapper extends Mapper<ForestFile> {

    /**
     * 通过md5获取文件访问链接
     *
     * @param md5Value  md5值
     * @param createdBy 创建人
     * @return
     */
    String getFileUrlByMd5(@Param("md5Value") String md5Value, @Param("createdBy") long createdBy);

    /**
     * 插入文件对象
     *
     * @param fileUrl   访问路径
     * @param filePath  上传路径
     * @param md5Value  md5值
     * @param createdBy 创建人
     * @return
     */
    int insertForestFile(@Param("fileUrl") String fileUrl, @Param("filePath") String filePath, @Param("md5Value") String md5Value, @Param("createdBy") long createdBy);

}
