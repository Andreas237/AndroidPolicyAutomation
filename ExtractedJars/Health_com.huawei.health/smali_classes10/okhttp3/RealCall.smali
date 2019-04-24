.class final Lokhttp3/RealCall;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lokhttp3/Call;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lokhttp3/RealCall$ApplicationInterceptorChain;,
        Lokhttp3/RealCall$AsyncCall;
    }
.end annotation


# instance fields
.field volatile canceled:Z

.field private final client:Lokhttp3/OkHttpClient;

.field engine:Lokhttp3/internal/http/HttpEngine;

.field private executed:Z

.field originalRequest:Lokhttp3/Request;


# direct methods
.method protected constructor <init>(Lokhttp3/OkHttpClient;Lokhttp3/Request;)V
    .locals 0

    .line 41
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 42
    iput-object p1, p0, Lokhttp3/RealCall;->client:Lokhttp3/OkHttpClient;

    .line 43
    iput-object p2, p0, Lokhttp3/RealCall;->originalRequest:Lokhttp3/Request;

    .line 44
    return-void
.end method

.method static synthetic access$100(Lokhttp3/RealCall;Z)Lokhttp3/Response;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 30
    invoke-direct {p0, p1}, Lokhttp3/RealCall;->getResponseWithInterceptorChain(Z)Lokhttp3/Response;

    move-result-object v0

    return-object v0
.end method

.method static synthetic access$200(Lokhttp3/RealCall;)Ljava/lang/String;
    .locals 1

    .line 30
    invoke-direct {p0}, Lokhttp3/RealCall;->toLoggableString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method static synthetic access$300(Lokhttp3/RealCall;)Lokhttp3/OkHttpClient;
    .locals 1

    .line 30
    iget-object v0, p0, Lokhttp3/RealCall;->client:Lokhttp3/OkHttpClient;

    return-object v0
.end method

.method private getResponseWithInterceptorChain(Z)Lokhttp3/Response;
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 159
    new-instance v2, Lokhttp3/RealCall$ApplicationInterceptorChain;

    iget-object v0, p0, Lokhttp3/RealCall;->originalRequest:Lokhttp3/Request;

    const/4 v1, 0x0

    invoke-direct {v2, p0, v1, v0, p1}, Lokhttp3/RealCall$ApplicationInterceptorChain;-><init>(Lokhttp3/RealCall;ILokhttp3/Request;Z)V

    .line 160
    iget-object v0, p0, Lokhttp3/RealCall;->originalRequest:Lokhttp3/Request;

    invoke-interface {v2, v0}, Lokhttp3/Interceptor$Chain;->proceed(Lokhttp3/Request;)Lokhttp3/Response;

    move-result-object v0

    return-object v0
.end method

.method private toLoggableString()Ljava/lang/String;
    .locals 4

    .line 153
    iget-boolean v0, p0, Lokhttp3/RealCall;->canceled:Z

    if-eqz v0, :cond_0

    const-string v2, "canceled call"

    goto :goto_0

    :cond_0
    const-string v2, "call"

    .line 154
    :goto_0
    iget-object v0, p0, Lokhttp3/RealCall;->originalRequest:Lokhttp3/Request;

    invoke-virtual {v0}, Lokhttp3/Request;->url()Lokhttp3/HttpUrl;

    move-result-object v0

    const-string v1, "/..."

    invoke-virtual {v0, v1}, Lokhttp3/HttpUrl;->resolve(Ljava/lang/String;)Lokhttp3/HttpUrl;

    move-result-object v3

    .line 155
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, " to "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method


# virtual methods
.method public cancel()V
    .locals 1

    .line 82
    const/4 v0, 0x1

    iput-boolean v0, p0, Lokhttp3/RealCall;->canceled:Z

    .line 83
    iget-object v0, p0, Lokhttp3/RealCall;->engine:Lokhttp3/internal/http/HttpEngine;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lokhttp3/RealCall;->engine:Lokhttp3/internal/http/HttpEngine;

    invoke-virtual {v0}, Lokhttp3/internal/http/HttpEngine;->cancel()V

    .line 84
    :cond_0
    return-void
.end method

.method public enqueue(Lokhttp3/Callback;)V
    .locals 1

    .line 70
    const/4 v0, 0x0

    invoke-virtual {p0, p1, v0}, Lokhttp3/RealCall;->enqueue(Lokhttp3/Callback;Z)V

    .line 71
    return-void
.end method

.method enqueue(Lokhttp3/Callback;Z)V
    .locals 5

    .line 74
    move-object v3, p0

    monitor-enter v3

    .line 75
    :try_start_0
    iget-boolean v0, p0, Lokhttp3/RealCall;->executed:Z

    if-eqz v0, :cond_0

    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Already Executed"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 76
    :cond_0
    const/4 v0, 0x1

    iput-boolean v0, p0, Lokhttp3/RealCall;->executed:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 77
    monitor-exit v3

    goto :goto_0

    :catchall_0
    move-exception v4

    monitor-exit v3

    throw v4

    .line 78
    :goto_0
    iget-object v0, p0, Lokhttp3/RealCall;->client:Lokhttp3/OkHttpClient;

    invoke-virtual {v0}, Lokhttp3/OkHttpClient;->dispatcher()Lokhttp3/Dispatcher;

    move-result-object v0

    new-instance v1, Lokhttp3/RealCall$AsyncCall;

    const/4 v2, 0x0

    invoke-direct {v1, p0, p1, p2, v2}, Lokhttp3/RealCall$AsyncCall;-><init>(Lokhttp3/RealCall;Lokhttp3/Callback;ZLokhttp3/RealCall$1;)V

    invoke-virtual {v0, v1}, Lokhttp3/Dispatcher;->enqueue(Lokhttp3/RealCall$AsyncCall;)V

    .line 79
    return-void
.end method

.method public execute()Lokhttp3/Response;
    .locals 5
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 51
    move-object v2, p0

    monitor-enter v2

    .line 52
    :try_start_0
    iget-boolean v0, p0, Lokhttp3/RealCall;->executed:Z

    if-eqz v0, :cond_0

    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Already Executed"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 53
    :cond_0
    const/4 v0, 0x1

    iput-boolean v0, p0, Lokhttp3/RealCall;->executed:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 54
    monitor-exit v2

    goto :goto_0

    :catchall_0
    move-exception v3

    monitor-exit v2

    throw v3

    .line 56
    :goto_0
    :try_start_1
    iget-object v0, p0, Lokhttp3/RealCall;->client:Lokhttp3/OkHttpClient;

    invoke-virtual {v0}, Lokhttp3/OkHttpClient;->dispatcher()Lokhttp3/Dispatcher;

    move-result-object v0

    invoke-virtual {v0, p0}, Lokhttp3/Dispatcher;->executed(Lokhttp3/RealCall;)V

    .line 57
    const/4 v0, 0x0

    invoke-direct {p0, v0}, Lokhttp3/RealCall;->getResponseWithInterceptorChain(Z)Lokhttp3/Response;

    move-result-object v2

    .line 58
    if-nez v2, :cond_1

    new-instance v0, Ljava/io/IOException;

    const-string v1, "Canceled"

    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 59
    :cond_1
    move-object v3, v2

    .line 61
    iget-object v0, p0, Lokhttp3/RealCall;->client:Lokhttp3/OkHttpClient;

    invoke-virtual {v0}, Lokhttp3/OkHttpClient;->dispatcher()Lokhttp3/Dispatcher;

    move-result-object v0

    invoke-virtual {v0, p0}, Lokhttp3/Dispatcher;->finished(Lokhttp3/Call;)V

    return-object v3

    :catchall_1
    move-exception v4

    iget-object v0, p0, Lokhttp3/RealCall;->client:Lokhttp3/OkHttpClient;

    invoke-virtual {v0}, Lokhttp3/OkHttpClient;->dispatcher()Lokhttp3/Dispatcher;

    move-result-object v0

    invoke-virtual {v0, p0}, Lokhttp3/Dispatcher;->finished(Lokhttp3/Call;)V

    throw v4
.end method

.method getResponse(Lokhttp3/Request;Z)Lokhttp3/Response;
    .locals 17
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 207
    invoke-virtual/range {p1 .. p1}, Lokhttp3/Request;->body()Lokhttp3/RequestBody;

    move-result-object v9

    .line 208
    if-eqz v9, :cond_2

    .line 209
    invoke-virtual/range {p1 .. p1}, Lokhttp3/Request;->newBuilder()Lokhttp3/Request$Builder;

    move-result-object v10

    .line 211
    invoke-virtual {v9}, Lokhttp3/RequestBody;->contentType()Lokhttp3/MediaType;

    move-result-object v11

    .line 212
    if-eqz v11, :cond_0

    .line 213
    const-string v0, "Content-Type"

    invoke-virtual {v11}, Lokhttp3/MediaType;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v10, v0, v1}, Lokhttp3/Request$Builder;->header(Ljava/lang/String;Ljava/lang/String;)Lokhttp3/Request$Builder;

    .line 216
    :cond_0
    invoke-virtual {v9}, Lokhttp3/RequestBody;->contentLength()J

    move-result-wide v12

    .line 217
    const-wide/16 v0, -0x1

    cmp-long v0, v12, v0

    if-eqz v0, :cond_1

    .line 218
    const-string v0, "Content-Length"

    invoke-static {v12, v13}, Ljava/lang/Long;->toString(J)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v10, v0, v1}, Lokhttp3/Request$Builder;->header(Ljava/lang/String;Ljava/lang/String;)Lokhttp3/Request$Builder;

    .line 219
    const-string v0, "Transfer-Encoding"

    invoke-virtual {v10, v0}, Lokhttp3/Request$Builder;->removeHeader(Ljava/lang/String;)Lokhttp3/Request$Builder;

    goto :goto_0

    .line 221
    :cond_1
    const-string v0, "Transfer-Encoding"

    const-string v1, "chunked"

    invoke-virtual {v10, v0, v1}, Lokhttp3/Request$Builder;->header(Ljava/lang/String;Ljava/lang/String;)Lokhttp3/Request$Builder;

    .line 222
    const-string v0, "Content-Length"

    invoke-virtual {v10, v0}, Lokhttp3/Request$Builder;->removeHeader(Ljava/lang/String;)Lokhttp3/Request$Builder;

    .line 225
    :goto_0
    invoke-virtual {v10}, Lokhttp3/Request$Builder;->build()Lokhttp3/Request;

    move-result-object p1

    .line 229
    :cond_2
    new-instance v0, Lokhttp3/internal/http/HttpEngine;

    move-object/from16 v1, p0

    iget-object v1, v1, Lokhttp3/RealCall;->client:Lokhttp3/OkHttpClient;

    move-object/from16 v2, p1

    const/4 v3, 0x0

    const/4 v4, 0x0

    move/from16 v5, p2

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    invoke-direct/range {v0 .. v8}, Lokhttp3/internal/http/HttpEngine;-><init>(Lokhttp3/OkHttpClient;Lokhttp3/Request;ZZZLokhttp3/internal/http/StreamAllocation;Lokhttp3/internal/http/RetryableSink;Lokhttp3/Response;)V

    move-object/from16 v1, p0

    iput-object v0, v1, Lokhttp3/RealCall;->engine:Lokhttp3/internal/http/HttpEngine;

    .line 231
    const/4 v10, 0x0

    .line 233
    :goto_1
    move-object/from16 v0, p0

    iget-boolean v0, v0, Lokhttp3/RealCall;->canceled:Z

    if-eqz v0, :cond_3

    .line 234
    move-object/from16 v0, p0

    iget-object v0, v0, Lokhttp3/RealCall;->engine:Lokhttp3/internal/http/HttpEngine;

    invoke-virtual {v0}, Lokhttp3/internal/http/HttpEngine;->releaseStreamAllocation()V

    .line 235
    new-instance v0, Ljava/io/IOException;

    const-string v1, "Canceled"

    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 238
    :cond_3
    const/4 v11, 0x1

    .line 240
    move-object/from16 v0, p0

    :try_start_0
    iget-object v0, v0, Lokhttp3/RealCall;->engine:Lokhttp3/internal/http/HttpEngine;

    invoke-virtual {v0}, Lokhttp3/internal/http/HttpEngine;->sendRequest()V

    .line 241
    move-object/from16 v0, p0

    iget-object v0, v0, Lokhttp3/RealCall;->engine:Lokhttp3/internal/http/HttpEngine;

    invoke-virtual {v0}, Lokhttp3/internal/http/HttpEngine;->readResponse()V
    :try_end_0
    .catch Lokhttp3/internal/http/RequestException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Lokhttp3/internal/http/RouteException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_2
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 242
    const/4 v11, 0x0

    .line 269
    goto/16 :goto_2

    .line 243
    .line 270
    .line 271
    .line 272
    :catch_0
    move-exception v12

    .line 245
    :try_start_1
    invoke-virtual {v12}, Lokhttp3/internal/http/RequestException;->getCause()Ljava/io/IOException;

    move-result-object v0

    throw v0

    .line 246
    :catch_1
    move-exception v12

    .line 248
    move-object/from16 v0, p0

    iget-object v0, v0, Lokhttp3/RealCall;->engine:Lokhttp3/internal/http/HttpEngine;

    invoke-virtual {v12}, Lokhttp3/internal/http/RouteException;->getLastConnectException()Ljava/io/IOException;

    move-result-object v1

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Lokhttp3/internal/http/HttpEngine;->recover(Ljava/io/IOException;Lokio/Sink;)Lokhttp3/internal/http/HttpEngine;

    move-result-object v13

    .line 249
    if-eqz v13, :cond_4

    .line 250
    const/4 v11, 0x0

    .line 251
    move-object/from16 v0, p0

    iput-object v13, v0, Lokhttp3/RealCall;->engine:Lokhttp3/internal/http/HttpEngine;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 269
    goto :goto_1

    .line 255
    .line 270
    .line 271
    .line 272
    :cond_4
    :try_start_2
    invoke-virtual {v12}, Lokhttp3/internal/http/RouteException;->getLastConnectException()Ljava/io/IOException;

    move-result-object v0

    throw v0

    .line 256
    :catch_2
    move-exception v12

    .line 258
    move-object/from16 v0, p0

    iget-object v0, v0, Lokhttp3/RealCall;->engine:Lokhttp3/internal/http/HttpEngine;

    const/4 v1, 0x0

    invoke-virtual {v0, v12, v1}, Lokhttp3/internal/http/HttpEngine;->recover(Ljava/io/IOException;Lokio/Sink;)Lokhttp3/internal/http/HttpEngine;

    move-result-object v13

    .line 259
    if-eqz v13, :cond_5

    .line 260
    const/4 v11, 0x0

    .line 261
    move-object/from16 v0, p0

    iput-object v13, v0, Lokhttp3/RealCall;->engine:Lokhttp3/internal/http/HttpEngine;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 269
    goto/16 :goto_1

    .line 266
    .line 270
    .line 271
    .line 272
    :cond_5
    :try_start_3
    throw v12
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 269
    :catchall_0
    move-exception v15

    if-eqz v11, :cond_6

    .line 270
    move-object/from16 v0, p0

    iget-object v0, v0, Lokhttp3/RealCall;->engine:Lokhttp3/internal/http/HttpEngine;

    invoke-virtual {v0}, Lokhttp3/internal/http/HttpEngine;->close()Lokhttp3/internal/http/StreamAllocation;

    move-result-object v16

    .line 271
    invoke-virtual/range {v16 .. v16}, Lokhttp3/internal/http/StreamAllocation;->release()V

    .line 272
    :cond_6
    throw v15

    .line 275
    :goto_2
    move-object/from16 v0, p0

    iget-object v0, v0, Lokhttp3/RealCall;->engine:Lokhttp3/internal/http/HttpEngine;

    invoke-virtual {v0}, Lokhttp3/internal/http/HttpEngine;->getResponse()Lokhttp3/Response;

    move-result-object v12

    .line 276
    move-object/from16 v0, p0

    iget-object v0, v0, Lokhttp3/RealCall;->engine:Lokhttp3/internal/http/HttpEngine;

    invoke-virtual {v0}, Lokhttp3/internal/http/HttpEngine;->followUpRequest()Lokhttp3/Request;

    move-result-object v13

    .line 278
    if-nez v13, :cond_8

    .line 279
    if-nez p2, :cond_7

    .line 280
    move-object/from16 v0, p0

    iget-object v0, v0, Lokhttp3/RealCall;->engine:Lokhttp3/internal/http/HttpEngine;

    invoke-virtual {v0}, Lokhttp3/internal/http/HttpEngine;->releaseStreamAllocation()V

    .line 282
    :cond_7
    return-object v12

    .line 285
    :cond_8
    move-object/from16 v0, p0

    iget-object v0, v0, Lokhttp3/RealCall;->engine:Lokhttp3/internal/http/HttpEngine;

    invoke-virtual {v0}, Lokhttp3/internal/http/HttpEngine;->close()Lokhttp3/internal/http/StreamAllocation;

    move-result-object v14

    .line 287
    add-int/lit8 v10, v10, 0x1

    const/16 v0, 0x14

    if-le v10, v0, :cond_9

    .line 288
    invoke-virtual {v14}, Lokhttp3/internal/http/StreamAllocation;->release()V

    .line 289
    new-instance v0, Ljava/net/ProtocolException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Too many follow-up requests: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v10}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/net/ProtocolException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 292
    :cond_9
    move-object/from16 v0, p0

    iget-object v0, v0, Lokhttp3/RealCall;->engine:Lokhttp3/internal/http/HttpEngine;

    invoke-virtual {v13}, Lokhttp3/Request;->url()Lokhttp3/HttpUrl;

    move-result-object v1

    invoke-virtual {v0, v1}, Lokhttp3/internal/http/HttpEngine;->sameConnection(Lokhttp3/HttpUrl;)Z

    move-result v0

    if-nez v0, :cond_a

    .line 293
    invoke-virtual {v14}, Lokhttp3/internal/http/StreamAllocation;->release()V

    .line 294
    const/4 v14, 0x0

    .line 297
    :cond_a
    move-object/from16 p1, v13

    .line 298
    new-instance v0, Lokhttp3/internal/http/HttpEngine;

    move-object/from16 v1, p0

    iget-object v1, v1, Lokhttp3/RealCall;->client:Lokhttp3/OkHttpClient;

    move-object/from16 v2, p1

    const/4 v3, 0x0

    const/4 v4, 0x0

    move/from16 v5, p2

    move-object v6, v14

    const/4 v7, 0x0

    move-object v8, v12

    invoke-direct/range {v0 .. v8}, Lokhttp3/internal/http/HttpEngine;-><init>(Lokhttp3/OkHttpClient;Lokhttp3/Request;ZZZLokhttp3/internal/http/StreamAllocation;Lokhttp3/internal/http/RetryableSink;Lokhttp3/Response;)V

    move-object/from16 v1, p0

    iput-object v0, v1, Lokhttp3/RealCall;->engine:Lokhttp3/internal/http/HttpEngine;

    .line 300
    goto/16 :goto_1
.end method

.method public isCanceled()Z
    .locals 1

    .line 91
    iget-boolean v0, p0, Lokhttp3/RealCall;->canceled:Z

    return v0
.end method

.method public declared-synchronized isExecuted()Z
    .locals 2

    monitor-enter p0

    .line 87
    :try_start_0
    iget-boolean v0, p0, Lokhttp3/RealCall;->executed:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return v0

    :catchall_0
    move-exception v1

    monitor-exit p0

    throw v1
.end method

.method public request()Lokhttp3/Request;
    .locals 1

    .line 47
    iget-object v0, p0, Lokhttp3/RealCall;->originalRequest:Lokhttp3/Request;

    return-object v0
.end method

.method tag()Ljava/lang/Object;
    .locals 1

    .line 66
    iget-object v0, p0, Lokhttp3/RealCall;->originalRequest:Lokhttp3/Request;

    invoke-virtual {v0}, Lokhttp3/Request;->tag()Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method
