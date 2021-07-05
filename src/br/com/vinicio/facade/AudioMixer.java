package br.com.vinicio.facade;

import br.com.vinicio.model.VideoFile;

import java.io.File;

public class AudioMixer {
    public File fix(VideoFile videoFile){
        System.out.println("AudioMixer: fixing audio...");
        return new File("tmp");
    }
}
