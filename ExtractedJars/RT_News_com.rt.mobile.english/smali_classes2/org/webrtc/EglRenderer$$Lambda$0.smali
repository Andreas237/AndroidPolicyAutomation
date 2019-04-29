.class final synthetic Lorg/webrtc/EglRenderer$$Lambda$0;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field private final arg$1:Lorg/webrtc/EglRenderer;

.field private final arg$2:Lorg/webrtc/EglBase$Context;

.field private final arg$3:[I


# direct methods
.method constructor <init>(Lorg/webrtc/EglRenderer;Lorg/webrtc/EglBase$Context;[I)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lorg/webrtc/EglRenderer$$Lambda$0;->arg$1:Lorg/webrtc/EglRenderer;

    iput-object p2, p0, Lorg/webrtc/EglRenderer$$Lambda$0;->arg$2:Lorg/webrtc/EglBase$Context;

    iput-object p3, p0, Lorg/webrtc/EglRenderer$$Lambda$0;->arg$3:[I

    return-void
.end method


# virtual methods
.method public run()V
    .locals 3

    iget-object v0, p0, Lorg/webrtc/EglRenderer$$Lambda$0;->arg$1:Lorg/webrtc/EglRenderer;

    iget-object v1, p0, Lorg/webrtc/EglRenderer$$Lambda$0;->arg$2:Lorg/webrtc/EglBase$Context;

    iget-object v2, p0, Lorg/webrtc/EglRenderer$$Lambda$0;->arg$3:[I

    invoke-virtual {v0, v1, v2}, Lorg/webrtc/EglRenderer;->lambda$init$0$EglRenderer(Lorg/webrtc/EglBase$Context;[I)V

    return-void
.end method
