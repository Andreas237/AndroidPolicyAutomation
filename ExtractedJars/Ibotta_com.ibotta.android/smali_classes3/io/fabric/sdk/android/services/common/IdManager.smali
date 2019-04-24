.class public Lio/fabric/sdk/android/services/common/IdManager;
.super Ljava/lang/Object;
.source "IdManager.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lio/fabric/sdk/android/services/common/IdManager$DeviceIdentifierType;
    }
.end annotation


# static fields
.field private static final FORWARD_SLASH_REGEX:Ljava/lang/String;

.field private static final ID_PATTERN:Ljava/util/regex/Pattern;


# instance fields
.field advertisingInfo:Lio/fabric/sdk/android/services/common/AdvertisingInfo;

.field advertisingInfoProvider:Lio/fabric/sdk/android/services/common/AdvertisingInfoProvider;

.field private final appContext:Landroid/content/Context;

.field private final appIdentifier:Ljava/lang/String;

.field private final appInstallIdentifier:Ljava/lang/String;

.field private final collectHardwareIds:Z

.field private final collectUserIds:Z

.field fetchedAdvertisingInfo:Z

.field private final installationIdLock:Ljava/util/concurrent/locks/ReentrantLock;

.field private final installerPackageNameProvider:Lio/fabric/sdk/android/services/common/InstallerPackageNameProvider;

.field private final kits:Ljava/util/Collection;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Collection<",
            "Lio/fabric/sdk/android/Kit;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const-string v0, "[^\\p{Alnum}]"

    .line 47
    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    move-result-object v0

    sput-object v0, Lio/fabric/sdk/android/services/common/IdManager;->ID_PATTERN:Ljava/util/regex/Pattern;

    const-string v0, "/"

    .line 52
    invoke-static {v0}, Ljava/util/regex/Pattern;->quote(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lio/fabric/sdk/android/services/common/IdManager;->FORWARD_SLASH_REGEX:Ljava/lang/String;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/util/Collection;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/util/Collection<",
            "Lio/fabric/sdk/android/Kit;",
            ">;)V"
        }
    .end annotation

    .line 97
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 73
    new-instance v0, Ljava/util/concurrent/locks/ReentrantLock;

    invoke-direct {v0}, Ljava/util/concurrent/locks/ReentrantLock;-><init>()V

    iput-object v0, p0, Lio/fabric/sdk/android/services/common/IdManager;->installationIdLock:Ljava/util/concurrent/locks/ReentrantLock;

    if-eqz p1, :cond_4

    if-eqz p2, :cond_3

    if-eqz p4, :cond_2

    .line 107
    iput-object p1, p0, Lio/fabric/sdk/android/services/common/IdManager;->appContext:Landroid/content/Context;

    .line 108
    iput-object p2, p0, Lio/fabric/sdk/android/services/common/IdManager;->appIdentifier:Ljava/lang/String;

    .line 109
    iput-object p3, p0, Lio/fabric/sdk/android/services/common/IdManager;->appInstallIdentifier:Ljava/lang/String;

    .line 110
    iput-object p4, p0, Lio/fabric/sdk/android/services/common/IdManager;->kits:Ljava/util/Collection;

    .line 112
    new-instance p2, Lio/fabric/sdk/android/services/common/InstallerPackageNameProvider;

    invoke-direct {p2}, Lio/fabric/sdk/android/services/common/InstallerPackageNameProvider;-><init>()V

    iput-object p2, p0, Lio/fabric/sdk/android/services/common/IdManager;->installerPackageNameProvider:Lio/fabric/sdk/android/services/common/InstallerPackageNameProvider;

    .line 113
    new-instance p2, Lio/fabric/sdk/android/services/common/AdvertisingInfoProvider;

    invoke-direct {p2, p1}, Lio/fabric/sdk/android/services/common/AdvertisingInfoProvider;-><init>(Landroid/content/Context;)V

    iput-object p2, p0, Lio/fabric/sdk/android/services/common/IdManager;->advertisingInfoProvider:Lio/fabric/sdk/android/services/common/AdvertisingInfoProvider;

    const-string p2, "com.crashlytics.CollectDeviceIdentifiers"

    const/4 p3, 0x1

    .line 115
    invoke-static {p1, p2, p3}, Lio/fabric/sdk/android/services/common/CommonUtils;->getBooleanResourceValue(Landroid/content/Context;Ljava/lang/String;Z)Z

    move-result p2

    iput-boolean p2, p0, Lio/fabric/sdk/android/services/common/IdManager;->collectHardwareIds:Z

    .line 117
    iget-boolean p2, p0, Lio/fabric/sdk/android/services/common/IdManager;->collectHardwareIds:Z

    if-nez p2, :cond_0

    .line 118
    invoke-static {}, Lio/fabric/sdk/android/Fabric;->getLogger()Lio/fabric/sdk/android/Logger;

    move-result-object p2

    const-string p4, "Fabric"

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Device ID collection disabled for "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 119
    invoke-virtual {p1}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 118
    invoke-interface {p2, p4, v0}, Lio/fabric/sdk/android/Logger;->d(Ljava/lang/String;Ljava/lang/String;)V

    :cond_0
    const-string p2, "com.crashlytics.CollectUserIdentifiers"

    .line 122
    invoke-static {p1, p2, p3}, Lio/fabric/sdk/android/services/common/CommonUtils;->getBooleanResourceValue(Landroid/content/Context;Ljava/lang/String;Z)Z

    move-result p2

    iput-boolean p2, p0, Lio/fabric/sdk/android/services/common/IdManager;->collectUserIds:Z

    .line 124
    iget-boolean p2, p0, Lio/fabric/sdk/android/services/common/IdManager;->collectUserIds:Z

    if-nez p2, :cond_1

    .line 125
    invoke-static {}, Lio/fabric/sdk/android/Fabric;->getLogger()Lio/fabric/sdk/android/Logger;

    move-result-object p2

    const-string p3, "Fabric"

    new-instance p4, Ljava/lang/StringBuilder;

    invoke-direct {p4}, Ljava/lang/StringBuilder;-><init>()V

    const-string v0, "User information collection disabled for "

    invoke-virtual {p4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 126
    invoke-virtual {p1}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p4, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    .line 125
    invoke-interface {p2, p3, p1}, Lio/fabric/sdk/android/Logger;->d(Ljava/lang/String;Ljava/lang/String;)V

    :cond_1
    return-void

    .line 105
    :cond_2
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "kits must not be null"

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 102
    :cond_3
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "appIdentifier must not be null"

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 99
    :cond_4
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "appContext must not be null"

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method private createInstallationUUID(Landroid/content/SharedPreferences;)Ljava/lang/String;
    .locals 2

    .line 247
    iget-object v0, p0, Lio/fabric/sdk/android/services/common/IdManager;->installationIdLock:Ljava/util/concurrent/locks/ReentrantLock;

    invoke-virtual {v0}, Ljava/util/concurrent/locks/ReentrantLock;->lock()V

    :try_start_0
    const-string v0, "crashlytics.installation.id"

    const/4 v1, 0x0

    .line 249
    invoke-interface {p1, v0, v1}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    if-nez v0, :cond_0

    .line 252
    invoke-static {}, Ljava/util/UUID;->randomUUID()Ljava/util/UUID;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/UUID;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, v0}, Lio/fabric/sdk/android/services/common/IdManager;->formatId(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 253
    invoke-interface {p1}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object p1

    const-string v1, "crashlytics.installation.id"

    invoke-interface {p1, v1, v0}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    move-result-object p1

    invoke-interface {p1}, Landroid/content/SharedPreferences$Editor;->commit()Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 258
    :cond_0
    iget-object p1, p0, Lio/fabric/sdk/android/services/common/IdManager;->installationIdLock:Ljava/util/concurrent/locks/ReentrantLock;

    invoke-virtual {p1}, Ljava/util/concurrent/locks/ReentrantLock;->unlock()V

    return-object v0

    :catchall_0
    move-exception p1

    iget-object v0, p0, Lio/fabric/sdk/android/services/common/IdManager;->installationIdLock:Ljava/util/concurrent/locks/ReentrantLock;

    invoke-virtual {v0}, Ljava/util/concurrent/locks/ReentrantLock;->unlock()V

    throw p1
.end method

.method private formatId(Ljava/lang/String;)Ljava/lang/String;
    .locals 1

    if-nez p1, :cond_0

    const/4 p1, 0x0

    goto :goto_0

    .line 147
    :cond_0
    sget-object v0, Lio/fabric/sdk/android/services/common/IdManager;->ID_PATTERN:Ljava/util/regex/Pattern;

    invoke-virtual {v0, p1}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    move-result-object p1

    const-string v0, ""

    invoke-virtual {p1, v0}, Ljava/util/regex/Matcher;->replaceAll(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    sget-object v0, Ljava/util/Locale;->US:Ljava/util/Locale;

    invoke-virtual {p1, v0}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object p1

    :goto_0
    return-object p1
.end method

.method private putNonNullIdInto(Ljava/util/Map;Lio/fabric/sdk/android/services/common/IdManager$DeviceIdentifierType;Ljava/lang/String;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "Lio/fabric/sdk/android/services/common/IdManager$DeviceIdentifierType;",
            "Ljava/lang/String;",
            ">;",
            "Lio/fabric/sdk/android/services/common/IdManager$DeviceIdentifierType;",
            "Ljava/lang/String;",
            ")V"
        }
    .end annotation

    if-eqz p3, :cond_0

    .line 336
    invoke-interface {p1, p2, p3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_0
    return-void
.end method

.method private removeForwardSlashesIn(Ljava/lang/String;)Ljava/lang/String;
    .locals 2

    .line 213
    sget-object v0, Lio/fabric/sdk/android/services/common/IdManager;->FORWARD_SLASH_REGEX:Ljava/lang/String;

    const-string v1, ""

    invoke-virtual {p1, v0, v1}, Ljava/lang/String;->replaceAll(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method


# virtual methods
.method public canCollectUserIds()Z
    .locals 1

    .line 139
    iget-boolean v0, p0, Lio/fabric/sdk/android/services/common/IdManager;->collectUserIds:Z

    return v0
.end method

.method public getAdvertisingId()Ljava/lang/String;
    .locals 1

    .line 323
    iget-boolean v0, p0, Lio/fabric/sdk/android/services/common/IdManager;->collectHardwareIds:Z

    if-eqz v0, :cond_0

    .line 324
    invoke-virtual {p0}, Lio/fabric/sdk/android/services/common/IdManager;->getAdvertisingInfo()Lio/fabric/sdk/android/services/common/AdvertisingInfo;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 326
    iget-object v0, v0, Lio/fabric/sdk/android/services/common/AdvertisingInfo;->advertisingId:Ljava/lang/String;

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return-object v0
.end method

.method declared-synchronized getAdvertisingInfo()Lio/fabric/sdk/android/services/common/AdvertisingInfo;
    .locals 1

    monitor-enter p0

    .line 300
    :try_start_0
    iget-boolean v0, p0, Lio/fabric/sdk/android/services/common/IdManager;->fetchedAdvertisingInfo:Z

    if-nez v0, :cond_0

    .line 301
    iget-object v0, p0, Lio/fabric/sdk/android/services/common/IdManager;->advertisingInfoProvider:Lio/fabric/sdk/android/services/common/AdvertisingInfoProvider;

    invoke-virtual {v0}, Lio/fabric/sdk/android/services/common/AdvertisingInfoProvider;->getAdvertisingInfo()Lio/fabric/sdk/android/services/common/AdvertisingInfo;

    move-result-object v0

    iput-object v0, p0, Lio/fabric/sdk/android/services/common/IdManager;->advertisingInfo:Lio/fabric/sdk/android/services/common/AdvertisingInfo;

    const/4 v0, 0x1

    .line 302
    iput-boolean v0, p0, Lio/fabric/sdk/android/services/common/IdManager;->fetchedAdvertisingInfo:Z

    .line 304
    :cond_0
    iget-object v0, p0, Lio/fabric/sdk/android/services/common/IdManager;->advertisingInfo:Lio/fabric/sdk/android/services/common/AdvertisingInfo;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-object v0

    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method public getAndroidId()Ljava/lang/String;
    .locals 2

    .line 343
    iget-boolean v0, p0, Lio/fabric/sdk/android/services/common/IdManager;->collectHardwareIds:Z

    if-eqz v0, :cond_0

    .line 344
    iget-object v0, p0, Lio/fabric/sdk/android/services/common/IdManager;->appContext:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    move-result-object v0

    const-string v1, "android_id"

    invoke-static {v0, v1}, Landroid/provider/Settings$Secure;->getString(Landroid/content/ContentResolver;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    const-string v1, "9774d56d682e549c"

    .line 347
    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_0

    .line 348
    invoke-direct {p0, v0}, Lio/fabric/sdk/android/services/common/IdManager;->formatId(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return-object v0
.end method

.method public getAppIdentifier()Ljava/lang/String;
    .locals 1

    .line 177
    iget-object v0, p0, Lio/fabric/sdk/android/services/common/IdManager;->appIdentifier:Ljava/lang/String;

    return-object v0
.end method

.method public getAppInstallIdentifier()Ljava/lang/String;
    .locals 3

    .line 159
    iget-object v0, p0, Lio/fabric/sdk/android/services/common/IdManager;->appInstallIdentifier:Ljava/lang/String;

    if-nez v0, :cond_1

    .line 162
    iget-object v0, p0, Lio/fabric/sdk/android/services/common/IdManager;->appContext:Landroid/content/Context;

    invoke-static {v0}, Lio/fabric/sdk/android/services/common/CommonUtils;->getSharedPrefs(Landroid/content/Context;)Landroid/content/SharedPreferences;

    move-result-object v0

    const-string v1, "crashlytics.installation.id"

    const/4 v2, 0x0

    .line 163
    invoke-interface {v0, v1, v2}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    if-nez v1, :cond_0

    .line 166
    invoke-direct {p0, v0}, Lio/fabric/sdk/android/services/common/IdManager;->createInstallationUUID(Landroid/content/SharedPreferences;)Ljava/lang/String;

    move-result-object v0

    goto :goto_0

    :cond_0
    move-object v0, v1

    :cond_1
    :goto_0
    return-object v0
.end method

.method public getDeviceIdentifiers()Ljava/util/Map;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map<",
            "Lio/fabric/sdk/android/services/common/IdManager$DeviceIdentifierType;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .line 273
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    .line 278
    iget-object v1, p0, Lio/fabric/sdk/android/services/common/IdManager;->kits:Ljava/util/Collection;

    invoke-interface {v1}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lio/fabric/sdk/android/Kit;

    .line 279
    instance-of v3, v2, Lio/fabric/sdk/android/services/common/DeviceIdentifierProvider;

    if-eqz v3, :cond_0

    .line 280
    check-cast v2, Lio/fabric/sdk/android/services/common/DeviceIdentifierProvider;

    .line 281
    invoke-interface {v2}, Lio/fabric/sdk/android/services/common/DeviceIdentifierProvider;->getDeviceIdentifiers()Ljava/util/Map;

    move-result-object v2

    .line 283
    invoke-interface {v2}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v2

    invoke-interface {v2}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_0

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/util/Map$Entry;

    .line 284
    invoke-interface {v3}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lio/fabric/sdk/android/services/common/IdManager$DeviceIdentifierType;

    invoke-interface {v3}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/String;

    invoke-direct {p0, v0, v4, v3}, Lio/fabric/sdk/android/services/common/IdManager;->putNonNullIdInto(Ljava/util/Map;Lio/fabric/sdk/android/services/common/IdManager$DeviceIdentifierType;Ljava/lang/String;)V

    goto :goto_0

    .line 289
    :cond_1
    sget-object v1, Lio/fabric/sdk/android/services/common/IdManager$DeviceIdentifierType;->ANDROID_ID:Lio/fabric/sdk/android/services/common/IdManager$DeviceIdentifierType;

    invoke-virtual {p0}, Lio/fabric/sdk/android/services/common/IdManager;->getAndroidId()Ljava/lang/String;

    move-result-object v2

    invoke-direct {p0, v0, v1, v2}, Lio/fabric/sdk/android/services/common/IdManager;->putNonNullIdInto(Ljava/util/Map;Lio/fabric/sdk/android/services/common/IdManager$DeviceIdentifierType;Ljava/lang/String;)V

    .line 290
    sget-object v1, Lio/fabric/sdk/android/services/common/IdManager$DeviceIdentifierType;->ANDROID_ADVERTISING_ID:Lio/fabric/sdk/android/services/common/IdManager$DeviceIdentifierType;

    invoke-virtual {p0}, Lio/fabric/sdk/android/services/common/IdManager;->getAdvertisingId()Ljava/lang/String;

    move-result-object v2

    invoke-direct {p0, v0, v1, v2}, Lio/fabric/sdk/android/services/common/IdManager;->putNonNullIdInto(Ljava/util/Map;Lio/fabric/sdk/android/services/common/IdManager$DeviceIdentifierType;Ljava/lang/String;)V

    .line 292
    invoke-static {v0}, Ljava/util/Collections;->unmodifiableMap(Ljava/util/Map;)Ljava/util/Map;

    move-result-object v0

    return-object v0
.end method

.method public getDeviceUUID()Ljava/lang/String;
    .locals 3

    const-string v0, ""

    .line 225
    iget-boolean v1, p0, Lio/fabric/sdk/android/services/common/IdManager;->collectHardwareIds:Z

    if-eqz v1, :cond_1

    .line 226
    invoke-virtual {p0}, Lio/fabric/sdk/android/services/common/IdManager;->getAndroidId()Ljava/lang/String;

    move-result-object v0

    if-nez v0, :cond_1

    .line 229
    iget-object v0, p0, Lio/fabric/sdk/android/services/common/IdManager;->appContext:Landroid/content/Context;

    invoke-static {v0}, Lio/fabric/sdk/android/services/common/CommonUtils;->getSharedPrefs(Landroid/content/Context;)Landroid/content/SharedPreferences;

    move-result-object v0

    const-string v1, "crashlytics.installation.id"

    const/4 v2, 0x0

    .line 230
    invoke-interface {v0, v1, v2}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    if-nez v1, :cond_0

    .line 233
    invoke-direct {p0, v0}, Lio/fabric/sdk/android/services/common/IdManager;->createInstallationUUID(Landroid/content/SharedPreferences;)Ljava/lang/String;

    move-result-object v0

    goto :goto_0

    :cond_0
    move-object v0, v1

    :cond_1
    :goto_0
    return-object v0
.end method

.method public getInstallerPackageName()Ljava/lang/String;
    .locals 2

    .line 296
    iget-object v0, p0, Lio/fabric/sdk/android/services/common/IdManager;->installerPackageNameProvider:Lio/fabric/sdk/android/services/common/InstallerPackageNameProvider;

    iget-object v1, p0, Lio/fabric/sdk/android/services/common/IdManager;->appContext:Landroid/content/Context;

    invoke-virtual {v0, v1}, Lio/fabric/sdk/android/services/common/InstallerPackageNameProvider;->getInstallerPackageName(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public getModelName()Ljava/lang/String;
    .locals 5

    .line 208
    sget-object v0, Ljava/util/Locale;->US:Ljava/util/Locale;

    const-string v1, "%s/%s"

    const/4 v2, 0x2

    new-array v2, v2, [Ljava/lang/Object;

    sget-object v3, Landroid/os/Build;->MANUFACTURER:Ljava/lang/String;

    invoke-direct {p0, v3}, Lio/fabric/sdk/android/services/common/IdManager;->removeForwardSlashesIn(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    sget-object v3, Landroid/os/Build;->MODEL:Ljava/lang/String;

    .line 209
    invoke-direct {p0, v3}, Lio/fabric/sdk/android/services/common/IdManager;->removeForwardSlashesIn(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x1

    aput-object v3, v2, v4

    .line 208
    invoke-static {v0, v1, v2}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public getOsBuildVersionString()Ljava/lang/String;
    .locals 1

    .line 201
    sget-object v0, Landroid/os/Build$VERSION;->INCREMENTAL:Ljava/lang/String;

    invoke-direct {p0, v0}, Lio/fabric/sdk/android/services/common/IdManager;->removeForwardSlashesIn(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public getOsDisplayVersionString()Ljava/lang/String;
    .locals 1

    .line 193
    sget-object v0, Landroid/os/Build$VERSION;->RELEASE:Ljava/lang/String;

    invoke-direct {p0, v0}, Lio/fabric/sdk/android/services/common/IdManager;->removeForwardSlashesIn(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public getOsVersionString()Ljava/lang/String;
    .locals 2

    .line 185
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p0}, Lio/fabric/sdk/android/services/common/IdManager;->getOsDisplayVersionString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "/"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Lio/fabric/sdk/android/services/common/IdManager;->getOsBuildVersionString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public isLimitAdTrackingEnabled()Ljava/lang/Boolean;
    .locals 1

    .line 310
    iget-boolean v0, p0, Lio/fabric/sdk/android/services/common/IdManager;->collectHardwareIds:Z

    if-eqz v0, :cond_0

    .line 311
    invoke-virtual {p0}, Lio/fabric/sdk/android/services/common/IdManager;->getAdvertisingInfo()Lio/fabric/sdk/android/services/common/AdvertisingInfo;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 313
    iget-boolean v0, v0, Lio/fabric/sdk/android/services/common/AdvertisingInfo;->limitAdTrackingEnabled:Z

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return-object v0
.end method
