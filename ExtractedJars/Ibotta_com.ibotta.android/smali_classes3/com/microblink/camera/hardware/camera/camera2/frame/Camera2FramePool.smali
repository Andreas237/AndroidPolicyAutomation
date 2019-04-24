.class public Lcom/microblink/camera/hardware/camera/camera2/frame/Camera2FramePool;
.super Ljava/lang/Object;


# instance fields
.field private mObjectPool:Lcom/microblink/camera/util/pool/ObjectPool;


# direct methods
.method public constructor <init>(ILcom/microblink/camera/hardware/camera/CameraFrameFactory;)V
    .locals 2
    .param p2    # Lcom/microblink/camera/hardware/camera/CameraFrameFactory;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/microblink/camera/hardware/camera/camera2/frame/Camera2FramePool;->mObjectPool:Lcom/microblink/camera/util/pool/ObjectPool;

    new-instance v0, Lcom/microblink/camera/util/pool/ObjectPool;

    new-instance v1, Lcom/microblink/camera/hardware/camera/camera2/frame/Camera2FramePool$1;

    invoke-direct {v1, p0, p2}, Lcom/microblink/camera/hardware/camera/camera2/frame/Camera2FramePool$1;-><init>(Lcom/microblink/camera/hardware/camera/camera2/frame/Camera2FramePool;Lcom/microblink/camera/hardware/camera/CameraFrameFactory;)V

    invoke-direct {v0, v1, p1}, Lcom/microblink/camera/util/pool/ObjectPool;-><init>(Lcom/microblink/camera/util/pool/PoolObjectFactory;I)V

    iput-object v0, p0, Lcom/microblink/camera/hardware/camera/camera2/frame/Camera2FramePool;->mObjectPool:Lcom/microblink/camera/util/pool/ObjectPool;

    return-void
.end method


# virtual methods
.method public obtain()Lcom/microblink/camera/hardware/camera/camera2/frame/Camera2Frame;
    .locals 1

    iget-object v0, p0, Lcom/microblink/camera/hardware/camera/camera2/frame/Camera2FramePool;->mObjectPool:Lcom/microblink/camera/util/pool/ObjectPool;

    invoke-virtual {v0}, Lcom/microblink/camera/util/pool/ObjectPool;->newObject()Lcom/microblink/camera/util/pool/PoolObject;

    move-result-object v0

    check-cast v0, Lcom/microblink/camera/hardware/camera/camera2/frame/Camera2Frame;

    return-object v0
.end method

.method public recycle(Lcom/microblink/camera/hardware/camera/camera2/frame/Camera2Frame;)V
    .locals 1

    iget-object v0, p0, Lcom/microblink/camera/hardware/camera/camera2/frame/Camera2FramePool;->mObjectPool:Lcom/microblink/camera/util/pool/ObjectPool;

    invoke-virtual {v0, p1}, Lcom/microblink/camera/util/pool/ObjectPool;->freeObject(Lcom/microblink/camera/util/pool/PoolObject;)V

    return-void
.end method
