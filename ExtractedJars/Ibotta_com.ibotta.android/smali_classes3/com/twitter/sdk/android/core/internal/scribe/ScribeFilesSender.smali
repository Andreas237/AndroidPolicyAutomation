.class Lcom/twitter/sdk/android/core/internal/scribe/ScribeFilesSender;
.super Ljava/lang/Object;
.source "ScribeFilesSender.java"

# interfaces
.implements Lio/fabric/sdk/android/services/events/FilesSender;


# annotations
.annotation build Lcom/newrelic/agent/android/instrumentation/Instrumented;
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/twitter/sdk/android/core/internal/scribe/ScribeFilesSender$ConfigRequestInterceptor;,
        Lcom/twitter/sdk/android/core/internal/scribe/ScribeFilesSender$ScribeService;
    }
.end annotation


# static fields
.field private static final COMMA:[B

.field private static final END_JSON_ARRAY:[B

.field private static final START_JSON_ARRAY:[B


# instance fields
.field private final apiAdapter:Ljava/util/concurrent/atomic/AtomicReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/concurrent/atomic/AtomicReference<",
            "Lretrofit/RestAdapter;",
            ">;"
        }
    .end annotation
.end field

.field private final authConfig:Lcom/twitter/sdk/android/core/TwitterAuthConfig;

.field private final context:Landroid/content/Context;

.field private final executorService:Ljava/util/concurrent/ExecutorService;

.field private final idManager:Lio/fabric/sdk/android/services/common/IdManager;

.field private final ownerId:J

.field private final scribeConfig:Lcom/twitter/sdk/android/core/internal/scribe/ScribeConfig;

.field private final sessionManagers:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/twitter/sdk/android/core/SessionManager<",
            "+",
            "Lcom/twitter/sdk/android/core/Session;",
            ">;>;"
        }
    .end annotation
.end field

.field private final sslSocketFactory:Ljavax/net/ssl/SSLSocketFactory;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    const/4 v0, 0x1

    .line 61
    new-array v1, v0, [B

    const/4 v2, 0x0

    const/16 v3, 0x5b

    aput-byte v3, v1, v2

    sput-object v1, Lcom/twitter/sdk/android/core/internal/scribe/ScribeFilesSender;->START_JSON_ARRAY:[B

    .line 65
    new-array v1, v0, [B

    const/16 v3, 0x2c

    aput-byte v3, v1, v2

    sput-object v1, Lcom/twitter/sdk/android/core/internal/scribe/ScribeFilesSender;->COMMA:[B

    .line 69
    new-array v0, v0, [B

    const/16 v1, 0x5d

    aput-byte v1, v0, v2

    sput-object v0, Lcom/twitter/sdk/android/core/internal/scribe/ScribeFilesSender;->END_JSON_ARRAY:[B

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Lcom/twitter/sdk/android/core/internal/scribe/ScribeConfig;JLcom/twitter/sdk/android/core/TwitterAuthConfig;Ljava/util/List;Ljavax/net/ssl/SSLSocketFactory;Ljava/util/concurrent/ExecutorService;Lio/fabric/sdk/android/services/common/IdManager;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "Lcom/twitter/sdk/android/core/internal/scribe/ScribeConfig;",
            "J",
            "Lcom/twitter/sdk/android/core/TwitterAuthConfig;",
            "Ljava/util/List<",
            "Lcom/twitter/sdk/android/core/SessionManager<",
            "+",
            "Lcom/twitter/sdk/android/core/Session;",
            ">;>;",
            "Ljavax/net/ssl/SSLSocketFactory;",
            "Ljava/util/concurrent/ExecutorService;",
            "Lio/fabric/sdk/android/services/common/IdManager;",
            ")V"
        }
    .end annotation

    .line 84
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 85
    iput-object p1, p0, Lcom/twitter/sdk/android/core/internal/scribe/ScribeFilesSender;->context:Landroid/content/Context;

    .line 86
    iput-object p2, p0, Lcom/twitter/sdk/android/core/internal/scribe/ScribeFilesSender;->scribeConfig:Lcom/twitter/sdk/android/core/internal/scribe/ScribeConfig;

    .line 87
    iput-wide p3, p0, Lcom/twitter/sdk/android/core/internal/scribe/ScribeFilesSender;->ownerId:J

    .line 88
    iput-object p5, p0, Lcom/twitter/sdk/android/core/internal/scribe/ScribeFilesSender;->authConfig:Lcom/twitter/sdk/android/core/TwitterAuthConfig;

    .line 89
    iput-object p6, p0, Lcom/twitter/sdk/android/core/internal/scribe/ScribeFilesSender;->sessionManagers:Ljava/util/List;

    .line 90
    iput-object p7, p0, Lcom/twitter/sdk/android/core/internal/scribe/ScribeFilesSender;->sslSocketFactory:Ljavax/net/ssl/SSLSocketFactory;

    .line 91
    iput-object p8, p0, Lcom/twitter/sdk/android/core/internal/scribe/ScribeFilesSender;->executorService:Ljava/util/concurrent/ExecutorService;

    .line 92
    iput-object p9, p0, Lcom/twitter/sdk/android/core/internal/scribe/ScribeFilesSender;->idManager:Lio/fabric/sdk/android/services/common/IdManager;

    .line 93
    new-instance p1, Ljava/util/concurrent/atomic/AtomicReference;

    invoke-direct {p1}, Ljava/util/concurrent/atomic/AtomicReference;-><init>()V

    iput-object p1, p0, Lcom/twitter/sdk/android/core/internal/scribe/ScribeFilesSender;->apiAdapter:Ljava/util/concurrent/atomic/AtomicReference;

    return-void
.end method

.method static synthetic access$000()[B
    .locals 1

    .line 55
    sget-object v0, Lcom/twitter/sdk/android/core/internal/scribe/ScribeFilesSender;->COMMA:[B

    return-object v0
.end method

.method private getSession(J)Lcom/twitter/sdk/android/core/Session;
    .locals 3

    .line 198
    iget-object v0, p0, Lcom/twitter/sdk/android/core/internal/scribe/ScribeFilesSender;->sessionManagers:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    const/4 v1, 0x0

    :cond_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/twitter/sdk/android/core/SessionManager;

    .line 199
    invoke-interface {v1, p1, p2}, Lcom/twitter/sdk/android/core/SessionManager;->getSession(J)Lcom/twitter/sdk/android/core/Session;

    move-result-object v1

    if-eqz v1, :cond_0

    :cond_1
    return-object v1
.end method

.method private hasApiAdapter()Z
    .locals 1

    .line 161
    invoke-virtual {p0}, Lcom/twitter/sdk/android/core/internal/scribe/ScribeFilesSender;->getApiAdapter()Lretrofit/RestAdapter;

    move-result-object v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method private isValidSession(Lcom/twitter/sdk/android/core/Session;)Z
    .locals 0

    if-eqz p1, :cond_0

    .line 208
    invoke-virtual {p1}, Lcom/twitter/sdk/android/core/Session;->getAuthToken()Lcom/twitter/sdk/android/core/AuthToken;

    move-result-object p1

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1
.end method


# virtual methods
.method declared-synchronized getApiAdapter()Lretrofit/RestAdapter;
    .locals 7

    monitor-enter p0

    .line 175
    :try_start_0
    iget-object v0, p0, Lcom/twitter/sdk/android/core/internal/scribe/ScribeFilesSender;->apiAdapter:Ljava/util/concurrent/atomic/AtomicReference;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    move-result-object v0

    if-nez v0, :cond_2

    .line 176
    iget-wide v0, p0, Lcom/twitter/sdk/android/core/internal/scribe/ScribeFilesSender;->ownerId:J

    invoke-direct {p0, v0, v1}, Lcom/twitter/sdk/android/core/internal/scribe/ScribeFilesSender;->getSession(J)Lcom/twitter/sdk/android/core/Session;

    move-result-object v0

    .line 177
    new-instance v1, Lcom/twitter/sdk/android/core/internal/scribe/ScribeFilesSender$ConfigRequestInterceptor;

    iget-object v2, p0, Lcom/twitter/sdk/android/core/internal/scribe/ScribeFilesSender;->scribeConfig:Lcom/twitter/sdk/android/core/internal/scribe/ScribeConfig;

    iget-object v3, p0, Lcom/twitter/sdk/android/core/internal/scribe/ScribeFilesSender;->idManager:Lio/fabric/sdk/android/services/common/IdManager;

    invoke-direct {v1, v2, v3}, Lcom/twitter/sdk/android/core/internal/scribe/ScribeFilesSender$ConfigRequestInterceptor;-><init>(Lcom/twitter/sdk/android/core/internal/scribe/ScribeConfig;Lio/fabric/sdk/android/services/common/IdManager;)V

    .line 179
    invoke-direct {p0, v0}, Lcom/twitter/sdk/android/core/internal/scribe/ScribeFilesSender;->isValidSession(Lcom/twitter/sdk/android/core/Session;)Z

    move-result v2

    if-eqz v2, :cond_1

    .line 180
    iget-object v2, p0, Lcom/twitter/sdk/android/core/internal/scribe/ScribeFilesSender;->apiAdapter:Ljava/util/concurrent/atomic/AtomicReference;

    const/4 v3, 0x0

    new-instance v4, Lretrofit/RestAdapter$Builder;

    invoke-direct {v4}, Lretrofit/RestAdapter$Builder;-><init>()V

    iget-object v5, p0, Lcom/twitter/sdk/android/core/internal/scribe/ScribeFilesSender;->scribeConfig:Lcom/twitter/sdk/android/core/internal/scribe/ScribeConfig;

    iget-object v5, v5, Lcom/twitter/sdk/android/core/internal/scribe/ScribeConfig;->baseUrl:Ljava/lang/String;

    invoke-virtual {v4, v5}, Lretrofit/RestAdapter$Builder;->setEndpoint(Ljava/lang/String;)Lretrofit/RestAdapter$Builder;

    move-result-object v4

    iget-object v5, p0, Lcom/twitter/sdk/android/core/internal/scribe/ScribeFilesSender;->executorService:Ljava/util/concurrent/ExecutorService;

    new-instance v6, Lretrofit/android/MainThreadExecutor;

    invoke-direct {v6}, Lretrofit/android/MainThreadExecutor;-><init>()V

    invoke-virtual {v4, v5, v6}, Lretrofit/RestAdapter$Builder;->setExecutors(Ljava/util/concurrent/Executor;Ljava/util/concurrent/Executor;)Lretrofit/RestAdapter$Builder;

    move-result-object v4

    invoke-virtual {v4, v1}, Lretrofit/RestAdapter$Builder;->setRequestInterceptor(Lretrofit/RequestInterceptor;)Lretrofit/RestAdapter$Builder;

    move-result-object v1

    new-instance v4, Lcom/twitter/sdk/android/core/AuthenticatedClient;

    iget-object v5, p0, Lcom/twitter/sdk/android/core/internal/scribe/ScribeFilesSender;->authConfig:Lcom/twitter/sdk/android/core/TwitterAuthConfig;

    iget-object v6, p0, Lcom/twitter/sdk/android/core/internal/scribe/ScribeFilesSender;->sslSocketFactory:Ljavax/net/ssl/SSLSocketFactory;

    invoke-direct {v4, v5, v0, v6}, Lcom/twitter/sdk/android/core/AuthenticatedClient;-><init>(Lcom/twitter/sdk/android/core/TwitterAuthConfig;Lcom/twitter/sdk/android/core/Session;Ljavax/net/ssl/SSLSocketFactory;)V

    instance-of v0, v1, Lretrofit/RestAdapter$Builder;

    if-nez v0, :cond_0

    invoke-virtual {v1, v4}, Lretrofit/RestAdapter$Builder;->setClient(Lretrofit/client/Client;)Lretrofit/RestAdapter$Builder;

    move-result-object v0

    goto :goto_0

    :cond_0
    check-cast v1, Lretrofit/RestAdapter$Builder;

    invoke-static {v1, v4}, Lcom/newrelic/agent/android/instrumentation/retrofit/RetrofitInstrumentation;->setClient(Lretrofit/RestAdapter$Builder;Lretrofit/client/Client;)Lretrofit/RestAdapter$Builder;

    move-result-object v0

    :goto_0
    invoke-virtual {v0}, Lretrofit/RestAdapter$Builder;->build()Lretrofit/RestAdapter;

    move-result-object v0

    invoke-virtual {v2, v3, v0}, Ljava/util/concurrent/atomic/AtomicReference;->compareAndSet(Ljava/lang/Object;Ljava/lang/Object;)Z

    goto :goto_1

    .line 190
    :cond_1
    iget-object v0, p0, Lcom/twitter/sdk/android/core/internal/scribe/ScribeFilesSender;->context:Landroid/content/Context;

    const-string v1, "No valid session at this time"

    invoke-static {v0, v1}, Lio/fabric/sdk/android/services/common/CommonUtils;->logControlled(Landroid/content/Context;Ljava/lang/String;)V

    .line 193
    :cond_2
    :goto_1
    iget-object v0, p0, Lcom/twitter/sdk/android/core/internal/scribe/ScribeFilesSender;->apiAdapter:Ljava/util/concurrent/atomic/AtomicReference;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lretrofit/RestAdapter;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-object v0

    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method getScribeEventsAsJsonArrayString(Ljava/util/List;)Ljava/lang/String;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Ljava/io/File;",
            ">;)",
            "Ljava/lang/String;"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 126
    new-instance v0, Ljava/io/ByteArrayOutputStream;

    const/16 v1, 0x400

    invoke-direct {v0, v1}, Ljava/io/ByteArrayOutputStream;-><init>(I)V

    const/4 v1, 0x1

    .line 127
    new-array v1, v1, [Z

    .line 128
    sget-object v2, Lcom/twitter/sdk/android/core/internal/scribe/ScribeFilesSender;->START_JSON_ARRAY:[B

    invoke-virtual {v0, v2}, Ljava/io/ByteArrayOutputStream;->write([B)V

    .line 129
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/io/File;

    const/4 v3, 0x0

    .line 132
    :try_start_0
    new-instance v4, Lio/fabric/sdk/android/services/common/QueueFile;

    invoke-direct {v4, v2}, Lio/fabric/sdk/android/services/common/QueueFile;-><init>(Ljava/io/File;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 133
    :try_start_1
    new-instance v2, Lcom/twitter/sdk/android/core/internal/scribe/ScribeFilesSender$1;

    invoke-direct {v2, p0, v1, v0}, Lcom/twitter/sdk/android/core/internal/scribe/ScribeFilesSender$1;-><init>(Lcom/twitter/sdk/android/core/internal/scribe/ScribeFilesSender;[ZLjava/io/ByteArrayOutputStream;)V

    invoke-virtual {v4, v2}, Lio/fabric/sdk/android/services/common/QueueFile;->forEach(Lio/fabric/sdk/android/services/common/QueueFile$ElementReader;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 149
    invoke-static {v4}, Lio/fabric/sdk/android/services/common/CommonUtils;->closeQuietly(Ljava/io/Closeable;)V

    goto :goto_0

    :catchall_0
    move-exception p1

    goto :goto_1

    :catchall_1
    move-exception p1

    move-object v4, v3

    :goto_1
    invoke-static {v4}, Lio/fabric/sdk/android/services/common/CommonUtils;->closeQuietly(Ljava/io/Closeable;)V

    throw p1

    .line 152
    :cond_0
    sget-object p1, Lcom/twitter/sdk/android/core/internal/scribe/ScribeFilesSender;->END_JSON_ARRAY:[B

    invoke-virtual {v0, p1}, Ljava/io/ByteArrayOutputStream;->write([B)V

    const-string p1, "UTF-8"

    .line 154
    invoke-virtual {v0, p1}, Ljava/io/ByteArrayOutputStream;->toString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public send(Ljava/util/List;)Z
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Ljava/io/File;",
            ">;)Z"
        }
    .end annotation

    .line 98
    invoke-direct {p0}, Lcom/twitter/sdk/android/core/internal/scribe/ScribeFilesSender;->hasApiAdapter()Z

    move-result v0

    if-eqz v0, :cond_2

    const/4 v0, 0x1

    .line 100
    :try_start_0
    invoke-virtual {p0, p1}, Lcom/twitter/sdk/android/core/internal/scribe/ScribeFilesSender;->getScribeEventsAsJsonArrayString(Ljava/util/List;)Ljava/lang/String;

    move-result-object p1

    .line 101
    iget-object v1, p0, Lcom/twitter/sdk/android/core/internal/scribe/ScribeFilesSender;->context:Landroid/content/Context;

    invoke-static {v1, p1}, Lio/fabric/sdk/android/services/common/CommonUtils;->logControlled(Landroid/content/Context;Ljava/lang/String;)V

    .line 103
    invoke-virtual {p0, p1}, Lcom/twitter/sdk/android/core/internal/scribe/ScribeFilesSender;->upload(Ljava/lang/String;)Lretrofit/client/Response;

    move-result-object p1

    .line 104
    invoke-virtual {p1}, Lretrofit/client/Response;->getStatus()I

    move-result p1

    const/16 v1, 0xc8

    if-ne p1, v1, :cond_0

    return v0

    .line 107
    :cond_0
    iget-object p1, p0, Lcom/twitter/sdk/android/core/internal/scribe/ScribeFilesSender;->context:Landroid/content/Context;

    const-string v1, "Failed sending files"

    const/4 v2, 0x0

    invoke-static {p1, v1, v2}, Lio/fabric/sdk/android/services/common/CommonUtils;->logControlledError(Landroid/content/Context;Ljava/lang/String;Ljava/lang/Throwable;)V
    :try_end_0
    .catch Lretrofit/RetrofitError; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception p1

    .line 117
    iget-object v0, p0, Lcom/twitter/sdk/android/core/internal/scribe/ScribeFilesSender;->context:Landroid/content/Context;

    const-string v1, "Failed sending files"

    invoke-static {v0, v1, p1}, Lio/fabric/sdk/android/services/common/CommonUtils;->logControlledError(Landroid/content/Context;Ljava/lang/String;Ljava/lang/Throwable;)V

    goto :goto_0

    :catch_1
    move-exception p1

    .line 110
    iget-object v1, p0, Lcom/twitter/sdk/android/core/internal/scribe/ScribeFilesSender;->context:Landroid/content/Context;

    const-string v2, "Failed sending files"

    invoke-static {v1, v2, p1}, Lio/fabric/sdk/android/services/common/CommonUtils;->logControlledError(Landroid/content/Context;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 111
    invoke-virtual {p1}, Lretrofit/RetrofitError;->getResponse()Lretrofit/client/Response;

    move-result-object v1

    if-eqz v1, :cond_3

    invoke-virtual {p1}, Lretrofit/RetrofitError;->getResponse()Lretrofit/client/Response;

    move-result-object v1

    invoke-virtual {v1}, Lretrofit/client/Response;->getStatus()I

    move-result v1

    const/16 v2, 0x1f4

    if-eq v1, v2, :cond_1

    invoke-virtual {p1}, Lretrofit/RetrofitError;->getResponse()Lretrofit/client/Response;

    move-result-object p1

    invoke-virtual {p1}, Lretrofit/client/Response;->getStatus()I

    move-result p1

    const/16 v1, 0x190

    if-ne p1, v1, :cond_3

    :cond_1
    return v0

    .line 120
    :cond_2
    iget-object p1, p0, Lcom/twitter/sdk/android/core/internal/scribe/ScribeFilesSender;->context:Landroid/content/Context;

    const-string v0, "Cannot attempt upload at this time"

    invoke-static {p1, v0}, Lio/fabric/sdk/android/services/common/CommonUtils;->logControlled(Landroid/content/Context;Ljava/lang/String;)V

    :cond_3
    :goto_0
    const/4 p1, 0x0

    return p1
.end method

.method upload(Ljava/lang/String;)Lretrofit/client/Response;
    .locals 3

    .line 215
    iget-object v0, p0, Lcom/twitter/sdk/android/core/internal/scribe/ScribeFilesSender;->apiAdapter:Ljava/util/concurrent/atomic/AtomicReference;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lretrofit/RestAdapter;

    const-class v1, Lcom/twitter/sdk/android/core/internal/scribe/ScribeFilesSender$ScribeService;

    invoke-virtual {v0, v1}, Lretrofit/RestAdapter;->create(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/twitter/sdk/android/core/internal/scribe/ScribeFilesSender$ScribeService;

    .line 216
    iget-object v1, p0, Lcom/twitter/sdk/android/core/internal/scribe/ScribeFilesSender;->scribeConfig:Lcom/twitter/sdk/android/core/internal/scribe/ScribeConfig;

    iget-object v1, v1, Lcom/twitter/sdk/android/core/internal/scribe/ScribeConfig;->sequence:Ljava/lang/String;

    invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v1

    if-nez v1, :cond_0

    .line 217
    iget-object v1, p0, Lcom/twitter/sdk/android/core/internal/scribe/ScribeFilesSender;->scribeConfig:Lcom/twitter/sdk/android/core/internal/scribe/ScribeConfig;

    iget-object v1, v1, Lcom/twitter/sdk/android/core/internal/scribe/ScribeConfig;->sequence:Ljava/lang/String;

    invoke-interface {v0, v1, p1}, Lcom/twitter/sdk/android/core/internal/scribe/ScribeFilesSender$ScribeService;->uploadSequence(Ljava/lang/String;Ljava/lang/String;)Lretrofit/client/Response;

    move-result-object p1

    return-object p1

    .line 219
    :cond_0
    iget-object v1, p0, Lcom/twitter/sdk/android/core/internal/scribe/ScribeFilesSender;->scribeConfig:Lcom/twitter/sdk/android/core/internal/scribe/ScribeConfig;

    iget-object v1, v1, Lcom/twitter/sdk/android/core/internal/scribe/ScribeConfig;->pathVersion:Ljava/lang/String;

    iget-object v2, p0, Lcom/twitter/sdk/android/core/internal/scribe/ScribeFilesSender;->scribeConfig:Lcom/twitter/sdk/android/core/internal/scribe/ScribeConfig;

    iget-object v2, v2, Lcom/twitter/sdk/android/core/internal/scribe/ScribeConfig;->pathType:Ljava/lang/String;

    invoke-interface {v0, v1, v2, p1}, Lcom/twitter/sdk/android/core/internal/scribe/ScribeFilesSender$ScribeService;->upload(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lretrofit/client/Response;

    move-result-object p1

    return-object p1
.end method
