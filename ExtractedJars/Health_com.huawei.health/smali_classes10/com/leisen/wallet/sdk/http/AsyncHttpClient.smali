.class public Lcom/leisen/wallet/sdk/http/AsyncHttpClient;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static final CODE_DEFAULT_MAX_CONNECTIONS:I = 0xa

.field private static final CODE_DEFAULT_SOCKET_TIMEOUT:I = 0x7530

.field public static final DEFAULT_MAX_RETRIES:I = 0x5

.field public static final DEFAULT_RETRY_SLEEP_TIME_MILLIS:I = 0x5dc

.field public static final DEFAULT_SOCKET_BUFFER_SIZE:I = 0x2000

.field private static final TAG:Ljava/lang/String; = "AsyncHttpClient"


# instance fields
.field private final clientHeaderMap:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<Ljava/lang/String;Ljava/lang/String;>;"
        }
    .end annotation
.end field

.field private final httpClient:Lorg/apache/http/impl/client/DefaultHttpClient;

.field private final httpContext:Lorg/apache/http/protocol/HttpContext;

.field private isEncodeUrl:Z

.field private maxConnections:I

.field private final requestMap:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<Landroid/content/Context;Ljava/util/List<Lcom/leisen/wallet/sdk/http/RequestHandle;>;>;"
        }
    .end annotation
.end field

.field private threadPool:Ljava/util/concurrent/ExecutorService;

.field private timeout:I

.field private useSynchronousMode:Z


# direct methods
.method public constructor <init>(I)V
    .locals 2

    .line 68
    const/4 v0, 0x0

    const/16 v1, 0x1bb

    invoke-direct {p0, v0, p1, v1}, Lcom/leisen/wallet/sdk/http/AsyncHttpClient;-><init>(ZII)V

    .line 69
    return-void
.end method

.method public constructor <init>(II)V
    .locals 1

    .line 72
    const/4 v0, 0x0

    invoke-direct {p0, v0, p1, p2}, Lcom/leisen/wallet/sdk/http/AsyncHttpClient;-><init>(ZII)V

    .line 73
    return-void
.end method

.method public constructor <init>(Lorg/apache/http/conn/scheme/SchemeRegistry;)V
    .locals 6

    .line 79
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 51
    const/16 v0, 0x7530

    iput v0, p0, Lcom/leisen/wallet/sdk/http/AsyncHttpClient;->timeout:I

    .line 54
    const/16 v0, 0xa

    iput v0, p0, Lcom/leisen/wallet/sdk/http/AsyncHttpClient;->maxConnections:I

    .line 59
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/leisen/wallet/sdk/http/AsyncHttpClient;->isEncodeUrl:Z

    .line 60
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/leisen/wallet/sdk/http/AsyncHttpClient;->useSynchronousMode:Z

    .line 80
    const-string v0, "AsyncHttpClient"

    const-string v1, "enter AsyncHttpClient"

    invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 81
    new-instance v4, Lorg/apache/http/params/BasicHttpParams;

    invoke-direct {v4}, Lorg/apache/http/params/BasicHttpParams;-><init>()V

    .line 82
    const-string v0, "AsyncHttpClient"

    const-string v1, "enter AsyncHttpClient"

    invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 85
    const-string v0, "AsyncHttpClient"

    const-string v1, "enter AsyncHttpClient"

    invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 87
    iget v0, p0, Lcom/leisen/wallet/sdk/http/AsyncHttpClient;->timeout:I

    int-to-long v0, v0

    invoke-static {v4, v0, v1}, Lorg/apache/http/conn/params/ConnManagerParams;->setTimeout(Lorg/apache/http/params/HttpParams;J)V

    .line 88
    const-string v0, "AsyncHttpClient"

    const-string v1, "enter AsyncHttpClient"

    invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 91
    const-string v0, "AsyncHttpClient"

    const-string v1, "enter AsyncHttpClient"

    invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 92
    new-instance v0, Lorg/apache/http/conn/params/ConnPerRouteBean;

    iget v1, p0, Lcom/leisen/wallet/sdk/http/AsyncHttpClient;->maxConnections:I

    invoke-direct {v0, v1}, Lorg/apache/http/conn/params/ConnPerRouteBean;-><init>(I)V

    invoke-static {v4, v0}, Lorg/apache/http/conn/params/ConnManagerParams;->setMaxConnectionsPerRoute(Lorg/apache/http/params/HttpParams;Lorg/apache/http/conn/params/ConnPerRoute;)V

    .line 94
    const-string v0, "AsyncHttpClient"

    const-string v1, "enter AsyncHttpClient"

    invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 96
    const/16 v0, 0xa

    invoke-static {v4, v0}, Lorg/apache/http/conn/params/ConnManagerParams;->setMaxTotalConnections(Lorg/apache/http/params/HttpParams;I)V

    .line 97
    const-string v0, "AsyncHttpClient"

    const-string v1, "enter AsyncHttpClient"

    invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 99
    const-string v0, "AsyncHttpClient"

    const-string v1, "enter AsyncHttpClient"

    invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 100
    iget v0, p0, Lcom/leisen/wallet/sdk/http/AsyncHttpClient;->timeout:I

    invoke-static {v4, v0}, Lorg/apache/http/params/HttpConnectionParams;->setSoTimeout(Lorg/apache/http/params/HttpParams;I)V

    .line 101
    iget v0, p0, Lcom/leisen/wallet/sdk/http/AsyncHttpClient;->timeout:I

    invoke-static {v4, v0}, Lorg/apache/http/params/HttpConnectionParams;->setConnectionTimeout(Lorg/apache/http/params/HttpParams;I)V

    .line 102
    const/4 v0, 0x1

    invoke-static {v4, v0}, Lorg/apache/http/params/HttpConnectionParams;->setTcpNoDelay(Lorg/apache/http/params/HttpParams;Z)V

    .line 103
    const/16 v0, 0x2000

    invoke-static {v4, v0}, Lorg/apache/http/params/HttpConnectionParams;->setSocketBufferSize(Lorg/apache/http/params/HttpParams;I)V

    .line 104
    const-string v0, "AsyncHttpClient"

    const-string v1, "enter AsyncHttpClient"

    invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 106
    sget-object v0, Lorg/apache/http/HttpVersion;->HTTP_1_1:Lorg/apache/http/HttpVersion;

    invoke-static {v4, v0}, Lorg/apache/http/params/HttpProtocolParams;->setVersion(Lorg/apache/http/params/HttpParams;Lorg/apache/http/ProtocolVersion;)V

    .line 107
    const-string v0, "AsyncHttpClient"

    const-string v1, "enter AsyncHttpClient"

    invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 109
    invoke-direct {p0, p1, v4}, Lcom/leisen/wallet/sdk/http/AsyncHttpClient;->getConnectionManager(Lorg/apache/http/conn/scheme/SchemeRegistry;Lorg/apache/http/params/BasicHttpParams;)Lorg/apache/http/conn/ClientConnectionManager;

    move-result-object v5

    .line 110
    const-string v0, "AsyncHttpClient"

    const-string v1, "enter AsyncHttpClient"

    invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 112
    invoke-direct {p0}, Lcom/leisen/wallet/sdk/http/AsyncHttpClient;->getDefaultThreadPool()Ljava/util/concurrent/ExecutorService;

    move-result-object v0

    iput-object v0, p0, Lcom/leisen/wallet/sdk/http/AsyncHttpClient;->threadPool:Ljava/util/concurrent/ExecutorService;

    .line 113
    new-instance v0, Ljava/util/WeakHashMap;

    invoke-direct {v0}, Ljava/util/WeakHashMap;-><init>()V

    iput-object v0, p0, Lcom/leisen/wallet/sdk/http/AsyncHttpClient;->requestMap:Ljava/util/Map;

    .line 114
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lcom/leisen/wallet/sdk/http/AsyncHttpClient;->clientHeaderMap:Ljava/util/Map;

    .line 115
    const-string v0, "AsyncHttpClient"

    const-string v1, "enter AsyncHttpClient"

    invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 116
    new-instance v0, Lorg/apache/http/protocol/SyncBasicHttpContext;

    new-instance v1, Lorg/apache/http/protocol/BasicHttpContext;

    invoke-direct {v1}, Lorg/apache/http/protocol/BasicHttpContext;-><init>()V

    invoke-direct {v0, v1}, Lorg/apache/http/protocol/SyncBasicHttpContext;-><init>(Lorg/apache/http/protocol/HttpContext;)V

    iput-object v0, p0, Lcom/leisen/wallet/sdk/http/AsyncHttpClient;->httpContext:Lorg/apache/http/protocol/HttpContext;

    .line 117
    new-instance v0, Lorg/apache/http/impl/client/DefaultHttpClient;

    invoke-direct {v0, v5, v4}, Lorg/apache/http/impl/client/DefaultHttpClient;-><init>(Lorg/apache/http/conn/ClientConnectionManager;Lorg/apache/http/params/HttpParams;)V

    iput-object v0, p0, Lcom/leisen/wallet/sdk/http/AsyncHttpClient;->httpClient:Lorg/apache/http/impl/client/DefaultHttpClient;

    .line 118
    const-string v0, "AsyncHttpClient"

    const-string v1, "enter AsyncHttpClient"

    invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 120
    iget-object v0, p0, Lcom/leisen/wallet/sdk/http/AsyncHttpClient;->httpClient:Lorg/apache/http/impl/client/DefaultHttpClient;

    new-instance v1, Lcom/leisen/wallet/sdk/http/RetryHandler;

    const/4 v2, 0x5

    const/16 v3, 0x5dc

    invoke-direct {v1, v2, v3}, Lcom/leisen/wallet/sdk/http/RetryHandler;-><init>(II)V

    invoke-virtual {v0, v1}, Lorg/apache/http/impl/client/DefaultHttpClient;->setHttpRequestRetryHandler(Lorg/apache/http/client/HttpRequestRetryHandler;)V

    .line 121
    const-string v0, "AsyncHttpClient"

    const-string v1, "exit AsyncHttpClient"

    invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 122
    return-void
.end method

.method public constructor <init>(Z)V
    .locals 3

    .line 63
    const/4 v0, 0x0

    const/16 v1, 0x50

    const/16 v2, 0x1bb

    invoke-direct {p0, v0, v1, v2}, Lcom/leisen/wallet/sdk/http/AsyncHttpClient;-><init>(ZII)V

    .line 64
    iput-boolean p1, p0, Lcom/leisen/wallet/sdk/http/AsyncHttpClient;->useSynchronousMode:Z

    .line 65
    return-void
.end method

.method public constructor <init>(ZII)V
    .locals 1

    .line 76
    invoke-static {p1, p2, p3}, Lcom/leisen/wallet/sdk/http/AsyncHttpClient;->getDefaultSchemeRegistry(ZII)Lorg/apache/http/conn/scheme/SchemeRegistry;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/leisen/wallet/sdk/http/AsyncHttpClient;-><init>(Lorg/apache/http/conn/scheme/SchemeRegistry;)V

    .line 77
    return-void
.end method

.method static synthetic access$000(Lcom/leisen/wallet/sdk/http/AsyncHttpClient;)Ljava/util/Map;
    .locals 1

    .line 45
    iget-object v0, p0, Lcom/leisen/wallet/sdk/http/AsyncHttpClient;->requestMap:Ljava/util/Map;

    return-object v0
.end method

.method private addEntityToRequestBase(Lorg/apache/http/client/methods/HttpEntityEnclosingRequestBase;Lorg/apache/http/HttpEntity;)Lorg/apache/http/client/methods/HttpEntityEnclosingRequestBase;
    .locals 0

    .line 195
    if-eqz p2, :cond_0

    .line 196
    invoke-virtual {p1, p2}, Lorg/apache/http/client/methods/HttpEntityEnclosingRequestBase;->setEntity(Lorg/apache/http/HttpEntity;)V

    .line 198
    :cond_0
    return-object p1
.end method

.method private getConnectionManager(Lorg/apache/http/conn/scheme/SchemeRegistry;Lorg/apache/http/params/BasicHttpParams;)Lorg/apache/http/conn/ClientConnectionManager;
    .locals 1

    .line 149
    invoke-virtual {p0, p1, p2}, Lcom/leisen/wallet/sdk/http/AsyncHttpClient;->createConnectionManager(Lorg/apache/http/conn/scheme/SchemeRegistry;Lorg/apache/http/params/BasicHttpParams;)Lorg/apache/http/conn/ClientConnectionManager;

    move-result-object v0

    return-object v0
.end method

.method private static getDefaultSchemeRegistry(ZII)Lorg/apache/http/conn/scheme/SchemeRegistry;
    .locals 5

    .line 127
    const-string v0, "AsyncHttpClient"

    const-string v1, "enter getDefaultSchemeRegistry"

    invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 128
    const/4 v0, 0x1

    if-ge p1, v0, :cond_0

    .line 129
    const/16 p1, 0x50

    .line 132
    :cond_0
    const/4 v0, 0x1

    if-le v0, p2, :cond_1

    .line 133
    const/16 p2, 0x1bb

    .line 136
    :cond_1
    const-string v0, "AsyncHttpClient"

    const-string v1, "milde"

    invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 137
    invoke-static {}, Lorg/apache/http/conn/ssl/SSLSocketFactory;->getSocketFactory()Lorg/apache/http/conn/ssl/SSLSocketFactory;

    move-result-object v3

    .line 138
    const-string v0, "AsyncHttpClient"

    const-string v1, "enter milder getDefaultSchemeRegistry"

    invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 139
    new-instance v4, Lorg/apache/http/conn/scheme/SchemeRegistry;

    invoke-direct {v4}, Lorg/apache/http/conn/scheme/SchemeRegistry;-><init>()V

    .line 140
    new-instance v0, Lorg/apache/http/conn/scheme/Scheme;

    const-string v1, "http"

    invoke-static {}, Lorg/apache/http/conn/scheme/PlainSocketFactory;->getSocketFactory()Lorg/apache/http/conn/scheme/PlainSocketFactory;

    move-result-object v2

    invoke-direct {v0, v1, v2, p1}, Lorg/apache/http/conn/scheme/Scheme;-><init>(Ljava/lang/String;Lorg/apache/http/conn/scheme/SocketFactory;I)V

    invoke-virtual {v4, v0}, Lorg/apache/http/conn/scheme/SchemeRegistry;->register(Lorg/apache/http/conn/scheme/Scheme;)Lorg/apache/http/conn/scheme/Scheme;

    .line 141
    new-instance v0, Lorg/apache/http/conn/scheme/Scheme;

    const-string v1, "https"

    invoke-direct {v0, v1, v3, p2}, Lorg/apache/http/conn/scheme/Scheme;-><init>(Ljava/lang/String;Lorg/apache/http/conn/scheme/SocketFactory;I)V

    invoke-virtual {v4, v0}, Lorg/apache/http/conn/scheme/SchemeRegistry;->register(Lorg/apache/http/conn/scheme/Scheme;)Lorg/apache/http/conn/scheme/Scheme;

    .line 142
    const-string v0, "AsyncHttpClient"

    const-string v1, "exit getDefaultSchemeRegistry"

    invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 143
    return-object v4
.end method

.method private getDefaultThreadPool()Ljava/util/concurrent/ExecutorService;
    .locals 1

    .line 158
    invoke-static {}, Ljava/util/concurrent/Executors;->newCachedThreadPool()Ljava/util/concurrent/ExecutorService;

    move-result-object v0

    return-object v0
.end method

.method private getUrlWithQueryString(ZLjava/lang/String;Lcom/leisen/wallet/sdk/http/RequestParams;)Ljava/lang/String;
    .locals 3

    .line 293
    if-eqz p1, :cond_0

    .line 294
    const-string v0, " "

    const-string v1, "%20"

    invoke-virtual {p2, v0, v1}, Ljava/lang/String;->replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;

    move-result-object p2

    .line 296
    :cond_0
    if-eqz p3, :cond_2

    .line 297
    invoke-virtual {p3}, Lcom/leisen/wallet/sdk/http/RequestParams;->getParamString()Ljava/lang/String;

    move-result-object v2

    .line 299
    if-eqz v2, :cond_2

    const-string v0, "?"

    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_2

    .line 300
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "?"

    invoke-virtual {p2, v1}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v1

    if-eqz v1, :cond_1

    const-string v1, "&"

    goto :goto_0

    :cond_1
    const-string v1, "?"

    :goto_0
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    .line 301
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    .line 304
    :cond_2
    return-object p2
.end method

.method private newAysncHttpRequest(Lorg/apache/http/impl/client/DefaultHttpClient;Lorg/apache/http/protocol/HttpContext;Lorg/apache/http/client/methods/HttpUriRequest;Lcom/leisen/wallet/sdk/http/ResponseHandlerInterface;)Lcom/leisen/wallet/sdk/http/AsyncHttpRequest;
    .locals 1

    .line 281
    new-instance v0, Lcom/leisen/wallet/sdk/http/AsyncHttpRequest;

    invoke-direct {v0, p1, p2, p3, p4}, Lcom/leisen/wallet/sdk/http/AsyncHttpRequest;-><init>(Lorg/apache/http/impl/client/AbstractHttpClient;Lorg/apache/http/protocol/HttpContext;Lorg/apache/http/client/methods/HttpUriRequest;Lcom/leisen/wallet/sdk/http/ResponseHandlerInterface;)V

    return-object v0
.end method

.method private paramsToEntity(Lcom/leisen/wallet/sdk/http/RequestParams;Lcom/leisen/wallet/sdk/http/ResponseHandlerInterface;)Lorg/apache/http/HttpEntity;
    .locals 6

    .line 207
    const/4 v4, 0x0

    .line 209
    if-eqz p1, :cond_0

    .line 210
    :try_start_0
    invoke-virtual {p1, p2}, Lcom/leisen/wallet/sdk/http/RequestParams;->getEntity(Lcom/leisen/wallet/sdk/http/ResponseHandlerInterface;)Lorg/apache/http/HttpEntity;
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v0

    move-object v4, v0

    .line 219
    :cond_0
    goto :goto_0

    .line 212
    :catch_0
    move-exception v5

    .line 213
    if-eqz p2, :cond_1

    .line 214
    const-string v0, "AsyncHttpClient"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "responseHandler != null ==>"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 215
    const/4 v0, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x0

    invoke-interface {p2, v0, v1, v2, v5}, Lcom/leisen/wallet/sdk/http/ResponseHandlerInterface;->sendFailureMessage(I[Lorg/apache/http/Header;[BLjava/lang/Throwable;)V

    goto :goto_0

    .line 217
    :cond_1
    const-string v0, "AsyncHttpClient"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "==>"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v5}, Ljava/io/IOException;->getMessage()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 220
    :goto_0
    return-object v4
.end method

.method public static silentCloseInputStream(Ljava/io/InputStream;)V
    .locals 3

    .line 342
    if-eqz p0, :cond_0

    .line 343
    :try_start_0
    invoke-virtual {p0}, Ljava/io/InputStream;->close()V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 347
    :cond_0
    goto :goto_0

    .line 345
    :catch_0
    move-exception v2

    .line 346
    const-string v0, "AsyncHttpClient"

    const-string v1, "Cannot close input stream"

    invoke-static {v0, v1, v2}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 348
    :goto_0
    return-void
.end method

.method public static silentCloseOutputStream(Ljava/io/OutputStream;)V
    .locals 3

    .line 401
    if-eqz p0, :cond_0

    .line 402
    :try_start_0
    invoke-virtual {p0}, Ljava/io/OutputStream;->close()V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 406
    :cond_0
    goto :goto_0

    .line 404
    :catch_0
    move-exception v2

    .line 405
    const-string v0, "AsyncHttpClient"

    const-string v1, "Cannot close output stream"

    invoke-static {v0, v1, v2}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 407
    :goto_0
    return-void
.end method


# virtual methods
.method public cancelAllRequests(Z)V
    .locals 5

    .line 423
    iget-object v0, p0, Lcom/leisen/wallet/sdk/http/AsyncHttpClient;->requestMap:Ljava/util/Map;

    invoke-interface {v0}, Ljava/util/Map;->values()Ljava/util/Collection;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v2, v0

    check-cast v2, Ljava/util/List;

    .line 424
    if-eqz v2, :cond_0

    .line 425
    invoke-interface {v2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :goto_1
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Lcom/leisen/wallet/sdk/http/RequestHandle;

    .line 426
    invoke-virtual {v4, p1}, Lcom/leisen/wallet/sdk/http/RequestHandle;->cancel(Z)Z

    .line 427
    goto :goto_1

    .line 429
    :cond_0
    goto :goto_0

    .line 430
    :cond_1
    iget-object v0, p0, Lcom/leisen/wallet/sdk/http/AsyncHttpClient;->requestMap:Ljava/util/Map;

    invoke-interface {v0}, Ljava/util/Map;->clear()V

    .line 431
    return-void
.end method

.method public cancelRequests(Landroid/content/Context;Z)V
    .locals 3

    .line 313
    if-nez p1, :cond_0

    .line 314
    return-void

    .line 316
    :cond_0
    new-instance v2, Lcom/leisen/wallet/sdk/http/AsyncHttpClient$1;

    invoke-direct {v2, p0, p1, p2}, Lcom/leisen/wallet/sdk/http/AsyncHttpClient$1;-><init>(Lcom/leisen/wallet/sdk/http/AsyncHttpClient;Landroid/content/Context;Z)V

    .line 328
    invoke-static {}, Landroid/os/Looper;->myLooper()Landroid/os/Looper;

    move-result-object v0

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v1

    if-ne v0, v1, :cond_1

    .line 329
    new-instance v0, Ljava/lang/Thread;

    invoke-direct {v0, v2}, Ljava/lang/Thread;-><init>(Ljava/lang/Runnable;)V

    invoke-virtual {v0}, Ljava/lang/Thread;->start()V

    goto :goto_0

    .line 331
    :cond_1
    invoke-interface {v2}, Ljava/lang/Runnable;->run()V

    .line 333
    :goto_0
    return-void
.end method

.method protected createConnectionManager(Lorg/apache/http/conn/scheme/SchemeRegistry;Lorg/apache/http/params/BasicHttpParams;)Lorg/apache/http/conn/ClientConnectionManager;
    .locals 1

    .line 162
    new-instance v0, Lorg/apache/http/impl/conn/tsccm/ThreadSafeClientConnManager;

    invoke-direct {v0, p2, p1}, Lorg/apache/http/impl/conn/tsccm/ThreadSafeClientConnManager;-><init>(Lorg/apache/http/params/HttpParams;Lorg/apache/http/conn/scheme/SchemeRegistry;)V

    return-object v0
.end method

.method public get(Landroid/content/Context;Ljava/lang/String;Lcom/leisen/wallet/sdk/http/RequestParams;Lcom/leisen/wallet/sdk/http/ResponseHandlerInterface;)Lcom/leisen/wallet/sdk/http/RequestHandle;
    .locals 7

    .line 171
    move-object v0, p0

    iget-object v1, p0, Lcom/leisen/wallet/sdk/http/AsyncHttpClient;->httpClient:Lorg/apache/http/impl/client/DefaultHttpClient;

    iget-object v2, p0, Lcom/leisen/wallet/sdk/http/AsyncHttpClient;->httpContext:Lorg/apache/http/protocol/HttpContext;

    new-instance v3, Lorg/apache/http/client/methods/HttpGet;

    iget-boolean v4, p0, Lcom/leisen/wallet/sdk/http/AsyncHttpClient;->isEncodeUrl:Z

    invoke-direct {p0, v4, p2, p3}, Lcom/leisen/wallet/sdk/http/AsyncHttpClient;->getUrlWithQueryString(ZLjava/lang/String;Lcom/leisen/wallet/sdk/http/RequestParams;)Ljava/lang/String;

    move-result-object v4

    invoke-direct {v3, v4}, Lorg/apache/http/client/methods/HttpGet;-><init>(Ljava/lang/String;)V

    move-object v5, p4

    move-object v6, p1

    const/4 v4, 0x0

    invoke-virtual/range {v0 .. v6}, Lcom/leisen/wallet/sdk/http/AsyncHttpClient;->sendRequest(Lorg/apache/http/impl/client/DefaultHttpClient;Lorg/apache/http/protocol/HttpContext;Lorg/apache/http/client/methods/HttpUriRequest;Ljava/lang/String;Lcom/leisen/wallet/sdk/http/ResponseHandlerInterface;Landroid/content/Context;)Lcom/leisen/wallet/sdk/http/RequestHandle;

    move-result-object v0

    return-object v0
.end method

.method public getCookieStore()Lorg/apache/http/client/CookieStore;
    .locals 1

    .line 415
    iget-object v0, p0, Lcom/leisen/wallet/sdk/http/AsyncHttpClient;->httpClient:Lorg/apache/http/impl/client/DefaultHttpClient;

    invoke-virtual {v0}, Lorg/apache/http/impl/client/DefaultHttpClient;->getCookieStore()Lorg/apache/http/client/CookieStore;

    move-result-object v0

    return-object v0
.end method

.method public post(Landroid/content/Context;Ljava/lang/String;Lcom/leisen/wallet/sdk/http/RequestParams;Lcom/leisen/wallet/sdk/http/ResponseHandlerInterface;)Lcom/leisen/wallet/sdk/http/RequestHandle;
    .locals 6

    .line 175
    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    invoke-direct {p0, p3, p4}, Lcom/leisen/wallet/sdk/http/AsyncHttpClient;->paramsToEntity(Lcom/leisen/wallet/sdk/http/RequestParams;Lcom/leisen/wallet/sdk/http/ResponseHandlerInterface;)Lorg/apache/http/HttpEntity;

    move-result-object v3

    move-object v5, p4

    const/4 v4, 0x0

    invoke-virtual/range {v0 .. v5}, Lcom/leisen/wallet/sdk/http/AsyncHttpClient;->post(Landroid/content/Context;Ljava/lang/String;Lorg/apache/http/HttpEntity;Ljava/lang/String;Lcom/leisen/wallet/sdk/http/ResponseHandlerInterface;)Lcom/leisen/wallet/sdk/http/RequestHandle;

    move-result-object v0

    return-object v0
.end method

.method public post(Landroid/content/Context;Ljava/lang/String;Lorg/apache/http/HttpEntity;Ljava/lang/String;Lcom/leisen/wallet/sdk/http/ResponseHandlerInterface;)Lcom/leisen/wallet/sdk/http/RequestHandle;
    .locals 7

    .line 184
    move-object v0, p0

    iget-object v1, p0, Lcom/leisen/wallet/sdk/http/AsyncHttpClient;->httpClient:Lorg/apache/http/impl/client/DefaultHttpClient;

    iget-object v2, p0, Lcom/leisen/wallet/sdk/http/AsyncHttpClient;->httpContext:Lorg/apache/http/protocol/HttpContext;

    new-instance v3, Lorg/apache/http/client/methods/HttpPost;

    invoke-static {p2}, Ljava/net/URI;->create(Ljava/lang/String;)Ljava/net/URI;

    move-result-object v4

    invoke-virtual {v4}, Ljava/net/URI;->normalize()Ljava/net/URI;

    move-result-object v4

    invoke-direct {v3, v4}, Lorg/apache/http/client/methods/HttpPost;-><init>(Ljava/net/URI;)V

    invoke-direct {p0, v3, p3}, Lcom/leisen/wallet/sdk/http/AsyncHttpClient;->addEntityToRequestBase(Lorg/apache/http/client/methods/HttpEntityEnclosingRequestBase;Lorg/apache/http/HttpEntity;)Lorg/apache/http/client/methods/HttpEntityEnclosingRequestBase;

    move-result-object v3

    move-object v4, p4

    move-object v5, p5

    move-object v6, p1

    invoke-virtual/range {v0 .. v6}, Lcom/leisen/wallet/sdk/http/AsyncHttpClient;->sendRequest(Lorg/apache/http/impl/client/DefaultHttpClient;Lorg/apache/http/protocol/HttpContext;Lorg/apache/http/client/methods/HttpUriRequest;Ljava/lang/String;Lcom/leisen/wallet/sdk/http/ResponseHandlerInterface;Landroid/content/Context;)Lcom/leisen/wallet/sdk/http/RequestHandle;

    move-result-object v0

    return-object v0
.end method

.method protected sendRequest(Lorg/apache/http/impl/client/DefaultHttpClient;Lorg/apache/http/protocol/HttpContext;Lorg/apache/http/client/methods/HttpUriRequest;Ljava/lang/String;Lcom/leisen/wallet/sdk/http/ResponseHandlerInterface;Landroid/content/Context;)Lcom/leisen/wallet/sdk/http/RequestHandle;
    .locals 6

    .line 230
    if-nez p3, :cond_0

    .line 231
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "HttpUriRequest must not be null"

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 233
    :cond_0
    if-nez p5, :cond_1

    .line 234
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "ResponseHandler must not be null"

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 239
    :cond_1
    if-eqz p4, :cond_2

    .line 240
    const-string v0, "Content-Type"

    invoke-interface {p3, v0, p4}, Lorg/apache/http/client/methods/HttpUriRequest;->setHeader(Ljava/lang/String;Ljava/lang/String;)V

    .line 243
    :cond_2
    iget-boolean v0, p0, Lcom/leisen/wallet/sdk/http/AsyncHttpClient;->useSynchronousMode:Z

    invoke-interface {p5, v0}, Lcom/leisen/wallet/sdk/http/ResponseHandlerInterface;->setUseSynchronousMode(Z)V

    .line 244
    invoke-interface {p3}, Lorg/apache/http/client/methods/HttpUriRequest;->getAllHeaders()[Lorg/apache/http/Header;

    move-result-object v0

    invoke-interface {p5, v0}, Lcom/leisen/wallet/sdk/http/ResponseHandlerInterface;->setRequestHeaders([Lorg/apache/http/Header;)V

    .line 245
    invoke-interface {p3}, Lorg/apache/http/client/methods/HttpUriRequest;->getURI()Ljava/net/URI;

    move-result-object v0

    invoke-interface {p5, v0}, Lcom/leisen/wallet/sdk/http/ResponseHandlerInterface;->setRequestURI(Ljava/net/URI;)V

    .line 247
    invoke-direct {p0, p1, p2, p3, p5}, Lcom/leisen/wallet/sdk/http/AsyncHttpClient;->newAysncHttpRequest(Lorg/apache/http/impl/client/DefaultHttpClient;Lorg/apache/http/protocol/HttpContext;Lorg/apache/http/client/methods/HttpUriRequest;Lcom/leisen/wallet/sdk/http/ResponseHandlerInterface;)Lcom/leisen/wallet/sdk/http/AsyncHttpRequest;

    move-result-object v2

    .line 248
    iget-boolean v0, p0, Lcom/leisen/wallet/sdk/http/AsyncHttpClient;->useSynchronousMode:Z

    if-eqz v0, :cond_3

    .line 249
    invoke-virtual {v2}, Lcom/leisen/wallet/sdk/http/AsyncHttpRequest;->run()V

    goto :goto_0

    .line 251
    :cond_3
    iget-object v0, p0, Lcom/leisen/wallet/sdk/http/AsyncHttpClient;->threadPool:Ljava/util/concurrent/ExecutorService;

    invoke-interface {v0, v2}, Ljava/util/concurrent/ExecutorService;->submit(Ljava/lang/Runnable;)Ljava/util/concurrent/Future;

    .line 254
    :goto_0
    new-instance v3, Lcom/leisen/wallet/sdk/http/RequestHandle;

    invoke-direct {v3, v2}, Lcom/leisen/wallet/sdk/http/RequestHandle;-><init>(Lcom/leisen/wallet/sdk/http/AsyncHttpRequest;)V

    .line 255
    if-eqz p6, :cond_6

    .line 256
    iget-object v0, p0, Lcom/leisen/wallet/sdk/http/AsyncHttpClient;->requestMap:Ljava/util/Map;

    invoke-interface {v0, p6}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Ljava/util/List;

    .line 257
    if-nez v4, :cond_4

    .line 258
    new-instance v4, Ljava/util/LinkedList;

    invoke-direct {v4}, Ljava/util/LinkedList;-><init>()V

    .line 259
    iget-object v0, p0, Lcom/leisen/wallet/sdk/http/AsyncHttpClient;->requestMap:Ljava/util/Map;

    invoke-interface {v0, p6, v4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 264
    :cond_4
    invoke-interface {v4, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 265
    invoke-interface {v4}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v5

    .line 266
    :cond_5
    :goto_1
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_6

    .line 267
    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/leisen/wallet/sdk/http/RequestHandle;

    invoke-virtual {v0}, Lcom/leisen/wallet/sdk/http/RequestHandle;->shouldBeGarbageCollected()Z

    move-result v0

    if-eqz v0, :cond_5

    .line 268
    invoke-interface {v5}, Ljava/util/Iterator;->remove()V

    goto :goto_1

    .line 272
    :cond_6
    return-object v3
.end method

.method public setCookieStore(Lorg/apache/http/client/CookieStore;)V
    .locals 2

    .line 434
    iget-object v0, p0, Lcom/leisen/wallet/sdk/http/AsyncHttpClient;->httpContext:Lorg/apache/http/protocol/HttpContext;

    const-string v1, "http.cookie-store"

    invoke-interface {v0, v1, p1}, Lorg/apache/http/protocol/HttpContext;->setAttribute(Ljava/lang/String;Ljava/lang/Object;)V

    .line 435
    return-void
.end method
