package com.epam.ali.spring.aop;

import javax.inject.Named;
import java.io.File;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

@Named
public class FileManager {

    @CheckTime
    public Set<String> getExtensionList(String folder) {
        File dir = new File(folder);
        TreeSet<String> extList = new TreeSet<>();
        for (String fileName : dir.list()) {
            File file = new File(dir.getAbsolutePath() + "\\" + fileName);
            int i = fileName.lastIndexOf('.');
            if (file.isFile() && i != -1) {
                extList.add(fileName.substring(i + 1, fileName.length()).toLowerCase());
            }
        }
        return extList;
    }

    @CheckTime
    public Map<String, Integer> getExtensionCount(String folder) {
        File dir = new File(folder);
        HashMap<String, Integer> map = new HashMap<>();
        for (String ext : getExtensionList(folder)) {
            CustomFileFilter filter = new CustomFileFilter(ext);
            map.put(ext, dir.listFiles(filter).length);
        }
        return map;
    }
}
