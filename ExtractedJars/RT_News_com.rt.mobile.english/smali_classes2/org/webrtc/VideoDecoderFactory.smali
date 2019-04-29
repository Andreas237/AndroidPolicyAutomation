.class public interface abstract Lorg/webrtc/VideoDecoderFactory;
.super Ljava/lang/Object;
.source "VideoDecoderFactory.java"


# virtual methods
.method public abstract createDecoder(Ljava/lang/String;)Lorg/webrtc/VideoDecoder;
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation
.end method

.method public abstract createDecoder(Lorg/webrtc/VideoCodecInfo;)Lorg/webrtc/VideoDecoder;
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation

    .annotation build Lorg/webrtc/CalledByNative;
    .end annotation
.end method

.method public abstract getSupportedCodecs()[Lorg/webrtc/VideoCodecInfo;
    .annotation build Lorg/webrtc/CalledByNative;
    .end annotation
.end method
