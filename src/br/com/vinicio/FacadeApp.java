package br.com.vinicio;

import br.com.vinicio.facade.VideoConversionFacade;

import java.io.File;

public class FacadeApp {
    public static void main(String[] args) {
        VideoConversionFacade converter = new VideoConversionFacade();
        File mp4Video = converter.convertVideo("youtube.ogg", "mp4");
    }
}
