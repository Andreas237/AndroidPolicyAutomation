.class public Lcom/twitter/sdk/android/core/internal/AuthRequestQueue;
.super Ljava/lang/Object;
.source "AuthRequestQueue.java"


# instance fields
.field final awaitingSession:Ljava/util/concurrent/atomic/AtomicBoolean;

.field final queue:Ljava/util/Queue;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Queue<",
            "Lcom/twitter/sdk/android/core/Callback<",
            "Lcom/twitter/sdk/android/core/Session;",
            ">;>;"
        }
    .end annotation
.end field

.field private final sessionProvider:Lcom/twitter/sdk/android/core/internal/SessionProvider;


# direct methods
.method public constructor <init>(Lcom/twitter/sdk/android/core/internal/SessionProvider;)V
    .locals 1

    .line 44
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 45
    iput-object p1, p0, Lcom/twitter/sdk/android/core/internal/AuthRequestQueue;->sessionProvider:Lcom/twitter/sdk/android/core/internal/SessionProvider;

    .line 46
    new-instance p1, Ljava/util/concurrent/ConcurrentLinkedQueue;

    invoke-direct {p1}, Ljava/util/concurrent/ConcurrentLinkedQueue;-><init>()V

    iput-object p1, p0, Lcom/twitter/sdk/android/core/internal/AuthRequestQueue;->queue:Ljava/util/Queue;

    .line 47
    new-instance p1, Ljava/util/concurrent/atomic/AtomicBoolean;

    const/4 v0, 0x1

    invoke-direct {p1, v0}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>(Z)V

    iput-object p1, p0, Lcom/twitter/sdk/android/core/internal/AuthRequestQueue;->awaitingSession:Ljava/util/concurrent/atomic/AtomicBoolean;

    return-void
.end method


# virtual methods
.method public declared-synchronized addRequest(Lcom/twitter/sdk/android/core/Callback;)Z
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/twitter/sdk/android/core/Callback<",
            "Lcom/twitter/sdk/android/core/Session;",
            ">;)Z"
        }
    .end annotation

    monitor-enter p0

    if-nez p1, :cond_0

    const/4 p1, 0x0

    .line 63
    monitor-exit p0

    return p1

    .line 66
    :cond_0
    :try_start_0
    iget-object v0, p0, Lcom/twitter/sdk/android/core/internal/AuthRequestQueue;->awaitingSession:Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    move-result v0

    const/4 v1, 0x1

    if-nez v0, :cond_2

    .line 67
    invoke-virtual {p0}, Lcom/twitter/sdk/android/core/internal/AuthRequestQueue;->getValidSession()Lcom/twitter/sdk/android/core/Session;

    move-result-object v0

    if-eqz v0, :cond_1

    .line 69
    new-instance v2, Lcom/twitter/sdk/android/core/Result;

    const/4 v3, 0x0

    invoke-direct {v2, v0, v3}, Lcom/twitter/sdk/android/core/Result;-><init>(Ljava/lang/Object;Lretrofit/client/Response;)V

    invoke-virtual {p1, v2}, Lcom/twitter/sdk/android/core/Callback;->success(Lcom/twitter/sdk/android/core/Result;)V

    goto :goto_0

    .line 71
    :cond_1
    iget-object v0, p0, Lcom/twitter/sdk/android/core/internal/AuthRequestQueue;->queue:Ljava/util/Queue;

    invoke-interface {v0, p1}, Ljava/util/Queue;->add(Ljava/lang/Object;)Z

    .line 72
    iget-object p1, p0, Lcom/twitter/sdk/android/core/internal/AuthRequestQueue;->awaitingSession:Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-virtual {p1, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    .line 73
    invoke-virtual {p0}, Lcom/twitter/sdk/android/core/internal/AuthRequestQueue;->requestAuth()V

    goto :goto_0

    .line 76
    :cond_2
    iget-object v0, p0, Lcom/twitter/sdk/android/core/internal/AuthRequestQueue;->queue:Ljava/util/Queue;

    invoke-interface {v0, p1}, Ljava/util/Queue;->add(Ljava/lang/Object;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 78
    :goto_0
    monitor-exit p0

    return v1

    :catchall_0
    move-exception p1

    monitor-exit p0

    throw p1
.end method

.method declared-synchronized flushQueueOnError(Lcom/twitter/sdk/android/core/TwitterException;)V
    .locals 2

    monitor-enter p0

    .line 130
    :try_start_0
    iget-object v0, p0, Lcom/twitter/sdk/android/core/internal/AuthRequestQueue;->awaitingSession:Ljava/util/concurrent/atomic/AtomicBoolean;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    .line 132
    :goto_0
    iget-object v0, p0, Lcom/twitter/sdk/android/core/internal/AuthRequestQueue;->queue:Ljava/util/Queue;

    invoke-interface {v0}, Ljava/util/Queue;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_0

    .line 133
    iget-object v0, p0, Lcom/twitter/sdk/android/core/internal/AuthRequestQueue;->queue:Ljava/util/Queue;

    invoke-interface {v0}, Ljava/util/Queue;->poll()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/twitter/sdk/android/core/Callback;

    .line 134
    invoke-virtual {v0, p1}, Lcom/twitter/sdk/android/core/Callback;->failure(Lcom/twitter/sdk/android/core/TwitterException;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    .line 136
    :cond_0
    monitor-exit p0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit p0

    throw p1
.end method

.method declared-synchronized flushQueueOnSuccess(Lcom/twitter/sdk/android/core/Session;)V
    .locals 3

    monitor-enter p0

    .line 117
    :try_start_0
    iget-object v0, p0, Lcom/twitter/sdk/android/core/internal/AuthRequestQueue;->awaitingSession:Ljava/util/concurrent/atomic/AtomicBoolean;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    .line 119
    :goto_0
    iget-object v0, p0, Lcom/twitter/sdk/android/core/internal/AuthRequestQueue;->queue:Ljava/util/Queue;

    invoke-interface {v0}, Ljava/util/Queue;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_0

    .line 120
    iget-object v0, p0, Lcom/twitter/sdk/android/core/internal/AuthRequestQueue;->queue:Ljava/util/Queue;

    invoke-interface {v0}, Ljava/util/Queue;->poll()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/twitter/sdk/android/core/Callback;

    .line 121
    new-instance v1, Lcom/twitter/sdk/android/core/Result;

    const/4 v2, 0x0

    invoke-direct {v1, p1, v2}, Lcom/twitter/sdk/android/core/Result;-><init>(Ljava/lang/Object;Lretrofit/client/Response;)V

    invoke-virtual {v0, v1}, Lcom/twitter/sdk/android/core/Callback;->success(Lcom/twitter/sdk/android/core/Result;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    .line 123
    :cond_0
    monitor-exit p0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit p0

    throw p1
.end method

.method getValidSession()Lcom/twitter/sdk/android/core/Session;
    .locals 2

    .line 140
    iget-object v0, p0, Lcom/twitter/sdk/android/core/internal/AuthRequestQueue;->sessionProvider:Lcom/twitter/sdk/android/core/internal/SessionProvider;

    invoke-virtual {v0}, Lcom/twitter/sdk/android/core/internal/SessionProvider;->getActiveSession()Lcom/twitter/sdk/android/core/Session;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 142
    invoke-virtual {v0}, Lcom/twitter/sdk/android/core/Session;->getAuthToken()Lcom/twitter/sdk/android/core/AuthToken;

    move-result-object v1

    if-eqz v1, :cond_0

    invoke-virtual {v0}, Lcom/twitter/sdk/android/core/Session;->getAuthToken()Lcom/twitter/sdk/android/core/AuthToken;

    move-result-object v1

    invoke-virtual {v1}, Lcom/twitter/sdk/android/core/AuthToken;->isExpired()Z

    move-result v1

    if-nez v1, :cond_0

    return-object v0

    :cond_0
    const/4 v0, 0x0

    return-object v0
.end method

.method requestAuth()V
    .locals 2

    .line 100
    iget-object v0, p0, Lcom/twitter/sdk/android/core/internal/AuthRequestQueue;->sessionProvider:Lcom/twitter/sdk/android/core/internal/SessionProvider;

    new-instance v1, Lcom/twitter/sdk/android/core/internal/AuthRequestQueue$1;

    invoke-direct {v1, p0}, Lcom/twitter/sdk/android/core/internal/AuthRequestQueue$1;-><init>(Lcom/twitter/sdk/android/core/internal/AuthRequestQueue;)V

    invoke-virtual {v0, v1}, Lcom/twitter/sdk/android/core/internal/SessionProvider;->requestAuth(Lcom/twitter/sdk/android/core/Callback;)V

    return-void
.end method

.method public declared-synchronized sessionRestored(Lcom/twitter/sdk/android/core/Session;)V
    .locals 1

    monitor-enter p0

    if-eqz p1, :cond_0

    .line 90
    :try_start_0
    invoke-virtual {p0, p1}, Lcom/twitter/sdk/android/core/internal/AuthRequestQueue;->flushQueueOnSuccess(Lcom/twitter/sdk/android/core/Session;)V

    goto :goto_0

    .line 91
    :cond_0
    iget-object p1, p0, Lcom/twitter/sdk/android/core/internal/AuthRequestQueue;->queue:Ljava/util/Queue;

    invoke-interface {p1}, Ljava/util/Queue;->size()I

    move-result p1

    if-lez p1, :cond_1

    .line 92
    invoke-virtual {p0}, Lcom/twitter/sdk/android/core/internal/AuthRequestQueue;->requestAuth()V

    goto :goto_0

    .line 95
    :cond_1
    iget-object p1, p0, Lcom/twitter/sdk/android/core/internal/AuthRequestQueue;->awaitingSession:Ljava/util/concurrent/atomic/AtomicBoolean;

    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 97
    :goto_0
    monitor-exit p0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit p0

    throw p1
.end method
