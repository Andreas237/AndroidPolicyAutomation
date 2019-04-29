.class final synthetic Lorg/webrtc/Camera1Session$$Lambda$0;
.super Ljava/lang/Object;

# interfaces
.implements Lorg/webrtc/VideoSink;


# instance fields
.field private final arg$1:Lorg/webrtc/Camera1Session;


# direct methods
.method constructor <init>(Lorg/webrtc/Camera1Session;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lorg/webrtc/Camera1Session$$Lambda$0;->arg$1:Lorg/webrtc/Camera1Session;

    return-void
.end method


# virtual methods
.method public onFrame(Lorg/webrtc/VideoFrame;)V
    .locals 1

    iget-object v0, p0, Lorg/webrtc/Camera1Session$$Lambda$0;->arg$1:Lorg/webrtc/Camera1Session;

    invoke-virtual {v0, p1}, Lorg/webrtc/Camera1Session;->lambda$listenForTextureFrames$0$Camera1Session(Lorg/webrtc/VideoFrame;)V

    return-void
.end method
