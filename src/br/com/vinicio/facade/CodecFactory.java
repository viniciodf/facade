package br.com.vinicio.facade;

import br.com.vinicio.model.VideoFile;

public class CodecFactory {

    public static Codec extract(VideoFile videoFile) {
        String type = videoFile.getCodecType();
        if (type.equals("mp4")) {
            System.out.println("CodecFactory: extracting mpeg audio...");
            return new MPEG4CompressionCodec();
        } else {
            System.out.println("CodecFactory: extracting ogg audio...");
            return new OggCompressionCodec();
        }
    }
}
