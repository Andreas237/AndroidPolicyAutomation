.class public final Lokhttp3/internal/http/StreamAllocation;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final address:Lokhttp3/Address;

.field private canceled:Z

.field private connection:Lokhttp3/internal/io/RealConnection;

.field private final connectionPool:Lokhttp3/ConnectionPool;

.field private released:Z

.field private route:Lokhttp3/Route;

.field private routeSelector:Lokhttp3/internal/http/RouteSelector;

.field private stream:Lokhttp3/internal/http/HttpStream;


# direct methods
.method public constructor <init>(Lokhttp3/ConnectionPool;Lokhttp3/Address;)V
    .locals 2

    .line 87
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 88
    iput-object p1, p0, Lokhttp3/internal/http/StreamAllocation;->connectionPool:Lokhttp3/ConnectionPool;

    .line 89
    iput-object p2, p0, Lokhttp3/internal/http/StreamAllocation;->address:Lokhttp3/Address;

    .line 90
    new-instance v0, Lokhttp3/internal/http/RouteSelector;

    invoke-direct {p0}, Lokhttp3/internal/http/StreamAllocation;->routeDatabase()Lokhttp3/internal/RouteDatabase;

    move-result-object v1

    invoke-direct {v0, p2, v1}, Lokhttp3/internal/http/RouteSelector;-><init>(Lokhttp3/Address;Lokhttp3/internal/RouteDatabase;)V

    iput-object v0, p0, Lokhttp3/internal/http/StreamAllocation;->routeSelector:Lokhttp3/internal/http/RouteSelector;

    .line 91
    return-void
.end method

.method private deallocate(ZZZ)V
    .locals 6

    .line 235
    const/4 v3, 0x0

    .line 236
    iget-object v4, p0, Lokhttp3/internal/http/StreamAllocation;->connectionPool:Lokhttp3/ConnectionPool;

    monitor-enter v4

    .line 237
    if-eqz p3, :cond_0

    .line 238
    const/4 v0, 0x0

    :try_start_0
    iput-object v0, p0, Lokhttp3/internal/http/StreamAllocation;->stream:Lokhttp3/internal/http/HttpStream;

    .line 240
    :cond_0
    if-eqz p2, :cond_1

    .line 241
    const/4 v0, 0x1

    iput-boolean v0, p0, Lokhttp3/internal/http/StreamAllocation;->released:Z

    .line 243
    :cond_1
    iget-object v0, p0, Lokhttp3/internal/http/StreamAllocation;->connection:Lokhttp3/internal/io/RealConnection;

    if-eqz v0, :cond_5

    .line 244
    if-eqz p1, :cond_2

    .line 245
    iget-object v0, p0, Lokhttp3/internal/http/StreamAllocation;->connection:Lokhttp3/internal/io/RealConnection;

    const/4 v1, 0x1

    iput-boolean v1, v0, Lokhttp3/internal/io/RealConnection;->noNewStreams:Z

    .line 247
    :cond_2
    iget-object v0, p0, Lokhttp3/internal/http/StreamAllocation;->stream:Lokhttp3/internal/http/HttpStream;

    if-nez v0, :cond_5

    iget-boolean v0, p0, Lokhttp3/internal/http/StreamAllocation;->released:Z

    if-nez v0, :cond_3

    iget-object v0, p0, Lokhttp3/internal/http/StreamAllocation;->connection:Lokhttp3/internal/io/RealConnection;

    iget-boolean v0, v0, Lokhttp3/internal/io/RealConnection;->noNewStreams:Z

    if-eqz v0, :cond_5

    .line 248
    :cond_3
    iget-object v0, p0, Lokhttp3/internal/http/StreamAllocation;->connection:Lokhttp3/internal/io/RealConnection;

    invoke-direct {p0, v0}, Lokhttp3/internal/http/StreamAllocation;->release(Lokhttp3/internal/io/RealConnection;)V

    .line 249
    iget-object v0, p0, Lokhttp3/internal/http/StreamAllocation;->connection:Lokhttp3/internal/io/RealConnection;

    iget-object v0, v0, Lokhttp3/internal/io/RealConnection;->allocations:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_4

    .line 250
    iget-object v0, p0, Lokhttp3/internal/http/StreamAllocation;->connection:Lokhttp3/internal/io/RealConnection;

    invoke-static {}, Ljava/lang/System;->nanoTime()J

    move-result-wide v1

    iput-wide v1, v0, Lokhttp3/internal/io/RealConnection;->idleAtNanos:J

    .line 251
    sget-object v0, Lokhttp3/internal/Internal;->instance:Lokhttp3/internal/Internal;

    iget-object v1, p0, Lokhttp3/internal/http/StreamAllocation;->connectionPool:Lokhttp3/ConnectionPool;

    iget-object v2, p0, Lokhttp3/internal/http/StreamAllocation;->connection:Lokhttp3/internal/io/RealConnection;

    invoke-virtual {v0, v1, v2}, Lokhttp3/internal/Internal;->connectionBecameIdle(Lokhttp3/ConnectionPool;Lokhttp3/internal/io/RealConnection;)Z

    move-result v0

    if-eqz v0, :cond_4

    .line 252
    iget-object v3, p0, Lokhttp3/internal/http/StreamAllocation;->connection:Lokhttp3/internal/io/RealConnection;

    .line 255
    :cond_4
    const/4 v0, 0x0

    iput-object v0, p0, Lokhttp3/internal/http/StreamAllocation;->connection:Lokhttp3/internal/io/RealConnection;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 258
    :cond_5
    monitor-exit v4

    goto :goto_0

    :catchall_0
    move-exception v5

    monitor-exit v4

    throw v5

    .line 259
    :goto_0
    if-eqz v3, :cond_6

    .line 260
    invoke-virtual {v3}, Lokhttp3/internal/io/RealConnection;->socket()Ljava/net/Socket;

    move-result-object v0

    invoke-static {v0}, Lokhttp3/internal/Util;->closeQuietly(Ljava/net/Socket;)V

    .line 262
    :cond_6
    return-void
.end method

.method private findConnection(IIIZ)Lokhttp3/internal/io/RealConnection;
    .locals 13
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;,
            Lokhttp3/internal/http/RouteException;
        }
    .end annotation

    .line 153
    iget-object v7, p0, Lokhttp3/internal/http/StreamAllocation;->connectionPool:Lokhttp3/ConnectionPool;

    monitor-enter v7

    .line 154
    :try_start_0
    iget-boolean v0, p0, Lokhttp3/internal/http/StreamAllocation;->released:Z

    if-eqz v0, :cond_0

    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "released"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 155
    :cond_0
    iget-object v0, p0, Lokhttp3/internal/http/StreamAllocation;->stream:Lokhttp3/internal/http/HttpStream;

    if-eqz v0, :cond_1

    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "stream != null"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 156
    :cond_1
    iget-boolean v0, p0, Lokhttp3/internal/http/StreamAllocation;->canceled:Z

    if-eqz v0, :cond_2

    new-instance v0, Ljava/io/IOException;

    const-string v1, "Canceled"

    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 158
    :cond_2
    iget-object v8, p0, Lokhttp3/internal/http/StreamAllocation;->connection:Lokhttp3/internal/io/RealConnection;

    .line 159
    if-eqz v8, :cond_3

    iget-boolean v0, v8, Lokhttp3/internal/io/RealConnection;->noNewStreams:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-nez v0, :cond_3

    .line 160
    monitor-exit v7

    return-object v8

    .line 164
    :cond_3
    :try_start_1
    sget-object v0, Lokhttp3/internal/Internal;->instance:Lokhttp3/internal/Internal;

    iget-object v1, p0, Lokhttp3/internal/http/StreamAllocation;->connectionPool:Lokhttp3/ConnectionPool;

    iget-object v2, p0, Lokhttp3/internal/http/StreamAllocation;->address:Lokhttp3/Address;

    invoke-virtual {v0, v1, v2, p0}, Lokhttp3/internal/Internal;->get(Lokhttp3/ConnectionPool;Lokhttp3/Address;Lokhttp3/internal/http/StreamAllocation;)Lokhttp3/internal/io/RealConnection;

    move-result-object v9

    .line 165
    if-eqz v9, :cond_4

    .line 166
    iput-object v9, p0, Lokhttp3/internal/http/StreamAllocation;->connection:Lokhttp3/internal/io/RealConnection;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 167
    monitor-exit v7

    return-object v9

    .line 170
    :cond_4
    :try_start_2
    iget-object v6, p0, Lokhttp3/internal/http/StreamAllocation;->route:Lokhttp3/Route;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 171
    monitor-exit v7

    goto :goto_0

    :catchall_0
    move-exception v10

    monitor-exit v7

    throw v10

    .line 173
    :goto_0
    if-nez v6, :cond_5

    .line 174
    iget-object v0, p0, Lokhttp3/internal/http/StreamAllocation;->routeSelector:Lokhttp3/internal/http/RouteSelector;

    invoke-virtual {v0}, Lokhttp3/internal/http/RouteSelector;->next()Lokhttp3/Route;

    move-result-object v6

    .line 175
    iget-object v7, p0, Lokhttp3/internal/http/StreamAllocation;->connectionPool:Lokhttp3/ConnectionPool;

    monitor-enter v7

    .line 176
    :try_start_3
    iput-object v6, p0, Lokhttp3/internal/http/StreamAllocation;->route:Lokhttp3/Route;
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 177
    monitor-exit v7

    goto :goto_1

    :catchall_1
    move-exception v11

    monitor-exit v7

    throw v11

    .line 179
    :cond_5
    :goto_1
    new-instance v7, Lokhttp3/internal/io/RealConnection;

    invoke-direct {v7, v6}, Lokhttp3/internal/io/RealConnection;-><init>(Lokhttp3/Route;)V

    .line 180
    invoke-virtual {p0, v7}, Lokhttp3/internal/http/StreamAllocation;->acquire(Lokhttp3/internal/io/RealConnection;)V

    .line 182
    iget-object v8, p0, Lokhttp3/internal/http/StreamAllocation;->connectionPool:Lokhttp3/ConnectionPool;

    monitor-enter v8

    .line 183
    :try_start_4
    sget-object v0, Lokhttp3/internal/Internal;->instance:Lokhttp3/internal/Internal;

    iget-object v1, p0, Lokhttp3/internal/http/StreamAllocation;->connectionPool:Lokhttp3/ConnectionPool;

    invoke-virtual {v0, v1, v7}, Lokhttp3/internal/Internal;->put(Lokhttp3/ConnectionPool;Lokhttp3/internal/io/RealConnection;)V

    .line 184
    iput-object v7, p0, Lokhttp3/internal/http/StreamAllocation;->connection:Lokhttp3/internal/io/RealConnection;

    .line 185
    iget-boolean v0, p0, Lokhttp3/internal/http/StreamAllocation;->canceled:Z

    if-eqz v0, :cond_6

    new-instance v0, Ljava/io/IOException;

    const-string v1, "Canceled"

    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_2

    .line 186
    :cond_6
    monitor-exit v8

    goto :goto_2

    :catchall_2
    move-exception v12

    monitor-exit v8

    throw v12

    .line 188
    :goto_2
    move-object v0, v7

    move v1, p1

    move v2, p2

    move/from16 v3, p3

    iget-object v4, p0, Lokhttp3/internal/http/StreamAllocation;->address:Lokhttp3/Address;

    invoke-virtual {v4}, Lokhttp3/Address;->connectionSpecs()Ljava/util/List;

    move-result-object v4

    move/from16 v5, p4

    invoke-virtual/range {v0 .. v5}, Lokhttp3/internal/io/RealConnection;->connect(IIILjava/util/List;Z)V

    .line 190
    invoke-direct {p0}, Lokhttp3/internal/http/StreamAllocation;->routeDatabase()Lokhttp3/internal/RouteDatabase;

    move-result-object v0

    invoke-virtual {v7}, Lokhttp3/internal/io/RealConnection;->route()Lokhttp3/Route;

    move-result-object v1

    invoke-virtual {v0, v1}, Lokhttp3/internal/RouteDatabase;->connected(Lokhttp3/Route;)V

    .line 192
    return-object v7
.end method

.method private findHealthyConnection(IIIZZ)Lokhttp3/internal/io/RealConnection;
    .locals 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;,
            Lokhttp3/internal/http/RouteException;
        }
    .end annotation

    .line 127
    :goto_0
    invoke-direct {p0, p1, p2, p3, p4}, Lokhttp3/internal/http/StreamAllocation;->findConnection(IIIZ)Lokhttp3/internal/io/RealConnection;

    move-result-object v1

    .line 131
    iget-object v2, p0, Lokhttp3/internal/http/StreamAllocation;->connectionPool:Lokhttp3/ConnectionPool;

    monitor-enter v2

    .line 132
    :try_start_0
    iget v0, v1, Lokhttp3/internal/io/RealConnection;->successCount:I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-nez v0, :cond_0

    .line 133
    monitor-exit v2

    return-object v1

    .line 135
    :cond_0
    monitor-exit v2

    goto :goto_1

    :catchall_0
    move-exception v3

    monitor-exit v2

    throw v3

    .line 138
    :goto_1
    invoke-virtual {v1, p5}, Lokhttp3/internal/io/RealConnection;->isHealthy(Z)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 139
    return-object v1

    .line 142
    :cond_1
    new-instance v0, Ljava/io/IOException;

    invoke-direct {v0}, Ljava/io/IOException;-><init>()V

    invoke-virtual {p0, v0}, Lokhttp3/internal/http/StreamAllocation;->connectionFailed(Ljava/io/IOException;)V

    .line 143
    goto :goto_0
.end method

.method private isRecoverable(Ljava/io/IOException;)Z
    .locals 1

    .line 329
    instance-of v0, p1, Ljava/net/ProtocolException;

    if-eqz v0, :cond_0

    .line 330
    const/4 v0, 0x0

    return v0

    .line 335
    :cond_0
    instance-of v0, p1, Ljava/io/InterruptedIOException;

    if-eqz v0, :cond_1

    .line 336
    instance-of v0, p1, Ljava/net/SocketTimeoutException;

    return v0

    .line 341
    :cond_1
    instance-of v0, p1, Ljavax/net/ssl/SSLHandshakeException;

    if-eqz v0, :cond_2

    .line 344
    invoke-virtual {p1}, Ljava/io/IOException;->getCause()Ljava/lang/Throwable;

    move-result-object v0

    instance-of v0, v0, Ljava/security/cert/CertificateException;

    if-eqz v0, :cond_2

    .line 345
    const/4 v0, 0x0

    return v0

    .line 348
    :cond_2
    instance-of v0, p1, Ljavax/net/ssl/SSLPeerUnverifiedException;

    if-eqz v0, :cond_3

    .line 350
    const/4 v0, 0x0

    return v0

    .line 356
    :cond_3
    const/4 v0, 0x1

    return v0
.end method

.method private release(Lokhttp3/internal/io/RealConnection;)V
    .locals 4

    .line 302
    const/4 v1, 0x0

    iget-object v0, p1, Lokhttp3/internal/io/RealConnection;->allocations:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v2

    :goto_0
    if-ge v1, v2, :cond_1

    .line 303
    iget-object v0, p1, Lokhttp3/internal/io/RealConnection;->allocations:Ljava/util/List;

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object v3, v0

    check-cast v3, Ljava/lang/ref/Reference;

    .line 304
    invoke-virtual {v3}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    move-result-object v0

    if-ne v0, p0, :cond_0

    .line 305
    iget-object v0, p1, Lokhttp3/internal/io/RealConnection;->allocations:Ljava/util/List;

    invoke-interface {v0, v1}, Ljava/util/List;->remove(I)Ljava/lang/Object;

    .line 306
    return-void

    .line 302
    :cond_0
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    .line 309
    :cond_1
    new-instance v0, Ljava/lang/IllegalStateException;

    invoke-direct {v0}, Ljava/lang/IllegalStateException;-><init>()V

    throw v0
.end method

.method private routeDatabase()Lokhttp3/internal/RouteDatabase;
    .locals 2

    .line 214
    sget-object v0, Lokhttp3/internal/Internal;->instance:Lokhttp3/internal/Internal;

    iget-object v1, p0, Lokhttp3/internal/http/StreamAllocation;->connectionPool:Lokhttp3/ConnectionPool;

    invoke-virtual {v0, v1}, Lokhttp3/internal/Internal;->routeDatabase(Lokhttp3/ConnectionPool;)Lokhttp3/internal/RouteDatabase;

    move-result-object v0

    return-object v0
.end method


# virtual methods
.method public acquire(Lokhttp3/internal/io/RealConnection;)V
    .locals 2

    .line 297
    iget-object v0, p1, Lokhttp3/internal/io/RealConnection;->allocations:Ljava/util/List;

    new-instance v1, Ljava/lang/ref/WeakReference;

    invoke-direct {v1, p0}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 298
    return-void
.end method

.method public cancel()V
    .locals 5

    .line 267
    iget-object v3, p0, Lokhttp3/internal/http/StreamAllocation;->connectionPool:Lokhttp3/ConnectionPool;

    monitor-enter v3

    .line 268
    const/4 v0, 0x1

    :try_start_0
    iput-boolean v0, p0, Lokhttp3/internal/http/StreamAllocation;->canceled:Z

    .line 269
    iget-object v1, p0, Lokhttp3/internal/http/StreamAllocation;->stream:Lokhttp3/internal/http/HttpStream;

    .line 270
    iget-object v2, p0, Lokhttp3/internal/http/StreamAllocation;->connection:Lokhttp3/internal/io/RealConnection;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 271
    monitor-exit v3

    goto :goto_0

    :catchall_0
    move-exception v4

    monitor-exit v3

    throw v4

    .line 272
    :goto_0
    if-eqz v1, :cond_0

    .line 273
    invoke-interface {v1}, Lokhttp3/internal/http/HttpStream;->cancel()V

    goto :goto_1

    .line 274
    :cond_0
    if-eqz v2, :cond_1

    .line 275
    invoke-virtual {v2}, Lokhttp3/internal/io/RealConnection;->cancel()V

    .line 277
    :cond_1
    :goto_1
    return-void
.end method

.method public declared-synchronized connection()Lokhttp3/internal/io/RealConnection;
    .locals 2

    monitor-enter p0

    .line 218
    :try_start_0
    iget-object v0, p0, Lokhttp3/internal/http/StreamAllocation;->connection:Lokhttp3/internal/io/RealConnection;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-object v0

    :catchall_0
    move-exception v1

    monitor-exit p0

    throw v1
.end method

.method public connectionFailed(Ljava/io/IOException;)V
    .locals 5

    .line 280
    iget-object v3, p0, Lokhttp3/internal/http/StreamAllocation;->connectionPool:Lokhttp3/ConnectionPool;

    monitor-enter v3

    .line 282
    :try_start_0
    iget-object v0, p0, Lokhttp3/internal/http/StreamAllocation;->connection:Lokhttp3/internal/io/RealConnection;

    if-eqz v0, :cond_1

    iget-object v0, p0, Lokhttp3/internal/http/StreamAllocation;->connection:Lokhttp3/internal/io/RealConnection;

    iget v0, v0, Lokhttp3/internal/io/RealConnection;->successCount:I

    if-nez v0, :cond_1

    .line 283
    iget-object v0, p0, Lokhttp3/internal/http/StreamAllocation;->route:Lokhttp3/Route;

    if-eqz v0, :cond_0

    if-eqz p1, :cond_0

    .line 284
    iget-object v0, p0, Lokhttp3/internal/http/StreamAllocation;->routeSelector:Lokhttp3/internal/http/RouteSelector;

    iget-object v1, p0, Lokhttp3/internal/http/StreamAllocation;->route:Lokhttp3/Route;

    invoke-virtual {v0, v1, p1}, Lokhttp3/internal/http/RouteSelector;->connectFailed(Lokhttp3/Route;Ljava/io/IOException;)V

    .line 286
    :cond_0
    const/4 v0, 0x0

    iput-object v0, p0, Lokhttp3/internal/http/StreamAllocation;->route:Lokhttp3/Route;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 288
    :cond_1
    monitor-exit v3

    goto :goto_0

    :catchall_0
    move-exception v4

    monitor-exit v3

    throw v4

    .line 289
    :goto_0
    const/4 v0, 0x1

    const/4 v1, 0x0

    const/4 v2, 0x1

    invoke-direct {p0, v0, v1, v2}, Lokhttp3/internal/http/StreamAllocation;->deallocate(ZZZ)V

    .line 290
    return-void
.end method

.method public newStream(IIIZZ)Lokhttp3/internal/http/HttpStream;
    .locals 8
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lokhttp3/internal/http/RouteException;,
            Ljava/io/IOException;
        }
    .end annotation

    .line 97
    :try_start_0
    invoke-direct/range {p0 .. p5}, Lokhttp3/internal/http/StreamAllocation;->findHealthyConnection(IIIZZ)Lokhttp3/internal/io/RealConnection;

    move-result-object v4

    .line 101
    iget-object v0, v4, Lokhttp3/internal/io/RealConnection;->framedConnection:Lokhttp3/internal/framed/FramedConnection;

    if-eqz v0, :cond_0

    .line 102
    new-instance v5, Lokhttp3/internal/http/Http2xStream;

    iget-object v0, v4, Lokhttp3/internal/io/RealConnection;->framedConnection:Lokhttp3/internal/framed/FramedConnection;

    invoke-direct {v5, p0, v0}, Lokhttp3/internal/http/Http2xStream;-><init>(Lokhttp3/internal/http/StreamAllocation;Lokhttp3/internal/framed/FramedConnection;)V

    goto :goto_0

    .line 104
    :cond_0
    invoke-virtual {v4}, Lokhttp3/internal/io/RealConnection;->socket()Ljava/net/Socket;

    move-result-object v0

    invoke-virtual {v0, p2}, Ljava/net/Socket;->setSoTimeout(I)V

    .line 105
    iget-object v0, v4, Lokhttp3/internal/io/RealConnection;->source:Lokio/BufferedSource;

    invoke-interface {v0}, Lokio/BufferedSource;->timeout()Lokio/Timeout;

    move-result-object v0

    int-to-long v1, p2

    sget-object v3, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    invoke-virtual {v0, v1, v2, v3}, Lokio/Timeout;->timeout(JLjava/util/concurrent/TimeUnit;)Lokio/Timeout;

    .line 106
    iget-object v0, v4, Lokhttp3/internal/io/RealConnection;->sink:Lokio/BufferedSink;

    invoke-interface {v0}, Lokio/BufferedSink;->timeout()Lokio/Timeout;

    move-result-object v0

    int-to-long v1, p3

    sget-object v3, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    invoke-virtual {v0, v1, v2, v3}, Lokio/Timeout;->timeout(JLjava/util/concurrent/TimeUnit;)Lokio/Timeout;

    .line 107
    new-instance v5, Lokhttp3/internal/http/Http1xStream;

    iget-object v0, v4, Lokhttp3/internal/io/RealConnection;->source:Lokio/BufferedSource;

    iget-object v1, v4, Lokhttp3/internal/io/RealConnection;->sink:Lokio/BufferedSink;

    invoke-direct {v5, p0, v0, v1}, Lokhttp3/internal/http/Http1xStream;-><init>(Lokhttp3/internal/http/StreamAllocation;Lokio/BufferedSource;Lokio/BufferedSink;)V

    .line 110
    :goto_0
    iget-object v6, p0, Lokhttp3/internal/http/StreamAllocation;->connectionPool:Lokhttp3/ConnectionPool;

    monitor-enter v6
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 111
    :try_start_1
    iput-object v5, p0, Lokhttp3/internal/http/StreamAllocation;->stream:Lokhttp3/internal/http/HttpStream;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 112
    monitor-exit v6

    return-object v5

    .line 113
    :catchall_0
    move-exception v7

    monitor-exit v6

    :try_start_2
    throw v7
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_0

    .line 114
    :catch_0
    move-exception v4

    .line 115
    new-instance v0, Lokhttp3/internal/http/RouteException;

    invoke-direct {v0, v4}, Lokhttp3/internal/http/RouteException;-><init>(Ljava/io/IOException;)V

    throw v0
.end method

.method public noNewStreams()V
    .locals 3

    .line 227
    const/4 v0, 0x1

    const/4 v1, 0x0

    const/4 v2, 0x0

    invoke-direct {p0, v0, v1, v2}, Lokhttp3/internal/http/StreamAllocation;->deallocate(ZZZ)V

    .line 228
    return-void
.end method

.method public recover(Ljava/io/IOException;Lokio/Sink;)Z
    .locals 2

    .line 313
    iget-object v0, p0, Lokhttp3/internal/http/StreamAllocation;->connection:Lokhttp3/internal/io/RealConnection;

    if-eqz v0, :cond_0

    .line 314
    invoke-virtual {p0, p1}, Lokhttp3/internal/http/StreamAllocation;->connectionFailed(Ljava/io/IOException;)V

    .line 317
    :cond_0
    if-eqz p2, :cond_1

    instance-of v0, p2, Lokhttp3/internal/http/RetryableSink;

    if-eqz v0, :cond_2

    :cond_1
    const/4 v1, 0x1

    goto :goto_0

    :cond_2
    const/4 v1, 0x0

    .line 318
    :goto_0
    iget-object v0, p0, Lokhttp3/internal/http/StreamAllocation;->routeSelector:Lokhttp3/internal/http/RouteSelector;

    if-eqz v0, :cond_3

    iget-object v0, p0, Lokhttp3/internal/http/StreamAllocation;->routeSelector:Lokhttp3/internal/http/RouteSelector;

    invoke-virtual {v0}, Lokhttp3/internal/http/RouteSelector;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_4

    .line 319
    :cond_3
    invoke-direct {p0, p1}, Lokhttp3/internal/http/StreamAllocation;->isRecoverable(Ljava/io/IOException;)Z

    move-result v0

    if-eqz v0, :cond_4

    if-nez v1, :cond_5

    .line 321
    :cond_4
    const/4 v0, 0x0

    return v0

    .line 324
    :cond_5
    const/4 v0, 0x1

    return v0
.end method

.method public release()V
    .locals 3

    .line 222
    const/4 v0, 0x0

    const/4 v1, 0x1

    const/4 v2, 0x0

    invoke-direct {p0, v0, v1, v2}, Lokhttp3/internal/http/StreamAllocation;->deallocate(ZZZ)V

    .line 223
    return-void
.end method

.method public stream()Lokhttp3/internal/http/HttpStream;
    .locals 3

    .line 208
    iget-object v1, p0, Lokhttp3/internal/http/StreamAllocation;->connectionPool:Lokhttp3/ConnectionPool;

    monitor-enter v1

    .line 209
    :try_start_0
    iget-object v0, p0, Lokhttp3/internal/http/StreamAllocation;->stream:Lokhttp3/internal/http/HttpStream;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v1

    return-object v0

    .line 210
    :catchall_0
    move-exception v2

    monitor-exit v1

    throw v2
.end method

.method public streamFinished(ZLokhttp3/internal/http/HttpStream;)V
    .locals 5

    .line 196
    iget-object v3, p0, Lokhttp3/internal/http/StreamAllocation;->connectionPool:Lokhttp3/ConnectionPool;

    monitor-enter v3

    .line 197
    if-eqz p2, :cond_0

    :try_start_0
    iget-object v0, p0, Lokhttp3/internal/http/StreamAllocation;->stream:Lokhttp3/internal/http/HttpStream;

    if-eq p2, v0, :cond_1

    .line 198
    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "expected "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget-object v2, p0, Lokhttp3/internal/http/StreamAllocation;->stream:Lokhttp3/internal/http/HttpStream;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, " but was "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 200
    :cond_1
    if-nez p1, :cond_2

    .line 201
    iget-object v0, p0, Lokhttp3/internal/http/StreamAllocation;->connection:Lokhttp3/internal/io/RealConnection;

    iget v1, v0, Lokhttp3/internal/io/RealConnection;->successCount:I

    add-int/lit8 v1, v1, 0x1

    iput v1, v0, Lokhttp3/internal/io/RealConnection;->successCount:I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 203
    :cond_2
    monitor-exit v3

    goto :goto_0

    :catchall_0
    move-exception v4

    monitor-exit v3

    throw v4

    .line 204
    :goto_0
    const/4 v0, 0x0

    const/4 v1, 0x1

    invoke-direct {p0, p1, v0, v1}, Lokhttp3/internal/http/StreamAllocation;->deallocate(ZZZ)V

    .line 205
    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 1

    .line 360
    iget-object v0, p0, Lokhttp3/internal/http/StreamAllocation;->address:Lokhttp3/Address;

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
