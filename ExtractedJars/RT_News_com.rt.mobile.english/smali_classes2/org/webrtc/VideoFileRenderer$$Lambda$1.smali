.class final synthetic Lorg/webrtc/VideoFileRenderer$$Lambda$1;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field private final arg$1:Lorg/webrtc/VideoFileRenderer;

.field private final arg$2:Lorg/webrtc/VideoFrame$I420Buffer;

.field private final arg$3:Lorg/webrtc/VideoFrame;


# direct methods
.method constructor <init>(Lorg/webrtc/VideoFileRenderer;Lorg/webrtc/VideoFrame$I420Buffer;Lorg/webrtc/VideoFrame;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lorg/webrtc/VideoFileRenderer$$Lambda$1;->arg$1:Lorg/webrtc/VideoFileRenderer;

    iput-object p2, p0, Lorg/webrtc/VideoFileRenderer$$Lambda$1;->arg$2:Lorg/webrtc/VideoFrame$I420Buffer;

    iput-object p3, p0, Lorg/webrtc/VideoFileRenderer$$Lambda$1;->arg$3:Lorg/webrtc/VideoFrame;

    return-void
.end method


# virtual methods
.method public run()V
    .locals 3

    iget-object v0, p0, Lorg/webrtc/VideoFileRenderer$$Lambda$1;->arg$1:Lorg/webrtc/VideoFileRenderer;

    iget-object v1, p0, Lorg/webrtc/VideoFileRenderer$$Lambda$1;->arg$2:Lorg/webrtc/VideoFrame$I420Buffer;

    iget-object v2, p0, Lorg/webrtc/VideoFileRenderer$$Lambda$1;->arg$3:Lorg/webrtc/VideoFrame;

    invoke-virtual {v0, v1, v2}, Lorg/webrtc/VideoFileRenderer;->lambda$renderFrameOnRenderThread$1$VideoFileRenderer(Lorg/webrtc/VideoFrame$I420Buffer;Lorg/webrtc/VideoFrame;)V

    return-void
.end method
