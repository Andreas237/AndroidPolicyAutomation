.class public Lorg/webrtc/RtpTransceiver;
.super Ljava/lang/Object;
.source "RtpTransceiver.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lorg/webrtc/RtpTransceiver$RtpTransceiverInit;,
        Lorg/webrtc/RtpTransceiver$RtpTransceiverDirection;
    }
.end annotation


# instance fields
.field private cachedReceiver:Lorg/webrtc/RtpReceiver;

.field private cachedSender:Lorg/webrtc/RtpSender;

.field private final nativeRtpTransceiver:J


# direct methods
.method protected constructor <init>(J)V
    .locals 1
    .annotation build Lorg/webrtc/CalledByNative;
    .end annotation

    .line 104
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 105
    iput-wide p1, p0, Lorg/webrtc/RtpTransceiver;->nativeRtpTransceiver:J

    .line 106
    invoke-static {p1, p2}, Lorg/webrtc/RtpTransceiver;->nativeGetSender(J)Lorg/webrtc/RtpSender;

    move-result-object v0

    iput-object v0, p0, Lorg/webrtc/RtpTransceiver;->cachedSender:Lorg/webrtc/RtpSender;

    .line 107
    invoke-static {p1, p2}, Lorg/webrtc/RtpTransceiver;->nativeGetReceiver(J)Lorg/webrtc/RtpReceiver;

    move-result-object p1

    iput-object p1, p0, Lorg/webrtc/RtpTransceiver;->cachedReceiver:Lorg/webrtc/RtpReceiver;

    return-void
.end method

.method private static native nativeCurrentDirection(J)Lorg/webrtc/RtpTransceiver$RtpTransceiverDirection;
.end method

.method private static native nativeDirection(J)Lorg/webrtc/RtpTransceiver$RtpTransceiverDirection;
.end method

.method private static native nativeGetMediaType(J)Lorg/webrtc/MediaStreamTrack$MediaType;
.end method

.method private static native nativeGetMid(J)Ljava/lang/String;
.end method

.method private static native nativeGetReceiver(J)Lorg/webrtc/RtpReceiver;
.end method

.method private static native nativeGetSender(J)Lorg/webrtc/RtpSender;
.end method

.method private static native nativeSetDirection(JLorg/webrtc/RtpTransceiver$RtpTransceiverDirection;)V
.end method

.method private static native nativeStop(J)V
.end method

.method private static native nativeStopped(J)Z
.end method


# virtual methods
.method public dispose()V
    .locals 2
    .annotation build Lorg/webrtc/CalledByNative;
    .end annotation

    .line 200
    iget-object v0, p0, Lorg/webrtc/RtpTransceiver;->cachedSender:Lorg/webrtc/RtpSender;

    invoke-virtual {v0}, Lorg/webrtc/RtpSender;->dispose()V

    .line 201
    iget-object v0, p0, Lorg/webrtc/RtpTransceiver;->cachedReceiver:Lorg/webrtc/RtpReceiver;

    invoke-virtual {v0}, Lorg/webrtc/RtpReceiver;->dispose()V

    .line 202
    iget-wide v0, p0, Lorg/webrtc/RtpTransceiver;->nativeRtpTransceiver:J

    invoke-static {v0, v1}, Lorg/webrtc/JniCommon;->nativeReleaseRef(J)V

    return-void
.end method

.method public getCurrentDirection()Lorg/webrtc/RtpTransceiver$RtpTransceiverDirection;
    .locals 2

    .line 175
    iget-wide v0, p0, Lorg/webrtc/RtpTransceiver;->nativeRtpTransceiver:J

    invoke-static {v0, v1}, Lorg/webrtc/RtpTransceiver;->nativeCurrentDirection(J)Lorg/webrtc/RtpTransceiver$RtpTransceiverDirection;

    move-result-object v0

    return-object v0
.end method

.method public getDirection()Lorg/webrtc/RtpTransceiver$RtpTransceiverDirection;
    .locals 2

    .line 165
    iget-wide v0, p0, Lorg/webrtc/RtpTransceiver;->nativeRtpTransceiver:J

    invoke-static {v0, v1}, Lorg/webrtc/RtpTransceiver;->nativeDirection(J)Lorg/webrtc/RtpTransceiver$RtpTransceiverDirection;

    move-result-object v0

    return-object v0
.end method

.method public getMediaType()Lorg/webrtc/MediaStreamTrack$MediaType;
    .locals 2

    .line 115
    iget-wide v0, p0, Lorg/webrtc/RtpTransceiver;->nativeRtpTransceiver:J

    invoke-static {v0, v1}, Lorg/webrtc/RtpTransceiver;->nativeGetMediaType(J)Lorg/webrtc/MediaStreamTrack$MediaType;

    move-result-object v0

    return-object v0
.end method

.method public getMid()Ljava/lang/String;
    .locals 2

    .line 125
    iget-wide v0, p0, Lorg/webrtc/RtpTransceiver;->nativeRtpTransceiver:J

    invoke-static {v0, v1}, Lorg/webrtc/RtpTransceiver;->nativeGetMid(J)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public getReceiver()Lorg/webrtc/RtpReceiver;
    .locals 1

    .line 145
    iget-object v0, p0, Lorg/webrtc/RtpTransceiver;->cachedReceiver:Lorg/webrtc/RtpReceiver;

    return-object v0
.end method

.method public getSender()Lorg/webrtc/RtpSender;
    .locals 1

    .line 135
    iget-object v0, p0, Lorg/webrtc/RtpTransceiver;->cachedSender:Lorg/webrtc/RtpSender;

    return-object v0
.end method

.method public isStopped()Z
    .locals 2

    .line 156
    iget-wide v0, p0, Lorg/webrtc/RtpTransceiver;->nativeRtpTransceiver:J

    invoke-static {v0, v1}, Lorg/webrtc/RtpTransceiver;->nativeStopped(J)Z

    move-result v0

    return v0
.end method

.method public setDirection(Lorg/webrtc/RtpTransceiver$RtpTransceiverDirection;)V
    .locals 2

    .line 186
    iget-wide v0, p0, Lorg/webrtc/RtpTransceiver;->nativeRtpTransceiver:J

    invoke-static {v0, v1, p1}, Lorg/webrtc/RtpTransceiver;->nativeSetDirection(JLorg/webrtc/RtpTransceiver$RtpTransceiverDirection;)V

    return-void
.end method

.method public stop()V
    .locals 2

    .line 195
    iget-wide v0, p0, Lorg/webrtc/RtpTransceiver;->nativeRtpTransceiver:J

    invoke-static {v0, v1}, Lorg/webrtc/RtpTransceiver;->nativeStop(J)V

    return-void
.end method
