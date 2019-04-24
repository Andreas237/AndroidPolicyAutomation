.class public Lcom/microblink/camera/util/pool/ObjectPool;
.super Ljava/lang/Object;


# instance fields
.field protected final MAX_FREE_OBJECT_INDEX:I

.field private mFactory:Lcom/microblink/camera/util/pool/PoolObjectFactory;

.field private mFreeObjectIndex:I

.field private mFreeObjects:[Lcom/microblink/camera/util/pool/PoolObject;


# direct methods
.method public constructor <init>(Lcom/microblink/camera/util/pool/PoolObjectFactory;I)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, -0x1

    iput v0, p0, Lcom/microblink/camera/util/pool/ObjectPool;->mFreeObjectIndex:I

    iput-object p1, p0, Lcom/microblink/camera/util/pool/ObjectPool;->mFactory:Lcom/microblink/camera/util/pool/PoolObjectFactory;

    new-array p1, p2, [Lcom/microblink/camera/util/pool/PoolObject;

    iput-object p1, p0, Lcom/microblink/camera/util/pool/ObjectPool;->mFreeObjects:[Lcom/microblink/camera/util/pool/PoolObject;

    add-int/lit8 p2, p2, -0x1

    iput p2, p0, Lcom/microblink/camera/util/pool/ObjectPool;->MAX_FREE_OBJECT_INDEX:I

    return-void
.end method


# virtual methods
.method public declared-synchronized freeObject(Lcom/microblink/camera/util/pool/PoolObject;)V
    .locals 2

    monitor-enter p0

    if-eqz p1, :cond_0

    :try_start_0
    invoke-interface {p1}, Lcom/microblink/camera/util/pool/PoolObject;->finalizePoolObject()V

    iget v0, p0, Lcom/microblink/camera/util/pool/ObjectPool;->mFreeObjectIndex:I

    iget v1, p0, Lcom/microblink/camera/util/pool/ObjectPool;->MAX_FREE_OBJECT_INDEX:I

    if-ge v0, v1, :cond_0

    iget v0, p0, Lcom/microblink/camera/util/pool/ObjectPool;->mFreeObjectIndex:I

    add-int/lit8 v0, v0, 0x1

    iput v0, p0, Lcom/microblink/camera/util/pool/ObjectPool;->mFreeObjectIndex:I

    iget-object v0, p0, Lcom/microblink/camera/util/pool/ObjectPool;->mFreeObjects:[Lcom/microblink/camera/util/pool/PoolObject;

    iget v1, p0, Lcom/microblink/camera/util/pool/ObjectPool;->mFreeObjectIndex:I

    aput-object p1, v0, v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception p1

    monitor-exit p0

    throw p1

    :cond_0
    :goto_0
    monitor-exit p0

    return-void
.end method

.method public declared-synchronized newObject()Lcom/microblink/camera/util/pool/PoolObject;
    .locals 2

    monitor-enter p0

    :try_start_0
    iget v0, p0, Lcom/microblink/camera/util/pool/ObjectPool;->mFreeObjectIndex:I

    const/4 v1, -0x1

    if-ne v0, v1, :cond_0

    iget-object v0, p0, Lcom/microblink/camera/util/pool/ObjectPool;->mFactory:Lcom/microblink/camera/util/pool/PoolObjectFactory;

    invoke-interface {v0}, Lcom/microblink/camera/util/pool/PoolObjectFactory;->createPoolObject()Lcom/microblink/camera/util/pool/PoolObject;

    move-result-object v0

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lcom/microblink/camera/util/pool/ObjectPool;->mFreeObjects:[Lcom/microblink/camera/util/pool/PoolObject;

    iget v1, p0, Lcom/microblink/camera/util/pool/ObjectPool;->mFreeObjectIndex:I

    aget-object v0, v0, v1

    iget v1, p0, Lcom/microblink/camera/util/pool/ObjectPool;->mFreeObjectIndex:I

    add-int/lit8 v1, v1, -0x1

    iput v1, p0, Lcom/microblink/camera/util/pool/ObjectPool;->mFreeObjectIndex:I

    :goto_0
    invoke-interface {v0}, Lcom/microblink/camera/util/pool/PoolObject;->initializePoolObject()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-object v0

    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method
