.class public Lorg/webrtc/AudioTrack;
.super Lorg/webrtc/MediaStreamTrack;
.source "AudioTrack.java"


# direct methods
.method public constructor <init>(J)V
    .locals 0

    .line 16
    invoke-direct {p0, p1, p2}, Lorg/webrtc/MediaStreamTrack;-><init>(J)V

    return-void
.end method

.method private static native nativeSetVolume(JD)V
.end method


# virtual methods
.method public setVolume(D)V
    .locals 2

    .line 23
    iget-wide v0, p0, Lorg/webrtc/MediaStreamTrack;->nativeTrack:J

    invoke-static {v0, v1, p1, p2}, Lorg/webrtc/AudioTrack;->nativeSetVolume(JD)V

    return-void
.end method
