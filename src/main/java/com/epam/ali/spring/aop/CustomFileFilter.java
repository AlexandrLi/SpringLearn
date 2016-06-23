package com.epam.ali.spring.aop;

import java.io.File;
import java.io.FilenameFilter;

public class CustomFileFilter implements FilenameFilter {

    private String extension;

    public CustomFileFilter(String ext) {
        this.extension = ext;
    }

    @Override
    public boolean accept(File dir, String name) {
        return name.toUpperCase().endsWith("." + extension.toUpperCase());
    }
}
