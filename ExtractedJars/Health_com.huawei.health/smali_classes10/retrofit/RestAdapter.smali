.class public Lretrofit/RestAdapter;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lretrofit/RestAdapter$Builder;,
        Lretrofit/RestAdapter$RestHandler;,
        Lretrofit/RestAdapter$LogLevel;,
        Lretrofit/RestAdapter$Log;
    }
.end annotation


# static fields
.field static final IDLE_THREAD_NAME:Ljava/lang/String; = "Retrofit-Idle"

.field static final THREAD_PREFIX:Ljava/lang/String; = "Retrofit-"


# instance fields
.field final callbackExecutor:Ljava/util/concurrent/Executor;

.field private final clientProvider:Lretrofit/client/Client$Provider;

.field final converter:Lretrofit/converter/Converter;

.field final errorHandler:Lretrofit/ErrorHandler;

.field final httpExecutor:Ljava/util/concurrent/Executor;

.field final log:Lretrofit/RestAdapter$Log;

.field volatile logLevel:Lretrofit/RestAdapter$LogLevel;

.field private final profiler:Lretrofit/Profiler;

.field final requestInterceptor:Lretrofit/RequestInterceptor;

.field private rxSupport:Lretrofit/RxSupport;

.field final server:Lretrofit/Endpoint;

.field private final serviceMethodInfoCache:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<Ljava/lang/Class<*>;Ljava/util/Map<Ljava/lang/reflect/Method;Lretrofit/RestMethodInfo;>;>;"
        }
    .end annotation
.end field


# direct methods
.method private constructor <init>(Lretrofit/Endpoint;Lretrofit/client/Client$Provider;Ljava/util/concurrent/Executor;Ljava/util/concurrent/Executor;Lretrofit/RequestInterceptor;Lretrofit/converter/Converter;Lretrofit/Profiler;Lretrofit/ErrorHandler;Lretrofit/RestAdapter$Log;Lretrofit/RestAdapter$LogLevel;)V
    .locals 1

    .line 164
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 145
    new-instance v0, Ljava/util/LinkedHashMap;

    invoke-direct {v0}, Ljava/util/LinkedHashMap;-><init>()V

    iput-object v0, p0, Lretrofit/RestAdapter;->serviceMethodInfoCache:Ljava/util/Map;

    .line 165
    iput-object p1, p0, Lretrofit/RestAdapter;->server:Lretrofit/Endpoint;

    .line 166
    iput-object p2, p0, Lretrofit/RestAdapter;->clientProvider:Lretrofit/client/Client$Provider;

    .line 167
    iput-object p3, p0, Lretrofit/RestAdapter;->httpExecutor:Ljava/util/concurrent/Executor;

    .line 168
    iput-object p4, p0, Lretrofit/RestAdapter;->callbackExecutor:Ljava/util/concurrent/Executor;

    .line 169
    iput-object p5, p0, Lretrofit/RestAdapter;->requestInterceptor:Lretrofit/RequestInterceptor;

    .line 170
    iput-object p6, p0, Lretrofit/RestAdapter;->converter:Lretrofit/converter/Converter;

    .line 171
    iput-object p7, p0, Lretrofit/RestAdapter;->profiler:Lretrofit/Profiler;

    .line 172
    iput-object p8, p0, Lretrofit/RestAdapter;->errorHandler:Lretrofit/ErrorHandler;

    .line 173
    iput-object p9, p0, Lretrofit/RestAdapter;->log:Lretrofit/RestAdapter$Log;

    .line 174
    iput-object p10, p0, Lretrofit/RestAdapter;->logLevel:Lretrofit/RestAdapter$LogLevel;

    .line 175
    return-void
.end method

.method synthetic constructor <init>(Lretrofit/Endpoint;Lretrofit/client/Client$Provider;Ljava/util/concurrent/Executor;Ljava/util/concurrent/Executor;Lretrofit/RequestInterceptor;Lretrofit/converter/Converter;Lretrofit/Profiler;Lretrofit/ErrorHandler;Lretrofit/RestAdapter$Log;Lretrofit/RestAdapter$LogLevel;Lretrofit/RestAdapter$1;)V
    .locals 0

    .line 107
    invoke-direct/range {p0 .. p10}, Lretrofit/RestAdapter;-><init>(Lretrofit/Endpoint;Lretrofit/client/Client$Provider;Ljava/util/concurrent/Executor;Ljava/util/concurrent/Executor;Lretrofit/RequestInterceptor;Lretrofit/converter/Converter;Lretrofit/Profiler;Lretrofit/ErrorHandler;Lretrofit/RestAdapter$Log;Lretrofit/RestAdapter$LogLevel;)V

    return-void
.end method

.method static synthetic access$000(Lretrofit/RestAdapter;)Lretrofit/RxSupport;
    .locals 1

    .line 107
    iget-object v0, p0, Lretrofit/RestAdapter;->rxSupport:Lretrofit/RxSupport;

    return-object v0
.end method

.method static synthetic access$002(Lretrofit/RestAdapter;Lretrofit/RxSupport;)Lretrofit/RxSupport;
    .locals 0

    .line 107
    iput-object p1, p0, Lretrofit/RestAdapter;->rxSupport:Lretrofit/RxSupport;

    return-object p1
.end method

.method static synthetic access$200(Lretrofit/RestAdapter;)Lretrofit/Profiler;
    .locals 1

    .line 107
    iget-object v0, p0, Lretrofit/RestAdapter;->profiler:Lretrofit/Profiler;

    return-object v0
.end method

.method static synthetic access$300(Lretrofit/RestAdapter;)Lretrofit/client/Client$Provider;
    .locals 1

    .line 107
    iget-object v0, p0, Lretrofit/RestAdapter;->clientProvider:Lretrofit/client/Client$Provider;

    return-object v0
.end method

.method static synthetic access$400(Ljava/lang/String;Lretrofit/RestMethodInfo;Lretrofit/client/Request;)Lretrofit/Profiler$RequestInformation;
    .locals 1

    .line 107
    invoke-static {p0, p1, p2}, Lretrofit/RestAdapter;->getRequestInfo(Ljava/lang/String;Lretrofit/RestMethodInfo;Lretrofit/client/Request;)Lretrofit/Profiler$RequestInformation;

    move-result-object v0

    return-object v0
.end method

.method static synthetic access$500(Lretrofit/RestAdapter;Ljava/lang/String;Lretrofit/client/Response;J)Lretrofit/client/Response;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 107
    invoke-direct {p0, p1, p2, p3, p4}, Lretrofit/RestAdapter;->logAndReplaceResponse(Ljava/lang/String;Lretrofit/client/Response;J)Lretrofit/client/Response;

    move-result-object v0

    return-object v0
.end method

.method static synthetic access$600(Lretrofit/RestAdapter;Lretrofit/mime/TypedInput;Ljava/lang/Object;)V
    .locals 0

    .line 107
    invoke-direct {p0, p1, p2}, Lretrofit/RestAdapter;->logResponseBody(Lretrofit/mime/TypedInput;Ljava/lang/Object;)V

    return-void
.end method

.method static getMethodInfo(Ljava/util/Map;Ljava/lang/reflect/Method;)Lretrofit/RestMethodInfo;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/Map<Ljava/lang/reflect/Method;Lretrofit/RestMethodInfo;>;Ljava/lang/reflect/Method;)Lretrofit/RestMethodInfo;"
        }
    .end annotation

    .line 210
    move-object v1, p0

    monitor-enter v1

    .line 211
    :try_start_0
    invoke-interface {p0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    move-object v2, v0

    check-cast v2, Lretrofit/RestMethodInfo;

    .line 212
    if-nez v2, :cond_0

    .line 213
    new-instance v2, Lretrofit/RestMethodInfo;

    invoke-direct {v2, p1}, Lretrofit/RestMethodInfo;-><init>(Ljava/lang/reflect/Method;)V

    .line 214
    invoke-interface {p0, p1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 216
    :cond_0
    monitor-exit v1

    return-object v2

    .line 217
    :catchall_0
    move-exception v3

    monitor-exit v1

    throw v3
.end method

.method private static getRequestInfo(Ljava/lang/String;Lretrofit/RestMethodInfo;Lretrofit/client/Request;)Lretrofit/Profiler$RequestInformation;
    .locals 11

    .line 519
    const-wide/16 v7, 0x0

    .line 520
    const/4 v9, 0x0

    .line 522
    invoke-virtual {p2}, Lretrofit/client/Request;->getBody()Lretrofit/mime/TypedOutput;

    move-result-object v10

    .line 523
    if-eqz v10, :cond_0

    .line 524
    invoke-interface {v10}, Lretrofit/mime/TypedOutput;->length()J

    move-result-wide v7

    .line 525
    invoke-interface {v10}, Lretrofit/mime/TypedOutput;->mimeType()Ljava/lang/String;

    move-result-object v9

    .line 528
    :cond_0
    new-instance v0, Lretrofit/Profiler$RequestInformation;

    iget-object v1, p1, Lretrofit/RestMethodInfo;->requestMethod:Ljava/lang/String;

    iget-object v3, p1, Lretrofit/RestMethodInfo;->requestUrl:Ljava/lang/String;

    move-object v2, p0

    move-wide v4, v7

    move-object v6, v9

    invoke-direct/range {v0 .. v6}, Lretrofit/Profiler$RequestInformation;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JLjava/lang/String;)V

    return-object v0
.end method

.method private logAndReplaceResponse(Ljava/lang/String;Lretrofit/client/Response;J)Lretrofit/client/Response;
    .locals 11
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 464
    iget-object v0, p0, Lretrofit/RestAdapter;->log:Lretrofit/RestAdapter$Log;

    const-string v1, "<--- HTTP %s %s (%sms)"

    const/4 v2, 0x3

    new-array v2, v2, [Ljava/lang/Object;

    invoke-virtual {p2}, Lretrofit/client/Response;->getStatus()I

    move-result v3

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x1

    aput-object p1, v2, v3

    invoke-static {p3, p4}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v3

    const/4 v4, 0x2

    aput-object v3, v2, v4

    invoke-static {v1, v2}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v1}, Lretrofit/RestAdapter$Log;->log(Ljava/lang/String;)V

    .line 466
    iget-object v0, p0, Lretrofit/RestAdapter;->logLevel:Lretrofit/RestAdapter$LogLevel;

    invoke-virtual {v0}, Lretrofit/RestAdapter$LogLevel;->ordinal()I

    move-result v0

    sget-object v1, Lretrofit/RestAdapter$LogLevel;->HEADERS:Lretrofit/RestAdapter$LogLevel;

    invoke-virtual {v1}, Lretrofit/RestAdapter$LogLevel;->ordinal()I

    move-result v1

    if-lt v0, v1, :cond_4

    .line 467
    invoke-virtual {p2}, Lretrofit/client/Response;->getHeaders()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v5

    :goto_0
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v6, v0

    check-cast v6, Lretrofit/client/Header;

    .line 468
    iget-object v0, p0, Lretrofit/RestAdapter;->log:Lretrofit/RestAdapter$Log;

    invoke-virtual {v6}, Lretrofit/client/Header;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v1}, Lretrofit/RestAdapter$Log;->log(Ljava/lang/String;)V

    .line 469
    goto :goto_0

    .line 471
    :cond_0
    const-wide/16 v5, 0x0

    .line 472
    invoke-virtual {p2}, Lretrofit/client/Response;->getBody()Lretrofit/mime/TypedInput;

    move-result-object v7

    .line 473
    if-eqz v7, :cond_3

    .line 474
    invoke-interface {v7}, Lretrofit/mime/TypedInput;->length()J

    move-result-wide v5

    .line 476
    iget-object v0, p0, Lretrofit/RestAdapter;->logLevel:Lretrofit/RestAdapter$LogLevel;

    invoke-virtual {v0}, Lretrofit/RestAdapter$LogLevel;->ordinal()I

    move-result v0

    sget-object v1, Lretrofit/RestAdapter$LogLevel;->FULL:Lretrofit/RestAdapter$LogLevel;

    invoke-virtual {v1}, Lretrofit/RestAdapter$LogLevel;->ordinal()I

    move-result v1

    if-lt v0, v1, :cond_3

    .line 477
    invoke-virtual {p2}, Lretrofit/client/Response;->getHeaders()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_1

    .line 478
    iget-object v0, p0, Lretrofit/RestAdapter;->log:Lretrofit/RestAdapter$Log;

    const-string v1, ""

    invoke-interface {v0, v1}, Lretrofit/RestAdapter$Log;->log(Ljava/lang/String;)V

    .line 481
    :cond_1
    instance-of v0, v7, Lretrofit/mime/TypedByteArray;

    if-nez v0, :cond_2

    .line 483
    invoke-static {p2}, Lretrofit/Utils;->readBodyToBytesIfNecessary(Lretrofit/client/Response;)Lretrofit/client/Response;

    move-result-object p2

    .line 484
    invoke-virtual {p2}, Lretrofit/client/Response;->getBody()Lretrofit/mime/TypedInput;

    move-result-object v7

    .line 487
    :cond_2
    move-object v0, v7

    check-cast v0, Lretrofit/mime/TypedByteArray;

    invoke-virtual {v0}, Lretrofit/mime/TypedByteArray;->getBytes()[B

    move-result-object v8

    .line 488
    array-length v0, v8

    int-to-long v5, v0

    .line 489
    invoke-interface {v7}, Lretrofit/mime/TypedInput;->mimeType()Ljava/lang/String;

    move-result-object v9

    .line 490
    const-string v0, "UTF-8"

    invoke-static {v9, v0}, Lretrofit/mime/MimeUtil;->parseCharset(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v10

    .line 491
    iget-object v0, p0, Lretrofit/RestAdapter;->log:Lretrofit/RestAdapter$Log;

    new-instance v1, Ljava/lang/String;

    invoke-direct {v1, v8, v10}, Ljava/lang/String;-><init>([BLjava/lang/String;)V

    invoke-interface {v0, v1}, Lretrofit/RestAdapter$Log;->log(Ljava/lang/String;)V

    .line 495
    :cond_3
    iget-object v0, p0, Lretrofit/RestAdapter;->log:Lretrofit/RestAdapter$Log;

    const-string v1, "<--- END HTTP (%s-byte body)"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    invoke-static {v5, v6}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    invoke-static {v1, v2}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v1}, Lretrofit/RestAdapter$Log;->log(Ljava/lang/String;)V

    .line 498
    :cond_4
    return-object p2
.end method

.method private logResponseBody(Lretrofit/mime/TypedInput;Ljava/lang/Object;)V
    .locals 2

    .line 502
    iget-object v0, p0, Lretrofit/RestAdapter;->logLevel:Lretrofit/RestAdapter$LogLevel;

    invoke-virtual {v0}, Lretrofit/RestAdapter$LogLevel;->ordinal()I

    move-result v0

    sget-object v1, Lretrofit/RestAdapter$LogLevel;->HEADERS_AND_ARGS:Lretrofit/RestAdapter$LogLevel;

    invoke-virtual {v1}, Lretrofit/RestAdapter$LogLevel;->ordinal()I

    move-result v1

    if-ne v0, v1, :cond_0

    .line 503
    iget-object v0, p0, Lretrofit/RestAdapter;->log:Lretrofit/RestAdapter$Log;

    const-string v1, "<--- BODY:"

    invoke-interface {v0, v1}, Lretrofit/RestAdapter$Log;->log(Ljava/lang/String;)V

    .line 504
    iget-object v0, p0, Lretrofit/RestAdapter;->log:Lretrofit/RestAdapter$Log;

    invoke-virtual {p2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v1}, Lretrofit/RestAdapter$Log;->log(Ljava/lang/String;)V

    .line 506
    :cond_0
    return-void
.end method


# virtual methods
.method public create(Ljava/lang/Class;)Ljava/lang/Object;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:Ljava/lang/Object;>(Ljava/lang/Class<TT;>;)TT;"
        }
    .end annotation

    .line 193
    invoke-static {p1}, Lretrofit/Utils;->validateServiceClass(Ljava/lang/Class;)V

    .line 194
    invoke-virtual {p1}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v0

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Class;

    const/4 v2, 0x0

    aput-object p1, v1, v2

    new-instance v2, Lretrofit/RestAdapter$RestHandler;

    .line 195
    invoke-virtual {p0, p1}, Lretrofit/RestAdapter;->getMethodInfoCache(Ljava/lang/Class;)Ljava/util/Map;

    move-result-object v3

    invoke-direct {v2, p0, v3}, Lretrofit/RestAdapter$RestHandler;-><init>(Lretrofit/RestAdapter;Ljava/util/Map;)V

    .line 194
    invoke-static {v0, v1, v2}, Ljava/lang/reflect/Proxy;->newProxyInstance(Ljava/lang/ClassLoader;[Ljava/lang/Class;Ljava/lang/reflect/InvocationHandler;)Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method public getLogLevel()Lretrofit/RestAdapter$LogLevel;
    .locals 1

    .line 187
    iget-object v0, p0, Lretrofit/RestAdapter;->logLevel:Lretrofit/RestAdapter$LogLevel;

    return-object v0
.end method

.method getMethodInfoCache(Ljava/lang/Class;)Ljava/util/Map;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/lang/Class<*>;)Ljava/util/Map<Ljava/lang/reflect/Method;Lretrofit/RestMethodInfo;>;"
        }
    .end annotation

    .line 199
    iget-object v1, p0, Lretrofit/RestAdapter;->serviceMethodInfoCache:Ljava/util/Map;

    monitor-enter v1

    .line 200
    :try_start_0
    iget-object v0, p0, Lretrofit/RestAdapter;->serviceMethodInfoCache:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    move-object v2, v0

    check-cast v2, Ljava/util/Map;

    .line 201
    if-nez v2, :cond_0

    .line 202
    new-instance v2, Ljava/util/LinkedHashMap;

    invoke-direct {v2}, Ljava/util/LinkedHashMap;-><init>()V

    .line 203
    iget-object v0, p0, Lretrofit/RestAdapter;->serviceMethodInfoCache:Ljava/util/Map;

    invoke-interface {v0, p1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 205
    :cond_0
    monitor-exit v1

    return-object v2

    .line 206
    :catchall_0
    move-exception v3

    monitor-exit v1

    throw v3
.end method

.method logAndReplaceRequest(Ljava/lang/String;Lretrofit/client/Request;[Ljava/lang/Object;)Lretrofit/client/Request;
    .locals 12
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 411
    iget-object v0, p0, Lretrofit/RestAdapter;->log:Lretrofit/RestAdapter$Log;

    const-string v1, "---> %s %s %s"

    const/4 v2, 0x3

    new-array v2, v2, [Ljava/lang/Object;

    const/4 v3, 0x0

    aput-object p1, v2, v3

    invoke-virtual {p2}, Lretrofit/client/Request;->getMethod()Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x1

    aput-object v3, v2, v4

    invoke-virtual {p2}, Lretrofit/client/Request;->getUrl()Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x2

    aput-object v3, v2, v4

    invoke-static {v1, v2}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v1}, Lretrofit/RestAdapter$Log;->log(Ljava/lang/String;)V

    .line 413
    iget-object v0, p0, Lretrofit/RestAdapter;->logLevel:Lretrofit/RestAdapter$LogLevel;

    invoke-virtual {v0}, Lretrofit/RestAdapter$LogLevel;->ordinal()I

    move-result v0

    sget-object v1, Lretrofit/RestAdapter$LogLevel;->HEADERS:Lretrofit/RestAdapter$LogLevel;

    invoke-virtual {v1}, Lretrofit/RestAdapter$LogLevel;->ordinal()I

    move-result v1

    if-lt v0, v1, :cond_8

    .line 414
    invoke-virtual {p2}, Lretrofit/client/Request;->getHeaders()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v5

    :goto_0
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v6, v0

    check-cast v6, Lretrofit/client/Header;

    .line 415
    iget-object v0, p0, Lretrofit/RestAdapter;->log:Lretrofit/RestAdapter$Log;

    invoke-virtual {v6}, Lretrofit/client/Header;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v1}, Lretrofit/RestAdapter$Log;->log(Ljava/lang/String;)V

    .line 416
    goto :goto_0

    .line 418
    :cond_0
    const-string v5, "no"

    .line 419
    invoke-virtual {p2}, Lretrofit/client/Request;->getBody()Lretrofit/mime/TypedOutput;

    move-result-object v6

    .line 420
    if-eqz v6, :cond_7

    .line 421
    invoke-interface {v6}, Lretrofit/mime/TypedOutput;->mimeType()Ljava/lang/String;

    move-result-object v7

    .line 422
    if-eqz v7, :cond_1

    .line 423
    iget-object v0, p0, Lretrofit/RestAdapter;->log:Lretrofit/RestAdapter$Log;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Content-Type: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v1}, Lretrofit/RestAdapter$Log;->log(Ljava/lang/String;)V

    .line 426
    :cond_1
    invoke-interface {v6}, Lretrofit/mime/TypedOutput;->length()J

    move-result-wide v8

    .line 427
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, v8, v9}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "-byte"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    .line 428
    const-wide/16 v0, -0x1

    cmp-long v0, v8, v0

    if-eqz v0, :cond_2

    .line 429
    iget-object v0, p0, Lretrofit/RestAdapter;->log:Lretrofit/RestAdapter$Log;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Content-Length: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v8, v9}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v1}, Lretrofit/RestAdapter$Log;->log(Ljava/lang/String;)V

    .line 432
    :cond_2
    iget-object v0, p0, Lretrofit/RestAdapter;->logLevel:Lretrofit/RestAdapter$LogLevel;

    invoke-virtual {v0}, Lretrofit/RestAdapter$LogLevel;->ordinal()I

    move-result v0

    sget-object v1, Lretrofit/RestAdapter$LogLevel;->FULL:Lretrofit/RestAdapter$LogLevel;

    invoke-virtual {v1}, Lretrofit/RestAdapter$LogLevel;->ordinal()I

    move-result v1

    if-lt v0, v1, :cond_5

    .line 433
    invoke-virtual {p2}, Lretrofit/client/Request;->getHeaders()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_3

    .line 434
    iget-object v0, p0, Lretrofit/RestAdapter;->log:Lretrofit/RestAdapter$Log;

    const-string v1, ""

    invoke-interface {v0, v1}, Lretrofit/RestAdapter$Log;->log(Ljava/lang/String;)V

    .line 436
    :cond_3
    instance-of v0, v6, Lretrofit/mime/TypedByteArray;

    if-nez v0, :cond_4

    .line 438
    invoke-static {p2}, Lretrofit/Utils;->readBodyToBytesIfNecessary(Lretrofit/client/Request;)Lretrofit/client/Request;

    move-result-object p2

    .line 439
    invoke-virtual {p2}, Lretrofit/client/Request;->getBody()Lretrofit/mime/TypedOutput;

    move-result-object v6

    .line 442
    :cond_4
    move-object v0, v6

    check-cast v0, Lretrofit/mime/TypedByteArray;

    invoke-virtual {v0}, Lretrofit/mime/TypedByteArray;->getBytes()[B

    move-result-object v10

    .line 443
    invoke-interface {v6}, Lretrofit/mime/TypedOutput;->mimeType()Ljava/lang/String;

    move-result-object v0

    const-string v1, "UTF-8"

    invoke-static {v0, v1}, Lretrofit/mime/MimeUtil;->parseCharset(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v11

    .line 444
    iget-object v0, p0, Lretrofit/RestAdapter;->log:Lretrofit/RestAdapter$Log;

    new-instance v1, Ljava/lang/String;

    invoke-direct {v1, v10, v11}, Ljava/lang/String;-><init>([BLjava/lang/String;)V

    invoke-interface {v0, v1}, Lretrofit/RestAdapter$Log;->log(Ljava/lang/String;)V

    .line 445
    goto :goto_2

    :cond_5
    iget-object v0, p0, Lretrofit/RestAdapter;->logLevel:Lretrofit/RestAdapter$LogLevel;

    invoke-virtual {v0}, Lretrofit/RestAdapter$LogLevel;->ordinal()I

    move-result v0

    sget-object v1, Lretrofit/RestAdapter$LogLevel;->HEADERS_AND_ARGS:Lretrofit/RestAdapter$LogLevel;

    invoke-virtual {v1}, Lretrofit/RestAdapter$LogLevel;->ordinal()I

    move-result v1

    if-lt v0, v1, :cond_7

    .line 446
    invoke-virtual {p2}, Lretrofit/client/Request;->getHeaders()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_6

    .line 447
    iget-object v0, p0, Lretrofit/RestAdapter;->log:Lretrofit/RestAdapter$Log;

    const-string v1, "---> REQUEST:"

    invoke-interface {v0, v1}, Lretrofit/RestAdapter$Log;->log(Ljava/lang/String;)V

    .line 449
    :cond_6
    const/4 v10, 0x0

    :goto_1
    array-length v0, p3

    if-ge v10, v0, :cond_7

    .line 450
    iget-object v0, p0, Lretrofit/RestAdapter;->log:Lretrofit/RestAdapter$Log;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "#"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v10}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, ": "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    aget-object v2, p3, v10

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v1}, Lretrofit/RestAdapter$Log;->log(Ljava/lang/String;)V

    .line 449
    add-int/lit8 v10, v10, 0x1

    goto :goto_1

    .line 455
    :cond_7
    :goto_2
    iget-object v0, p0, Lretrofit/RestAdapter;->log:Lretrofit/RestAdapter$Log;

    const-string v1, "---> END %s (%s body)"

    const/4 v2, 0x2

    new-array v2, v2, [Ljava/lang/Object;

    const/4 v3, 0x0

    aput-object p1, v2, v3

    const/4 v3, 0x1

    aput-object v5, v2, v3

    invoke-static {v1, v2}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v1}, Lretrofit/RestAdapter$Log;->log(Ljava/lang/String;)V

    .line 458
    :cond_8
    return-object p2
.end method

.method logException(Ljava/lang/Throwable;Ljava/lang/String;)V
    .locals 6

    .line 510
    iget-object v0, p0, Lretrofit/RestAdapter;->log:Lretrofit/RestAdapter$Log;

    const-string v1, "---- ERROR %s"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    if-eqz p2, :cond_0

    move-object v3, p2

    goto :goto_0

    :cond_0
    const-string v3, ""

    :goto_0
    const/4 v4, 0x0

    aput-object v3, v2, v4

    invoke-static {v1, v2}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v1}, Lretrofit/RestAdapter$Log;->log(Ljava/lang/String;)V

    .line 511
    new-instance v5, Ljava/io/StringWriter;

    invoke-direct {v5}, Ljava/io/StringWriter;-><init>()V

    .line 512
    new-instance v0, Ljava/io/PrintWriter;

    invoke-direct {v0, v5}, Ljava/io/PrintWriter;-><init>(Ljava/io/Writer;)V

    invoke-virtual {p1, v0}, Ljava/lang/Throwable;->printStackTrace(Ljava/io/PrintWriter;)V

    .line 513
    iget-object v0, p0, Lretrofit/RestAdapter;->log:Lretrofit/RestAdapter$Log;

    invoke-virtual {v5}, Ljava/io/StringWriter;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v1}, Lretrofit/RestAdapter$Log;->log(Ljava/lang/String;)V

    .line 514
    iget-object v0, p0, Lretrofit/RestAdapter;->log:Lretrofit/RestAdapter$Log;

    const-string v1, "---- END ERROR"

    invoke-interface {v0, v1}, Lretrofit/RestAdapter$Log;->log(Ljava/lang/String;)V

    .line 515
    return-void
.end method

.method public setLogLevel(Lretrofit/RestAdapter$LogLevel;)V
    .locals 2

    .line 179
    iget-object v0, p0, Lretrofit/RestAdapter;->logLevel:Lretrofit/RestAdapter$LogLevel;

    if-nez v0, :cond_0

    .line 180
    new-instance v0, Ljava/lang/NullPointerException;

    const-string v1, "Log level may not be null."

    invoke-direct {v0, v1}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 182
    :cond_0
    iput-object p1, p0, Lretrofit/RestAdapter;->logLevel:Lretrofit/RestAdapter$LogLevel;

    .line 183
    return-void
.end method
