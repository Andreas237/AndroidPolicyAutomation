.class public Lcom/microblink/camera/hardware/camera/camera1/frame/Camera1PreviewFramePool;
.super Ljava/lang/Object;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/microblink/camera/hardware/camera/camera1/frame/Camera1PreviewFramePool$Camera1PreviewFrameCachedPool;
    }
.end annotation


# instance fields
.field private mObjectPool:Lcom/microblink/camera/hardware/camera/camera1/frame/Camera1PreviewFramePool$Camera1PreviewFrameCachedPool;


# direct methods
.method public constructor <init>(IIILcom/microblink/camera/hardware/camera/camera1/Camera1Manager;ILcom/microblink/camera/hardware/camera/CameraFrameFactory;)V
    .locals 9
    .param p6    # Lcom/microblink/camera/hardware/camera/CameraFrameFactory;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/microblink/camera/hardware/camera/camera1/frame/Camera1PreviewFramePool;->mObjectPool:Lcom/microblink/camera/hardware/camera/camera1/frame/Camera1PreviewFramePool$Camera1PreviewFrameCachedPool;

    new-instance v0, Lcom/microblink/camera/hardware/camera/camera1/frame/Camera1PreviewFramePool$Camera1PreviewFrameCachedPool;

    new-instance v8, Lcom/microblink/camera/hardware/camera/camera1/frame/Camera1PreviewFramePool$1;

    move-object v1, v8

    move-object v2, p0

    move-object v3, p6

    move v4, p1

    move v5, p2

    move v6, p3

    move-object v7, p4

    invoke-direct/range {v1 .. v7}, Lcom/microblink/camera/hardware/camera/camera1/frame/Camera1PreviewFramePool$1;-><init>(Lcom/microblink/camera/hardware/camera/camera1/frame/Camera1PreviewFramePool;Lcom/microblink/camera/hardware/camera/CameraFrameFactory;IIILcom/microblink/camera/hardware/camera/camera1/Camera1Manager;)V

    invoke-direct {v0, p0, v8, p5}, Lcom/microblink/camera/hardware/camera/camera1/frame/Camera1PreviewFramePool$Camera1PreviewFrameCachedPool;-><init>(Lcom/microblink/camera/hardware/camera/camera1/frame/Camera1PreviewFramePool;Lcom/microblink/camera/util/pool/PoolObjectFactory;I)V

    iput-object v0, p0, Lcom/microblink/camera/hardware/camera/camera1/frame/Camera1PreviewFramePool;->mObjectPool:Lcom/microblink/camera/hardware/camera/camera1/frame/Camera1PreviewFramePool$Camera1PreviewFrameCachedPool;

    return-void
.end method


# virtual methods
.method public dispose()V
    .locals 1

    iget-object v0, p0, Lcom/microblink/camera/hardware/camera/camera1/frame/Camera1PreviewFramePool;->mObjectPool:Lcom/microblink/camera/hardware/camera/camera1/frame/Camera1PreviewFramePool$Camera1PreviewFrameCachedPool;

    invoke-virtual {v0}, Lcom/microblink/camera/hardware/camera/camera1/frame/Camera1PreviewFramePool$Camera1PreviewFrameCachedPool;->dispose()V

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/microblink/camera/hardware/camera/camera1/frame/Camera1PreviewFramePool;->mObjectPool:Lcom/microblink/camera/hardware/camera/camera1/frame/Camera1PreviewFramePool$Camera1PreviewFrameCachedPool;

    return-void
.end method

.method public getFrameByItsBuffer([B)Lcom/microblink/camera/hardware/camera/camera1/frame/Camera1PreviewFrame;
    .locals 1

    iget-object v0, p0, Lcom/microblink/camera/hardware/camera/camera1/frame/Camera1PreviewFramePool;->mObjectPool:Lcom/microblink/camera/hardware/camera/camera1/frame/Camera1PreviewFramePool$Camera1PreviewFrameCachedPool;

    if-eqz v0, :cond_0

    invoke-virtual {v0, p1}, Lcom/microblink/camera/hardware/camera/camera1/frame/Camera1PreviewFramePool$Camera1PreviewFrameCachedPool;->getFrameByItsBuffer([B)Lcom/microblink/camera/hardware/camera/camera1/frame/Camera1PreviewFrame;

    move-result-object p1

    return-object p1

    :cond_0
    const/4 p1, 0x0

    return-object p1
.end method

.method public obtain()Lcom/microblink/camera/hardware/camera/camera1/frame/Camera1PreviewFrame;
    .locals 1

    iget-object v0, p0, Lcom/microblink/camera/hardware/camera/camera1/frame/Camera1PreviewFramePool;->mObjectPool:Lcom/microblink/camera/hardware/camera/camera1/frame/Camera1PreviewFramePool$Camera1PreviewFrameCachedPool;

    invoke-virtual {v0}, Lcom/microblink/camera/hardware/camera/camera1/frame/Camera1PreviewFramePool$Camera1PreviewFrameCachedPool;->newObject()Lcom/microblink/camera/util/pool/PoolObject;

    move-result-object v0

    check-cast v0, Lcom/microblink/camera/hardware/camera/camera1/frame/Camera1PreviewFrame;

    return-object v0
.end method

.method public recycle(Lcom/microblink/camera/hardware/camera/camera1/frame/Camera1PreviewFrame;)V
    .locals 1

    iget-object v0, p0, Lcom/microblink/camera/hardware/camera/camera1/frame/Camera1PreviewFramePool;->mObjectPool:Lcom/microblink/camera/hardware/camera/camera1/frame/Camera1PreviewFramePool$Camera1PreviewFrameCachedPool;

    invoke-virtual {v0, p1}, Lcom/microblink/camera/hardware/camera/camera1/frame/Camera1PreviewFramePool$Camera1PreviewFrameCachedPool;->freeObject(Lcom/microblink/camera/util/pool/PoolObject;)V

    return-void
.end method
