.class Lio/fabric/sdk/android/services/settings/DefaultSettingsController;
.super Ljava/lang/Object;
.source "DefaultSettingsController.java"

# interfaces
.implements Lio/fabric/sdk/android/services/settings/SettingsController;


# static fields
.field private static final LOAD_ERROR_MESSAGE:Ljava/lang/String; = "Unknown error while loading Crashlytics settings. Crashes will be cached until settings can be retrieved."

.field private static final PREFS_BUILD_INSTANCE_IDENTIFIER:Ljava/lang/String; = "existing_instance_identifier"


# instance fields
.field private final cachedSettingsIo:Lio/fabric/sdk/android/services/settings/CachedSettingsIo;

.field private final currentTimeProvider:Lio/fabric/sdk/android/services/common/CurrentTimeProvider;

.field private final kit:Lio/fabric/sdk/android/Kit;

.field private final preferenceStore:Lio/fabric/sdk/android/services/persistence/PreferenceStore;

.field private final settingsJsonTransform:Lio/fabric/sdk/android/services/settings/SettingsJsonTransform;

.field private final settingsRequest:Lio/fabric/sdk/android/services/settings/SettingsRequest;

.field private final settingsSpiCall:Lio/fabric/sdk/android/services/settings/SettingsSpiCall;


# direct methods
.method public constructor <init>(Lio/fabric/sdk/android/Kit;Lio/fabric/sdk/android/services/settings/SettingsRequest;Lio/fabric/sdk/android/services/common/CurrentTimeProvider;Lio/fabric/sdk/android/services/settings/SettingsJsonTransform;Lio/fabric/sdk/android/services/settings/CachedSettingsIo;Lio/fabric/sdk/android/services/settings/SettingsSpiCall;)V
    .locals 0

    .line 53
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 54
    iput-object p1, p0, Lio/fabric/sdk/android/services/settings/DefaultSettingsController;->kit:Lio/fabric/sdk/android/Kit;

    .line 55
    iput-object p2, p0, Lio/fabric/sdk/android/services/settings/DefaultSettingsController;->settingsRequest:Lio/fabric/sdk/android/services/settings/SettingsRequest;

    .line 56
    iput-object p3, p0, Lio/fabric/sdk/android/services/settings/DefaultSettingsController;->currentTimeProvider:Lio/fabric/sdk/android/services/common/CurrentTimeProvider;

    .line 57
    iput-object p4, p0, Lio/fabric/sdk/android/services/settings/DefaultSettingsController;->settingsJsonTransform:Lio/fabric/sdk/android/services/settings/SettingsJsonTransform;

    .line 58
    iput-object p5, p0, Lio/fabric/sdk/android/services/settings/DefaultSettingsController;->cachedSettingsIo:Lio/fabric/sdk/android/services/settings/CachedSettingsIo;

    .line 59
    iput-object p6, p0, Lio/fabric/sdk/android/services/settings/DefaultSettingsController;->settingsSpiCall:Lio/fabric/sdk/android/services/settings/SettingsSpiCall;

    .line 60
    new-instance p1, Lio/fabric/sdk/android/services/persistence/PreferenceStoreImpl;

    iget-object p2, p0, Lio/fabric/sdk/android/services/settings/DefaultSettingsController;->kit:Lio/fabric/sdk/android/Kit;

    invoke-direct {p1, p2}, Lio/fabric/sdk/android/services/persistence/PreferenceStoreImpl;-><init>(Lio/fabric/sdk/android/Kit;)V

    iput-object p1, p0, Lio/fabric/sdk/android/services/settings/DefaultSettingsController;->preferenceStore:Lio/fabric/sdk/android/services/persistence/PreferenceStore;

    return-void
.end method

.method private getCachedSettingsData(Lio/fabric/sdk/android/services/settings/SettingsCacheBehavior;)Lio/fabric/sdk/android/services/settings/SettingsData;
    .locals 5

    const/4 v0, 0x0

    .line 108
    :try_start_0
    sget-object v1, Lio/fabric/sdk/android/services/settings/SettingsCacheBehavior;->SKIP_CACHE_LOOKUP:Lio/fabric/sdk/android/services/settings/SettingsCacheBehavior;

    invoke-virtual {v1, p1}, Lio/fabric/sdk/android/services/settings/SettingsCacheBehavior;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    .line 109
    iget-object v1, p0, Lio/fabric/sdk/android/services/settings/DefaultSettingsController;->cachedSettingsIo:Lio/fabric/sdk/android/services/settings/CachedSettingsIo;

    invoke-interface {v1}, Lio/fabric/sdk/android/services/settings/CachedSettingsIo;->readCachedSettings()Lorg/json/JSONObject;

    move-result-object v1

    if-eqz v1, :cond_3

    .line 112
    iget-object v2, p0, Lio/fabric/sdk/android/services/settings/DefaultSettingsController;->settingsJsonTransform:Lio/fabric/sdk/android/services/settings/SettingsJsonTransform;

    iget-object v3, p0, Lio/fabric/sdk/android/services/settings/DefaultSettingsController;->currentTimeProvider:Lio/fabric/sdk/android/services/common/CurrentTimeProvider;

    invoke-interface {v2, v3, v1}, Lio/fabric/sdk/android/services/settings/SettingsJsonTransform;->buildFromJson(Lio/fabric/sdk/android/services/common/CurrentTimeProvider;Lorg/json/JSONObject;)Lio/fabric/sdk/android/services/settings/SettingsData;

    move-result-object v2

    if-eqz v2, :cond_2

    const-string v3, "Loaded cached settings: "

    .line 116
    invoke-direct {p0, v1, v3}, Lio/fabric/sdk/android/services/settings/DefaultSettingsController;->logSettings(Lorg/json/JSONObject;Ljava/lang/String;)V

    .line 118
    iget-object v1, p0, Lio/fabric/sdk/android/services/settings/DefaultSettingsController;->currentTimeProvider:Lio/fabric/sdk/android/services/common/CurrentTimeProvider;

    invoke-interface {v1}, Lio/fabric/sdk/android/services/common/CurrentTimeProvider;->getCurrentTimeMillis()J

    move-result-wide v3

    .line 120
    sget-object v1, Lio/fabric/sdk/android/services/settings/SettingsCacheBehavior;->IGNORE_CACHE_EXPIRATION:Lio/fabric/sdk/android/services/settings/SettingsCacheBehavior;

    invoke-virtual {v1, p1}, Lio/fabric/sdk/android/services/settings/SettingsCacheBehavior;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_1

    invoke-virtual {v2, v3, v4}, Lio/fabric/sdk/android/services/settings/SettingsData;->isExpired(J)Z

    move-result p1

    if-nez p1, :cond_0

    goto :goto_0

    .line 125
    :cond_0
    invoke-static {}, Lio/fabric/sdk/android/Fabric;->getLogger()Lio/fabric/sdk/android/Logger;

    move-result-object p1

    const-string v1, "Fabric"

    const-string v2, "Cached settings have expired."

    invoke-interface {p1, v1, v2}, Lio/fabric/sdk/android/Logger;->d(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_1

    goto :goto_2

    .line 123
    :cond_1
    :goto_0
    :try_start_1
    invoke-static {}, Lio/fabric/sdk/android/Fabric;->getLogger()Lio/fabric/sdk/android/Logger;

    move-result-object p1

    const-string v0, "Fabric"

    const-string v1, "Returning cached settings."

    invoke-interface {p1, v0, v1}, Lio/fabric/sdk/android/Logger;->d(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    move-object v0, v2

    goto :goto_2

    :catch_0
    move-exception p1

    move-object v0, v2

    goto :goto_1

    .line 128
    :cond_2
    :try_start_2
    invoke-static {}, Lio/fabric/sdk/android/Fabric;->getLogger()Lio/fabric/sdk/android/Logger;

    move-result-object p1

    const-string v1, "Fabric"

    const-string v2, "Failed to transform cached settings data."

    invoke-interface {p1, v1, v2, v0}, Lio/fabric/sdk/android/Logger;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    goto :goto_2

    .line 132
    :cond_3
    invoke-static {}, Lio/fabric/sdk/android/Fabric;->getLogger()Lio/fabric/sdk/android/Logger;

    move-result-object p1

    const-string v1, "Fabric"

    const-string v2, "No cached settings data found."

    invoke-interface {p1, v1, v2}, Lio/fabric/sdk/android/Logger;->d(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_1

    goto :goto_2

    :catch_1
    move-exception p1

    .line 136
    :goto_1
    invoke-static {}, Lio/fabric/sdk/android/Fabric;->getLogger()Lio/fabric/sdk/android/Logger;

    move-result-object v1

    const-string v2, "Fabric"

    const-string v3, "Failed to get cached settings"

    invoke-interface {v1, v2, v3, p1}, Lio/fabric/sdk/android/Logger;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_4
    :goto_2
    return-object v0
.end method

.method private logSettings(Lorg/json/JSONObject;Ljava/lang/String;)V
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/json/JSONException;
        }
    .end annotation

    .line 143
    invoke-static {}, Lio/fabric/sdk/android/Fabric;->getLogger()Lio/fabric/sdk/android/Logger;

    move-result-object v0

    const-string v1, "Fabric"

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-interface {v0, v1, p1}, Lio/fabric/sdk/android/Logger;->d(Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method


# virtual methods
.method buildInstanceIdentifierChanged()Z
    .locals 2

    .line 163
    invoke-virtual {p0}, Lio/fabric/sdk/android/services/settings/DefaultSettingsController;->getStoredBuildInstanceIdentifier()Ljava/lang/String;

    move-result-object v0

    .line 164
    invoke-virtual {p0}, Lio/fabric/sdk/android/services/settings/DefaultSettingsController;->getBuildInstanceIdentifierFromContext()Ljava/lang/String;

    move-result-object v1

    .line 165
    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    xor-int/lit8 v0, v0, 0x1

    return v0
.end method

.method getBuildInstanceIdentifierFromContext()Ljava/lang/String;
    .locals 3

    const/4 v0, 0x1

    .line 147
    new-array v0, v0, [Ljava/lang/String;

    iget-object v1, p0, Lio/fabric/sdk/android/services/settings/DefaultSettingsController;->kit:Lio/fabric/sdk/android/Kit;

    invoke-virtual {v1}, Lio/fabric/sdk/android/Kit;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-static {v1}, Lio/fabric/sdk/android/services/common/CommonUtils;->resolveBuildId(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x0

    aput-object v1, v0, v2

    invoke-static {v0}, Lio/fabric/sdk/android/services/common/CommonUtils;->createInstanceIdFrom([Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method getStoredBuildInstanceIdentifier()Ljava/lang/String;
    .locals 3

    .line 151
    iget-object v0, p0, Lio/fabric/sdk/android/services/settings/DefaultSettingsController;->preferenceStore:Lio/fabric/sdk/android/services/persistence/PreferenceStore;

    invoke-interface {v0}, Lio/fabric/sdk/android/services/persistence/PreferenceStore;->get()Landroid/content/SharedPreferences;

    move-result-object v0

    const-string v1, "existing_instance_identifier"

    const-string v2, ""

    .line 152
    invoke-interface {v0, v1, v2}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public loadSettingsData()Lio/fabric/sdk/android/services/settings/SettingsData;
    .locals 1

    .line 64
    sget-object v0, Lio/fabric/sdk/android/services/settings/SettingsCacheBehavior;->USE_CACHE:Lio/fabric/sdk/android/services/settings/SettingsCacheBehavior;

    invoke-virtual {p0, v0}, Lio/fabric/sdk/android/services/settings/DefaultSettingsController;->loadSettingsData(Lio/fabric/sdk/android/services/settings/SettingsCacheBehavior;)Lio/fabric/sdk/android/services/settings/SettingsData;

    move-result-object v0

    return-object v0
.end method

.method public loadSettingsData(Lio/fabric/sdk/android/services/settings/SettingsCacheBehavior;)Lio/fabric/sdk/android/services/settings/SettingsData;
    .locals 4

    const/4 v0, 0x0

    .line 75
    :try_start_0
    invoke-static {}, Lio/fabric/sdk/android/Fabric;->isDebuggable()Z

    move-result v1

    if-nez v1, :cond_0

    invoke-virtual {p0}, Lio/fabric/sdk/android/services/settings/DefaultSettingsController;->buildInstanceIdentifierChanged()Z

    move-result v1

    if-nez v1, :cond_0

    .line 76
    invoke-direct {p0, p1}, Lio/fabric/sdk/android/services/settings/DefaultSettingsController;->getCachedSettingsData(Lio/fabric/sdk/android/services/settings/SettingsCacheBehavior;)Lio/fabric/sdk/android/services/settings/SettingsData;

    move-result-object p1

    move-object v0, p1

    :cond_0
    if-nez v0, :cond_1

    .line 80
    iget-object p1, p0, Lio/fabric/sdk/android/services/settings/DefaultSettingsController;->settingsSpiCall:Lio/fabric/sdk/android/services/settings/SettingsSpiCall;

    iget-object v1, p0, Lio/fabric/sdk/android/services/settings/DefaultSettingsController;->settingsRequest:Lio/fabric/sdk/android/services/settings/SettingsRequest;

    invoke-interface {p1, v1}, Lio/fabric/sdk/android/services/settings/SettingsSpiCall;->invoke(Lio/fabric/sdk/android/services/settings/SettingsRequest;)Lorg/json/JSONObject;

    move-result-object p1

    if-eqz p1, :cond_1

    .line 83
    iget-object v1, p0, Lio/fabric/sdk/android/services/settings/DefaultSettingsController;->settingsJsonTransform:Lio/fabric/sdk/android/services/settings/SettingsJsonTransform;

    iget-object v2, p0, Lio/fabric/sdk/android/services/settings/DefaultSettingsController;->currentTimeProvider:Lio/fabric/sdk/android/services/common/CurrentTimeProvider;

    invoke-interface {v1, v2, p1}, Lio/fabric/sdk/android/services/settings/SettingsJsonTransform;->buildFromJson(Lio/fabric/sdk/android/services/common/CurrentTimeProvider;Lorg/json/JSONObject;)Lio/fabric/sdk/android/services/settings/SettingsData;

    move-result-object v1
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_1

    .line 85
    :try_start_1
    iget-object v0, p0, Lio/fabric/sdk/android/services/settings/DefaultSettingsController;->cachedSettingsIo:Lio/fabric/sdk/android/services/settings/CachedSettingsIo;

    iget-wide v2, v1, Lio/fabric/sdk/android/services/settings/SettingsData;->expiresAtMillis:J

    invoke-interface {v0, v2, v3, p1}, Lio/fabric/sdk/android/services/settings/CachedSettingsIo;->writeCachedSettings(JLorg/json/JSONObject;)V

    const-string v0, "Loaded settings: "

    .line 86
    invoke-direct {p0, p1, v0}, Lio/fabric/sdk/android/services/settings/DefaultSettingsController;->logSettings(Lorg/json/JSONObject;Ljava/lang/String;)V

    .line 89
    invoke-virtual {p0}, Lio/fabric/sdk/android/services/settings/DefaultSettingsController;->getBuildInstanceIdentifierFromContext()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p0, p1}, Lio/fabric/sdk/android/services/settings/DefaultSettingsController;->setStoredBuildInstanceIdentifier(Ljava/lang/String;)Z
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    move-object v0, v1

    goto :goto_0

    :catch_0
    move-exception p1

    move-object v0, v1

    goto :goto_1

    :cond_1
    :goto_0
    if-nez v0, :cond_2

    .line 95
    :try_start_2
    sget-object p1, Lio/fabric/sdk/android/services/settings/SettingsCacheBehavior;->IGNORE_CACHE_EXPIRATION:Lio/fabric/sdk/android/services/settings/SettingsCacheBehavior;

    invoke-direct {p0, p1}, Lio/fabric/sdk/android/services/settings/DefaultSettingsController;->getCachedSettingsData(Lio/fabric/sdk/android/services/settings/SettingsCacheBehavior;)Lio/fabric/sdk/android/services/settings/SettingsData;

    move-result-object p1
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_1

    goto :goto_2

    :catch_1
    move-exception p1

    .line 99
    :goto_1
    invoke-static {}, Lio/fabric/sdk/android/Fabric;->getLogger()Lio/fabric/sdk/android/Logger;

    move-result-object v1

    const-string v2, "Fabric"

    const-string v3, "Unknown error while loading Crashlytics settings. Crashes will be cached until settings can be retrieved."

    invoke-interface {v1, v2, v3, p1}, Lio/fabric/sdk/android/Logger;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_2
    move-object p1, v0

    :goto_2
    return-object p1
.end method

.method setStoredBuildInstanceIdentifier(Ljava/lang/String;)Z
    .locals 2
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "CommitPrefEdits"
        }
    .end annotation

    .line 157
    iget-object v0, p0, Lio/fabric/sdk/android/services/settings/DefaultSettingsController;->preferenceStore:Lio/fabric/sdk/android/services/persistence/PreferenceStore;

    invoke-interface {v0}, Lio/fabric/sdk/android/services/persistence/PreferenceStore;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    const-string v1, "existing_instance_identifier"

    .line 158
    invoke-interface {v0, v1, p1}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    .line 159
    iget-object p1, p0, Lio/fabric/sdk/android/services/settings/DefaultSettingsController;->preferenceStore:Lio/fabric/sdk/android/services/persistence/PreferenceStore;

    invoke-interface {p1, v0}, Lio/fabric/sdk/android/services/persistence/PreferenceStore;->save(Landroid/content/SharedPreferences$Editor;)Z

    move-result p1

    return p1
.end method
