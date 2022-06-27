package com.my.oss.repository;

import com.my.oss.Exception.FunctionNotSupportedException;
import org.springframework.web.multipart.MultipartFile;

import javax.validation.constraints.NotNull;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.net.URL;
import java.util.List;


public interface AccessoryRepository {


    /**
     * 根据保存的相对路径获取存储的文件对象
     *
     * @return java.io.File
     * @Date 2020/8/20 14:46
     * @Param path
     * @Param fileName
     **/
    File get(String path, String fileName) throws FileNotFoundException;

    URL getURL(String path, String fileName) throws FunctionNotSupportedException, FileNotFoundException;

    String getURL2String(String path, String fileName) throws FunctionNotSupportedException, FileNotFoundException;

    /**
     * 根据保存的相对路径获取可下载文件的完整http路径
     *
     * @Date 2020/8/26 10:46
     * @param path
     * @param fileName
     * @return
     **/
//    String getUrl(String path, String fileName);

    /**
     * 根据给定的多个相对路径获取多个存储的文件对象
     *
     * @Date 2020/8/26 10:46
     * @param urls
     * @return
     **/
//    List<File> findList(String... urls);


    /**
     * 保存文件对象
     *

     * @Date 2020/8/20 14:47
     * @Param file
     * @Param fileName
     **/
    File save(File file, String path, String fileName);

    /**
     * 保存文件流文件为文件对象
     *
     * @Date 2020/8/20 14:49
     * @Param file
     * @Param fileName
     **/
    File save(MultipartFile file, String path, String fileName);

    /**
     * 保存输入流为文件对象
     *
     * @Date 2020/8/20 14:47
     * @Param file
     * @Param fileName
     **/
    File save(InputStream is, String path, @NotNull String fileName);

    void delete(String path, String fileName);
}
