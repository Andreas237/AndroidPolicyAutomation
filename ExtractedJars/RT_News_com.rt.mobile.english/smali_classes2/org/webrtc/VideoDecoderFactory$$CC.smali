.class public abstract synthetic Lorg/webrtc/VideoDecoderFactory$$CC;
.super Ljava/lang/Object;


# direct methods
.method public static createDecoder(Lorg/webrtc/VideoDecoderFactory;Ljava/lang/String;)Lorg/webrtc/VideoDecoder;
    .locals 0
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation

    .line 24
    new-instance p0, Ljava/lang/UnsupportedOperationException;

    const-string p1, "Deprecated and not implemented."

    invoke-direct {p0, p1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public static createDecoder(Lorg/webrtc/VideoDecoderFactory;Lorg/webrtc/VideoCodecInfo;)Lorg/webrtc/VideoDecoder;
    .locals 0
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation

    .annotation build Lorg/webrtc/CalledByNative;
    .end annotation

    .line 31
    invoke-virtual {p1}, Lorg/webrtc/VideoCodecInfo;->getName()Ljava/lang/String;

    move-result-object p1

    invoke-interface {p0, p1}, Lorg/webrtc/VideoDecoderFactory;->createDecoder(Ljava/lang/String;)Lorg/webrtc/VideoDecoder;

    move-result-object p0

    return-object p0
.end method

.method public static getSupportedCodecs(Lorg/webrtc/VideoDecoderFactory;)[Lorg/webrtc/VideoCodecInfo;
    .locals 0
    .annotation build Lorg/webrtc/CalledByNative;
    .end annotation

    const/4 p0, 0x0

    .line 39
    new-array p0, p0, [Lorg/webrtc/VideoCodecInfo;

    return-object p0
.end method
