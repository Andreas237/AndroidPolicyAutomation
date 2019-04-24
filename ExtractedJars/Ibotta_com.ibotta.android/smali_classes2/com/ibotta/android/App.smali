.class public Lcom/ibotta/android/App;
.super Landroid/support/multidex/MultiDexApplication;
.source "App.java"


# static fields
.field private static DEBUG:Z

.field private static instance:Lcom/ibotta/android/App;


# instance fields
.field private defaultHandler:Ljava/lang/Thread$UncaughtExceptionHandler;

.field private handler:Landroid/os/Handler;

.field private ibottaUncaughtHandler:Ljava/lang/Thread$UncaughtExceptionHandler;

.field protected mainComponent:Lcom/ibotta/android/di/MainComponent;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 78
    invoke-direct {p0}, Landroid/support/multidex/MultiDexApplication;-><init>()V

    .line 88
    new-instance v0, Lcom/ibotta/android/App$1;

    invoke-direct {v0, p0}, Lcom/ibotta/android/App$1;-><init>(Lcom/ibotta/android/App;)V

    iput-object v0, p0, Lcom/ibotta/android/App;->ibottaUncaughtHandler:Ljava/lang/Thread$UncaughtExceptionHandler;

    return-void
.end method

.method static synthetic access$000(Lcom/ibotta/android/App;)Ljava/lang/Thread$UncaughtExceptionHandler;
    .locals 0

    .line 78
    iget-object p0, p0, Lcom/ibotta/android/App;->defaultHandler:Ljava/lang/Thread$UncaughtExceptionHandler;

    return-object p0
.end method

.method private createCrashManagerKeys()Lcom/ibotta/android/crash/CrashKeys;
    .locals 10

    .line 276
    new-instance v0, Lcom/ibotta/android/security/crypto/key/AppKeyProvider;

    sget-object v1, Lcom/ibotta/android/security/crypto/key/AppKeyProvider$KeyType;->HOCKEY_APP_ALPHA_KEY:Lcom/ibotta/android/security/crypto/key/AppKeyProvider$KeyType;

    invoke-direct {v0, v1}, Lcom/ibotta/android/security/crypto/key/AppKeyProvider;-><init>(Lcom/ibotta/android/security/crypto/key/AppKeyProvider$KeyType;)V

    invoke-virtual {v0}, Lcom/ibotta/android/security/crypto/key/AppKeyProvider;->getKeyString()Ljava/lang/String;

    move-result-object v0

    .line 277
    new-instance v1, Lcom/ibotta/android/security/crypto/key/AppKeyProvider;

    sget-object v2, Lcom/ibotta/android/security/crypto/key/AppKeyProvider$KeyType;->HOCKEY_APP_BETA_KEY:Lcom/ibotta/android/security/crypto/key/AppKeyProvider$KeyType;

    invoke-direct {v1, v2}, Lcom/ibotta/android/security/crypto/key/AppKeyProvider;-><init>(Lcom/ibotta/android/security/crypto/key/AppKeyProvider$KeyType;)V

    invoke-virtual {v1}, Lcom/ibotta/android/security/crypto/key/AppKeyProvider;->getKeyString()Ljava/lang/String;

    move-result-object v1

    .line 278
    new-instance v2, Lcom/ibotta/android/security/crypto/key/AppKeyProvider;

    sget-object v3, Lcom/ibotta/android/security/crypto/key/AppKeyProvider$KeyType;->HOCKEY_APP_BETA_EXT_KEY:Lcom/ibotta/android/security/crypto/key/AppKeyProvider$KeyType;

    invoke-direct {v2, v3}, Lcom/ibotta/android/security/crypto/key/AppKeyProvider;-><init>(Lcom/ibotta/android/security/crypto/key/AppKeyProvider$KeyType;)V

    invoke-virtual {v2}, Lcom/ibotta/android/security/crypto/key/AppKeyProvider;->getKeyString()Ljava/lang/String;

    move-result-object v2

    .line 279
    new-instance v3, Lcom/ibotta/android/security/crypto/key/AppKeyProvider;

    sget-object v4, Lcom/ibotta/android/security/crypto/key/AppKeyProvider$KeyType;->HOCKEY_APP_QA_KEY:Lcom/ibotta/android/security/crypto/key/AppKeyProvider$KeyType;

    invoke-direct {v3, v4}, Lcom/ibotta/android/security/crypto/key/AppKeyProvider;-><init>(Lcom/ibotta/android/security/crypto/key/AppKeyProvider$KeyType;)V

    invoke-virtual {v3}, Lcom/ibotta/android/security/crypto/key/AppKeyProvider;->getKeyString()Ljava/lang/String;

    move-result-object v3

    .line 280
    new-instance v4, Lcom/ibotta/android/security/crypto/key/AppKeyProvider;

    sget-object v5, Lcom/ibotta/android/security/crypto/key/AppKeyProvider$KeyType;->HOCKEY_APP_RELEASE_KEY:Lcom/ibotta/android/security/crypto/key/AppKeyProvider$KeyType;

    invoke-direct {v4, v5}, Lcom/ibotta/android/security/crypto/key/AppKeyProvider;-><init>(Lcom/ibotta/android/security/crypto/key/AppKeyProvider$KeyType;)V

    invoke-virtual {v4}, Lcom/ibotta/android/security/crypto/key/AppKeyProvider;->getKeyString()Ljava/lang/String;

    move-result-object v4

    .line 281
    new-instance v5, Lcom/ibotta/android/security/crypto/key/AppKeyProvider;

    sget-object v6, Lcom/ibotta/android/security/crypto/key/AppKeyProvider$KeyType;->NEW_RELIC_APP_TOKEN:Lcom/ibotta/android/security/crypto/key/AppKeyProvider$KeyType;

    invoke-direct {v5, v6}, Lcom/ibotta/android/security/crypto/key/AppKeyProvider;-><init>(Lcom/ibotta/android/security/crypto/key/AppKeyProvider$KeyType;)V

    invoke-virtual {v5}, Lcom/ibotta/android/security/crypto/key/AppKeyProvider;->getKeyString()Ljava/lang/String;

    move-result-object v5

    .line 282
    new-instance v6, Lcom/ibotta/android/security/crypto/key/AppKeyProvider;

    sget-object v7, Lcom/ibotta/android/security/crypto/key/AppKeyProvider$KeyType;->TWITTER_KEY:Lcom/ibotta/android/security/crypto/key/AppKeyProvider$KeyType;

    invoke-direct {v6, v7}, Lcom/ibotta/android/security/crypto/key/AppKeyProvider;-><init>(Lcom/ibotta/android/security/crypto/key/AppKeyProvider$KeyType;)V

    invoke-virtual {v6}, Lcom/ibotta/android/security/crypto/key/AppKeyProvider;->getKeyString()Ljava/lang/String;

    move-result-object v6

    .line 283
    new-instance v7, Lcom/ibotta/android/security/crypto/key/AppKeyProvider;

    sget-object v8, Lcom/ibotta/android/security/crypto/key/AppKeyProvider$KeyType;->TWITTER_SECRET:Lcom/ibotta/android/security/crypto/key/AppKeyProvider$KeyType;

    invoke-direct {v7, v8}, Lcom/ibotta/android/security/crypto/key/AppKeyProvider;-><init>(Lcom/ibotta/android/security/crypto/key/AppKeyProvider$KeyType;)V

    invoke-virtual {v7}, Lcom/ibotta/android/security/crypto/key/AppKeyProvider;->getKeyString()Ljava/lang/String;

    move-result-object v7

    .line 284
    sget-object v8, Lcom/ibotta/android/crash/CrashKeys;->Companion:Lcom/ibotta/android/crash/CrashKeys$Companion;

    invoke-virtual {v8}, Lcom/ibotta/android/crash/CrashKeys$Companion;->builder()Lcom/ibotta/android/crash/CrashKeys$Builder;

    move-result-object v8

    sget-object v9, Lcom/ibotta/android/crash/CrashKeyType;->NEW_RELIC_APP_TOKEN:Lcom/ibotta/android/crash/CrashKeyType;

    .line 285
    invoke-virtual {v8, v9, v5}, Lcom/ibotta/android/crash/CrashKeys$Builder;->key(Lcom/ibotta/android/crash/CrashKeyType;Ljava/lang/String;)Lcom/ibotta/android/crash/CrashKeys$Builder;

    move-result-object v5

    sget-object v8, Lcom/ibotta/android/crash/CrashKeyType;->TWITTER_KEY:Lcom/ibotta/android/crash/CrashKeyType;

    .line 286
    invoke-virtual {v5, v8, v6}, Lcom/ibotta/android/crash/CrashKeys$Builder;->key(Lcom/ibotta/android/crash/CrashKeyType;Ljava/lang/String;)Lcom/ibotta/android/crash/CrashKeys$Builder;

    move-result-object v5

    sget-object v6, Lcom/ibotta/android/crash/CrashKeyType;->TWITTER_SECRET:Lcom/ibotta/android/crash/CrashKeyType;

    .line 287
    invoke-virtual {v5, v6, v7}, Lcom/ibotta/android/crash/CrashKeys$Builder;->key(Lcom/ibotta/android/crash/CrashKeyType;Ljava/lang/String;)Lcom/ibotta/android/crash/CrashKeys$Builder;

    move-result-object v5

    sget-object v6, Lcom/ibotta/android/crash/CrashKeyType;->HOCKEY_APP_ALPHA_KEY:Lcom/ibotta/android/crash/CrashKeyType;

    .line 288
    invoke-virtual {v5, v6, v0}, Lcom/ibotta/android/crash/CrashKeys$Builder;->key(Lcom/ibotta/android/crash/CrashKeyType;Ljava/lang/String;)Lcom/ibotta/android/crash/CrashKeys$Builder;

    move-result-object v0

    sget-object v5, Lcom/ibotta/android/crash/CrashKeyType;->HOCKEY_APP_BETA_KEY:Lcom/ibotta/android/crash/CrashKeyType;

    .line 289
    invoke-virtual {v0, v5, v1}, Lcom/ibotta/android/crash/CrashKeys$Builder;->key(Lcom/ibotta/android/crash/CrashKeyType;Ljava/lang/String;)Lcom/ibotta/android/crash/CrashKeys$Builder;

    move-result-object v0

    sget-object v1, Lcom/ibotta/android/crash/CrashKeyType;->HOCKEY_APP_BETA_EXT_KEY:Lcom/ibotta/android/crash/CrashKeyType;

    .line 290
    invoke-virtual {v0, v1, v2}, Lcom/ibotta/android/crash/CrashKeys$Builder;->key(Lcom/ibotta/android/crash/CrashKeyType;Ljava/lang/String;)Lcom/ibotta/android/crash/CrashKeys$Builder;

    move-result-object v0

    sget-object v1, Lcom/ibotta/android/crash/CrashKeyType;->HOCKEY_APP_QA_KEY:Lcom/ibotta/android/crash/CrashKeyType;

    .line 291
    invoke-virtual {v0, v1, v3}, Lcom/ibotta/android/crash/CrashKeys$Builder;->key(Lcom/ibotta/android/crash/CrashKeyType;Ljava/lang/String;)Lcom/ibotta/android/crash/CrashKeys$Builder;

    move-result-object v0

    sget-object v1, Lcom/ibotta/android/crash/CrashKeyType;->HOCKEY_APP_RELEASE_KEY:Lcom/ibotta/android/crash/CrashKeyType;

    .line 292
    invoke-virtual {v0, v1, v4}, Lcom/ibotta/android/crash/CrashKeys$Builder;->key(Lcom/ibotta/android/crash/CrashKeyType;Ljava/lang/String;)Lcom/ibotta/android/crash/CrashKeys$Builder;

    move-result-object v0

    .line 293
    invoke-virtual {v0}, Lcom/ibotta/android/crash/CrashKeys$Builder;->build()Lcom/ibotta/android/crash/CrashKeys;

    move-result-object v0

    return-object v0
.end method

.method private createCrashlyticsCrashManager(Lcom/ibotta/android/crash/CrashKeys;)Lcom/ibotta/android/crash/CrashlyticsCrashManager;
    .locals 2

    .line 315
    invoke-direct {p0}, Lcom/ibotta/android/App;->getAllBuildTypes()Ljava/util/Set;

    move-result-object v0

    .line 316
    sget-object v1, Lcom/ibotta/android/profile/BuildType;->IDE:Lcom/ibotta/android/profile/BuildType;

    invoke-interface {v0, v1}, Ljava/util/Set;->remove(Ljava/lang/Object;)Z

    .line 318
    new-instance v1, Lcom/ibotta/android/crash/CrashlyticsCrashManager;

    invoke-static {v0}, Ljava/util/Collections;->unmodifiableSet(Ljava/util/Set;)Ljava/util/Set;

    move-result-object v0

    invoke-direct {v1, p1, v0}, Lcom/ibotta/android/crash/CrashlyticsCrashManager;-><init>(Lcom/ibotta/android/crash/CrashKeys;Ljava/util/Set;)V

    return-object v1
.end method

.method private createHockeyAppCrashManager(Lcom/ibotta/android/crash/CrashKeys;)Lcom/ibotta/android/crash/HockeyAppCrashManager;
    .locals 2

    .line 301
    invoke-direct {p0}, Lcom/ibotta/android/App;->getAllBuildTypes()Ljava/util/Set;

    move-result-object v0

    .line 302
    sget-object v1, Lcom/ibotta/android/profile/BuildType;->IDE:Lcom/ibotta/android/profile/BuildType;

    invoke-interface {v0, v1}, Ljava/util/Set;->remove(Ljava/lang/Object;)Z

    .line 304
    new-instance v1, Lcom/ibotta/android/crash/HockeyAppCrashManager;

    invoke-static {v0}, Ljava/util/Collections;->unmodifiableSet(Ljava/util/Set;)Ljava/util/Set;

    move-result-object v0

    invoke-direct {v1, p1, v0}, Lcom/ibotta/android/crash/HockeyAppCrashManager;-><init>(Lcom/ibotta/android/crash/CrashKeys;Ljava/util/Set;)V

    return-object v1
.end method

.method private createNewRelicCrashManager(Lcom/ibotta/android/crash/CrashKeys;)Lcom/ibotta/android/crash/NewRelicCrashManager;
    .locals 2

    .line 308
    invoke-direct {p0}, Lcom/ibotta/android/App;->getAllBuildTypes()Ljava/util/Set;

    move-result-object v0

    .line 309
    sget-object v1, Lcom/ibotta/android/profile/BuildType;->IDE:Lcom/ibotta/android/profile/BuildType;

    invoke-interface {v0, v1}, Ljava/util/Set;->remove(Ljava/lang/Object;)Z

    .line 311
    new-instance v1, Lcom/ibotta/android/crash/NewRelicCrashManager;

    invoke-direct {v1, p1, v0}, Lcom/ibotta/android/crash/NewRelicCrashManager;-><init>(Lcom/ibotta/android/crash/CrashKeys;Ljava/util/Set;)V

    return-object v1
.end method

.method private getAllBuildTypes()Ljava/util/Set;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Set<",
            "Lcom/ibotta/android/profile/BuildType;",
            ">;"
        }
    .end annotation

    .line 297
    new-instance v0, Ljava/util/HashSet;

    invoke-static {}, Lcom/ibotta/android/profile/BuildType;->values()[Lcom/ibotta/android/profile/BuildType;

    move-result-object v1

    invoke-static {v1}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/util/HashSet;-><init>(Ljava/util/Collection;)V

    return-object v0
.end method

.method public static getApiUrl(Z)Ljava/lang/String;
    .locals 3

    .line 115
    invoke-static {}, Lcom/ibotta/android/App;->instance()Lcom/ibotta/android/App;

    move-result-object v0

    iget-object v0, v0, Lcom/ibotta/android/App;->mainComponent:Lcom/ibotta/android/di/MainComponent;

    invoke-interface {v0}, Lcom/ibotta/android/di/MainComponent;->getBuildProfile()Lcom/ibotta/android/profile/BuildProfile;

    move-result-object v0

    invoke-interface {v0}, Lcom/ibotta/android/profile/BuildProfile;->getApiUrl()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x1

    if-eqz p0, :cond_0

    .line 117
    invoke-static {}, Lcom/ibotta/android/App;->instance()Lcom/ibotta/android/App;

    move-result-object p0

    const v2, 0x7f1100a6

    invoke-virtual {p0, v2}, Lcom/ibotta/android/App;->getString(I)Ljava/lang/String;

    move-result-object p0

    invoke-virtual {v0, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_0

    .line 118
    invoke-static {}, Lcom/ibotta/android/App;->instance()Lcom/ibotta/android/App;

    move-result-object p0

    const-string v2, "Debug API in use."

    invoke-static {p0, v2, v1}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    move-result-object p0

    invoke-virtual {p0}, Landroid/widget/Toast;->show()V

    :cond_0
    const-string p0, "Current API URL is: %1$s"

    .line 121
    new-array v1, v1, [Ljava/lang/Object;

    const/4 v2, 0x0

    aput-object v0, v1, v2

    invoke-static {p0, v1}, Ltimber/log/Timber;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    return-object v0
.end method

.method public static getPlatform()Ljava/lang/String;
    .locals 1

    const-string v0, "android"

    return-object v0
.end method

.method public static getProblemReportPhoneData()Ljava/lang/String;
    .locals 2

    .line 141
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "manufacturer: "

    .line 143
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 144
    sget-object v1, Landroid/os/Build;->MANUFACTURER:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ";"

    .line 145
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "model: "

    .line 146
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 147
    sget-object v1, Landroid/os/Build;->MODEL:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ";"

    .line 148
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "bootloader: "

    .line 149
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 150
    sget-object v1, Landroid/os/Build;->BOOTLOADER:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ";"

    .line 151
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "os: "

    .line 152
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 153
    sget-object v1, Landroid/os/Build$VERSION;->RELEASE:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ";"

    .line 154
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 156
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public static getScreenSize()Landroid/graphics/Point;
    .locals 2

    .line 160
    invoke-static {}, Lcom/ibotta/android/App;->instance()Lcom/ibotta/android/App;

    move-result-object v0

    const-string v1, "window"

    invoke-virtual {v0, v1}, Lcom/ibotta/android/App;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/view/WindowManager;

    .line 161
    invoke-interface {v0}, Landroid/view/WindowManager;->getDefaultDisplay()Landroid/view/Display;

    move-result-object v0

    .line 163
    new-instance v1, Landroid/graphics/Point;

    invoke-direct {v1}, Landroid/graphics/Point;-><init>()V

    .line 164
    invoke-virtual {v0, v1}, Landroid/view/Display;->getSize(Landroid/graphics/Point;)V

    return-object v1
.end method

.method private initApi()V
    .locals 6

    .line 474
    sget-object v0, Lcom/ibotta/api/ApiContext;->INSTANCE:Lcom/ibotta/api/ApiContext;

    iget-object v1, p0, Lcom/ibotta/android/App;->mainComponent:Lcom/ibotta/android/di/MainComponent;

    invoke-interface {v1}, Lcom/ibotta/android/di/MainComponent;->getAuthManager()Lcom/ibotta/android/state/user/auth/AuthManager;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/ibotta/api/ApiContext;->setApiAuthManager(Lcom/ibotta/api/auth/ApiAuthManager;)V

    .line 475
    sget-object v0, Lcom/ibotta/api/ApiContext;->INSTANCE:Lcom/ibotta/api/ApiContext;

    const/4 v1, 0x1

    invoke-static {v1}, Lcom/ibotta/android/App;->getApiUrl(Z)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Lcom/ibotta/api/ApiContext;->setApiUrl(Ljava/lang/String;)V

    .line 476
    sget-object v0, Lcom/ibotta/api/ApiContext;->INSTANCE:Lcom/ibotta/api/ApiContext;

    invoke-static {}, Lcom/ibotta/android/App;->instance()Lcom/ibotta/android/App;

    move-result-object v2

    const v3, 0x7f11041d

    invoke-virtual {v2, v3}, Lcom/ibotta/android/App;->getString(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Lcom/ibotta/api/ApiContext;->setMvtApiUrl(Ljava/lang/String;)V

    .line 477
    sget-object v0, Lcom/ibotta/api/ApiContext;->INSTANCE:Lcom/ibotta/api/ApiContext;

    invoke-static {}, Lcom/ibotta/android/App;->instance()Lcom/ibotta/android/App;

    move-result-object v2

    const v3, 0x7f1104da

    invoke-virtual {v2, v3}, Lcom/ibotta/android/App;->getString(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Lcom/ibotta/api/ApiContext;->setPwiApiUrl(Ljava/lang/String;)V

    .line 478
    sget-object v0, Lcom/ibotta/api/ApiContext;->INSTANCE:Lcom/ibotta/api/ApiContext;

    new-instance v2, Lcom/ibotta/android/security/crypto/key/AppKeyProvider;

    sget-object v3, Lcom/ibotta/android/security/crypto/key/AppKeyProvider$KeyType;->API_SECRET:Lcom/ibotta/android/security/crypto/key/AppKeyProvider$KeyType;

    invoke-direct {v2, v3}, Lcom/ibotta/android/security/crypto/key/AppKeyProvider;-><init>(Lcom/ibotta/android/security/crypto/key/AppKeyProvider$KeyType;)V

    invoke-virtual {v2}, Lcom/ibotta/android/security/crypto/key/AppKeyProvider;->getKeyString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Lcom/ibotta/api/ApiContext;->setSecret(Ljava/lang/String;)V

    .line 479
    sget-object v0, Lcom/ibotta/api/ApiContext;->INSTANCE:Lcom/ibotta/api/ApiContext;

    new-instance v2, Lcom/ibotta/android/security/crypto/key/AppKeyProvider;

    sget-object v3, Lcom/ibotta/android/security/crypto/key/AppKeyProvider$KeyType;->API_KEY:Lcom/ibotta/android/security/crypto/key/AppKeyProvider$KeyType;

    invoke-direct {v2, v3}, Lcom/ibotta/android/security/crypto/key/AppKeyProvider;-><init>(Lcom/ibotta/android/security/crypto/key/AppKeyProvider$KeyType;)V

    invoke-virtual {v2}, Lcom/ibotta/android/security/crypto/key/AppKeyProvider;->getKeyString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Lcom/ibotta/api/ApiContext;->setKey(Ljava/lang/String;)V

    .line 480
    sget-object v0, Lcom/ibotta/api/ApiContext;->INSTANCE:Lcom/ibotta/api/ApiContext;

    iget-object v2, p0, Lcom/ibotta/android/App;->mainComponent:Lcom/ibotta/android/di/MainComponent;

    invoke-interface {v2}, Lcom/ibotta/android/di/MainComponent;->getApiExecutionFactory()Lcom/ibotta/api/execution/ApiExecutionFactory;

    move-result-object v2

    invoke-virtual {v0, v2}, Lcom/ibotta/api/ApiContext;->setApiExecutionFactory(Lcom/ibotta/api/execution/ApiExecutionFactory;)V

    .line 481
    sget-object v0, Lcom/ibotta/api/ApiContext;->INSTANCE:Lcom/ibotta/api/ApiContext;

    new-instance v2, Lcom/ibotta/android/api/IbottaApiUriBuilder;

    invoke-direct {v2}, Lcom/ibotta/android/api/IbottaApiUriBuilder;-><init>()V

    invoke-virtual {v0, v2}, Lcom/ibotta/api/ApiContext;->setApiUriBuilder(Lcom/ibotta/api/ApiUriBuilder;)V

    .line 482
    sget-object v0, Lcom/ibotta/api/ApiContext;->INSTANCE:Lcom/ibotta/api/ApiContext;

    iget-object v2, p0, Lcom/ibotta/android/App;->mainComponent:Lcom/ibotta/android/di/MainComponent;

    invoke-interface {v2}, Lcom/ibotta/android/di/MainComponent;->getAppCache()Lcom/ibotta/android/appcache/AppCache;

    move-result-object v2

    invoke-virtual {v0, v2}, Lcom/ibotta/api/ApiContext;->setApiCache(Lcom/ibotta/api/ApiCache;)V

    .line 483
    sget-object v0, Lcom/ibotta/api/ApiContext;->INSTANCE:Lcom/ibotta/api/ApiContext;

    invoke-static {}, Lcom/ibotta/android/App;->getPlatform()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Lcom/ibotta/api/ApiContext;->setPlatform(Ljava/lang/String;)V

    .line 484
    sget-object v0, Lcom/ibotta/api/ApiContext;->INSTANCE:Lcom/ibotta/api/ApiContext;

    iget-object v2, p0, Lcom/ibotta/android/App;->mainComponent:Lcom/ibotta/android/di/MainComponent;

    invoke-interface {v2}, Lcom/ibotta/android/di/MainComponent;->getDeviceSecurity()Lcom/ibotta/android/security/DeviceSecurity;

    move-result-object v2

    invoke-interface {v2}, Lcom/ibotta/android/security/DeviceSecurity;->getUniqueId()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Lcom/ibotta/api/ApiContext;->setDevicePrivateId(Ljava/lang/String;)V

    .line 485
    sget-object v0, Lcom/ibotta/api/ApiContext;->INSTANCE:Lcom/ibotta/api/ApiContext;

    iget-object v2, p0, Lcom/ibotta/android/App;->mainComponent:Lcom/ibotta/android/di/MainComponent;

    invoke-interface {v2}, Lcom/ibotta/android/di/MainComponent;->getGoogleState()Lcom/ibotta/android/state/app/google/GoogleState;

    move-result-object v2

    invoke-interface {v2}, Lcom/ibotta/android/state/app/google/GoogleState;->getGoogleAID()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Lcom/ibotta/api/ApiContext;->setDevicePublicId(Ljava/lang/String;)V

    .line 486
    sget-object v0, Lcom/ibotta/api/ApiContext;->INSTANCE:Lcom/ibotta/api/ApiContext;

    iget-object v2, p0, Lcom/ibotta/android/App;->mainComponent:Lcom/ibotta/android/di/MainComponent;

    invoke-interface {v2}, Lcom/ibotta/android/di/MainComponent;->getBuildProfile()Lcom/ibotta/android/profile/BuildProfile;

    move-result-object v2

    invoke-interface {v2}, Lcom/ibotta/android/profile/BuildProfile;->getAppVersionName()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Lcom/ibotta/api/ApiContext;->setAppVersion(Ljava/lang/String;)V

    .line 487
    sget-object v0, Lcom/ibotta/api/ApiContext;->INSTANCE:Lcom/ibotta/api/ApiContext;

    sget-object v2, Landroid/os/Build$VERSION;->RELEASE:Ljava/lang/String;

    invoke-virtual {v0, v2}, Lcom/ibotta/api/ApiContext;->setOsVersion(Ljava/lang/String;)V

    .line 488
    sget-object v0, Lcom/ibotta/api/ApiContext;->INSTANCE:Lcom/ibotta/api/ApiContext;

    invoke-static {}, Lcom/ibotta/android/security/DeviceSecurity$-CC;->isDeviceRooted()Z

    move-result v2

    invoke-virtual {v0, v2}, Lcom/ibotta/api/ApiContext;->setRooted(Z)V

    .line 489
    sget-object v0, Lcom/ibotta/api/ApiContext;->INSTANCE:Lcom/ibotta/api/ApiContext;

    invoke-static {}, Lcom/ibotta/android/security/DeviceSecurity$-CC;->isEmulator()Z

    move-result v2

    invoke-virtual {v0, v2}, Lcom/ibotta/api/ApiContext;->setEmulator(Z)V

    .line 490
    sget-object v0, Lcom/ibotta/api/ApiContext;->INSTANCE:Lcom/ibotta/api/ApiContext;

    iget-object v2, p0, Lcom/ibotta/android/App;->mainComponent:Lcom/ibotta/android/di/MainComponent;

    invoke-interface {v2}, Lcom/ibotta/android/di/MainComponent;->getBuildProfile()Lcom/ibotta/android/profile/BuildProfile;

    move-result-object v2

    invoke-interface {v2}, Lcom/ibotta/android/profile/BuildProfile;->isApiLayerInDebugMode()Z

    move-result v2

    invoke-virtual {v0, v2}, Lcom/ibotta/api/ApiContext;->setDebug(Z)V

    .line 491
    sget-object v0, Lcom/ibotta/api/ApiContext;->INSTANCE:Lcom/ibotta/api/ApiContext;

    sget-object v2, Landroid/os/Build;->MODEL:Ljava/lang/String;

    invoke-virtual {v0, v2}, Lcom/ibotta/api/ApiContext;->setModelNumber(Ljava/lang/String;)V

    .line 492
    sget-object v0, Lcom/ibotta/api/ApiContext;->INSTANCE:Lcom/ibotta/api/ApiContext;

    iget-object v2, p0, Lcom/ibotta/android/App;->mainComponent:Lcom/ibotta/android/di/MainComponent;

    invoke-interface {v2}, Lcom/ibotta/android/di/MainComponent;->getAppCache()Lcom/ibotta/android/appcache/AppCache;

    move-result-object v2

    invoke-interface {v2}, Lcom/ibotta/android/appcache/AppCache;->getWorkDir()Ljava/io/File;

    move-result-object v2

    invoke-virtual {v0, v2}, Lcom/ibotta/api/ApiContext;->setWorkDir(Ljava/io/File;)V

    .line 493
    sget-object v0, Lcom/ibotta/api/ApiContext;->INSTANCE:Lcom/ibotta/api/ApiContext;

    sget-object v2, Lcom/ibotta/android/crash/IbottaCrashProxy;->IbottaCrashManager:Lcom/ibotta/android/crash/CrashManager;

    invoke-virtual {v0, v2}, Lcom/ibotta/api/ApiContext;->setExceptionTracker(Lcom/ibotta/api/ExceptionTracker;)V

    .line 494
    sget-object v0, Lcom/ibotta/api/ApiContext;->INSTANCE:Lcom/ibotta/api/ApiContext;

    iget-object v2, p0, Lcom/ibotta/android/App;->mainComponent:Lcom/ibotta/android/di/MainComponent;

    invoke-interface {v2}, Lcom/ibotta/android/di/MainComponent;->getFormatting()Lcom/ibotta/android/util/Formatting;

    move-result-object v2

    invoke-virtual {v0, v2}, Lcom/ibotta/api/ApiContext;->setApiFormatting(Lcom/ibotta/api/ApiFormatting;)V

    .line 495
    sget-object v0, Lcom/ibotta/api/ApiContext;->INSTANCE:Lcom/ibotta/api/ApiContext;

    iget-object v2, p0, Lcom/ibotta/android/App;->mainComponent:Lcom/ibotta/android/di/MainComponent;

    invoke-interface {v2}, Lcom/ibotta/android/di/MainComponent;->getAppsFlyerUID()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Lcom/ibotta/api/ApiContext;->setAppsFlyerUID(Ljava/lang/String;)V

    .line 496
    sget-object v0, Lcom/ibotta/api/ApiContext;->INSTANCE:Lcom/ibotta/api/ApiContext;

    iget-object v2, p0, Lcom/ibotta/android/App;->mainComponent:Lcom/ibotta/android/di/MainComponent;

    invoke-interface {v2}, Lcom/ibotta/android/di/MainComponent;->getClearableCookieJar()Lcom/franmontiel/persistentcookiejar/ClearableCookieJar;

    move-result-object v2

    invoke-virtual {v0, v2}, Lcom/ibotta/api/ApiContext;->setCookieJar(Lokhttp3/CookieJar;)V

    .line 497
    sget-object v0, Lcom/ibotta/api/ApiContext;->INSTANCE:Lcom/ibotta/api/ApiContext;

    iget-object v2, p0, Lcom/ibotta/android/App;->mainComponent:Lcom/ibotta/android/di/MainComponent;

    invoke-interface {v2}, Lcom/ibotta/android/di/MainComponent;->getApiOkHttpClient()Lokhttp3/OkHttpClient;

    move-result-object v2

    invoke-virtual {v0, v2}, Lcom/ibotta/api/ApiContext;->setOkHttpClient(Lokhttp3/OkHttpClient;)V

    .line 499
    sget-object v0, Lcom/ibotta/api/ApiContext;->INSTANCE:Lcom/ibotta/api/ApiContext;

    invoke-virtual {v0}, Lcom/ibotta/api/ApiContext;->getUserLocation()Lcom/ibotta/api/UserLocation;

    move-result-object v0

    invoke-virtual {v0}, Lcom/ibotta/api/UserLocation;->hasLatLong()Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/ibotta/android/App;->mainComponent:Lcom/ibotta/android/di/MainComponent;

    invoke-interface {v0}, Lcom/ibotta/android/di/MainComponent;->getAuthManager()Lcom/ibotta/android/state/user/auth/AuthManager;

    move-result-object v0

    invoke-interface {v0}, Lcom/ibotta/android/state/user/auth/AuthManager;->isAuthenticated()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 500
    iget-object v0, p0, Lcom/ibotta/android/App;->mainComponent:Lcom/ibotta/android/di/MainComponent;

    invoke-interface {v0}, Lcom/ibotta/android/di/MainComponent;->getUserState()Lcom/ibotta/android/state/user/UserState;

    move-result-object v0

    invoke-interface {v0}, Lcom/ibotta/android/state/user/UserState;->getLastLocation()Landroid/location/Location;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 502
    sget-object v2, Lcom/ibotta/api/ApiContext;->INSTANCE:Lcom/ibotta/api/ApiContext;

    invoke-virtual {v2}, Lcom/ibotta/api/ApiContext;->getUserLocation()Lcom/ibotta/api/UserLocation;

    move-result-object v2

    .line 503
    invoke-virtual {v0}, Landroid/location/Location;->getLatitude()D

    move-result-wide v3

    double-to-float v3, v3

    invoke-static {v3}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v3

    .line 504
    invoke-virtual {v0}, Landroid/location/Location;->getLongitude()D

    move-result-wide v4

    double-to-float v4, v4

    invoke-static {v4}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v4

    .line 505
    invoke-virtual {v0}, Landroid/location/Location;->getAccuracy()F

    move-result v0

    invoke-static {v0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v0

    .line 502
    invoke-virtual {v2, v3, v4, v0}, Lcom/ibotta/api/UserLocation;->updateLocation(Ljava/lang/Float;Ljava/lang/Float;Ljava/lang/Float;)Ljava/lang/String;

    .line 510
    :cond_0
    invoke-static {}, Lcom/ibotta/android/App;->instance()Lcom/ibotta/android/App;

    move-result-object v0

    const-string v2, "location"

    invoke-virtual {v0, v2}, Lcom/ibotta/android/App;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/location/LocationManager;

    const/4 v2, 0x0

    if-eqz v0, :cond_1

    const-string v3, "network"

    .line 511
    invoke-virtual {v0, v3}, Landroid/location/LocationManager;->isProviderEnabled(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_1

    const/4 v0, 0x1

    goto :goto_0

    :cond_1
    const/4 v0, 0x0

    .line 514
    :goto_0
    sget-object v3, Lcom/ibotta/api/ApiContext;->INSTANCE:Lcom/ibotta/api/ApiContext;

    invoke-virtual {v3}, Lcom/ibotta/api/ApiContext;->getUserLocation()Lcom/ibotta/api/UserLocation;

    move-result-object v3

    invoke-virtual {v3, v0}, Lcom/ibotta/api/UserLocation;->update(Z)Ljava/lang/String;

    .line 526
    sget-object v0, Lcom/ibotta/api/ApiContext;->INSTANCE:Lcom/ibotta/api/ApiContext;

    iget-object v3, p0, Lcom/ibotta/android/App;->mainComponent:Lcom/ibotta/android/di/MainComponent;

    invoke-interface {v3}, Lcom/ibotta/android/di/MainComponent;->getApiClient()Lcom/ibotta/api/ApiClient;

    move-result-object v3

    invoke-virtual {v0, v3}, Lcom/ibotta/api/ApiContext;->setApiClient(Lcom/ibotta/api/ApiClient;)V

    const-string v0, "Initialized API: url=%1$s, key=%2$s"

    const/4 v3, 0x2

    .line 528
    new-array v3, v3, [Ljava/lang/Object;

    sget-object v4, Lcom/ibotta/api/ApiContext;->INSTANCE:Lcom/ibotta/api/ApiContext;

    invoke-virtual {v4}, Lcom/ibotta/api/ApiContext;->getApiUrl()Ljava/lang/String;

    move-result-object v4

    aput-object v4, v3, v2

    sget-object v4, Lcom/ibotta/api/ApiContext;->INSTANCE:Lcom/ibotta/api/ApiContext;

    invoke-virtual {v4}, Lcom/ibotta/api/ApiContext;->getKey()Ljava/lang/String;

    move-result-object v4

    aput-object v4, v3, v1

    invoke-static {v0, v3}, Ltimber/log/Timber;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    const-string v0, "App Version: %1$s"

    .line 529
    new-array v3, v1, [Ljava/lang/Object;

    iget-object v4, p0, Lcom/ibotta/android/App;->mainComponent:Lcom/ibotta/android/di/MainComponent;

    invoke-interface {v4}, Lcom/ibotta/android/di/MainComponent;->getBuildProfile()Lcom/ibotta/android/profile/BuildProfile;

    move-result-object v4

    invoke-interface {v4}, Lcom/ibotta/android/profile/BuildProfile;->getAppVersionName()Ljava/lang/String;

    move-result-object v4

    aput-object v4, v3, v2

    invoke-static {v0, v3}, Ltimber/log/Timber;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    const-string v0, "OS Version: %1$s"

    .line 530
    new-array v3, v1, [Ljava/lang/Object;

    sget-object v4, Landroid/os/Build$VERSION;->RELEASE:Ljava/lang/String;

    aput-object v4, v3, v2

    invoke-static {v0, v3}, Ltimber/log/Timber;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    const-string v0, "Rooted: %1$b"

    .line 531
    new-array v3, v1, [Ljava/lang/Object;

    invoke-static {}, Lcom/ibotta/android/security/DeviceSecurity$-CC;->isDeviceRooted()Z

    move-result v4

    invoke-static {v4}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v4

    aput-object v4, v3, v2

    invoke-static {v0, v3}, Ltimber/log/Timber;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    const-string v0, "Bluestacks: %1$b"

    .line 532
    new-array v3, v1, [Ljava/lang/Object;

    invoke-static {}, Lcom/ibotta/android/security/DeviceSecurity$-CC;->isBluestacks()Z

    move-result v4

    invoke-static {v4}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v4

    aput-object v4, v3, v2

    invoke-static {v0, v3}, Ltimber/log/Timber;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    const-string v0, "Model Number: %1$s"

    .line 533
    new-array v3, v1, [Ljava/lang/Object;

    sget-object v4, Landroid/os/Build;->MODEL:Ljava/lang/String;

    aput-object v4, v3, v2

    invoke-static {v0, v3}, Ltimber/log/Timber;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    const-string v0, "Android ID: %1$s"

    .line 534
    new-array v3, v1, [Ljava/lang/Object;

    iget-object v4, p0, Lcom/ibotta/android/App;->mainComponent:Lcom/ibotta/android/di/MainComponent;

    invoke-interface {v4}, Lcom/ibotta/android/di/MainComponent;->getDeviceSecurity()Lcom/ibotta/android/security/DeviceSecurity;

    move-result-object v4

    invoke-interface {v4}, Lcom/ibotta/android/security/DeviceSecurity;->getUniqueId()Ljava/lang/String;

    move-result-object v4

    aput-object v4, v3, v2

    invoke-static {v0, v3}, Ltimber/log/Timber;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    const-string v0, "Build properties...."

    .line 536
    new-array v3, v2, [Ljava/lang/Object;

    invoke-static {v0, v3}, Ltimber/log/Timber;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    const-string v0, "Board: %1$s"

    .line 537
    new-array v3, v1, [Ljava/lang/Object;

    sget-object v4, Landroid/os/Build;->BOARD:Ljava/lang/String;

    aput-object v4, v3, v2

    invoke-static {v0, v3}, Ltimber/log/Timber;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    const-string v0, "Bootloader: %1$s"

    .line 538
    new-array v3, v1, [Ljava/lang/Object;

    sget-object v4, Landroid/os/Build;->BOOTLOADER:Ljava/lang/String;

    aput-object v4, v3, v2

    invoke-static {v0, v3}, Ltimber/log/Timber;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    const-string v0, "Brand: %1$s"

    .line 539
    new-array v3, v1, [Ljava/lang/Object;

    sget-object v4, Landroid/os/Build;->BRAND:Ljava/lang/String;

    aput-object v4, v3, v2

    invoke-static {v0, v3}, Ltimber/log/Timber;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    const-string v0, "CPU ABI: %1$s"

    .line 540
    new-array v3, v1, [Ljava/lang/Object;

    sget-object v4, Landroid/os/Build;->CPU_ABI:Ljava/lang/String;

    aput-object v4, v3, v2

    invoke-static {v0, v3}, Ltimber/log/Timber;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    const-string v0, "CPU ABI2: %1$s"

    .line 541
    new-array v3, v1, [Ljava/lang/Object;

    sget-object v4, Landroid/os/Build;->CPU_ABI2:Ljava/lang/String;

    aput-object v4, v3, v2

    invoke-static {v0, v3}, Ltimber/log/Timber;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    const-string v0, "Device: %1$s"

    .line 542
    new-array v3, v1, [Ljava/lang/Object;

    sget-object v4, Landroid/os/Build;->DEVICE:Ljava/lang/String;

    aput-object v4, v3, v2

    invoke-static {v0, v3}, Ltimber/log/Timber;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    const-string v0, "Display: %1$s"

    .line 543
    new-array v3, v1, [Ljava/lang/Object;

    sget-object v4, Landroid/os/Build;->DISPLAY:Ljava/lang/String;

    aput-object v4, v3, v2

    invoke-static {v0, v3}, Ltimber/log/Timber;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    const-string v0, "Fingerprint: %1$s"

    .line 544
    new-array v3, v1, [Ljava/lang/Object;

    sget-object v4, Landroid/os/Build;->FINGERPRINT:Ljava/lang/String;

    aput-object v4, v3, v2

    invoke-static {v0, v3}, Ltimber/log/Timber;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    const-string v0, "Hardware: %1$s"

    .line 545
    new-array v3, v1, [Ljava/lang/Object;

    sget-object v4, Landroid/os/Build;->HARDWARE:Ljava/lang/String;

    aput-object v4, v3, v2

    invoke-static {v0, v3}, Ltimber/log/Timber;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    const-string v0, "Host: %1$s"

    .line 546
    new-array v3, v1, [Ljava/lang/Object;

    sget-object v4, Landroid/os/Build;->HOST:Ljava/lang/String;

    aput-object v4, v3, v2

    invoke-static {v0, v3}, Ltimber/log/Timber;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    const-string v0, "ID: %1$s"

    .line 547
    new-array v3, v1, [Ljava/lang/Object;

    sget-object v4, Landroid/os/Build;->ID:Ljava/lang/String;

    aput-object v4, v3, v2

    invoke-static {v0, v3}, Ltimber/log/Timber;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    const-string v0, "Manufacturer: %1$s"

    .line 548
    new-array v3, v1, [Ljava/lang/Object;

    sget-object v4, Landroid/os/Build;->MANUFACTURER:Ljava/lang/String;

    aput-object v4, v3, v2

    invoke-static {v0, v3}, Ltimber/log/Timber;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    const-string v0, "Model: %1$s"

    .line 549
    new-array v3, v1, [Ljava/lang/Object;

    sget-object v4, Landroid/os/Build;->MODEL:Ljava/lang/String;

    aput-object v4, v3, v2

    invoke-static {v0, v3}, Ltimber/log/Timber;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    const-string v0, "Product: %1$s"

    .line 550
    new-array v3, v1, [Ljava/lang/Object;

    sget-object v4, Landroid/os/Build;->PRODUCT:Ljava/lang/String;

    aput-object v4, v3, v2

    invoke-static {v0, v3}, Ltimber/log/Timber;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    const-string v0, "Tags: %1$s"

    .line 551
    new-array v3, v1, [Ljava/lang/Object;

    sget-object v4, Landroid/os/Build;->TAGS:Ljava/lang/String;

    aput-object v4, v3, v2

    invoke-static {v0, v3}, Ltimber/log/Timber;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    const-string v0, "Time: %1$s"

    .line 552
    new-array v3, v1, [Ljava/lang/Object;

    sget-wide v4, Landroid/os/Build;->TIME:J

    invoke-static {v4, v5}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v4

    aput-object v4, v3, v2

    invoke-static {v0, v3}, Ltimber/log/Timber;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    const-string v0, "Type: %1$s"

    .line 553
    new-array v3, v1, [Ljava/lang/Object;

    sget-object v4, Landroid/os/Build;->TYPE:Ljava/lang/String;

    aput-object v4, v3, v2

    invoke-static {v0, v3}, Ltimber/log/Timber;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    const-string v0, "Unknown: %1$s"

    .line 554
    new-array v3, v1, [Ljava/lang/Object;

    const-string v4, "unknown"

    aput-object v4, v3, v2

    invoke-static {v0, v3}, Ltimber/log/Timber;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    const-string v0, "User: %1$s"

    .line 555
    new-array v1, v1, [Ljava/lang/Object;

    sget-object v3, Landroid/os/Build;->USER:Ljava/lang/String;

    aput-object v3, v1, v2

    invoke-static {v0, v1}, Ltimber/log/Timber;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    return-void
.end method

.method private initAuthManager()V
    .locals 1

    .line 433
    iget-object v0, p0, Lcom/ibotta/android/App;->mainComponent:Lcom/ibotta/android/di/MainComponent;

    invoke-interface {v0}, Lcom/ibotta/android/di/MainComponent;->getAuthManager()Lcom/ibotta/android/state/user/auth/AuthManager;

    return-void
.end method

.method private initCachePolicies()V
    .locals 1

    .line 467
    iget-object v0, p0, Lcom/ibotta/android/App;->mainComponent:Lcom/ibotta/android/di/MainComponent;

    invoke-interface {v0}, Lcom/ibotta/android/di/MainComponent;->getCachePolicies()Lcom/ibotta/android/appcache/policy/CachePolicies;

    move-result-object v0

    invoke-interface {v0}, Lcom/ibotta/android/appcache/policy/CachePolicies;->init()V

    return-void
.end method

.method private initFirebase()V
    .locals 0

    .line 366
    invoke-static {p0}, Lcom/firebase/client/Firebase;->setAndroidContext(Landroid/content/Context;)V

    return-void
.end method

.method private initMainComponent()V
    .locals 1

    .line 249
    invoke-virtual {p0}, Lcom/ibotta/android/App;->createMainComponent()Lcom/ibotta/android/di/MainComponent;

    move-result-object v0

    iput-object v0, p0, Lcom/ibotta/android/App;->mainComponent:Lcom/ibotta/android/di/MainComponent;

    .line 254
    iget-object v0, p0, Lcom/ibotta/android/App;->mainComponent:Lcom/ibotta/android/di/MainComponent;

    invoke-interface {v0}, Lcom/ibotta/android/di/MainComponent;->getApolloClient()Lcom/apollographql/apollo/ApolloClient;

    return-void
.end method

.method private initNetworkChangeListener()V
    .locals 4

    .line 228
    new-instance v0, Landroid/content/Intent;

    const-class v1, Lcom/ibotta/android/receiver/NetworkChangeReceiver;

    invoke-direct {v0, p0, v1}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    const-string v1, "connectivity"

    .line 229
    invoke-virtual {p0, v1}, Lcom/ibotta/android/App;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/net/ConnectivityManager;

    if-eqz v1, :cond_0

    .line 231
    new-instance v2, Landroid/net/NetworkRequest$Builder;

    invoke-direct {v2}, Landroid/net/NetworkRequest$Builder;-><init>()V

    .line 232
    invoke-virtual {v2}, Landroid/net/NetworkRequest$Builder;->build()Landroid/net/NetworkRequest;

    move-result-object v2

    new-instance v3, Lcom/ibotta/android/state/app/network/NetworkConnectionStateImpl;

    invoke-direct {v3, p0, v0}, Lcom/ibotta/android/state/app/network/NetworkConnectionStateImpl;-><init>(Landroid/content/Context;Landroid/content/Intent;)V

    .line 231
    invoke-virtual {v1, v2, v3}, Landroid/net/ConnectivityManager;->registerNetworkCallback(Landroid/net/NetworkRequest;Landroid/net/ConnectivityManager$NetworkCallback;)V

    :cond_0
    return-void
.end method

.method private initTMonitorClient()V
    .locals 1

    .line 577
    iget-object v0, p0, Lcom/ibotta/android/App;->mainComponent:Lcom/ibotta/android/di/MainComponent;

    invoke-interface {v0}, Lcom/ibotta/android/di/MainComponent;->getTMonitorClient()Lcom/ibotta/android/tracking/tmonitor/TMonitorClient;

    return-void
.end method

.method private initTrackingModule()V
    .locals 2

    .line 258
    sget-object v0, Lcom/ibotta/android/crash/IbottaCrashProxy;->IbottaCrashManager:Lcom/ibotta/android/crash/CrashManager;

    invoke-static {v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v1, Lcom/ibotta/android/-$$Lambda$NAv6XRpujF7qMNlbfRtuIlkdEo8;

    invoke-direct {v1, v0}, Lcom/ibotta/android/-$$Lambda$NAv6XRpujF7qMNlbfRtuIlkdEo8;-><init>(Lcom/ibotta/android/crash/CrashManager;)V

    invoke-static {v1}, Lcom/ibotta/android/tracking/IbottaTracking;->init(Ljava9/util/function/Consumer;)V

    return-void
.end method

.method private initUserState()V
    .locals 2

    .line 428
    iget-object v0, p0, Lcom/ibotta/android/App;->mainComponent:Lcom/ibotta/android/di/MainComponent;

    invoke-interface {v0}, Lcom/ibotta/android/di/MainComponent;->getUserState()Lcom/ibotta/android/state/user/UserState;

    move-result-object v0

    invoke-interface {v0}, Lcom/ibotta/android/state/user/UserState;->init()V

    const-string v0, "Initialized user state"

    const/4 v1, 0x0

    .line 429
    new-array v1, v1, [Ljava/lang/Object;

    invoke-static {v0, v1}, Ltimber/log/Timber;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    return-void
.end method

.method private initViewsModule()V
    .locals 8

    .line 437
    sget-object v0, Lcom/ibotta/android/views/ViewsModule;->INSTANCE:Lcom/ibotta/android/views/ViewsModule;

    iget-object v1, p0, Lcom/ibotta/android/App;->mainComponent:Lcom/ibotta/android/di/MainComponent;

    .line 438
    invoke-interface {v1}, Lcom/ibotta/android/di/MainComponent;->getImageCache()Lcom/ibotta/android/images/ImageCache;

    move-result-object v1

    iget-object v2, p0, Lcom/ibotta/android/App;->mainComponent:Lcom/ibotta/android/di/MainComponent;

    .line 439
    invoke-interface {v2}, Lcom/ibotta/android/di/MainComponent;->getHardware()Lcom/ibotta/android/hardware/Hardware;

    move-result-object v2

    iget-object v3, p0, Lcom/ibotta/android/App;->mainComponent:Lcom/ibotta/android/di/MainComponent;

    .line 440
    invoke-interface {v3}, Lcom/ibotta/android/di/MainComponent;->getAppHelper()Lcom/ibotta/android/util/AppHelper;

    move-result-object v3

    iget-object v4, p0, Lcom/ibotta/android/App;->mainComponent:Lcom/ibotta/android/di/MainComponent;

    .line 441
    invoke-interface {v4}, Lcom/ibotta/android/di/MainComponent;->getValidation()Lcom/ibotta/android/util/Validation;

    move-result-object v4

    iget-object v5, p0, Lcom/ibotta/android/App;->mainComponent:Lcom/ibotta/android/di/MainComponent;

    .line 442
    invoke-interface {v5}, Lcom/ibotta/android/di/MainComponent;->getTrackingQueue()Lcom/ibotta/android/tracking/proprietary/TrackingQueue;

    move-result-object v5

    iget-object v6, p0, Lcom/ibotta/android/App;->mainComponent:Lcom/ibotta/android/di/MainComponent;

    .line 443
    invoke-interface {v6}, Lcom/ibotta/android/di/MainComponent;->getIbottaListViewTrackingHelper()Lcom/ibotta/android/tracking/scrolltracking/listview/IbottaListViewTrackingHelper;

    move-result-object v6

    sget-object v7, Lcom/ibotta/android/-$$Lambda$_3DWDB2ipsqKCxp5lzWxKGZN9eU;->INSTANCE:Lcom/ibotta/android/-$$Lambda$_3DWDB2ipsqKCxp5lzWxKGZN9eU;

    .line 437
    invoke-virtual/range {v0 .. v7}, Lcom/ibotta/android/views/ViewsModule;->init(Lcom/ibotta/android/images/ImageCache;Lcom/ibotta/android/hardware/Hardware;Lcom/ibotta/android/util/AppHelper;Lcom/ibotta/android/util/Validation;Lcom/ibotta/android/tracking/proprietary/TrackingQueue;Lcom/ibotta/android/tracking/scrolltracking/listview/IbottaListViewTrackingHelper;Lkotlin/jvm/functions/Function1;)V

    return-void
.end method

.method public static instance()Lcom/ibotta/android/App;
    .locals 1

    .line 107
    sget-object v0, Lcom/ibotta/android/App;->instance:Lcom/ibotta/android/App;

    return-object v0
.end method

.method public static isDebug()Z
    .locals 1

    .line 111
    sget-boolean v0, Lcom/ibotta/android/App;->DEBUG:Z

    return v0
.end method

.method public static isInForeground()Z
    .locals 1

    .line 133
    invoke-static {}, Lcom/ibotta/android/ActivityLifecycleListener;->isInForeground()Z

    move-result v0

    return v0
.end method

.method public static updateApiUrl()V
    .locals 2

    .line 127
    invoke-static {}, Lcom/ibotta/android/App;->instance()Lcom/ibotta/android/App;

    move-result-object v0

    iget-object v0, v0, Lcom/ibotta/android/App;->mainComponent:Lcom/ibotta/android/di/MainComponent;

    invoke-interface {v0}, Lcom/ibotta/android/di/MainComponent;->getBuildProfile()Lcom/ibotta/android/profile/BuildProfile;

    move-result-object v0

    invoke-interface {v0}, Lcom/ibotta/android/profile/BuildProfile;->shouldAllowApiUrlOverride()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 128
    sget-object v0, Lcom/ibotta/api/ApiContext;->INSTANCE:Lcom/ibotta/api/ApiContext;

    const/4 v1, 0x0

    invoke-static {v1}, Lcom/ibotta/android/App;->getApiUrl(Z)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/ibotta/api/ApiContext;->setApiUrl(Ljava/lang/String;)V

    :cond_0
    return-void
.end method


# virtual methods
.method protected clearCacheForFlagsFromPushNotification()V
    .locals 1

    .line 585
    iget-object v0, p0, Lcom/ibotta/android/App;->mainComponent:Lcom/ibotta/android/di/MainComponent;

    invoke-interface {v0}, Lcom/ibotta/android/di/MainComponent;->getCacheClearHelper()Lcom/ibotta/android/appcache/CacheClearHelper;

    move-result-object v0

    invoke-interface {v0}, Lcom/ibotta/android/appcache/CacheClearHelper;->clearCacheForFlagsFromPushNotification()V

    return-void
.end method

.method protected createMainComponent()Lcom/ibotta/android/di/MainComponent;
    .locals 1

    .line 243
    invoke-static {}, Lcom/ibotta/android/di/DaggerMainComponent;->builder()Lcom/ibotta/android/di/MainComponent$Builder;

    move-result-object v0

    .line 244
    invoke-interface {v0, p0}, Lcom/ibotta/android/di/MainComponent$Builder;->application(Lcom/ibotta/android/App;)Lcom/ibotta/android/di/MainComponent$Builder;

    move-result-object v0

    .line 245
    invoke-interface {v0}, Lcom/ibotta/android/di/MainComponent$Builder;->build()Lcom/ibotta/android/di/MainComponent;

    move-result-object v0

    return-object v0
.end method

.method public createMultipleCrashManager(Lcom/ibotta/android/crash/CrashKeys;Lcom/ibotta/android/crash/HockeyAppCrashManager;Lcom/ibotta/android/crash/NewRelicCrashManager;Lcom/ibotta/android/crash/CrashlyticsCrashManager;)Lcom/ibotta/android/crash/MultipleCrashManager;
    .locals 1

    .line 326
    new-instance v0, Ljava/util/HashSet;

    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    .line 327
    invoke-interface {v0, p2}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 328
    invoke-interface {v0, p3}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 329
    invoke-interface {v0, p4}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 331
    new-instance p2, Lcom/ibotta/android/crash/MultipleCrashManager;

    .line 332
    invoke-direct {p0}, Lcom/ibotta/android/App;->getAllBuildTypes()Ljava/util/Set;

    move-result-object p3

    invoke-static {p3}, Ljava/util/Collections;->unmodifiableSet(Ljava/util/Set;)Ljava/util/Set;

    move-result-object p3

    invoke-static {v0}, Ljava/util/Collections;->unmodifiableSet(Ljava/util/Set;)Ljava/util/Set;

    move-result-object p4

    invoke-direct {p2, p1, p3, p4}, Lcom/ibotta/android/crash/MultipleCrashManager;-><init>(Lcom/ibotta/android/crash/CrashKeys;Ljava/util/Set;Ljava/util/Set;)V

    return-object p2
.end method

.method public getHandler()Landroid/os/Handler;
    .locals 2

    .line 602
    iget-object v0, p0, Lcom/ibotta/android/App;->handler:Landroid/os/Handler;

    if-nez v0, :cond_0

    .line 603
    new-instance v0, Landroid/os/Handler;

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v1

    invoke-direct {v0, v1}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    iput-object v0, p0, Lcom/ibotta/android/App;->handler:Landroid/os/Handler;

    .line 605
    :cond_0
    iget-object v0, p0, Lcom/ibotta/android/App;->handler:Landroid/os/Handler;

    return-object v0
.end method

.method public getMainComponent()Lcom/ibotta/android/di/MainComponent;
    .locals 1

    .line 581
    iget-object v0, p0, Lcom/ibotta/android/App;->mainComponent:Lcom/ibotta/android/di/MainComponent;

    return-object v0
.end method

.method public hasPermission(Lcom/ibotta/android/state/app/permissions/PermissionProfile;)Z
    .locals 6

    .line 589
    invoke-virtual {p1}, Lcom/ibotta/android/state/app/permissions/PermissionProfile;->getPermissions()[Ljava/lang/String;

    move-result-object p1

    .line 592
    array-length v0, p1

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    :goto_0
    if-ge v2, v0, :cond_1

    aget-object v4, p1, v2

    .line 593
    invoke-static {}, Lcom/ibotta/android/App;->instance()Lcom/ibotta/android/App;

    move-result-object v5

    invoke-static {v5, v4}, Landroid/support/v4/content/ContextCompat;->checkSelfPermission(Landroid/content/Context;Ljava/lang/String;)I

    move-result v4

    if-nez v4, :cond_0

    add-int/lit8 v3, v3, 0x1

    :cond_0
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    .line 598
    :cond_1
    array-length p1, p1

    if-lt v3, p1, :cond_2

    const/4 v1, 0x1

    :cond_2
    return v1
.end method

.method protected init()V
    .locals 5

    .line 190
    invoke-virtual {p0}, Lcom/ibotta/android/App;->initDebugState()V

    .line 191
    invoke-virtual {p0}, Lcom/ibotta/android/App;->initLogging()V

    .line 192
    invoke-virtual {p0}, Lcom/ibotta/android/App;->initCrashManager()V

    .line 193
    invoke-virtual {p0}, Lcom/ibotta/android/App;->initUncaughtHandler()V

    .line 194
    invoke-direct {p0}, Lcom/ibotta/android/App;->initFirebase()V

    const-string v0, "init"

    const/4 v1, 0x0

    .line 196
    new-array v2, v1, [Ljava/lang/Object;

    invoke-static {v0, v2}, Ltimber/log/Timber;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 198
    invoke-virtual {p0}, Lcom/ibotta/android/App;->initEncryption()V

    .line 199
    invoke-direct {p0}, Lcom/ibotta/android/App;->initNetworkChangeListener()V

    .line 200
    invoke-direct {p0}, Lcom/ibotta/android/App;->initMainComponent()V

    .line 201
    invoke-direct {p0}, Lcom/ibotta/android/App;->initTrackingModule()V

    .line 202
    invoke-virtual {p0}, Lcom/ibotta/android/App;->initActivityLifecycleListener()V

    .line 203
    invoke-virtual {p0}, Lcom/ibotta/android/App;->initStetho()V

    .line 204
    invoke-virtual {p0}, Lcom/ibotta/android/App;->initTracker()V

    .line 205
    invoke-direct {p0}, Lcom/ibotta/android/App;->initUserState()V

    .line 206
    invoke-direct {p0}, Lcom/ibotta/android/App;->initAuthManager()V

    .line 207
    invoke-virtual {p0}, Lcom/ibotta/android/App;->initAppUpgrader()V

    .line 208
    invoke-direct {p0}, Lcom/ibotta/android/App;->initCachePolicies()V

    .line 209
    invoke-direct {p0}, Lcom/ibotta/android/App;->initApi()V

    .line 212
    invoke-virtual {p0}, Lcom/ibotta/android/App;->clearCacheForFlagsFromPushNotification()V

    .line 213
    iget-object v0, p0, Lcom/ibotta/android/App;->mainComponent:Lcom/ibotta/android/di/MainComponent;

    invoke-interface {v0}, Lcom/ibotta/android/di/MainComponent;->getLocationUpdateManager()Lcom/ibotta/android/service/location/LocationUpdateManager;

    move-result-object v0

    const-wide/32 v2, 0x36ee80

    invoke-interface {v0, v2, v3}, Lcom/ibotta/android/service/location/LocationUpdateManager;->requestUpdate(J)V

    .line 215
    invoke-virtual {p0}, Lcom/ibotta/android/App;->initDeviceRegistration()V

    .line 217
    invoke-virtual {p0}, Lcom/ibotta/android/App;->initGeofenceModule()V

    .line 218
    invoke-virtual {p0}, Lcom/ibotta/android/App;->initGeofenceCoordinator()V

    .line 219
    invoke-virtual {p0}, Lcom/ibotta/android/App;->initLifecycleTracker()V

    .line 220
    invoke-direct {p0}, Lcom/ibotta/android/App;->initTMonitorClient()V

    .line 221
    invoke-direct {p0}, Lcom/ibotta/android/App;->initViewsModule()V

    const-string v0, "Using Facebook SDK version: %1$s"

    const/4 v2, 0x1

    .line 223
    new-array v3, v2, [Ljava/lang/Object;

    invoke-static {}, Lcom/facebook/FacebookSdk;->getSdkVersion()Ljava/lang/String;

    move-result-object v4

    aput-object v4, v3, v1

    invoke-static {v0, v3}, Ltimber/log/Timber;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    const-string v0, "IP Address: %1$s"

    .line 224
    new-array v2, v2, [Ljava/lang/Object;

    iget-object v3, p0, Lcom/ibotta/android/App;->mainComponent:Lcom/ibotta/android/di/MainComponent;

    invoke-interface {v3}, Lcom/ibotta/android/di/MainComponent;->getHardware()Lcom/ibotta/android/hardware/Hardware;

    move-result-object v3

    invoke-interface {v3}, Lcom/ibotta/android/hardware/Hardware;->getLocalIpAddress()Ljava/lang/String;

    move-result-object v3

    aput-object v3, v2, v1

    invoke-static {v0, v2}, Ltimber/log/Timber;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    return-void
.end method

.method protected initActivityLifecycleListener()V
    .locals 1

    .line 370
    iget-object v0, p0, Lcom/ibotta/android/App;->mainComponent:Lcom/ibotta/android/di/MainComponent;

    invoke-interface {v0}, Lcom/ibotta/android/di/MainComponent;->getActivityLifecycleListener()Lcom/ibotta/android/ActivityLifecycleListener;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/ibotta/android/App;->registerActivityLifecycleCallbacks(Landroid/app/Application$ActivityLifecycleCallbacks;)V

    return-void
.end method

.method protected initAppUpgrader()V
    .locals 2

    .line 453
    iget-object v0, p0, Lcom/ibotta/android/App;->mainComponent:Lcom/ibotta/android/di/MainComponent;

    invoke-interface {v0}, Lcom/ibotta/android/di/MainComponent;->getAppConfig()Lcom/ibotta/android/state/app/config/AppConfig;

    .line 454
    iget-object v0, p0, Lcom/ibotta/android/App;->mainComponent:Lcom/ibotta/android/di/MainComponent;

    invoke-interface {v0}, Lcom/ibotta/android/di/MainComponent;->getUserState()Lcom/ibotta/android/state/user/UserState;

    .line 455
    iget-object v0, p0, Lcom/ibotta/android/App;->mainComponent:Lcom/ibotta/android/di/MainComponent;

    invoke-interface {v0}, Lcom/ibotta/android/di/MainComponent;->getUpgradeChecker()Lcom/ibotta/android/async/upgrade/UpgradeChecker;

    .line 456
    iget-object v0, p0, Lcom/ibotta/android/App;->mainComponent:Lcom/ibotta/android/di/MainComponent;

    invoke-interface {v0}, Lcom/ibotta/android/di/MainComponent;->getServerUpgradeState()Lcom/ibotta/android/state/app/upgrade/ServerUpgradeState;

    .line 457
    iget-object v0, p0, Lcom/ibotta/android/App;->mainComponent:Lcom/ibotta/android/di/MainComponent;

    invoke-interface {v0}, Lcom/ibotta/android/di/MainComponent;->getAppCache()Lcom/ibotta/android/appcache/AppCache;

    .line 459
    iget-object v0, p0, Lcom/ibotta/android/App;->mainComponent:Lcom/ibotta/android/di/MainComponent;

    invoke-interface {v0}, Lcom/ibotta/android/di/MainComponent;->getAppUpgrader()Lcom/ibotta/android/state/app/upgrade/AppUpgrader;

    move-result-object v0

    invoke-interface {v0}, Lcom/ibotta/android/state/app/upgrade/AppUpgrader;->performUpgradeIfNeeded()Lcom/ibotta/android/state/app/pojo/UpgradeInfo;

    const-string v0, "Initialized app upgrader"

    const/4 v1, 0x0

    .line 460
    new-array v1, v1, [Ljava/lang/Object;

    invoke-static {v0, v1}, Ltimber/log/Timber;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    return-void
.end method

.method protected initCrashManager()V
    .locals 4

    .line 262
    invoke-direct {p0}, Lcom/ibotta/android/App;->createCrashManagerKeys()Lcom/ibotta/android/crash/CrashKeys;

    move-result-object v0

    .line 264
    invoke-direct {p0, v0}, Lcom/ibotta/android/App;->createHockeyAppCrashManager(Lcom/ibotta/android/crash/CrashKeys;)Lcom/ibotta/android/crash/HockeyAppCrashManager;

    move-result-object v1

    .line 265
    invoke-direct {p0, v0}, Lcom/ibotta/android/App;->createNewRelicCrashManager(Lcom/ibotta/android/crash/CrashKeys;)Lcom/ibotta/android/crash/NewRelicCrashManager;

    move-result-object v2

    .line 266
    invoke-direct {p0, v0}, Lcom/ibotta/android/App;->createCrashlyticsCrashManager(Lcom/ibotta/android/crash/CrashKeys;)Lcom/ibotta/android/crash/CrashlyticsCrashManager;

    move-result-object v3

    .line 269
    invoke-virtual {p0, v0, v1, v2, v3}, Lcom/ibotta/android/App;->createMultipleCrashManager(Lcom/ibotta/android/crash/CrashKeys;Lcom/ibotta/android/crash/HockeyAppCrashManager;Lcom/ibotta/android/crash/NewRelicCrashManager;Lcom/ibotta/android/crash/CrashlyticsCrashManager;)Lcom/ibotta/android/crash/MultipleCrashManager;

    move-result-object v0

    .line 271
    invoke-static {v0}, Lcom/ibotta/android/crash/IbottaCrashProxy;->delegate(Lcom/ibotta/android/crash/CrashManager;)V

    .line 272
    sget-object v0, Lcom/ibotta/android/crash/IbottaCrashProxy;->IbottaCrashManager:Lcom/ibotta/android/crash/CrashManager;

    invoke-virtual {v0, p0}, Lcom/ibotta/android/crash/CrashManager;->register(Landroid/content/Context;)V

    return-void
.end method

.method protected initDebugState()V
    .locals 4

    const/4 v0, 0x0

    .line 349
    sput-boolean v0, Lcom/ibotta/android/App;->DEBUG:Z

    .line 351
    invoke-virtual {p0}, Lcom/ibotta/android/App;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v1

    const/4 v2, 0x1

    .line 353
    :try_start_0
    invoke-virtual {p0}, Lcom/ibotta/android/App;->getPackageName()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v3, v0}, Landroid/content/pm/PackageManager;->getApplicationInfo(Ljava/lang/String;I)Landroid/content/pm/ApplicationInfo;

    move-result-object v1

    .line 354
    iget v3, v1, Landroid/content/pm/ApplicationInfo;->flags:I

    and-int/lit8 v3, v3, 0x2

    iput v3, v1, Landroid/content/pm/ApplicationInfo;->flags:I

    if-eqz v3, :cond_0

    const/4 v1, 0x1

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    sput-boolean v1, Lcom/ibotta/android/App;->DEBUG:Z
    :try_end_0
    .catch Landroid/content/pm/PackageManager$NameNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    .line 360
    :catch_0
    sget-boolean v1, Lcom/ibotta/android/App;->DEBUG:Z

    if-eqz v1, :cond_1

    const-string v3, "Initialized debug state: debug=%1$b"

    .line 361
    new-array v2, v2, [Ljava/lang/Object;

    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    aput-object v1, v2, v0

    invoke-static {v3, v2}, Ltimber/log/Timber;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    :cond_1
    return-void
.end method

.method protected initDeviceRegistration()V
    .locals 1

    .line 559
    iget-object v0, p0, Lcom/ibotta/android/App;->mainComponent:Lcom/ibotta/android/di/MainComponent;

    invoke-interface {v0}, Lcom/ibotta/android/di/MainComponent;->getDeviceRegistrationAsync()Lcom/ibotta/android/async/device/DeviceRegistrationAsync;

    move-result-object v0

    invoke-interface {v0}, Lcom/ibotta/android/async/device/DeviceRegistrationAsync;->registerDevice()V

    return-void
.end method

.method protected initEncryption()V
    .locals 9

    .line 374
    sget-object v0, Lcom/ibotta/android/json/IbottaJsonFactory;->INSTANCE:Lcom/ibotta/android/json/IbottaJsonFactory;

    new-instance v1, Lcom/ibotta/android/security/crypto/key/AppKeyProvider;

    sget-object v2, Lcom/ibotta/android/security/crypto/key/AppKeyProvider$KeyType;->JSON_KEY:Lcom/ibotta/android/security/crypto/key/AppKeyProvider$KeyType;

    invoke-direct {v1, v2}, Lcom/ibotta/android/security/crypto/key/AppKeyProvider;-><init>(Lcom/ibotta/android/security/crypto/key/AppKeyProvider$KeyType;)V

    .line 375
    invoke-virtual {v1}, Lcom/ibotta/android/security/crypto/key/AppKeyProvider;->getKeyString()Ljava/lang/String;

    move-result-object v1

    const-class v2, Lcom/ibotta/api/model/customer/Customer;

    const-class v3, Lcom/ibotta/api/model/customer/CustomerAccount;

    const-class v4, Lcom/ibotta/api/model/customer/CustomerGiftCard;

    const-class v5, Lcom/ibotta/api/model/customer/CustomerLoyalty;

    const-class v6, Lcom/ibotta/api/model/customer/CustomerSocial;

    const-class v7, Lcom/ibotta/api/model/pwi/BgcPaymentAccount;

    const-class v8, Lcom/ibotta/android/state/app/email/EmailStateImpl$LastEmailUsedConfidential;

    .line 378
    invoke-static/range {v2 .. v8}, Ljava9/util/Sets;->of(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/util/Set;

    move-result-object v2

    .line 374
    invoke-virtual {v0, v1, v2}, Lcom/ibotta/android/json/IbottaJsonFactory;->initEncryption(Ljava/lang/String;Ljava/util/Set;)V

    return-void
.end method

.method protected initGeofenceCoordinator()V
    .locals 1

    .line 564
    iget-object v0, p0, Lcom/ibotta/android/App;->mainComponent:Lcom/ibotta/android/di/MainComponent;

    invoke-interface {v0}, Lcom/ibotta/android/di/MainComponent;->getGeofenceCoordinator()Lcom/ibotta/android/location/geofence/GeofenceCoordinator;

    move-result-object v0

    invoke-interface {v0}, Lcom/ibotta/android/location/geofence/GeofenceCoordinator;->onAppStart()V

    return-void
.end method

.method protected initGeofenceModule()V
    .locals 4

    .line 568
    sget-object v0, Lcom/ibotta/android/location/geofence/GeofenceModule;->INSTANCE:Lcom/ibotta/android/location/geofence/GeofenceModule;

    iget-object v1, p0, Lcom/ibotta/android/App;->mainComponent:Lcom/ibotta/android/di/MainComponent;

    .line 569
    invoke-interface {v1}, Lcom/ibotta/android/di/MainComponent;->getDebugState()Lcom/ibotta/android/state/app/debug/DebugState;

    move-result-object v1

    iget-object v2, p0, Lcom/ibotta/android/App;->mainComponent:Lcom/ibotta/android/di/MainComponent;

    invoke-interface {v2}, Lcom/ibotta/android/di/MainComponent;->getPermissionsState()Lcom/ibotta/android/state/app/permissions/PermissionsState;

    move-result-object v2

    iget-object v3, p0, Lcom/ibotta/android/App;->mainComponent:Lcom/ibotta/android/di/MainComponent;

    invoke-interface {v3}, Lcom/ibotta/android/di/MainComponent;->getUserState()Lcom/ibotta/android/state/user/UserState;

    move-result-object v3

    .line 568
    invoke-virtual {v0, v1, v2, v3}, Lcom/ibotta/android/location/geofence/GeofenceModule;->init(Lcom/ibotta/android/state/app/debug/DebugState;Lcom/ibotta/android/state/app/permissions/PermissionsState;Lcom/ibotta/android/state/user/UserState;)V

    return-void
.end method

.method protected initLifecycleTracker()V
    .locals 1

    .line 573
    iget-object v0, p0, Lcom/ibotta/android/App;->mainComponent:Lcom/ibotta/android/di/MainComponent;

    invoke-interface {v0}, Lcom/ibotta/android/di/MainComponent;->getLifecycleTracker()Lcom/ibotta/android/tracking/sdk/LifecycleTracker;

    move-result-object v0

    invoke-interface {v0}, Lcom/ibotta/android/tracking/sdk/LifecycleTracker;->init()V

    return-void
.end method

.method protected initLogging()V
    .locals 2

    .line 401
    sget-boolean v0, Lcom/ibotta/android/App;->DEBUG:Z

    if-eqz v0, :cond_0

    .line 402
    new-instance v0, Lcom/ibotta/android/timber/IbottaTree;

    invoke-direct {v0}, Lcom/ibotta/android/timber/IbottaTree;-><init>()V

    invoke-static {v0}, Ltimber/log/Timber;->plant(Ltimber/log/Timber$Tree;)V

    goto :goto_0

    .line 404
    :cond_0
    new-instance v0, Lcom/ibotta/android/timber/IbottaReleaseTree;

    invoke-direct {v0}, Lcom/ibotta/android/timber/IbottaReleaseTree;-><init>()V

    invoke-static {v0}, Ltimber/log/Timber;->plant(Ltimber/log/Timber$Tree;)V

    .line 407
    :goto_0
    new-instance v0, Lcom/ibotta/android/api/TimberLoggingImpl;

    invoke-direct {v0}, Lcom/ibotta/android/api/TimberLoggingImpl;-><init>()V

    invoke-static {v0}, Lcom/ibotta/android/logging/IbottaLogger;->initLogger(Lcom/ibotta/android/logging/Logger;)V

    const-string v0, "Initialized logging"

    const/4 v1, 0x0

    .line 409
    new-array v1, v1, [Ljava/lang/Object;

    invoke-static {v0, v1}, Ltimber/log/Timber;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    return-void
.end method

.method protected initStetho()V
    .locals 2

    .line 416
    iget-object v0, p0, Lcom/ibotta/android/App;->mainComponent:Lcom/ibotta/android/di/MainComponent;

    invoke-interface {v0}, Lcom/ibotta/android/di/MainComponent;->getBuildProfile()Lcom/ibotta/android/profile/BuildProfile;

    move-result-object v0

    invoke-interface {v0}, Lcom/ibotta/android/profile/BuildProfile;->isStethoEnabled()Z

    move-result v0

    if-nez v0, :cond_0

    return-void

    .line 421
    :cond_0
    invoke-static {p0}, Lcom/facebook/stetho/Stetho;->newInitializerBuilder(Landroid/content/Context;)Lcom/facebook/stetho/Stetho$InitializerBuilder;

    move-result-object v0

    .line 422
    invoke-static {p0}, Lcom/facebook/stetho/Stetho;->defaultDumperPluginsProvider(Landroid/content/Context;)Lcom/facebook/stetho/DumperPluginsProvider;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/facebook/stetho/Stetho$InitializerBuilder;->enableDumpapp(Lcom/facebook/stetho/DumperPluginsProvider;)Lcom/facebook/stetho/Stetho$InitializerBuilder;

    move-result-object v0

    .line 423
    invoke-static {p0}, Lcom/facebook/stetho/Stetho;->defaultInspectorModulesProvider(Landroid/content/Context;)Lcom/facebook/stetho/InspectorModulesProvider;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/facebook/stetho/Stetho$InitializerBuilder;->enableWebKitInspector(Lcom/facebook/stetho/InspectorModulesProvider;)Lcom/facebook/stetho/Stetho$InitializerBuilder;

    move-result-object v0

    .line 424
    invoke-virtual {v0}, Lcom/facebook/stetho/Stetho$InitializerBuilder;->build()Lcom/facebook/stetho/Stetho$Initializer;

    move-result-object v0

    .line 420
    invoke-static {v0}, Lcom/facebook/stetho/Stetho;->initialize(Lcom/facebook/stetho/Stetho$Initializer;)V

    return-void
.end method

.method protected initTracker()V
    .locals 1

    .line 394
    iget-object v0, p0, Lcom/ibotta/android/App;->mainComponent:Lcom/ibotta/android/di/MainComponent;

    invoke-interface {v0}, Lcom/ibotta/android/di/MainComponent;->getTracker()Lcom/ibotta/android/tracking/Tracker;

    move-result-object v0

    invoke-interface {v0}, Lcom/ibotta/android/tracking/Tracker;->init()V

    return-void
.end method

.method protected initUncaughtHandler()V
    .locals 1

    .line 336
    iget-object v0, p0, Lcom/ibotta/android/App;->defaultHandler:Ljava/lang/Thread$UncaughtExceptionHandler;

    if-eqz v0, :cond_0

    return-void

    .line 339
    :cond_0
    invoke-static {}, Ljava/lang/Thread;->getDefaultUncaughtExceptionHandler()Ljava/lang/Thread$UncaughtExceptionHandler;

    move-result-object v0

    iput-object v0, p0, Lcom/ibotta/android/App;->defaultHandler:Ljava/lang/Thread$UncaughtExceptionHandler;

    .line 342
    iget-object v0, p0, Lcom/ibotta/android/App;->ibottaUncaughtHandler:Ljava/lang/Thread$UncaughtExceptionHandler;

    invoke-static {v0}, Ljava/lang/Thread;->setDefaultUncaughtExceptionHandler(Ljava/lang/Thread$UncaughtExceptionHandler;)V

    return-void
.end method

.method public onCreate()V
    .locals 1

    .line 171
    invoke-super {p0}, Landroid/support/multidex/MultiDexApplication;->onCreate()V

    .line 173
    sput-object p0, Lcom/ibotta/android/App;->instance:Lcom/ibotta/android/App;

    const/4 v0, 0x1

    .line 175
    invoke-static {v0}, Landroid/support/v7/app/AppCompatDelegate;->setCompatVectorFromResourcesEnabled(Z)V

    .line 177
    invoke-virtual {p0}, Lcom/ibotta/android/App;->init()V

    return-void
.end method
