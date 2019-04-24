.class Lio/fabric/sdk/android/Onboarding;
.super Lio/fabric/sdk/android/Kit;
.source "Onboarding.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lio/fabric/sdk/android/Kit<",
        "Ljava/lang/Boolean;",
        ">;"
    }
.end annotation


# static fields
.field private static final BINARY_BUILD_TYPE:Ljava/lang/String; = "binary"

.field static final CRASHLYTICS_API_ENDPOINT:Ljava/lang/String; = "com.crashlytics.ApiEndpoint"


# instance fields
.field private applicationLabel:Ljava/lang/String;

.field private installerPackageName:Ljava/lang/String;

.field private final kitsFinder:Ljava/util/concurrent/Future;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/concurrent/Future<",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Lio/fabric/sdk/android/KitInfo;",
            ">;>;"
        }
    .end annotation
.end field

.field private packageInfo:Landroid/content/pm/PackageInfo;

.field private packageManager:Landroid/content/pm/PackageManager;

.field private packageName:Ljava/lang/String;

.field private final providedKits:Ljava/util/Collection;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Collection<",
            "Lio/fabric/sdk/android/Kit;",
            ">;"
        }
    .end annotation
.end field

.field private final requestFactory:Lio/fabric/sdk/android/services/network/HttpRequestFactory;

.field private targetAndroidSdkVersion:Ljava/lang/String;

.field private versionCode:Ljava/lang/String;

.field private versionName:Ljava/lang/String;


# direct methods
.method public constructor <init>(Ljava/util/concurrent/Future;Ljava/util/Collection;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/concurrent/Future<",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Lio/fabric/sdk/android/KitInfo;",
            ">;>;",
            "Ljava/util/Collection<",
            "Lio/fabric/sdk/android/Kit;",
            ">;)V"
        }
    .end annotation

    .line 62
    invoke-direct {p0}, Lio/fabric/sdk/android/Kit;-><init>()V

    .line 63
    new-instance v0, Lio/fabric/sdk/android/services/network/DefaultHttpRequestFactory;

    invoke-direct {v0}, Lio/fabric/sdk/android/services/network/DefaultHttpRequestFactory;-><init>()V

    iput-object v0, p0, Lio/fabric/sdk/android/Onboarding;->requestFactory:Lio/fabric/sdk/android/services/network/HttpRequestFactory;

    .line 64
    iput-object p1, p0, Lio/fabric/sdk/android/Onboarding;->kitsFinder:Ljava/util/concurrent/Future;

    .line 65
    iput-object p2, p0, Lio/fabric/sdk/android/Onboarding;->providedKits:Ljava/util/Collection;

    return-void
.end method

.method private buildAppRequest(Lio/fabric/sdk/android/services/settings/IconRequest;Ljava/util/Collection;)Lio/fabric/sdk/android/services/settings/AppRequestData;
    .locals 15
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/fabric/sdk/android/services/settings/IconRequest;",
            "Ljava/util/Collection<",
            "Lio/fabric/sdk/android/KitInfo;",
            ">;)",
            "Lio/fabric/sdk/android/services/settings/AppRequestData;"
        }
    .end annotation

    move-object v0, p0

    .line 210
    invoke-virtual {p0}, Lio/fabric/sdk/android/Onboarding;->getContext()Landroid/content/Context;

    move-result-object v1

    .line 211
    new-instance v2, Lio/fabric/sdk/android/services/common/ApiKey;

    invoke-direct {v2}, Lio/fabric/sdk/android/services/common/ApiKey;-><init>()V

    invoke-virtual {v2, v1}, Lio/fabric/sdk/android/services/common/ApiKey;->getValue(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v4

    .line 212
    invoke-static {v1}, Lio/fabric/sdk/android/services/common/CommonUtils;->resolveBuildId(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x1

    .line 214
    new-array v2, v2, [Ljava/lang/String;

    const/4 v3, 0x0

    aput-object v1, v2, v3

    invoke-static {v2}, Lio/fabric/sdk/android/services/common/CommonUtils;->createInstanceIdFrom([Ljava/lang/String;)Ljava/lang/String;

    move-result-object v8

    .line 215
    iget-object v1, v0, Lio/fabric/sdk/android/Onboarding;->installerPackageName:Ljava/lang/String;

    invoke-static {v1}, Lio/fabric/sdk/android/services/common/DeliveryMechanism;->determineFrom(Ljava/lang/String;)Lio/fabric/sdk/android/services/common/DeliveryMechanism;

    move-result-object v1

    invoke-virtual {v1}, Lio/fabric/sdk/android/services/common/DeliveryMechanism;->getId()I

    move-result v10

    .line 216
    invoke-virtual {p0}, Lio/fabric/sdk/android/Onboarding;->getIdManager()Lio/fabric/sdk/android/services/common/IdManager;

    move-result-object v1

    invoke-virtual {v1}, Lio/fabric/sdk/android/services/common/IdManager;->getAppIdentifier()Ljava/lang/String;

    move-result-object v5

    .line 218
    new-instance v1, Lio/fabric/sdk/android/services/settings/AppRequestData;

    iget-object v6, v0, Lio/fabric/sdk/android/Onboarding;->versionName:Ljava/lang/String;

    iget-object v7, v0, Lio/fabric/sdk/android/Onboarding;->versionCode:Ljava/lang/String;

    iget-object v9, v0, Lio/fabric/sdk/android/Onboarding;->applicationLabel:Ljava/lang/String;

    iget-object v11, v0, Lio/fabric/sdk/android/Onboarding;->targetAndroidSdkVersion:Ljava/lang/String;

    const-string v12, "0"

    move-object v3, v1

    move-object/from16 v13, p1

    move-object/from16 v14, p2

    invoke-direct/range {v3 .. v14}, Lio/fabric/sdk/android/services/settings/AppRequestData;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Lio/fabric/sdk/android/services/settings/IconRequest;Ljava/util/Collection;)V

    return-object v1
.end method

.method private performAutoConfigure(Ljava/lang/String;Lio/fabric/sdk/android/services/settings/AppSettingsData;Ljava/util/Collection;)Z
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lio/fabric/sdk/android/services/settings/AppSettingsData;",
            "Ljava/util/Collection<",
            "Lio/fabric/sdk/android/KitInfo;",
            ">;)Z"
        }
    .end annotation

    const-string v0, "new"

    .line 157
    iget-object v1, p2, Lio/fabric/sdk/android/services/settings/AppSettingsData;->status:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 159
    invoke-direct {p0, p1, p2, p3}, Lio/fabric/sdk/android/Onboarding;->performCreateApp(Ljava/lang/String;Lio/fabric/sdk/android/services/settings/AppSettingsData;Ljava/util/Collection;)Z

    move-result p1

    if-eqz p1, :cond_0

    .line 162
    invoke-static {}, Lio/fabric/sdk/android/services/settings/Settings;->getInstance()Lio/fabric/sdk/android/services/settings/Settings;

    move-result-object p1

    invoke-virtual {p1}, Lio/fabric/sdk/android/services/settings/Settings;->loadSettingsSkippingCache()Z

    move-result p1

    goto :goto_0

    .line 165
    :cond_0
    invoke-static {}, Lio/fabric/sdk/android/Fabric;->getLogger()Lio/fabric/sdk/android/Logger;

    move-result-object p1

    const-string p2, "Fabric"

    const-string p3, "Failed to create app with Crashlytics service."

    const/4 v0, 0x0

    invoke-interface {p1, p2, p3, v0}, Lio/fabric/sdk/android/Logger;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    const/4 p1, 0x0

    goto :goto_0

    :cond_1
    const-string v0, "configured"

    .line 169
    iget-object v1, p2, Lio/fabric/sdk/android/services/settings/AppSettingsData;->status:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 171
    invoke-static {}, Lio/fabric/sdk/android/services/settings/Settings;->getInstance()Lio/fabric/sdk/android/services/settings/Settings;

    move-result-object p1

    invoke-virtual {p1}, Lio/fabric/sdk/android/services/settings/Settings;->loadSettingsSkippingCache()Z

    move-result p1

    goto :goto_0

    .line 172
    :cond_2
    iget-boolean v0, p2, Lio/fabric/sdk/android/services/settings/AppSettingsData;->updateRequired:Z

    if-eqz v0, :cond_3

    .line 175
    invoke-static {}, Lio/fabric/sdk/android/Fabric;->getLogger()Lio/fabric/sdk/android/Logger;

    move-result-object v0

    const-string v1, "Fabric"

    const-string v2, "Server says an update is required - forcing a full App update."

    invoke-interface {v0, v1, v2}, Lio/fabric/sdk/android/Logger;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 177
    invoke-direct {p0, p1, p2, p3}, Lio/fabric/sdk/android/Onboarding;->performUpdateApp(Ljava/lang/String;Lio/fabric/sdk/android/services/settings/AppSettingsData;Ljava/util/Collection;)Z

    :cond_3
    const/4 p1, 0x1

    :goto_0
    return p1
.end method

.method private performCreateApp(Ljava/lang/String;Lio/fabric/sdk/android/services/settings/AppSettingsData;Ljava/util/Collection;)Z
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lio/fabric/sdk/android/services/settings/AppSettingsData;",
            "Ljava/util/Collection<",
            "Lio/fabric/sdk/android/KitInfo;",
            ">;)Z"
        }
    .end annotation

    .line 186
    invoke-virtual {p0}, Lio/fabric/sdk/android/Onboarding;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0, p1}, Lio/fabric/sdk/android/services/settings/IconRequest;->build(Landroid/content/Context;Ljava/lang/String;)Lio/fabric/sdk/android/services/settings/IconRequest;

    move-result-object p1

    invoke-direct {p0, p1, p3}, Lio/fabric/sdk/android/Onboarding;->buildAppRequest(Lio/fabric/sdk/android/services/settings/IconRequest;Ljava/util/Collection;)Lio/fabric/sdk/android/services/settings/AppRequestData;

    move-result-object p1

    .line 187
    new-instance p3, Lio/fabric/sdk/android/services/settings/CreateAppSpiCall;

    invoke-virtual {p0}, Lio/fabric/sdk/android/Onboarding;->getOverridenSpiEndpoint()Ljava/lang/String;

    move-result-object v0

    iget-object p2, p2, Lio/fabric/sdk/android/services/settings/AppSettingsData;->url:Ljava/lang/String;

    iget-object v1, p0, Lio/fabric/sdk/android/Onboarding;->requestFactory:Lio/fabric/sdk/android/services/network/HttpRequestFactory;

    invoke-direct {p3, p0, v0, p2, v1}, Lio/fabric/sdk/android/services/settings/CreateAppSpiCall;-><init>(Lio/fabric/sdk/android/Kit;Ljava/lang/String;Ljava/lang/String;Lio/fabric/sdk/android/services/network/HttpRequestFactory;)V

    .line 188
    invoke-virtual {p3, p1}, Lio/fabric/sdk/android/services/settings/CreateAppSpiCall;->invoke(Lio/fabric/sdk/android/services/settings/AppRequestData;)Z

    move-result p1

    return p1
.end method

.method private performUpdateApp(Lio/fabric/sdk/android/services/settings/AppSettingsData;Lio/fabric/sdk/android/services/settings/IconRequest;Ljava/util/Collection;)Z
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/fabric/sdk/android/services/settings/AppSettingsData;",
            "Lio/fabric/sdk/android/services/settings/IconRequest;",
            "Ljava/util/Collection<",
            "Lio/fabric/sdk/android/KitInfo;",
            ">;)Z"
        }
    .end annotation

    .line 204
    invoke-direct {p0, p2, p3}, Lio/fabric/sdk/android/Onboarding;->buildAppRequest(Lio/fabric/sdk/android/services/settings/IconRequest;Ljava/util/Collection;)Lio/fabric/sdk/android/services/settings/AppRequestData;

    move-result-object p2

    .line 205
    new-instance p3, Lio/fabric/sdk/android/services/settings/UpdateAppSpiCall;

    invoke-virtual {p0}, Lio/fabric/sdk/android/Onboarding;->getOverridenSpiEndpoint()Ljava/lang/String;

    move-result-object v0

    iget-object p1, p1, Lio/fabric/sdk/android/services/settings/AppSettingsData;->url:Ljava/lang/String;

    iget-object v1, p0, Lio/fabric/sdk/android/Onboarding;->requestFactory:Lio/fabric/sdk/android/services/network/HttpRequestFactory;

    invoke-direct {p3, p0, v0, p1, v1}, Lio/fabric/sdk/android/services/settings/UpdateAppSpiCall;-><init>(Lio/fabric/sdk/android/Kit;Ljava/lang/String;Ljava/lang/String;Lio/fabric/sdk/android/services/network/HttpRequestFactory;)V

    .line 206
    invoke-virtual {p3, p2}, Lio/fabric/sdk/android/services/settings/UpdateAppSpiCall;->invoke(Lio/fabric/sdk/android/services/settings/AppRequestData;)Z

    move-result p1

    return p1
.end method

.method private performUpdateApp(Ljava/lang/String;Lio/fabric/sdk/android/services/settings/AppSettingsData;Ljava/util/Collection;)Z
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lio/fabric/sdk/android/services/settings/AppSettingsData;",
            "Ljava/util/Collection<",
            "Lio/fabric/sdk/android/KitInfo;",
            ">;)Z"
        }
    .end annotation

    .line 196
    invoke-virtual {p0}, Lio/fabric/sdk/android/Onboarding;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0, p1}, Lio/fabric/sdk/android/services/settings/IconRequest;->build(Landroid/content/Context;Ljava/lang/String;)Lio/fabric/sdk/android/services/settings/IconRequest;

    move-result-object p1

    invoke-direct {p0, p2, p1, p3}, Lio/fabric/sdk/android/Onboarding;->performUpdateApp(Lio/fabric/sdk/android/services/settings/AppSettingsData;Lio/fabric/sdk/android/services/settings/IconRequest;Ljava/util/Collection;)Z

    move-result p1

    return p1
.end method

.method private retrieveSettingsData()Lio/fabric/sdk/android/services/settings/SettingsData;
    .locals 8

    .line 124
    :try_start_0
    invoke-static {}, Lio/fabric/sdk/android/services/settings/Settings;->getInstance()Lio/fabric/sdk/android/services/settings/Settings;

    move-result-object v0

    iget-object v2, p0, Lio/fabric/sdk/android/Onboarding;->idManager:Lio/fabric/sdk/android/services/common/IdManager;

    iget-object v3, p0, Lio/fabric/sdk/android/Onboarding;->requestFactory:Lio/fabric/sdk/android/services/network/HttpRequestFactory;

    iget-object v4, p0, Lio/fabric/sdk/android/Onboarding;->versionCode:Ljava/lang/String;

    iget-object v5, p0, Lio/fabric/sdk/android/Onboarding;->versionName:Ljava/lang/String;

    .line 126
    invoke-virtual {p0}, Lio/fabric/sdk/android/Onboarding;->getOverridenSpiEndpoint()Ljava/lang/String;

    move-result-object v6

    .line 127
    invoke-virtual {p0}, Lio/fabric/sdk/android/Onboarding;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-static {v1}, Lio/fabric/sdk/android/services/common/DataCollectionArbiter;->getInstance(Landroid/content/Context;)Lio/fabric/sdk/android/services/common/DataCollectionArbiter;

    move-result-object v7

    move-object v1, p0

    .line 125
    invoke-virtual/range {v0 .. v7}, Lio/fabric/sdk/android/services/settings/Settings;->initialize(Lio/fabric/sdk/android/Kit;Lio/fabric/sdk/android/services/common/IdManager;Lio/fabric/sdk/android/services/network/HttpRequestFactory;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lio/fabric/sdk/android/services/common/DataCollectionArbiter;)Lio/fabric/sdk/android/services/settings/Settings;

    move-result-object v0

    .line 128
    invoke-virtual {v0}, Lio/fabric/sdk/android/services/settings/Settings;->loadSettingsData()Z

    .line 130
    invoke-static {}, Lio/fabric/sdk/android/services/settings/Settings;->getInstance()Lio/fabric/sdk/android/services/settings/Settings;

    move-result-object v0

    invoke-virtual {v0}, Lio/fabric/sdk/android/services/settings/Settings;->awaitSettingsData()Lio/fabric/sdk/android/services/settings/SettingsData;

    move-result-object v0
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-object v0

    :catch_0
    move-exception v0

    .line 132
    invoke-static {}, Lio/fabric/sdk/android/Fabric;->getLogger()Lio/fabric/sdk/android/Logger;

    move-result-object v1

    const-string v2, "Fabric"

    const-string v3, "Error dealing with settings"

    invoke-interface {v1, v2, v3, v0}, Lio/fabric/sdk/android/Logger;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    const/4 v0, 0x0

    return-object v0
.end method


# virtual methods
.method protected doInBackground()Ljava/lang/Boolean;
    .locals 4

    .line 98
    invoke-virtual {p0}, Lio/fabric/sdk/android/Onboarding;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lio/fabric/sdk/android/services/common/CommonUtils;->getAppIconHashOrNull(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v0

    .line 100
    invoke-direct {p0}, Lio/fabric/sdk/android/Onboarding;->retrieveSettingsData()Lio/fabric/sdk/android/services/settings/SettingsData;

    move-result-object v1

    if-eqz v1, :cond_1

    .line 105
    :try_start_0
    iget-object v2, p0, Lio/fabric/sdk/android/Onboarding;->kitsFinder:Ljava/util/concurrent/Future;

    if-eqz v2, :cond_0

    .line 106
    iget-object v2, p0, Lio/fabric/sdk/android/Onboarding;->kitsFinder:Ljava/util/concurrent/Future;

    invoke-interface {v2}, Ljava/util/concurrent/Future;->get()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/util/Map;

    goto :goto_0

    .line 108
    :cond_0
    new-instance v2, Ljava/util/HashMap;

    invoke-direct {v2}, Ljava/util/HashMap;-><init>()V

    .line 112
    :goto_0
    iget-object v3, p0, Lio/fabric/sdk/android/Onboarding;->providedKits:Ljava/util/Collection;

    invoke-virtual {p0, v2, v3}, Lio/fabric/sdk/android/Onboarding;->mergeKits(Ljava/util/Map;Ljava/util/Collection;)Ljava/util/Map;

    move-result-object v2

    .line 113
    iget-object v1, v1, Lio/fabric/sdk/android/services/settings/SettingsData;->appData:Lio/fabric/sdk/android/services/settings/AppSettingsData;

    .line 114
    invoke-interface {v2}, Ljava/util/Map;->values()Ljava/util/Collection;

    move-result-object v2

    .line 113
    invoke-direct {p0, v0, v1, v2}, Lio/fabric/sdk/android/Onboarding;->performAutoConfigure(Ljava/lang/String;Lio/fabric/sdk/android/services/settings/AppSettingsData;Ljava/util/Collection;)Z

    move-result v0
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_1

    :catch_0
    move-exception v0

    .line 116
    invoke-static {}, Lio/fabric/sdk/android/Fabric;->getLogger()Lio/fabric/sdk/android/Logger;

    move-result-object v1

    const-string v2, "Fabric"

    const-string v3, "Error performing auto configuration."

    invoke-interface {v1, v2, v3, v0}, Lio/fabric/sdk/android/Logger;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_1
    const/4 v0, 0x0

    .line 119
    :goto_1
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    return-object v0
.end method

.method protected bridge synthetic doInBackground()Ljava/lang/Object;
    .locals 1

    .line 46
    invoke-virtual {p0}, Lio/fabric/sdk/android/Onboarding;->doInBackground()Ljava/lang/Boolean;

    move-result-object v0

    return-object v0
.end method

.method public getIdentifier()Ljava/lang/String;
    .locals 1

    const-string v0, "io.fabric.sdk.android:fabric"

    return-object v0
.end method

.method getOverridenSpiEndpoint()Ljava/lang/String;
    .locals 2

    .line 223
    invoke-virtual {p0}, Lio/fabric/sdk/android/Onboarding;->getContext()Landroid/content/Context;

    move-result-object v0

    const-string v1, "com.crashlytics.ApiEndpoint"

    invoke-static {v0, v1}, Lio/fabric/sdk/android/services/common/CommonUtils;->getStringsFileValue(Landroid/content/Context;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public getVersion()Ljava/lang/String;
    .locals 1

    const-string v0, "1.4.6.29"

    return-object v0
.end method

.method mergeKits(Ljava/util/Map;Ljava/util/Collection;)Ljava/util/Map;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Lio/fabric/sdk/android/KitInfo;",
            ">;",
            "Ljava/util/Collection<",
            "Lio/fabric/sdk/android/Kit;",
            ">;)",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Lio/fabric/sdk/android/KitInfo;",
            ">;"
        }
    .end annotation

    .line 139
    invoke-interface {p2}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object p2

    :cond_0
    :goto_0
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lio/fabric/sdk/android/Kit;

    .line 140
    invoke-virtual {v0}, Lio/fabric/sdk/android/Kit;->getIdentifier()Ljava/lang/String;

    move-result-object v1

    invoke-interface {p1, v1}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_0

    .line 141
    invoke-virtual {v0}, Lio/fabric/sdk/android/Kit;->getIdentifier()Ljava/lang/String;

    move-result-object v1

    new-instance v2, Lio/fabric/sdk/android/KitInfo;

    invoke-virtual {v0}, Lio/fabric/sdk/android/Kit;->getIdentifier()Ljava/lang/String;

    move-result-object v3

    .line 142
    invoke-virtual {v0}, Lio/fabric/sdk/android/Kit;->getVersion()Ljava/lang/String;

    move-result-object v0

    const-string v4, "binary"

    invoke-direct {v2, v3, v0, v4}, Lio/fabric/sdk/android/KitInfo;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 141
    invoke-interface {p1, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    :cond_1
    return-object p1
.end method

.method protected onPreExecute()Z
    .locals 5

    const/4 v0, 0x0

    .line 76
    :try_start_0
    invoke-virtual {p0}, Lio/fabric/sdk/android/Onboarding;->getIdManager()Lio/fabric/sdk/android/services/common/IdManager;

    move-result-object v1

    invoke-virtual {v1}, Lio/fabric/sdk/android/services/common/IdManager;->getInstallerPackageName()Ljava/lang/String;

    move-result-object v1

    iput-object v1, p0, Lio/fabric/sdk/android/Onboarding;->installerPackageName:Ljava/lang/String;

    .line 77
    invoke-virtual {p0}, Lio/fabric/sdk/android/Onboarding;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-virtual {v1}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v1

    iput-object v1, p0, Lio/fabric/sdk/android/Onboarding;->packageManager:Landroid/content/pm/PackageManager;

    .line 78
    invoke-virtual {p0}, Lio/fabric/sdk/android/Onboarding;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-virtual {v1}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v1

    iput-object v1, p0, Lio/fabric/sdk/android/Onboarding;->packageName:Ljava/lang/String;

    .line 79
    iget-object v1, p0, Lio/fabric/sdk/android/Onboarding;->packageManager:Landroid/content/pm/PackageManager;

    iget-object v2, p0, Lio/fabric/sdk/android/Onboarding;->packageName:Ljava/lang/String;

    invoke-virtual {v1, v2, v0}, Landroid/content/pm/PackageManager;->getPackageInfo(Ljava/lang/String;I)Landroid/content/pm/PackageInfo;

    move-result-object v1

    iput-object v1, p0, Lio/fabric/sdk/android/Onboarding;->packageInfo:Landroid/content/pm/PackageInfo;

    .line 80
    iget-object v1, p0, Lio/fabric/sdk/android/Onboarding;->packageInfo:Landroid/content/pm/PackageInfo;

    iget v1, v1, Landroid/content/pm/PackageInfo;->versionCode:I

    invoke-static {v1}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v1

    iput-object v1, p0, Lio/fabric/sdk/android/Onboarding;->versionCode:Ljava/lang/String;

    .line 81
    iget-object v1, p0, Lio/fabric/sdk/android/Onboarding;->packageInfo:Landroid/content/pm/PackageInfo;

    iget-object v1, v1, Landroid/content/pm/PackageInfo;->versionName:Ljava/lang/String;

    if-nez v1, :cond_0

    const-string v1, "0.0"

    goto :goto_0

    :cond_0
    iget-object v1, p0, Lio/fabric/sdk/android/Onboarding;->packageInfo:Landroid/content/pm/PackageInfo;

    iget-object v1, v1, Landroid/content/pm/PackageInfo;->versionName:Ljava/lang/String;

    :goto_0
    iput-object v1, p0, Lio/fabric/sdk/android/Onboarding;->versionName:Ljava/lang/String;

    .line 83
    iget-object v1, p0, Lio/fabric/sdk/android/Onboarding;->packageManager:Landroid/content/pm/PackageManager;

    .line 84
    invoke-virtual {p0}, Lio/fabric/sdk/android/Onboarding;->getContext()Landroid/content/Context;

    move-result-object v2

    invoke-virtual {v2}, Landroid/content/Context;->getApplicationInfo()Landroid/content/pm/ApplicationInfo;

    move-result-object v2

    invoke-virtual {v1, v2}, Landroid/content/pm/PackageManager;->getApplicationLabel(Landroid/content/pm/ApplicationInfo;)Ljava/lang/CharSequence;

    move-result-object v1

    .line 85
    invoke-interface {v1}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;

    move-result-object v1

    iput-object v1, p0, Lio/fabric/sdk/android/Onboarding;->applicationLabel:Ljava/lang/String;

    .line 87
    invoke-virtual {p0}, Lio/fabric/sdk/android/Onboarding;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-virtual {v1}, Landroid/content/Context;->getApplicationInfo()Landroid/content/pm/ApplicationInfo;

    move-result-object v1

    iget v1, v1, Landroid/content/pm/ApplicationInfo;->targetSdkVersion:I

    .line 86
    invoke-static {v1}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v1

    iput-object v1, p0, Lio/fabric/sdk/android/Onboarding;->targetAndroidSdkVersion:Ljava/lang/String;
    :try_end_0
    .catch Landroid/content/pm/PackageManager$NameNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    const/4 v0, 0x1

    return v0

    :catch_0
    move-exception v1

    .line 91
    invoke-static {}, Lio/fabric/sdk/android/Fabric;->getLogger()Lio/fabric/sdk/android/Logger;

    move-result-object v2

    const-string v3, "Fabric"

    const-string v4, "Failed init"

    invoke-interface {v2, v3, v4, v1}, Lio/fabric/sdk/android/Logger;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    return v0
.end method
