.class final synthetic Lorg/webrtc/VideoFileRenderer$$Lambda$3;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field private final arg$1:Lorg/webrtc/VideoFileRenderer;


# direct methods
.method constructor <init>(Lorg/webrtc/VideoFileRenderer;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lorg/webrtc/VideoFileRenderer$$Lambda$3;->arg$1:Lorg/webrtc/VideoFileRenderer;

    return-void
.end method


# virtual methods
.method public run()V
    .locals 1

    iget-object v0, p0, Lorg/webrtc/VideoFileRenderer$$Lambda$3;->arg$1:Lorg/webrtc/VideoFileRenderer;

    invoke-virtual {v0}, Lorg/webrtc/VideoFileRenderer;->lambda$release$3$VideoFileRenderer()V

    return-void
.end method
