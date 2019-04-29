.class public final enum Lorg/webrtc/MediaCodecVideoDecoder$VideoCodecType;
.super Ljava/lang/Enum;
.source "MediaCodecVideoDecoder.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lorg/webrtc/MediaCodecVideoDecoder;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "VideoCodecType"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lorg/webrtc/MediaCodecVideoDecoder$VideoCodecType;",
        ">;"
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lorg/webrtc/MediaCodecVideoDecoder$VideoCodecType;

.field public static final enum VIDEO_CODEC_H264:Lorg/webrtc/MediaCodecVideoDecoder$VideoCodecType;

.field public static final enum VIDEO_CODEC_UNKNOWN:Lorg/webrtc/MediaCodecVideoDecoder$VideoCodecType;

.field public static final enum VIDEO_CODEC_VP8:Lorg/webrtc/MediaCodecVideoDecoder$VideoCodecType;

.field public static final enum VIDEO_CODEC_VP9:Lorg/webrtc/MediaCodecVideoDecoder$VideoCodecType;


# direct methods
.method static constructor <clinit>()V
    .locals 6

    .line 140
    new-instance v0, Lorg/webrtc/MediaCodecVideoDecoder$VideoCodecType;

    const-string v1, "VIDEO_CODEC_UNKNOWN"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lorg/webrtc/MediaCodecVideoDecoder$VideoCodecType;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lorg/webrtc/MediaCodecVideoDecoder$VideoCodecType;->VIDEO_CODEC_UNKNOWN:Lorg/webrtc/MediaCodecVideoDecoder$VideoCodecType;

    .line 141
    new-instance v0, Lorg/webrtc/MediaCodecVideoDecoder$VideoCodecType;

    const-string v1, "VIDEO_CODEC_VP8"

    const/4 v3, 0x1

    invoke-direct {v0, v1, v3}, Lorg/webrtc/MediaCodecVideoDecoder$VideoCodecType;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lorg/webrtc/MediaCodecVideoDecoder$VideoCodecType;->VIDEO_CODEC_VP8:Lorg/webrtc/MediaCodecVideoDecoder$VideoCodecType;

    .line 142
    new-instance v0, Lorg/webrtc/MediaCodecVideoDecoder$VideoCodecType;

    const-string v1, "VIDEO_CODEC_VP9"

    const/4 v4, 0x2

    invoke-direct {v0, v1, v4}, Lorg/webrtc/MediaCodecVideoDecoder$VideoCodecType;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lorg/webrtc/MediaCodecVideoDecoder$VideoCodecType;->VIDEO_CODEC_VP9:Lorg/webrtc/MediaCodecVideoDecoder$VideoCodecType;

    .line 143
    new-instance v0, Lorg/webrtc/MediaCodecVideoDecoder$VideoCodecType;

    const-string v1, "VIDEO_CODEC_H264"

    const/4 v5, 0x3

    invoke-direct {v0, v1, v5}, Lorg/webrtc/MediaCodecVideoDecoder$VideoCodecType;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lorg/webrtc/MediaCodecVideoDecoder$VideoCodecType;->VIDEO_CODEC_H264:Lorg/webrtc/MediaCodecVideoDecoder$VideoCodecType;

    const/4 v0, 0x4

    .line 139
    new-array v0, v0, [Lorg/webrtc/MediaCodecVideoDecoder$VideoCodecType;

    sget-object v1, Lorg/webrtc/MediaCodecVideoDecoder$VideoCodecType;->VIDEO_CODEC_UNKNOWN:Lorg/webrtc/MediaCodecVideoDecoder$VideoCodecType;

    aput-object v1, v0, v2

    sget-object v1, Lorg/webrtc/MediaCodecVideoDecoder$VideoCodecType;->VIDEO_CODEC_VP8:Lorg/webrtc/MediaCodecVideoDecoder$VideoCodecType;

    aput-object v1, v0, v3

    sget-object v1, Lorg/webrtc/MediaCodecVideoDecoder$VideoCodecType;->VIDEO_CODEC_VP9:Lorg/webrtc/MediaCodecVideoDecoder$VideoCodecType;

    aput-object v1, v0, v4

    sget-object v1, Lorg/webrtc/MediaCodecVideoDecoder$VideoCodecType;->VIDEO_CODEC_H264:Lorg/webrtc/MediaCodecVideoDecoder$VideoCodecType;

    aput-object v1, v0, v5

    sput-object v0, Lorg/webrtc/MediaCodecVideoDecoder$VideoCodecType;->$VALUES:[Lorg/webrtc/MediaCodecVideoDecoder$VideoCodecType;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;I)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    .line 139
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method static fromNativeIndex(I)Lorg/webrtc/MediaCodecVideoDecoder$VideoCodecType;
    .locals 1
    .annotation build Lorg/webrtc/CalledByNative;
        value = "VideoCodecType"
    .end annotation

    .line 147
    invoke-static {}, Lorg/webrtc/MediaCodecVideoDecoder$VideoCodecType;->values()[Lorg/webrtc/MediaCodecVideoDecoder$VideoCodecType;

    move-result-object v0

    aget-object p0, v0, p0

    return-object p0
.end method

.method public static valueOf(Ljava/lang/String;)Lorg/webrtc/MediaCodecVideoDecoder$VideoCodecType;
    .locals 1

    .line 139
    const-class v0, Lorg/webrtc/MediaCodecVideoDecoder$VideoCodecType;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lorg/webrtc/MediaCodecVideoDecoder$VideoCodecType;

    return-object p0
.end method

.method public static values()[Lorg/webrtc/MediaCodecVideoDecoder$VideoCodecType;
    .locals 1

    .line 139
    sget-object v0, Lorg/webrtc/MediaCodecVideoDecoder$VideoCodecType;->$VALUES:[Lorg/webrtc/MediaCodecVideoDecoder$VideoCodecType;

    invoke-virtual {v0}, [Lorg/webrtc/MediaCodecVideoDecoder$VideoCodecType;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lorg/webrtc/MediaCodecVideoDecoder$VideoCodecType;

    return-object v0
.end method
