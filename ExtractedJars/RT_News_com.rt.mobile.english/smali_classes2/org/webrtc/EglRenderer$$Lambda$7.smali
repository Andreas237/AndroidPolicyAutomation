.class final synthetic Lorg/webrtc/EglRenderer$$Lambda$7;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field private final arg$1:Lorg/webrtc/EglRenderer;

.field private final arg$2:F

.field private final arg$3:F

.field private final arg$4:F

.field private final arg$5:F


# direct methods
.method constructor <init>(Lorg/webrtc/EglRenderer;FFFF)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lorg/webrtc/EglRenderer$$Lambda$7;->arg$1:Lorg/webrtc/EglRenderer;

    iput p2, p0, Lorg/webrtc/EglRenderer$$Lambda$7;->arg$2:F

    iput p3, p0, Lorg/webrtc/EglRenderer$$Lambda$7;->arg$3:F

    iput p4, p0, Lorg/webrtc/EglRenderer$$Lambda$7;->arg$4:F

    iput p5, p0, Lorg/webrtc/EglRenderer$$Lambda$7;->arg$5:F

    return-void
.end method


# virtual methods
.method public run()V
    .locals 5

    iget-object v0, p0, Lorg/webrtc/EglRenderer$$Lambda$7;->arg$1:Lorg/webrtc/EglRenderer;

    iget v1, p0, Lorg/webrtc/EglRenderer$$Lambda$7;->arg$2:F

    iget v2, p0, Lorg/webrtc/EglRenderer$$Lambda$7;->arg$3:F

    iget v3, p0, Lorg/webrtc/EglRenderer$$Lambda$7;->arg$4:F

    iget v4, p0, Lorg/webrtc/EglRenderer$$Lambda$7;->arg$5:F

    invoke-virtual {v0, v1, v2, v3, v4}, Lorg/webrtc/EglRenderer;->lambda$clearImage$6$EglRenderer(FFFF)V

    return-void
.end method
