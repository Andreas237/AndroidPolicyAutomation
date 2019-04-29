.class public Lorg/webrtc/VideoSource;
.super Lorg/webrtc/MediaSource;
.source "VideoSource.java"


# instance fields
.field private final capturerObserver:Lorg/webrtc/NativeCapturerObserver;


# direct methods
.method public constructor <init>(J)V
    .locals 1

    .line 22
    invoke-direct {p0, p1, p2}, Lorg/webrtc/MediaSource;-><init>(J)V

    .line 23
    new-instance v0, Lorg/webrtc/NativeCapturerObserver;

    invoke-static {p1, p2}, Lorg/webrtc/VideoSource;->nativeGetInternalSource(J)J

    move-result-wide p1

    invoke-direct {v0, p1, p2}, Lorg/webrtc/NativeCapturerObserver;-><init>(J)V

    iput-object v0, p0, Lorg/webrtc/VideoSource;->capturerObserver:Lorg/webrtc/NativeCapturerObserver;

    return-void
.end method

.method private static native nativeAdaptOutputFormat(JIII)V
.end method

.method private static native nativeGetInternalSource(J)J
.end method


# virtual methods
.method public adaptOutputFormat(III)V
    .locals 2

    .line 33
    iget-wide v0, p0, Lorg/webrtc/VideoSource;->nativeSource:J

    invoke-static {v0, v1, p1, p2, p3}, Lorg/webrtc/VideoSource;->nativeAdaptOutputFormat(JIII)V

    return-void
.end method

.method public getCapturerObserver()Lorg/webrtc/CapturerObserver;
    .locals 1

    .line 37
    iget-object v0, p0, Lorg/webrtc/VideoSource;->capturerObserver:Lorg/webrtc/NativeCapturerObserver;

    return-object v0
.end method
