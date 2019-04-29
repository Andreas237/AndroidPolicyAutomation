.class final synthetic Lorg/webrtc/SurfaceTextureHelper$$Lambda$2;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field private final arg$1:Lorg/webrtc/SurfaceTextureHelper;

.field private final arg$2:I

.field private final arg$3:I


# direct methods
.method constructor <init>(Lorg/webrtc/SurfaceTextureHelper;II)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lorg/webrtc/SurfaceTextureHelper$$Lambda$2;->arg$1:Lorg/webrtc/SurfaceTextureHelper;

    iput p2, p0, Lorg/webrtc/SurfaceTextureHelper$$Lambda$2;->arg$2:I

    iput p3, p0, Lorg/webrtc/SurfaceTextureHelper$$Lambda$2;->arg$3:I

    return-void
.end method


# virtual methods
.method public run()V
    .locals 3

    iget-object v0, p0, Lorg/webrtc/SurfaceTextureHelper$$Lambda$2;->arg$1:Lorg/webrtc/SurfaceTextureHelper;

    iget v1, p0, Lorg/webrtc/SurfaceTextureHelper$$Lambda$2;->arg$2:I

    iget v2, p0, Lorg/webrtc/SurfaceTextureHelper$$Lambda$2;->arg$3:I

    invoke-virtual {v0, v1, v2}, Lorg/webrtc/SurfaceTextureHelper;->lambda$setTextureSize$2$SurfaceTextureHelper(II)V

    return-void
.end method
