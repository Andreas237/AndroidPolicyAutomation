.class public Lcom/shopkick/utilities/ManualResetEvent;
.super Ljava/lang/Object;
.source "ManualResetEvent.java"


# instance fields
.field private final monitor:Ljava/lang/Object;

.field private volatile open:Z


# direct methods
.method public constructor <init>(Z)V
    .locals 1

    .line 20
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 10
    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    iput-object v0, p0, Lcom/shopkick/utilities/ManualResetEvent;->monitor:Ljava/lang/Object;

    const/4 v0, 0x0

    .line 11
    iput-boolean v0, p0, Lcom/shopkick/utilities/ManualResetEvent;->open:Z

    .line 21
    iput-boolean p1, p0, Lcom/shopkick/utilities/ManualResetEvent;->open:Z

    return-void
.end method


# virtual methods
.method public close()V
    .locals 1

    const/4 v0, 0x0

    .line 52
    iput-boolean v0, p0, Lcom/shopkick/utilities/ManualResetEvent;->open:Z

    return-void
.end method

.method public open()V
    .locals 2

    .line 44
    iget-object v0, p0, Lcom/shopkick/utilities/ManualResetEvent;->monitor:Ljava/lang/Object;

    monitor-enter v0

    const/4 v1, 0x1

    .line 45
    :try_start_0
    iput-boolean v1, p0, Lcom/shopkick/utilities/ManualResetEvent;->open:Z

    .line 46
    iget-object v1, p0, Lcom/shopkick/utilities/ManualResetEvent;->monitor:Ljava/lang/Object;

    invoke-virtual {v1}, Ljava/lang/Object;->notifyAll()V

    .line 47
    monitor-exit v0

    return-void

    :catchall_0
    move-exception v1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1
.end method

.method public waitForOpen()V
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/InterruptedException;
        }
    .end annotation

    .line 26
    iget-object v0, p0, Lcom/shopkick/utilities/ManualResetEvent;->monitor:Ljava/lang/Object;

    monitor-enter v0

    .line 27
    :goto_0
    :try_start_0
    iget-boolean v1, p0, Lcom/shopkick/utilities/ManualResetEvent;->open:Z

    if-nez v1, :cond_0

    .line 28
    iget-object v1, p0, Lcom/shopkick/utilities/ManualResetEvent;->monitor:Ljava/lang/Object;

    invoke-virtual {v1}, Ljava/lang/Object;->wait()V

    goto :goto_0

    .line 30
    :cond_0
    monitor-exit v0

    return-void

    :catchall_0
    move-exception v1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1
.end method

.method public waitForOpen(J)V
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/InterruptedException;
        }
    .end annotation

    .line 35
    iget-object v0, p0, Lcom/shopkick/utilities/ManualResetEvent;->monitor:Ljava/lang/Object;

    monitor-enter v0

    .line 36
    :try_start_0
    iget-boolean v1, p0, Lcom/shopkick/utilities/ManualResetEvent;->open:Z

    if-nez v1, :cond_0

    .line 37
    iget-object v1, p0, Lcom/shopkick/utilities/ManualResetEvent;->monitor:Ljava/lang/Object;

    invoke-virtual {v1, p1, p2}, Ljava/lang/Object;->wait(J)V

    .line 39
    :cond_0
    monitor-exit v0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1
.end method
