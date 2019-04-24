.class public abstract Lcom/scandit/recognition/NativeHandle;
.super Ljava/lang/Object;
.source "NativeHandle.java"


# instance fields
.field protected mNative:J

.field protected mOwnsHandle:Z


# direct methods
.method protected constructor <init>(J)V
    .locals 1

    const/4 v0, 0x1

    .line 31
    invoke-direct {p0, p1, p2, v0}, Lcom/scandit/recognition/NativeHandle;-><init>(JZ)V

    return-void
.end method

.method protected constructor <init>(JZ)V
    .locals 0

    .line 25
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 26
    iput-wide p1, p0, Lcom/scandit/recognition/NativeHandle;->mNative:J

    .line 27
    iput-boolean p3, p0, Lcom/scandit/recognition/NativeHandle;->mOwnsHandle:Z

    return-void
.end method


# virtual methods
.method declared-synchronized destroy()V
    .locals 5

    monitor-enter p0

    .line 35
    :try_start_0
    iget-boolean v0, p0, Lcom/scandit/recognition/NativeHandle;->mOwnsHandle:Z

    const-wide/16 v1, 0x0

    if-eqz v0, :cond_0

    iget-wide v3, p0, Lcom/scandit/recognition/NativeHandle;->mNative:J
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    cmp-long v0, v3, v1

    if-eqz v0, :cond_0

    .line 37
    :try_start_1
    iget-wide v3, p0, Lcom/scandit/recognition/NativeHandle;->mNative:J

    invoke-virtual {p0, v3, v4}, Lcom/scandit/recognition/NativeHandle;->release(J)V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 43
    :catch_0
    :cond_0
    :try_start_2
    iput-wide v1, p0, Lcom/scandit/recognition/NativeHandle;->mNative:J
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 44
    monitor-exit p0

    return-void

    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method protected finalize()V
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Throwable;
        }
    .end annotation

    .line 52
    invoke-virtual {p0}, Lcom/scandit/recognition/NativeHandle;->destroy()V

    .line 53
    invoke-super {p0}, Ljava/lang/Object;->finalize()V

    return-void
.end method

.method public getHandle()J
    .locals 2

    .line 47
    iget-wide v0, p0, Lcom/scandit/recognition/NativeHandle;->mNative:J

    return-wide v0
.end method

.method protected abstract release(J)V
.end method
