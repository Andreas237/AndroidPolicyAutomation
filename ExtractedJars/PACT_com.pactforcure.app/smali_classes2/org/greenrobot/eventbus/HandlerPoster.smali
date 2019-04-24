.class final Lorg/greenrobot/eventbus/HandlerPoster;
.super Landroid/os/Handler;
.source "HandlerPoster.java"


# instance fields
.field private final eventBus:Lorg/greenrobot/eventbus/EventBus;

.field private handlerActive:Z

.field private final maxMillisInsideHandleMessage:I

.field private final queue:Lorg/greenrobot/eventbus/PendingPostQueue;


# direct methods
.method constructor <init>(Lorg/greenrobot/eventbus/EventBus;Landroid/os/Looper;I)V
    .locals 1
    .param p1, "eventBus"    # Lorg/greenrobot/eventbus/EventBus;
    .param p2, "looper"    # Landroid/os/Looper;
    .param p3, "maxMillisInsideHandleMessage"    # I

    .prologue
    .line 31
    invoke-direct {p0, p2}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    .line 32
    iput-object p1, p0, Lorg/greenrobot/eventbus/HandlerPoster;->eventBus:Lorg/greenrobot/eventbus/EventBus;

    .line 33
    iput p3, p0, Lorg/greenrobot/eventbus/HandlerPoster;->maxMillisInsideHandleMessage:I

    .line 34
    new-instance v0, Lorg/greenrobot/eventbus/PendingPostQueue;

    invoke-direct {v0}, Lorg/greenrobot/eventbus/PendingPostQueue;-><init>()V

    iput-object v0, p0, Lorg/greenrobot/eventbus/HandlerPoster;->queue:Lorg/greenrobot/eventbus/PendingPostQueue;

    .line 35
    return-void
.end method


# virtual methods
.method enqueue(Lorg/greenrobot/eventbus/Subscription;Ljava/lang/Object;)V
    .locals 3
    .param p1, "subscription"    # Lorg/greenrobot/eventbus/Subscription;
    .param p2, "event"    # Ljava/lang/Object;

    .prologue
    .line 38
    invoke-static {p1, p2}, Lorg/greenrobot/eventbus/PendingPost;->obtainPendingPost(Lorg/greenrobot/eventbus/Subscription;Ljava/lang/Object;)Lorg/greenrobot/eventbus/PendingPost;

    move-result-object v0

    .line 39
    .local v0, "pendingPost":Lorg/greenrobot/eventbus/PendingPost;
    monitor-enter p0

    .line 40
    :try_start_0
    iget-object v1, p0, Lorg/greenrobot/eventbus/HandlerPoster;->queue:Lorg/greenrobot/eventbus/PendingPostQueue;

    invoke-virtual {v1, v0}, Lorg/greenrobot/eventbus/PendingPostQueue;->enqueue(Lorg/greenrobot/eventbus/PendingPost;)V

    .line 41
    iget-boolean v1, p0, Lorg/greenrobot/eventbus/HandlerPoster;->handlerActive:Z

    if-nez v1, :cond_0

    .line 42
    const/4 v1, 0x1

    iput-boolean v1, p0, Lorg/greenrobot/eventbus/HandlerPoster;->handlerActive:Z

    .line 43
    invoke-virtual {p0}, Lorg/greenrobot/eventbus/HandlerPoster;->obtainMessage()Landroid/os/Message;

    move-result-object v1

    invoke-virtual {p0, v1}, Lorg/greenrobot/eventbus/HandlerPoster;->sendMessage(Landroid/os/Message;)Z

    move-result v1

    if-nez v1, :cond_0

    .line 44
    new-instance v1, Lorg/greenrobot/eventbus/EventBusException;

    const-string v2, "Could not send handler message"

    invoke-direct {v1, v2}, Lorg/greenrobot/eventbus/EventBusException;-><init>(Ljava/lang/String;)V

    throw v1

    .line 47
    :catchall_0
    move-exception v1

    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1

    :cond_0
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 48
    return-void
.end method

.method public handleMessage(Landroid/os/Message;)V
    .locals 8
    .param p1, "msg"    # Landroid/os/Message;

    .prologue
    .line 52
    const/4 v1, 0x0

    .line 54
    .local v1, "rescheduled":Z
    :try_start_0
    invoke-static {}, Landroid/os/SystemClock;->uptimeMillis()J

    move-result-wide v2

    .line 56
    .local v2, "started":J
    :cond_0
    iget-object v6, p0, Lorg/greenrobot/eventbus/HandlerPoster;->queue:Lorg/greenrobot/eventbus/PendingPostQueue;

    invoke-virtual {v6}, Lorg/greenrobot/eventbus/PendingPostQueue;->poll()Lorg/greenrobot/eventbus/PendingPost;

    move-result-object v0

    .line 57
    .local v0, "pendingPost":Lorg/greenrobot/eventbus/PendingPost;
    if-nez v0, :cond_2

    .line 58
    monitor-enter p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 60
    :try_start_1
    iget-object v6, p0, Lorg/greenrobot/eventbus/HandlerPoster;->queue:Lorg/greenrobot/eventbus/PendingPostQueue;

    invoke-virtual {v6}, Lorg/greenrobot/eventbus/PendingPostQueue;->poll()Lorg/greenrobot/eventbus/PendingPost;

    move-result-object v0

    .line 61
    if-nez v0, :cond_1

    .line 62
    const/4 v6, 0x0

    iput-boolean v6, p0, Lorg/greenrobot/eventbus/HandlerPoster;->handlerActive:Z

    .line 63
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 78
    iput-boolean v1, p0, Lorg/greenrobot/eventbus/HandlerPoster;->handlerActive:Z

    .line 74
    :goto_0
    return-void

    .line 65
    :cond_1
    :try_start_2
    monitor-exit p0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 67
    :cond_2
    :try_start_3
    iget-object v6, p0, Lorg/greenrobot/eventbus/HandlerPoster;->eventBus:Lorg/greenrobot/eventbus/EventBus;

    invoke-virtual {v6, v0}, Lorg/greenrobot/eventbus/EventBus;->invokeSubscriber(Lorg/greenrobot/eventbus/PendingPost;)V

    .line 68
    invoke-static {}, Landroid/os/SystemClock;->uptimeMillis()J

    move-result-wide v6

    sub-long v4, v6, v2

    .line 69
    .local v4, "timeInMethod":J
    iget v6, p0, Lorg/greenrobot/eventbus/HandlerPoster;->maxMillisInsideHandleMessage:I

    int-to-long v6, v6

    cmp-long v6, v4, v6

    if-ltz v6, :cond_0

    .line 70
    invoke-virtual {p0}, Lorg/greenrobot/eventbus/HandlerPoster;->obtainMessage()Landroid/os/Message;

    move-result-object v6

    invoke-virtual {p0, v6}, Lorg/greenrobot/eventbus/HandlerPoster;->sendMessage(Landroid/os/Message;)Z

    move-result v6

    if-nez v6, :cond_3

    .line 71
    new-instance v6, Lorg/greenrobot/eventbus/EventBusException;

    const-string v7, "Could not send handler message"

    invoke-direct {v6, v7}, Lorg/greenrobot/eventbus/EventBusException;-><init>(Ljava/lang/String;)V

    throw v6
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 78
    .end local v0    # "pendingPost":Lorg/greenrobot/eventbus/PendingPost;
    .end local v2    # "started":J
    .end local v4    # "timeInMethod":J
    :catchall_0
    move-exception v6

    iput-boolean v1, p0, Lorg/greenrobot/eventbus/HandlerPoster;->handlerActive:Z

    throw v6

    .line 65
    .restart local v0    # "pendingPost":Lorg/greenrobot/eventbus/PendingPost;
    .restart local v2    # "started":J
    :catchall_1
    move-exception v6

    :try_start_4
    monitor-exit p0
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    :try_start_5
    throw v6
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    .line 73
    .restart local v4    # "timeInMethod":J
    :cond_3
    const/4 v1, 0x1

    .line 78
    iput-boolean v1, p0, Lorg/greenrobot/eventbus/HandlerPoster;->handlerActive:Z

    goto :goto_0
.end method
