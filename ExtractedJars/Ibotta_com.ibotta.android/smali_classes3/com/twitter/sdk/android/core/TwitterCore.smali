.class public Lcom/twitter/sdk/android/core/TwitterCore;
.super Lio/fabric/sdk/android/Kit;
.source "TwitterCore.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lio/fabric/sdk/android/Kit<",
        "Ljava/lang/Boolean;",
        ">;"
    }
.end annotation


# instance fields
.field private final apiClients:Ljava/util/concurrent/ConcurrentHashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/concurrent/ConcurrentHashMap<",
            "Lcom/twitter/sdk/android/core/Session;",
            "Lcom/twitter/sdk/android/core/TwitterApiClient;",
            ">;"
        }
    .end annotation
.end field

.field appSessionManager:Lcom/twitter/sdk/android/core/SessionManager;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/twitter/sdk/android/core/SessionManager<",
            "Lcom/twitter/sdk/android/core/AppSession;",
            ">;"
        }
    .end annotation
.end field

.field private final authConfig:Lcom/twitter/sdk/android/core/TwitterAuthConfig;

.field sessionMonitor:Lcom/twitter/sdk/android/core/internal/SessionMonitor;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/twitter/sdk/android/core/internal/SessionMonitor<",
            "Lcom/twitter/sdk/android/core/TwitterSession;",
            ">;"
        }
    .end annotation
.end field

.field private volatile sslSocketFactory:Ljavax/net/ssl/SSLSocketFactory;

.field twitterSessionManager:Lcom/twitter/sdk/android/core/SessionManager;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/twitter/sdk/android/core/SessionManager<",
            "Lcom/twitter/sdk/android/core/TwitterSession;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lcom/twitter/sdk/android/core/TwitterAuthConfig;)V
    .locals 0

    .line 62
    invoke-direct {p0}, Lio/fabric/sdk/android/Kit;-><init>()V

    .line 63
    iput-object p1, p0, Lcom/twitter/sdk/android/core/TwitterCore;->authConfig:Lcom/twitter/sdk/android/core/TwitterAuthConfig;

    .line 64
    new-instance p1, Ljava/util/concurrent/ConcurrentHashMap;

    invoke-direct {p1}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    iput-object p1, p0, Lcom/twitter/sdk/android/core/TwitterCore;->apiClients:Ljava/util/concurrent/ConcurrentHashMap;

    return-void
.end method

.method private static checkInitialized()V
    .locals 2

    .line 156
    const-class v0, Lcom/twitter/sdk/android/core/TwitterCore;

    invoke-static {v0}, Lio/fabric/sdk/android/Fabric;->getKit(Ljava/lang/Class;)Lio/fabric/sdk/android/Kit;

    move-result-object v0

    if-eqz v0, :cond_0

    return-void

    .line 157
    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Must start Twitter Kit with Fabric.with() first"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method private declared-synchronized createSSLSocketFactory()V
    .locals 4

    monitor-enter p0

    .line 104
    :try_start_0
    iget-object v0, p0, Lcom/twitter/sdk/android/core/TwitterCore;->sslSocketFactory:Ljavax/net/ssl/SSLSocketFactory;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-nez v0, :cond_0

    .line 106
    :try_start_1
    new-instance v0, Lcom/twitter/sdk/android/core/TwitterPinningInfoProvider;

    invoke-virtual {p0}, Lcom/twitter/sdk/android/core/TwitterCore;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/twitter/sdk/android/core/TwitterPinningInfoProvider;-><init>(Landroid/content/Context;)V

    invoke-static {v0}, Lio/fabric/sdk/android/services/network/NetworkUtils;->getSSLSocketFactory(Lio/fabric/sdk/android/services/network/PinningInfoProvider;)Ljavax/net/ssl/SSLSocketFactory;

    move-result-object v0

    iput-object v0, p0, Lcom/twitter/sdk/android/core/TwitterCore;->sslSocketFactory:Ljavax/net/ssl/SSLSocketFactory;

    .line 108
    invoke-static {}, Lio/fabric/sdk/android/Fabric;->getLogger()Lio/fabric/sdk/android/Logger;

    move-result-object v0

    const-string v1, "Twitter"

    const-string v2, "Custom SSL pinning enabled"

    invoke-interface {v0, v1, v2}, Lio/fabric/sdk/android/Logger;->d(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_0

    :catch_0
    move-exception v0

    .line 110
    :try_start_2
    invoke-static {}, Lio/fabric/sdk/android/Fabric;->getLogger()Lio/fabric/sdk/android/Logger;

    move-result-object v1

    const-string v2, "Twitter"

    const-string v3, "Exception setting up custom SSL pinning"

    invoke-interface {v1, v2, v3, v0}, Lio/fabric/sdk/android/Logger;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 113
    :cond_0
    :goto_0
    monitor-exit p0

    return-void

    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method public static getInstance()Lcom/twitter/sdk/android/core/TwitterCore;
    .locals 1

    .line 74
    invoke-static {}, Lcom/twitter/sdk/android/core/TwitterCore;->checkInitialized()V

    .line 75
    const-class v0, Lcom/twitter/sdk/android/core/TwitterCore;

    invoke-static {v0}, Lio/fabric/sdk/android/Fabric;->getKit(Ljava/lang/Class;)Lio/fabric/sdk/android/Kit;

    move-result-object v0

    check-cast v0, Lcom/twitter/sdk/android/core/TwitterCore;

    return-object v0
.end method

.method private initializeScribeClient()V
    .locals 2

    .line 162
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 163
    iget-object v1, p0, Lcom/twitter/sdk/android/core/TwitterCore;->twitterSessionManager:Lcom/twitter/sdk/android/core/SessionManager;

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 164
    iget-object v1, p0, Lcom/twitter/sdk/android/core/TwitterCore;->appSessionManager:Lcom/twitter/sdk/android/core/SessionManager;

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 165
    invoke-virtual {p0}, Lcom/twitter/sdk/android/core/TwitterCore;->getIdManager()Lio/fabric/sdk/android/services/common/IdManager;

    move-result-object v1

    invoke-static {p0, v0, v1}, Lcom/twitter/sdk/android/core/internal/scribe/TwitterCoreScribeClientHolder;->initialize(Lcom/twitter/sdk/android/core/TwitterCore;Ljava/util/List;Lio/fabric/sdk/android/services/common/IdManager;)V

    return-void
.end method


# virtual methods
.method protected doInBackground()Ljava/lang/Boolean;
    .locals 2

    .line 139
    iget-object v0, p0, Lcom/twitter/sdk/android/core/TwitterCore;->twitterSessionManager:Lcom/twitter/sdk/android/core/SessionManager;

    invoke-interface {v0}, Lcom/twitter/sdk/android/core/SessionManager;->getActiveSession()Lcom/twitter/sdk/android/core/Session;

    .line 140
    iget-object v0, p0, Lcom/twitter/sdk/android/core/TwitterCore;->appSessionManager:Lcom/twitter/sdk/android/core/SessionManager;

    invoke-interface {v0}, Lcom/twitter/sdk/android/core/SessionManager;->getActiveSession()Lcom/twitter/sdk/android/core/Session;

    .line 141
    invoke-virtual {p0}, Lcom/twitter/sdk/android/core/TwitterCore;->getSSLSocketFactory()Ljavax/net/ssl/SSLSocketFactory;

    .line 142
    invoke-direct {p0}, Lcom/twitter/sdk/android/core/TwitterCore;->initializeScribeClient()V

    .line 143
    iget-object v0, p0, Lcom/twitter/sdk/android/core/TwitterCore;->sessionMonitor:Lcom/twitter/sdk/android/core/internal/SessionMonitor;

    invoke-virtual {v0}, Lcom/twitter/sdk/android/core/internal/SessionMonitor;->triggerVerificationIfNecessary()V

    .line 146
    iget-object v0, p0, Lcom/twitter/sdk/android/core/TwitterCore;->sessionMonitor:Lcom/twitter/sdk/android/core/internal/SessionMonitor;

    invoke-virtual {p0}, Lcom/twitter/sdk/android/core/TwitterCore;->getFabric()Lio/fabric/sdk/android/Fabric;

    move-result-object v1

    invoke-virtual {v1}, Lio/fabric/sdk/android/Fabric;->getActivityLifecycleManager()Lio/fabric/sdk/android/ActivityLifecycleManager;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/twitter/sdk/android/core/internal/SessionMonitor;->monitorActivityLifecycle(Lio/fabric/sdk/android/ActivityLifecycleManager;)V

    const/4 v0, 0x1

    .line 147
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    return-object v0
.end method

.method protected bridge synthetic doInBackground()Ljava/lang/Object;
    .locals 1

    .line 44
    invoke-virtual {p0}, Lcom/twitter/sdk/android/core/TwitterCore;->doInBackground()Ljava/lang/Boolean;

    move-result-object v0

    return-object v0
.end method

.method public getAuthConfig()Lcom/twitter/sdk/android/core/TwitterAuthConfig;
    .locals 1

    .line 84
    iget-object v0, p0, Lcom/twitter/sdk/android/core/TwitterCore;->authConfig:Lcom/twitter/sdk/android/core/TwitterAuthConfig;

    return-object v0
.end method

.method public getIdentifier()Ljava/lang/String;
    .locals 1

    const-string v0, "com.twitter.sdk.android:twitter-core"

    return-object v0
.end method

.method public getSSLSocketFactory()Ljavax/net/ssl/SSLSocketFactory;
    .locals 1

    .line 95
    invoke-static {}, Lcom/twitter/sdk/android/core/TwitterCore;->checkInitialized()V

    .line 97
    iget-object v0, p0, Lcom/twitter/sdk/android/core/TwitterCore;->sslSocketFactory:Ljavax/net/ssl/SSLSocketFactory;

    if-nez v0, :cond_0

    .line 98
    invoke-direct {p0}, Lcom/twitter/sdk/android/core/TwitterCore;->createSSLSocketFactory()V

    .line 100
    :cond_0
    iget-object v0, p0, Lcom/twitter/sdk/android/core/TwitterCore;->sslSocketFactory:Ljavax/net/ssl/SSLSocketFactory;

    return-object v0
.end method

.method public getSessionManager()Lcom/twitter/sdk/android/core/SessionManager;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/twitter/sdk/android/core/SessionManager<",
            "Lcom/twitter/sdk/android/core/TwitterSession;",
            ">;"
        }
    .end annotation

    .line 222
    invoke-static {}, Lcom/twitter/sdk/android/core/TwitterCore;->checkInitialized()V

    .line 223
    iget-object v0, p0, Lcom/twitter/sdk/android/core/TwitterCore;->twitterSessionManager:Lcom/twitter/sdk/android/core/SessionManager;

    return-object v0
.end method

.method public getVersion()Ljava/lang/String;
    .locals 1

    const-string v0, "1.5.0.78"

    return-object v0
.end method

.method protected onPreExecute()Z
    .locals 5

    .line 117
    new-instance v0, Lcom/twitter/sdk/android/core/internal/MigrationHelper;

    invoke-direct {v0}, Lcom/twitter/sdk/android/core/internal/MigrationHelper;-><init>()V

    .line 118
    invoke-virtual {p0}, Lcom/twitter/sdk/android/core/TwitterCore;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-virtual {p0}, Lcom/twitter/sdk/android/core/TwitterCore;->getIdentifier()Ljava/lang/String;

    move-result-object v2

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p0}, Lcom/twitter/sdk/android/core/TwitterCore;->getIdentifier()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v4, ":"

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v4, "session_store"

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v4, ".xml"

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0, v1, v2, v3}, Lcom/twitter/sdk/android/core/internal/MigrationHelper;->migrateSessionStore(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)V

    .line 121
    new-instance v0, Lcom/twitter/sdk/android/core/PersistedSessionManager;

    new-instance v1, Lio/fabric/sdk/android/services/persistence/PreferenceStoreImpl;

    invoke-virtual {p0}, Lcom/twitter/sdk/android/core/TwitterCore;->getContext()Landroid/content/Context;

    move-result-object v2

    const-string v3, "session_store"

    invoke-direct {v1, v2, v3}, Lio/fabric/sdk/android/services/persistence/PreferenceStoreImpl;-><init>(Landroid/content/Context;Ljava/lang/String;)V

    new-instance v2, Lcom/twitter/sdk/android/core/TwitterSession$Serializer;

    invoke-direct {v2}, Lcom/twitter/sdk/android/core/TwitterSession$Serializer;-><init>()V

    const-string v3, "active_twittersession"

    const-string v4, "twittersession"

    invoke-direct {v0, v1, v2, v3, v4}, Lcom/twitter/sdk/android/core/PersistedSessionManager;-><init>(Lio/fabric/sdk/android/services/persistence/PreferenceStore;Lio/fabric/sdk/android/services/persistence/SerializationStrategy;Ljava/lang/String;Ljava/lang/String;)V

    iput-object v0, p0, Lcom/twitter/sdk/android/core/TwitterCore;->twitterSessionManager:Lcom/twitter/sdk/android/core/SessionManager;

    .line 126
    new-instance v0, Lcom/twitter/sdk/android/core/internal/SessionMonitor;

    iget-object v1, p0, Lcom/twitter/sdk/android/core/TwitterCore;->twitterSessionManager:Lcom/twitter/sdk/android/core/SessionManager;

    invoke-virtual {p0}, Lcom/twitter/sdk/android/core/TwitterCore;->getFabric()Lio/fabric/sdk/android/Fabric;

    move-result-object v2

    invoke-virtual {v2}, Lio/fabric/sdk/android/Fabric;->getExecutorService()Ljava/util/concurrent/ExecutorService;

    move-result-object v2

    new-instance v3, Lcom/twitter/sdk/android/core/internal/TwitterSessionVerifier;

    invoke-direct {v3}, Lcom/twitter/sdk/android/core/internal/TwitterSessionVerifier;-><init>()V

    invoke-direct {v0, v1, v2, v3}, Lcom/twitter/sdk/android/core/internal/SessionMonitor;-><init>(Lcom/twitter/sdk/android/core/SessionManager;Ljava/util/concurrent/ExecutorService;Lcom/twitter/sdk/android/core/internal/SessionVerifier;)V

    iput-object v0, p0, Lcom/twitter/sdk/android/core/TwitterCore;->sessionMonitor:Lcom/twitter/sdk/android/core/internal/SessionMonitor;

    .line 129
    new-instance v0, Lcom/twitter/sdk/android/core/PersistedSessionManager;

    new-instance v1, Lio/fabric/sdk/android/services/persistence/PreferenceStoreImpl;

    invoke-virtual {p0}, Lcom/twitter/sdk/android/core/TwitterCore;->getContext()Landroid/content/Context;

    move-result-object v2

    const-string v3, "session_store"

    invoke-direct {v1, v2, v3}, Lio/fabric/sdk/android/services/persistence/PreferenceStoreImpl;-><init>(Landroid/content/Context;Ljava/lang/String;)V

    new-instance v2, Lcom/twitter/sdk/android/core/AppSession$Serializer;

    invoke-direct {v2}, Lcom/twitter/sdk/android/core/AppSession$Serializer;-><init>()V

    const-string v3, "active_appsession"

    const-string v4, "appsession"

    invoke-direct {v0, v1, v2, v3, v4}, Lcom/twitter/sdk/android/core/PersistedSessionManager;-><init>(Lio/fabric/sdk/android/services/persistence/PreferenceStore;Lio/fabric/sdk/android/services/persistence/SerializationStrategy;Ljava/lang/String;Ljava/lang/String;)V

    iput-object v0, p0, Lcom/twitter/sdk/android/core/TwitterCore;->appSessionManager:Lcom/twitter/sdk/android/core/SessionManager;

    const/4 v0, 0x1

    return v0
.end method
