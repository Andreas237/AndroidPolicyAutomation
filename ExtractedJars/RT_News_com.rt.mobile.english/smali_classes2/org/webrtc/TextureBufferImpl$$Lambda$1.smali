.class final synthetic Lorg/webrtc/TextureBufferImpl$$Lambda$1;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field private final arg$1:Lorg/webrtc/TextureBufferImpl;


# direct methods
.method constructor <init>(Lorg/webrtc/TextureBufferImpl;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lorg/webrtc/TextureBufferImpl$$Lambda$1;->arg$1:Lorg/webrtc/TextureBufferImpl;

    return-void
.end method


# virtual methods
.method public run()V
    .locals 1

    iget-object v0, p0, Lorg/webrtc/TextureBufferImpl$$Lambda$1;->arg$1:Lorg/webrtc/TextureBufferImpl;

    invoke-virtual {v0}, Lorg/webrtc/TextureBufferImpl;->release()V

    return-void
.end method
