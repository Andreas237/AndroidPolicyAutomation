.class public Lio/sentry/DefaultSentryClientFactory;
.super Lio/sentry/SentryClientFactory;
.source "DefaultSentryClientFactory.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lio/sentry/DefaultSentryClientFactory$DaemonThreadFactory;
    }
.end annotation


# static fields
.field public static final ASYNC_GRACEFUL_SHUTDOWN_OPTION:Ljava/lang/String; = "async.gracefulshutdown"

.field public static final ASYNC_OPTION:Ljava/lang/String; = "async"

.field public static final ASYNC_PRIORITY_OPTION:Ljava/lang/String; = "async.priority"

.field public static final ASYNC_QUEUE_DISCARDNEW:Ljava/lang/String; = "discardnew"

.field public static final ASYNC_QUEUE_DISCARDOLD:Ljava/lang/String; = "discardold"

.field public static final ASYNC_QUEUE_OVERFLOW_DEFAULT:Ljava/lang/String; = "discardold"

.field public static final ASYNC_QUEUE_OVERFLOW_OPTION:Ljava/lang/String; = "async.queue.overflow"

.field public static final ASYNC_QUEUE_SIZE_OPTION:Ljava/lang/String; = "async.queuesize"

.field public static final ASYNC_QUEUE_SYNC:Ljava/lang/String; = "sync"

.field public static final ASYNC_SHUTDOWN_TIMEOUT_DEFAULT:J

.field public static final ASYNC_SHUTDOWN_TIMEOUT_OPTION:Ljava/lang/String; = "async.shutdowntimeout"

.field public static final ASYNC_THREADS_OPTION:Ljava/lang/String; = "async.threads"

.field public static final BUFFER_DIR_OPTION:Ljava/lang/String; = "buffer.dir"

.field public static final BUFFER_ENABLED_DEFAULT:Z = true

.field public static final BUFFER_ENABLED_OPTION:Ljava/lang/String; = "buffer.enabled"

.field public static final BUFFER_FLUSHTIME_DEFAULT:J = 0xea60L

.field public static final BUFFER_FLUSHTIME_OPTION:Ljava/lang/String; = "buffer.flushtime"

.field public static final BUFFER_GRACEFUL_SHUTDOWN_OPTION:Ljava/lang/String; = "buffer.gracefulshutdown"

.field public static final BUFFER_SHUTDOWN_TIMEOUT_DEFAULT:J

.field public static final BUFFER_SHUTDOWN_TIMEOUT_OPTION:Ljava/lang/String; = "buffer.shutdowntimeout"

.field public static final BUFFER_SIZE_DEFAULT:I = 0xa

.field public static final BUFFER_SIZE_OPTION:Ljava/lang/String; = "buffer.size"

.field public static final COMPRESSION_OPTION:Ljava/lang/String; = "compression"

.field public static final DIST_OPTION:Ljava/lang/String; = "dist"

.field public static final ENVIRONMENT_OPTION:Ljava/lang/String; = "environment"

.field public static final EXTRATAGS_OPTION:Ljava/lang/String; = "extratags"
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation
.end field

.field public static final EXTRA_OPTION:Ljava/lang/String; = "extra"

.field private static final FALSE:Ljava/lang/String;

.field public static final HIDE_COMMON_FRAMES_OPTION:Ljava/lang/String; = "stacktrace.hidecommon"

.field public static final HTTP_PROXY_HOST_OPTION:Ljava/lang/String; = "http.proxy.host"

.field public static final HTTP_PROXY_PASS_OPTION:Ljava/lang/String; = "http.proxy.password"

.field public static final HTTP_PROXY_PORT_DEFAULT:I = 0x50

.field public static final HTTP_PROXY_PORT_OPTION:Ljava/lang/String; = "http.proxy.port"

.field public static final HTTP_PROXY_USER_OPTION:Ljava/lang/String; = "http.proxy.user"

.field public static final IN_APP_FRAMES_OPTION:Ljava/lang/String; = "stacktrace.app.packages"

.field public static final MAX_MESSAGE_LENGTH_OPTION:Ljava/lang/String; = "maxmessagelength"

.field public static final MDCTAGS_OPTION:Ljava/lang/String; = "mdctags"

.field public static final NAIVE_PROTOCOL:Ljava/lang/String; = "naive"

.field public static final QUEUE_SIZE_DEFAULT:I = 0x32

.field private static final REJECT_EXECUTION_HANDLERS:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/util/concurrent/RejectedExecutionHandler;",
            ">;"
        }
    .end annotation
.end field

.field public static final RELEASE_OPTION:Ljava/lang/String; = "release"

.field public static final SAMPLE_RATE_OPTION:Ljava/lang/String; = "sample.rate"

.field public static final SERVERNAME_OPTION:Ljava/lang/String; = "servername"

.field public static final TAGS_OPTION:Ljava/lang/String; = "tags"

.field public static final TIMEOUT_DEFAULT:I

.field public static final TIMEOUT_OPTION:Ljava/lang/String; = "timeout"

.field public static final UNCAUGHT_HANDLER_ENABLED_OPTION:Ljava/lang/String; = "uncaught.handler.enabled"

.field private static final logger:Lorg/slf4j/Logger;


# direct methods
.method static constructor <clinit>()V
    .locals 5

    .line 55
    sget-object v0, Ljava/util/concurrent/TimeUnit;->SECONDS:Ljava/util/concurrent/TimeUnit;

    const-wide/16 v1, 0x1

    invoke-virtual {v0, v1, v2}, Ljava/util/concurrent/TimeUnit;->toMillis(J)J

    move-result-wide v3

    long-to-int v0, v3

    sput v0, Lio/sentry/DefaultSentryClientFactory;->TIMEOUT_DEFAULT:I

    .line 96
    sget-object v0, Ljava/util/concurrent/TimeUnit;->SECONDS:Ljava/util/concurrent/TimeUnit;

    invoke-virtual {v0, v1, v2}, Ljava/util/concurrent/TimeUnit;->toMillis(J)J

    move-result-wide v3

    sput-wide v3, Lio/sentry/DefaultSentryClientFactory;->BUFFER_SHUTDOWN_TIMEOUT_DEFAULT:J

    .line 146
    sget-object v0, Ljava/util/concurrent/TimeUnit;->SECONDS:Ljava/util/concurrent/TimeUnit;

    invoke-virtual {v0, v1, v2}, Ljava/util/concurrent/TimeUnit;->toMillis(J)J

    move-result-wide v0

    sput-wide v0, Lio/sentry/DefaultSentryClientFactory;->ASYNC_SHUTDOWN_TIMEOUT_DEFAULT:J

    .line 223
    const-class v0, Lio/sentry/DefaultSentryClientFactory;

    invoke-static {v0}, Lorg/slf4j/LoggerFactory;->getLogger(Ljava/lang/Class;)Lorg/slf4j/Logger;

    move-result-object v0

    sput-object v0, Lio/sentry/DefaultSentryClientFactory;->logger:Lorg/slf4j/Logger;

    .line 224
    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->toString()Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lio/sentry/DefaultSentryClientFactory;->FALSE:Ljava/lang/String;

    .line 226
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    sput-object v0, Lio/sentry/DefaultSentryClientFactory;->REJECT_EXECUTION_HANDLERS:Ljava/util/Map;

    .line 228
    sget-object v0, Lio/sentry/DefaultSentryClientFactory;->REJECT_EXECUTION_HANDLERS:Ljava/util/Map;

    const-string v1, "sync"

    new-instance v2, Ljava/util/concurrent/ThreadPoolExecutor$CallerRunsPolicy;

    invoke-direct {v2}, Ljava/util/concurrent/ThreadPoolExecutor$CallerRunsPolicy;-><init>()V

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 229
    sget-object v0, Lio/sentry/DefaultSentryClientFactory;->REJECT_EXECUTION_HANDLERS:Ljava/util/Map;

    const-string v1, "discardnew"

    new-instance v2, Ljava/util/concurrent/ThreadPoolExecutor$DiscardPolicy;

    invoke-direct {v2}, Ljava/util/concurrent/ThreadPoolExecutor$DiscardPolicy;-><init>()V

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 230
    sget-object v0, Lio/sentry/DefaultSentryClientFactory;->REJECT_EXECUTION_HANDLERS:Ljava/util/Map;

    const-string v1, "discardold"

    new-instance v2, Ljava/util/concurrent/ThreadPoolExecutor$DiscardOldestPolicy;

    invoke-direct {v2}, Ljava/util/concurrent/ThreadPoolExecutor$DiscardOldestPolicy;-><init>()V

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 34
    invoke-direct {p0}, Lio/sentry/SentryClientFactory;-><init>()V

    return-void
.end method


# virtual methods
.method protected configureSentryClient(Lio/sentry/SentryClient;Lio/sentry/dsn/Dsn;)Lio/sentry/SentryClient;
    .locals 3

    .line 263
    invoke-virtual {p0, p2}, Lio/sentry/DefaultSentryClientFactory;->getRelease(Lio/sentry/dsn/Dsn;)Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 265
    invoke-virtual {p1, v0}, Lio/sentry/SentryClient;->setRelease(Ljava/lang/String;)V

    .line 268
    :cond_0
    invoke-virtual {p0, p2}, Lio/sentry/DefaultSentryClientFactory;->getDist(Lio/sentry/dsn/Dsn;)Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_1

    .line 270
    invoke-virtual {p1, v0}, Lio/sentry/SentryClient;->setDist(Ljava/lang/String;)V

    .line 273
    :cond_1
    invoke-virtual {p0, p2}, Lio/sentry/DefaultSentryClientFactory;->getEnvironment(Lio/sentry/dsn/Dsn;)Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_2

    .line 275
    invoke-virtual {p1, v0}, Lio/sentry/SentryClient;->setEnvironment(Ljava/lang/String;)V

    .line 278
    :cond_2
    invoke-virtual {p0, p2}, Lio/sentry/DefaultSentryClientFactory;->getServerName(Lio/sentry/dsn/Dsn;)Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_3

    .line 280
    invoke-virtual {p1, v0}, Lio/sentry/SentryClient;->setServerName(Ljava/lang/String;)V

    .line 283
    :cond_3
    invoke-virtual {p0, p2}, Lio/sentry/DefaultSentryClientFactory;->getTags(Lio/sentry/dsn/Dsn;)Ljava/util/Map;

    move-result-object v0

    .line 284
    invoke-interface {v0}, Ljava/util/Map;->isEmpty()Z

    move-result v1

    if-nez v1, :cond_4

    .line 285
    invoke-interface {v0}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_4

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/Map$Entry;

    .line 286
    invoke-interface {v1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    invoke-interface {v1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    invoke-virtual {p1, v2, v1}, Lio/sentry/SentryClient;->addTag(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_0

    .line 290
    :cond_4
    invoke-virtual {p0, p2}, Lio/sentry/DefaultSentryClientFactory;->getMdcTags(Lio/sentry/dsn/Dsn;)Ljava/util/Set;

    move-result-object v0

    .line 291
    invoke-interface {v0}, Ljava/util/Set;->isEmpty()Z

    move-result v1

    if-nez v1, :cond_5

    .line 292
    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_5

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    .line 293
    invoke-virtual {p1, v1}, Lio/sentry/SentryClient;->addMdcTag(Ljava/lang/String;)V

    goto :goto_1

    .line 297
    :cond_5
    invoke-virtual {p0, p2}, Lio/sentry/DefaultSentryClientFactory;->getExtra(Lio/sentry/dsn/Dsn;)Ljava/util/Map;

    move-result-object v0

    .line 298
    invoke-interface {v0}, Ljava/util/Map;->isEmpty()Z

    move-result v1

    if-nez v1, :cond_6

    .line 299
    invoke-interface {v0}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_2
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_6

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/Map$Entry;

    .line 300
    invoke-interface {v1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    invoke-interface {v1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v1

    invoke-virtual {p1, v2, v1}, Lio/sentry/SentryClient;->addExtra(Ljava/lang/String;Ljava/lang/Object;)V

    goto :goto_2

    .line 304
    :cond_6
    invoke-virtual {p0, p2}, Lio/sentry/DefaultSentryClientFactory;->getUncaughtHandlerEnabled(Lio/sentry/dsn/Dsn;)Z

    move-result v0

    if-eqz v0, :cond_7

    .line 305
    invoke-virtual {p1}, Lio/sentry/SentryClient;->setupUncaughtExceptionHandler()V

    .line 308
    :cond_7
    invoke-virtual {p0, p2}, Lio/sentry/DefaultSentryClientFactory;->getInAppFrames(Lio/sentry/dsn/Dsn;)Ljava/util/Collection;

    move-result-object p2

    invoke-interface {p2}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object p2

    :goto_3
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_8

    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    .line 309
    invoke-static {v0}, Lio/sentry/jvmti/FrameCache;->addAppPackage(Ljava/lang/String;)V

    goto :goto_3

    :cond_8
    return-object p1
.end method

.method protected createAsyncConnection(Lio/sentry/dsn/Dsn;Lio/sentry/connection/Connection;)Lio/sentry/connection/Connection;
    .locals 13

    .line 374
    invoke-virtual {p0, p1}, Lio/sentry/DefaultSentryClientFactory;->getAsyncThreads(Lio/sentry/dsn/Dsn;)I

    move-result v2

    .line 375
    invoke-virtual {p0, p1}, Lio/sentry/DefaultSentryClientFactory;->getAsyncPriority(Lio/sentry/dsn/Dsn;)I

    move-result v0

    .line 378
    invoke-virtual {p0, p1}, Lio/sentry/DefaultSentryClientFactory;->getAsyncQueueSize(Lio/sentry/dsn/Dsn;)I

    move-result v1

    const/4 v3, -0x1

    if-ne v1, v3, :cond_0

    .line 380
    new-instance v1, Ljava/util/concurrent/LinkedBlockingDeque;

    invoke-direct {v1}, Ljava/util/concurrent/LinkedBlockingDeque;-><init>()V

    move-object v6, v1

    goto :goto_0

    .line 382
    :cond_0
    new-instance v3, Ljava/util/concurrent/LinkedBlockingDeque;

    invoke-direct {v3, v1}, Ljava/util/concurrent/LinkedBlockingDeque;-><init>(I)V

    move-object v6, v3

    .line 385
    :goto_0
    new-instance v9, Ljava/util/concurrent/ThreadPoolExecutor;

    const-wide/16 v3, 0x0

    sget-object v5, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    new-instance v7, Lio/sentry/DefaultSentryClientFactory$DaemonThreadFactory;

    const/4 v1, 0x0

    invoke-direct {v7, v0, v1}, Lio/sentry/DefaultSentryClientFactory$DaemonThreadFactory;-><init>(ILio/sentry/DefaultSentryClientFactory$1;)V

    invoke-virtual {p0, p1}, Lio/sentry/DefaultSentryClientFactory;->getRejectedExecutionHandler(Lio/sentry/dsn/Dsn;)Ljava/util/concurrent/RejectedExecutionHandler;

    move-result-object v8

    move-object v0, v9

    move v1, v2

    invoke-direct/range {v0 .. v8}, Ljava/util/concurrent/ThreadPoolExecutor;-><init>(IIJLjava/util/concurrent/TimeUnit;Ljava/util/concurrent/BlockingQueue;Ljava/util/concurrent/ThreadFactory;Ljava/util/concurrent/RejectedExecutionHandler;)V

    .line 389
    invoke-virtual {p0, p1}, Lio/sentry/DefaultSentryClientFactory;->getAsyncGracefulShutdownEnabled(Lio/sentry/dsn/Dsn;)Z

    move-result v10

    .line 391
    invoke-virtual {p0, p1}, Lio/sentry/DefaultSentryClientFactory;->getAsyncShutdownTimeout(Lio/sentry/dsn/Dsn;)J

    move-result-wide v11

    .line 392
    new-instance p1, Lio/sentry/connection/AsyncConnection;

    move-object v7, p1

    move-object v8, p2

    invoke-direct/range {v7 .. v12}, Lio/sentry/connection/AsyncConnection;-><init>(Lio/sentry/connection/Connection;Ljava/util/concurrent/ExecutorService;ZJ)V

    return-object p1
.end method

.method protected createConnection(Lio/sentry/dsn/Dsn;)Lio/sentry/connection/Connection;
    .locals 10

    .line 322
    invoke-virtual {p1}, Lio/sentry/dsn/Dsn;->getProtocol()Ljava/lang/String;

    move-result-object v0

    const-string v1, "http"

    .line 325
    invoke-virtual {v0, v1}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v1

    if-nez v1, :cond_3

    const-string v1, "https"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_0

    goto :goto_0

    :cond_0
    const-string v1, "out"

    .line 328
    invoke-virtual {v0, v1}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_1

    .line 329
    sget-object v0, Lio/sentry/DefaultSentryClientFactory;->logger:Lorg/slf4j/Logger;

    const-string v1, "Using StdOut to send events."

    invoke-interface {v0, v1}, Lorg/slf4j/Logger;->debug(Ljava/lang/String;)V

    .line 330
    invoke-virtual {p0, p1}, Lio/sentry/DefaultSentryClientFactory;->createStdOutConnection(Lio/sentry/dsn/Dsn;)Lio/sentry/connection/Connection;

    move-result-object v0

    goto :goto_1

    :cond_1
    const-string v1, "noop"

    .line 331
    invoke-virtual {v0, v1}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_2

    .line 332
    sget-object v0, Lio/sentry/DefaultSentryClientFactory;->logger:Lorg/slf4j/Logger;

    const-string v1, "Using noop to send events."

    invoke-interface {v0, v1}, Lorg/slf4j/Logger;->debug(Ljava/lang/String;)V

    .line 333
    new-instance v0, Lio/sentry/connection/NoopConnection;

    invoke-direct {v0}, Lio/sentry/connection/NoopConnection;-><init>()V

    goto :goto_1

    .line 335
    :cond_2
    new-instance p1, Ljava/lang/IllegalStateException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Couldn\'t create a connection for the protocol \'"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, "\'"

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 326
    :cond_3
    :goto_0
    sget-object v1, Lio/sentry/DefaultSentryClientFactory;->logger:Lorg/slf4j/Logger;

    const-string v2, "Using an {} connection to Sentry."

    invoke-virtual {v0}, Ljava/lang/String;->toUpperCase()Ljava/lang/String;

    move-result-object v0

    invoke-interface {v1, v2, v0}, Lorg/slf4j/Logger;->debug(Ljava/lang/String;Ljava/lang/Object;)V

    .line 327
    invoke-virtual {p0, p1}, Lio/sentry/DefaultSentryClientFactory;->createHttpConnection(Lio/sentry/dsn/Dsn;)Lio/sentry/connection/Connection;

    move-result-object v0

    :goto_1
    move-object v2, v0

    const/4 v0, 0x0

    .line 339
    invoke-virtual {p0, p1}, Lio/sentry/DefaultSentryClientFactory;->getBufferEnabled(Lio/sentry/dsn/Dsn;)Z

    move-result v1

    if-eqz v1, :cond_4

    .line 340
    invoke-virtual {p0, p1}, Lio/sentry/DefaultSentryClientFactory;->getBuffer(Lio/sentry/dsn/Dsn;)Lio/sentry/buffer/Buffer;

    move-result-object v3

    if-eqz v3, :cond_4

    .line 342
    invoke-virtual {p0, p1}, Lio/sentry/DefaultSentryClientFactory;->getBufferFlushtime(Lio/sentry/dsn/Dsn;)J

    move-result-wide v4

    .line 343
    invoke-virtual {p0, p1}, Lio/sentry/DefaultSentryClientFactory;->getBufferedConnectionGracefulShutdownEnabled(Lio/sentry/dsn/Dsn;)Z

    move-result v6

    .line 344
    invoke-virtual {p0, p1}, Lio/sentry/DefaultSentryClientFactory;->getBufferedConnectionShutdownTimeout(Lio/sentry/dsn/Dsn;)J

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    .line 345
    new-instance v9, Lio/sentry/connection/BufferedConnection;

    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    move-result-wide v7

    move-object v1, v9

    invoke-direct/range {v1 .. v8}, Lio/sentry/connection/BufferedConnection;-><init>(Lio/sentry/connection/Connection;Lio/sentry/buffer/Buffer;JZJ)V

    move-object v0, v9

    move-object v2, v0

    .line 352
    :cond_4
    invoke-virtual {p0, p1}, Lio/sentry/DefaultSentryClientFactory;->getAsyncEnabled(Lio/sentry/dsn/Dsn;)Z

    move-result v1

    if-eqz v1, :cond_5

    .line 353
    invoke-virtual {p0, p1, v2}, Lio/sentry/DefaultSentryClientFactory;->createAsyncConnection(Lio/sentry/dsn/Dsn;Lio/sentry/connection/Connection;)Lio/sentry/connection/Connection;

    move-result-object v2

    :cond_5
    if-eqz v0, :cond_6

    .line 358
    invoke-virtual {v0, v2}, Lio/sentry/connection/BufferedConnection;->wrapConnectionWithBufferWriter(Lio/sentry/connection/Connection;)Lio/sentry/connection/Connection;

    move-result-object v2

    :cond_6
    return-object v2
.end method

.method protected createHttpConnection(Lio/sentry/dsn/Dsn;)Lio/sentry/connection/Connection;
    .locals 8

    .line 402
    invoke-virtual {p1}, Lio/sentry/dsn/Dsn;->getUri()Ljava/net/URI;

    move-result-object v0

    invoke-virtual {p1}, Lio/sentry/dsn/Dsn;->getProjectId()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lio/sentry/connection/HttpConnection;->getSentryApiUrl(Ljava/net/URI;Ljava/lang/String;)Ljava/net/URL;

    move-result-object v3

    .line 404
    invoke-virtual {p0, p1}, Lio/sentry/DefaultSentryClientFactory;->getProxyHost(Lio/sentry/dsn/Dsn;)Ljava/lang/String;

    move-result-object v0

    .line 405
    invoke-virtual {p0, p1}, Lio/sentry/DefaultSentryClientFactory;->getProxyUser(Lio/sentry/dsn/Dsn;)Ljava/lang/String;

    move-result-object v1

    .line 406
    invoke-virtual {p0, p1}, Lio/sentry/DefaultSentryClientFactory;->getProxyPass(Lio/sentry/dsn/Dsn;)Ljava/lang/String;

    move-result-object v2

    .line 407
    invoke-virtual {p0, p1}, Lio/sentry/DefaultSentryClientFactory;->getProxyPort(Lio/sentry/dsn/Dsn;)I

    move-result v4

    const/4 v5, 0x0

    if-eqz v0, :cond_1

    .line 411
    new-instance v6, Ljava/net/InetSocketAddress;

    invoke-direct {v6, v0, v4}, Ljava/net/InetSocketAddress;-><init>(Ljava/lang/String;I)V

    .line 412
    new-instance v0, Ljava/net/Proxy;

    sget-object v4, Ljava/net/Proxy$Type;->HTTP:Ljava/net/Proxy$Type;

    invoke-direct {v0, v4, v6}, Ljava/net/Proxy;-><init>(Ljava/net/Proxy$Type;Ljava/net/SocketAddress;)V

    if-eqz v1, :cond_0

    if-eqz v2, :cond_0

    .line 414
    new-instance v4, Lio/sentry/connection/ProxyAuthenticator;

    invoke-direct {v4, v1, v2}, Lio/sentry/connection/ProxyAuthenticator;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-static {v4}, Ljava/net/Authenticator;->setDefault(Ljava/net/Authenticator;)V

    :cond_0
    move-object v6, v0

    goto :goto_0

    :cond_1
    move-object v6, v5

    .line 418
    :goto_0
    invoke-virtual {p0, p1}, Lio/sentry/DefaultSentryClientFactory;->getSampleRate(Lio/sentry/dsn/Dsn;)Ljava/lang/Double;

    move-result-object v0

    if-eqz v0, :cond_2

    .line 421
    new-instance v1, Lio/sentry/connection/RandomEventSampler;

    invoke-virtual {v0}, Ljava/lang/Double;->doubleValue()D

    move-result-wide v4

    invoke-direct {v1, v4, v5}, Lio/sentry/connection/RandomEventSampler;-><init>(D)V

    move-object v7, v1

    goto :goto_1

    :cond_2
    move-object v7, v5

    .line 424
    :goto_1
    new-instance v0, Lio/sentry/connection/HttpConnection;

    invoke-virtual {p1}, Lio/sentry/dsn/Dsn;->getPublicKey()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {p1}, Lio/sentry/dsn/Dsn;->getSecretKey()Ljava/lang/String;

    move-result-object v5

    move-object v2, v0

    invoke-direct/range {v2 .. v7}, Lio/sentry/connection/HttpConnection;-><init>(Ljava/net/URL;Ljava/lang/String;Ljava/lang/String;Ljava/net/Proxy;Lio/sentry/connection/EventSampler;)V

    .line 427
    invoke-virtual {p0, p1}, Lio/sentry/DefaultSentryClientFactory;->createMarshaller(Lio/sentry/dsn/Dsn;)Lio/sentry/marshaller/Marshaller;

    move-result-object v1

    .line 428
    invoke-virtual {v0, v1}, Lio/sentry/connection/HttpConnection;->setMarshaller(Lio/sentry/marshaller/Marshaller;)V

    .line 430
    invoke-virtual {p0, p1}, Lio/sentry/DefaultSentryClientFactory;->getTimeout(Lio/sentry/dsn/Dsn;)I

    move-result v1

    .line 431
    invoke-virtual {v0, v1}, Lio/sentry/connection/HttpConnection;->setConnectionTimeout(I)V

    .line 433
    invoke-virtual {p0, p1}, Lio/sentry/DefaultSentryClientFactory;->getBypassSecurityEnabled(Lio/sentry/dsn/Dsn;)Z

    move-result p1

    .line 434
    invoke-virtual {v0, p1}, Lio/sentry/connection/HttpConnection;->setBypassSecurity(Z)V

    return-object v0
.end method

.method protected createJsonMarshaller(I)Lio/sentry/marshaller/json/JsonMarshaller;
    .locals 1

    .line 494
    new-instance v0, Lio/sentry/marshaller/json/JsonMarshaller;

    invoke-direct {v0, p1}, Lio/sentry/marshaller/json/JsonMarshaller;-><init>(I)V

    return-object v0
.end method

.method protected createMarshaller(Lio/sentry/dsn/Dsn;)Lio/sentry/marshaller/Marshaller;
    .locals 5

    .line 461
    invoke-virtual {p0, p1}, Lio/sentry/DefaultSentryClientFactory;->getMaxMessageLength(Lio/sentry/dsn/Dsn;)I

    move-result v0

    .line 462
    invoke-virtual {p0, v0}, Lio/sentry/DefaultSentryClientFactory;->createJsonMarshaller(I)Lio/sentry/marshaller/json/JsonMarshaller;

    move-result-object v1

    .line 465
    new-instance v2, Lio/sentry/marshaller/json/StackTraceInterfaceBinding;

    invoke-direct {v2}, Lio/sentry/marshaller/json/StackTraceInterfaceBinding;-><init>()V

    .line 467
    invoke-virtual {p0, p1}, Lio/sentry/DefaultSentryClientFactory;->getHideCommonFramesEnabled(Lio/sentry/dsn/Dsn;)Z

    move-result v3

    invoke-virtual {v2, v3}, Lio/sentry/marshaller/json/StackTraceInterfaceBinding;->setRemoveCommonFramesWithEnclosing(Z)V

    .line 468
    invoke-virtual {p0, p1}, Lio/sentry/DefaultSentryClientFactory;->getInAppFrames(Lio/sentry/dsn/Dsn;)Ljava/util/Collection;

    move-result-object v3

    invoke-virtual {v2, v3}, Lio/sentry/marshaller/json/StackTraceInterfaceBinding;->setInAppFrames(Ljava/util/Collection;)V

    .line 470
    const-class v3, Lio/sentry/event/interfaces/StackTraceInterface;

    invoke-virtual {v1, v3, v2}, Lio/sentry/marshaller/json/JsonMarshaller;->addInterfaceBinding(Ljava/lang/Class;Lio/sentry/marshaller/json/InterfaceBinding;)V

    .line 471
    const-class v3, Lio/sentry/event/interfaces/ExceptionInterface;

    new-instance v4, Lio/sentry/marshaller/json/ExceptionInterfaceBinding;

    invoke-direct {v4, v2}, Lio/sentry/marshaller/json/ExceptionInterfaceBinding;-><init>(Lio/sentry/marshaller/json/InterfaceBinding;)V

    invoke-virtual {v1, v3, v4}, Lio/sentry/marshaller/json/JsonMarshaller;->addInterfaceBinding(Ljava/lang/Class;Lio/sentry/marshaller/json/InterfaceBinding;)V

    .line 472
    const-class v2, Lio/sentry/event/interfaces/MessageInterface;

    new-instance v3, Lio/sentry/marshaller/json/MessageInterfaceBinding;

    invoke-direct {v3, v0}, Lio/sentry/marshaller/json/MessageInterfaceBinding;-><init>(I)V

    invoke-virtual {v1, v2, v3}, Lio/sentry/marshaller/json/JsonMarshaller;->addInterfaceBinding(Ljava/lang/Class;Lio/sentry/marshaller/json/InterfaceBinding;)V

    .line 473
    const-class v0, Lio/sentry/event/interfaces/UserInterface;

    new-instance v2, Lio/sentry/marshaller/json/UserInterfaceBinding;

    invoke-direct {v2}, Lio/sentry/marshaller/json/UserInterfaceBinding;-><init>()V

    invoke-virtual {v1, v0, v2}, Lio/sentry/marshaller/json/JsonMarshaller;->addInterfaceBinding(Ljava/lang/Class;Lio/sentry/marshaller/json/InterfaceBinding;)V

    .line 474
    const-class v0, Lio/sentry/event/interfaces/DebugMetaInterface;

    new-instance v2, Lio/sentry/marshaller/json/DebugMetaInterfaceBinding;

    invoke-direct {v2}, Lio/sentry/marshaller/json/DebugMetaInterfaceBinding;-><init>()V

    invoke-virtual {v1, v0, v2}, Lio/sentry/marshaller/json/JsonMarshaller;->addInterfaceBinding(Ljava/lang/Class;Lio/sentry/marshaller/json/InterfaceBinding;)V

    .line 475
    new-instance v0, Lio/sentry/marshaller/json/HttpInterfaceBinding;

    invoke-direct {v0}, Lio/sentry/marshaller/json/HttpInterfaceBinding;-><init>()V

    .line 478
    const-class v2, Lio/sentry/event/interfaces/HttpInterface;

    invoke-virtual {v1, v2, v0}, Lio/sentry/marshaller/json/JsonMarshaller;->addInterfaceBinding(Ljava/lang/Class;Lio/sentry/marshaller/json/InterfaceBinding;)V

    .line 481
    invoke-virtual {p0, p1}, Lio/sentry/DefaultSentryClientFactory;->getCompressionEnabled(Lio/sentry/dsn/Dsn;)Z

    move-result p1

    invoke-virtual {v1, p1}, Lio/sentry/marshaller/json/JsonMarshaller;->setCompression(Z)V

    return-object v1
.end method

.method public createSentryClient(Lio/sentry/dsn/Dsn;)Lio/sentry/SentryClient;
    .locals 4

    .line 236
    :try_start_0
    new-instance v0, Lio/sentry/SentryClient;

    invoke-virtual {p0, p1}, Lio/sentry/DefaultSentryClientFactory;->createConnection(Lio/sentry/dsn/Dsn;)Lio/sentry/connection/Connection;

    move-result-object v1

    invoke-virtual {p0, p1}, Lio/sentry/DefaultSentryClientFactory;->getContextManager(Lio/sentry/dsn/Dsn;)Lio/sentry/context/ContextManager;

    move-result-object v2

    invoke-direct {v0, v1, v2}, Lio/sentry/SentryClient;-><init>(Lio/sentry/connection/Connection;Lio/sentry/context/ContextManager;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_1

    :try_start_1
    const-string v1, "javax.servlet.ServletRequestListener"

    const/4 v2, 0x0

    .line 241
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v3

    invoke-static {v1, v2, v3}, Ljava/lang/Class;->forName(Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;

    .line 242
    new-instance v1, Lio/sentry/event/helper/HttpEventBuilderHelper;

    invoke-direct {v1}, Lio/sentry/event/helper/HttpEventBuilderHelper;-><init>()V

    invoke-virtual {v0, v1}, Lio/sentry/SentryClient;->addBuilderHelper(Lio/sentry/event/helper/EventBuilderHelper;)V
    :try_end_1
    .catch Ljava/lang/ClassNotFoundException; {:try_start_1 .. :try_end_1} :catch_0
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    goto :goto_0

    .line 244
    :catch_0
    :try_start_2
    sget-object v1, Lio/sentry/DefaultSentryClientFactory;->logger:Lorg/slf4j/Logger;

    const-string v2, "The current environment doesn\'t provide access to servlets, or provides an unsupported version."

    invoke-interface {v1, v2}, Lorg/slf4j/Logger;->debug(Ljava/lang/String;)V

    .line 247
    :goto_0
    new-instance v1, Lio/sentry/event/helper/ContextBuilderHelper;

    invoke-direct {v1, v0}, Lio/sentry/event/helper/ContextBuilderHelper;-><init>(Lio/sentry/SentryClient;)V

    invoke-virtual {v0, v1}, Lio/sentry/SentryClient;->addBuilderHelper(Lio/sentry/event/helper/EventBuilderHelper;)V

    .line 248
    invoke-virtual {p0, v0, p1}, Lio/sentry/DefaultSentryClientFactory;->configureSentryClient(Lio/sentry/SentryClient;Lio/sentry/dsn/Dsn;)Lio/sentry/SentryClient;

    move-result-object p1
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_1

    return-object p1

    :catch_1
    move-exception p1

    .line 250
    sget-object v0, Lio/sentry/DefaultSentryClientFactory;->logger:Lorg/slf4j/Logger;

    const-string v1, "Failed to initialize sentry, falling back to no-op client"

    invoke-interface {v0, v1, p1}, Lorg/slf4j/Logger;->error(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 251
    new-instance p1, Lio/sentry/SentryClient;

    new-instance v0, Lio/sentry/connection/NoopConnection;

    invoke-direct {v0}, Lio/sentry/connection/NoopConnection;-><init>()V

    new-instance v1, Lio/sentry/context/ThreadLocalContextManager;

    invoke-direct {v1}, Lio/sentry/context/ThreadLocalContextManager;-><init>()V

    invoke-direct {p1, v0, v1}, Lio/sentry/SentryClient;-><init>(Lio/sentry/connection/Connection;Lio/sentry/context/ContextManager;)V

    return-object p1
.end method

.method protected createStdOutConnection(Lio/sentry/dsn/Dsn;)Lio/sentry/connection/Connection;
    .locals 2

    .line 447
    new-instance v0, Lio/sentry/connection/OutputStreamConnection;

    sget-object v1, Ljava/lang/System;->out:Ljava/io/PrintStream;

    invoke-direct {v0, v1}, Lio/sentry/connection/OutputStreamConnection;-><init>(Ljava/io/OutputStream;)V

    .line 449
    invoke-virtual {p0, p1}, Lio/sentry/DefaultSentryClientFactory;->createMarshaller(Lio/sentry/dsn/Dsn;)Lio/sentry/marshaller/Marshaller;

    move-result-object p1

    invoke-virtual {v0, p1}, Lio/sentry/connection/OutputStreamConnection;->setMarshaller(Lio/sentry/marshaller/Marshaller;)V

    return-object v0
.end method

.method protected getAsyncEnabled(Lio/sentry/dsn/Dsn;)Z
    .locals 2

    .line 548
    sget-object v0, Lio/sentry/DefaultSentryClientFactory;->FALSE:Ljava/lang/String;

    const-string v1, "async"

    invoke-static {v1, p1}, Lio/sentry/config/Lookup;->lookup(Ljava/lang/String;Lio/sentry/dsn/Dsn;)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result p1

    xor-int/lit8 p1, p1, 0x1

    return p1
.end method

.method protected getAsyncGracefulShutdownEnabled(Lio/sentry/dsn/Dsn;)Z
    .locals 2

    .line 621
    sget-object v0, Lio/sentry/DefaultSentryClientFactory;->FALSE:Ljava/lang/String;

    const-string v1, "async.gracefulshutdown"

    invoke-static {v1, p1}, Lio/sentry/config/Lookup;->lookup(Ljava/lang/String;Lio/sentry/dsn/Dsn;)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result p1

    xor-int/lit8 p1, p1, 0x1

    return p1
.end method

.method protected getAsyncPriority(Lio/sentry/dsn/Dsn;)I
    .locals 1

    const-string v0, "async.priority"

    .line 641
    invoke-static {v0, p1}, Lio/sentry/config/Lookup;->lookup(Ljava/lang/String;Lio/sentry/dsn/Dsn;)Ljava/lang/String;

    move-result-object p1

    const/4 v0, 0x1

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-static {p1, v0}, Lio/sentry/util/Util;->parseInteger(Ljava/lang/String;Ljava/lang/Integer;)Ljava/lang/Integer;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    return p1
.end method

.method protected getAsyncQueueSize(Lio/sentry/dsn/Dsn;)I
    .locals 1

    const-string v0, "async.queuesize"

    .line 631
    invoke-static {v0, p1}, Lio/sentry/config/Lookup;->lookup(Ljava/lang/String;Lio/sentry/dsn/Dsn;)Ljava/lang/String;

    move-result-object p1

    const/16 v0, 0x32

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-static {p1, v0}, Lio/sentry/util/Util;->parseInteger(Ljava/lang/String;Ljava/lang/Integer;)Ljava/lang/Integer;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    return p1
.end method

.method protected getAsyncShutdownTimeout(Lio/sentry/dsn/Dsn;)J
    .locals 2

    const-string v0, "async.shutdowntimeout"

    .line 611
    invoke-static {v0, p1}, Lio/sentry/config/Lookup;->lookup(Ljava/lang/String;Lio/sentry/dsn/Dsn;)Ljava/lang/String;

    move-result-object p1

    sget-wide v0, Lio/sentry/DefaultSentryClientFactory;->ASYNC_SHUTDOWN_TIMEOUT_DEFAULT:J

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    invoke-static {p1, v0}, Lio/sentry/util/Util;->parseLong(Ljava/lang/String;Ljava/lang/Long;)Ljava/lang/Long;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Long;->longValue()J

    move-result-wide v0

    return-wide v0
.end method

.method protected getAsyncThreads(Lio/sentry/dsn/Dsn;)I
    .locals 1

    const-string v0, "async.threads"

    .line 651
    invoke-static {v0, p1}, Lio/sentry/config/Lookup;->lookup(Ljava/lang/String;Lio/sentry/dsn/Dsn;)Ljava/lang/String;

    move-result-object p1

    invoke-static {}, Ljava/lang/Runtime;->getRuntime()Ljava/lang/Runtime;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Runtime;->availableProcessors()I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-static {p1, v0}, Lio/sentry/util/Util;->parseInteger(Ljava/lang/String;Ljava/lang/Integer;)Ljava/lang/Integer;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    return p1
.end method

.method protected getBuffer(Lio/sentry/dsn/Dsn;)Lio/sentry/buffer/Buffer;
    .locals 3

    const-string v0, "buffer.dir"

    .line 872
    invoke-static {v0, p1}, Lio/sentry/config/Lookup;->lookup(Ljava/lang/String;Lio/sentry/dsn/Dsn;)Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 874
    new-instance v1, Lio/sentry/buffer/DiskBuffer;

    new-instance v2, Ljava/io/File;

    invoke-direct {v2, v0}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    invoke-virtual {p0, p1}, Lio/sentry/DefaultSentryClientFactory;->getBufferSize(Lio/sentry/dsn/Dsn;)I

    move-result p1

    invoke-direct {v1, v2, p1}, Lio/sentry/buffer/DiskBuffer;-><init>(Ljava/io/File;I)V

    return-object v1

    :cond_0
    const/4 p1, 0x0

    return-object p1
.end method

.method protected getBufferEnabled(Lio/sentry/dsn/Dsn;)Z
    .locals 1

    const-string v0, "buffer.enabled"

    .line 858
    invoke-static {v0, p1}, Lio/sentry/config/Lookup;->lookup(Ljava/lang/String;Lio/sentry/dsn/Dsn;)Ljava/lang/String;

    move-result-object p1

    if-eqz p1, :cond_0

    .line 860
    invoke-static {p1}, Ljava/lang/Boolean;->parseBoolean(Ljava/lang/String;)Z

    move-result p1

    return p1

    :cond_0
    const/4 p1, 0x1

    return p1
.end method

.method protected getBufferFlushtime(Lio/sentry/dsn/Dsn;)J
    .locals 2

    const-string v0, "buffer.flushtime"

    .line 601
    invoke-static {v0, p1}, Lio/sentry/config/Lookup;->lookup(Ljava/lang/String;Lio/sentry/dsn/Dsn;)Ljava/lang/String;

    move-result-object p1

    const-wide/32 v0, 0xea60

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    invoke-static {p1, v0}, Lio/sentry/util/Util;->parseLong(Ljava/lang/String;Ljava/lang/Long;)Ljava/lang/Long;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Long;->longValue()J

    move-result-wide v0

    return-wide v0
.end method

.method protected getBufferSize(Lio/sentry/dsn/Dsn;)I
    .locals 1

    const-string v0, "buffer.size"

    .line 886
    invoke-static {v0, p1}, Lio/sentry/config/Lookup;->lookup(Ljava/lang/String;Lio/sentry/dsn/Dsn;)Ljava/lang/String;

    move-result-object p1

    const/16 v0, 0xa

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-static {p1, v0}, Lio/sentry/util/Util;->parseInteger(Ljava/lang/String;Ljava/lang/Integer;)Ljava/lang/Integer;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    return p1
.end method

.method protected getBufferedConnectionGracefulShutdownEnabled(Lio/sentry/dsn/Dsn;)Z
    .locals 2

    .line 591
    sget-object v0, Lio/sentry/DefaultSentryClientFactory;->FALSE:Ljava/lang/String;

    const-string v1, "buffer.gracefulshutdown"

    invoke-static {v1, p1}, Lio/sentry/config/Lookup;->lookup(Ljava/lang/String;Lio/sentry/dsn/Dsn;)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result p1

    xor-int/lit8 p1, p1, 0x1

    return p1
.end method

.method protected getBufferedConnectionShutdownTimeout(Lio/sentry/dsn/Dsn;)J
    .locals 2

    const-string v0, "buffer.shutdowntimeout"

    .line 581
    invoke-static {v0, p1}, Lio/sentry/config/Lookup;->lookup(Ljava/lang/String;Lio/sentry/dsn/Dsn;)Ljava/lang/String;

    move-result-object p1

    sget-wide v0, Lio/sentry/DefaultSentryClientFactory;->BUFFER_SHUTDOWN_TIMEOUT_DEFAULT:J

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    invoke-static {p1, v0}, Lio/sentry/util/Util;->parseLong(Ljava/lang/String;Ljava/lang/Long;)Ljava/lang/Long;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Long;->longValue()J

    move-result-wide v0

    return-wide v0
.end method

.method protected getBypassSecurityEnabled(Lio/sentry/dsn/Dsn;)Z
    .locals 1

    .line 662
    invoke-virtual {p1}, Lio/sentry/dsn/Dsn;->getProtocolSettings()Ljava/util/Set;

    move-result-object p1

    const-string v0, "naive"

    invoke-interface {p1, v0}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result p1

    return p1
.end method

.method protected getCompressionEnabled(Lio/sentry/dsn/Dsn;)Z
    .locals 2

    .line 817
    sget-object v0, Lio/sentry/DefaultSentryClientFactory;->FALSE:Ljava/lang/String;

    const-string v1, "compression"

    invoke-static {v1, p1}, Lio/sentry/config/Lookup;->lookup(Ljava/lang/String;Lio/sentry/dsn/Dsn;)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result p1

    xor-int/lit8 p1, p1, 0x1

    return p1
.end method

.method protected getContextManager(Lio/sentry/dsn/Dsn;)Lio/sentry/context/ContextManager;
    .locals 0

    .line 507
    new-instance p1, Lio/sentry/context/ThreadLocalContextManager;

    invoke-direct {p1}, Lio/sentry/context/ThreadLocalContextManager;-><init>()V

    return-object p1
.end method

.method protected getDist(Lio/sentry/dsn/Dsn;)Ljava/lang/String;
    .locals 1

    const-string v0, "dist"

    .line 734
    invoke-static {v0, p1}, Lio/sentry/config/Lookup;->lookup(Ljava/lang/String;Lio/sentry/dsn/Dsn;)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method protected getEnvironment(Lio/sentry/dsn/Dsn;)Ljava/lang/String;
    .locals 1

    const-string v0, "environment"

    .line 745
    invoke-static {v0, p1}, Lio/sentry/config/Lookup;->lookup(Ljava/lang/String;Lio/sentry/dsn/Dsn;)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method protected getExtra(Lio/sentry/dsn/Dsn;)Ljava/util/Map;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/sentry/dsn/Dsn;",
            ")",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    const-string v0, "extra"

    .line 807
    invoke-static {v0, p1}, Lio/sentry/config/Lookup;->lookup(Ljava/lang/String;Lio/sentry/dsn/Dsn;)Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Lio/sentry/util/Util;->parseExtra(Ljava/lang/String;)Ljava/util/Map;

    move-result-object p1

    return-object p1
.end method

.method protected getExtraTags(Lio/sentry/dsn/Dsn;)Ljava/util/Set;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/sentry/dsn/Dsn;",
            ")",
            "Ljava/util/Set<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 778
    invoke-virtual {p0, p1}, Lio/sentry/DefaultSentryClientFactory;->getMdcTags(Lio/sentry/dsn/Dsn;)Ljava/util/Set;

    move-result-object p1

    return-object p1
.end method

.method protected getHideCommonFramesEnabled(Lio/sentry/dsn/Dsn;)Z
    .locals 2

    .line 827
    sget-object v0, Lio/sentry/DefaultSentryClientFactory;->FALSE:Ljava/lang/String;

    const-string v1, "stacktrace.hidecommon"

    invoke-static {v1, p1}, Lio/sentry/config/Lookup;->lookup(Ljava/lang/String;Lio/sentry/dsn/Dsn;)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result p1

    xor-int/lit8 p1, p1, 0x1

    return p1
.end method

.method protected getInAppFrames(Lio/sentry/dsn/Dsn;)Ljava/util/Collection;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/sentry/dsn/Dsn;",
            ")",
            "Ljava/util/Collection<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    const-string v0, "stacktrace.app.packages"

    .line 520
    invoke-static {v0, p1}, Lio/sentry/config/Lookup;->lookup(Ljava/lang/String;Lio/sentry/dsn/Dsn;)Ljava/lang/String;

    move-result-object p1

    .line 521
    invoke-static {p1}, Lio/sentry/util/Util;->isNullOrEmpty(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_1

    if-nez p1, :cond_0

    .line 524
    sget-object p1, Lio/sentry/DefaultSentryClientFactory;->logger:Lorg/slf4j/Logger;

    const-string v0, "No \'stacktrace.app.packages\' was configured, this option is highly recommended as it affects stacktrace grouping and display on Sentry. See documentation: https://docs.sentry.io/clients/java/config/#in-application-stack-frames"

    invoke-interface {p1, v0}, Lorg/slf4j/Logger;->warn(Ljava/lang/String;)V

    .line 528
    :cond_0
    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object p1

    return-object p1

    .line 531
    :cond_1
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    const-string v1, ","

    .line 532
    invoke-virtual {p1, v1}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object p1

    array-length v1, p1

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v1, :cond_3

    aget-object v3, p1, v2

    .line 533
    invoke-virtual {v3}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v4

    const-string v5, ""

    invoke-virtual {v4, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_2

    .line 534
    invoke-interface {v0, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :cond_2
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_3
    return-object v0
.end method

.method protected getMaxMessageLength(Lio/sentry/dsn/Dsn;)I
    .locals 1

    const-string v0, "maxmessagelength"

    .line 837
    invoke-static {v0, p1}, Lio/sentry/config/Lookup;->lookup(Ljava/lang/String;Lio/sentry/dsn/Dsn;)Ljava/lang/String;

    move-result-object p1

    const/16 v0, 0x3e8

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-static {p1, v0}, Lio/sentry/util/Util;->parseInteger(Ljava/lang/String;Ljava/lang/Integer;)Ljava/lang/Integer;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    return p1
.end method

.method protected getMdcTags(Lio/sentry/dsn/Dsn;)Ljava/util/Set;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/sentry/dsn/Dsn;",
            ")",
            "Ljava/util/Set<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    const-string v0, "mdctags"

    .line 788
    invoke-static {v0, p1}, Lio/sentry/config/Lookup;->lookup(Ljava/lang/String;Lio/sentry/dsn/Dsn;)Ljava/lang/String;

    move-result-object v0

    .line 789
    invoke-static {v0}, Lio/sentry/util/Util;->isNullOrEmpty(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_0

    const-string v0, "extratags"

    .line 790
    invoke-static {v0, p1}, Lio/sentry/config/Lookup;->lookup(Ljava/lang/String;Lio/sentry/dsn/Dsn;)Ljava/lang/String;

    move-result-object v0

    .line 791
    invoke-static {v0}, Lio/sentry/util/Util;->isNullOrEmpty(Ljava/lang/String;)Z

    move-result p1

    if-nez p1, :cond_0

    .line 792
    sget-object p1, Lio/sentry/DefaultSentryClientFactory;->logger:Lorg/slf4j/Logger;

    const-string v1, "The \'extratags\' option is deprecated, please use the \'mdctags\' option instead."

    invoke-interface {p1, v1}, Lorg/slf4j/Logger;->warn(Ljava/lang/String;)V

    .line 797
    :cond_0
    invoke-static {v0}, Lio/sentry/util/Util;->parseMdcTags(Ljava/lang/String;)Ljava/util/Set;

    move-result-object p1

    return-object p1
.end method

.method protected getProxyHost(Lio/sentry/dsn/Dsn;)Ljava/lang/String;
    .locals 1

    const-string v0, "http.proxy.host"

    .line 692
    invoke-static {v0, p1}, Lio/sentry/config/Lookup;->lookup(Ljava/lang/String;Lio/sentry/dsn/Dsn;)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method protected getProxyPass(Lio/sentry/dsn/Dsn;)Ljava/lang/String;
    .locals 1

    const-string v0, "http.proxy.password"

    .line 712
    invoke-static {v0, p1}, Lio/sentry/config/Lookup;->lookup(Ljava/lang/String;Lio/sentry/dsn/Dsn;)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method protected getProxyPort(Lio/sentry/dsn/Dsn;)I
    .locals 1

    const-string v0, "http.proxy.port"

    .line 682
    invoke-static {v0, p1}, Lio/sentry/config/Lookup;->lookup(Ljava/lang/String;Lio/sentry/dsn/Dsn;)Ljava/lang/String;

    move-result-object p1

    const/16 v0, 0x50

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-static {p1, v0}, Lio/sentry/util/Util;->parseInteger(Ljava/lang/String;Ljava/lang/Integer;)Ljava/lang/Integer;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    return p1
.end method

.method protected getProxyUser(Lio/sentry/dsn/Dsn;)Ljava/lang/String;
    .locals 1

    const-string v0, "http.proxy.user"

    .line 702
    invoke-static {v0, p1}, Lio/sentry/config/Lookup;->lookup(Ljava/lang/String;Lio/sentry/dsn/Dsn;)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method protected getRejectedExecutionHandler(Lio/sentry/dsn/Dsn;)Ljava/util/concurrent/RejectedExecutionHandler;
    .locals 4

    const-string v0, "discardold"

    const-string v1, "async.queue.overflow"

    .line 559
    invoke-static {v1, p1}, Lio/sentry/config/Lookup;->lookup(Ljava/lang/String;Lio/sentry/dsn/Dsn;)Ljava/lang/String;

    move-result-object p1

    .line 560
    invoke-static {p1}, Lio/sentry/util/Util;->isNullOrEmpty(Ljava/lang/String;)Z

    move-result v1

    if-nez v1, :cond_0

    .line 561
    invoke-virtual {p1}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    move-result-object v0

    .line 564
    :cond_0
    sget-object p1, Lio/sentry/DefaultSentryClientFactory;->REJECT_EXECUTION_HANDLERS:Ljava/util/Map;

    invoke-interface {p1, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/util/concurrent/RejectedExecutionHandler;

    if-nez p1, :cond_1

    .line 566
    sget-object p1, Lio/sentry/DefaultSentryClientFactory;->REJECT_EXECUTION_HANDLERS:Ljava/util/Map;

    invoke-interface {p1}, Ljava/util/Map;->keySet()Ljava/util/Set;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/Set;->toArray()[Ljava/lang/Object;

    move-result-object p1

    invoke-static {p1}, Ljava/util/Arrays;->toString([Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    .line 567
    new-instance v1, Ljava/lang/RuntimeException;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "RejectedExecutionHandler not found: \'"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, "\', valid choices are: "

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v1, p1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_1
    return-object p1
.end method

.method protected getRelease(Lio/sentry/dsn/Dsn;)Ljava/lang/String;
    .locals 1

    const-string v0, "release"

    .line 723
    invoke-static {v0, p1}, Lio/sentry/config/Lookup;->lookup(Ljava/lang/String;Lio/sentry/dsn/Dsn;)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method protected getSampleRate(Lio/sentry/dsn/Dsn;)Ljava/lang/Double;
    .locals 1

    const-string v0, "sample.rate"

    .line 672
    invoke-static {v0, p1}, Lio/sentry/config/Lookup;->lookup(Ljava/lang/String;Lio/sentry/dsn/Dsn;)Ljava/lang/String;

    move-result-object p1

    const/4 v0, 0x0

    invoke-static {p1, v0}, Lio/sentry/util/Util;->parseDouble(Ljava/lang/String;Ljava/lang/Double;)Ljava/lang/Double;

    move-result-object p1

    return-object p1
.end method

.method protected getServerName(Lio/sentry/dsn/Dsn;)Ljava/lang/String;
    .locals 1

    const-string v0, "servername"

    .line 756
    invoke-static {v0, p1}, Lio/sentry/config/Lookup;->lookup(Ljava/lang/String;Lio/sentry/dsn/Dsn;)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method protected getTags(Lio/sentry/dsn/Dsn;)Ljava/util/Map;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/sentry/dsn/Dsn;",
            ")",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    const-string v0, "tags"

    .line 766
    invoke-static {v0, p1}, Lio/sentry/config/Lookup;->lookup(Ljava/lang/String;Lio/sentry/dsn/Dsn;)Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Lio/sentry/util/Util;->parseTags(Ljava/lang/String;)Ljava/util/Map;

    move-result-object p1

    return-object p1
.end method

.method protected getTimeout(Lio/sentry/dsn/Dsn;)I
    .locals 1

    const-string v0, "timeout"

    .line 848
    invoke-static {v0, p1}, Lio/sentry/config/Lookup;->lookup(Ljava/lang/String;Lio/sentry/dsn/Dsn;)Ljava/lang/String;

    move-result-object p1

    sget v0, Lio/sentry/DefaultSentryClientFactory;->TIMEOUT_DEFAULT:I

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-static {p1, v0}, Lio/sentry/util/Util;->parseInteger(Ljava/lang/String;Ljava/lang/Integer;)Ljava/lang/Integer;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    return p1
.end method

.method protected getUncaughtHandlerEnabled(Lio/sentry/dsn/Dsn;)Z
    .locals 2

    .line 896
    sget-object v0, Lio/sentry/DefaultSentryClientFactory;->FALSE:Ljava/lang/String;

    const-string v1, "uncaught.handler.enabled"

    invoke-static {v1, p1}, Lio/sentry/config/Lookup;->lookup(Ljava/lang/String;Lio/sentry/dsn/Dsn;)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result p1

    xor-int/lit8 p1, p1, 0x1

    return p1
.end method
