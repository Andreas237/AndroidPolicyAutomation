.class final synthetic Lorg/webrtc/VideoFileRenderer$$Lambda$0;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field private final arg$1:Lorg/webrtc/VideoFileRenderer;

.field private final arg$2:Lorg/webrtc/VideoFrame;


# direct methods
.method constructor <init>(Lorg/webrtc/VideoFileRenderer;Lorg/webrtc/VideoFrame;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lorg/webrtc/VideoFileRenderer$$Lambda$0;->arg$1:Lorg/webrtc/VideoFileRenderer;

    iput-object p2, p0, Lorg/webrtc/VideoFileRenderer$$Lambda$0;->arg$2:Lorg/webrtc/VideoFrame;

    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    iget-object v0, p0, Lorg/webrtc/VideoFileRenderer$$Lambda$0;->arg$1:Lorg/webrtc/VideoFileRenderer;

    iget-object v1, p0, Lorg/webrtc/VideoFileRenderer$$Lambda$0;->arg$2:Lorg/webrtc/VideoFrame;

    invoke-virtual {v0, v1}, Lorg/webrtc/VideoFileRenderer;->lambda$onFrame$0$VideoFileRenderer(Lorg/webrtc/VideoFrame;)V

    return-void
.end method
