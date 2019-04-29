.class public interface abstract Lorg/webrtc/VideoEncoderFactory;
.super Ljava/lang/Object;
.source "VideoEncoderFactory.java"


# virtual methods
.method public abstract createEncoder(Lorg/webrtc/VideoCodecInfo;)Lorg/webrtc/VideoEncoder;
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation

    .annotation build Lorg/webrtc/CalledByNative;
    .end annotation
.end method

.method public abstract getSupportedCodecs()[Lorg/webrtc/VideoCodecInfo;
    .annotation build Lorg/webrtc/CalledByNative;
    .end annotation
.end method
