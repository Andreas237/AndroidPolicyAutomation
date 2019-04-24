.class public Lretrofit/RestAdapter;
.super Ljava/lang/Object;
.source "RestAdapter.java"


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
            "Ljava/util/Map<",
            "Ljava/lang/Class<",
            "*>;",
            "Ljava/util/Map<",
            "Ljava/lang/reflect/Method;",
            "Lretrofit/RestMethodInfo;",
            ">;>;"
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

    return-void
.end method

.method synthetic constructor <init>(Lretrofit/Endpoint;Lretrofit/client/Client$Provider;Ljava/util/concurrent/Executor;Ljava/util/concurrent/Executor;Lretrofit/RequestInterceptor;Lretrofit/converter/Converter;Lretrofit/Profiler;Lretrofit/ErrorHandler;Lretrofit/RestAdapter$Log;Lretrofit/RestAdapter$LogLevel;Lretrofit/RestAdapter$1;)V
    .locals 0

    .line 107
    invoke-direct/range {p0 .. p10}, Lretrofit/RestAdapter;-><init>(Lretrofit/Endpoint;Lretrofit/client/Client$Provider;Ljava/util/concurrent/Executor;Ljava/util/concurrent/Executor;Lretrofit/RequestInterceptor;Lretrofit/converter/Converter;Lretrofit/Profiler;Lretrofit/ErrorHandler;Lretrofit/RestAdapter$Log;Lretrofit/RestAdapter$LogLevel;)V

    return-void
.end method

.method static synthetic access$000(Lretrofit/RestAdapter;)Lretrofit/RxSupport;
    .locals 0

    .line 107
    iget-object p0, p0, Lretrofit/RestAdapter;->rxSupport:Lretrofit/RxSupport;

    return-object p0
.end method

.method static synthetic access$002(Lretrofit/RestAdapter;Lretrofit/RxSupport;)Lretrofit/RxSupport;
    .locals 0

    .line 107
    iput-object p1, p0, Lretrofit/RestAdapter;->rxSupport:Lretrofit/RxSupport;

    return-object p1
.end method

.method static synthetic access$200(Lretrofit/RestAdapter;)Lretrofit/Profiler;
    .locals 0

    .line 107
    iget-object p0, p0, Lretrofit/RestAdapter;->profiler:Lretrofit/Profiler;

    return-object p0
.end method

.method static synthetic access$300(Lretrofit/RestAdapter;)Lretrofit/client/Client$Provider;
    .locals 0

    .line 107
    iget-object p0, p0, Lretrofit/RestAdapter;->clientProvider:Lretrofit/client/Client$Provider;

    return-object p0
.end method

.method static synthetic access$400(Ljava/lang/String;Lretrofit/RestMethodInfo;Lretrofit/client/Request;)Lretrofit/Profiler$RequestInformation;
    .locals 0

    .line 107
    invoke-static {p0, p1, p2}, Lretrofit/RestAdapter;->getRequestInfo(Ljava/lang/String;Lretrofit/RestMethodInfo;Lretrofit/client/Request;)Lretrofit/Profiler$RequestInformation;

    move-result-object p0

    return-object p0
.end method

.method static synthetic access$500(Lretrofit/RestAdapter;Ljava/lang/String;Lretrofit/client/Response;J)Lretrofit/client/Response;
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 107
    invoke-direct {p0, p1, p2, p3, p4}, Lretrofit/RestAdapter;->logAndReplaceResponse(Ljava/lang/String;Lretrofit/client/Response;J)Lretrofit/client/Response;

    move-result-object p0

    return-object p0
.end method

.method static synthetic access$600(Lretrofit/RestAdapter;Lretrofit/mime/TypedInput;Ljava/lang/Object;)V
    .locals 0

    .line 107
    invoke-direct {p0, p1, p2}, Lretrofit/RestAdapter;->logResponseBody(Lretrofit/mime/TypedInput;Ljava/lang/Object;)V

    return-void
.end method

.method static getMethodInfo(Ljava/util/Map;Ljava/lang/reflect/Method;)Lretrofit/RestMethodInfo;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "Ljava/lang/reflect/Method;",
            "Lretrofit/RestMethodInfo;",
            ">;",
            "Ljava/lang/reflect/Method;",
            ")",
            "Lretrofit/RestMethodInfo;"
        }
    .end annotation

    .line 210
    monitor-enter p0

    .line 211
    :try_start_0
    invoke-interface {p0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lretrofit/RestMethodInfo;

    if-nez v0, :cond_0

    .line 213
    new-instance v0, Lretrofit/RestMethodInfo;

    invoke-direct {v0, p1}, Lretrofit/RestMethodInfo;-><init>(Ljava/lang/reflect/Method;)V

    .line 214
    invoke-interface {p0, p1, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 216
    :cond_0
    monitor-exit p0

    return-object v0

    :catchall_0
    move-exception p1

    .line 217
    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1
.end method

.method private static getRequestInfo(Ljava/lang/String;Lretrofit/RestMethodInfo;Lretrofit/client/Request;)Lretrofit/Profiler$RequestInformation;
    .locals 9

    .line 517
    invoke-virtual {p2}, Lretrofit/client/Request;->getBody()Lretrofit/mime/TypedOutput;

    move-result-object p2

    if-eqz p2, :cond_0

    .line 519
    invoke-interface {p2}, Lretrofit/mime/TypedOutput;->length()J

    move-result-wide v0

    .line 520
    invoke-interface {p2}, Lretrofit/mime/TypedOutput;->mimeType()Ljava/lang/String;

    move-result-object p2

    move-object v8, p2

    move-wide v6, v0

    goto :goto_0

    :cond_0
    const-wide/16 v0, 0x0

    const/4 p2, 0x0

    move-object v8, p2

    move-wide v6, v0

    .line 523
    :goto_0
    new-instance p2, Lretrofit/Profiler$RequestInformation;

    iget-object v3, p1, Lretrofit/RestMethodInfo;->requestMethod:Ljava/lang/String;

    iget-object v5, p1, Lretrofit/RestMethodInfo;->requestUrl:Ljava/lang/String;

    move-object v2, p2

    move-object v4, p0

    invoke-direct/range {v2 .. v8}, Lretrofit/Profiler$RequestInformation;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JLjava/lang/String;)V

    return-object p2
.end method

.method private logAndReplaceResponse(Ljava/lang/String;Lretrofit/client/Response;J)Lretrofit/client/Response;
    .locals 5
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 459
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

    move-result-object p1

    const/4 p3, 0x2

    aput-object p1, v2, p3

    invoke-static {v1, v2}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    invoke-interface {v0, p1}, Lretrofit/RestAdapter$Log;->log(Ljava/lang/String;)V

    .line 461
    iget-object p1, p0, Lretrofit/RestAdapter;->logLevel:Lretrofit/RestAdapter$LogLevel;

    invoke-virtual {p1}, Lretrofit/RestAdapter$LogLevel;->ordinal()I

    move-result p1

    sget-object p3, Lretrofit/RestAdapter$LogLevel;->HEADERS:Lretrofit/RestAdapter$LogLevel;

    invoke-virtual {p3}, Lretrofit/RestAdapter$LogLevel;->ordinal()I

    move-result p3

    if-lt p1, p3, :cond_4

    .line 462
    invoke-virtual {p2}, Lretrofit/client/Response;->getHeaders()Ljava/util/List;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result p3

    if-eqz p3, :cond_0

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p3

    check-cast p3, Lretrofit/client/Header;

    .line 463
    iget-object p4, p0, Lretrofit/RestAdapter;->log:Lretrofit/RestAdapter$Log;

    invoke-virtual {p3}, Lretrofit/client/Header;->toString()Ljava/lang/String;

    move-result-object p3

    invoke-interface {p4, p3}, Lretrofit/RestAdapter$Log;->log(Ljava/lang/String;)V

    goto :goto_0

    :cond_0
    const-wide/16 p3, 0x0

    .line 467
    invoke-virtual {p2}, Lretrofit/client/Response;->getBody()Lretrofit/mime/TypedInput;

    move-result-object p1

    if-eqz p1, :cond_3

    .line 469
    invoke-interface {p1}, Lretrofit/mime/TypedInput;->length()J

    move-result-wide p3

    .line 471
    iget-object v0, p0, Lretrofit/RestAdapter;->logLevel:Lretrofit/RestAdapter$LogLevel;

    invoke-virtual {v0}, Lretrofit/RestAdapter$LogLevel;->ordinal()I

    move-result v0

    sget-object v1, Lretrofit/RestAdapter$LogLevel;->FULL:Lretrofit/RestAdapter$LogLevel;

    invoke-virtual {v1}, Lretrofit/RestAdapter$LogLevel;->ordinal()I

    move-result v1

    if-lt v0, v1, :cond_3

    .line 472
    invoke-virtual {p2}, Lretrofit/client/Response;->getHeaders()Ljava/util/List;

    move-result-object p3

    invoke-interface {p3}, Ljava/util/List;->isEmpty()Z

    move-result p3

    if-nez p3, :cond_1

    .line 473
    iget-object p3, p0, Lretrofit/RestAdapter;->log:Lretrofit/RestAdapter$Log;

    const-string p4, ""

    invoke-interface {p3, p4}, Lretrofit/RestAdapter$Log;->log(Ljava/lang/String;)V

    .line 476
    :cond_1
    instance-of p3, p1, Lretrofit/mime/TypedByteArray;

    if-nez p3, :cond_2

    .line 478
    invoke-static {p2}, Lretrofit/Utils;->readBodyToBytesIfNecessary(Lretrofit/client/Response;)Lretrofit/client/Response;

    move-result-object p2

    .line 479
    invoke-virtual {p2}, Lretrofit/client/Response;->getBody()Lretrofit/mime/TypedInput;

    move-result-object p1

    .line 482
    :cond_2
    move-object p3, p1

    check-cast p3, Lretrofit/mime/TypedByteArray;

    invoke-virtual {p3}, Lretrofit/mime/TypedByteArray;->getBytes()[B

    move-result-object p3

    .line 483
    array-length p4, p3

    int-to-long v0, p4

    .line 484
    invoke-interface {p1}, Lretrofit/mime/TypedInput;->mimeType()Ljava/lang/String;

    move-result-object p1

    .line 485
    invoke-static {p1}, Lretrofit/mime/MimeUtil;->parseCharset(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    .line 486
    iget-object p4, p0, Lretrofit/RestAdapter;->log:Lretrofit/RestAdapter$Log;

    new-instance v2, Ljava/lang/String;

    invoke-direct {v2, p3, p1}, Ljava/lang/String;-><init>([BLjava/lang/String;)V

    invoke-interface {p4, v2}, Lretrofit/RestAdapter$Log;->log(Ljava/lang/String;)V

    move-wide p3, v0

    .line 490
    :cond_3
    iget-object p1, p0, Lretrofit/RestAdapter;->log:Lretrofit/RestAdapter$Log;

    const-string v0, "<--- END HTTP (%s-byte body)"

    new-array v1, v3, [Ljava/lang/Object;

    invoke-static {p3, p4}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p3

    aput-object p3, v1, v4

    invoke-static {v0, v1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p3

    invoke-interface {p1, p3}, Lretrofit/RestAdapter$Log;->log(Ljava/lang/String;)V

    :cond_4
    return-object p2
.end method

.method private logResponseBody(Lretrofit/mime/TypedInput;Ljava/lang/Object;)V
    .locals 1

    .line 497
    iget-object p1, p0, Lretrofit/RestAdapter;->logLevel:Lretrofit/RestAdapter$LogLevel;

    invoke-virtual {p1}, Lretrofit/RestAdapter$LogLevel;->ordinal()I

    move-result p1

    sget-object v0, Lretrofit/RestAdapter$LogLevel;->HEADERS_AND_ARGS:Lretrofit/RestAdapter$LogLevel;

    invoke-virtual {v0}, Lretrofit/RestAdapter$LogLevel;->ordinal()I

    move-result v0

    if-ne p1, v0, :cond_0

    .line 498
    iget-object p1, p0, Lretrofit/RestAdapter;->log:Lretrofit/RestAdapter$Log;

    const-string v0, "<--- BODY:"

    invoke-interface {p1, v0}, Lretrofit/RestAdapter$Log;->log(Ljava/lang/String;)V

    .line 499
    iget-object p1, p0, Lretrofit/RestAdapter;->log:Lretrofit/RestAdapter$Log;

    invoke-virtual {p2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-interface {p1, p2}, Lretrofit/RestAdapter$Log;->log(Ljava/lang/String;)V

    :cond_0
    return-void
.end method


# virtual methods
.method public create(Ljava/lang/Class;)Ljava/lang/Object;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/lang/Class<",
            "TT;>;)TT;"
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

    move-result-object p1

    invoke-direct {v2, p0, p1}, Lretrofit/RestAdapter$RestHandler;-><init>(Lretrofit/RestAdapter;Ljava/util/Map;)V

    .line 194
    invoke-static {v0, v1, v2}, Ljava/lang/reflect/Proxy;->newProxyInstance(Ljava/lang/ClassLoader;[Ljava/lang/Class;Ljava/lang/reflect/InvocationHandler;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public getLogLevel()Lretrofit/RestAdapter$LogLevel;
    .locals 1

    .line 187
    iget-object v0, p0, Lretrofit/RestAdapter;->logLevel:Lretrofit/RestAdapter$LogLevel;

    return-object v0
.end method

.method getMethodInfoCache(Ljava/lang/Class;)Ljava/util/Map;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Class<",
            "*>;)",
            "Ljava/util/Map<",
            "Ljava/lang/reflect/Method;",
            "Lretrofit/RestMethodInfo;",
            ">;"
        }
    .end annotation

    .line 199
    iget-object v0, p0, Lretrofit/RestAdapter;->serviceMethodInfoCache:Ljava/util/Map;

    monitor-enter v0

    .line 200
    :try_start_0
    iget-object v1, p0, Lretrofit/RestAdapter;->serviceMethodInfoCache:Ljava/util/Map;

    invoke-interface {v1, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/Map;

    if-nez v1, :cond_0

    .line 202
    new-instance v1, Ljava/util/LinkedHashMap;

    invoke-direct {v1}, Ljava/util/LinkedHashMap;-><init>()V

    .line 203
    iget-object v2, p0, Lretrofit/RestAdapter;->serviceMethodInfoCache:Ljava/util/Map;

    invoke-interface {v2, p1, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 205
    :cond_0
    monitor-exit v0

    return-object v1

    :catchall_0
    move-exception p1

    .line 206
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1
.end method

.method logAndReplaceRequest(Ljava/lang/String;Lretrofit/client/Request;[Ljava/lang/Object;)Lretrofit/client/Request;
    .locals 11
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 406
    iget-object v0, p0, Lretrofit/RestAdapter;->log:Lretrofit/RestAdapter$Log;

    const-string v1, "---> %s %s %s"

    const/4 v2, 0x3

    new-array v2, v2, [Ljava/lang/Object;

    const/4 v3, 0x0

    aput-object p1, v2, v3

    invoke-virtual {p2}, Lretrofit/client/Request;->getMethod()Ljava/lang/String;

    move-result-object v4

    const/4 v5, 0x1

    aput-object v4, v2, v5

    invoke-virtual {p2}, Lretrofit/client/Request;->getUrl()Ljava/lang/String;

    move-result-object v4

    const/4 v6, 0x2

    aput-object v4, v2, v6

    invoke-static {v1, v2}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v1}, Lretrofit/RestAdapter$Log;->log(Ljava/lang/String;)V

    .line 408
    iget-object v0, p0, Lretrofit/RestAdapter;->logLevel:Lretrofit/RestAdapter$LogLevel;

    invoke-virtual {v0}, Lretrofit/RestAdapter$LogLevel;->ordinal()I

    move-result v0

    sget-object v1, Lretrofit/RestAdapter$LogLevel;->HEADERS:Lretrofit/RestAdapter$LogLevel;

    invoke-virtual {v1}, Lretrofit/RestAdapter$LogLevel;->ordinal()I

    move-result v1

    if-lt v0, v1, :cond_8

    .line 409
    invoke-virtual {p2}, Lretrofit/client/Request;->getHeaders()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lretrofit/client/Header;

    .line 410
    iget-object v2, p0, Lretrofit/RestAdapter;->log:Lretrofit/RestAdapter$Log;

    invoke-virtual {v1}, Lretrofit/client/Header;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v2, v1}, Lretrofit/RestAdapter$Log;->log(Ljava/lang/String;)V

    goto :goto_0

    :cond_0
    const-string v0, "no"

    .line 414
    invoke-virtual {p2}, Lretrofit/client/Request;->getBody()Lretrofit/mime/TypedOutput;

    move-result-object v1

    if-eqz v1, :cond_7

    .line 416
    invoke-interface {v1}, Lretrofit/mime/TypedOutput;->mimeType()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_1

    .line 418
    iget-object v2, p0, Lretrofit/RestAdapter;->log:Lretrofit/RestAdapter$Log;

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    const-string v7, "Content-Type: "

    invoke-virtual {v4, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-interface {v2, v0}, Lretrofit/RestAdapter$Log;->log(Ljava/lang/String;)V

    .line 421
    :cond_1
    invoke-interface {v1}, Lretrofit/mime/TypedOutput;->length()J

    move-result-wide v7

    .line 422
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, v7, v8}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v2, "-byte"

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-wide/16 v9, -0x1

    cmp-long v2, v7, v9

    if-eqz v2, :cond_2

    .line 424
    iget-object v2, p0, Lretrofit/RestAdapter;->log:Lretrofit/RestAdapter$Log;

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    const-string v9, "Content-Length: "

    invoke-virtual {v4, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v7, v8}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-interface {v2, v4}, Lretrofit/RestAdapter$Log;->log(Ljava/lang/String;)V

    .line 427
    :cond_2
    iget-object v2, p0, Lretrofit/RestAdapter;->logLevel:Lretrofit/RestAdapter$LogLevel;

    invoke-virtual {v2}, Lretrofit/RestAdapter$LogLevel;->ordinal()I

    move-result v2

    sget-object v4, Lretrofit/RestAdapter$LogLevel;->FULL:Lretrofit/RestAdapter$LogLevel;

    invoke-virtual {v4}, Lretrofit/RestAdapter$LogLevel;->ordinal()I

    move-result v4

    if-lt v2, v4, :cond_5

    .line 428
    invoke-virtual {p2}, Lretrofit/client/Request;->getHeaders()Ljava/util/List;

    move-result-object p3

    invoke-interface {p3}, Ljava/util/List;->isEmpty()Z

    move-result p3

    if-nez p3, :cond_3

    .line 429
    iget-object p3, p0, Lretrofit/RestAdapter;->log:Lretrofit/RestAdapter$Log;

    const-string v2, ""

    invoke-interface {p3, v2}, Lretrofit/RestAdapter$Log;->log(Ljava/lang/String;)V

    .line 431
    :cond_3
    instance-of p3, v1, Lretrofit/mime/TypedByteArray;

    if-nez p3, :cond_4

    .line 433
    invoke-static {p2}, Lretrofit/Utils;->readBodyToBytesIfNecessary(Lretrofit/client/Request;)Lretrofit/client/Request;

    move-result-object p2

    .line 434
    invoke-virtual {p2}, Lretrofit/client/Request;->getBody()Lretrofit/mime/TypedOutput;

    move-result-object v1

    .line 437
    :cond_4
    move-object p3, v1

    check-cast p3, Lretrofit/mime/TypedByteArray;

    invoke-virtual {p3}, Lretrofit/mime/TypedByteArray;->getBytes()[B

    move-result-object p3

    .line 438
    invoke-interface {v1}, Lretrofit/mime/TypedOutput;->mimeType()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lretrofit/mime/MimeUtil;->parseCharset(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    .line 439
    iget-object v2, p0, Lretrofit/RestAdapter;->log:Lretrofit/RestAdapter$Log;

    new-instance v4, Ljava/lang/String;

    invoke-direct {v4, p3, v1}, Ljava/lang/String;-><init>([BLjava/lang/String;)V

    invoke-interface {v2, v4}, Lretrofit/RestAdapter$Log;->log(Ljava/lang/String;)V

    goto :goto_2

    .line 440
    :cond_5
    iget-object v1, p0, Lretrofit/RestAdapter;->logLevel:Lretrofit/RestAdapter$LogLevel;

    invoke-virtual {v1}, Lretrofit/RestAdapter$LogLevel;->ordinal()I

    move-result v1

    sget-object v2, Lretrofit/RestAdapter$LogLevel;->HEADERS_AND_ARGS:Lretrofit/RestAdapter$LogLevel;

    invoke-virtual {v2}, Lretrofit/RestAdapter$LogLevel;->ordinal()I

    move-result v2

    if-lt v1, v2, :cond_7

    .line 441
    invoke-virtual {p2}, Lretrofit/client/Request;->getHeaders()Ljava/util/List;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/List;->isEmpty()Z

    move-result v1

    if-nez v1, :cond_6

    .line 442
    iget-object v1, p0, Lretrofit/RestAdapter;->log:Lretrofit/RestAdapter$Log;

    const-string v2, "---> REQUEST:"

    invoke-interface {v1, v2}, Lretrofit/RestAdapter$Log;->log(Ljava/lang/String;)V

    :cond_6
    const/4 v1, 0x0

    .line 444
    :goto_1
    array-length v2, p3

    if-ge v1, v2, :cond_7

    .line 445
    iget-object v2, p0, Lretrofit/RestAdapter;->log:Lretrofit/RestAdapter$Log;

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    const-string v7, "#"

    invoke-virtual {v4, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v7, ": "

    invoke-virtual {v4, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    aget-object v7, p3, v1

    invoke-virtual {v4, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-interface {v2, v4}, Lretrofit/RestAdapter$Log;->log(Ljava/lang/String;)V

    add-int/lit8 v1, v1, 0x1

    goto :goto_1

    .line 450
    :cond_7
    :goto_2
    iget-object p3, p0, Lretrofit/RestAdapter;->log:Lretrofit/RestAdapter$Log;

    const-string v1, "---> END %s (%s body)"

    new-array v2, v6, [Ljava/lang/Object;

    aput-object p1, v2, v3

    aput-object v0, v2, v5

    invoke-static {v1, v2}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    invoke-interface {p3, p1}, Lretrofit/RestAdapter$Log;->log(Ljava/lang/String;)V

    :cond_8
    return-object p2
.end method

.method logException(Ljava/lang/Throwable;Ljava/lang/String;)V
    .locals 4

    .line 505
    iget-object v0, p0, Lretrofit/RestAdapter;->log:Lretrofit/RestAdapter$Log;

    const-string v1, "---- ERROR %s"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    if-eqz p2, :cond_0

    goto :goto_0

    :cond_0
    const-string p2, ""

    :goto_0
    const/4 v3, 0x0

    aput-object p2, v2, v3

    invoke-static {v1, v2}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p2

    invoke-interface {v0, p2}, Lretrofit/RestAdapter$Log;->log(Ljava/lang/String;)V

    .line 506
    new-instance p2, Ljava/io/StringWriter;

    invoke-direct {p2}, Ljava/io/StringWriter;-><init>()V

    .line 507
    new-instance v0, Ljava/io/PrintWriter;

    invoke-direct {v0, p2}, Ljava/io/PrintWriter;-><init>(Ljava/io/Writer;)V

    invoke-virtual {p1, v0}, Ljava/lang/Throwable;->printStackTrace(Ljava/io/PrintWriter;)V

    .line 508
    iget-object p1, p0, Lretrofit/RestAdapter;->log:Lretrofit/RestAdapter$Log;

    invoke-virtual {p2}, Ljava/io/StringWriter;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-interface {p1, p2}, Lretrofit/RestAdapter$Log;->log(Ljava/lang/String;)V

    .line 509
    iget-object p1, p0, Lretrofit/RestAdapter;->log:Lretrofit/RestAdapter$Log;

    const-string p2, "---- END ERROR"

    invoke-interface {p1, p2}, Lretrofit/RestAdapter$Log;->log(Ljava/lang/String;)V

    return-void
.end method

.method public setLogLevel(Lretrofit/RestAdapter$LogLevel;)V
    .locals 1

    .line 179
    iget-object v0, p0, Lretrofit/RestAdapter;->logLevel:Lretrofit/RestAdapter$LogLevel;

    if-eqz v0, :cond_0

    .line 182
    iput-object p1, p0, Lretrofit/RestAdapter;->logLevel:Lretrofit/RestAdapter$LogLevel;

    return-void

    .line 180
    :cond_0
    new-instance p1, Ljava/lang/NullPointerException;

    const-string v0, "Log level may not be null."

    invoke-direct {p1, v0}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p1
.end method
