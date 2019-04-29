.class final synthetic Lorg/webrtc/EglRenderer$$Lambda$3;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field private final arg$1:Lorg/webrtc/EglRenderer;

.field private final arg$2:Lorg/webrtc/RendererCommon$GlDrawer;

.field private final arg$3:Lorg/webrtc/EglRenderer$FrameListener;

.field private final arg$4:F

.field private final arg$5:Z


# direct methods
.method constructor <init>(Lorg/webrtc/EglRenderer;Lorg/webrtc/RendererCommon$GlDrawer;Lorg/webrtc/EglRenderer$FrameListener;FZ)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lorg/webrtc/EglRenderer$$Lambda$3;->arg$1:Lorg/webrtc/EglRenderer;

    iput-object p2, p0, Lorg/webrtc/EglRenderer$$Lambda$3;->arg$2:Lorg/webrtc/RendererCommon$GlDrawer;

    iput-object p3, p0, Lorg/webrtc/EglRenderer$$Lambda$3;->arg$3:Lorg/webrtc/EglRenderer$FrameListener;

    iput p4, p0, Lorg/webrtc/EglRenderer$$Lambda$3;->arg$4:F

    iput-boolean p5, p0, Lorg/webrtc/EglRenderer$$Lambda$3;->arg$5:Z

    return-void
.end method


# virtual methods
.method public run()V
    .locals 5

    iget-object v0, p0, Lorg/webrtc/EglRenderer$$Lambda$3;->arg$1:Lorg/webrtc/EglRenderer;

    iget-object v1, p0, Lorg/webrtc/EglRenderer$$Lambda$3;->arg$2:Lorg/webrtc/RendererCommon$GlDrawer;

    iget-object v2, p0, Lorg/webrtc/EglRenderer$$Lambda$3;->arg$3:Lorg/webrtc/EglRenderer$FrameListener;

    iget v3, p0, Lorg/webrtc/EglRenderer$$Lambda$3;->arg$4:F

    iget-boolean v4, p0, Lorg/webrtc/EglRenderer$$Lambda$3;->arg$5:Z

    invoke-virtual {v0, v1, v2, v3, v4}, Lorg/webrtc/EglRenderer;->lambda$addFrameListener$3$EglRenderer(Lorg/webrtc/RendererCommon$GlDrawer;Lorg/webrtc/EglRenderer$FrameListener;FZ)V

    return-void
.end method
