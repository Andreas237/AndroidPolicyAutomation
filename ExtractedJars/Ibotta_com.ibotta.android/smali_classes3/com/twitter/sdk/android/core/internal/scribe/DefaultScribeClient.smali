.class public Lcom/twitter/sdk/android/core/internal/scribe/DefaultScribeClient;
.super Lcom/twitter/sdk/android/core/internal/scribe/ScribeClient;
.source "DefaultScribeClient.java"


# static fields
.field private static volatile executor:Ljava/util/concurrent/ScheduledExecutorService;


# instance fields
.field private final advertisingId:Ljava/lang/String;

.field private final kit:Lio/fabric/sdk/android/Kit;

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


# direct methods
.method public constructor <init>(Lio/fabric/sdk/android/Kit;Ljava/lang/String;Lcom/google/gson/Gson;Ljava/util/List;Lio/fabric/sdk/android/services/common/IdManager;)V
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/fabric/sdk/android/Kit;",
            "Ljava/lang/String;",
            "Lcom/google/gson/Gson;",
            "Ljava/util/List<",
            "Lcom/twitter/sdk/android/core/SessionManager<",
            "+",
            "Lcom/twitter/sdk/android/core/Session;",
            ">;>;",
            "Lio/fabric/sdk/android/services/common/IdManager;",
            ")V"
        }
    .end annotation

    .line 69
    invoke-static {}, Lcom/twitter/sdk/android/core/internal/scribe/DefaultScribeClient;->getExecutor()Ljava/util/concurrent/ScheduledExecutorService;

    move-result-object v2

    invoke-static {}, Lio/fabric/sdk/android/services/settings/Settings;->getInstance()Lio/fabric/sdk/android/services/settings/Settings;

    move-result-object v0

    invoke-virtual {v0}, Lio/fabric/sdk/android/services/settings/Settings;->awaitSettingsData()Lio/fabric/sdk/android/services/settings/SettingsData;

    move-result-object v0

    invoke-static {p2, p1}, Lcom/twitter/sdk/android/core/internal/scribe/DefaultScribeClient;->getUserAgent(Ljava/lang/String;Lio/fabric/sdk/android/Kit;)Ljava/lang/String;

    move-result-object p2

    invoke-static {v0, p2}, Lcom/twitter/sdk/android/core/internal/scribe/DefaultScribeClient;->getScribeConfig(Lio/fabric/sdk/android/services/settings/SettingsData;Ljava/lang/String;)Lcom/twitter/sdk/android/core/internal/scribe/ScribeConfig;

    move-result-object v3

    new-instance v4, Lcom/twitter/sdk/android/core/internal/scribe/ScribeEvent$Transform;

    invoke-direct {v4, p3}, Lcom/twitter/sdk/android/core/internal/scribe/ScribeEvent$Transform;-><init>(Lcom/google/gson/Gson;)V

    invoke-static {}, Lcom/twitter/sdk/android/core/TwitterCore;->getInstance()Lcom/twitter/sdk/android/core/TwitterCore;

    move-result-object p2

    invoke-virtual {p2}, Lcom/twitter/sdk/android/core/TwitterCore;->getAuthConfig()Lcom/twitter/sdk/android/core/TwitterAuthConfig;

    move-result-object v5

    invoke-static {}, Lcom/twitter/sdk/android/core/TwitterCore;->getInstance()Lcom/twitter/sdk/android/core/TwitterCore;

    move-result-object p2

    invoke-virtual {p2}, Lcom/twitter/sdk/android/core/TwitterCore;->getSSLSocketFactory()Ljavax/net/ssl/SSLSocketFactory;

    move-result-object v7

    move-object v0, p0

    move-object v1, p1

    move-object v6, p4

    move-object v8, p5

    invoke-direct/range {v0 .. v8}, Lcom/twitter/sdk/android/core/internal/scribe/ScribeClient;-><init>(Lio/fabric/sdk/android/Kit;Ljava/util/concurrent/ScheduledExecutorService;Lcom/twitter/sdk/android/core/internal/scribe/ScribeConfig;Lcom/twitter/sdk/android/core/internal/scribe/ScribeEvent$Transform;Lcom/twitter/sdk/android/core/TwitterAuthConfig;Ljava/util/List;Ljavax/net/ssl/SSLSocketFactory;Lio/fabric/sdk/android/services/common/IdManager;)V

    .line 77
    iput-object p4, p0, Lcom/twitter/sdk/android/core/internal/scribe/DefaultScribeClient;->sessionManagers:Ljava/util/List;

    .line 78
    iput-object p1, p0, Lcom/twitter/sdk/android/core/internal/scribe/DefaultScribeClient;->kit:Lio/fabric/sdk/android/Kit;

    .line 79
    invoke-virtual {p5}, Lio/fabric/sdk/android/services/common/IdManager;->getAdvertisingId()Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Lcom/twitter/sdk/android/core/internal/scribe/DefaultScribeClient;->advertisingId:Ljava/lang/String;

    return-void
.end method

.method public constructor <init>(Lio/fabric/sdk/android/Kit;Ljava/lang/String;Ljava/util/List;Lio/fabric/sdk/android/services/common/IdManager;)V
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/fabric/sdk/android/Kit;",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "Lcom/twitter/sdk/android/core/SessionManager<",
            "+",
            "Lcom/twitter/sdk/android/core/Session;",
            ">;>;",
            "Lio/fabric/sdk/android/services/common/IdManager;",
            ")V"
        }
    .end annotation

    .line 64
    invoke-static {}, Lcom/twitter/sdk/android/core/internal/scribe/DefaultScribeClient;->getGson()Lcom/google/gson/Gson;

    move-result-object v3

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move-object v4, p3

    move-object v5, p4

    invoke-direct/range {v0 .. v5}, Lcom/twitter/sdk/android/core/internal/scribe/DefaultScribeClient;-><init>(Lio/fabric/sdk/android/Kit;Ljava/lang/String;Lcom/google/gson/Gson;Ljava/util/List;Lio/fabric/sdk/android/services/common/IdManager;)V

    return-void
.end method

.method private static getExecutor()Ljava/util/concurrent/ScheduledExecutorService;
    .locals 2

    .line 137
    sget-object v0, Lcom/twitter/sdk/android/core/internal/scribe/DefaultScribeClient;->executor:Ljava/util/concurrent/ScheduledExecutorService;

    if-nez v0, :cond_1

    .line 138
    const-class v0, Lcom/twitter/sdk/android/core/internal/scribe/DefaultScribeClient;

    monitor-enter v0

    .line 139
    :try_start_0
    sget-object v1, Lcom/twitter/sdk/android/core/internal/scribe/DefaultScribeClient;->executor:Ljava/util/concurrent/ScheduledExecutorService;

    if-nez v1, :cond_0

    const-string v1, "scribe"

    .line 140
    invoke-static {v1}, Lio/fabric/sdk/android/services/common/ExecutorUtils;->buildSingleThreadScheduledExecutorService(Ljava/lang/String;)Ljava/util/concurrent/ScheduledExecutorService;

    move-result-object v1

    sput-object v1, Lcom/twitter/sdk/android/core/internal/scribe/DefaultScribeClient;->executor:Ljava/util/concurrent/ScheduledExecutorService;

    .line 142
    :cond_0
    monitor-exit v0

    goto :goto_0

    :catchall_0
    move-exception v1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1

    .line 144
    :cond_1
    :goto_0
    sget-object v0, Lcom/twitter/sdk/android/core/internal/scribe/DefaultScribeClient;->executor:Ljava/util/concurrent/ScheduledExecutorService;

    return-object v0
.end method

.method private static getGson()Lcom/google/gson/Gson;
    .locals 2

    .line 131
    new-instance v0, Lcom/google/gson/GsonBuilder;

    invoke-direct {v0}, Lcom/google/gson/GsonBuilder;-><init>()V

    sget-object v1, Lcom/google/gson/FieldNamingPolicy;->LOWER_CASE_WITH_UNDERSCORES:Lcom/google/gson/FieldNamingPolicy;

    invoke-virtual {v0, v1}, Lcom/google/gson/GsonBuilder;->setFieldNamingPolicy(Lcom/google/gson/FieldNamingPolicy;)Lcom/google/gson/GsonBuilder;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/gson/GsonBuilder;->create()Lcom/google/gson/Gson;

    move-result-object v0

    return-object v0
.end method

.method static getScribeConfig(Lio/fabric/sdk/android/services/settings/SettingsData;Ljava/lang/String;)Lcom/twitter/sdk/android/core/internal/scribe/ScribeConfig;
    .locals 10

    if-eqz p0, :cond_0

    .line 153
    iget-object v0, p0, Lio/fabric/sdk/android/services/settings/SettingsData;->analyticsSettingsData:Lio/fabric/sdk/android/services/settings/AnalyticsSettingsData;

    if-eqz v0, :cond_0

    .line 154
    iget-object v0, p0, Lio/fabric/sdk/android/services/settings/SettingsData;->analyticsSettingsData:Lio/fabric/sdk/android/services/settings/AnalyticsSettingsData;

    iget v0, v0, Lio/fabric/sdk/android/services/settings/AnalyticsSettingsData;->maxPendingSendFileCount:I

    .line 155
    iget-object p0, p0, Lio/fabric/sdk/android/services/settings/SettingsData;->analyticsSettingsData:Lio/fabric/sdk/android/services/settings/AnalyticsSettingsData;

    iget p0, p0, Lio/fabric/sdk/android/services/settings/AnalyticsSettingsData;->flushIntervalSeconds:I

    move v9, p0

    move v8, v0

    goto :goto_0

    :cond_0
    const/16 v0, 0x64

    const/16 p0, 0x258

    const/16 v8, 0x64

    const/16 v9, 0x258

    :goto_0
    const-string p0, "https://syndication.twitter.com"

    const-string v0, ""

    .line 161
    invoke-static {p0, v0}, Lcom/twitter/sdk/android/core/internal/scribe/DefaultScribeClient;->getScribeUrl(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    .line 162
    new-instance p0, Lcom/twitter/sdk/android/core/internal/scribe/ScribeConfig;

    invoke-static {}, Lcom/twitter/sdk/android/core/internal/scribe/DefaultScribeClient;->isEnabled()Z

    move-result v2

    const-string v4, "i"

    const-string v5, "sdk"

    const-string v6, ""

    move-object v1, p0

    move-object v7, p1

    invoke-direct/range {v1 .. v9}, Lcom/twitter/sdk/android/core/internal/scribe/ScribeConfig;-><init>(ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;II)V

    return-object p0
.end method

.method static getScribeUrl(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    .locals 1

    .line 191
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    return-object p1

    :cond_0
    return-object p0
.end method

.method static getUserAgent(Ljava/lang/String;Lio/fabric/sdk/android/Kit;)Ljava/lang/String;
    .locals 2

    .line 177
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Fabric/"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Lio/fabric/sdk/android/Kit;->getFabric()Lio/fabric/sdk/android/Fabric;

    move-result-object v1

    invoke-virtual {v1}, Lio/fabric/sdk/android/Fabric;->getVersion()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, " (Android "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    sget v1, Landroid/os/Build$VERSION;->SDK_INT:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ") "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p0, "/"

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Lio/fabric/sdk/android/Kit;->getVersion()Ljava/lang/String;

    move-result-object p0

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method private static isEnabled()Z
    .locals 2

    const-string v0, "release"

    const-string v1, "debug"

    .line 173
    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    xor-int/lit8 v0, v0, 0x1

    return v0
.end method


# virtual methods
.method getActiveSession()Lcom/twitter/sdk/android/core/Session;
    .locals 3

    .line 107
    iget-object v0, p0, Lcom/twitter/sdk/android/core/internal/scribe/DefaultScribeClient;->sessionManagers:Ljava/util/List;

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

    .line 108
    invoke-interface {v1}, Lcom/twitter/sdk/android/core/SessionManager;->getActiveSession()Lcom/twitter/sdk/android/core/Session;

    move-result-object v1

    if-eqz v1, :cond_0

    :cond_1
    return-object v1
.end method

.method getScribeSessionId(Lcom/twitter/sdk/android/core/Session;)J
    .locals 2

    if-eqz p1, :cond_0

    .line 120
    invoke-virtual {p1}, Lcom/twitter/sdk/android/core/Session;->getId()J

    move-result-wide v0

    goto :goto_0

    :cond_0
    const-wide/16 v0, 0x0

    :goto_0
    return-wide v0
.end method

.method public scribe(Lcom/twitter/sdk/android/core/internal/scribe/ScribeEvent;)V
    .locals 2

    .line 101
    invoke-virtual {p0}, Lcom/twitter/sdk/android/core/internal/scribe/DefaultScribeClient;->getActiveSession()Lcom/twitter/sdk/android/core/Session;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/twitter/sdk/android/core/internal/scribe/DefaultScribeClient;->getScribeSessionId(Lcom/twitter/sdk/android/core/Session;)J

    move-result-wide v0

    invoke-super {p0, p1, v0, v1}, Lcom/twitter/sdk/android/core/internal/scribe/ScribeClient;->scribe(Lcom/twitter/sdk/android/core/internal/scribe/ScribeEvent;J)Z

    return-void
.end method

.method public varargs scribeSyndicatedSdkImpressionEvents([Lcom/twitter/sdk/android/core/internal/scribe/EventNamespace;)V
    .locals 12

    .line 84
    iget-object v0, p0, Lcom/twitter/sdk/android/core/internal/scribe/DefaultScribeClient;->kit:Lio/fabric/sdk/android/Kit;

    invoke-virtual {v0}, Lio/fabric/sdk/android/Kit;->getContext()Landroid/content/Context;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 85
    iget-object v0, p0, Lcom/twitter/sdk/android/core/internal/scribe/DefaultScribeClient;->kit:Lio/fabric/sdk/android/Kit;

    invoke-virtual {v0}, Lio/fabric/sdk/android/Kit;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;

    move-result-object v0

    iget-object v0, v0, Landroid/content/res/Configuration;->locale:Ljava/util/Locale;

    invoke-virtual {v0}, Ljava/util/Locale;->getLanguage()Ljava/lang/String;

    move-result-object v0

    goto :goto_0

    :cond_0
    const-string v0, ""

    .line 89
    :goto_0
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v7

    .line 95
    array-length v9, p1

    const/4 v1, 0x0

    const/4 v10, 0x0

    :goto_1
    if-ge v10, v9, :cond_1

    aget-object v2, p1, v10

    .line 96
    new-instance v11, Lcom/twitter/sdk/android/core/internal/scribe/SyndicatedSdkImpressionEvent;

    iget-object v6, p0, Lcom/twitter/sdk/android/core/internal/scribe/DefaultScribeClient;->advertisingId:Ljava/lang/String;

    move-object v1, v11

    move-wide v3, v7

    move-object v5, v0

    invoke-direct/range {v1 .. v6}, Lcom/twitter/sdk/android/core/internal/scribe/SyndicatedSdkImpressionEvent;-><init>(Lcom/twitter/sdk/android/core/internal/scribe/EventNamespace;JLjava/lang/String;Ljava/lang/String;)V

    invoke-virtual {p0, v11}, Lcom/twitter/sdk/android/core/internal/scribe/DefaultScribeClient;->scribe(Lcom/twitter/sdk/android/core/internal/scribe/ScribeEvent;)V

    add-int/lit8 v10, v10, 0x1

    goto :goto_1

    :cond_1
    return-void
.end method
