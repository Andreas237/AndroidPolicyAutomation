.class public Lcom/shopkick/logging/RemoteAppender;
.super Lcom/shopkick/logging/AppenderBase;
.source "RemoteAppender.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/shopkick/logging/RemoteAppender$SendingThread;,
        Lcom/shopkick/logging/RemoteAppender$EnqueuingThread;,
        Lcom/shopkick/logging/RemoteAppender$ThreadState;
    }
.end annotation


# static fields
.field public static final APPENDER_TAG:Ljava/lang/String;

.field private static volatile Instance:Lcom/shopkick/logging/RemoteAppender; = null

.field private static final InstanceLock:Ljava/lang/Object;

.field private static final LOG_TAG:Ljava/lang/String;

.field private static final MaxEnqueuingBufferSize:I = 0x3e8

.field private static final MaxExitTimeInMilliseconds:I = 0xbb8

.field public static final MaxSendingBatchSize:I = 0x64

.field private static final MaxSendingBufferSize:I = 0x2710

.field private static final maxWaitTime:Ljava/lang/Long;


# instance fields
.field private volatile approximateSendingBufferSize:J

.field private final checkMaxWaitTimeElapsed:Ljava/lang/Runnable;

.field private final context:Landroid/content/Context;

.field private volatile enqueuingConsumerThread:Lcom/shopkick/logging/RemoteAppender$EnqueuingThread;

.field private volatile enqueuingThreadState:Lcom/shopkick/logging/RemoteAppender$ThreadState;

.field private final enqueuingWaitMonitor:Ljava/lang/Object;

.field private lastLoggedTime:J

.field private loggingEndPoint:Ljava/lang/String;

.field private maxEnqueuingWaitIntervalInMilliseconds:J

.field private maxSendingWaitIntervalInMilliseconds:J

.field private messagesToEnqueue:Ljava/util/concurrent/ConcurrentLinkedQueue;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/concurrent/ConcurrentLinkedQueue<",
            "Lcom/shopkick/logging/Message;",
            ">;"
        }
    .end annotation
.end field

.field private volatile requestEnqueuingThreadExit:Z

.field private volatile requestSendingThreadExit:Z

.field private scheduledFuture:Ljava/util/concurrent/ScheduledFuture;

.field private final scheduler:Ljava/util/concurrent/ScheduledExecutorService;

.field private volatile sendingConsumerThread:Lcom/shopkick/logging/RemoteAppender$SendingThread;

.field private volatile sendingThreadState:Lcom/shopkick/logging/RemoteAppender$ThreadState;

.field private final sendingWaitMonitor:Ljava/lang/Object;

.field private final startStopLock:Ljava/lang/Object;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 48
    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Lcom/shopkick/logging/RemoteAppender;->InstanceLock:Ljava/lang/Object;

    .line 90
    const-class v0, Lcom/shopkick/logging/RemoteAppender;

    invoke-virtual {v0}, Ljava/lang/Class;->getCanonicalName()Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lcom/shopkick/logging/RemoteAppender;->APPENDER_TAG:Ljava/lang/String;

    .line 112
    const-class v0, Lcom/shopkick/logging/RemoteAppender;

    invoke-virtual {v0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lcom/shopkick/logging/RemoteAppender;->LOG_TAG:Ljava/lang/String;

    const-wide/32 v0, 0x493e0

    .line 142
    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    sput-object v0, Lcom/shopkick/logging/RemoteAppender;->maxWaitTime:Ljava/lang/Long;

    return-void
.end method

.method private constructor <init>(Landroid/content/Context;)V
    .locals 6

    .line 33
    invoke-direct {p0}, Lcom/shopkick/logging/AppenderBase;-><init>()V

    .line 115
    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    iput-object v0, p0, Lcom/shopkick/logging/RemoteAppender;->startStopLock:Ljava/lang/Object;

    .line 117
    new-instance v0, Ljava/util/concurrent/ConcurrentLinkedQueue;

    invoke-direct {v0}, Ljava/util/concurrent/ConcurrentLinkedQueue;-><init>()V

    iput-object v0, p0, Lcom/shopkick/logging/RemoteAppender;->messagesToEnqueue:Ljava/util/concurrent/ConcurrentLinkedQueue;

    .line 118
    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    iput-object v0, p0, Lcom/shopkick/logging/RemoteAppender;->enqueuingWaitMonitor:Ljava/lang/Object;

    const/4 v0, 0x0

    .line 119
    iput-boolean v0, p0, Lcom/shopkick/logging/RemoteAppender;->requestEnqueuingThreadExit:Z

    .line 120
    sget-object v1, Lcom/shopkick/logging/RemoteAppender$ThreadState;->STOPPED:Lcom/shopkick/logging/RemoteAppender$ThreadState;

    iput-object v1, p0, Lcom/shopkick/logging/RemoteAppender;->enqueuingThreadState:Lcom/shopkick/logging/RemoteAppender$ThreadState;

    const/4 v1, 0x0

    .line 121
    iput-object v1, p0, Lcom/shopkick/logging/RemoteAppender;->enqueuingConsumerThread:Lcom/shopkick/logging/RemoteAppender$EnqueuingThread;

    const-wide/32 v2, 0xea60

    .line 122
    iput-wide v2, p0, Lcom/shopkick/logging/RemoteAppender;->maxEnqueuingWaitIntervalInMilliseconds:J

    .line 124
    new-instance v4, Ljava/lang/Object;

    invoke-direct {v4}, Ljava/lang/Object;-><init>()V

    iput-object v4, p0, Lcom/shopkick/logging/RemoteAppender;->sendingWaitMonitor:Ljava/lang/Object;

    .line 125
    iput-boolean v0, p0, Lcom/shopkick/logging/RemoteAppender;->requestSendingThreadExit:Z

    .line 126
    sget-object v0, Lcom/shopkick/logging/RemoteAppender$ThreadState;->STOPPED:Lcom/shopkick/logging/RemoteAppender$ThreadState;

    iput-object v0, p0, Lcom/shopkick/logging/RemoteAppender;->sendingThreadState:Lcom/shopkick/logging/RemoteAppender$ThreadState;

    .line 127
    iput-object v1, p0, Lcom/shopkick/logging/RemoteAppender;->sendingConsumerThread:Lcom/shopkick/logging/RemoteAppender$SendingThread;

    const-wide/16 v4, 0x0

    .line 128
    iput-wide v4, p0, Lcom/shopkick/logging/RemoteAppender;->approximateSendingBufferSize:J

    .line 129
    iput-wide v2, p0, Lcom/shopkick/logging/RemoteAppender;->maxSendingWaitIntervalInMilliseconds:J

    .line 131
    iput-object v1, p0, Lcom/shopkick/logging/RemoteAppender;->loggingEndPoint:Ljava/lang/String;

    .line 136
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    iput-wide v0, p0, Lcom/shopkick/logging/RemoteAppender;->lastLoggedTime:J

    const/4 v0, 0x1

    .line 144
    invoke-static {v0}, Ljava/util/concurrent/Executors;->newScheduledThreadPool(I)Ljava/util/concurrent/ScheduledExecutorService;

    move-result-object v0

    iput-object v0, p0, Lcom/shopkick/logging/RemoteAppender;->scheduler:Ljava/util/concurrent/ScheduledExecutorService;

    .line 151
    new-instance v0, Lcom/shopkick/logging/RemoteAppender$1;

    invoke-direct {v0, p0}, Lcom/shopkick/logging/RemoteAppender$1;-><init>(Lcom/shopkick/logging/RemoteAppender;)V

    iput-object v0, p0, Lcom/shopkick/logging/RemoteAppender;->checkMaxWaitTimeElapsed:Ljava/lang/Runnable;

    .line 34
    iput-object p1, p0, Lcom/shopkick/logging/RemoteAppender;->context:Landroid/content/Context;

    const-string v0, "https://sdk.shopkick.com/sdk/v1/log/client_log"

    .line 38
    iput-object v0, p0, Lcom/shopkick/logging/RemoteAppender;->loggingEndPoint:Ljava/lang/String;

    .line 40
    invoke-static {p1}, Lcom/shopkick/logging/DbMessagePersistence;->initialize(Landroid/content/Context;)V

    .line 41
    invoke-virtual {p0}, Lcom/shopkick/logging/RemoteAppender;->startLogging()Z

    .line 43
    iget-object p1, p0, Lcom/shopkick/logging/RemoteAppender;->scheduler:Ljava/util/concurrent/ScheduledExecutorService;

    iget-object v0, p0, Lcom/shopkick/logging/RemoteAppender;->checkMaxWaitTimeElapsed:Ljava/lang/Runnable;

    sget-object v1, Lcom/shopkick/logging/RemoteAppender;->maxWaitTime:Ljava/lang/Long;

    invoke-virtual {v1}, Ljava/lang/Long;->longValue()J

    move-result-wide v1

    sget-object v3, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    invoke-interface {p1, v0, v1, v2, v3}, Ljava/util/concurrent/ScheduledExecutorService;->schedule(Ljava/lang/Runnable;JLjava/util/concurrent/TimeUnit;)Ljava/util/concurrent/ScheduledFuture;

    move-result-object p1

    iput-object p1, p0, Lcom/shopkick/logging/RemoteAppender;->scheduledFuture:Ljava/util/concurrent/ScheduledFuture;

    return-void
.end method

.method static synthetic access$000(Lcom/shopkick/logging/RemoteAppender;)J
    .locals 2

    .line 30
    iget-wide v0, p0, Lcom/shopkick/logging/RemoteAppender;->lastLoggedTime:J

    return-wide v0
.end method

.method static synthetic access$100()Ljava/lang/Long;
    .locals 1

    .line 30
    sget-object v0, Lcom/shopkick/logging/RemoteAppender;->maxWaitTime:Ljava/lang/Long;

    return-object v0
.end method

.method static synthetic access$1000(Lcom/shopkick/logging/RemoteAppender;)Lcom/shopkick/logging/RemoteAppender$ThreadState;
    .locals 0

    .line 30
    iget-object p0, p0, Lcom/shopkick/logging/RemoteAppender;->sendingThreadState:Lcom/shopkick/logging/RemoteAppender$ThreadState;

    return-object p0
.end method

.method static synthetic access$1002(Lcom/shopkick/logging/RemoteAppender;Lcom/shopkick/logging/RemoteAppender$ThreadState;)Lcom/shopkick/logging/RemoteAppender$ThreadState;
    .locals 0

    .line 30
    iput-object p1, p0, Lcom/shopkick/logging/RemoteAppender;->sendingThreadState:Lcom/shopkick/logging/RemoteAppender$ThreadState;

    return-object p1
.end method

.method static synthetic access$1100(Lcom/shopkick/logging/RemoteAppender;)Ljava/lang/Object;
    .locals 0

    .line 30
    iget-object p0, p0, Lcom/shopkick/logging/RemoteAppender;->enqueuingWaitMonitor:Ljava/lang/Object;

    return-object p0
.end method

.method static synthetic access$1200(Lcom/shopkick/logging/RemoteAppender;)J
    .locals 2

    .line 30
    iget-wide v0, p0, Lcom/shopkick/logging/RemoteAppender;->maxEnqueuingWaitIntervalInMilliseconds:J

    return-wide v0
.end method

.method static synthetic access$1300(Lcom/shopkick/logging/RemoteAppender;)Z
    .locals 0

    .line 30
    iget-boolean p0, p0, Lcom/shopkick/logging/RemoteAppender;->requestSendingThreadExit:Z

    return p0
.end method

.method static synthetic access$1400(Lcom/shopkick/logging/RemoteAppender;Ljava/util/TreeMap;)Z
    .locals 0

    .line 30
    invoke-direct {p0, p1}, Lcom/shopkick/logging/RemoteAppender;->pushLogMessages(Ljava/util/TreeMap;)Z

    move-result p0

    return p0
.end method

.method static synthetic access$1500(Lcom/shopkick/logging/RemoteAppender;)J
    .locals 2

    .line 30
    iget-wide v0, p0, Lcom/shopkick/logging/RemoteAppender;->maxSendingWaitIntervalInMilliseconds:J

    return-wide v0
.end method

.method static synthetic access$200(Lcom/shopkick/logging/RemoteAppender;)Ljava/lang/Object;
    .locals 0

    .line 30
    iget-object p0, p0, Lcom/shopkick/logging/RemoteAppender;->sendingWaitMonitor:Ljava/lang/Object;

    return-object p0
.end method

.method static synthetic access$300()Ljava/lang/String;
    .locals 1

    .line 30
    sget-object v0, Lcom/shopkick/logging/RemoteAppender;->LOG_TAG:Ljava/lang/String;

    return-object v0
.end method

.method static synthetic access$602(Lcom/shopkick/logging/RemoteAppender;Lcom/shopkick/logging/RemoteAppender$ThreadState;)Lcom/shopkick/logging/RemoteAppender$ThreadState;
    .locals 0

    .line 30
    iput-object p1, p0, Lcom/shopkick/logging/RemoteAppender;->enqueuingThreadState:Lcom/shopkick/logging/RemoteAppender$ThreadState;

    return-object p1
.end method

.method static synthetic access$700(Lcom/shopkick/logging/RemoteAppender;)Z
    .locals 0

    .line 30
    iget-boolean p0, p0, Lcom/shopkick/logging/RemoteAppender;->requestEnqueuingThreadExit:Z

    return p0
.end method

.method static synthetic access$800(Lcom/shopkick/logging/RemoteAppender;)Ljava/util/concurrent/ConcurrentLinkedQueue;
    .locals 0

    .line 30
    iget-object p0, p0, Lcom/shopkick/logging/RemoteAppender;->messagesToEnqueue:Ljava/util/concurrent/ConcurrentLinkedQueue;

    return-object p0
.end method

.method static synthetic access$900(Lcom/shopkick/logging/RemoteAppender;)J
    .locals 2

    .line 30
    iget-wide v0, p0, Lcom/shopkick/logging/RemoteAppender;->approximateSendingBufferSize:J

    return-wide v0
.end method

.method static synthetic access$902(Lcom/shopkick/logging/RemoteAppender;J)J
    .locals 0

    .line 30
    iput-wide p1, p0, Lcom/shopkick/logging/RemoteAppender;->approximateSendingBufferSize:J

    return-wide p1
.end method

.method static synthetic access$908(Lcom/shopkick/logging/RemoteAppender;)J
    .locals 4

    .line 30
    iget-wide v0, p0, Lcom/shopkick/logging/RemoteAppender;->approximateSendingBufferSize:J

    const-wide/16 v2, 0x1

    add-long/2addr v2, v0

    iput-wide v2, p0, Lcom/shopkick/logging/RemoteAppender;->approximateSendingBufferSize:J

    return-wide v0
.end method

.method private doCleanupAfterSuccessfulPush(Ljava/util/Set;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Set<",
            "Ljava/lang/Long;",
            ">;)V"
        }
    .end annotation

    .line 679
    invoke-interface {p1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Long;

    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    move-result-wide v0

    .line 680
    invoke-static {}, Lcom/shopkick/logging/DbMessagePersistence;->getInstance()Lcom/shopkick/logging/DbMessagePersistence;

    move-result-object v2

    invoke-virtual {v2, v0, v1}, Lcom/shopkick/logging/DbMessagePersistence;->setMessageAsSynced(J)V

    goto :goto_0

    .line 682
    :cond_0
    invoke-static {}, Lcom/shopkick/logging/DbMessagePersistence;->getInstance()Lcom/shopkick/logging/DbMessagePersistence;

    move-result-object p1

    invoke-virtual {p1}, Lcom/shopkick/logging/DbMessagePersistence;->purgeSyncedMessages()V

    return-void
.end method

.method public static getInstance()Lcom/shopkick/logging/RemoteAppender;
    .locals 2

    .line 67
    sget-object v0, Lcom/shopkick/logging/RemoteAppender;->Instance:Lcom/shopkick/logging/RemoteAppender;

    if-eqz v0, :cond_0

    .line 71
    sget-object v0, Lcom/shopkick/logging/RemoteAppender;->Instance:Lcom/shopkick/logging/RemoteAppender;

    return-object v0

    .line 68
    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "RemoteAppender.initialize() must be called before RemoteAppender.getInstance()"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public static initialize(Landroid/content/Context;)V
    .locals 2

    if-eqz p0, :cond_2

    .line 56
    sget-object v0, Lcom/shopkick/logging/RemoteAppender;->Instance:Lcom/shopkick/logging/RemoteAppender;

    if-nez v0, :cond_1

    .line 57
    sget-object v0, Lcom/shopkick/logging/RemoteAppender;->InstanceLock:Ljava/lang/Object;

    monitor-enter v0

    .line 58
    :try_start_0
    sget-object v1, Lcom/shopkick/logging/RemoteAppender;->Instance:Lcom/shopkick/logging/RemoteAppender;

    if-nez v1, :cond_0

    .line 59
    new-instance v1, Lcom/shopkick/logging/RemoteAppender;

    invoke-direct {v1, p0}, Lcom/shopkick/logging/RemoteAppender;-><init>(Landroid/content/Context;)V

    sput-object v1, Lcom/shopkick/logging/RemoteAppender;->Instance:Lcom/shopkick/logging/RemoteAppender;

    .line 61
    :cond_0
    monitor-exit v0

    goto :goto_0

    :catchall_0
    move-exception p0

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p0

    :cond_1
    :goto_0
    return-void

    .line 53
    :cond_2
    new-instance p0, Ljava/lang/IllegalArgumentException;

    const-string v0, "\'context\' cannot be null"

    invoke-direct {p0, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method private pushLogMessages(Ljava/util/TreeMap;)Z
    .locals 17
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/TreeMap<",
            "Ljava/lang/Long;",
            "Ljava/lang/String;",
            ">;)Z"
        }
    .end annotation

    move-object/from16 v1, p0

    .line 540
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Thread;->getId()J

    move-result-wide v2

    const/4 v4, 0x0

    const/4 v5, 0x2

    const/4 v6, 0x1

    const/4 v7, 0x0

    .line 543
    :try_start_0
    sget-object v0, Lcom/shopkick/logging/RemoteAppender;->LOG_TAG:Ljava/lang/String;

    sget-object v8, Ljava/util/Locale;->US:Ljava/util/Locale;

    const-string v9, "pushLogMessages() starting [thread:%1$d]"

    new-array v10, v6, [Ljava/lang/Object;

    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v11

    aput-object v11, v10, v7

    invoke-static {v8, v9, v10}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v8

    invoke-static {v0, v8}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    if-eqz p1, :cond_8

    .line 546
    invoke-virtual/range {p1 .. p1}, Ljava/util/TreeMap;->size()I

    move-result v0

    if-lez v0, :cond_8

    .line 551
    invoke-direct/range {p0 .. p0}, Lcom/shopkick/logging/RemoteAppender;->resolveUserAgent()Ljava/lang/String;

    move-result-object v0

    iget-object v8, v1, Lcom/shopkick/logging/RemoteAppender;->context:Landroid/content/Context;

    invoke-static {v0, v8}, Landroid/net/http/AndroidHttpClient;->newInstance(Ljava/lang/String;Landroid/content/Context;)Landroid/net/http/AndroidHttpClient;

    move-result-object v8
    :try_end_0
    .catch Lorg/apache/http/conn/ConnectTimeoutException; {:try_start_0 .. :try_end_0} :catch_b
    .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_9
    .catchall {:try_start_0 .. :try_end_0} :catchall_3

    .line 552
    :try_start_1
    new-instance v0, Lorg/apache/http/client/methods/HttpPost;

    iget-object v9, v1, Lcom/shopkick/logging/RemoteAppender;->loggingEndPoint:Ljava/lang/String;

    invoke-direct {v0, v9}, Lorg/apache/http/client/methods/HttpPost;-><init>(Ljava/lang/String;)V

    const-string v9, "Content-Language"

    const-string v10, "en-US"

    .line 553
    invoke-virtual {v0, v9, v10}, Lorg/apache/http/client/methods/HttpPost;->setHeader(Ljava/lang/String;Ljava/lang/String;)V

    const-string v9, "Content-Type"

    const-string v10, "application/octet-stream"

    .line 554
    invoke-virtual {v0, v9, v10}, Lorg/apache/http/client/methods/HttpPost;->setHeader(Ljava/lang/String;Ljava/lang/String;)V

    const-string v9, "Cache-Control"

    const-string v10, "no-transform"

    .line 555
    invoke-virtual {v0, v9, v10}, Lorg/apache/http/client/methods/HttpPost;->setHeader(Ljava/lang/String;Ljava/lang/String;)V

    const-string v9, "Content-Encoding"

    const-string v10, "gzip"

    .line 556
    invoke-virtual {v0, v9, v10}, Lorg/apache/http/client/methods/HttpPost;->setHeader(Ljava/lang/String;Ljava/lang/String;)V

    .line 559
    new-instance v9, Ljava/lang/StringBuilder;

    invoke-direct {v9}, Ljava/lang/StringBuilder;-><init>()V

    .line 560
    invoke-virtual/range {p1 .. p1}, Ljava/util/TreeMap;->values()Ljava/util/Collection;

    move-result-object v10

    invoke-interface {v10}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v10

    :goto_0
    invoke-interface {v10}, Ljava/util/Iterator;->hasNext()Z

    move-result v11

    if-eqz v11, :cond_0

    invoke-interface {v10}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v11

    check-cast v11, Ljava/lang/String;

    .line 561
    invoke-virtual {v9, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v11, "\n"

    .line 562
    invoke-virtual {v9, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_0

    .line 566
    :cond_0
    new-instance v10, Ljava/io/ByteArrayOutputStream;

    invoke-direct {v10}, Ljava/io/ByteArrayOutputStream;-><init>()V

    .line 567
    invoke-virtual {v9}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v11

    const-string v12, "UTF-8"

    invoke-virtual {v11, v12}, Ljava/lang/String;->getBytes(Ljava/lang/String;)[B

    move-result-object v11
    :try_end_1
    .catch Lorg/apache/http/conn/ConnectTimeoutException; {:try_start_1 .. :try_end_1} :catch_8
    .catch Ljava/lang/Throwable; {:try_start_1 .. :try_end_1} :catch_7
    .catchall {:try_start_1 .. :try_end_1} :catchall_2

    .line 571
    :try_start_2
    new-instance v12, Ljava/util/zip/GZIPOutputStream;

    invoke-direct {v12, v10}, Ljava/util/zip/GZIPOutputStream;-><init>(Ljava/io/OutputStream;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 572
    :try_start_3
    invoke-virtual {v12, v11}, Ljava/util/zip/GZIPOutputStream;->write([B)V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 577
    :try_start_4
    invoke-virtual {v12}, Ljava/util/zip/GZIPOutputStream;->close()V
    :try_end_4
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_0
    .catch Lorg/apache/http/conn/ConnectTimeoutException; {:try_start_4 .. :try_end_4} :catch_8
    .catch Ljava/lang/Throwable; {:try_start_4 .. :try_end_4} :catch_7
    .catchall {:try_start_4 .. :try_end_4} :catchall_2

    .line 584
    :catch_0
    :try_start_5
    invoke-virtual {v10}, Ljava/io/ByteArrayOutputStream;->toByteArray()[B

    move-result-object v10

    .line 585
    sget-object v12, Ljava/util/Locale;->US:Ljava/util/Locale;

    const-string v13, "pushLogMessages() GZipped POST data [Original length: %1$d | Gzipped Length: %2$d]"

    new-array v14, v5, [Ljava/lang/Object;

    array-length v15, v11

    .line 587
    invoke-static {v15}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v15

    aput-object v15, v14, v7

    array-length v15, v10

    .line 588
    invoke-static {v15}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v15

    aput-object v15, v14, v6

    .line 585
    invoke-static {v12, v13, v14}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v12

    .line 589
    sget-object v13, Lcom/shopkick/logging/RemoteAppender;->LOG_TAG:Ljava/lang/String;

    invoke-static {v13, v12}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    .line 590
    array-length v11, v11

    if-lez v11, :cond_6

    array-length v11, v10

    if-lez v11, :cond_6

    .line 596
    new-instance v11, Lorg/apache/http/entity/ByteArrayEntity;

    invoke-direct {v11, v10}, Lorg/apache/http/entity/ByteArrayEntity;-><init>([B)V

    invoke-virtual {v0, v11}, Lorg/apache/http/client/methods/HttpPost;->setEntity(Lorg/apache/http/HttpEntity;)V

    .line 599
    invoke-virtual {v9, v7}, Ljava/lang/StringBuilder;->setLength(I)V

    .line 604
    sget-object v9, Lcom/shopkick/logging/RemoteAppender;->LOG_TAG:Ljava/lang/String;

    sget-object v10, Ljava/util/Locale;->US:Ljava/util/Locale;

    const-string v11, "pushLogMessages() sending messages [URL:%1$s] [thread:%2$d] [message_count:%3$d]"

    const/4 v12, 0x3

    new-array v12, v12, [Ljava/lang/Object;

    iget-object v13, v1, Lcom/shopkick/logging/RemoteAppender;->loggingEndPoint:Ljava/lang/String;

    aput-object v13, v12, v7

    .line 608
    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v13

    aput-object v13, v12, v6

    .line 609
    invoke-virtual/range {p1 .. p1}, Ljava/util/TreeMap;->size()I

    move-result v13

    invoke-static {v13}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v13

    aput-object v13, v12, v5

    .line 605
    invoke-static {v10, v11, v12}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v10

    .line 604
    invoke-static {v9, v10}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    .line 612
    invoke-virtual {v8, v0}, Landroid/net/http/AndroidHttpClient;->execute(Lorg/apache/http/client/methods/HttpUriRequest;)Lorg/apache/http/HttpResponse;

    move-result-object v0

    if-nez v0, :cond_1

    .line 615
    sget-object v0, Lcom/shopkick/logging/RemoteAppender;->LOG_TAG:Ljava/lang/String;

    sget-object v4, Ljava/util/Locale;->US:Ljava/util/Locale;

    const-string v9, "pushLogMessages() failed [URL:%1$s] [thread:%2$d]"

    new-array v10, v5, [Ljava/lang/Object;

    iget-object v11, v1, Lcom/shopkick/logging/RemoteAppender;->loggingEndPoint:Ljava/lang/String;

    aput-object v11, v10, v7

    .line 619
    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v11

    aput-object v11, v10, v6

    .line 616
    invoke-static {v4, v9, v10}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v4

    .line 615
    invoke-static {v0, v4}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    goto :goto_1

    .line 624
    :cond_1
    invoke-interface {v0}, Lorg/apache/http/HttpResponse;->getStatusLine()Lorg/apache/http/StatusLine;

    move-result-object v9

    if-eqz v9, :cond_2

    .line 625
    invoke-interface {v0}, Lorg/apache/http/HttpResponse;->getStatusLine()Lorg/apache/http/StatusLine;

    move-result-object v0

    invoke-interface {v0}, Lorg/apache/http/StatusLine;->getStatusCode()I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    :cond_2
    if-nez v4, :cond_3

    .line 628
    sget-object v0, Lcom/shopkick/logging/RemoteAppender;->LOG_TAG:Ljava/lang/String;

    sget-object v4, Ljava/util/Locale;->US:Ljava/util/Locale;

    const-string v9, "pushLogMessages() failed to get result code [thread:%1$d]"

    new-array v10, v6, [Ljava/lang/Object;

    .line 629
    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v11

    aput-object v11, v10, v7

    invoke-static {v4, v9, v10}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v4

    .line 628
    invoke-static {v0, v4}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    :goto_1
    move v4, v7

    goto :goto_3

    .line 631
    :cond_3
    invoke-virtual {v4}, Ljava/lang/Integer;->intValue()I

    move-result v0

    const/16 v9, 0xc8

    if-ne v0, v9, :cond_4

    .line 632
    invoke-virtual/range {p1 .. p1}, Ljava/util/TreeMap;->keySet()Ljava/util/Set;

    move-result-object v0

    invoke-direct {v1, v0}, Lcom/shopkick/logging/RemoteAppender;->doCleanupAfterSuccessfulPush(Ljava/util/Set;)V
    :try_end_5
    .catch Lorg/apache/http/conn/ConnectTimeoutException; {:try_start_5 .. :try_end_5} :catch_8
    .catch Ljava/lang/Throwable; {:try_start_5 .. :try_end_5} :catch_7
    .catchall {:try_start_5 .. :try_end_5} :catchall_2

    .line 634
    :try_start_6
    sget-object v0, Lcom/shopkick/logging/RemoteAppender;->LOG_TAG:Ljava/lang/String;

    sget-object v9, Ljava/util/Locale;->US:Ljava/util/Locale;

    const-string v10, "pushLogMessages() result code: %1$d [thread:%2$d]"

    new-array v11, v5, [Ljava/lang/Object;

    aput-object v4, v11, v7

    .line 638
    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v4

    aput-object v4, v11, v6

    .line 635
    invoke-static {v9, v10, v11}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v4

    .line 634
    invoke-static {v0, v4}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I
    :try_end_6
    .catch Lorg/apache/http/conn/ConnectTimeoutException; {:try_start_6 .. :try_end_6} :catch_2
    .catch Ljava/lang/Throwable; {:try_start_6 .. :try_end_6} :catch_1
    .catchall {:try_start_6 .. :try_end_6} :catchall_2

    move v4, v6

    goto :goto_2

    :catch_1
    move-exception v0

    move v5, v6

    goto/16 :goto_5

    :catch_2
    move-exception v0

    move-object v4, v8

    move v8, v6

    goto/16 :goto_8

    .line 640
    :cond_4
    :try_start_7
    sget-object v0, Lcom/shopkick/logging/RemoteAppender;->LOG_TAG:Ljava/lang/String;

    sget-object v9, Ljava/util/Locale;->US:Ljava/util/Locale;

    const-string v10, "pushLogMessages() result code: %1$d [thread:%2$d]"

    new-array v11, v5, [Ljava/lang/Object;

    aput-object v4, v11, v7

    .line 644
    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v4

    aput-object v4, v11, v6

    .line 641
    invoke-static {v9, v10, v11}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v4

    .line 640
    invoke-static {v0, v4}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I
    :try_end_7
    .catch Lorg/apache/http/conn/ConnectTimeoutException; {:try_start_7 .. :try_end_7} :catch_8
    .catch Ljava/lang/Throwable; {:try_start_7 .. :try_end_7} :catch_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_2

    move v4, v7

    .line 646
    :goto_2
    :try_start_8
    sget-object v0, Lcom/shopkick/logging/RemoteAppender;->LOG_TAG:Ljava/lang/String;

    sget-object v9, Ljava/util/Locale;->US:Ljava/util/Locale;

    const-string v10, "pushLogMessages() logged [URL:%1$s] [thread:%2$d]"

    new-array v11, v5, [Ljava/lang/Object;

    iget-object v12, v1, Lcom/shopkick/logging/RemoteAppender;->loggingEndPoint:Ljava/lang/String;

    aput-object v12, v11, v7

    .line 650
    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v12

    aput-object v12, v11, v6

    .line 647
    invoke-static {v9, v10, v11}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v9

    .line 646
    invoke-static {v0, v9}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I
    :try_end_8
    .catch Lorg/apache/http/conn/ConnectTimeoutException; {:try_start_8 .. :try_end_8} :catch_5
    .catch Ljava/lang/Throwable; {:try_start_8 .. :try_end_8} :catch_4
    .catchall {:try_start_8 .. :try_end_8} :catchall_2

    :goto_3
    if-eqz v8, :cond_5

    .line 665
    :try_start_9
    invoke-virtual {v8}, Landroid/net/http/AndroidHttpClient;->close()V
    :try_end_9
    .catch Ljava/lang/Exception; {:try_start_9 .. :try_end_9} :catch_3

    .line 669
    :catch_3
    :cond_5
    sget-object v0, Lcom/shopkick/logging/RemoteAppender;->LOG_TAG:Ljava/lang/String;

    sget-object v5, Ljava/util/Locale;->US:Ljava/util/Locale;

    const-string v8, "pushLogMessages() finished [thread:%1$d]"

    new-array v6, v6, [Ljava/lang/Object;

    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    aput-object v2, v6, v7

    invoke-static {v5, v8, v6}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    invoke-static {v0, v2}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    goto/16 :goto_9

    :catch_4
    move-exception v0

    move v5, v4

    goto :goto_5

    :catch_5
    move-exception v0

    move-object/from16 v16, v8

    move v8, v4

    move-object/from16 v4, v16

    goto/16 :goto_8

    .line 593
    :cond_6
    :try_start_a
    invoke-virtual/range {p1 .. p1}, Ljava/util/TreeMap;->keySet()Ljava/util/Set;

    move-result-object v0

    invoke-direct {v1, v0}, Lcom/shopkick/logging/RemoteAppender;->doCleanupAfterSuccessfulPush(Ljava/util/Set;)V

    .line 594
    new-instance v0, Ljava/lang/IllegalStateException;

    invoke-direct {v0, v12}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
    :try_end_a
    .catch Lorg/apache/http/conn/ConnectTimeoutException; {:try_start_a .. :try_end_a} :catch_8
    .catch Ljava/lang/Throwable; {:try_start_a .. :try_end_a} :catch_7
    .catchall {:try_start_a .. :try_end_a} :catchall_2

    :catchall_0
    move-exception v0

    move-object v4, v12

    goto :goto_4

    :catchall_1
    move-exception v0

    :goto_4
    if-eqz v4, :cond_7

    .line 577
    :try_start_b
    invoke-virtual {v4}, Ljava/util/zip/GZIPOutputStream;->close()V
    :try_end_b
    .catch Ljava/lang/Exception; {:try_start_b .. :try_end_b} :catch_6
    .catch Lorg/apache/http/conn/ConnectTimeoutException; {:try_start_b .. :try_end_b} :catch_8
    .catch Ljava/lang/Throwable; {:try_start_b .. :try_end_b} :catch_7
    .catchall {:try_start_b .. :try_end_b} :catchall_2

    .line 579
    :catch_6
    :cond_7
    :try_start_c
    throw v0
    :try_end_c
    .catch Lorg/apache/http/conn/ConnectTimeoutException; {:try_start_c .. :try_end_c} :catch_8
    .catch Ljava/lang/Throwable; {:try_start_c .. :try_end_c} :catch_7
    .catchall {:try_start_c .. :try_end_c} :catchall_2

    :catchall_2
    move-exception v0

    goto/16 :goto_a

    :catch_7
    move-exception v0

    move v5, v7

    :goto_5
    move-object v4, v8

    goto :goto_6

    :catch_8
    move-exception v0

    move-object v4, v8

    goto :goto_7

    .line 547
    :cond_8
    :try_start_d
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v8, "\'messagesToSend\' cannot be NULL or empty"

    invoke-direct {v0, v8}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0
    :try_end_d
    .catch Lorg/apache/http/conn/ConnectTimeoutException; {:try_start_d .. :try_end_d} :catch_b
    .catch Ljava/lang/Throwable; {:try_start_d .. :try_end_d} :catch_9
    .catchall {:try_start_d .. :try_end_d} :catchall_3

    :catchall_3
    move-exception v0

    move-object v8, v4

    goto :goto_a

    :catch_9
    move-exception v0

    move v5, v7

    .line 661
    :goto_6
    :try_start_e
    sget-object v8, Lcom/shopkick/logging/RemoteAppender;->LOG_TAG:Ljava/lang/String;

    sget-object v9, Ljava/util/Locale;->US:Ljava/util/Locale;

    const-string v10, "pushLogMessages() failed [thread:%1$d]"

    new-array v11, v6, [Ljava/lang/Object;

    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v12

    aput-object v12, v11, v7

    invoke-static {v9, v10, v11}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v9

    invoke-static {v8, v9, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
    :try_end_e
    .catchall {:try_start_e .. :try_end_e} :catchall_3

    if-eqz v4, :cond_9

    .line 665
    :try_start_f
    invoke-virtual {v4}, Landroid/net/http/AndroidHttpClient;->close()V
    :try_end_f
    .catch Ljava/lang/Exception; {:try_start_f .. :try_end_f} :catch_a

    .line 669
    :catch_a
    :cond_9
    sget-object v0, Lcom/shopkick/logging/RemoteAppender;->LOG_TAG:Ljava/lang/String;

    sget-object v4, Ljava/util/Locale;->US:Ljava/util/Locale;

    const-string v8, "pushLogMessages() finished [thread:%1$d]"

    new-array v6, v6, [Ljava/lang/Object;

    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    aput-object v2, v6, v7

    invoke-static {v4, v8, v6}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    invoke-static {v0, v2}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    move v4, v5

    goto :goto_9

    :catch_b
    move-exception v0

    :goto_7
    move v8, v7

    .line 655
    :goto_8
    :try_start_10
    sget-object v9, Lcom/shopkick/logging/RemoteAppender;->LOG_TAG:Ljava/lang/String;

    sget-object v10, Ljava/util/Locale;->US:Ljava/util/Locale;

    const-string v11, "pushLogMessages() failed [thread:%1$d] [ConnectTimeoutException:%2$s]"

    new-array v5, v5, [Ljava/lang/Object;

    .line 658
    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v12

    aput-object v12, v5, v7

    .line 659
    invoke-virtual {v0}, Lorg/apache/http/conn/ConnectTimeoutException;->getMessage()Ljava/lang/String;

    move-result-object v0

    aput-object v0, v5, v6

    .line 656
    invoke-static {v10, v11, v5}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    .line 655
    invoke-static {v9, v0}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I
    :try_end_10
    .catchall {:try_start_10 .. :try_end_10} :catchall_3

    if-eqz v4, :cond_a

    .line 665
    :try_start_11
    invoke-virtual {v4}, Landroid/net/http/AndroidHttpClient;->close()V
    :try_end_11
    .catch Ljava/lang/Exception; {:try_start_11 .. :try_end_11} :catch_c

    .line 669
    :catch_c
    :cond_a
    sget-object v0, Lcom/shopkick/logging/RemoteAppender;->LOG_TAG:Ljava/lang/String;

    sget-object v4, Ljava/util/Locale;->US:Ljava/util/Locale;

    const-string v5, "pushLogMessages() finished [thread:%1$d]"

    new-array v6, v6, [Ljava/lang/Object;

    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    aput-object v2, v6, v7

    invoke-static {v4, v5, v6}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    invoke-static {v0, v2}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    move v4, v8

    :goto_9
    return v4

    :goto_a
    if-eqz v8, :cond_b

    .line 665
    :try_start_12
    invoke-virtual {v8}, Landroid/net/http/AndroidHttpClient;->close()V
    :try_end_12
    .catch Ljava/lang/Exception; {:try_start_12 .. :try_end_12} :catch_d

    .line 669
    :catch_d
    :cond_b
    sget-object v4, Lcom/shopkick/logging/RemoteAppender;->LOG_TAG:Ljava/lang/String;

    sget-object v5, Ljava/util/Locale;->US:Ljava/util/Locale;

    new-array v6, v6, [Ljava/lang/Object;

    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    aput-object v2, v6, v7

    const-string v2, "pushLogMessages() finished [thread:%1$d]"

    invoke-static {v5, v2, v6}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    invoke-static {v4, v2}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    throw v0
.end method

.method private resolveUserAgent()Ljava/lang/String;
    .locals 1

    const-string v0, "UNRESOLVED"

    return-object v0
.end method


# virtual methods
.method public getAppenderConfig(Lcom/shopkick/logging/ConfigurationProvider;)Lcom/shopkick/logging/AppenderConfig;
    .locals 1

    .line 178
    sget-object v0, Lcom/shopkick/logging/RemoteAppender;->APPENDER_TAG:Ljava/lang/String;

    invoke-interface {p1, v0}, Lcom/shopkick/logging/ConfigurationProvider;->getAppenderConfig(Ljava/lang/String;)Lcom/shopkick/logging/AppenderConfig;

    move-result-object p1

    return-object p1
.end method

.method public isEnabled(Lcom/shopkick/logging/ConfigurationProvider;)Z
    .locals 0

    .line 173
    invoke-super {p0, p1}, Lcom/shopkick/logging/AppenderBase;->isEnabled(Lcom/shopkick/logging/ConfigurationProvider;)Z

    move-result p1

    if-eqz p1, :cond_0

    iget-object p1, p0, Lcom/shopkick/logging/RemoteAppender;->loggingEndPoint:Ljava/lang/String;

    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result p1

    if-nez p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1
.end method

.method public log(Lcom/shopkick/logging/Message;Lcom/shopkick/logging/ConfigurationProvider;)V
    .locals 6

    if-eqz p1, :cond_4

    const-string v0, "EVENT"

    .line 187
    const-class v1, Ljava/lang/Integer;

    invoke-virtual {p1, v0, v1}, Lcom/shopkick/logging/Message;->safelyExtract(Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    if-nez v0, :cond_0

    .line 192
    invoke-virtual {p0, p2}, Lcom/shopkick/logging/RemoteAppender;->isEnabled(Lcom/shopkick/logging/ConfigurationProvider;)Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-virtual {p1}, Lcom/shopkick/logging/Message;->getAreas()J

    move-result-wide v0

    invoke-virtual {p0, v0, v1, p2}, Lcom/shopkick/logging/RemoteAppender;->isAreaActive(JLcom/shopkick/logging/ConfigurationProvider;)Z

    move-result p2

    if-eqz p2, :cond_3

    .line 193
    :cond_0
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    iput-wide v0, p0, Lcom/shopkick/logging/RemoteAppender;->lastLoggedTime:J

    .line 194
    iget-object p2, p0, Lcom/shopkick/logging/RemoteAppender;->scheduledFuture:Ljava/util/concurrent/ScheduledFuture;

    const/4 v0, 0x0

    invoke-interface {p2, v0}, Ljava/util/concurrent/ScheduledFuture;->cancel(Z)Z

    .line 195
    iget-object p2, p0, Lcom/shopkick/logging/RemoteAppender;->scheduler:Ljava/util/concurrent/ScheduledExecutorService;

    iget-object v1, p0, Lcom/shopkick/logging/RemoteAppender;->checkMaxWaitTimeElapsed:Ljava/lang/Runnable;

    sget-object v2, Lcom/shopkick/logging/RemoteAppender;->maxWaitTime:Ljava/lang/Long;

    invoke-virtual {v2}, Ljava/lang/Long;->longValue()J

    move-result-wide v2

    sget-object v4, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    invoke-interface {p2, v1, v2, v3, v4}, Ljava/util/concurrent/ScheduledExecutorService;->schedule(Ljava/lang/Runnable;JLjava/util/concurrent/TimeUnit;)Ljava/util/concurrent/ScheduledFuture;

    move-result-object p2

    iput-object p2, p0, Lcom/shopkick/logging/RemoteAppender;->scheduledFuture:Ljava/util/concurrent/ScheduledFuture;

    .line 198
    iget-object p2, p0, Lcom/shopkick/logging/RemoteAppender;->messagesToEnqueue:Ljava/util/concurrent/ConcurrentLinkedQueue;

    invoke-virtual {p2}, Ljava/util/concurrent/ConcurrentLinkedQueue;->size()I

    move-result p2

    const/16 v1, 0x3e8

    if-ge p2, v1, :cond_1

    .line 200
    iget-object p2, p0, Lcom/shopkick/logging/RemoteAppender;->messagesToEnqueue:Ljava/util/concurrent/ConcurrentLinkedQueue;

    invoke-virtual {p2, p1}, Ljava/util/concurrent/ConcurrentLinkedQueue;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 203
    :cond_1
    sget-object p1, Lcom/shopkick/logging/RemoteAppender;->LOG_TAG:Ljava/lang/String;

    sget-object p2, Ljava/util/Locale;->US:Ljava/util/Locale;

    const-string v2, "Enqueuing queue of length %1$d exceeds max of %2$d, dropping message [thread:%3$d]"

    const/4 v3, 0x3

    new-array v3, v3, [Ljava/lang/Object;

    iget-object v4, p0, Lcom/shopkick/logging/RemoteAppender;->messagesToEnqueue:Ljava/util/concurrent/ConcurrentLinkedQueue;

    .line 206
    invoke-virtual {v4}, Ljava/util/concurrent/ConcurrentLinkedQueue;->size()I

    move-result v4

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    aput-object v4, v3, v0

    const/4 v0, 0x1

    .line 207
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    aput-object v1, v3, v0

    const/4 v0, 0x2

    .line 208
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Thread;->getId()J

    move-result-wide v4

    invoke-static {v4, v5}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    aput-object v1, v3, v0

    .line 204
    invoke-static {p2, v2, v3}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p2

    .line 203
    invoke-static {p1, p2}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 212
    :goto_0
    iget-object p1, p0, Lcom/shopkick/logging/RemoteAppender;->enqueuingThreadState:Lcom/shopkick/logging/RemoteAppender$ThreadState;

    sget-object p2, Lcom/shopkick/logging/RemoteAppender$ThreadState;->STOPPED:Lcom/shopkick/logging/RemoteAppender$ThreadState;

    if-ne p1, p2, :cond_2

    .line 213
    invoke-virtual {p0}, Lcom/shopkick/logging/RemoteAppender;->startLogging()Z

    .line 217
    :cond_2
    iget-object p1, p0, Lcom/shopkick/logging/RemoteAppender;->enqueuingWaitMonitor:Ljava/lang/Object;

    monitor-enter p1

    .line 218
    :try_start_0
    iget-object p2, p0, Lcom/shopkick/logging/RemoteAppender;->enqueuingWaitMonitor:Ljava/lang/Object;

    invoke-virtual {p2}, Ljava/lang/Object;->notify()V

    .line 219
    monitor-exit p1

    :cond_3
    return-void

    :catchall_0
    move-exception p2

    monitor-exit p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p2

    .line 186
    :cond_4
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "\'message\' cannot be null"

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public startLogging()Z
    .locals 12

    .line 233
    iget-object v0, p0, Lcom/shopkick/logging/RemoteAppender;->startStopLock:Ljava/lang/Object;

    monitor-enter v0

    .line 237
    :try_start_0
    sget-object v1, Lcom/shopkick/logging/RemoteAppender;->LOG_TAG:Ljava/lang/String;

    sget-object v2, Ljava/util/Locale;->US:Ljava/util/Locale;

    const-string v3, "Attempting to start sending consumer [state:%1$s] [thread:%2$d]"

    const/4 v4, 0x2

    new-array v5, v4, [Ljava/lang/Object;

    iget-object v6, p0, Lcom/shopkick/logging/RemoteAppender;->sendingThreadState:Lcom/shopkick/logging/RemoteAppender$ThreadState;

    .line 240
    invoke-virtual {v6}, Lcom/shopkick/logging/RemoteAppender$ThreadState;->name()Ljava/lang/String;

    move-result-object v6

    const/4 v7, 0x0

    aput-object v6, v5, v7

    .line 241
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object v6

    invoke-virtual {v6}, Ljava/lang/Thread;->getId()J

    move-result-wide v8

    invoke-static {v8, v9}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v6

    const/4 v8, 0x1

    aput-object v6, v5, v8

    .line 238
    invoke-static {v2, v3, v5}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    .line 237
    invoke-static {v1, v2}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    .line 243
    iget-object v1, p0, Lcom/shopkick/logging/RemoteAppender;->sendingThreadState:Lcom/shopkick/logging/RemoteAppender$ThreadState;

    sget-object v2, Lcom/shopkick/logging/RemoteAppender$ThreadState;->STOPPED:Lcom/shopkick/logging/RemoteAppender$ThreadState;

    const/4 v3, 0x0

    if-ne v1, v2, :cond_0

    .line 244
    sget-object v1, Lcom/shopkick/logging/RemoteAppender$ThreadState;->STARTING:Lcom/shopkick/logging/RemoteAppender$ThreadState;

    iput-object v1, p0, Lcom/shopkick/logging/RemoteAppender;->sendingThreadState:Lcom/shopkick/logging/RemoteAppender$ThreadState;

    .line 245
    iput-boolean v7, p0, Lcom/shopkick/logging/RemoteAppender;->requestSendingThreadExit:Z

    .line 246
    new-instance v1, Lcom/shopkick/logging/RemoteAppender$SendingThread;

    invoke-direct {v1, p0, v3}, Lcom/shopkick/logging/RemoteAppender$SendingThread;-><init>(Lcom/shopkick/logging/RemoteAppender;Lcom/shopkick/logging/RemoteAppender$1;)V

    iput-object v1, p0, Lcom/shopkick/logging/RemoteAppender;->sendingConsumerThread:Lcom/shopkick/logging/RemoteAppender$SendingThread;

    .line 247
    iget-object v1, p0, Lcom/shopkick/logging/RemoteAppender;->sendingConsumerThread:Lcom/shopkick/logging/RemoteAppender$SendingThread;

    invoke-virtual {v1}, Lcom/shopkick/logging/RemoteAppender$SendingThread;->start()V

    .line 249
    sget-object v1, Lcom/shopkick/logging/RemoteAppender;->LOG_TAG:Ljava/lang/String;

    sget-object v2, Ljava/util/Locale;->US:Ljava/util/Locale;

    const-string v5, "Sending consumer started [thread:%1$d] [sending_thread:%2$d]"

    new-array v6, v4, [Ljava/lang/Object;

    .line 252
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object v9

    invoke-virtual {v9}, Ljava/lang/Thread;->getId()J

    move-result-wide v9

    invoke-static {v9, v10}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v9

    aput-object v9, v6, v7

    iget-object v9, p0, Lcom/shopkick/logging/RemoteAppender;->sendingConsumerThread:Lcom/shopkick/logging/RemoteAppender$SendingThread;

    .line 253
    invoke-virtual {v9}, Lcom/shopkick/logging/RemoteAppender$SendingThread;->getId()J

    move-result-wide v9

    invoke-static {v9, v10}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v9

    aput-object v9, v6, v8

    .line 250
    invoke-static {v2, v5, v6}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    .line 249
    invoke-static {v1, v2}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    move v1, v8

    goto :goto_0

    .line 255
    :cond_0
    sget-object v1, Lcom/shopkick/logging/RemoteAppender;->LOG_TAG:Ljava/lang/String;

    sget-object v2, Ljava/util/Locale;->US:Ljava/util/Locale;

    const-string v5, "Sending consumer found already running [thread:%1$d]"

    new-array v6, v8, [Ljava/lang/Object;

    .line 258
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object v9

    invoke-virtual {v9}, Ljava/lang/Thread;->getId()J

    move-result-wide v9

    invoke-static {v9, v10}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v9

    aput-object v9, v6, v7

    .line 256
    invoke-static {v2, v5, v6}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    .line 255
    invoke-static {v1, v2}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    move v1, v7

    .line 264
    :goto_0
    sget-object v2, Lcom/shopkick/logging/RemoteAppender;->LOG_TAG:Ljava/lang/String;

    sget-object v5, Ljava/util/Locale;->US:Ljava/util/Locale;

    const-string v6, "Attempting to start enqueuing consumer [state:%1$s] [thread:%2$d]"

    new-array v9, v4, [Ljava/lang/Object;

    iget-object v10, p0, Lcom/shopkick/logging/RemoteAppender;->enqueuingThreadState:Lcom/shopkick/logging/RemoteAppender$ThreadState;

    .line 267
    invoke-virtual {v10}, Lcom/shopkick/logging/RemoteAppender$ThreadState;->name()Ljava/lang/String;

    move-result-object v10

    aput-object v10, v9, v7

    .line 268
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object v10

    invoke-virtual {v10}, Ljava/lang/Thread;->getId()J

    move-result-wide v10

    invoke-static {v10, v11}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v10

    aput-object v10, v9, v8

    .line 265
    invoke-static {v5, v6, v9}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v5

    .line 264
    invoke-static {v2, v5}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    .line 270
    iget-object v2, p0, Lcom/shopkick/logging/RemoteAppender;->enqueuingThreadState:Lcom/shopkick/logging/RemoteAppender$ThreadState;

    sget-object v5, Lcom/shopkick/logging/RemoteAppender$ThreadState;->STOPPED:Lcom/shopkick/logging/RemoteAppender$ThreadState;

    if-ne v2, v5, :cond_1

    .line 271
    sget-object v2, Lcom/shopkick/logging/RemoteAppender$ThreadState;->STARTING:Lcom/shopkick/logging/RemoteAppender$ThreadState;

    iput-object v2, p0, Lcom/shopkick/logging/RemoteAppender;->enqueuingThreadState:Lcom/shopkick/logging/RemoteAppender$ThreadState;

    .line 272
    iput-boolean v7, p0, Lcom/shopkick/logging/RemoteAppender;->requestEnqueuingThreadExit:Z

    .line 273
    new-instance v2, Lcom/shopkick/logging/RemoteAppender$EnqueuingThread;

    invoke-direct {v2, p0, v3}, Lcom/shopkick/logging/RemoteAppender$EnqueuingThread;-><init>(Lcom/shopkick/logging/RemoteAppender;Lcom/shopkick/logging/RemoteAppender$1;)V

    iput-object v2, p0, Lcom/shopkick/logging/RemoteAppender;->enqueuingConsumerThread:Lcom/shopkick/logging/RemoteAppender$EnqueuingThread;

    .line 274
    iget-object v2, p0, Lcom/shopkick/logging/RemoteAppender;->enqueuingConsumerThread:Lcom/shopkick/logging/RemoteAppender$EnqueuingThread;

    invoke-virtual {v2}, Lcom/shopkick/logging/RemoteAppender$EnqueuingThread;->start()V

    .line 276
    sget-object v2, Lcom/shopkick/logging/RemoteAppender;->LOG_TAG:Ljava/lang/String;

    sget-object v3, Ljava/util/Locale;->US:Ljava/util/Locale;

    const-string v5, "Enqueuing consumer started [thread:%1$d] [enqueuing_thread:%2$d]"

    new-array v4, v4, [Ljava/lang/Object;

    .line 279
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object v6

    invoke-virtual {v6}, Ljava/lang/Thread;->getId()J

    move-result-wide v9

    invoke-static {v9, v10}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v6

    aput-object v6, v4, v7

    iget-object v6, p0, Lcom/shopkick/logging/RemoteAppender;->enqueuingConsumerThread:Lcom/shopkick/logging/RemoteAppender$EnqueuingThread;

    .line 280
    invoke-virtual {v6}, Lcom/shopkick/logging/RemoteAppender$EnqueuingThread;->getId()J

    move-result-wide v6

    invoke-static {v6, v7}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v6

    aput-object v6, v4, v8

    .line 277
    invoke-static {v3, v5, v4}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v3

    .line 276
    invoke-static {v2, v3}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    goto :goto_1

    .line 282
    :cond_1
    sget-object v1, Lcom/shopkick/logging/RemoteAppender;->LOG_TAG:Ljava/lang/String;

    sget-object v2, Ljava/util/Locale;->US:Ljava/util/Locale;

    const-string v3, "Enqueuing consumer found already running [thread:%1$d]"

    new-array v4, v8, [Ljava/lang/Object;

    .line 285
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object v5

    invoke-virtual {v5}, Ljava/lang/Thread;->getId()J

    move-result-wide v5

    invoke-static {v5, v6}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v5

    aput-object v5, v4, v7

    .line 283
    invoke-static {v2, v3, v4}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    .line 282
    invoke-static {v1, v2}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    move v1, v7

    .line 288
    :goto_1
    monitor-exit v0

    return v1

    :catchall_0
    move-exception v1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1
.end method

.method public stopLogging()Z
    .locals 18

    move-object/from16 v1, p0

    .line 302
    iget-object v2, v1, Lcom/shopkick/logging/RemoteAppender;->startStopLock:Ljava/lang/Object;

    monitor-enter v2

    .line 306
    :try_start_0
    sget-object v0, Lcom/shopkick/logging/RemoteAppender;->LOG_TAG:Ljava/lang/String;

    sget-object v3, Ljava/util/Locale;->US:Ljava/util/Locale;

    const-string v4, "Attempting to stop enqueuing consumer [state:%1$s] [thread:%2$d]"

    const/4 v5, 0x2

    new-array v6, v5, [Ljava/lang/Object;

    iget-object v7, v1, Lcom/shopkick/logging/RemoteAppender;->enqueuingThreadState:Lcom/shopkick/logging/RemoteAppender$ThreadState;

    .line 309
    invoke-virtual {v7}, Lcom/shopkick/logging/RemoteAppender$ThreadState;->name()Ljava/lang/String;

    move-result-object v7

    const/4 v8, 0x0

    aput-object v7, v6, v8

    .line 310
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object v7

    invoke-virtual {v7}, Ljava/lang/Thread;->getId()J

    move-result-wide v9

    invoke-static {v9, v10}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v7

    const/4 v9, 0x1

    aput-object v7, v6, v9

    .line 307
    invoke-static {v3, v4, v6}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v3

    .line 306
    invoke-static {v0, v3}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    .line 312
    iget-object v0, v1, Lcom/shopkick/logging/RemoteAppender;->enqueuingThreadState:Lcom/shopkick/logging/RemoteAppender$ThreadState;

    sget-object v3, Lcom/shopkick/logging/RemoteAppender$ThreadState;->STARTED:Lcom/shopkick/logging/RemoteAppender$ThreadState;

    const/4 v4, 0x0

    const-wide/16 v6, 0x7d0

    const-wide/16 v10, 0xbb8

    if-ne v0, v3, :cond_0

    .line 315
    sget-object v0, Lcom/shopkick/logging/RemoteAppender$ThreadState;->STOPPING:Lcom/shopkick/logging/RemoteAppender$ThreadState;

    iput-object v0, v1, Lcom/shopkick/logging/RemoteAppender;->enqueuingThreadState:Lcom/shopkick/logging/RemoteAppender$ThreadState;

    .line 316
    iput-boolean v9, v1, Lcom/shopkick/logging/RemoteAppender;->requestEnqueuingThreadExit:Z

    .line 319
    iget-object v3, v1, Lcom/shopkick/logging/RemoteAppender;->enqueuingWaitMonitor:Ljava/lang/Object;

    monitor-enter v3
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_2

    :try_start_1
    iget-object v0, v1, Lcom/shopkick/logging/RemoteAppender;->enqueuingWaitMonitor:Ljava/lang/Object;

    invoke-virtual {v0}, Ljava/lang/Object;->notify()V

    monitor-exit v3
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 322
    :try_start_2
    iget-object v0, v1, Lcom/shopkick/logging/RemoteAppender;->enqueuingConsumerThread:Lcom/shopkick/logging/RemoteAppender$EnqueuingThread;

    invoke-virtual {v0}, Lcom/shopkick/logging/RemoteAppender$EnqueuingThread;->getId()J

    move-result-wide v12
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    .line 324
    :try_start_3
    iget-object v0, v1, Lcom/shopkick/logging/RemoteAppender;->enqueuingConsumerThread:Lcom/shopkick/logging/RemoteAppender$EnqueuingThread;

    invoke-virtual {v0, v10, v11}, Lcom/shopkick/logging/RemoteAppender$EnqueuingThread;->join(J)V

    .line 325
    iget-object v0, v1, Lcom/shopkick/logging/RemoteAppender;->enqueuingConsumerThread:Lcom/shopkick/logging/RemoteAppender$EnqueuingThread;

    invoke-virtual {v0}, Lcom/shopkick/logging/RemoteAppender$EnqueuingThread;->interrupt()V

    .line 326
    iget-object v0, v1, Lcom/shopkick/logging/RemoteAppender;->enqueuingConsumerThread:Lcom/shopkick/logging/RemoteAppender$EnqueuingThread;

    invoke-virtual {v0, v6, v7}, Lcom/shopkick/logging/RemoteAppender$EnqueuingThread;->join(J)V
    :try_end_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_0
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    goto :goto_0

    :catch_0
    move-exception v0

    .line 328
    :try_start_4
    sget-object v3, Lcom/shopkick/logging/RemoteAppender;->LOG_TAG:Ljava/lang/String;

    sget-object v14, Ljava/util/Locale;->US:Ljava/util/Locale;

    const-string v15, "join()/interrupt()/join() failed [thread:%1$d]"

    new-array v6, v9, [Ljava/lang/Object;

    .line 331
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object v7

    invoke-virtual {v7}, Ljava/lang/Thread;->getId()J

    move-result-wide v16

    invoke-static/range {v16 .. v17}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v7

    aput-object v7, v6, v8

    .line 329
    invoke-static {v14, v15, v6}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v6

    .line 328
    invoke-static {v3, v6, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 336
    :goto_0
    iput-object v4, v1, Lcom/shopkick/logging/RemoteAppender;->enqueuingConsumerThread:Lcom/shopkick/logging/RemoteAppender$EnqueuingThread;

    .line 338
    sget-object v0, Lcom/shopkick/logging/RemoteAppender;->LOG_TAG:Ljava/lang/String;

    sget-object v3, Ljava/util/Locale;->US:Ljava/util/Locale;

    const-string v6, "Enqueuing consumer stopped [thread:%1$d] [logging_thread:%2$d]"

    new-array v7, v5, [Ljava/lang/Object;

    .line 341
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object v14

    invoke-virtual {v14}, Ljava/lang/Thread;->getId()J

    move-result-wide v14

    invoke-static {v14, v15}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v14

    aput-object v14, v7, v8

    .line 342
    invoke-static {v12, v13}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v12

    aput-object v12, v7, v9

    .line 339
    invoke-static {v3, v6, v7}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v3

    .line 338
    invoke-static {v0, v3}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_2

    move v3, v9

    goto :goto_1

    :catchall_0
    move-exception v0

    .line 319
    :try_start_5
    monitor-exit v3
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    :try_start_6
    throw v0

    .line 344
    :cond_0
    sget-object v0, Lcom/shopkick/logging/RemoteAppender;->LOG_TAG:Ljava/lang/String;

    sget-object v3, Ljava/util/Locale;->US:Ljava/util/Locale;

    const-string v6, "Enqueuing consumer found already stopped [thread:%1$d]"

    new-array v7, v9, [Ljava/lang/Object;

    .line 347
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object v12

    invoke-virtual {v12}, Ljava/lang/Thread;->getId()J

    move-result-wide v12

    invoke-static {v12, v13}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v12

    aput-object v12, v7, v8

    .line 345
    invoke-static {v3, v6, v7}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v3

    .line 344
    invoke-static {v0, v3}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    move v3, v8

    .line 353
    :goto_1
    sget-object v0, Lcom/shopkick/logging/RemoteAppender;->LOG_TAG:Ljava/lang/String;

    sget-object v6, Ljava/util/Locale;->US:Ljava/util/Locale;

    const-string v7, "Attempting to stop sending consumer [state:%1$s] [thread:%2$d]"

    new-array v12, v5, [Ljava/lang/Object;

    iget-object v13, v1, Lcom/shopkick/logging/RemoteAppender;->sendingThreadState:Lcom/shopkick/logging/RemoteAppender$ThreadState;

    .line 356
    invoke-virtual {v13}, Lcom/shopkick/logging/RemoteAppender$ThreadState;->name()Ljava/lang/String;

    move-result-object v13

    aput-object v13, v12, v8

    .line 357
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object v13

    invoke-virtual {v13}, Ljava/lang/Thread;->getId()J

    move-result-wide v13

    invoke-static {v13, v14}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v13

    aput-object v13, v12, v9

    .line 354
    invoke-static {v6, v7, v12}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v6

    .line 353
    invoke-static {v0, v6}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    .line 359
    iget-object v0, v1, Lcom/shopkick/logging/RemoteAppender;->sendingThreadState:Lcom/shopkick/logging/RemoteAppender$ThreadState;

    sget-object v6, Lcom/shopkick/logging/RemoteAppender$ThreadState;->STARTED:Lcom/shopkick/logging/RemoteAppender$ThreadState;

    if-ne v0, v6, :cond_1

    .line 362
    sget-object v0, Lcom/shopkick/logging/RemoteAppender$ThreadState;->STOPPING:Lcom/shopkick/logging/RemoteAppender$ThreadState;

    iput-object v0, v1, Lcom/shopkick/logging/RemoteAppender;->sendingThreadState:Lcom/shopkick/logging/RemoteAppender$ThreadState;

    .line 363
    iput-boolean v9, v1, Lcom/shopkick/logging/RemoteAppender;->requestSendingThreadExit:Z

    .line 366
    iget-object v6, v1, Lcom/shopkick/logging/RemoteAppender;->sendingWaitMonitor:Ljava/lang/Object;

    monitor-enter v6
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_2

    :try_start_7
    iget-object v0, v1, Lcom/shopkick/logging/RemoteAppender;->sendingWaitMonitor:Ljava/lang/Object;

    invoke-virtual {v0}, Ljava/lang/Object;->notify()V

    monitor-exit v6
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_1

    .line 369
    :try_start_8
    iget-object v0, v1, Lcom/shopkick/logging/RemoteAppender;->sendingConsumerThread:Lcom/shopkick/logging/RemoteAppender$SendingThread;

    invoke-virtual {v0}, Lcom/shopkick/logging/RemoteAppender$SendingThread;->getId()J

    move-result-wide v6
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_2

    .line 371
    :try_start_9
    iget-object v0, v1, Lcom/shopkick/logging/RemoteAppender;->sendingConsumerThread:Lcom/shopkick/logging/RemoteAppender$SendingThread;

    invoke-virtual {v0, v10, v11}, Lcom/shopkick/logging/RemoteAppender$SendingThread;->join(J)V

    .line 372
    iget-object v0, v1, Lcom/shopkick/logging/RemoteAppender;->sendingConsumerThread:Lcom/shopkick/logging/RemoteAppender$SendingThread;

    invoke-virtual {v0}, Lcom/shopkick/logging/RemoteAppender$SendingThread;->interrupt()V

    .line 373
    iget-object v0, v1, Lcom/shopkick/logging/RemoteAppender;->sendingConsumerThread:Lcom/shopkick/logging/RemoteAppender$SendingThread;

    const-wide/16 v10, 0x7d0

    invoke-virtual {v0, v10, v11}, Lcom/shopkick/logging/RemoteAppender$SendingThread;->join(J)V
    :try_end_9
    .catch Ljava/lang/Exception; {:try_start_9 .. :try_end_9} :catch_1
    .catchall {:try_start_9 .. :try_end_9} :catchall_2

    goto :goto_2

    :catch_1
    move-exception v0

    .line 375
    :try_start_a
    sget-object v10, Lcom/shopkick/logging/RemoteAppender;->LOG_TAG:Ljava/lang/String;

    sget-object v11, Ljava/util/Locale;->US:Ljava/util/Locale;

    const-string v12, "join()/interrupt()/join() failed [thread:%1$d]"

    new-array v13, v9, [Ljava/lang/Object;

    .line 378
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object v14

    invoke-virtual {v14}, Ljava/lang/Thread;->getId()J

    move-result-wide v14

    invoke-static {v14, v15}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v14

    aput-object v14, v13, v8

    .line 376
    invoke-static {v11, v12, v13}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v11

    .line 375
    invoke-static {v10, v11, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 383
    :goto_2
    iput-object v4, v1, Lcom/shopkick/logging/RemoteAppender;->sendingConsumerThread:Lcom/shopkick/logging/RemoteAppender$SendingThread;

    .line 385
    sget-object v0, Lcom/shopkick/logging/RemoteAppender;->LOG_TAG:Ljava/lang/String;

    sget-object v4, Ljava/util/Locale;->US:Ljava/util/Locale;

    const-string v10, "Sending consumer stopped [thread:%1$d] [logging_thread:%2$d]"

    new-array v5, v5, [Ljava/lang/Object;

    .line 388
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object v11

    invoke-virtual {v11}, Ljava/lang/Thread;->getId()J

    move-result-wide v11

    invoke-static {v11, v12}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v11

    aput-object v11, v5, v8

    .line 389
    invoke-static {v6, v7}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v6

    aput-object v6, v5, v9

    .line 386
    invoke-static {v4, v10, v5}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v4

    .line 385
    invoke-static {v0, v4}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I
    :try_end_a
    .catchall {:try_start_a .. :try_end_a} :catchall_2

    goto :goto_3

    :catchall_1
    move-exception v0

    .line 366
    :try_start_b
    monitor-exit v6
    :try_end_b
    .catchall {:try_start_b .. :try_end_b} :catchall_1

    :try_start_c
    throw v0

    .line 391
    :cond_1
    sget-object v0, Lcom/shopkick/logging/RemoteAppender;->LOG_TAG:Ljava/lang/String;

    sget-object v3, Ljava/util/Locale;->US:Ljava/util/Locale;

    const-string v4, "Sending consumer found already stopped [thread:%1$d]"

    new-array v5, v9, [Ljava/lang/Object;

    .line 394
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object v6

    invoke-virtual {v6}, Ljava/lang/Thread;->getId()J

    move-result-wide v6

    invoke-static {v6, v7}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v6

    aput-object v6, v5, v8

    .line 392
    invoke-static {v3, v4, v5}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v3

    .line 391
    invoke-static {v0, v3}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    move v3, v8

    .line 397
    :goto_3
    monitor-exit v2

    return v3

    :catchall_2
    move-exception v0

    monitor-exit v2
    :try_end_c
    .catchall {:try_start_c .. :try_end_c} :catchall_2

    throw v0
.end method
