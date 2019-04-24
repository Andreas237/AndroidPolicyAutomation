.class public Lcom/launchdarkly/eventsource/EventSource;
.super Ljava/lang/Object;
.source "EventSource.java"

# interfaces
.implements Lcom/launchdarkly/eventsource/ConnectionHandler;
.implements Ljava/io/Closeable;


# annotations
.annotation build Lcom/newrelic/agent/android/instrumentation/Instrumented;
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/launchdarkly/eventsource/EventSource$Builder;
    }
.end annotation


# instance fields
.field private final body:Lokhttp3/RequestBody;
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation
.end field

.field private bufferedSource:Lokio/BufferedSource;

.field private volatile call:Lokhttp3/Call;

.field private final client:Lokhttp3/OkHttpClient;

.field private final connectionErrorHandler:Lcom/launchdarkly/eventsource/ConnectionErrorHandler;

.field private final eventExecutor:Ljava/util/concurrent/ExecutorService;

.field private final handler:Lcom/launchdarkly/eventsource/EventHandler;

.field private final headers:Lokhttp3/Headers;

.field private final jitter:Ljava/util/Random;

.field private volatile lastEventId:Ljava/lang/String;

.field private final logger:Lorg/slf4j/Logger;

.field private maxReconnectTimeMs:J

.field private final method:Ljava/lang/String;

.field private final name:Ljava/lang/String;

.field private final readyState:Ljava/util/concurrent/atomic/AtomicReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/concurrent/atomic/AtomicReference<",
            "Lcom/launchdarkly/eventsource/ReadyState;",
            ">;"
        }
    .end annotation
.end field

.field private reconnectTimeMs:J

.field private response:Lokhttp3/Response;

.field private final streamExecutor:Ljava/util/concurrent/ExecutorService;

.field private volatile uri:Ljava/net/URI;


# direct methods
.method constructor <init>(Lcom/launchdarkly/eventsource/EventSource$Builder;)V
    .locals 3

    .line 71
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-wide/16 v0, 0x0

    .line 59
    iput-wide v0, p0, Lcom/launchdarkly/eventsource/EventSource;->reconnectTimeMs:J

    .line 67
    new-instance v0, Ljava/util/Random;

    invoke-direct {v0}, Ljava/util/Random;-><init>()V

    iput-object v0, p0, Lcom/launchdarkly/eventsource/EventSource;->jitter:Ljava/util/Random;

    .line 72
    invoke-static {p1}, Lcom/launchdarkly/eventsource/EventSource$Builder;->access$000(Lcom/launchdarkly/eventsource/EventSource$Builder;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/launchdarkly/eventsource/EventSource;->name:Ljava/lang/String;

    .line 73
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-class v1, Lcom/launchdarkly/eventsource/EventSource;

    invoke-virtual {v1}, Ljava/lang/Class;->getCanonicalName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "."

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/launchdarkly/eventsource/EventSource;->name:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lorg/slf4j/LoggerFactory;->getLogger(Ljava/lang/String;)Lorg/slf4j/Logger;

    move-result-object v0

    iput-object v0, p0, Lcom/launchdarkly/eventsource/EventSource;->logger:Lorg/slf4j/Logger;

    .line 74
    invoke-static {p1}, Lcom/launchdarkly/eventsource/EventSource$Builder;->access$100(Lcom/launchdarkly/eventsource/EventSource$Builder;)Ljava/net/URI;

    move-result-object v0

    iput-object v0, p0, Lcom/launchdarkly/eventsource/EventSource;->uri:Ljava/net/URI;

    .line 75
    invoke-static {p1}, Lcom/launchdarkly/eventsource/EventSource$Builder;->access$200(Lcom/launchdarkly/eventsource/EventSource$Builder;)Lokhttp3/Headers;

    move-result-object v0

    invoke-static {v0}, Lcom/launchdarkly/eventsource/EventSource;->addDefaultHeaders(Lokhttp3/Headers;)Lokhttp3/Headers;

    move-result-object v0

    iput-object v0, p0, Lcom/launchdarkly/eventsource/EventSource;->headers:Lokhttp3/Headers;

    .line 76
    invoke-static {p1}, Lcom/launchdarkly/eventsource/EventSource$Builder;->access$300(Lcom/launchdarkly/eventsource/EventSource$Builder;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/launchdarkly/eventsource/EventSource;->method:Ljava/lang/String;

    .line 77
    invoke-static {p1}, Lcom/launchdarkly/eventsource/EventSource$Builder;->access$400(Lcom/launchdarkly/eventsource/EventSource$Builder;)Lokhttp3/RequestBody;

    move-result-object v0

    iput-object v0, p0, Lcom/launchdarkly/eventsource/EventSource;->body:Lokhttp3/RequestBody;

    .line 78
    invoke-static {p1}, Lcom/launchdarkly/eventsource/EventSource$Builder;->access$500(Lcom/launchdarkly/eventsource/EventSource$Builder;)J

    move-result-wide v0

    iput-wide v0, p0, Lcom/launchdarkly/eventsource/EventSource;->reconnectTimeMs:J

    .line 79
    invoke-static {p1}, Lcom/launchdarkly/eventsource/EventSource$Builder;->access$600(Lcom/launchdarkly/eventsource/EventSource$Builder;)J

    move-result-wide v0

    iput-wide v0, p0, Lcom/launchdarkly/eventsource/EventSource;->maxReconnectTimeMs:J

    const-string v0, "okhttp-eventsource-events"

    .line 80
    invoke-direct {p0, v0}, Lcom/launchdarkly/eventsource/EventSource;->createThreadFactory(Ljava/lang/String;)Ljava/util/concurrent/ThreadFactory;

    move-result-object v0

    .line 81
    invoke-static {v0}, Ljava/util/concurrent/Executors;->newSingleThreadExecutor(Ljava/util/concurrent/ThreadFactory;)Ljava/util/concurrent/ExecutorService;

    move-result-object v0

    iput-object v0, p0, Lcom/launchdarkly/eventsource/EventSource;->eventExecutor:Ljava/util/concurrent/ExecutorService;

    const-string v0, "okhttp-eventsource-stream"

    .line 82
    invoke-direct {p0, v0}, Lcom/launchdarkly/eventsource/EventSource;->createThreadFactory(Ljava/lang/String;)Ljava/util/concurrent/ThreadFactory;

    move-result-object v0

    .line 83
    invoke-static {v0}, Ljava/util/concurrent/Executors;->newSingleThreadExecutor(Ljava/util/concurrent/ThreadFactory;)Ljava/util/concurrent/ExecutorService;

    move-result-object v0

    iput-object v0, p0, Lcom/launchdarkly/eventsource/EventSource;->streamExecutor:Ljava/util/concurrent/ExecutorService;

    .line 84
    new-instance v0, Lcom/launchdarkly/eventsource/AsyncEventHandler;

    iget-object v1, p0, Lcom/launchdarkly/eventsource/EventSource;->eventExecutor:Ljava/util/concurrent/ExecutorService;

    invoke-static {p1}, Lcom/launchdarkly/eventsource/EventSource$Builder;->access$700(Lcom/launchdarkly/eventsource/EventSource$Builder;)Lcom/launchdarkly/eventsource/EventHandler;

    move-result-object v2

    invoke-direct {v0, v1, v2}, Lcom/launchdarkly/eventsource/AsyncEventHandler;-><init>(Ljava/util/concurrent/Executor;Lcom/launchdarkly/eventsource/EventHandler;)V

    iput-object v0, p0, Lcom/launchdarkly/eventsource/EventSource;->handler:Lcom/launchdarkly/eventsource/EventHandler;

    .line 85
    invoke-static {p1}, Lcom/launchdarkly/eventsource/EventSource$Builder;->access$800(Lcom/launchdarkly/eventsource/EventSource$Builder;)Lcom/launchdarkly/eventsource/ConnectionErrorHandler;

    move-result-object v0

    iput-object v0, p0, Lcom/launchdarkly/eventsource/EventSource;->connectionErrorHandler:Lcom/launchdarkly/eventsource/ConnectionErrorHandler;

    .line 86
    new-instance v0, Ljava/util/concurrent/atomic/AtomicReference;

    sget-object v1, Lcom/launchdarkly/eventsource/ReadyState;->RAW:Lcom/launchdarkly/eventsource/ReadyState;

    invoke-direct {v0, v1}, Ljava/util/concurrent/atomic/AtomicReference;-><init>(Ljava/lang/Object;)V

    iput-object v0, p0, Lcom/launchdarkly/eventsource/EventSource;->readyState:Ljava/util/concurrent/atomic/AtomicReference;

    .line 87
    invoke-static {p1}, Lcom/launchdarkly/eventsource/EventSource$Builder;->access$900(Lcom/launchdarkly/eventsource/EventSource$Builder;)Lokhttp3/OkHttpClient$Builder;

    move-result-object p1

    invoke-virtual {p1}, Lokhttp3/OkHttpClient$Builder;->build()Lokhttp3/OkHttpClient;

    move-result-object p1

    iput-object p1, p0, Lcom/launchdarkly/eventsource/EventSource;->client:Lokhttp3/OkHttpClient;

    return-void
.end method

.method static synthetic access$1000(Lcom/launchdarkly/eventsource/EventSource;)Ljava/lang/String;
    .locals 0

    .line 43
    iget-object p0, p0, Lcom/launchdarkly/eventsource/EventSource;->name:Ljava/lang/String;

    return-object p0
.end method

.method static synthetic access$1100(Lcom/launchdarkly/eventsource/EventSource;)V
    .locals 0

    .line 43
    invoke-direct {p0}, Lcom/launchdarkly/eventsource/EventSource;->connect()V

    return-void
.end method

.method private static addDefaultHeaders(Lokhttp3/Headers;)Lokhttp3/Headers;
    .locals 5

    .line 321
    new-instance v0, Lokhttp3/Headers$Builder;

    invoke-direct {v0}, Lokhttp3/Headers$Builder;-><init>()V

    const-string v1, "Accept"

    const-string v2, "text/event-stream"

    .line 323
    invoke-virtual {v0, v1, v2}, Lokhttp3/Headers$Builder;->add(Ljava/lang/String;Ljava/lang/String;)Lokhttp3/Headers$Builder;

    move-result-object v1

    const-string v2, "Cache-Control"

    const-string v3, "no-cache"

    invoke-virtual {v1, v2, v3}, Lokhttp3/Headers$Builder;->add(Ljava/lang/String;Ljava/lang/String;)Lokhttp3/Headers$Builder;

    .line 325
    invoke-virtual {p0}, Lokhttp3/Headers;->toMultimap()Ljava/util/Map;

    move-result-object p0

    invoke-interface {p0}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object p0

    invoke-interface {p0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :cond_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/Map$Entry;

    .line 326
    invoke-interface {v1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/util/List;

    invoke-interface {v2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_0

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/String;

    .line 327
    invoke-interface {v1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/String;

    invoke-virtual {v0, v4, v3}, Lokhttp3/Headers$Builder;->add(Ljava/lang/String;Ljava/lang/String;)Lokhttp3/Headers$Builder;

    goto :goto_0

    .line 331
    :cond_1
    invoke-virtual {v0}, Lokhttp3/Headers$Builder;->build()Lokhttp3/Headers;

    move-result-object p0

    return-object p0
.end method

.method private connect()V
    .locals 11

    const/4 v0, 0x0

    .line 174
    iput-object v0, p0, Lcom/launchdarkly/eventsource/EventSource;->response:Lokhttp3/Response;

    .line 175
    iput-object v0, p0, Lcom/launchdarkly/eventsource/EventSource;->bufferedSource:Lokio/BufferedSource;

    const/4 v1, 0x0

    move-object v3, v0

    const/4 v2, 0x0

    .line 181
    :goto_0
    :try_start_0
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/Thread;->isInterrupted()Z

    move-result v4

    if-nez v4, :cond_18

    iget-object v4, p0, Lcom/launchdarkly/eventsource/EventSource;->readyState:Ljava/util/concurrent/atomic/AtomicReference;

    invoke-virtual {v4}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    move-result-object v4

    sget-object v5, Lcom/launchdarkly/eventsource/ReadyState;->SHUTDOWN:Lcom/launchdarkly/eventsource/ReadyState;

    if-eq v4, v5, :cond_18

    add-int/lit8 v4, v2, 0x1

    .line 184
    invoke-direct {p0, v2}, Lcom/launchdarkly/eventsource/EventSource;->maybeWaitWithBackoff(I)V

    .line 185
    iget-object v2, p0, Lcom/launchdarkly/eventsource/EventSource;->readyState:Ljava/util/concurrent/atomic/AtomicReference;

    sget-object v5, Lcom/launchdarkly/eventsource/ReadyState;->CONNECTING:Lcom/launchdarkly/eventsource/ReadyState;

    invoke-virtual {v2, v5}, Ljava/util/concurrent/atomic/AtomicReference;->getAndSet(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/launchdarkly/eventsource/ReadyState;

    .line 186
    iget-object v5, p0, Lcom/launchdarkly/eventsource/EventSource;->logger:Lorg/slf4j/Logger;

    new-instance v6, Ljava/lang/StringBuilder;

    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    const-string v7, "readyState change: "

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v2, " -> "

    invoke-virtual {v6, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    sget-object v2, Lcom/launchdarkly/eventsource/ReadyState;->CONNECTING:Lcom/launchdarkly/eventsource/ReadyState;

    invoke-virtual {v6, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-interface {v5, v2}, Lorg/slf4j/Logger;->debug(Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/util/concurrent/RejectedExecutionException; {:try_start_0 .. :try_end_0} :catch_d

    const/4 v2, 0x1

    .line 188
    :try_start_1
    iget-object v5, p0, Lcom/launchdarkly/eventsource/EventSource;->client:Lokhttp3/OkHttpClient;

    invoke-virtual {p0}, Lcom/launchdarkly/eventsource/EventSource;->buildRequest()Lokhttp3/Request;

    move-result-object v6

    instance-of v7, v5, Lokhttp3/OkHttpClient;

    if-nez v7, :cond_0

    invoke-virtual {v5, v6}, Lokhttp3/OkHttpClient;->newCall(Lokhttp3/Request;)Lokhttp3/Call;

    move-result-object v5

    goto :goto_1

    :cond_0
    check-cast v5, Lokhttp3/OkHttpClient;

    invoke-static {v5, v6}, Lcom/newrelic/agent/android/instrumentation/okhttp3/OkHttp3Instrumentation;->newCall(Lokhttp3/OkHttpClient;Lokhttp3/Request;)Lokhttp3/Call;

    move-result-object v5

    :goto_1
    iput-object v5, p0, Lcom/launchdarkly/eventsource/EventSource;->call:Lokhttp3/Call;

    .line 189
    iget-object v5, p0, Lcom/launchdarkly/eventsource/EventSource;->call:Lokhttp3/Call;

    invoke-interface {v5}, Lokhttp3/Call;->execute()Lokhttp3/Response;

    move-result-object v5

    iput-object v5, p0, Lcom/launchdarkly/eventsource/EventSource;->response:Lokhttp3/Response;

    .line 190
    iget-object v5, p0, Lcom/launchdarkly/eventsource/EventSource;->response:Lokhttp3/Response;

    invoke-virtual {v5}, Lokhttp3/Response;->isSuccessful()Z

    move-result v5
    :try_end_1
    .catch Ljava/io/EOFException; {:try_start_1 .. :try_end_1} :catch_7
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_4
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    if-eqz v5, :cond_3

    .line 192
    :try_start_2
    iget-object v5, p0, Lcom/launchdarkly/eventsource/EventSource;->readyState:Ljava/util/concurrent/atomic/AtomicReference;

    sget-object v6, Lcom/launchdarkly/eventsource/ReadyState;->OPEN:Lcom/launchdarkly/eventsource/ReadyState;

    invoke-virtual {v5, v6}, Ljava/util/concurrent/atomic/AtomicReference;->getAndSet(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lcom/launchdarkly/eventsource/ReadyState;

    .line 193
    sget-object v6, Lcom/launchdarkly/eventsource/ReadyState;->CONNECTING:Lcom/launchdarkly/eventsource/ReadyState;

    if-eq v5, v6, :cond_1

    .line 194
    iget-object v6, p0, Lcom/launchdarkly/eventsource/EventSource;->logger:Lorg/slf4j/Logger;

    new-instance v7, Ljava/lang/StringBuilder;

    invoke-direct {v7}, Ljava/lang/StringBuilder;-><init>()V

    const-string v8, "Unexpected readyState change: "

    invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v5, " -> "

    invoke-virtual {v7, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    sget-object v5, Lcom/launchdarkly/eventsource/ReadyState;->OPEN:Lcom/launchdarkly/eventsource/ReadyState;

    invoke-virtual {v7, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    invoke-interface {v6, v5}, Lorg/slf4j/Logger;->warn(Ljava/lang/String;)V

    goto :goto_2

    .line 196
    :cond_1
    iget-object v6, p0, Lcom/launchdarkly/eventsource/EventSource;->logger:Lorg/slf4j/Logger;

    new-instance v7, Ljava/lang/StringBuilder;

    invoke-direct {v7}, Ljava/lang/StringBuilder;-><init>()V

    const-string v8, "readyState change: "

    invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v5, " -> "

    invoke-virtual {v7, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    sget-object v5, Lcom/launchdarkly/eventsource/ReadyState;->OPEN:Lcom/launchdarkly/eventsource/ReadyState;

    invoke-virtual {v7, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    invoke-interface {v6, v5}, Lorg/slf4j/Logger;->debug(Ljava/lang/String;)V

    .line 198
    :goto_2
    iget-object v5, p0, Lcom/launchdarkly/eventsource/EventSource;->logger:Lorg/slf4j/Logger;

    const-string v6, "Connected to Event Source stream."

    invoke-interface {v5, v6}, Lorg/slf4j/Logger;->info(Ljava/lang/String;)V
    :try_end_2
    .catch Ljava/io/EOFException; {:try_start_2 .. :try_end_2} :catch_8
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_1
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    .line 200
    :try_start_3
    iget-object v5, p0, Lcom/launchdarkly/eventsource/EventSource;->handler:Lcom/launchdarkly/eventsource/EventHandler;

    invoke-interface {v5}, Lcom/launchdarkly/eventsource/EventHandler;->onOpen()V
    :try_end_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_0
    .catch Ljava/io/EOFException; {:try_start_3 .. :try_end_3} :catch_8
    .catch Ljava/io/IOException; {:try_start_3 .. :try_end_3} :catch_1
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    goto :goto_3

    :catch_0
    move-exception v5

    .line 202
    :try_start_4
    iget-object v6, p0, Lcom/launchdarkly/eventsource/EventSource;->handler:Lcom/launchdarkly/eventsource/EventHandler;

    invoke-interface {v6, v5}, Lcom/launchdarkly/eventsource/EventHandler;->onError(Ljava/lang/Throwable;)V

    .line 204
    :goto_3
    iget-object v5, p0, Lcom/launchdarkly/eventsource/EventSource;->bufferedSource:Lokio/BufferedSource;

    if-eqz v5, :cond_2

    .line 205
    iget-object v5, p0, Lcom/launchdarkly/eventsource/EventSource;->bufferedSource:Lokio/BufferedSource;

    invoke-interface {v5}, Lokio/BufferedSource;->close()V

    .line 207
    :cond_2
    iget-object v5, p0, Lcom/launchdarkly/eventsource/EventSource;->response:Lokhttp3/Response;

    invoke-virtual {v5}, Lokhttp3/Response;->body()Lokhttp3/ResponseBody;

    move-result-object v5

    invoke-virtual {v5}, Lokhttp3/ResponseBody;->source()Lokio/BufferedSource;

    move-result-object v5

    invoke-static {v5}, Lokio/Okio;->buffer(Lokio/Source;)Lokio/BufferedSource;

    move-result-object v5

    iput-object v5, p0, Lcom/launchdarkly/eventsource/EventSource;->bufferedSource:Lokio/BufferedSource;

    .line 208
    new-instance v5, Lcom/launchdarkly/eventsource/EventParser;

    iget-object v6, p0, Lcom/launchdarkly/eventsource/EventSource;->uri:Ljava/net/URI;

    iget-object v7, p0, Lcom/launchdarkly/eventsource/EventSource;->handler:Lcom/launchdarkly/eventsource/EventHandler;

    invoke-direct {v5, v6, v7, p0}, Lcom/launchdarkly/eventsource/EventParser;-><init>(Ljava/net/URI;Lcom/launchdarkly/eventsource/EventHandler;Lcom/launchdarkly/eventsource/ConnectionHandler;)V

    .line 209
    :goto_4
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object v6

    invoke-virtual {v6}, Ljava/lang/Thread;->isInterrupted()Z

    move-result v6

    if-nez v6, :cond_4

    iget-object v6, p0, Lcom/launchdarkly/eventsource/EventSource;->bufferedSource:Lokio/BufferedSource;

    invoke-interface {v6}, Lokio/BufferedSource;->readUtf8LineStrict()Ljava/lang/String;

    move-result-object v6

    if-eqz v6, :cond_4

    .line 210
    invoke-virtual {v5, v6}, Lcom/launchdarkly/eventsource/EventParser;->line(Ljava/lang/String;)V
    :try_end_4
    .catch Ljava/io/EOFException; {:try_start_4 .. :try_end_4} :catch_8
    .catch Ljava/io/IOException; {:try_start_4 .. :try_end_4} :catch_1
    .catchall {:try_start_4 .. :try_end_4} :catchall_2

    goto :goto_4

    :catch_1
    move-exception v5

    const/4 v6, 0x1

    goto/16 :goto_7

    .line 213
    :cond_3
    :try_start_5
    iget-object v5, p0, Lcom/launchdarkly/eventsource/EventSource;->logger:Lorg/slf4j/Logger;

    new-instance v6, Ljava/lang/StringBuilder;

    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    const-string v7, "Unsuccessful Response: "

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v7, p0, Lcom/launchdarkly/eventsource/EventSource;->response:Lokhttp3/Response;

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v6

    invoke-interface {v5, v6}, Lorg/slf4j/Logger;->debug(Ljava/lang/String;)V

    .line 214
    new-instance v5, Lcom/launchdarkly/eventsource/UnsuccessfulResponseException;

    iget-object v6, p0, Lcom/launchdarkly/eventsource/EventSource;->response:Lokhttp3/Response;

    invoke-virtual {v6}, Lokhttp3/Response;->code()I

    move-result v6

    invoke-direct {v5, v6}, Lcom/launchdarkly/eventsource/UnsuccessfulResponseException;-><init>(I)V

    invoke-direct {p0, v5}, Lcom/launchdarkly/eventsource/EventSource;->dispatchError(Ljava/lang/Throwable;)Lcom/launchdarkly/eventsource/ConnectionErrorHandler$Action;

    move-result-object v3
    :try_end_5
    .catch Ljava/io/EOFException; {:try_start_5 .. :try_end_5} :catch_7
    .catch Ljava/io/IOException; {:try_start_5 .. :try_end_5} :catch_4
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    const/4 v2, 0x0

    .line 229
    :cond_4
    :try_start_6
    sget-object v5, Lcom/launchdarkly/eventsource/ReadyState;->CLOSED:Lcom/launchdarkly/eventsource/ReadyState;

    .line 230
    sget-object v6, Lcom/launchdarkly/eventsource/ConnectionErrorHandler$Action;->SHUTDOWN:Lcom/launchdarkly/eventsource/ConnectionErrorHandler$Action;

    if-ne v3, v6, :cond_5

    .line 231
    iget-object v5, p0, Lcom/launchdarkly/eventsource/EventSource;->logger:Lorg/slf4j/Logger;

    const-string v6, "Connection has been explicitly shut down by error handler"

    invoke-interface {v5, v6}, Lorg/slf4j/Logger;->info(Ljava/lang/String;)V

    .line 232
    sget-object v5, Lcom/launchdarkly/eventsource/ReadyState;->SHUTDOWN:Lcom/launchdarkly/eventsource/ReadyState;

    .line 234
    :cond_5
    iget-object v6, p0, Lcom/launchdarkly/eventsource/EventSource;->readyState:Ljava/util/concurrent/atomic/AtomicReference;

    invoke-virtual {v6, v5}, Ljava/util/concurrent/atomic/AtomicReference;->getAndSet(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lcom/launchdarkly/eventsource/ReadyState;

    .line 235
    iget-object v7, p0, Lcom/launchdarkly/eventsource/EventSource;->logger:Lorg/slf4j/Logger;

    new-instance v8, Ljava/lang/StringBuilder;

    invoke-direct {v8}, Ljava/lang/StringBuilder;-><init>()V

    const-string v9, "readyState change: "

    invoke-virtual {v8, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v9, " -> "

    invoke-virtual {v8, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    invoke-interface {v7, v5}, Lorg/slf4j/Logger;->debug(Ljava/lang/String;)V

    .line 237
    iget-object v5, p0, Lcom/launchdarkly/eventsource/EventSource;->response:Lokhttp3/Response;

    if-eqz v5, :cond_6

    iget-object v5, p0, Lcom/launchdarkly/eventsource/EventSource;->response:Lokhttp3/Response;

    invoke-virtual {v5}, Lokhttp3/Response;->body()Lokhttp3/ResponseBody;

    move-result-object v5

    if-eqz v5, :cond_6

    .line 238
    iget-object v5, p0, Lcom/launchdarkly/eventsource/EventSource;->response:Lokhttp3/Response;

    invoke-virtual {v5}, Lokhttp3/Response;->close()V

    .line 239
    iget-object v5, p0, Lcom/launchdarkly/eventsource/EventSource;->logger:Lorg/slf4j/Logger;

    const-string v7, "response closed"

    invoke-interface {v5, v7}, Lorg/slf4j/Logger;->debug(Ljava/lang/String;)V

    .line 242
    :cond_6
    iget-object v5, p0, Lcom/launchdarkly/eventsource/EventSource;->bufferedSource:Lokio/BufferedSource;
    :try_end_6
    .catch Ljava/util/concurrent/RejectedExecutionException; {:try_start_6 .. :try_end_6} :catch_d

    if-eqz v5, :cond_7

    .line 244
    :try_start_7
    iget-object v5, p0, Lcom/launchdarkly/eventsource/EventSource;->bufferedSource:Lokio/BufferedSource;

    invoke-interface {v5}, Lokio/BufferedSource;->close()V

    .line 245
    iget-object v5, p0, Lcom/launchdarkly/eventsource/EventSource;->logger:Lorg/slf4j/Logger;

    const-string v7, "buffered source closed"

    invoke-interface {v5, v7}, Lorg/slf4j/Logger;->debug(Ljava/lang/String;)V
    :try_end_7
    .catch Ljava/io/IOException; {:try_start_7 .. :try_end_7} :catch_2
    .catch Ljava/util/concurrent/RejectedExecutionException; {:try_start_7 .. :try_end_7} :catch_d

    goto :goto_5

    :catch_2
    move-exception v5

    .line 247
    :try_start_8
    iget-object v7, p0, Lcom/launchdarkly/eventsource/EventSource;->logger:Lorg/slf4j/Logger;

    const-string v8, "Exception when closing bufferedSource"

    invoke-interface {v7, v8, v5}, Lorg/slf4j/Logger;->warn(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 251
    :cond_7
    :goto_5
    sget-object v5, Lcom/launchdarkly/eventsource/ReadyState;->OPEN:Lcom/launchdarkly/eventsource/ReadyState;
    :try_end_8
    .catch Ljava/util/concurrent/RejectedExecutionException; {:try_start_8 .. :try_end_8} :catch_d

    if-ne v6, v5, :cond_8

    .line 253
    :try_start_9
    iget-object v5, p0, Lcom/launchdarkly/eventsource/EventSource;->handler:Lcom/launchdarkly/eventsource/EventHandler;

    invoke-interface {v5}, Lcom/launchdarkly/eventsource/EventHandler;->onClosed()V
    :try_end_9
    .catch Ljava/lang/Exception; {:try_start_9 .. :try_end_9} :catch_3
    .catch Ljava/util/concurrent/RejectedExecutionException; {:try_start_9 .. :try_end_9} :catch_d

    goto :goto_6

    :catch_3
    move-exception v5

    .line 255
    :try_start_a
    iget-object v6, p0, Lcom/launchdarkly/eventsource/EventSource;->handler:Lcom/launchdarkly/eventsource/EventHandler;

    invoke-interface {v6, v5}, Lcom/launchdarkly/eventsource/EventHandler;->onError(Ljava/lang/Throwable;)V
    :try_end_a
    .catch Ljava/util/concurrent/RejectedExecutionException; {:try_start_a .. :try_end_a} :catch_d

    :cond_8
    :goto_6
    if-eqz v2, :cond_13

    goto/16 :goto_e

    :catchall_0
    move-exception v2

    move-object v1, v2

    const/4 v2, 0x0

    goto/16 :goto_f

    :catch_4
    move-exception v5

    const/4 v6, 0x0

    .line 219
    :goto_7
    :try_start_b
    iget-object v7, p0, Lcom/launchdarkly/eventsource/EventSource;->readyState:Ljava/util/concurrent/atomic/AtomicReference;

    invoke-virtual {v7}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    move-result-object v7

    sget-object v8, Lcom/launchdarkly/eventsource/ReadyState;->SHUTDOWN:Lcom/launchdarkly/eventsource/ReadyState;

    if-eq v7, v8, :cond_9

    .line 220
    iget-object v7, p0, Lcom/launchdarkly/eventsource/EventSource;->logger:Lorg/slf4j/Logger;

    const-string v8, "Connection problem."

    invoke-interface {v7, v8, v5}, Lorg/slf4j/Logger;->debug(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 221
    invoke-direct {p0, v5}, Lcom/launchdarkly/eventsource/EventSource;->dispatchError(Ljava/lang/Throwable;)Lcom/launchdarkly/eventsource/ConnectionErrorHandler$Action;

    move-result-object v3

    goto :goto_8

    .line 223
    :cond_9
    sget-object v3, Lcom/launchdarkly/eventsource/ConnectionErrorHandler$Action;->SHUTDOWN:Lcom/launchdarkly/eventsource/ConnectionErrorHandler$Action;

    .line 225
    :goto_8
    instance-of v5, v5, Ljava/net/SocketTimeoutException;
    :try_end_b
    .catchall {:try_start_b .. :try_end_b} :catchall_1

    if-eqz v5, :cond_a

    goto :goto_9

    :cond_a
    const/4 v2, 0x0

    .line 229
    :goto_9
    :try_start_c
    sget-object v5, Lcom/launchdarkly/eventsource/ReadyState;->CLOSED:Lcom/launchdarkly/eventsource/ReadyState;

    .line 230
    sget-object v7, Lcom/launchdarkly/eventsource/ConnectionErrorHandler$Action;->SHUTDOWN:Lcom/launchdarkly/eventsource/ConnectionErrorHandler$Action;

    if-ne v3, v7, :cond_b

    .line 231
    iget-object v5, p0, Lcom/launchdarkly/eventsource/EventSource;->logger:Lorg/slf4j/Logger;

    const-string v7, "Connection has been explicitly shut down by error handler"

    invoke-interface {v5, v7}, Lorg/slf4j/Logger;->info(Ljava/lang/String;)V

    .line 232
    sget-object v5, Lcom/launchdarkly/eventsource/ReadyState;->SHUTDOWN:Lcom/launchdarkly/eventsource/ReadyState;

    .line 234
    :cond_b
    iget-object v7, p0, Lcom/launchdarkly/eventsource/EventSource;->readyState:Ljava/util/concurrent/atomic/AtomicReference;

    invoke-virtual {v7, v5}, Ljava/util/concurrent/atomic/AtomicReference;->getAndSet(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Lcom/launchdarkly/eventsource/ReadyState;

    .line 235
    iget-object v8, p0, Lcom/launchdarkly/eventsource/EventSource;->logger:Lorg/slf4j/Logger;

    new-instance v9, Ljava/lang/StringBuilder;

    invoke-direct {v9}, Ljava/lang/StringBuilder;-><init>()V

    const-string v10, "readyState change: "

    invoke-virtual {v9, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v9, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v10, " -> "

    invoke-virtual {v9, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v9, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v9}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    invoke-interface {v8, v5}, Lorg/slf4j/Logger;->debug(Ljava/lang/String;)V

    .line 237
    iget-object v5, p0, Lcom/launchdarkly/eventsource/EventSource;->response:Lokhttp3/Response;

    if-eqz v5, :cond_c

    iget-object v5, p0, Lcom/launchdarkly/eventsource/EventSource;->response:Lokhttp3/Response;

    invoke-virtual {v5}, Lokhttp3/Response;->body()Lokhttp3/ResponseBody;

    move-result-object v5

    if-eqz v5, :cond_c

    .line 238
    iget-object v5, p0, Lcom/launchdarkly/eventsource/EventSource;->response:Lokhttp3/Response;

    invoke-virtual {v5}, Lokhttp3/Response;->close()V

    .line 239
    iget-object v5, p0, Lcom/launchdarkly/eventsource/EventSource;->logger:Lorg/slf4j/Logger;

    const-string v8, "response closed"

    invoke-interface {v5, v8}, Lorg/slf4j/Logger;->debug(Ljava/lang/String;)V

    .line 242
    :cond_c
    iget-object v5, p0, Lcom/launchdarkly/eventsource/EventSource;->bufferedSource:Lokio/BufferedSource;
    :try_end_c
    .catch Ljava/util/concurrent/RejectedExecutionException; {:try_start_c .. :try_end_c} :catch_d

    if-eqz v5, :cond_d

    .line 244
    :try_start_d
    iget-object v5, p0, Lcom/launchdarkly/eventsource/EventSource;->bufferedSource:Lokio/BufferedSource;

    invoke-interface {v5}, Lokio/BufferedSource;->close()V

    .line 245
    iget-object v5, p0, Lcom/launchdarkly/eventsource/EventSource;->logger:Lorg/slf4j/Logger;

    const-string v8, "buffered source closed"

    invoke-interface {v5, v8}, Lorg/slf4j/Logger;->debug(Ljava/lang/String;)V
    :try_end_d
    .catch Ljava/io/IOException; {:try_start_d .. :try_end_d} :catch_5
    .catch Ljava/util/concurrent/RejectedExecutionException; {:try_start_d .. :try_end_d} :catch_d

    goto :goto_a

    :catch_5
    move-exception v5

    .line 247
    :try_start_e
    iget-object v8, p0, Lcom/launchdarkly/eventsource/EventSource;->logger:Lorg/slf4j/Logger;

    const-string v9, "Exception when closing bufferedSource"

    invoke-interface {v8, v9, v5}, Lorg/slf4j/Logger;->warn(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 251
    :cond_d
    :goto_a
    sget-object v5, Lcom/launchdarkly/eventsource/ReadyState;->OPEN:Lcom/launchdarkly/eventsource/ReadyState;
    :try_end_e
    .catch Ljava/util/concurrent/RejectedExecutionException; {:try_start_e .. :try_end_e} :catch_d

    if-ne v7, v5, :cond_e

    .line 253
    :try_start_f
    iget-object v5, p0, Lcom/launchdarkly/eventsource/EventSource;->handler:Lcom/launchdarkly/eventsource/EventHandler;

    invoke-interface {v5}, Lcom/launchdarkly/eventsource/EventHandler;->onClosed()V
    :try_end_f
    .catch Ljava/lang/Exception; {:try_start_f .. :try_end_f} :catch_6
    .catch Ljava/util/concurrent/RejectedExecutionException; {:try_start_f .. :try_end_f} :catch_d

    goto :goto_b

    :catch_6
    move-exception v5

    .line 255
    :try_start_10
    iget-object v7, p0, Lcom/launchdarkly/eventsource/EventSource;->handler:Lcom/launchdarkly/eventsource/EventHandler;

    invoke-interface {v7, v5}, Lcom/launchdarkly/eventsource/EventHandler;->onError(Ljava/lang/Throwable;)V
    :try_end_10
    .catch Ljava/util/concurrent/RejectedExecutionException; {:try_start_10 .. :try_end_10} :catch_d

    :cond_e
    :goto_b
    if-eqz v6, :cond_13

    if-nez v2, :cond_13

    goto/16 :goto_e

    :catchall_1
    move-exception v2

    move-object v1, v2

    move v2, v6

    goto/16 :goto_f

    :catch_7
    const/4 v2, 0x0

    .line 217
    :catch_8
    :try_start_11
    iget-object v5, p0, Lcom/launchdarkly/eventsource/EventSource;->logger:Lorg/slf4j/Logger;

    const-string v6, "Connection unexpectedly closed."

    invoke-interface {v5, v6}, Lorg/slf4j/Logger;->warn(Ljava/lang/String;)V
    :try_end_11
    .catchall {:try_start_11 .. :try_end_11} :catchall_2

    .line 229
    :try_start_12
    sget-object v5, Lcom/launchdarkly/eventsource/ReadyState;->CLOSED:Lcom/launchdarkly/eventsource/ReadyState;

    .line 230
    sget-object v6, Lcom/launchdarkly/eventsource/ConnectionErrorHandler$Action;->SHUTDOWN:Lcom/launchdarkly/eventsource/ConnectionErrorHandler$Action;

    if-ne v3, v6, :cond_f

    .line 231
    iget-object v5, p0, Lcom/launchdarkly/eventsource/EventSource;->logger:Lorg/slf4j/Logger;

    const-string v6, "Connection has been explicitly shut down by error handler"

    invoke-interface {v5, v6}, Lorg/slf4j/Logger;->info(Ljava/lang/String;)V

    .line 232
    sget-object v5, Lcom/launchdarkly/eventsource/ReadyState;->SHUTDOWN:Lcom/launchdarkly/eventsource/ReadyState;

    .line 234
    :cond_f
    iget-object v6, p0, Lcom/launchdarkly/eventsource/EventSource;->readyState:Ljava/util/concurrent/atomic/AtomicReference;

    invoke-virtual {v6, v5}, Ljava/util/concurrent/atomic/AtomicReference;->getAndSet(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lcom/launchdarkly/eventsource/ReadyState;

    .line 235
    iget-object v7, p0, Lcom/launchdarkly/eventsource/EventSource;->logger:Lorg/slf4j/Logger;

    new-instance v8, Ljava/lang/StringBuilder;

    invoke-direct {v8}, Ljava/lang/StringBuilder;-><init>()V

    const-string v9, "readyState change: "

    invoke-virtual {v8, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v9, " -> "

    invoke-virtual {v8, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    invoke-interface {v7, v5}, Lorg/slf4j/Logger;->debug(Ljava/lang/String;)V

    .line 237
    iget-object v5, p0, Lcom/launchdarkly/eventsource/EventSource;->response:Lokhttp3/Response;

    if-eqz v5, :cond_10

    iget-object v5, p0, Lcom/launchdarkly/eventsource/EventSource;->response:Lokhttp3/Response;

    invoke-virtual {v5}, Lokhttp3/Response;->body()Lokhttp3/ResponseBody;

    move-result-object v5

    if-eqz v5, :cond_10

    .line 238
    iget-object v5, p0, Lcom/launchdarkly/eventsource/EventSource;->response:Lokhttp3/Response;

    invoke-virtual {v5}, Lokhttp3/Response;->close()V

    .line 239
    iget-object v5, p0, Lcom/launchdarkly/eventsource/EventSource;->logger:Lorg/slf4j/Logger;

    const-string v7, "response closed"

    invoke-interface {v5, v7}, Lorg/slf4j/Logger;->debug(Ljava/lang/String;)V

    .line 242
    :cond_10
    iget-object v5, p0, Lcom/launchdarkly/eventsource/EventSource;->bufferedSource:Lokio/BufferedSource;
    :try_end_12
    .catch Ljava/util/concurrent/RejectedExecutionException; {:try_start_12 .. :try_end_12} :catch_d

    if-eqz v5, :cond_11

    .line 244
    :try_start_13
    iget-object v5, p0, Lcom/launchdarkly/eventsource/EventSource;->bufferedSource:Lokio/BufferedSource;

    invoke-interface {v5}, Lokio/BufferedSource;->close()V

    .line 245
    iget-object v5, p0, Lcom/launchdarkly/eventsource/EventSource;->logger:Lorg/slf4j/Logger;

    const-string v7, "buffered source closed"

    invoke-interface {v5, v7}, Lorg/slf4j/Logger;->debug(Ljava/lang/String;)V
    :try_end_13
    .catch Ljava/io/IOException; {:try_start_13 .. :try_end_13} :catch_9
    .catch Ljava/util/concurrent/RejectedExecutionException; {:try_start_13 .. :try_end_13} :catch_d

    goto :goto_c

    :catch_9
    move-exception v5

    .line 247
    :try_start_14
    iget-object v7, p0, Lcom/launchdarkly/eventsource/EventSource;->logger:Lorg/slf4j/Logger;

    const-string v8, "Exception when closing bufferedSource"

    invoke-interface {v7, v8, v5}, Lorg/slf4j/Logger;->warn(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 251
    :cond_11
    :goto_c
    sget-object v5, Lcom/launchdarkly/eventsource/ReadyState;->OPEN:Lcom/launchdarkly/eventsource/ReadyState;
    :try_end_14
    .catch Ljava/util/concurrent/RejectedExecutionException; {:try_start_14 .. :try_end_14} :catch_d

    if-ne v6, v5, :cond_12

    .line 253
    :try_start_15
    iget-object v5, p0, Lcom/launchdarkly/eventsource/EventSource;->handler:Lcom/launchdarkly/eventsource/EventHandler;

    invoke-interface {v5}, Lcom/launchdarkly/eventsource/EventHandler;->onClosed()V
    :try_end_15
    .catch Ljava/lang/Exception; {:try_start_15 .. :try_end_15} :catch_a
    .catch Ljava/util/concurrent/RejectedExecutionException; {:try_start_15 .. :try_end_15} :catch_d

    goto :goto_d

    :catch_a
    move-exception v5

    .line 255
    :try_start_16
    iget-object v6, p0, Lcom/launchdarkly/eventsource/EventSource;->handler:Lcom/launchdarkly/eventsource/EventHandler;

    invoke-interface {v6, v5}, Lcom/launchdarkly/eventsource/EventHandler;->onError(Ljava/lang/Throwable;)V

    :cond_12
    :goto_d
    if-eqz v2, :cond_13

    :goto_e
    const/4 v4, 0x0

    :cond_13
    move v2, v4

    goto/16 :goto_0

    :catchall_2
    move-exception v1

    .line 229
    :goto_f
    sget-object v4, Lcom/launchdarkly/eventsource/ReadyState;->CLOSED:Lcom/launchdarkly/eventsource/ReadyState;

    .line 230
    sget-object v5, Lcom/launchdarkly/eventsource/ConnectionErrorHandler$Action;->SHUTDOWN:Lcom/launchdarkly/eventsource/ConnectionErrorHandler$Action;

    if-ne v3, v5, :cond_14

    .line 231
    iget-object v3, p0, Lcom/launchdarkly/eventsource/EventSource;->logger:Lorg/slf4j/Logger;

    const-string v4, "Connection has been explicitly shut down by error handler"

    invoke-interface {v3, v4}, Lorg/slf4j/Logger;->info(Ljava/lang/String;)V

    .line 232
    sget-object v4, Lcom/launchdarkly/eventsource/ReadyState;->SHUTDOWN:Lcom/launchdarkly/eventsource/ReadyState;

    .line 234
    :cond_14
    iget-object v3, p0, Lcom/launchdarkly/eventsource/EventSource;->readyState:Ljava/util/concurrent/atomic/AtomicReference;

    invoke-virtual {v3, v4}, Ljava/util/concurrent/atomic/AtomicReference;->getAndSet(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/launchdarkly/eventsource/ReadyState;

    .line 235
    iget-object v5, p0, Lcom/launchdarkly/eventsource/EventSource;->logger:Lorg/slf4j/Logger;

    new-instance v6, Ljava/lang/StringBuilder;

    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    const-string v7, "readyState change: "

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v7, " -> "

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-interface {v5, v4}, Lorg/slf4j/Logger;->debug(Ljava/lang/String;)V

    .line 237
    iget-object v4, p0, Lcom/launchdarkly/eventsource/EventSource;->response:Lokhttp3/Response;

    if-eqz v4, :cond_15

    iget-object v4, p0, Lcom/launchdarkly/eventsource/EventSource;->response:Lokhttp3/Response;

    invoke-virtual {v4}, Lokhttp3/Response;->body()Lokhttp3/ResponseBody;

    move-result-object v4

    if-eqz v4, :cond_15

    .line 238
    iget-object v4, p0, Lcom/launchdarkly/eventsource/EventSource;->response:Lokhttp3/Response;

    invoke-virtual {v4}, Lokhttp3/Response;->close()V

    .line 239
    iget-object v4, p0, Lcom/launchdarkly/eventsource/EventSource;->logger:Lorg/slf4j/Logger;

    const-string v5, "response closed"

    invoke-interface {v4, v5}, Lorg/slf4j/Logger;->debug(Ljava/lang/String;)V

    .line 242
    :cond_15
    iget-object v4, p0, Lcom/launchdarkly/eventsource/EventSource;->bufferedSource:Lokio/BufferedSource;
    :try_end_16
    .catch Ljava/util/concurrent/RejectedExecutionException; {:try_start_16 .. :try_end_16} :catch_d

    if-eqz v4, :cond_16

    .line 244
    :try_start_17
    iget-object v4, p0, Lcom/launchdarkly/eventsource/EventSource;->bufferedSource:Lokio/BufferedSource;

    invoke-interface {v4}, Lokio/BufferedSource;->close()V

    .line 245
    iget-object v4, p0, Lcom/launchdarkly/eventsource/EventSource;->logger:Lorg/slf4j/Logger;

    const-string v5, "buffered source closed"

    invoke-interface {v4, v5}, Lorg/slf4j/Logger;->debug(Ljava/lang/String;)V
    :try_end_17
    .catch Ljava/io/IOException; {:try_start_17 .. :try_end_17} :catch_b
    .catch Ljava/util/concurrent/RejectedExecutionException; {:try_start_17 .. :try_end_17} :catch_d

    goto :goto_10

    :catch_b
    move-exception v4

    .line 247
    :try_start_18
    iget-object v5, p0, Lcom/launchdarkly/eventsource/EventSource;->logger:Lorg/slf4j/Logger;

    const-string v6, "Exception when closing bufferedSource"

    invoke-interface {v5, v6, v4}, Lorg/slf4j/Logger;->warn(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 251
    :cond_16
    :goto_10
    sget-object v4, Lcom/launchdarkly/eventsource/ReadyState;->OPEN:Lcom/launchdarkly/eventsource/ReadyState;
    :try_end_18
    .catch Ljava/util/concurrent/RejectedExecutionException; {:try_start_18 .. :try_end_18} :catch_d

    if-ne v3, v4, :cond_17

    .line 253
    :try_start_19
    iget-object v3, p0, Lcom/launchdarkly/eventsource/EventSource;->handler:Lcom/launchdarkly/eventsource/EventHandler;

    invoke-interface {v3}, Lcom/launchdarkly/eventsource/EventHandler;->onClosed()V
    :try_end_19
    .catch Ljava/lang/Exception; {:try_start_19 .. :try_end_19} :catch_c
    .catch Ljava/util/concurrent/RejectedExecutionException; {:try_start_19 .. :try_end_19} :catch_d

    goto :goto_11

    :catch_c
    move-exception v3

    .line 255
    :try_start_1a
    iget-object v4, p0, Lcom/launchdarkly/eventsource/EventSource;->handler:Lcom/launchdarkly/eventsource/EventHandler;

    invoke-interface {v4, v3}, Lcom/launchdarkly/eventsource/EventHandler;->onError(Ljava/lang/Throwable;)V

    .line 262
    :cond_17
    :goto_11
    throw v1
    :try_end_1a
    .catch Ljava/util/concurrent/RejectedExecutionException; {:try_start_1a .. :try_end_1a} :catch_d

    :catch_d
    move-exception v1

    .line 265
    iput-object v0, p0, Lcom/launchdarkly/eventsource/EventSource;->call:Lokhttp3/Call;

    .line 266
    iput-object v0, p0, Lcom/launchdarkly/eventsource/EventSource;->response:Lokhttp3/Response;

    .line 267
    iput-object v0, p0, Lcom/launchdarkly/eventsource/EventSource;->bufferedSource:Lokio/BufferedSource;

    .line 268
    iget-object v0, p0, Lcom/launchdarkly/eventsource/EventSource;->logger:Lorg/slf4j/Logger;

    const-string v2, "Rejected execution exception ignored: "

    invoke-interface {v0, v2, v1}, Lorg/slf4j/Logger;->debug(Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_18
    return-void
.end method

.method private createThreadFactory(Ljava/lang/String;)Ljava/util/concurrent/ThreadFactory;
    .locals 4

    .line 92
    invoke-static {}, Ljava/util/concurrent/Executors;->defaultThreadFactory()Ljava/util/concurrent/ThreadFactory;

    move-result-object v0

    .line 93
    new-instance v1, Ljava/util/concurrent/atomic/AtomicLong;

    const-wide/16 v2, 0x0

    invoke-direct {v1, v2, v3}, Ljava/util/concurrent/atomic/AtomicLong;-><init>(J)V

    .line 94
    new-instance v2, Lcom/launchdarkly/eventsource/EventSource$1;

    invoke-direct {v2, p0, v0, p1, v1}, Lcom/launchdarkly/eventsource/EventSource$1;-><init>(Lcom/launchdarkly/eventsource/EventSource;Ljava/util/concurrent/ThreadFactory;Ljava/lang/String;Ljava/util/concurrent/atomic/AtomicLong;)V

    return-object v2
.end method

.method private dispatchError(Ljava/lang/Throwable;)Lcom/launchdarkly/eventsource/ConnectionErrorHandler$Action;
    .locals 2

    .line 275
    iget-object v0, p0, Lcom/launchdarkly/eventsource/EventSource;->connectionErrorHandler:Lcom/launchdarkly/eventsource/ConnectionErrorHandler;

    invoke-interface {v0, p1}, Lcom/launchdarkly/eventsource/ConnectionErrorHandler;->onConnectionError(Ljava/lang/Throwable;)Lcom/launchdarkly/eventsource/ConnectionErrorHandler$Action;

    move-result-object v0

    .line 276
    sget-object v1, Lcom/launchdarkly/eventsource/ConnectionErrorHandler$Action;->SHUTDOWN:Lcom/launchdarkly/eventsource/ConnectionErrorHandler$Action;

    if-eq v0, v1, :cond_0

    .line 277
    iget-object v1, p0, Lcom/launchdarkly/eventsource/EventSource;->handler:Lcom/launchdarkly/eventsource/EventHandler;

    invoke-interface {v1, p1}, Lcom/launchdarkly/eventsource/EventHandler;->onError(Ljava/lang/Throwable;)V

    :cond_0
    return-object v0
.end method

.method private maybeWaitWithBackoff(I)V
    .locals 5

    .line 283
    iget-wide v0, p0, Lcom/launchdarkly/eventsource/EventSource;->reconnectTimeMs:J

    const-wide/16 v2, 0x0

    cmp-long v4, v0, v2

    if-lez v4, :cond_0

    if-lez p1, :cond_0

    .line 285
    :try_start_0
    invoke-virtual {p0, p1}, Lcom/launchdarkly/eventsource/EventSource;->backoffWithJitter(I)J

    move-result-wide v0

    .line 286
    iget-object p1, p0, Lcom/launchdarkly/eventsource/EventSource;->logger:Lorg/slf4j/Logger;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Waiting "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v0, v1}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v3, " milliseconds before reconnecting..."

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-interface {p1, v2}, Lorg/slf4j/Logger;->info(Ljava/lang/String;)V

    .line 287
    invoke-static {v0, v1}, Ljava/lang/Thread;->sleep(J)V
    :try_end_0
    .catch Ljava/lang/InterruptedException; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    :cond_0
    return-void
.end method

.method private nextLong(Ljava/util/Random;J)J
    .locals 11

    const-wide/16 v0, 0x0

    cmp-long v2, p2, v0

    if-lez v2, :cond_2

    .line 310
    invoke-virtual {p1}, Ljava/util/Random;->nextLong()J

    move-result-wide v2

    const-wide v4, 0x7fffffffffffffffL

    and-long/2addr v2, v4

    const-wide/16 v6, 0x1

    sub-long v6, p2, v6

    and-long v8, p2, v6

    cmp-long v10, v8, v0

    if-nez v10, :cond_0

    mul-long p2, p2, v2

    const/16 p1, 0x3f

    shr-long p1, p2, p1

    goto :goto_1

    .line 315
    :cond_0
    :goto_0
    rem-long v8, v2, p2

    sub-long/2addr v2, v8

    add-long/2addr v2, v6

    cmp-long v10, v2, v0

    if-gez v10, :cond_1

    invoke-virtual {p1}, Ljava/util/Random;->nextLong()J

    move-result-wide v2

    and-long/2addr v2, v4

    goto :goto_0

    :cond_1
    move-wide p1, v8

    :goto_1
    return-wide p1

    .line 307
    :cond_2
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "bound must be positive"

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method private pow2(I)I
    .locals 1

    const/16 v0, 0x1f

    if-ge p1, v0, :cond_0

    const/4 v0, 0x1

    shl-int p1, v0, p1

    goto :goto_0

    :cond_0
    const p1, 0x7fffffff

    :goto_0
    return p1
.end method


# virtual methods
.method backoffWithJitter(I)J
    .locals 6

    .line 294
    iget-wide v0, p0, Lcom/launchdarkly/eventsource/EventSource;->maxReconnectTimeMs:J

    iget-wide v2, p0, Lcom/launchdarkly/eventsource/EventSource;->reconnectTimeMs:J

    invoke-direct {p0, p1}, Lcom/launchdarkly/eventsource/EventSource;->pow2(I)I

    move-result p1

    int-to-long v4, p1

    mul-long v2, v2, v4

    invoke-static {v0, v1, v2, v3}, Ljava/lang/Math;->min(JJ)J

    move-result-wide v0

    const-wide/16 v2, 0x2

    .line 295
    div-long v4, v0, v2

    iget-object p1, p0, Lcom/launchdarkly/eventsource/EventSource;->jitter:Ljava/util/Random;

    invoke-direct {p0, p1, v0, v1}, Lcom/launchdarkly/eventsource/EventSource;->nextLong(Ljava/util/Random;J)J

    move-result-wide v0

    div-long/2addr v0, v2

    add-long/2addr v4, v0

    return-wide v4
.end method

.method buildRequest()Lokhttp3/Request;
    .locals 3

    .line 162
    new-instance v0, Lokhttp3/Request$Builder;

    invoke-direct {v0}, Lokhttp3/Request$Builder;-><init>()V

    iget-object v1, p0, Lcom/launchdarkly/eventsource/EventSource;->headers:Lokhttp3/Headers;

    .line 163
    invoke-virtual {v0, v1}, Lokhttp3/Request$Builder;->headers(Lokhttp3/Headers;)Lokhttp3/Request$Builder;

    move-result-object v0

    iget-object v1, p0, Lcom/launchdarkly/eventsource/EventSource;->uri:Ljava/net/URI;

    .line 164
    invoke-virtual {v1}, Ljava/net/URI;->toASCIIString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lokhttp3/Request$Builder;->url(Ljava/lang/String;)Lokhttp3/Request$Builder;

    move-result-object v0

    iget-object v1, p0, Lcom/launchdarkly/eventsource/EventSource;->method:Ljava/lang/String;

    iget-object v2, p0, Lcom/launchdarkly/eventsource/EventSource;->body:Lokhttp3/RequestBody;

    .line 165
    invoke-virtual {v0, v1, v2}, Lokhttp3/Request$Builder;->method(Ljava/lang/String;Lokhttp3/RequestBody;)Lokhttp3/Request$Builder;

    move-result-object v0

    .line 167
    iget-object v1, p0, Lcom/launchdarkly/eventsource/EventSource;->lastEventId:Ljava/lang/String;

    if-eqz v1, :cond_0

    iget-object v1, p0, Lcom/launchdarkly/eventsource/EventSource;->lastEventId:Ljava/lang/String;

    invoke-virtual {v1}, Ljava/lang/String;->isEmpty()Z

    move-result v1

    if-nez v1, :cond_0

    const-string v1, "Last-Event-ID"

    .line 168
    iget-object v2, p0, Lcom/launchdarkly/eventsource/EventSource;->lastEventId:Ljava/lang/String;

    invoke-virtual {v0, v1, v2}, Lokhttp3/Request$Builder;->addHeader(Ljava/lang/String;Ljava/lang/String;)Lokhttp3/Request$Builder;

    .line 170
    :cond_0
    instance-of v1, v0, Lokhttp3/Request$Builder;

    if-nez v1, :cond_1

    invoke-virtual {v0}, Lokhttp3/Request$Builder;->build()Lokhttp3/Request;

    move-result-object v0

    goto :goto_0

    :cond_1
    check-cast v0, Lokhttp3/Request$Builder;

    invoke-static {v0}, Lcom/newrelic/agent/android/instrumentation/okhttp3/OkHttp3Instrumentation;->build(Lokhttp3/Request$Builder;)Lokhttp3/Request;

    move-result-object v0

    :goto_0
    return-object v0
.end method

.method public close()V
    .locals 4

    .line 125
    iget-object v0, p0, Lcom/launchdarkly/eventsource/EventSource;->readyState:Ljava/util/concurrent/atomic/AtomicReference;

    sget-object v1, Lcom/launchdarkly/eventsource/ReadyState;->SHUTDOWN:Lcom/launchdarkly/eventsource/ReadyState;

    invoke-virtual {v0, v1}, Ljava/util/concurrent/atomic/AtomicReference;->getAndSet(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/launchdarkly/eventsource/ReadyState;

    .line 126
    iget-object v1, p0, Lcom/launchdarkly/eventsource/EventSource;->logger:Lorg/slf4j/Logger;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "readyState change: "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v3, " -> "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    sget-object v3, Lcom/launchdarkly/eventsource/ReadyState;->SHUTDOWN:Lcom/launchdarkly/eventsource/ReadyState;

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-interface {v1, v2}, Lorg/slf4j/Logger;->debug(Ljava/lang/String;)V

    .line 127
    sget-object v1, Lcom/launchdarkly/eventsource/ReadyState;->SHUTDOWN:Lcom/launchdarkly/eventsource/ReadyState;

    if-ne v0, v1, :cond_0

    return-void

    .line 130
    :cond_0
    sget-object v1, Lcom/launchdarkly/eventsource/ReadyState;->OPEN:Lcom/launchdarkly/eventsource/ReadyState;

    if-ne v0, v1, :cond_1

    .line 132
    :try_start_0
    iget-object v0, p0, Lcom/launchdarkly/eventsource/EventSource;->handler:Lcom/launchdarkly/eventsource/EventHandler;

    invoke-interface {v0}, Lcom/launchdarkly/eventsource/EventHandler;->onClosed()V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v0

    .line 134
    iget-object v1, p0, Lcom/launchdarkly/eventsource/EventSource;->handler:Lcom/launchdarkly/eventsource/EventHandler;

    invoke-interface {v1, v0}, Lcom/launchdarkly/eventsource/EventHandler;->onError(Ljava/lang/Throwable;)V

    .line 138
    :cond_1
    :goto_0
    iget-object v0, p0, Lcom/launchdarkly/eventsource/EventSource;->call:Lokhttp3/Call;

    if-eqz v0, :cond_2

    .line 142
    iget-object v0, p0, Lcom/launchdarkly/eventsource/EventSource;->call:Lokhttp3/Call;

    invoke-interface {v0}, Lokhttp3/Call;->cancel()V

    .line 143
    iget-object v0, p0, Lcom/launchdarkly/eventsource/EventSource;->logger:Lorg/slf4j/Logger;

    const-string v1, "call cancelled"

    invoke-interface {v0, v1}, Lorg/slf4j/Logger;->debug(Ljava/lang/String;)V

    .line 146
    :cond_2
    iget-object v0, p0, Lcom/launchdarkly/eventsource/EventSource;->eventExecutor:Ljava/util/concurrent/ExecutorService;

    invoke-interface {v0}, Ljava/util/concurrent/ExecutorService;->shutdownNow()Ljava/util/List;

    .line 147
    iget-object v0, p0, Lcom/launchdarkly/eventsource/EventSource;->streamExecutor:Ljava/util/concurrent/ExecutorService;

    invoke-interface {v0}, Ljava/util/concurrent/ExecutorService;->shutdownNow()Ljava/util/List;

    .line 149
    iget-object v0, p0, Lcom/launchdarkly/eventsource/EventSource;->client:Lokhttp3/OkHttpClient;

    if-eqz v0, :cond_4

    .line 150
    invoke-virtual {v0}, Lokhttp3/OkHttpClient;->connectionPool()Lokhttp3/ConnectionPool;

    move-result-object v0

    if-eqz v0, :cond_3

    .line 151
    iget-object v0, p0, Lcom/launchdarkly/eventsource/EventSource;->client:Lokhttp3/OkHttpClient;

    invoke-virtual {v0}, Lokhttp3/OkHttpClient;->connectionPool()Lokhttp3/ConnectionPool;

    move-result-object v0

    invoke-virtual {v0}, Lokhttp3/ConnectionPool;->evictAll()V

    .line 153
    :cond_3
    iget-object v0, p0, Lcom/launchdarkly/eventsource/EventSource;->client:Lokhttp3/OkHttpClient;

    invoke-virtual {v0}, Lokhttp3/OkHttpClient;->dispatcher()Lokhttp3/Dispatcher;

    move-result-object v0

    if-eqz v0, :cond_4

    .line 154
    iget-object v0, p0, Lcom/launchdarkly/eventsource/EventSource;->client:Lokhttp3/OkHttpClient;

    invoke-virtual {v0}, Lokhttp3/OkHttpClient;->dispatcher()Lokhttp3/Dispatcher;

    move-result-object v0

    invoke-virtual {v0}, Lokhttp3/Dispatcher;->cancelAll()V

    .line 155
    iget-object v0, p0, Lcom/launchdarkly/eventsource/EventSource;->client:Lokhttp3/OkHttpClient;

    invoke-virtual {v0}, Lokhttp3/OkHttpClient;->dispatcher()Lokhttp3/Dispatcher;

    move-result-object v0

    invoke-virtual {v0}, Lokhttp3/Dispatcher;->executorService()Ljava/util/concurrent/ExecutorService;

    move-result-object v0

    if-eqz v0, :cond_4

    .line 156
    iget-object v0, p0, Lcom/launchdarkly/eventsource/EventSource;->client:Lokhttp3/OkHttpClient;

    invoke-virtual {v0}, Lokhttp3/OkHttpClient;->dispatcher()Lokhttp3/Dispatcher;

    move-result-object v0

    invoke-virtual {v0}, Lokhttp3/Dispatcher;->executorService()Ljava/util/concurrent/ExecutorService;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/concurrent/ExecutorService;->shutdownNow()Ljava/util/List;

    :cond_4
    return-void
.end method

.method public setLastEventId(Ljava/lang/String;)V
    .locals 0

    .line 347
    iput-object p1, p0, Lcom/launchdarkly/eventsource/EventSource;->lastEventId:Ljava/lang/String;

    return-void
.end method

.method public setReconnectionTimeMs(J)V
    .locals 0

    .line 335
    iput-wide p1, p0, Lcom/launchdarkly/eventsource/EventSource;->reconnectTimeMs:J

    return-void
.end method

.method public start()V
    .locals 3

    .line 106
    iget-object v0, p0, Lcom/launchdarkly/eventsource/EventSource;->readyState:Ljava/util/concurrent/atomic/AtomicReference;

    sget-object v1, Lcom/launchdarkly/eventsource/ReadyState;->RAW:Lcom/launchdarkly/eventsource/ReadyState;

    sget-object v2, Lcom/launchdarkly/eventsource/ReadyState;->CONNECTING:Lcom/launchdarkly/eventsource/ReadyState;

    invoke-virtual {v0, v1, v2}, Ljava/util/concurrent/atomic/AtomicReference;->compareAndSet(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 107
    iget-object v0, p0, Lcom/launchdarkly/eventsource/EventSource;->logger:Lorg/slf4j/Logger;

    const-string v1, "Start method called on this already-started EventSource object. Doing nothing"

    invoke-interface {v0, v1}, Lorg/slf4j/Logger;->info(Ljava/lang/String;)V

    return-void

    .line 110
    :cond_0
    iget-object v0, p0, Lcom/launchdarkly/eventsource/EventSource;->logger:Lorg/slf4j/Logger;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "readyState change: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    sget-object v2, Lcom/launchdarkly/eventsource/ReadyState;->RAW:Lcom/launchdarkly/eventsource/ReadyState;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v2, " -> "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    sget-object v2, Lcom/launchdarkly/eventsource/ReadyState;->CONNECTING:Lcom/launchdarkly/eventsource/ReadyState;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v1}, Lorg/slf4j/Logger;->debug(Ljava/lang/String;)V

    .line 111
    iget-object v0, p0, Lcom/launchdarkly/eventsource/EventSource;->logger:Lorg/slf4j/Logger;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Starting EventSource client using URI: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, p0, Lcom/launchdarkly/eventsource/EventSource;->uri:Ljava/net/URI;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v1}, Lorg/slf4j/Logger;->info(Ljava/lang/String;)V

    .line 112
    iget-object v0, p0, Lcom/launchdarkly/eventsource/EventSource;->streamExecutor:Ljava/util/concurrent/ExecutorService;

    new-instance v1, Lcom/launchdarkly/eventsource/EventSource$2;

    invoke-direct {v1, p0}, Lcom/launchdarkly/eventsource/EventSource$2;-><init>(Lcom/launchdarkly/eventsource/EventSource;)V

    invoke-interface {v0, v1}, Ljava/util/concurrent/ExecutorService;->execute(Ljava/lang/Runnable;)V

    return-void
.end method
