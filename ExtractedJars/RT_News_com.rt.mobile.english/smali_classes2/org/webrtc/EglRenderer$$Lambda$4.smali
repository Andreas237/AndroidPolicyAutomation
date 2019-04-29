.class final synthetic Lorg/webrtc/EglRenderer$$Lambda$4;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field private final arg$1:Lorg/webrtc/EglRenderer;

.field private final arg$2:Ljava/util/concurrent/CountDownLatch;

.field private final arg$3:Lorg/webrtc/EglRenderer$FrameListener;


# direct methods
.method constructor <init>(Lorg/webrtc/EglRenderer;Ljava/util/concurrent/CountDownLatch;Lorg/webrtc/EglRenderer$FrameListener;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lorg/webrtc/EglRenderer$$Lambda$4;->arg$1:Lorg/webrtc/EglRenderer;

    iput-object p2, p0, Lorg/webrtc/EglRenderer$$Lambda$4;->arg$2:Ljava/util/concurrent/CountDownLatch;

    iput-object p3, p0, Lorg/webrtc/EglRenderer$$Lambda$4;->arg$3:Lorg/webrtc/EglRenderer$FrameListener;

    return-void
.end method


# virtual methods
.method public run()V
    .locals 3

    iget-object v0, p0, Lorg/webrtc/EglRenderer$$Lambda$4;->arg$1:Lorg/webrtc/EglRenderer;

    iget-object v1, p0, Lorg/webrtc/EglRenderer$$Lambda$4;->arg$2:Ljava/util/concurrent/CountDownLatch;

    iget-object v2, p0, Lorg/webrtc/EglRenderer$$Lambda$4;->arg$3:Lorg/webrtc/EglRenderer$FrameListener;

    invoke-virtual {v0, v1, v2}, Lorg/webrtc/EglRenderer;->lambda$removeFrameListener$4$EglRenderer(Ljava/util/concurrent/CountDownLatch;Lorg/webrtc/EglRenderer$FrameListener;)V

    return-void
.end method
