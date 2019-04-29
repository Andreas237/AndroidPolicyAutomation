.class final synthetic Lorg/webrtc/SurfaceTextureHelper$$Lambda$0;
.super Ljava/lang/Object;

# interfaces
.implements Landroid/graphics/SurfaceTexture$OnFrameAvailableListener;


# instance fields
.field private final arg$1:Lorg/webrtc/SurfaceTextureHelper;


# direct methods
.method constructor <init>(Lorg/webrtc/SurfaceTextureHelper;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lorg/webrtc/SurfaceTextureHelper$$Lambda$0;->arg$1:Lorg/webrtc/SurfaceTextureHelper;

    return-void
.end method


# virtual methods
.method public onFrameAvailable(Landroid/graphics/SurfaceTexture;)V
    .locals 1

    iget-object v0, p0, Lorg/webrtc/SurfaceTextureHelper$$Lambda$0;->arg$1:Lorg/webrtc/SurfaceTextureHelper;

    invoke-virtual {v0, p1}, Lorg/webrtc/SurfaceTextureHelper;->lambda$new$0$SurfaceTextureHelper(Landroid/graphics/SurfaceTexture;)V

    return-void
.end method
