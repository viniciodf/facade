package br.com.vinicio.facade;

import br.com.vinicio.model.VideoFile;

public class BitrateReader {
    public static VideoFile read(VideoFile videoFile, Codec codec){
        System.out.println("BitrateReader: reading file...");
        return  videoFile;
    }

    public static VideoFile convert(VideoFile videoFile, Codec codec){
        System.out.println("BitrateReader: writing file...");
        return videoFile;
    }
}
