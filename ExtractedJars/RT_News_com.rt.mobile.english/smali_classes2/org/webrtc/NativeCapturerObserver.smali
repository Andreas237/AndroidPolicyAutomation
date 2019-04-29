.class Lorg/webrtc/NativeCapturerObserver;
.super Ljava/lang/Object;
.source "NativeCapturerObserver.java"

# interfaces
.implements Lorg/webrtc/CapturerObserver;


# instance fields
.field private final nativeSource:J


# direct methods
.method public constructor <init>(J)V
    .locals 0
    .annotation build Lorg/webrtc/CalledByNative;
    .end annotation

    .line 24
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 25
    iput-wide p1, p0, Lorg/webrtc/NativeCapturerObserver;->nativeSource:J

    return-void
.end method

.method private static native nativeCapturerStarted(JZ)V
.end method

.method private static native nativeCapturerStopped(J)V
.end method

.method private static native nativeOnFrameCaptured(JIIIJLorg/webrtc/VideoFrame$Buffer;)V
.end method


# virtual methods
.method public onCapturerStarted(Z)V
    .locals 2

    .line 30
    iget-wide v0, p0, Lorg/webrtc/NativeCapturerObserver;->nativeSource:J

    invoke-static {v0, v1, p1}, Lorg/webrtc/NativeCapturerObserver;->nativeCapturerStarted(JZ)V

    return-void
.end method

.method public onCapturerStopped()V
    .locals 2

    .line 35
    iget-wide v0, p0, Lorg/webrtc/NativeCapturerObserver;->nativeSource:J

    invoke-static {v0, v1}, Lorg/webrtc/NativeCapturerObserver;->nativeCapturerStopped(J)V

    return-void
.end method

.method public onFrameCaptured(Lorg/webrtc/VideoFrame;)V
    .locals 8

    .line 40
    iget-wide v0, p0, Lorg/webrtc/NativeCapturerObserver;->nativeSource:J

    invoke-virtual {p1}, Lorg/webrtc/VideoFrame;->getBuffer()Lorg/webrtc/VideoFrame$Buffer;

    move-result-object v2

    invoke-interface {v2}, Lorg/webrtc/VideoFrame$Buffer;->getWidth()I

    move-result v2

    invoke-virtual {p1}, Lorg/webrtc/VideoFrame;->getBuffer()Lorg/webrtc/VideoFrame$Buffer;

    move-result-object v3

    invoke-interface {v3}, Lorg/webrtc/VideoFrame$Buffer;->getHeight()I

    move-result v3

    .line 41
    invoke-virtual {p1}, Lorg/webrtc/VideoFrame;->getRotation()I

    move-result v4

    invoke-virtual {p1}, Lorg/webrtc/VideoFrame;->getTimestampNs()J

    move-result-wide v5

    invoke-virtual {p1}, Lorg/webrtc/VideoFrame;->getBuffer()Lorg/webrtc/VideoFrame$Buffer;

    move-result-object v7

    .line 40
    invoke-static/range {v0 .. v7}, Lorg/webrtc/NativeCapturerObserver;->nativeOnFrameCaptured(JIIIJLorg/webrtc/VideoFrame$Buffer;)V

    return-void
.end method
