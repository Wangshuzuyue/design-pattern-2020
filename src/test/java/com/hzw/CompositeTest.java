package com.hzw;

import com.hzw.composite.MyDirectory;
import com.hzw.composite.MyFile;
import com.hzw.composite.MyFolder;

import java.util.ArrayList;
import java.util.List;

/**
 * @author: huangzuwang
 * @date: 2020-03-10 16:11
 * @description:
 */
public class CompositeTest {

    public static void main(String[] args) {

        MyFolder docFolder = new MyFolder("文档", 1);
        List<MyDirectory> docs = new ArrayList<>();
        docs.add(new MyFile("Java笔记", 128L));
        docs.add(new MyFile("Spring笔记", 256L));
        docs.add(new MyFile("Mysql笔记", 512L));
        MyFolder devFolder = new MyFolder("开发文档", 2);
        docs.add(devFolder);
        docFolder.setChildren(docs);

        List<MyDirectory> devDocs = new ArrayList<>();
        devDocs.add(new MyFile("需求文档", 1024L));
        devDocs.add(new MyFile("设计文档", 2028L));
        devFolder.setChildren(devDocs);
        docFolder.show();
    }
}
