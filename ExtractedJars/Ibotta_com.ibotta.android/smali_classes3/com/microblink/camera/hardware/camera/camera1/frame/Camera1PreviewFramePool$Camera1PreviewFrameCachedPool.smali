.class Lcom/microblink/camera/hardware/camera/camera1/frame/Camera1PreviewFramePool$Camera1PreviewFrameCachedPool;
.super Lcom/microblink/camera/util/pool/ObjectPool;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/microblink/camera/hardware/camera/camera1/frame/Camera1PreviewFramePool;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = "Camera1PreviewFrameCachedPool"
.end annotation


# instance fields
.field private mFrameCache:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "[B",
            "Lcom/microblink/camera/hardware/camera/camera1/frame/Camera1PreviewFrame;",
            ">;"
        }
    .end annotation
.end field

.field final synthetic this$0:Lcom/microblink/camera/hardware/camera/camera1/frame/Camera1PreviewFramePool;


# direct methods
.method public constructor <init>(Lcom/microblink/camera/hardware/camera/camera1/frame/Camera1PreviewFramePool;Lcom/microblink/camera/util/pool/PoolObjectFactory;I)V
    .locals 0

    iput-object p1, p0, Lcom/microblink/camera/hardware/camera/camera1/frame/Camera1PreviewFramePool$Camera1PreviewFrameCachedPool;->this$0:Lcom/microblink/camera/hardware/camera/camera1/frame/Camera1PreviewFramePool;

    invoke-direct {p0, p2, p3}, Lcom/microblink/camera/util/pool/ObjectPool;-><init>(Lcom/microblink/camera/util/pool/PoolObjectFactory;I)V

    const/4 p1, 0x0

    iput-object p1, p0, Lcom/microblink/camera/hardware/camera/camera1/frame/Camera1PreviewFramePool$Camera1PreviewFrameCachedPool;->mFrameCache:Ljava/util/Map;

    new-instance p1, Ljava/util/HashMap;

    invoke-direct {p1, p3}, Ljava/util/HashMap;-><init>(I)V

    iput-object p1, p0, Lcom/microblink/camera/hardware/camera/camera1/frame/Camera1PreviewFramePool$Camera1PreviewFrameCachedPool;->mFrameCache:Ljava/util/Map;

    return-void
.end method


# virtual methods
.method public dispose()V
    .locals 3

    iget-object v0, p0, Lcom/microblink/camera/hardware/camera/camera1/frame/Camera1PreviewFramePool$Camera1PreviewFrameCachedPool;->mFrameCache:Ljava/util/Map;

    if-eqz v0, :cond_1

    invoke-interface {v0}, Ljava/util/Map;->keySet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, [B

    iget-object v2, p0, Lcom/microblink/camera/hardware/camera/camera1/frame/Camera1PreviewFramePool$Camera1PreviewFrameCachedPool;->mFrameCache:Ljava/util/Map;

    invoke-interface {v2, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/microblink/camera/hardware/camera/camera1/frame/Camera1PreviewFrame;

    invoke-virtual {v1}, Lcom/microblink/camera/hardware/camera/camera1/frame/Camera1PreviewFrame;->dispose()V

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lcom/microblink/camera/hardware/camera/camera1/frame/Camera1PreviewFramePool$Camera1PreviewFrameCachedPool;->mFrameCache:Ljava/util/Map;

    invoke-interface {v0}, Ljava/util/Map;->clear()V

    :cond_1
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/microblink/camera/hardware/camera/camera1/frame/Camera1PreviewFramePool$Camera1PreviewFrameCachedPool;->mFrameCache:Ljava/util/Map;

    return-void
.end method

.method protected finalize()V
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Throwable;
        }
    .end annotation

    invoke-virtual {p0}, Lcom/microblink/camera/hardware/camera/camera1/frame/Camera1PreviewFramePool$Camera1PreviewFrameCachedPool;->dispose()V

    invoke-super {p0}, Ljava/lang/Object;->finalize()V

    return-void
.end method

.method public declared-synchronized getFrameByItsBuffer([B)Lcom/microblink/camera/hardware/camera/camera1/frame/Camera1PreviewFrame;
    .locals 2

    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lcom/microblink/camera/hardware/camera/camera1/frame/Camera1PreviewFramePool$Camera1PreviewFrameCachedPool;->mFrameCache:Ljava/util/Map;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    const/4 v1, 0x0

    if-nez v0, :cond_0

    monitor-exit p0

    return-object v1

    :cond_0
    :try_start_1
    iget-object v0, p0, Lcom/microblink/camera/hardware/camera/camera1/frame/Camera1PreviewFramePool$Camera1PreviewFrameCachedPool;->mFrameCache:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/microblink/camera/hardware/camera/camera1/frame/Camera1PreviewFrame;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    if-nez p1, :cond_1

    monitor-exit p0

    return-object v1

    :cond_1
    :try_start_2
    invoke-virtual {p1}, Lcom/microblink/camera/hardware/camera/camera1/frame/Camera1PreviewFrame;->initializePoolObject()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    monitor-exit p0

    return-object p1

    :catchall_0
    move-exception p1

    monitor-exit p0

    throw p1
.end method

.method public declared-synchronized newObject()Lcom/microblink/camera/util/pool/PoolObject;
    .locals 4

    monitor-enter p0

    :try_start_0
    invoke-super {p0}, Lcom/microblink/camera/util/pool/ObjectPool;->newObject()Lcom/microblink/camera/util/pool/PoolObject;

    move-result-object v0

    check-cast v0, Lcom/microblink/camera/hardware/camera/camera1/frame/Camera1PreviewFrame;

    iget-object v1, p0, Lcom/microblink/camera/hardware/camera/camera1/frame/Camera1PreviewFramePool$Camera1PreviewFrameCachedPool;->mFrameCache:Ljava/util/Map;

    invoke-virtual {v0}, Lcom/microblink/camera/hardware/camera/camera1/frame/Camera1PreviewFrame;->getImgBuffer()[B

    move-result-object v2

    invoke-interface {v1, v2, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v1, p0, Lcom/microblink/camera/hardware/camera/camera1/frame/Camera1PreviewFramePool$Camera1PreviewFrameCachedPool;->this$0:Lcom/microblink/camera/hardware/camera/camera1/frame/Camera1PreviewFramePool;

    const-string v2, "Creating new camera preview frame"

    const/4 v3, 0x0

    new-array v3, v3, [Ljava/lang/Object;

    invoke-static {v1, v2, v3}, Lcom/microblink/internal/Logger;->d(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-object v0

    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method
