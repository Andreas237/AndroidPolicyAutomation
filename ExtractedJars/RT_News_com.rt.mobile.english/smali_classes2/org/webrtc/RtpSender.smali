.class public Lorg/webrtc/RtpSender;
.super Ljava/lang/Object;
.source "RtpSender.java"


# instance fields
.field private cachedTrack:Lorg/webrtc/MediaStreamTrack;
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation
.end field

.field private final dtmfSender:Lorg/webrtc/DtmfSender;
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation
.end field

.field final nativeRtpSender:J

.field private ownsTrack:Z


# direct methods
.method public constructor <init>(J)V
    .locals 3
    .annotation build Lorg/webrtc/CalledByNative;
    .end annotation

    .line 24
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x1

    .line 20
    iput-boolean v0, p0, Lorg/webrtc/RtpSender;->ownsTrack:Z

    .line 25
    iput-wide p1, p0, Lorg/webrtc/RtpSender;->nativeRtpSender:J

    .line 26
    invoke-static {p1, p2}, Lorg/webrtc/RtpSender;->nativeGetTrack(J)J

    move-result-wide v0

    .line 27
    invoke-static {v0, v1}, Lorg/webrtc/MediaStreamTrack;->createMediaStreamTrack(J)Lorg/webrtc/MediaStreamTrack;

    move-result-object v0

    iput-object v0, p0, Lorg/webrtc/RtpSender;->cachedTrack:Lorg/webrtc/MediaStreamTrack;

    .line 29
    invoke-static {p1, p2}, Lorg/webrtc/RtpSender;->nativeGetDtmfSender(J)J

    move-result-wide p1

    const-wide/16 v0, 0x0

    cmp-long v2, p1, v0

    if-eqz v2, :cond_0

    .line 30
    new-instance v0, Lorg/webrtc/DtmfSender;

    invoke-direct {v0, p1, p2}, Lorg/webrtc/DtmfSender;-><init>(J)V

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    iput-object v0, p0, Lorg/webrtc/RtpSender;->dtmfSender:Lorg/webrtc/DtmfSender;

    return-void
.end method

.method private static native nativeGetDtmfSender(J)J
.end method

.method private static native nativeGetId(J)Ljava/lang/String;
.end method

.method private static native nativeGetParameters(J)Lorg/webrtc/RtpParameters;
.end method

.method private static native nativeGetTrack(J)J
.end method

.method private static native nativeSetFrameEncryptor(JJ)V
.end method

.method private static native nativeSetParameters(JLorg/webrtc/RtpParameters;)Z
.end method

.method private static native nativeSetTrack(JJ)Z
.end method


# virtual methods
.method public dispose()V
    .locals 2

    .line 86
    iget-object v0, p0, Lorg/webrtc/RtpSender;->dtmfSender:Lorg/webrtc/DtmfSender;

    if-eqz v0, :cond_0

    .line 87
    iget-object v0, p0, Lorg/webrtc/RtpSender;->dtmfSender:Lorg/webrtc/DtmfSender;

    invoke-virtual {v0}, Lorg/webrtc/DtmfSender;->dispose()V

    .line 89
    :cond_0
    iget-object v0, p0, Lorg/webrtc/RtpSender;->cachedTrack:Lorg/webrtc/MediaStreamTrack;

    if-eqz v0, :cond_1

    iget-boolean v0, p0, Lorg/webrtc/RtpSender;->ownsTrack:Z

    if-eqz v0, :cond_1

    .line 90
    iget-object v0, p0, Lorg/webrtc/RtpSender;->cachedTrack:Lorg/webrtc/MediaStreamTrack;

    invoke-virtual {v0}, Lorg/webrtc/MediaStreamTrack;->dispose()V

    .line 92
    :cond_1
    iget-wide v0, p0, Lorg/webrtc/RtpSender;->nativeRtpSender:J

    invoke-static {v0, v1}, Lorg/webrtc/JniCommon;->nativeReleaseRef(J)V

    return-void
.end method

.method public dtmf()Lorg/webrtc/DtmfSender;
    .locals 1
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation

    .line 78
    iget-object v0, p0, Lorg/webrtc/RtpSender;->dtmfSender:Lorg/webrtc/DtmfSender;

    return-object v0
.end method

.method public getParameters()Lorg/webrtc/RtpParameters;
    .locals 2

    .line 69
    iget-wide v0, p0, Lorg/webrtc/RtpSender;->nativeRtpSender:J

    invoke-static {v0, v1}, Lorg/webrtc/RtpSender;->nativeGetParameters(J)Lorg/webrtc/RtpParameters;

    move-result-object v0

    return-object v0
.end method

.method public id()Ljava/lang/String;
    .locals 2

    .line 73
    iget-wide v0, p0, Lorg/webrtc/RtpSender;->nativeRtpSender:J

    invoke-static {v0, v1}, Lorg/webrtc/RtpSender;->nativeGetId(J)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public setFrameEncryptor(Lorg/webrtc/FrameEncryptor;)V
    .locals 4

    .line 82
    iget-wide v0, p0, Lorg/webrtc/RtpSender;->nativeRtpSender:J

    invoke-interface {p1}, Lorg/webrtc/FrameEncryptor;->getNativeFrameEncryptor()J

    move-result-wide v2

    invoke-static {v0, v1, v2, v3}, Lorg/webrtc/RtpSender;->nativeSetFrameEncryptor(JJ)V

    return-void
.end method

.method public setParameters(Lorg/webrtc/RtpParameters;)Z
    .locals 2

    .line 65
    iget-wide v0, p0, Lorg/webrtc/RtpSender;->nativeRtpSender:J

    invoke-static {v0, v1, p1}, Lorg/webrtc/RtpSender;->nativeSetParameters(JLorg/webrtc/RtpParameters;)Z

    move-result p1

    return p1
.end method

.method public setTrack(Lorg/webrtc/MediaStreamTrack;Z)Z
    .locals 4
    .param p1    # Lorg/webrtc/MediaStreamTrack;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param

    .line 48
    iget-wide v0, p0, Lorg/webrtc/RtpSender;->nativeRtpSender:J

    if-nez p1, :cond_0

    const-wide/16 v2, 0x0

    goto :goto_0

    :cond_0
    iget-wide v2, p1, Lorg/webrtc/MediaStreamTrack;->nativeTrack:J

    :goto_0
    invoke-static {v0, v1, v2, v3}, Lorg/webrtc/RtpSender;->nativeSetTrack(JJ)Z

    move-result v0

    if-nez v0, :cond_1

    const/4 p1, 0x0

    return p1

    .line 51
    :cond_1
    iget-object v0, p0, Lorg/webrtc/RtpSender;->cachedTrack:Lorg/webrtc/MediaStreamTrack;

    if-eqz v0, :cond_2

    iget-boolean v0, p0, Lorg/webrtc/RtpSender;->ownsTrack:Z

    if-eqz v0, :cond_2

    .line 52
    iget-object v0, p0, Lorg/webrtc/RtpSender;->cachedTrack:Lorg/webrtc/MediaStreamTrack;

    invoke-virtual {v0}, Lorg/webrtc/MediaStreamTrack;->dispose()V

    .line 54
    :cond_2
    iput-object p1, p0, Lorg/webrtc/RtpSender;->cachedTrack:Lorg/webrtc/MediaStreamTrack;

    .line 55
    iput-boolean p2, p0, Lorg/webrtc/RtpSender;->ownsTrack:Z

    const/4 p1, 0x1

    return p1
.end method

.method public track()Lorg/webrtc/MediaStreamTrack;
    .locals 1
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation

    .line 61
    iget-object v0, p0, Lorg/webrtc/RtpSender;->cachedTrack:Lorg/webrtc/MediaStreamTrack;

    return-object v0
.end method
