.class Lorg/webrtc/MediaCodecVideoEncoder$HwEncoderFactory;
.super Ljava/lang/Object;
.source "MediaCodecVideoEncoder.java"

# interfaces
.implements Lorg/webrtc/VideoEncoderFactory;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lorg/webrtc/MediaCodecVideoEncoder;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "HwEncoderFactory"
.end annotation


# instance fields
.field private final supportedHardwareCodecs:[Lorg/webrtc/VideoCodecInfo;


# direct methods
.method constructor <init>()V
    .locals 1

    .line 60
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 108
    invoke-static {}, Lorg/webrtc/MediaCodecVideoEncoder$HwEncoderFactory;->getSupportedHardwareCodecs()[Lorg/webrtc/VideoCodecInfo;

    move-result-object v0

    iput-object v0, p0, Lorg/webrtc/MediaCodecVideoEncoder$HwEncoderFactory;->supportedHardwareCodecs:[Lorg/webrtc/VideoCodecInfo;

    return-void
.end method

.method private static getSupportedHardwareCodecs()[Lorg/webrtc/VideoCodecInfo;
    .locals 4

    .line 81
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 83
    invoke-static {}, Lorg/webrtc/MediaCodecVideoEncoder;->isVp8HwSupported()Z

    move-result v1

    if-eqz v1, :cond_0

    const-string v1, "MediaCodecVideoEncoder"

    const-string v2, "VP8 HW Encoder supported."

    .line 84
    invoke-static {v1, v2}, Lorg/webrtc/Logging;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 85
    new-instance v1, Lorg/webrtc/VideoCodecInfo;

    const-string v2, "VP8"

    new-instance v3, Ljava/util/HashMap;

    invoke-direct {v3}, Ljava/util/HashMap;-><init>()V

    invoke-direct {v1, v2, v3}, Lorg/webrtc/VideoCodecInfo;-><init>(Ljava/lang/String;Ljava/util/Map;)V

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 88
    :cond_0
    invoke-static {}, Lorg/webrtc/MediaCodecVideoEncoder;->isVp9HwSupported()Z

    move-result v1

    if-eqz v1, :cond_1

    const-string v1, "MediaCodecVideoEncoder"

    const-string v2, "VP9 HW Encoder supported."

    .line 89
    invoke-static {v1, v2}, Lorg/webrtc/Logging;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 90
    new-instance v1, Lorg/webrtc/VideoCodecInfo;

    const-string v2, "VP9"

    new-instance v3, Ljava/util/HashMap;

    invoke-direct {v3}, Ljava/util/HashMap;-><init>()V

    invoke-direct {v1, v2, v3}, Lorg/webrtc/VideoCodecInfo;-><init>(Ljava/lang/String;Ljava/util/Map;)V

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 95
    :cond_1
    invoke-static {}, Lorg/webrtc/MediaCodecVideoDecoder;->isH264HighProfileHwSupported()Z

    move-result v1

    if-eqz v1, :cond_2

    const-string v1, "MediaCodecVideoEncoder"

    const-string v2, "H.264 High Profile HW Encoder supported."

    .line 96
    invoke-static {v1, v2}, Lorg/webrtc/Logging;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 97
    sget-object v1, Lorg/webrtc/H264Utils;->DEFAULT_H264_HIGH_PROFILE_CODEC:Lorg/webrtc/VideoCodecInfo;

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 100
    :cond_2
    invoke-static {}, Lorg/webrtc/MediaCodecVideoEncoder;->isH264HwSupported()Z

    move-result v1

    if-eqz v1, :cond_3

    const-string v1, "MediaCodecVideoEncoder"

    const-string v2, "H.264 HW Encoder supported."

    .line 101
    invoke-static {v1, v2}, Lorg/webrtc/Logging;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 102
    sget-object v1, Lorg/webrtc/H264Utils;->DEFAULT_H264_BASELINE_PROFILE_CODEC:Lorg/webrtc/VideoCodecInfo;

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 105
    :cond_3
    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v1

    new-array v1, v1, [Lorg/webrtc/VideoCodecInfo;

    invoke-interface {v0, v1}, Ljava/util/List;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lorg/webrtc/VideoCodecInfo;

    return-object v0
.end method

.method private static isCodecSupported([Lorg/webrtc/VideoCodecInfo;Lorg/webrtc/VideoCodecInfo;)Z
    .locals 4

    const/4 v0, 0x0

    .line 72
    array-length v1, p0

    move v2, v0

    :goto_0
    if-ge v2, v1, :cond_1

    aget-object v3, p0, v2

    .line 73
    invoke-static {v3, p1}, Lorg/webrtc/MediaCodecVideoEncoder$HwEncoderFactory;->isSameCodec(Lorg/webrtc/VideoCodecInfo;Lorg/webrtc/VideoCodecInfo;)Z

    move-result v3

    if-eqz v3, :cond_0

    const/4 p0, 0x1

    return p0

    :cond_0
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_1
    return v0
.end method

.method private static isSameCodec(Lorg/webrtc/VideoCodecInfo;Lorg/webrtc/VideoCodecInfo;)Z
    .locals 2

    .line 62
    iget-object v0, p0, Lorg/webrtc/VideoCodecInfo;->name:Ljava/lang/String;

    iget-object v1, p1, Lorg/webrtc/VideoCodecInfo;->name:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_0

    const/4 p0, 0x0

    return p0

    .line 65
    :cond_0
    iget-object v0, p0, Lorg/webrtc/VideoCodecInfo;->name:Ljava/lang/String;

    const-string v1, "H264"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 66
    iget-object p0, p0, Lorg/webrtc/VideoCodecInfo;->params:Ljava/util/Map;

    iget-object p1, p1, Lorg/webrtc/VideoCodecInfo;->params:Ljava/util/Map;

    invoke-static {p0, p1}, Lorg/webrtc/H264Utils;->isSameH264Profile(Ljava/util/Map;Ljava/util/Map;)Z

    move-result p0

    goto :goto_0

    :cond_1
    const/4 p0, 0x1

    :goto_0
    return p0
.end method


# virtual methods
.method public createEncoder(Lorg/webrtc/VideoCodecInfo;)Lorg/webrtc/VideoEncoder;
    .locals 3
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation

    .line 118
    iget-object v0, p0, Lorg/webrtc/MediaCodecVideoEncoder$HwEncoderFactory;->supportedHardwareCodecs:[Lorg/webrtc/VideoCodecInfo;

    invoke-static {v0, p1}, Lorg/webrtc/MediaCodecVideoEncoder$HwEncoderFactory;->isCodecSupported([Lorg/webrtc/VideoCodecInfo;Lorg/webrtc/VideoCodecInfo;)Z

    move-result v0

    if-nez v0, :cond_0

    const-string v0, "MediaCodecVideoEncoder"

    .line 119
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "No HW video encoder for codec "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object p1, p1, Lorg/webrtc/VideoCodecInfo;->name:Ljava/lang/String;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {v0, p1}, Lorg/webrtc/Logging;->d(Ljava/lang/String;Ljava/lang/String;)V

    const/4 p1, 0x0

    return-object p1

    :cond_0
    const-string v0, "MediaCodecVideoEncoder"

    .line 122
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Create HW video encoder for "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, p1, Lorg/webrtc/VideoCodecInfo;->name:Ljava/lang/String;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lorg/webrtc/Logging;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 123
    new-instance v0, Lorg/webrtc/MediaCodecVideoEncoder$HwEncoderFactory$1;

    invoke-direct {v0, p0, p1}, Lorg/webrtc/MediaCodecVideoEncoder$HwEncoderFactory$1;-><init>(Lorg/webrtc/MediaCodecVideoEncoder$HwEncoderFactory;Lorg/webrtc/VideoCodecInfo;)V

    return-object v0
.end method

.method public getSupportedCodecs()[Lorg/webrtc/VideoCodecInfo;
    .locals 1

    .line 112
    iget-object v0, p0, Lorg/webrtc/MediaCodecVideoEncoder$HwEncoderFactory;->supportedHardwareCodecs:[Lorg/webrtc/VideoCodecInfo;

    return-object v0
.end method
