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
.field private static final BAD_ANDROID_ID:Ljava/lang/String; = "9774d56d682e549c"

.field public static final COLLECT_DEVICE_IDENTIFIERS:Ljava/lang/String; = "com.crashlytics.CollectDeviceIdentifiers"

.field public static final COLLECT_USER_IDENTIFIERS:Ljava/lang/String; = "com.crashlytics.CollectUserIdentifiers"

.field public static final DEFAULT_VERSION_NAME:Ljava/lang/String; = "0.0"

.field private static final FORWARD_SLASH_REGEX:Ljava/lang/String;

.field private static final ID_PATTERN:Ljava/util/regex/Pattern;

.field static final PREFKEY_ADVERTISING_ID:Ljava/lang/String; = "crashlytics.advertising.id"

.field private static final PREFKEY_INSTALLATION_UUID:Ljava/lang/String; = "crashlytics.installation.id"


# instance fields
.field advertisingInfo:Lio/fabric/sdk/android/services/common/AdvertisingInfo;

.field advertisingInfoProvider:Lio/fabric/sdk/android/services/common/AdvertisingInfoProvider;

.field private final appContext:Landroid/content/Context;

.field private final appIdentifier:Ljava/lang/String;

.field private final appInstallIdentifier:Ljava/lang/String;

.field private final collectHardwareIds:Z

.field private final collectUserIds:Z

.field fetchedAdvertisingInfo:Z

.field firebaseInfo:Lio/fabric/sdk/android/services/common/FirebaseInfo;

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

    .line 46
    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    move-result-object v0

    sput-object v0, Lio/fabric/sdk/android/services/common/IdManager;->ID_PATTERN:Ljava/util/regex/Pattern;

    const-string v0, "/"

    .line 51
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

    .line 98
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 72
    new-instance v0, Ljava/util/concurrent/locks/ReentrantLock;

    invoke-direct {v0}, Ljava/util/concurrent/locks/ReentrantLock;-><init>()V

    iput-object v0, p0, Lio/fabric/sdk/android/services/common/IdManager;->installationIdLock:Ljava/util/concurrent/locks/ReentrantLock;

    if-eqz p1, :cond_4

    if-eqz p2, :cond_3

    if-eqz p4, :cond_2

    .line 108
    iput-object p1, p0, Lio/fabric/sdk/android/services/common/IdManager;->appContext:Landroid/content/Context;

    .line 109
    iput-object p2, p0, Lio/fabric/sdk/android/services/common/IdManager;->appIdentifier:Ljava/lang/String;

    .line 110
    iput-object p3, p0, Lio/fabric/sdk/android/services/common/IdManager;->appInstallIdentifier:Ljava/lang/String;

    .line 111
    iput-object p4, p0, Lio/fabric/sdk/android/services/common/IdManager;->kits:Ljava/util/Collection;

    .line 113
    new-instance p2, Lio/fabric/sdk/android/services/common/InstallerPackageNameProvider;

    invoke-direct {p2}, Lio/fabric/sdk/android/services/common/InstallerPackageNameProvider;-><init>()V

    iput-object p2, p0, Lio/fabric/sdk/android/services/common/IdManager;->installerPackageNameProvider:Lio/fabric/sdk/android/services/common/InstallerPackageNameProvider;

    .line 114
    new-instance p2, Lio/fabric/sdk/android/services/common/AdvertisingInfoProvider;

    invoke-direct {p2, p1}, Lio/fabric/sdk/android/services/common/AdvertisingInfoProvider;-><init>(Landroid/content/Context;)V

    iput-object p2, p0, Lio/fabric/sdk/android/services/common/IdManager;->advertisingInfoProvider:Lio/fabric/sdk/android/services/common/AdvertisingInfoProvider;

    .line 115
    new-instance p2, Lio/fabric/sdk/android/services/common/FirebaseInfo;

    invoke-direct {p2}, Lio/fabric/sdk/android/services/common/FirebaseInfo;-><init>()V

    iput-object p2, p0, Lio/fabric/sdk/android/services/common/IdManager;->firebaseInfo:Lio/fabric/sdk/android/services/common/FirebaseInfo;

    const-string p2, "com.crashlytics.CollectDeviceIdentifiers"

    const/4 p3, 0x1

    .line 117
    invoke-static {p1, p2, p3}, Lio/fabric/sdk/android/services/common/CommonUtils;->getBooleanResourceValue(Landroid/content/Context;Ljava/lang/String;Z)Z

    move-result p2

    iput-boolean p2, p0, Lio/fabric/sdk/android/services/common/IdManager;->collectHardwareIds:Z

    .line 120
    iget-boolean p2, p0, Lio/fabric/sdk/android/services/common/IdManager;->collectHardwareIds:Z

    if-nez p2, :cond_0

    .line 121
    invoke-static {}, Lio/fabric/sdk/android/Fabric;->getLogger()Lio/fabric/sdk/android/Logger;

    move-result-object p2

    const-string p4, "Fabric"

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Device ID collection disabled for "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 122
    invoke-virtual {p1}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 121
    invoke-interface {p2, p4, v0}, Lio/fabric/sdk/android/Logger;->d(Ljava/lang/String;Ljava/lang/String;)V

    :cond_0
    const-string p2, "com.crashlytics.CollectUserIdentifiers"

    .line 125
    invoke-static {p1, p2, p3}, Lio/fabric/sdk/android/services/common/CommonUtils;->getBooleanResourceValue(Landroid/content/Context;Ljava/lang/String;Z)Z

    move-result p2

    iput-boolean p2, p0, Lio/fabric/sdk/android/services/common/IdManager;->collectUserIds:Z

    .line 127
    iget-boolean p2, p0, Lio/fabric/sdk/android/services/common/IdManager;->collectUserIds:Z

    if-nez p2, :cond_1

    .line 128
    invoke-static {}, Lio/fabric/sdk/android/Fabric;->getLogger()Lio/fabric/sdk/android/Logger;

    move-result-object p2

    const-string p3, "Fabric"

    new-instance p4, Ljava/lang/StringBuilder;

    invoke-direct {p4}, Ljava/lang/StringBuilder;-><init>()V

    const-string v0, "User information collection disabled for "

    invoke-virtual {p4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 129
    invoke-virtual {p1}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p4, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    .line 128
    invoke-interface {p2, p3, p1}, Lio/fabric/sdk/android/Logger;->d(Ljava/lang/String;Ljava/lang/String;)V

    :cond_1
    return-void

    .line 106
    :cond_2
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "kits must not be null"

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 103
    :cond_3
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "appIdentifier must not be null"

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 100
    :cond_4
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "appContext must not be null"

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method private checkAdvertisingIdRotation(Landroid/content/SharedPreferences;)V
    .locals 1

    .line 245
    invoke-virtual {p0}, Lio/fabric/sdk/android/services/common/IdManager;->getAdvertisingInfo()Lio/fabric/sdk/android/services/common/AdvertisingInfo;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 247
    iget-object v0, v0, Lio/fabric/sdk/android/services/common/AdvertisingInfo;->advertisingId:Ljava/lang/String;

    invoke-direct {p0, p1, v0}, Lio/fabric/sdk/android/services/common/IdManager;->flushInstallationIdIfNecessary(Landroid/content/SharedPreferences;Ljava/lang/String;)V

    :cond_0
    return-void
.end method

.method private createInstallationUUID(Landroid/content/SharedPreferences;)Ljava/lang/String;
    .locals 2
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "CommitPrefEdits"
        }
    .end annotation

    .line 229
    iget-object v0, p0, Lio/fabric/sdk/android/services/common/IdManager;->installationIdLock:Ljava/util/concurrent/locks/ReentrantLock;

    invoke-virtual {v0}, Ljava/util/concurrent/locks/ReentrantLock;->lock()V

    :try_start_0
    const-string v0, "crashlytics.installation.id"

    const/4 v1, 0x0

    .line 231
    invoke-interface {p1, v0, v1}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    if-nez v0, :cond_0

    .line 234
    invoke-static {}, Ljava/util/UUID;->randomUUID()Ljava/util/UUID;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/UUID;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, v0}, Lio/fabric/sdk/android/services/common/IdManager;->formatId(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 235
    invoke-interface {p1}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object p1

    const-string v1, "crashlytics.installation.id"

    invoke-interface {p1, v1, v0}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    move-result-object p1

    invoke-interface {p1}, Landroid/content/SharedPreferences$Editor;->commit()Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 240
    :cond_0
    iget-object p1, p0, Lio/fabric/sdk/android/services/common/IdManager;->installationIdLock:Ljava/util/concurrent/locks/ReentrantLock;

    invoke-virtual {p1}, Ljava/util/concurrent/locks/ReentrantLock;->unlock()V

    return-object v0

    :catchall_0
    move-exception p1

    iget-object v0, p0, Lio/fabric/sdk/android/services/common/IdManager;->installationIdLock:Ljava/util/concurrent/locks/ReentrantLock;

    invoke-virtual {v0}, Ljava/util/concurrent/locks/ReentrantLock;->unlock()V

    .line 241
    throw p1
.end method

.method private explicitCheckLimitAdTracking()Ljava/lang/Boolean;
    .locals 1

    .line 400
    invoke-virtual {p0}, Lio/fabric/sdk/android/services/common/IdManager;->getAdvertisingInfo()Lio/fabric/sdk/android/services/common/AdvertisingInfo;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 402
    iget-boolean v0, v0, Lio/fabric/sdk/android/services/common/AdvertisingInfo;->limitAdTrackingEnabled:Z

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    return-object v0

    :cond_0
    const/4 v0, 0x0

    return-object v0
.end method

.method private flushInstallationIdIfNecessary(Landroid/content/SharedPreferences;Ljava/lang/String;)V
    .locals 2
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "CommitPrefEdits"
        }
    .end annotation

    .line 253
    iget-object v0, p0, Lio/fabric/sdk/android/services/common/IdManager;->installationIdLock:Ljava/util/concurrent/locks/ReentrantLock;

    invoke-virtual {v0}, Ljava/util/concurrent/locks/ReentrantLock;->lock()V

    .line 255
    :try_start_0
    invoke-static {p2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz v0, :cond_0

    .line 278
    iget-object p1, p0, Lio/fabric/sdk/android/services/common/IdManager;->installationIdLock:Ljava/util/concurrent/locks/ReentrantLock;

    invoke-virtual {p1}, Ljava/util/concurrent/locks/ReentrantLock;->unlock()V

    return-void

    :cond_0
    :try_start_1
    const-string v0, "crashlytics.advertising.id"

    const/4 v1, 0x0

    .line 259
    invoke-interface {p1, v0, v1}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 263
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v1

    if-eqz v1, :cond_1

    .line 264
    invoke-interface {p1}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object p1

    const-string v0, "crashlytics.advertising.id"

    .line 266
    invoke-interface {p1, v0, p2}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    move-result-object p1

    .line 267
    invoke-interface {p1}, Landroid/content/SharedPreferences$Editor;->commit()Z

    goto :goto_0

    .line 268
    :cond_1
    invoke-virtual {v0, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_2

    .line 270
    invoke-interface {p1}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object p1

    const-string v0, "crashlytics.installation.id"

    .line 272
    invoke-interface {p1, v0}, Landroid/content/SharedPreferences$Editor;->remove(Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    move-result-object p1

    const-string v0, "crashlytics.advertising.id"

    .line 274
    invoke-interface {p1, v0, p2}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    move-result-object p1

    .line 275
    invoke-interface {p1}, Landroid/content/SharedPreferences$Editor;->commit()Z
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 278
    :cond_2
    :goto_0
    iget-object p1, p0, Lio/fabric/sdk/android/services/common/IdManager;->installationIdLock:Ljava/util/concurrent/locks/ReentrantLock;

    invoke-virtual {p1}, Ljava/util/concurrent/locks/ReentrantLock;->unlock()V

    return-void

    :catchall_0
    move-exception p1

    iget-object p2, p0, Lio/fabric/sdk/android/services/common/IdManager;->installationIdLock:Ljava/util/concurrent/locks/ReentrantLock;

    invoke-virtual {p2}, Ljava/util/concurrent/locks/ReentrantLock;->unlock()V

    .line 279
    throw p1
.end method

.method private formatId(Ljava/lang/String;)Ljava/lang/String;
    .locals 1

    if-nez p1, :cond_0

    const/4 p1, 0x0

    goto :goto_0

    .line 150
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

    .line 338
    invoke-interface {p1, p2, p3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_0
    return-void
.end method

.method private removeForwardSlashesIn(Ljava/lang/String;)Ljava/lang/String;
    .locals 2

    .line 219
    sget-object v0, Lio/fabric/sdk/android/services/common/IdManager;->FORWARD_SLASH_REGEX:Ljava/lang/String;

    const-string v1, ""

    invoke-virtual {p1, v0, v1}, Ljava/lang/String;->replaceAll(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method


# virtual methods
.method public canCollectUserIds()Z
    .locals 1

    .line 142
    iget-boolean v0, p0, Lio/fabric/sdk/android/services/common/IdManager;->collectUserIds:Z

    return v0
.end method

.method public createIdHeaderValue(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    .locals 0
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    const-string p1, ""

    return-object p1
.end method

.method public getAdvertisingId()Ljava/lang/String;
    .locals 1
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    const/4 v0, 0x0

    return-object v0
.end method

.method declared-synchronized getAdvertisingInfo()Lio/fabric/sdk/android/services/common/AdvertisingInfo;
    .locals 1

    monitor-enter p0

    .line 392
    :try_start_0
    iget-boolean v0, p0, Lio/fabric/sdk/android/services/common/IdManager;->fetchedAdvertisingInfo:Z

    if-nez v0, :cond_0

    .line 393
    iget-object v0, p0, Lio/fabric/sdk/android/services/common/IdManager;->advertisingInfoProvider:Lio/fabric/sdk/android/services/common/AdvertisingInfoProvider;

    invoke-virtual {v0}, Lio/fabric/sdk/android/services/common/AdvertisingInfoProvider;->getAdvertisingInfo()Lio/fabric/sdk/android/services/common/AdvertisingInfo;

    move-result-object v0

    iput-object v0, p0, Lio/fabric/sdk/android/services/common/IdManager;->advertisingInfo:Lio/fabric/sdk/android/services/common/AdvertisingInfo;

    const/4 v0, 0x1

    .line 394
    iput-boolean v0, p0, Lio/fabric/sdk/android/services/common/IdManager;->fetchedAdvertisingInfo:Z

    .line 396
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
    .locals 1
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    const/4 v0, 0x0

    return-object v0
.end method

.method public getAppIdentifier()Ljava/lang/String;
    .locals 1

    .line 183
    iget-object v0, p0, Lio/fabric/sdk/android/services/common/IdManager;->appIdentifier:Ljava/lang/String;

    return-object v0
.end method

.method public getAppInstallIdentifier()Ljava/lang/String;
    .locals 3

    .line 162
    iget-object v0, p0, Lio/fabric/sdk/android/services/common/IdManager;->appInstallIdentifier:Ljava/lang/String;

    if-nez v0, :cond_1

    .line 165
    iget-object v0, p0, Lio/fabric/sdk/android/services/common/IdManager;->appContext:Landroid/content/Context;

    invoke-static {v0}, Lio/fabric/sdk/android/services/common/CommonUtils;->getSharedPrefs(Landroid/content/Context;)Landroid/content/SharedPreferences;

    move-result-object v0

    .line 167
    invoke-direct {p0, v0}, Lio/fabric/sdk/android/services/common/IdManager;->checkAdvertisingIdRotation(Landroid/content/SharedPreferences;)V

    const-string v1, "crashlytics.installation.id"

    const/4 v2, 0x0

    .line 169
    invoke-interface {v0, v1, v2}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    if-nez v1, :cond_0

    .line 172
    invoke-direct {p0, v0}, Lio/fabric/sdk/android/services/common/IdManager;->createInstallationUUID(Landroid/content/SharedPreferences;)Ljava/lang/String;

    move-result-object v0

    goto :goto_0

    :cond_0
    move-object v0, v1

    :cond_1
    :goto_0
    return-object v0
.end method

.method public getBluetoothMacAddress()Ljava/lang/String;
    .locals 1
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    const/4 v0, 0x0

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

    .line 293
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    .line 298
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

    .line 299
    instance-of v3, v2, Lio/fabric/sdk/android/services/common/DeviceIdentifierProvider;

    if-eqz v3, :cond_0

    .line 300
    check-cast v2, Lio/fabric/sdk/android/services/common/DeviceIdentifierProvider;

    .line 301
    invoke-interface {v2}, Lio/fabric/sdk/android/services/common/DeviceIdentifierProvider;->getDeviceIdentifiers()Ljava/util/Map;

    move-result-object v2

    .line 303
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

    .line 304
    invoke-interface {v3}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lio/fabric/sdk/android/services/common/IdManager$DeviceIdentifierType;

    invoke-interface {v3}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/String;

    invoke-direct {p0, v0, v4, v3}, Lio/fabric/sdk/android/services/common/IdManager;->putNonNullIdInto(Ljava/util/Map;Lio/fabric/sdk/android/services/common/IdManager$DeviceIdentifierType;Ljava/lang/String;)V

    goto :goto_0

    .line 309
    :cond_1
    invoke-static {v0}, Ljava/util/Collections;->unmodifiableMap(Ljava/util/Map;)Ljava/util/Map;

    move-result-object v0

    return-object v0
.end method

.method public getInstallerPackageName()Ljava/lang/String;
    .locals 2

    .line 313
    iget-object v0, p0, Lio/fabric/sdk/android/services/common/IdManager;->installerPackageNameProvider:Lio/fabric/sdk/android/services/common/InstallerPackageNameProvider;

    iget-object v1, p0, Lio/fabric/sdk/android/services/common/IdManager;->appContext:Landroid/content/Context;

    invoke-virtual {v0, v1}, Lio/fabric/sdk/android/services/common/InstallerPackageNameProvider;->getInstallerPackageName(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public getModelName()Ljava/lang/String;
    .locals 5

    .line 214
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

    .line 215
    invoke-direct {p0, v3}, Lio/fabric/sdk/android/services/common/IdManager;->removeForwardSlashesIn(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x1

    aput-object v3, v2, v4

    .line 214
    invoke-static {v0, v1, v2}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public getOsBuildVersionString()Ljava/lang/String;
    .locals 1

    .line 207
    sget-object v0, Landroid/os/Build$VERSION;->INCREMENTAL:Ljava/lang/String;

    invoke-direct {p0, v0}, Lio/fabric/sdk/android/services/common/IdManager;->removeForwardSlashesIn(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public getOsDisplayVersionString()Ljava/lang/String;
    .locals 1

    .line 199
    sget-object v0, Landroid/os/Build$VERSION;->RELEASE:Ljava/lang/String;

    invoke-direct {p0, v0}, Lio/fabric/sdk/android/services/common/IdManager;->removeForwardSlashesIn(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public getOsVersionString()Ljava/lang/String;
    .locals 2

    .line 191
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

.method public getSerialNumber()Ljava/lang/String;
    .locals 1
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    const/4 v0, 0x0

    return-object v0
.end method

.method public getTelephonyId()Ljava/lang/String;
    .locals 1
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    const/4 v0, 0x0

    return-object v0
.end method

.method public getWifiMacAddress()Ljava/lang/String;
    .locals 1
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    const/4 v0, 0x0

    return-object v0
.end method

.method public isLimitAdTrackingEnabled()Ljava/lang/Boolean;
    .locals 1

    .line 319
    invoke-virtual {p0}, Lio/fabric/sdk/android/services/common/IdManager;->shouldCollectHardwareIds()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 320
    invoke-direct {p0}, Lio/fabric/sdk/android/services/common/IdManager;->explicitCheckLimitAdTracking()Ljava/lang/Boolean;

    move-result-object v0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return-object v0
.end method

.method protected shouldCollectHardwareIds()Z
    .locals 2

    .line 388
    iget-boolean v0, p0, Lio/fabric/sdk/android/services/common/IdManager;->collectHardwareIds:Z

    if-eqz v0, :cond_0

    iget-object v0, p0, Lio/fabric/sdk/android/services/common/IdManager;->firebaseInfo:Lio/fabric/sdk/android/services/common/FirebaseInfo;

    iget-object v1, p0, Lio/fabric/sdk/android/services/common/IdManager;->appContext:Landroid/content/Context;

    invoke-virtual {v0, v1}, Lio/fabric/sdk/android/services/common/FirebaseInfo;->isFirebaseCrashlyticsEnabled(Landroid/content/Context;)Z

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method
