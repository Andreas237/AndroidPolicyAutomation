.class Lorg/webrtc/MediaCodecVideoDecoder$TimeStamps;
.super Ljava/lang/Object;
.source "MediaCodecVideoDecoder.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lorg/webrtc/MediaCodecVideoDecoder;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0xa
    name = "TimeStamps"
.end annotation


# instance fields
.field private final decodeStartTimeMs:J

.field private final ntpTimeStampMs:J

.field private final timeStampMs:J


# direct methods
.method public constructor <init>(JJJ)V
    .locals 0

    .line 600
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 601
    iput-wide p1, p0, Lorg/webrtc/MediaCodecVideoDecoder$TimeStamps;->decodeStartTimeMs:J

    .line 602
    iput-wide p3, p0, Lorg/webrtc/MediaCodecVideoDecoder$TimeStamps;->timeStampMs:J

    .line 603
    iput-wide p5, p0, Lorg/webrtc/MediaCodecVideoDecoder$TimeStamps;->ntpTimeStampMs:J

    return-void
.end method

.method static synthetic access$700(Lorg/webrtc/MediaCodecVideoDecoder$TimeStamps;)J
    .locals 2

    .line 599
    iget-wide v0, p0, Lorg/webrtc/MediaCodecVideoDecoder$TimeStamps;->decodeStartTimeMs:J

    return-wide v0
.end method

.method static synthetic access$800(Lorg/webrtc/MediaCodecVideoDecoder$TimeStamps;)J
    .locals 2

    .line 599
    iget-wide v0, p0, Lorg/webrtc/MediaCodecVideoDecoder$TimeStamps;->timeStampMs:J

    return-wide v0
.end method

.method static synthetic access$900(Lorg/webrtc/MediaCodecVideoDecoder$TimeStamps;)J
    .locals 2

    .line 599
    iget-wide v0, p0, Lorg/webrtc/MediaCodecVideoDecoder$TimeStamps;->ntpTimeStampMs:J

    return-wide v0
.end method
