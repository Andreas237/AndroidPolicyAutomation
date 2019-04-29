.class final synthetic Lorg/webrtc/EglRenderer$$Lambda$2;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field private final arg$1:Lorg/webrtc/EglRenderer;

.field private final arg$2:Landroid/os/Looper;


# direct methods
.method constructor <init>(Lorg/webrtc/EglRenderer;Landroid/os/Looper;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lorg/webrtc/EglRenderer$$Lambda$2;->arg$1:Lorg/webrtc/EglRenderer;

    iput-object p2, p0, Lorg/webrtc/EglRenderer$$Lambda$2;->arg$2:Landroid/os/Looper;

    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    iget-object v0, p0, Lorg/webrtc/EglRenderer$$Lambda$2;->arg$1:Lorg/webrtc/EglRenderer;

    iget-object v1, p0, Lorg/webrtc/EglRenderer$$Lambda$2;->arg$2:Landroid/os/Looper;

    invoke-virtual {v0, v1}, Lorg/webrtc/EglRenderer;->lambda$release$2$EglRenderer(Landroid/os/Looper;)V

    return-void
.end method
