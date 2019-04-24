.class public Lcom/twitter/sdk/android/core/internal/scribe/ScribeClient;
.super Ljava/lang/Object;
.source "ScribeClient.java"


# instance fields
.field private final authConfig:Lcom/twitter/sdk/android/core/TwitterAuthConfig;

.field private final executor:Ljava/util/concurrent/ScheduledExecutorService;

.field private final idManager:Lio/fabric/sdk/android/services/common/IdManager;

.field private final kit:Lio/fabric/sdk/android/Kit;

.field private final scribeConfig:Lcom/twitter/sdk/android/core/internal/scribe/ScribeConfig;

.field final scribeHandlers:Ljava/util/concurrent/ConcurrentHashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/concurrent/ConcurrentHashMap<",
            "Ljava/lang/Long;",
            "Lcom/twitter/sdk/android/core/internal/scribe/ScribeHandler;",
            ">;"
        }
    .end annotation
.end field

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

.field private final transform:Lcom/twitter/sdk/android/core/internal/scribe/ScribeEvent$Transform;


# direct methods
.method public constructor <init>(Lio/fabric/sdk/android/Kit;Ljava/util/concurrent/ScheduledExecutorService;Lcom/twitter/sdk/android/core/internal/scribe/ScribeConfig;Lcom/twitter/sdk/android/core/internal/scribe/ScribeEvent$Transform;Lcom/twitter/sdk/android/core/TwitterAuthConfig;Ljava/util/List;Ljavax/net/ssl/SSLSocketFactory;Lio/fabric/sdk/android/services/common/IdManager;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/fabric/sdk/android/Kit;",
            "Ljava/util/concurrent/ScheduledExecutorService;",
            "Lcom/twitter/sdk/android/core/internal/scribe/ScribeConfig;",
            "Lcom/twitter/sdk/android/core/internal/scribe/ScribeEvent$Transform;",
            "Lcom/twitter/sdk/android/core/TwitterAuthConfig;",
            "Ljava/util/List<",
            "Lcom/twitter/sdk/android/core/SessionManager<",
            "+",
            "Lcom/twitter/sdk/android/core/Session;",
            ">;>;",
            "Ljavax/net/ssl/SSLSocketFactory;",
            "Lio/fabric/sdk/android/services/common/IdManager;",
            ")V"
        }
    .end annotation

    .line 101
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 102
    iput-object p1, p0, Lcom/twitter/sdk/android/core/internal/scribe/ScribeClient;->kit:Lio/fabric/sdk/android/Kit;

    .line 103
    iput-object p2, p0, Lcom/twitter/sdk/android/core/internal/scribe/ScribeClient;->executor:Ljava/util/concurrent/ScheduledExecutorService;

    .line 104
    iput-object p3, p0, Lcom/twitter/sdk/android/core/internal/scribe/ScribeClient;->scribeConfig:Lcom/twitter/sdk/android/core/internal/scribe/ScribeConfig;

    .line 105
    iput-object p4, p0, Lcom/twitter/sdk/android/core/internal/scribe/ScribeClient;->transform:Lcom/twitter/sdk/android/core/internal/scribe/ScribeEvent$Transform;

    .line 106
    iput-object p5, p0, Lcom/twitter/sdk/android/core/internal/scribe/ScribeClient;->authConfig:Lcom/twitter/sdk/android/core/TwitterAuthConfig;

    .line 107
    iput-object p6, p0, Lcom/twitter/sdk/android/core/internal/scribe/ScribeClient;->sessionManagers:Ljava/util/List;

    .line 108
    iput-object p7, p0, Lcom/twitter/sdk/android/core/internal/scribe/ScribeClient;->sslSocketFactory:Ljavax/net/ssl/SSLSocketFactory;

    .line 109
    iput-object p8, p0, Lcom/twitter/sdk/android/core/internal/scribe/ScribeClient;->idManager:Lio/fabric/sdk/android/services/common/IdManager;

    .line 112
    new-instance p1, Ljava/util/concurrent/ConcurrentHashMap;

    const/4 p2, 0x2

    invoke-direct {p1, p2}, Ljava/util/concurrent/ConcurrentHashMap;-><init>(I)V

    iput-object p1, p0, Lcom/twitter/sdk/android/core/internal/scribe/ScribeClient;->scribeHandlers:Ljava/util/concurrent/ConcurrentHashMap;

    return-void
.end method

.method private newScribeHandler(J)Lcom/twitter/sdk/android/core/internal/scribe/ScribeHandler;
    .locals 8
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 149
    iget-object v0, p0, Lcom/twitter/sdk/android/core/internal/scribe/ScribeClient;->kit:Lio/fabric/sdk/android/Kit;

    invoke-virtual {v0}, Lio/fabric/sdk/android/Kit;->getContext()Landroid/content/Context;

    move-result-object v0

    .line 150
    new-instance v5, Lio/fabric/sdk/android/services/events/QueueFileEventStorage;

    new-instance v1, Lio/fabric/sdk/android/services/persistence/FileStoreImpl;

    iget-object v2, p0, Lcom/twitter/sdk/android/core/internal/scribe/ScribeClient;->kit:Lio/fabric/sdk/android/Kit;

    invoke-direct {v1, v2}, Lio/fabric/sdk/android/services/persistence/FileStoreImpl;-><init>(Lio/fabric/sdk/android/Kit;)V

    invoke-virtual {v1}, Lio/fabric/sdk/android/services/persistence/FileStoreImpl;->getFilesDir()Ljava/io/File;

    move-result-object v1

    invoke-virtual {p0, p1, p2}, Lcom/twitter/sdk/android/core/internal/scribe/ScribeClient;->getWorkingFileNameForOwner(J)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p0, p1, p2}, Lcom/twitter/sdk/android/core/internal/scribe/ScribeClient;->getStorageDirForOwner(J)Ljava/lang/String;

    move-result-object v3

    invoke-direct {v5, v0, v1, v2, v3}, Lio/fabric/sdk/android/services/events/QueueFileEventStorage;-><init>(Landroid/content/Context;Ljava/io/File;Ljava/lang/String;Ljava/lang/String;)V

    .line 153
    new-instance v7, Lcom/twitter/sdk/android/core/internal/scribe/ScribeFilesManager;

    iget-object v3, p0, Lcom/twitter/sdk/android/core/internal/scribe/ScribeClient;->transform:Lcom/twitter/sdk/android/core/internal/scribe/ScribeEvent$Transform;

    new-instance v4, Lio/fabric/sdk/android/services/common/SystemCurrentTimeProvider;

    invoke-direct {v4}, Lio/fabric/sdk/android/services/common/SystemCurrentTimeProvider;-><init>()V

    iget-object v1, p0, Lcom/twitter/sdk/android/core/internal/scribe/ScribeClient;->scribeConfig:Lcom/twitter/sdk/android/core/internal/scribe/ScribeConfig;

    iget v6, v1, Lcom/twitter/sdk/android/core/internal/scribe/ScribeConfig;->maxFilesToKeep:I

    move-object v1, v7

    move-object v2, v0

    invoke-direct/range {v1 .. v6}, Lcom/twitter/sdk/android/core/internal/scribe/ScribeFilesManager;-><init>(Landroid/content/Context;Lio/fabric/sdk/android/services/events/EventTransform;Lio/fabric/sdk/android/services/common/CurrentTimeProvider;Lio/fabric/sdk/android/services/events/QueueFileEventStorage;I)V

    .line 155
    new-instance v1, Lcom/twitter/sdk/android/core/internal/scribe/ScribeHandler;

    invoke-virtual {p0, p1, p2, v7}, Lcom/twitter/sdk/android/core/internal/scribe/ScribeClient;->getScribeStrategy(JLcom/twitter/sdk/android/core/internal/scribe/ScribeFilesManager;)Lio/fabric/sdk/android/services/events/EventsStrategy;

    move-result-object p1

    iget-object p2, p0, Lcom/twitter/sdk/android/core/internal/scribe/ScribeClient;->executor:Ljava/util/concurrent/ScheduledExecutorService;

    invoke-direct {v1, v0, p1, v7, p2}, Lcom/twitter/sdk/android/core/internal/scribe/ScribeHandler;-><init>(Landroid/content/Context;Lio/fabric/sdk/android/services/events/EventsStrategy;Lio/fabric/sdk/android/services/events/EventsFilesManager;Ljava/util/concurrent/ScheduledExecutorService;)V

    return-object v1
.end method


# virtual methods
.method getScribeHandler(J)Lcom/twitter/sdk/android/core/internal/scribe/ScribeHandler;
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 142
    iget-object v0, p0, Lcom/twitter/sdk/android/core/internal/scribe/ScribeClient;->scribeHandlers:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-static {p1, p2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/concurrent/ConcurrentHashMap;->containsKey(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 143
    iget-object v0, p0, Lcom/twitter/sdk/android/core/internal/scribe/ScribeClient;->scribeHandlers:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-static {p1, p2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    invoke-direct {p0, p1, p2}, Lcom/twitter/sdk/android/core/internal/scribe/ScribeClient;->newScribeHandler(J)Lcom/twitter/sdk/android/core/internal/scribe/ScribeHandler;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Ljava/util/concurrent/ConcurrentHashMap;->putIfAbsent(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 145
    :cond_0
    iget-object v0, p0, Lcom/twitter/sdk/android/core/internal/scribe/ScribeClient;->scribeHandlers:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-static {p1, p2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p1

    invoke-virtual {v0, p1}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/twitter/sdk/android/core/internal/scribe/ScribeHandler;

    return-object p1
.end method

.method getScribeStrategy(JLcom/twitter/sdk/android/core/internal/scribe/ScribeFilesManager;)Lio/fabric/sdk/android/services/events/EventsStrategy;
    .locals 16
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(J",
            "Lcom/twitter/sdk/android/core/internal/scribe/ScribeFilesManager;",
            ")",
            "Lio/fabric/sdk/android/services/events/EventsStrategy<",
            "Lcom/twitter/sdk/android/core/internal/scribe/ScribeEvent;",
            ">;"
        }
    .end annotation

    move-object/from16 v0, p0

    .line 160
    iget-object v1, v0, Lcom/twitter/sdk/android/core/internal/scribe/ScribeClient;->kit:Lio/fabric/sdk/android/Kit;

    invoke-virtual {v1}, Lio/fabric/sdk/android/Kit;->getContext()Landroid/content/Context;

    move-result-object v1

    .line 161
    iget-object v2, v0, Lcom/twitter/sdk/android/core/internal/scribe/ScribeClient;->scribeConfig:Lcom/twitter/sdk/android/core/internal/scribe/ScribeConfig;

    iget-boolean v2, v2, Lcom/twitter/sdk/android/core/internal/scribe/ScribeConfig;->isEnabled:Z

    if-eqz v2, :cond_0

    const-string v2, "Scribe enabled"

    .line 162
    invoke-static {v1, v2}, Lio/fabric/sdk/android/services/common/CommonUtils;->logControlled(Landroid/content/Context;Ljava/lang/String;)V

    .line 163
    new-instance v12, Lcom/twitter/sdk/android/core/internal/scribe/EnabledScribeStrategy;

    iget-object v13, v0, Lcom/twitter/sdk/android/core/internal/scribe/ScribeClient;->executor:Ljava/util/concurrent/ScheduledExecutorService;

    iget-object v14, v0, Lcom/twitter/sdk/android/core/internal/scribe/ScribeClient;->scribeConfig:Lcom/twitter/sdk/android/core/internal/scribe/ScribeConfig;

    new-instance v15, Lcom/twitter/sdk/android/core/internal/scribe/ScribeFilesSender;

    iget-object v7, v0, Lcom/twitter/sdk/android/core/internal/scribe/ScribeClient;->authConfig:Lcom/twitter/sdk/android/core/TwitterAuthConfig;

    iget-object v8, v0, Lcom/twitter/sdk/android/core/internal/scribe/ScribeClient;->sessionManagers:Ljava/util/List;

    iget-object v9, v0, Lcom/twitter/sdk/android/core/internal/scribe/ScribeClient;->sslSocketFactory:Ljavax/net/ssl/SSLSocketFactory;

    iget-object v11, v0, Lcom/twitter/sdk/android/core/internal/scribe/ScribeClient;->idManager:Lio/fabric/sdk/android/services/common/IdManager;

    move-object v2, v15

    move-object v3, v1

    move-object v4, v14

    move-wide/from16 v5, p1

    move-object v10, v13

    invoke-direct/range {v2 .. v11}, Lcom/twitter/sdk/android/core/internal/scribe/ScribeFilesSender;-><init>(Landroid/content/Context;Lcom/twitter/sdk/android/core/internal/scribe/ScribeConfig;JLcom/twitter/sdk/android/core/TwitterAuthConfig;Ljava/util/List;Ljavax/net/ssl/SSLSocketFactory;Ljava/util/concurrent/ExecutorService;Lio/fabric/sdk/android/services/common/IdManager;)V

    move-object v2, v12

    move-object v4, v13

    move-object/from16 v5, p3

    move-object v6, v14

    move-object v7, v15

    invoke-direct/range {v2 .. v7}, Lcom/twitter/sdk/android/core/internal/scribe/EnabledScribeStrategy;-><init>(Landroid/content/Context;Ljava/util/concurrent/ScheduledExecutorService;Lcom/twitter/sdk/android/core/internal/scribe/ScribeFilesManager;Lcom/twitter/sdk/android/core/internal/scribe/ScribeConfig;Lcom/twitter/sdk/android/core/internal/scribe/ScribeFilesSender;)V

    return-object v12

    :cond_0
    const-string v2, "Scribe disabled"

    .line 167
    invoke-static {v1, v2}, Lio/fabric/sdk/android/services/common/CommonUtils;->logControlled(Landroid/content/Context;Ljava/lang/String;)V

    .line 168
    new-instance v1, Lio/fabric/sdk/android/services/events/DisabledEventsStrategy;

    invoke-direct {v1}, Lio/fabric/sdk/android/services/events/DisabledEventsStrategy;-><init>()V

    return-object v1
.end method

.method getStorageDirForOwner(J)Ljava/lang/String;
    .locals 1

    .line 177
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, p1, p2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string p1, "_se_to_send"

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method getWorkingFileNameForOwner(J)Ljava/lang/String;
    .locals 1

    .line 173
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, p1, p2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string p1, "_se.tap"

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public scribe(Lcom/twitter/sdk/android/core/internal/scribe/ScribeEvent;J)Z
    .locals 0

    .line 120
    :try_start_0
    invoke-virtual {p0, p2, p3}, Lcom/twitter/sdk/android/core/internal/scribe/ScribeClient;->getScribeHandler(J)Lcom/twitter/sdk/android/core/internal/scribe/ScribeHandler;

    move-result-object p2

    invoke-virtual {p2, p1}, Lcom/twitter/sdk/android/core/internal/scribe/ScribeHandler;->scribe(Lcom/twitter/sdk/android/core/internal/scribe/ScribeEvent;)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    const/4 p1, 0x1

    return p1

    :catch_0
    move-exception p1

    .line 123
    iget-object p2, p0, Lcom/twitter/sdk/android/core/internal/scribe/ScribeClient;->kit:Lio/fabric/sdk/android/Kit;

    invoke-virtual {p2}, Lio/fabric/sdk/android/Kit;->getContext()Landroid/content/Context;

    move-result-object p2

    const-string p3, "Failed to scribe event"

    invoke-static {p2, p3, p1}, Lio/fabric/sdk/android/services/common/CommonUtils;->logControlledError(Landroid/content/Context;Ljava/lang/String;Ljava/lang/Throwable;)V

    const/4 p1, 0x0

    return p1
.end method
