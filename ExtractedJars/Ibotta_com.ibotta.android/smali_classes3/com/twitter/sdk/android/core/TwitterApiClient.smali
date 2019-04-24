.class public Lcom/twitter/sdk/android/core/TwitterApiClient;
.super Ljava/lang/Object;
.source "TwitterApiClient.java"


# annotations
.annotation build Lcom/newrelic/agent/android/instrumentation/Instrumented;
.end annotation


# instance fields
.field final apiAdapter:Lretrofit/RestAdapter;

.field final services:Ljava/util/concurrent/ConcurrentHashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/concurrent/ConcurrentHashMap<",
            "Ljava/lang/Class;",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation
.end field

.field final uploadAdapter:Lretrofit/RestAdapter;


# direct methods
.method public constructor <init>(Lcom/twitter/sdk/android/core/Session;)V
    .locals 7

    .line 94
    invoke-static {}, Lcom/twitter/sdk/android/core/TwitterCore;->getInstance()Lcom/twitter/sdk/android/core/TwitterCore;

    move-result-object v0

    invoke-virtual {v0}, Lcom/twitter/sdk/android/core/TwitterCore;->getAuthConfig()Lcom/twitter/sdk/android/core/TwitterAuthConfig;

    move-result-object v2

    new-instance v4, Lcom/twitter/sdk/android/core/internal/TwitterApi;

    invoke-direct {v4}, Lcom/twitter/sdk/android/core/internal/TwitterApi;-><init>()V

    invoke-static {}, Lcom/twitter/sdk/android/core/TwitterCore;->getInstance()Lcom/twitter/sdk/android/core/TwitterCore;

    move-result-object v0

    invoke-virtual {v0}, Lcom/twitter/sdk/android/core/TwitterCore;->getSSLSocketFactory()Ljavax/net/ssl/SSLSocketFactory;

    move-result-object v5

    invoke-static {}, Lcom/twitter/sdk/android/core/TwitterCore;->getInstance()Lcom/twitter/sdk/android/core/TwitterCore;

    move-result-object v0

    invoke-virtual {v0}, Lcom/twitter/sdk/android/core/TwitterCore;->getFabric()Lio/fabric/sdk/android/Fabric;

    move-result-object v0

    invoke-virtual {v0}, Lio/fabric/sdk/android/Fabric;->getExecutorService()Ljava/util/concurrent/ExecutorService;

    move-result-object v6

    move-object v1, p0

    move-object v3, p1

    invoke-direct/range {v1 .. v6}, Lcom/twitter/sdk/android/core/TwitterApiClient;-><init>(Lcom/twitter/sdk/android/core/TwitterAuthConfig;Lcom/twitter/sdk/android/core/Session;Lcom/twitter/sdk/android/core/internal/TwitterApi;Ljavax/net/ssl/SSLSocketFactory;Ljava/util/concurrent/ExecutorService;)V

    return-void
.end method

.method constructor <init>(Lcom/twitter/sdk/android/core/TwitterAuthConfig;Lcom/twitter/sdk/android/core/Session;Lcom/twitter/sdk/android/core/internal/TwitterApi;Ljavax/net/ssl/SSLSocketFactory;Ljava/util/concurrent/ExecutorService;)V
    .locals 4

    .line 57
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    if-eqz p2, :cond_2

    .line 63
    new-instance v0, Ljava/util/concurrent/ConcurrentHashMap;

    invoke-direct {v0}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    iput-object v0, p0, Lcom/twitter/sdk/android/core/TwitterApiClient;->services:Ljava/util/concurrent/ConcurrentHashMap;

    .line 65
    new-instance v0, Lcom/google/gson/GsonBuilder;

    invoke-direct {v0}, Lcom/google/gson/GsonBuilder;-><init>()V

    new-instance v1, Lcom/twitter/sdk/android/core/models/SafeListAdapter;

    invoke-direct {v1}, Lcom/twitter/sdk/android/core/models/SafeListAdapter;-><init>()V

    invoke-virtual {v0, v1}, Lcom/google/gson/GsonBuilder;->registerTypeAdapterFactory(Lcom/google/gson/TypeAdapterFactory;)Lcom/google/gson/GsonBuilder;

    move-result-object v0

    new-instance v1, Lcom/twitter/sdk/android/core/models/SafeMapAdapter;

    invoke-direct {v1}, Lcom/twitter/sdk/android/core/models/SafeMapAdapter;-><init>()V

    invoke-virtual {v0, v1}, Lcom/google/gson/GsonBuilder;->registerTypeAdapterFactory(Lcom/google/gson/TypeAdapterFactory;)Lcom/google/gson/GsonBuilder;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/gson/GsonBuilder;->create()Lcom/google/gson/Gson;

    move-result-object v0

    .line 70
    new-instance v1, Lretrofit/RestAdapter$Builder;

    invoke-direct {v1}, Lretrofit/RestAdapter$Builder;-><init>()V

    new-instance v2, Lcom/twitter/sdk/android/core/AuthenticatedClient;

    invoke-direct {v2, p1, p2, p4}, Lcom/twitter/sdk/android/core/AuthenticatedClient;-><init>(Lcom/twitter/sdk/android/core/TwitterAuthConfig;Lcom/twitter/sdk/android/core/Session;Ljavax/net/ssl/SSLSocketFactory;)V

    instance-of v3, v1, Lretrofit/RestAdapter$Builder;

    if-nez v3, :cond_0

    invoke-virtual {v1, v2}, Lretrofit/RestAdapter$Builder;->setClient(Lretrofit/client/Client;)Lretrofit/RestAdapter$Builder;

    move-result-object v1

    goto :goto_0

    :cond_0
    check-cast v1, Lretrofit/RestAdapter$Builder;

    invoke-static {v1, v2}, Lcom/newrelic/agent/android/instrumentation/retrofit/RetrofitInstrumentation;->setClient(Lretrofit/RestAdapter$Builder;Lretrofit/client/Client;)Lretrofit/RestAdapter$Builder;

    move-result-object v1

    :goto_0
    invoke-virtual {p3}, Lcom/twitter/sdk/android/core/internal/TwitterApi;->getBaseHostUrl()Ljava/lang/String;

    move-result-object p3

    invoke-virtual {v1, p3}, Lretrofit/RestAdapter$Builder;->setEndpoint(Ljava/lang/String;)Lretrofit/RestAdapter$Builder;

    move-result-object p3

    new-instance v1, Lretrofit/converter/GsonConverter;

    invoke-direct {v1, v0}, Lretrofit/converter/GsonConverter;-><init>(Lcom/google/gson/Gson;)V

    invoke-virtual {p3, v1}, Lretrofit/RestAdapter$Builder;->setConverter(Lretrofit/converter/Converter;)Lretrofit/RestAdapter$Builder;

    move-result-object p3

    new-instance v1, Lretrofit/android/MainThreadExecutor;

    invoke-direct {v1}, Lretrofit/android/MainThreadExecutor;-><init>()V

    invoke-virtual {p3, p5, v1}, Lretrofit/RestAdapter$Builder;->setExecutors(Ljava/util/concurrent/Executor;Ljava/util/concurrent/Executor;)Lretrofit/RestAdapter$Builder;

    move-result-object p3

    invoke-virtual {p3}, Lretrofit/RestAdapter$Builder;->build()Lretrofit/RestAdapter;

    move-result-object p3

    iput-object p3, p0, Lcom/twitter/sdk/android/core/TwitterApiClient;->apiAdapter:Lretrofit/RestAdapter;

    .line 77
    new-instance p3, Lretrofit/RestAdapter$Builder;

    invoke-direct {p3}, Lretrofit/RestAdapter$Builder;-><init>()V

    new-instance v1, Lcom/twitter/sdk/android/core/AuthenticatedClient;

    invoke-direct {v1, p1, p2, p4}, Lcom/twitter/sdk/android/core/AuthenticatedClient;-><init>(Lcom/twitter/sdk/android/core/TwitterAuthConfig;Lcom/twitter/sdk/android/core/Session;Ljavax/net/ssl/SSLSocketFactory;)V

    instance-of p1, p3, Lretrofit/RestAdapter$Builder;

    if-nez p1, :cond_1

    invoke-virtual {p3, v1}, Lretrofit/RestAdapter$Builder;->setClient(Lretrofit/client/Client;)Lretrofit/RestAdapter$Builder;

    move-result-object p1

    goto :goto_1

    :cond_1
    check-cast p3, Lretrofit/RestAdapter$Builder;

    invoke-static {p3, v1}, Lcom/newrelic/agent/android/instrumentation/retrofit/RetrofitInstrumentation;->setClient(Lretrofit/RestAdapter$Builder;Lretrofit/client/Client;)Lretrofit/RestAdapter$Builder;

    move-result-object p1

    :goto_1
    const-string p2, "https://upload.twitter.com"

    invoke-virtual {p1, p2}, Lretrofit/RestAdapter$Builder;->setEndpoint(Ljava/lang/String;)Lretrofit/RestAdapter$Builder;

    move-result-object p1

    new-instance p2, Lretrofit/converter/GsonConverter;

    invoke-direct {p2, v0}, Lretrofit/converter/GsonConverter;-><init>(Lcom/google/gson/Gson;)V

    invoke-virtual {p1, p2}, Lretrofit/RestAdapter$Builder;->setConverter(Lretrofit/converter/Converter;)Lretrofit/RestAdapter$Builder;

    move-result-object p1

    new-instance p2, Lretrofit/android/MainThreadExecutor;

    invoke-direct {p2}, Lretrofit/android/MainThreadExecutor;-><init>()V

    invoke-virtual {p1, p5, p2}, Lretrofit/RestAdapter$Builder;->setExecutors(Ljava/util/concurrent/Executor;Ljava/util/concurrent/Executor;)Lretrofit/RestAdapter$Builder;

    move-result-object p1

    invoke-virtual {p1}, Lretrofit/RestAdapter$Builder;->build()Lretrofit/RestAdapter;

    move-result-object p1

    iput-object p1, p0, Lcom/twitter/sdk/android/core/TwitterApiClient;->uploadAdapter:Lretrofit/RestAdapter;

    return-void

    .line 60
    :cond_2
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "Session must not be null."

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method


# virtual methods
.method public getAccountService()Lcom/twitter/sdk/android/core/services/AccountService;
    .locals 1

    .line 103
    const-class v0, Lcom/twitter/sdk/android/core/services/AccountService;

    invoke-virtual {p0, v0}, Lcom/twitter/sdk/android/core/TwitterApiClient;->getService(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/twitter/sdk/android/core/services/AccountService;

    return-object v0
.end method

.method getAdapterService(Lretrofit/RestAdapter;Ljava/lang/Class;)Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Lretrofit/RestAdapter;",
            "Ljava/lang/Class<",
            "TT;>;)TT;"
        }
    .end annotation

    .line 169
    iget-object v0, p0, Lcom/twitter/sdk/android/core/TwitterApiClient;->services:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-virtual {v0, p2}, Ljava/util/concurrent/ConcurrentHashMap;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 170
    iget-object v0, p0, Lcom/twitter/sdk/android/core/TwitterApiClient;->services:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-virtual {p1, p2}, Lretrofit/RestAdapter;->create(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object p1

    invoke-virtual {v0, p2, p1}, Ljava/util/concurrent/ConcurrentHashMap;->putIfAbsent(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 172
    :cond_0
    iget-object p1, p0, Lcom/twitter/sdk/android/core/TwitterApiClient;->services:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-virtual {p1, p2}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method protected getService(Ljava/lang/Class;)Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/lang/Class<",
            "TT;>;)TT;"
        }
    .end annotation

    .line 158
    iget-object v0, p0, Lcom/twitter/sdk/android/core/TwitterApiClient;->apiAdapter:Lretrofit/RestAdapter;

    invoke-virtual {p0, v0, p1}, Lcom/twitter/sdk/android/core/TwitterApiClient;->getAdapterService(Lretrofit/RestAdapter;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
