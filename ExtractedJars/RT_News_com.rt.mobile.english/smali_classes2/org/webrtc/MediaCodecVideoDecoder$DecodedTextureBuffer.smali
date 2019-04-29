.class Lorg/webrtc/MediaCodecVideoDecoder$DecodedTextureBuffer;
.super Ljava/lang/Object;
.source "MediaCodecVideoDecoder.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lorg/webrtc/MediaCodecVideoDecoder;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0xa
    name = "DecodedTextureBuffer"
.end annotation


# instance fields
.field private final decodeTimeMs:J

.field private final frameDelayMs:J

.field private final ntpTimeStampMs:J

.field private final presentationTimeStampMs:J

.field private final timeStampMs:J

.field private final videoFrameBuffer:Lorg/webrtc/VideoFrame$Buffer;


# direct methods
.method public constructor <init>(Lorg/webrtc/VideoFrame$Buffer;JJJJJ)V
    .locals 0

    .line 697
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 698
    iput-object p1, p0, Lorg/webrtc/MediaCodecVideoDecoder$DecodedTextureBuffer;->videoFrameBuffer:Lorg/webrtc/VideoFrame$Buffer;

    .line 699
    iput-wide p2, p0, Lorg/webrtc/MediaCodecVideoDecoder$DecodedTextureBuffer;->presentationTimeStampMs:J

    .line 700
    iput-wide p4, p0, Lorg/webrtc/MediaCodecVideoDecoder$DecodedTextureBuffer;->timeStampMs:J

    .line 701
    iput-wide p6, p0, Lorg/webrtc/MediaCodecVideoDecoder$DecodedTextureBuffer;->ntpTimeStampMs:J

    .line 702
    iput-wide p8, p0, Lorg/webrtc/MediaCodecVideoDecoder$DecodedTextureBuffer;->decodeTimeMs:J

    .line 703
    iput-wide p10, p0, Lorg/webrtc/MediaCodecVideoDecoder$DecodedTextureBuffer;->frameDelayMs:J

    return-void
.end method


# virtual methods
.method getDecodeTimeMs()J
    .locals 2
    .annotation build Lorg/webrtc/CalledByNative;
        value = "DecodedTextureBuffer"
    .end annotation

    .line 728
    iget-wide v0, p0, Lorg/webrtc/MediaCodecVideoDecoder$DecodedTextureBuffer;->decodeTimeMs:J

    return-wide v0
.end method

.method getFrameDelayMs()J
    .locals 2
    .annotation build Lorg/webrtc/CalledByNative;
        value = "DecodedTextureBuffer"
    .end annotation

    .line 733
    iget-wide v0, p0, Lorg/webrtc/MediaCodecVideoDecoder$DecodedTextureBuffer;->frameDelayMs:J

    return-wide v0
.end method

.method getNtpTimestampMs()J
    .locals 2
    .annotation build Lorg/webrtc/CalledByNative;
        value = "DecodedTextureBuffer"
    .end annotation

    .line 723
    iget-wide v0, p0, Lorg/webrtc/MediaCodecVideoDecoder$DecodedTextureBuffer;->ntpTimeStampMs:J

    return-wide v0
.end method

.method getPresentationTimestampMs()J
    .locals 2
    .annotation build Lorg/webrtc/CalledByNative;
        value = "DecodedTextureBuffer"
    .end annotation

    .line 713
    iget-wide v0, p0, Lorg/webrtc/MediaCodecVideoDecoder$DecodedTextureBuffer;->presentationTimeStampMs:J

    return-wide v0
.end method

.method getTimeStampMs()J
    .locals 2
    .annotation build Lorg/webrtc/CalledByNative;
        value = "DecodedTextureBuffer"
    .end annotation

    .line 718
    iget-wide v0, p0, Lorg/webrtc/MediaCodecVideoDecoder$DecodedTextureBuffer;->timeStampMs:J

    return-wide v0
.end method

.method getVideoFrameBuffer()Lorg/webrtc/VideoFrame$Buffer;
    .locals 1
    .annotation build Lorg/webrtc/CalledByNative;
        value = "DecodedTextureBuffer"
    .end annotation

    .line 708
    iget-object v0, p0, Lorg/webrtc/MediaCodecVideoDecoder$DecodedTextureBuffer;->videoFrameBuffer:Lorg/webrtc/VideoFrame$Buffer;

    return-object v0
.end method
