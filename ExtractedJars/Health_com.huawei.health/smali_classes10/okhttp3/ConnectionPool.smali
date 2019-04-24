.class public final Lokhttp3/ConnectionPool;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field static final synthetic $assertionsDisabled:Z

.field private static final executor:Ljava/util/concurrent/Executor;


# instance fields
.field private final cleanupRunnable:Ljava/lang/Runnable;

.field cleanupRunning:Z

.field private final connections:Ljava/util/Deque;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Deque<Lokhttp3/internal/io/RealConnection;>;"
        }
    .end annotation
.end field

.field private final keepAliveDurationNs:J

.field private final maxIdleConnections:I

.field final routeDatabase:Lokhttp3/internal/RouteDatabase;


# direct methods
.method static constructor <clinit>()V
    .locals 8

    .line 42
    const-class v0, Lokhttp3/ConnectionPool;

    invoke-virtual {v0}, Ljava/lang/Class;->desiredAssertionStatus()Z

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    sput-boolean v0, Lokhttp3/ConnectionPool;->$assertionsDisabled:Z

    .line 48
    new-instance v0, Ljava/util/concurrent/ThreadPoolExecutor;

    sget-object v5, Ljava/util/concurrent/TimeUnit;->SECONDS:Ljava/util/concurrent/TimeUnit;

    new-instance v6, Ljava/util/concurrent/SynchronousQueue;

    invoke-direct {v6}, Ljava/util/concurrent/SynchronousQueue;-><init>()V

    const-string v1, "OkHttp ConnectionPool"

    .line 50
    const/4 v2, 0x1

    invoke-static {v1, v2}, Lokhttp3/internal/Util;->threadFactory(Ljava/lang/String;Z)Ljava/util/concurrent/ThreadFactory;

    move-result-object v7

    const/4 v1, 0x0

    const v2, 0x7fffffff

    const-wide/16 v3, 0x3c

    invoke-direct/range {v0 .. v7}, Ljava/util/concurrent/ThreadPoolExecutor;-><init>(IIJLjava/util/concurrent/TimeUnit;Ljava/util/concurrent/BlockingQueue;Ljava/util/concurrent/ThreadFactory;)V

    sput-object v0, Lokhttp3/ConnectionPool;->executor:Ljava/util/concurrent/Executor;

    .line 48
    return-void
.end method

.method public constructor <init>()V
    .locals 4

    .line 84
    sget-object v0, Ljava/util/concurrent/TimeUnit;->MINUTES:Ljava/util/concurrent/TimeUnit;

    const/4 v1, 0x5

    const-wide/16 v2, 0x5

    invoke-direct {p0, v1, v2, v3, v0}, Lokhttp3/ConnectionPool;-><init>(IJLjava/util/concurrent/TimeUnit;)V

    .line 85
    return-void
.end method

.method public constructor <init>(IJLjava/util/concurrent/TimeUnit;)V
    .locals 3

    .line 87
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 55
    new-instance v0, Lokhttp3/ConnectionPool$1;

    invoke-direct {v0, p0}, Lokhttp3/ConnectionPool$1;-><init>(Lokhttp3/ConnectionPool;)V

    iput-object v0, p0, Lokhttp3/ConnectionPool;->cleanupRunnable:Ljava/lang/Runnable;

    .line 74
    new-instance v0, Ljava/util/ArrayDeque;

    invoke-direct {v0}, Ljava/util/ArrayDeque;-><init>()V

    iput-object v0, p0, Lokhttp3/ConnectionPool;->connections:Ljava/util/Deque;

    .line 75
    new-instance v0, Lokhttp3/internal/RouteDatabase;

    invoke-direct {v0}, Lokhttp3/internal/RouteDatabase;-><init>()V

    iput-object v0, p0, Lokhttp3/ConnectionPool;->routeDatabase:Lokhttp3/internal/RouteDatabase;

    .line 88
    iput p1, p0, Lokhttp3/ConnectionPool;->maxIdleConnections:I

    .line 89
    invoke-virtual {p4, p2, p3}, Ljava/util/concurrent/TimeUnit;->toNanos(J)J

    move-result-wide v0

    iput-wide v0, p0, Lokhttp3/ConnectionPool;->keepAliveDurationNs:J

    .line 92
    const-wide/16 v0, 0x0

    cmp-long v0, p2, v0

    if-gtz v0, :cond_0

    .line 93
    new-instance v0, Ljava/lang/IllegalArgumentException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "keepAliveDuration <= 0: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p2, p3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 95
    :cond_0
    return-void
.end method

.method private pruneAndGetAllocationCount(Lokhttp3/internal/io/RealConnection;J)I
    .locals 6

    .line 238
    iget-object v3, p1, Lokhttp3/internal/io/RealConnection;->allocations:Ljava/util/List;

    .line 239
    const/4 v4, 0x0

    :goto_0
    invoke-interface {v3}, Ljava/util/List;->size()I

    move-result v0

    if-ge v4, v0, :cond_2

    .line 240
    invoke-interface {v3, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object v5, v0

    check-cast v5, Ljava/lang/ref/Reference;

    .line 242
    invoke-virtual {v5}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 243
    add-int/lit8 v4, v4, 0x1

    .line 244
    goto :goto_0

    .line 248
    :cond_0
    sget-object v0, Lokhttp3/internal/Internal;->logger:Ljava/util/logging/Logger;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "A connection to "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {p1}, Lokhttp3/internal/io/RealConnection;->route()Lokhttp3/Route;

    move-result-object v2

    invoke-virtual {v2}, Lokhttp3/Route;->address()Lokhttp3/Address;

    move-result-object v2

    invoke-virtual {v2}, Lokhttp3/Address;->url()Lokhttp3/HttpUrl;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, " was leaked. Did you forget to close a response body?"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/logging/Logger;->warning(Ljava/lang/String;)V

    .line 250
    invoke-interface {v3, v4}, Ljava/util/List;->remove(I)Ljava/lang/Object;

    .line 251
    const/4 v0, 0x1

    iput-boolean v0, p1, Lokhttp3/internal/io/RealConnection;->noNewStreams:Z

    .line 254
    invoke-interface {v3}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 255
    iget-wide v0, p0, Lokhttp3/ConnectionPool;->keepAliveDurationNs:J

    sub-long v0, p2, v0

    iput-wide v0, p1, Lokhttp3/internal/io/RealConnection;->idleAtNanos:J

    .line 256
    const/4 v0, 0x0

    return v0

    .line 258
    :cond_1
    goto :goto_0

    .line 260
    :cond_2
    invoke-interface {v3}, Ljava/util/List;->size()I

    move-result v0

    return v0
.end method


# virtual methods
.method cleanup(J)J
    .locals 13

    .line 181
    const/4 v2, 0x0

    .line 182
    const/4 v3, 0x0

    .line 183
    const/4 v4, 0x0

    .line 184
    const-wide/high16 v5, -0x8000000000000000L

    .line 187
    move-object v7, p0

    monitor-enter v7

    .line 188
    :try_start_0
    iget-object v0, p0, Lokhttp3/ConnectionPool;->connections:Ljava/util/Deque;

    invoke-interface {v0}, Ljava/util/Deque;->iterator()Ljava/util/Iterator;

    move-result-object v8

    :goto_0
    invoke-interface {v8}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 189
    invoke-interface {v8}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v9, v0

    check-cast v9, Lokhttp3/internal/io/RealConnection;

    .line 192
    invoke-direct {p0, v9, p1, p2}, Lokhttp3/ConnectionPool;->pruneAndGetAllocationCount(Lokhttp3/internal/io/RealConnection;J)I

    move-result v0

    if-lez v0, :cond_0

    .line 193
    add-int/lit8 v2, v2, 0x1

    .line 194
    goto :goto_0

    .line 197
    :cond_0
    add-int/lit8 v3, v3, 0x1

    .line 200
    iget-wide v0, v9, Lokhttp3/internal/io/RealConnection;->idleAtNanos:J

    sub-long v10, p1, v0

    .line 201
    cmp-long v0, v10, v5

    if-lez v0, :cond_1

    .line 202
    move-wide v5, v10

    .line 203
    move-object v4, v9

    .line 205
    :cond_1
    goto :goto_0

    .line 207
    :cond_2
    iget-wide v0, p0, Lokhttp3/ConnectionPool;->keepAliveDurationNs:J

    cmp-long v0, v5, v0

    if-gez v0, :cond_3

    iget v0, p0, Lokhttp3/ConnectionPool;->maxIdleConnections:I

    if-le v3, v0, :cond_4

    .line 211
    :cond_3
    iget-object v0, p0, Lokhttp3/ConnectionPool;->connections:Ljava/util/Deque;

    invoke-interface {v0, v4}, Ljava/util/Deque;->remove(Ljava/lang/Object;)Z

    goto :goto_1

    .line 212
    :cond_4
    if-lez v3, :cond_5

    .line 214
    iget-wide v0, p0, Lokhttp3/ConnectionPool;->keepAliveDurationNs:J
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    sub-long/2addr v0, v5

    monitor-exit v7

    return-wide v0

    .line 215
    :cond_5
    if-lez v2, :cond_6

    .line 217
    :try_start_1
    iget-wide v0, p0, Lokhttp3/ConnectionPool;->keepAliveDurationNs:J
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    monitor-exit v7

    return-wide v0

    .line 220
    :cond_6
    const/4 v0, 0x0

    :try_start_2
    iput-boolean v0, p0, Lokhttp3/ConnectionPool;->cleanupRunning:Z
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 221
    monitor-exit v7

    const-wide/16 v0, -0x1

    return-wide v0

    .line 223
    :goto_1
    monitor-exit v7

    goto :goto_2

    :catchall_0
    move-exception v12

    monitor-exit v7

    throw v12

    .line 225
    :goto_2
    invoke-virtual {v4}, Lokhttp3/internal/io/RealConnection;->socket()Ljava/net/Socket;

    move-result-object v0

    invoke-static {v0}, Lokhttp3/internal/Util;->closeQuietly(Ljava/net/Socket;)V

    .line 228
    const-wide/16 v0, 0x0

    return-wide v0
.end method

.method connectionBecameIdle(Lokhttp3/internal/io/RealConnection;)Z
    .locals 1

    .line 144
    sget-boolean v0, Lokhttp3/ConnectionPool;->$assertionsDisabled:Z

    if-nez v0, :cond_0

    invoke-static {p0}, Ljava/lang/Thread;->holdsLock(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    new-instance v0, Ljava/lang/AssertionError;

    invoke-direct {v0}, Ljava/lang/AssertionError;-><init>()V

    throw v0

    .line 145
    :cond_0
    iget-boolean v0, p1, Lokhttp3/internal/io/RealConnection;->noNewStreams:Z

    if-nez v0, :cond_1

    iget v0, p0, Lokhttp3/ConnectionPool;->maxIdleConnections:I

    if-nez v0, :cond_2

    .line 146
    :cond_1
    iget-object v0, p0, Lokhttp3/ConnectionPool;->connections:Ljava/util/Deque;

    invoke-interface {v0, p1}, Ljava/util/Deque;->remove(Ljava/lang/Object;)Z

    .line 147
    const/4 v0, 0x1

    return v0

    .line 149
    :cond_2
    invoke-virtual {p0}, Ljava/lang/Object;->notifyAll()V

    .line 150
    const/4 v0, 0x0

    return v0
.end method

.method public declared-synchronized connectionCount()I
    .locals 2

    monitor-enter p0

    .line 113
    :try_start_0
    iget-object v0, p0, Lokhttp3/ConnectionPool;->connections:Ljava/util/Deque;

    invoke-interface {v0}, Ljava/util/Deque;->size()I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-result v0

    monitor-exit p0

    return v0

    :catchall_0
    move-exception v1

    monitor-exit p0

    throw v1
.end method

.method public evictAll()V
    .locals 6

    .line 156
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 157
    move-object v2, p0

    monitor-enter v2

    .line 158
    :try_start_0
    iget-object v0, p0, Lokhttp3/ConnectionPool;->connections:Ljava/util/Deque;

    invoke-interface {v0}, Ljava/util/Deque;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :goto_0
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 159
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Lokhttp3/internal/io/RealConnection;

    .line 160
    iget-object v0, v4, Lokhttp3/internal/io/RealConnection;->allocations:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 161
    const/4 v0, 0x1

    iput-boolean v0, v4, Lokhttp3/internal/io/RealConnection;->noNewStreams:Z

    .line 162
    invoke-interface {v1, v4}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 163
    invoke-interface {v3}, Ljava/util/Iterator;->remove()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 165
    :cond_0
    goto :goto_0

    .line 166
    :cond_1
    monitor-exit v2

    goto :goto_1

    :catchall_0
    move-exception v5

    monitor-exit v2

    throw v5

    .line 168
    :goto_1
    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_2
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v3, v0

    check-cast v3, Lokhttp3/internal/io/RealConnection;

    .line 169
    invoke-virtual {v3}, Lokhttp3/internal/io/RealConnection;->socket()Ljava/net/Socket;

    move-result-object v0

    invoke-static {v0}, Lokhttp3/internal/Util;->closeQuietly(Ljava/net/Socket;)V

    .line 170
    goto :goto_2

    .line 171
    :cond_2
    return-void
.end method

.method get(Lokhttp3/Address;Lokhttp3/internal/http/StreamAllocation;)Lokhttp3/internal/io/RealConnection;
    .locals 4

    .line 118
    sget-boolean v0, Lokhttp3/ConnectionPool;->$assertionsDisabled:Z

    if-nez v0, :cond_0

    invoke-static {p0}, Ljava/lang/Thread;->holdsLock(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    new-instance v0, Ljava/lang/AssertionError;

    invoke-direct {v0}, Ljava/lang/AssertionError;-><init>()V

    throw v0

    .line 119
    :cond_0
    iget-object v0, p0, Lokhttp3/ConnectionPool;->connections:Ljava/util/Deque;

    invoke-interface {v0}, Ljava/util/Deque;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v3, v0

    check-cast v3, Lokhttp3/internal/io/RealConnection;

    .line 120
    iget-object v0, v3, Lokhttp3/internal/io/RealConnection;->allocations:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    iget v1, v3, Lokhttp3/internal/io/RealConnection;->allocationLimit:I

    if-ge v0, v1, :cond_1

    .line 121
    invoke-virtual {v3}, Lokhttp3/internal/io/RealConnection;->route()Lokhttp3/Route;

    move-result-object v0

    iget-object v0, v0, Lokhttp3/Route;->address:Lokhttp3/Address;

    invoke-virtual {p1, v0}, Lokhttp3/Address;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    iget-boolean v0, v3, Lokhttp3/internal/io/RealConnection;->noNewStreams:Z

    if-nez v0, :cond_1

    .line 123
    invoke-virtual {p2, v3}, Lokhttp3/internal/http/StreamAllocation;->acquire(Lokhttp3/internal/io/RealConnection;)V

    .line 124
    return-object v3

    .line 126
    :cond_1
    goto :goto_0

    .line 127
    :cond_2
    const/4 v0, 0x0

    return-object v0
.end method

.method public declared-synchronized idleConnectionCount()I
    .locals 4

    monitor-enter p0

    .line 99
    const/4 v1, 0x0

    .line 100
    :try_start_0
    iget-object v0, p0, Lokhttp3/ConnectionPool;->connections:Ljava/util/Deque;

    invoke-interface {v0}, Ljava/util/Deque;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v3, v0

    check-cast v3, Lokhttp3/internal/io/RealConnection;

    .line 101
    iget-object v0, v3, Lokhttp3/internal/io/RealConnection;->allocations:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-result v0

    if-eqz v0, :cond_0

    add-int/lit8 v1, v1, 0x1

    .line 102
    :cond_0
    goto :goto_0

    .line 103
    :cond_1
    monitor-exit p0

    return v1

    :catchall_0
    move-exception v1

    monitor-exit p0

    throw v1
.end method

.method put(Lokhttp3/internal/io/RealConnection;)V
    .locals 2

    .line 131
    sget-boolean v0, Lokhttp3/ConnectionPool;->$assertionsDisabled:Z

    if-nez v0, :cond_0

    invoke-static {p0}, Ljava/lang/Thread;->holdsLock(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    new-instance v0, Ljava/lang/AssertionError;

    invoke-direct {v0}, Ljava/lang/AssertionError;-><init>()V

    throw v0

    .line 132
    :cond_0
    iget-boolean v0, p0, Lokhttp3/ConnectionPool;->cleanupRunning:Z

    if-nez v0, :cond_1

    .line 133
    const/4 v0, 0x1

    iput-boolean v0, p0, Lokhttp3/ConnectionPool;->cleanupRunning:Z

    .line 134
    sget-object v0, Lokhttp3/ConnectionPool;->executor:Ljava/util/concurrent/Executor;

    iget-object v1, p0, Lokhttp3/ConnectionPool;->cleanupRunnable:Ljava/lang/Runnable;

    invoke-interface {v0, v1}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    .line 136
    :cond_1
    iget-object v0, p0, Lokhttp3/ConnectionPool;->connections:Ljava/util/Deque;

    invoke-interface {v0, p1}, Ljava/util/Deque;->add(Ljava/lang/Object;)Z

    .line 137
    return-void
.end method
