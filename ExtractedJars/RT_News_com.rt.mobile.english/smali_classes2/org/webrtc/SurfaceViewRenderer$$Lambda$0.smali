.class final synthetic Lorg/webrtc/SurfaceViewRenderer$$Lambda$0;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field private final arg$1:Lorg/webrtc/SurfaceViewRenderer;

.field private final arg$2:I

.field private final arg$3:I


# direct methods
.method constructor <init>(Lorg/webrtc/SurfaceViewRenderer;II)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lorg/webrtc/SurfaceViewRenderer$$Lambda$0;->arg$1:Lorg/webrtc/SurfaceViewRenderer;

    iput p2, p0, Lorg/webrtc/SurfaceViewRenderer$$Lambda$0;->arg$2:I

    iput p3, p0, Lorg/webrtc/SurfaceViewRenderer$$Lambda$0;->arg$3:I

    return-void
.end method


# virtual methods
.method public run()V
    .locals 3

    iget-object v0, p0, Lorg/webrtc/SurfaceViewRenderer$$Lambda$0;->arg$1:Lorg/webrtc/SurfaceViewRenderer;

    iget v1, p0, Lorg/webrtc/SurfaceViewRenderer$$Lambda$0;->arg$2:I

    iget v2, p0, Lorg/webrtc/SurfaceViewRenderer$$Lambda$0;->arg$3:I

    invoke-virtual {v0, v1, v2}, Lorg/webrtc/SurfaceViewRenderer;->lambda$onFrameResolutionChanged$0$SurfaceViewRenderer(II)V

    return-void
.end method
