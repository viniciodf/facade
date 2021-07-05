package br.com.vinicio.facade;

import br.com.vinicio.model.VideoFile;

import java.io.File;

public class VideoConversionFacade {
    public File convertVideo(String fileName, String format){
        System.out.println("VideoConversionFacade: conversion started.");
        VideoFile videoFile = new VideoFile(fileName);
        Codec sourceCodec = CodecFactory.extract(videoFile);
        Codec destinationCodec;
        if(format.equals("mp4")){
            destinationCodec = new OggCompressionCodec();
        } else {
            destinationCodec = new MPEG4CompressionCodec();
        }
        VideoFile buffer = BitrateReader.read(videoFile, sourceCodec);
        VideoFile intermediateResult = BitrateReader.convert(buffer, destinationCodec);
        File result = new AudioMixer().fix(intermediateResult);
        System.out.println("VideoConversionFacade: conversrion completed.");
        return result;
    }
}
