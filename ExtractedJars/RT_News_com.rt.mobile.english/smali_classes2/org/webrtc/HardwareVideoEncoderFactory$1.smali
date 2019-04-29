.class synthetic Lorg/webrtc/HardwareVideoEncoderFactory$1;
.super Ljava/lang/Object;
.source "HardwareVideoEncoderFactory.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lorg/webrtc/HardwareVideoEncoderFactory;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1008
    name = null
.end annotation


# static fields
.field static final synthetic $SwitchMap$org$webrtc$VideoCodecType:[I


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 163
    invoke-static {}, Lorg/webrtc/VideoCodecType;->values()[Lorg/webrtc/VideoCodecType;

    move-result-object v0

    array-length v0, v0

    new-array v0, v0, [I

    sput-object v0, Lorg/webrtc/HardwareVideoEncoderFactory$1;->$SwitchMap$org$webrtc$VideoCodecType:[I

    :try_start_0
    sget-object v0, Lorg/webrtc/HardwareVideoEncoderFactory$1;->$SwitchMap$org$webrtc$VideoCodecType:[I

    sget-object v1, Lorg/webrtc/VideoCodecType;->VP8:Lorg/webrtc/VideoCodecType;

    invoke-virtual {v1}, Lorg/webrtc/VideoCodecType;->ordinal()I

    move-result v1

    const/4 v2, 0x1

    aput v2, v0, v1
    :try_end_0
    .catch Ljava/lang/NoSuchFieldError; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    :try_start_1
    sget-object v0, Lorg/webrtc/HardwareVideoEncoderFactory$1;->$SwitchMap$org$webrtc$VideoCodecType:[I

    sget-object v1, Lorg/webrtc/VideoCodecType;->VP9:Lorg/webrtc/VideoCodecType;

    invoke-virtual {v1}, Lorg/webrtc/VideoCodecType;->ordinal()I

    move-result v1

    const/4 v2, 0x2

    aput v2, v0, v1
    :try_end_1
    .catch Ljava/lang/NoSuchFieldError; {:try_start_1 .. :try_end_1} :catch_1

    :catch_1
    :try_start_2
    sget-object v0, Lorg/webrtc/HardwareVideoEncoderFactory$1;->$SwitchMap$org$webrtc$VideoCodecType:[I

    sget-object v1, Lorg/webrtc/VideoCodecType;->H264:Lorg/webrtc/VideoCodecType;

    invoke-virtual {v1}, Lorg/webrtc/VideoCodecType;->ordinal()I

    move-result v1

    const/4 v2, 0x3

    aput v2, v0, v1
    :try_end_2
    .catch Ljava/lang/NoSuchFieldError; {:try_start_2 .. :try_end_2} :catch_2

    :catch_2
    return-void
.end method
