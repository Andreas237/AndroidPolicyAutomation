.class public Lcom/launchdarkly/android/LDClient;
.super Ljava/lang/Object;
.source "LDClient.java"

# interfaces
.implements Lcom/launchdarkly/android/LDClientInterface;
.implements Ljava/io/Closeable;


# static fields
.field private static final INSTANCE_ID_KEY:Ljava/lang/String; = "instanceId"

.field private static final MAX_RETRY_TIME_MS:J = 0x36ee80L

.field private static final RETRY_TIME_MS:J = 0x3e8L

.field private static instanceId:Ljava/lang/String; = "UNKNOWN_ANDROID"

.field private static instances:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Lcom/launchdarkly/android/LDClient;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field private final application:Ljava/lang/ref/WeakReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ref/WeakReference<",
            "Landroid/app/Application;",
            ">;"
        }
    .end annotation
.end field

.field private final config:Lcom/launchdarkly/android/LDConfig;

.field private connectivityReceiver:Lcom/launchdarkly/android/ConnectivityReceiver;

.field private final environmentName:Ljava/lang/String;

.field private final eventProcessor:Lcom/launchdarkly/android/EventProcessor;

.field private final fetcher:Lcom/launchdarkly/android/FeatureFlagFetcher;

.field private volatile isAppForegrounded:Z

.field private volatile isOffline:Z

.field private final throttler:Lcom/launchdarkly/android/Throttler;

.field private final updateProcessor:Lcom/launchdarkly/android/UpdateProcessor;

.field private final userManager:Lcom/launchdarkly/android/UserManager;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method protected constructor <init>(Landroid/app/Application;Lcom/launchdarkly/android/LDConfig;)V
    .locals 1
    .param p2    # Lcom/launchdarkly/android/LDConfig;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .annotation build Lcom/google/common/annotations/VisibleForTesting;
    .end annotation

    const-string v0, "default"

    .line 257
    invoke-direct {p0, p1, p2, v0}, Lcom/launchdarkly/android/LDClient;-><init>(Landroid/app/Application;Lcom/launchdarkly/android/LDConfig;Ljava/lang/String;)V

    return-void
.end method

.method protected constructor <init>(Landroid/app/Application;Lcom/launchdarkly/android/LDConfig;Ljava/lang/String;)V
    .locals 8
    .param p2    # Lcom/launchdarkly/android/LDConfig;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .annotation build Lcom/google/common/annotations/VisibleForTesting;
    .end annotation

    .line 261
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    .line 77
    iput-boolean v0, p0, Lcom/launchdarkly/android/LDClient;->isOffline:Z

    const/4 v1, 0x1

    .line 78
    iput-boolean v1, p0, Lcom/launchdarkly/android/LDClient;->isAppForegrounded:Z

    const-string v2, "Creating LaunchDarkly client. Version: %s"

    .line 262
    new-array v1, v1, [Ljava/lang/Object;

    const-string v3, "2.6.0"

    aput-object v3, v1, v0

    invoke-static {v2, v1}, Ltimber/log/Timber;->i(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 263
    iput-object p2, p0, Lcom/launchdarkly/android/LDClient;->config:Lcom/launchdarkly/android/LDConfig;

    .line 264
    invoke-virtual {p2}, Lcom/launchdarkly/android/LDConfig;->isOffline()Z

    move-result v1

    iput-boolean v1, p0, Lcom/launchdarkly/android/LDClient;->isOffline:Z

    .line 265
    new-instance v1, Ljava/lang/ref/WeakReference;

    invoke-direct {v1, p1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iput-object v1, p0, Lcom/launchdarkly/android/LDClient;->application:Ljava/lang/ref/WeakReference;

    .line 266
    iput-object p3, p0, Lcom/launchdarkly/android/LDClient;->environmentName:Ljava/lang/String;

    .line 267
    invoke-static {p1, p2, p3}, Lcom/launchdarkly/android/HttpFeatureFlagFetcher;->newInstance(Landroid/content/Context;Lcom/launchdarkly/android/LDConfig;Ljava/lang/String;)Lcom/launchdarkly/android/HttpFeatureFlagFetcher;

    move-result-object v1

    iput-object v1, p0, Lcom/launchdarkly/android/LDClient;->fetcher:Lcom/launchdarkly/android/FeatureFlagFetcher;

    .line 268
    iget-object v1, p0, Lcom/launchdarkly/android/LDClient;->fetcher:Lcom/launchdarkly/android/FeatureFlagFetcher;

    invoke-virtual {p2}, Lcom/launchdarkly/android/LDConfig;->getMobileKeys()Ljava/util/Map;

    move-result-object v2

    invoke-interface {v2, p3}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    invoke-static {p1, v1, p3, v2}, Lcom/launchdarkly/android/UserManager;->newInstance(Landroid/app/Application;Lcom/launchdarkly/android/FeatureFlagFetcher;Ljava/lang/String;Ljava/lang/String;)Lcom/launchdarkly/android/UserManager;

    move-result-object v1

    iput-object v1, p0, Lcom/launchdarkly/android/LDClient;->userManager:Lcom/launchdarkly/android/UserManager;

    .line 270
    invoke-static {p1}, Lcom/launchdarkly/android/Foreground;->get(Landroid/app/Application;)Lcom/launchdarkly/android/Foreground;

    move-result-object v1

    .line 271
    new-instance v2, Lcom/launchdarkly/android/LDClient$2;

    invoke-direct {v2, p0, p1, p3}, Lcom/launchdarkly/android/LDClient$2;-><init>(Lcom/launchdarkly/android/LDClient;Landroid/app/Application;Ljava/lang/String;)V

    .line 288
    invoke-virtual {v1, v2}, Lcom/launchdarkly/android/Foreground;->addListener(Lcom/launchdarkly/android/Foreground$Listener;)V

    .line 290
    invoke-virtual {p2}, Lcom/launchdarkly/android/LDConfig;->isStream()Z

    move-result v1

    if-eqz v1, :cond_0

    .line 291
    new-instance v0, Lcom/launchdarkly/android/StreamUpdateProcessor;

    iget-object v1, p0, Lcom/launchdarkly/android/LDClient;->userManager:Lcom/launchdarkly/android/UserManager;

    invoke-direct {v0, p2, v1, p3}, Lcom/launchdarkly/android/StreamUpdateProcessor;-><init>(Lcom/launchdarkly/android/LDConfig;Lcom/launchdarkly/android/UserManager;Ljava/lang/String;)V

    iput-object v0, p0, Lcom/launchdarkly/android/LDClient;->updateProcessor:Lcom/launchdarkly/android/UpdateProcessor;

    goto :goto_0

    :cond_0
    const-string v1, "Streaming is disabled. Starting LaunchDarkly Client in polling mode"

    .line 293
    new-array v0, v0, [Ljava/lang/Object;

    invoke-static {v1, v0}, Ltimber/log/Timber;->i(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 294
    new-instance v0, Lcom/launchdarkly/android/PollingUpdateProcessor;

    iget-object v1, p0, Lcom/launchdarkly/android/LDClient;->userManager:Lcom/launchdarkly/android/UserManager;

    invoke-direct {v0, p1, v1, p2}, Lcom/launchdarkly/android/PollingUpdateProcessor;-><init>(Landroid/content/Context;Lcom/launchdarkly/android/UserManager;Lcom/launchdarkly/android/LDConfig;)V

    iput-object v0, p0, Lcom/launchdarkly/android/LDClient;->updateProcessor:Lcom/launchdarkly/android/UpdateProcessor;

    .line 296
    :goto_0
    new-instance v0, Lcom/launchdarkly/android/EventProcessor;

    iget-object v1, p0, Lcom/launchdarkly/android/LDClient;->userManager:Lcom/launchdarkly/android/UserManager;

    invoke-virtual {v1}, Lcom/launchdarkly/android/UserManager;->getSummaryEventSharedPreferences()Lcom/launchdarkly/android/response/SummaryEventSharedPreferences;

    move-result-object v1

    invoke-direct {v0, p1, p2, v1, p3}, Lcom/launchdarkly/android/EventProcessor;-><init>(Landroid/content/Context;Lcom/launchdarkly/android/LDConfig;Lcom/launchdarkly/android/response/SummaryEventSharedPreferences;Ljava/lang/String;)V

    iput-object v0, p0, Lcom/launchdarkly/android/LDClient;->eventProcessor:Lcom/launchdarkly/android/EventProcessor;

    .line 298
    new-instance p2, Lcom/launchdarkly/android/Throttler;

    new-instance v3, Lcom/launchdarkly/android/LDClient$3;

    invoke-direct {v3, p0}, Lcom/launchdarkly/android/LDClient$3;-><init>(Lcom/launchdarkly/android/LDClient;)V

    const-wide/16 v4, 0x3e8

    const-wide/32 v6, 0x36ee80

    move-object v2, p2

    invoke-direct/range {v2 .. v7}, Lcom/launchdarkly/android/Throttler;-><init>(Ljava/lang/Runnable;JJ)V

    iput-object p2, p0, Lcom/launchdarkly/android/LDClient;->throttler:Lcom/launchdarkly/android/Throttler;

    .line 305
    sget p2, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 p3, 0x18

    if-lt p2, p3, :cond_1

    .line 306
    new-instance p2, Lcom/launchdarkly/android/ConnectivityReceiver;

    invoke-direct {p2}, Lcom/launchdarkly/android/ConnectivityReceiver;-><init>()V

    iput-object p2, p0, Lcom/launchdarkly/android/LDClient;->connectivityReceiver:Lcom/launchdarkly/android/ConnectivityReceiver;

    .line 307
    new-instance p2, Landroid/content/IntentFilter;

    const-string p3, "android.net.conn.CONNECTIVITY_CHANGE"

    invoke-direct {p2, p3}, Landroid/content/IntentFilter;-><init>(Ljava/lang/String;)V

    .line 308
    iget-object p3, p0, Lcom/launchdarkly/android/LDClient;->connectivityReceiver:Lcom/launchdarkly/android/ConnectivityReceiver;

    invoke-virtual {p1, p3, p2}, Landroid/app/Application;->registerReceiver(Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;)Landroid/content/Intent;

    :cond_1
    return-void
.end method

.method static synthetic access$000()Ljava/util/Map;
    .locals 1

    .line 57
    sget-object v0, Lcom/launchdarkly/android/LDClient;->instances:Ljava/util/Map;

    return-object v0
.end method

.method static synthetic access$102(Lcom/launchdarkly/android/LDClient;Z)Z
    .locals 0

    .line 57
    iput-boolean p1, p0, Lcom/launchdarkly/android/LDClient;->isAppForegrounded:Z

    return p1
.end method

.method static synthetic access$200(Lcom/launchdarkly/android/LDClient;)V
    .locals 0

    .line 57
    invoke-direct {p0}, Lcom/launchdarkly/android/LDClient;->setOnlineStatus()V

    return-void
.end method

.method private static closeInstances()V
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 722
    sget-object v0, Lcom/launchdarkly/android/LDClient;->instances:Ljava/util/Map;

    invoke-interface {v0}, Ljava/util/Map;->values()Ljava/util/Collection;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v0

    const/4 v1, 0x0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/launchdarkly/android/LDClient;

    .line 724
    :try_start_0
    invoke-direct {v2}, Lcom/launchdarkly/android/LDClient;->closeInternal()V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v1

    goto :goto_0

    :cond_0
    if-nez v1, :cond_1

    return-void

    .line 730
    :cond_1
    throw v1
.end method

.method private closeInternal()V
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 713
    iget-object v0, p0, Lcom/launchdarkly/android/LDClient;->updateProcessor:Lcom/launchdarkly/android/UpdateProcessor;

    invoke-interface {v0}, Lcom/launchdarkly/android/UpdateProcessor;->stop()V

    .line 714
    iget-object v0, p0, Lcom/launchdarkly/android/LDClient;->eventProcessor:Lcom/launchdarkly/android/EventProcessor;

    invoke-virtual {v0}, Lcom/launchdarkly/android/EventProcessor;->close()V

    .line 715
    iget-object v0, p0, Lcom/launchdarkly/android/LDClient;->connectivityReceiver:Lcom/launchdarkly/android/ConnectivityReceiver;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/launchdarkly/android/LDClient;->application:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 716
    iget-object v0, p0, Lcom/launchdarkly/android/LDClient;->application:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/app/Application;

    iget-object v1, p0, Lcom/launchdarkly/android/LDClient;->connectivityReceiver:Lcom/launchdarkly/android/ConnectivityReceiver;

    invoke-virtual {v0, v1}, Landroid/app/Application;->unregisterReceiver(Landroid/content/BroadcastReceiver;)V

    :cond_0
    return-void
.end method

.method private static copySharedPreferences(Landroid/content/SharedPreferences;Landroid/content/SharedPreferences;)Z
    .locals 3

    .line 388
    invoke-interface {p1}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object p1

    .line 390
    invoke-interface {p0}, Landroid/content/SharedPreferences;->getAll()Ljava/util/Map;

    move-result-object p0

    invoke-interface {p0}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object p0

    invoke-interface {p0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :cond_0
    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_5

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Map$Entry;

    .line 391
    invoke-interface {v0}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v1

    .line 392
    invoke-interface {v0}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    .line 394
    instance-of v2, v1, Ljava/lang/Boolean;

    if-eqz v2, :cond_1

    .line 395
    check-cast v1, Ljava/lang/Boolean;

    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v1

    invoke-interface {p1, v0, v1}, Landroid/content/SharedPreferences$Editor;->putBoolean(Ljava/lang/String;Z)Landroid/content/SharedPreferences$Editor;

    goto :goto_0

    .line 396
    :cond_1
    instance-of v2, v1, Ljava/lang/Float;

    if-eqz v2, :cond_2

    .line 397
    check-cast v1, Ljava/lang/Float;

    invoke-virtual {v1}, Ljava/lang/Float;->floatValue()F

    move-result v1

    invoke-interface {p1, v0, v1}, Landroid/content/SharedPreferences$Editor;->putFloat(Ljava/lang/String;F)Landroid/content/SharedPreferences$Editor;

    goto :goto_0

    .line 398
    :cond_2
    instance-of v2, v1, Ljava/lang/Integer;

    if-eqz v2, :cond_3

    .line 399
    check-cast v1, Ljava/lang/Integer;

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    invoke-interface {p1, v0, v1}, Landroid/content/SharedPreferences$Editor;->putInt(Ljava/lang/String;I)Landroid/content/SharedPreferences$Editor;

    goto :goto_0

    .line 400
    :cond_3
    instance-of v2, v1, Ljava/lang/Long;

    if-eqz v2, :cond_4

    .line 401
    check-cast v1, Ljava/lang/Long;

    invoke-virtual {v1}, Ljava/lang/Long;->longValue()J

    move-result-wide v1

    invoke-interface {p1, v0, v1, v2}, Landroid/content/SharedPreferences$Editor;->putLong(Ljava/lang/String;J)Landroid/content/SharedPreferences$Editor;

    goto :goto_0

    .line 402
    :cond_4
    instance-of v2, v1, Ljava/lang/String;

    if-eqz v2, :cond_0

    .line 403
    check-cast v1, Ljava/lang/String;

    invoke-interface {p1, v0, v1}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    goto :goto_0

    .line 406
    :cond_5
    invoke-interface {p1}, Landroid/content/SharedPreferences$Editor;->commit()Z

    move-result p0

    return p0
.end method

.method private static flushInstances()V
    .locals 2

    .line 746
    sget-object v0, Lcom/launchdarkly/android/LDClient;->instances:Ljava/util/Map;

    invoke-interface {v0}, Ljava/util/Map;->values()Ljava/util/Collection;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/launchdarkly/android/LDClient;

    .line 747
    invoke-direct {v1}, Lcom/launchdarkly/android/LDClient;->flushInternal()V

    goto :goto_0

    :cond_0
    return-void
.end method

.method private flushInternal()V
    .locals 1

    .line 742
    iget-object v0, p0, Lcom/launchdarkly/android/LDClient;->eventProcessor:Lcom/launchdarkly/android/EventProcessor;

    invoke-virtual {v0}, Lcom/launchdarkly/android/EventProcessor;->flush()V

    return-void
.end method

.method public static get()Lcom/launchdarkly/android/LDClient;
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/launchdarkly/android/LaunchDarklyException;
        }
    .end annotation

    .line 229
    sget-object v0, Lcom/launchdarkly/android/LDClient;->instances:Ljava/util/Map;

    if-eqz v0, :cond_0

    const-string v1, "default"

    .line 233
    invoke-interface {v0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/launchdarkly/android/LDClient;

    return-object v0

    :cond_0
    const/4 v0, 0x0

    .line 230
    new-array v0, v0, [Ljava/lang/Object;

    const-string v1, "LDClient.get() was called before init()!"

    invoke-static {v1, v0}, Ltimber/log/Timber;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 231
    new-instance v0, Lcom/launchdarkly/android/LaunchDarklyException;

    const-string v1, "LDClient.get() was called before init()!"

    invoke-direct {v0, v1}, Lcom/launchdarkly/android/LaunchDarklyException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method static getEnvironmentNames()Ljava/util/Set;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Set<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/launchdarkly/android/LaunchDarklyException;
        }
    .end annotation

    .line 237
    sget-object v0, Lcom/launchdarkly/android/LDClient;->instances:Ljava/util/Map;

    if-eqz v0, :cond_0

    .line 241
    invoke-interface {v0}, Ljava/util/Map;->keySet()Ljava/util/Set;

    move-result-object v0

    return-object v0

    :cond_0
    const/4 v0, 0x0

    .line 238
    new-array v0, v0, [Ljava/lang/Object;

    const-string v1, "LDClient.getEnvironmentNames() was called before init()!"

    invoke-static {v1, v0}, Ltimber/log/Timber;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 239
    new-instance v0, Lcom/launchdarkly/android/LaunchDarklyException;

    const-string v1, "LDClient.getEnvironmentNames() was called before init()!"

    invoke-direct {v0, v1}, Lcom/launchdarkly/android/LaunchDarklyException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public static getForMobileKey(Ljava/lang/String;)Lcom/launchdarkly/android/LDClient;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/launchdarkly/android/LaunchDarklyException;
        }
    .end annotation

    .line 245
    sget-object v0, Lcom/launchdarkly/android/LDClient;->instances:Ljava/util/Map;

    if-eqz v0, :cond_1

    .line 249
    invoke-interface {v0, p0}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 252
    sget-object v0, Lcom/launchdarkly/android/LDClient;->instances:Ljava/util/Map;

    invoke-interface {v0, p0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/launchdarkly/android/LDClient;

    return-object p0

    .line 250
    :cond_0
    new-instance p0, Lcom/launchdarkly/android/LaunchDarklyException;

    const-string v0, "LDClient.getForMobileKey() called with invalid keyName"

    invoke-direct {p0, v0}, Lcom/launchdarkly/android/LaunchDarklyException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_1
    const/4 p0, 0x0

    .line 246
    new-array p0, p0, [Ljava/lang/Object;

    const-string v0, "LDClient.getForMobileKey() was called before init()!"

    invoke-static {v0, p0}, Ltimber/log/Timber;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 247
    new-instance p0, Lcom/launchdarkly/android/LaunchDarklyException;

    const-string v0, "LDClient.getForMobileKey() was called before init()!"

    invoke-direct {p0, v0}, Lcom/launchdarkly/android/LaunchDarklyException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method static getInstanceId()Ljava/lang/String;
    .locals 1

    .line 854
    sget-object v0, Lcom/launchdarkly/android/LDClient;->instanceId:Ljava/lang/String;

    return-object v0
.end method

.method private static declared-synchronized identifyInstances(Lcom/launchdarkly/android/LDUser;)Ljava/util/concurrent/Future;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/launchdarkly/android/LDUser;",
            ")",
            "Ljava/util/concurrent/Future<",
            "Ljava/lang/Void;",
            ">;"
        }
    .end annotation

    const-class v0, Lcom/launchdarkly/android/LDClient;

    monitor-enter v0

    if-nez p0, :cond_0

    .line 475
    :try_start_0
    new-instance p0, Lcom/launchdarkly/android/LaunchDarklyException;

    const-string v1, "User cannot be null"

    invoke-direct {p0, v1}, Lcom/launchdarkly/android/LaunchDarklyException;-><init>(Ljava/lang/String;)V

    invoke-static {p0}, Lcom/google/common/util/concurrent/Futures;->immediateFailedFuture(Ljava/lang/Throwable;)Lcom/google/common/util/concurrent/ListenableFuture;

    move-result-object p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v0

    return-object p0

    .line 478
    :cond_0
    :try_start_1
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 480
    sget-object v2, Lcom/launchdarkly/android/LDClient;->instances:Ljava/util/Map;

    invoke-interface {v2}, Ljava/util/Map;->values()Ljava/util/Collection;

    move-result-object v2

    invoke-interface {v2}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_1

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/launchdarkly/android/LDClient;

    .line 481
    invoke-direct {v3, p0}, Lcom/launchdarkly/android/LDClient;->identifyInternal(Lcom/launchdarkly/android/LDUser;)Lcom/google/common/util/concurrent/ListenableFuture;

    move-result-object v3

    invoke-virtual {v1, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 484
    :cond_1
    invoke-static {v1}, Lcom/google/common/util/concurrent/Futures;->allAsList(Ljava/lang/Iterable;)Lcom/google/common/util/concurrent/ListenableFuture;

    move-result-object p0

    new-instance v1, Lcom/launchdarkly/android/LDClient$4;

    invoke-direct {v1}, Lcom/launchdarkly/android/LDClient$4;-><init>()V

    .line 489
    invoke-static {}, Lcom/google/common/util/concurrent/MoreExecutors;->directExecutor()Ljava/util/concurrent/Executor;

    move-result-object v2

    .line 484
    invoke-static {p0, v1, v2}, Lcom/google/common/util/concurrent/Futures;->transform(Lcom/google/common/util/concurrent/ListenableFuture;Lcom/google/common/base/Function;Ljava/util/concurrent/Executor;)Lcom/google/common/util/concurrent/ListenableFuture;

    move-result-object p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    monitor-exit v0

    return-object p0

    :catchall_0
    move-exception p0

    monitor-exit v0

    throw p0
.end method

.method private declared-synchronized identifyInternal(Lcom/launchdarkly/android/LDUser;)Lcom/google/common/util/concurrent/ListenableFuture;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/launchdarkly/android/LDUser;",
            ")",
            "Lcom/google/common/util/concurrent/ListenableFuture<",
            "Ljava/lang/Void;",
            ">;"
        }
    .end annotation

    monitor-enter p0

    if-nez p1, :cond_0

    .line 452
    :try_start_0
    new-instance p1, Lcom/launchdarkly/android/LaunchDarklyException;

    const-string v0, "User cannot be null"

    invoke-direct {p1, v0}, Lcom/launchdarkly/android/LaunchDarklyException;-><init>(Ljava/lang/String;)V

    invoke-static {p1}, Lcom/google/common/util/concurrent/Futures;->immediateFailedFuture(Ljava/lang/Throwable;)Lcom/google/common/util/concurrent/ListenableFuture;

    move-result-object p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-object p1

    .line 455
    :cond_0
    :try_start_1
    invoke-virtual {p1}, Lcom/launchdarkly/android/LDUser;->getKey()Lcom/google/gson/JsonPrimitive;

    move-result-object v0

    if-nez v0, :cond_1

    const-string v0, "identify called with null user or null user key!"

    const/4 v1, 0x0

    .line 456
    new-array v1, v1, [Ljava/lang/Object;

    invoke-static {v0, v1}, Ltimber/log/Timber;->w(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 460
    :cond_1
    iget-object v0, p0, Lcom/launchdarkly/android/LDClient;->userManager:Lcom/launchdarkly/android/UserManager;

    invoke-virtual {v0, p1}, Lcom/launchdarkly/android/UserManager;->setCurrentUser(Lcom/launchdarkly/android/LDUser;)V

    .line 462
    iget-object v0, p0, Lcom/launchdarkly/android/LDClient;->config:Lcom/launchdarkly/android/LDConfig;

    invoke-virtual {v0}, Lcom/launchdarkly/android/LDConfig;->isStream()Z

    move-result v0

    if-nez v0, :cond_2

    .line 463
    iget-object v0, p0, Lcom/launchdarkly/android/LDClient;->userManager:Lcom/launchdarkly/android/UserManager;

    invoke-virtual {v0}, Lcom/launchdarkly/android/UserManager;->updateCurrentUser()Lcom/google/common/util/concurrent/ListenableFuture;

    move-result-object v0

    goto :goto_0

    .line 465
    :cond_2
    iget-object v0, p0, Lcom/launchdarkly/android/LDClient;->updateProcessor:Lcom/launchdarkly/android/UpdateProcessor;

    invoke-interface {v0}, Lcom/launchdarkly/android/UpdateProcessor;->restart()Lcom/google/common/util/concurrent/ListenableFuture;

    move-result-object v0

    .line 468
    :goto_0
    new-instance v1, Lcom/launchdarkly/android/IdentifyEvent;

    invoke-direct {v1, p1}, Lcom/launchdarkly/android/IdentifyEvent;-><init>(Lcom/launchdarkly/android/LDUser;)V

    invoke-direct {p0, v1}, Lcom/launchdarkly/android/LDClient;->sendEvent(Lcom/launchdarkly/android/Event;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 470
    monitor-exit p0

    return-object v0

    :catchall_0
    move-exception p1

    monitor-exit p0

    throw p1
.end method

.method public static declared-synchronized init(Landroid/app/Application;Lcom/launchdarkly/android/LDConfig;Lcom/launchdarkly/android/LDUser;I)Lcom/launchdarkly/android/LDClient;
    .locals 6

    const-class v0, Lcom/launchdarkly/android/LDClient;

    monitor-enter v0

    :try_start_0
    const-string v1, "Initializing Client and waiting up to %s for initialization to complete"

    const/4 v2, 0x1

    .line 212
    new-array v3, v2, [Ljava/lang/Object;

    invoke-static {p3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    const/4 v5, 0x0

    aput-object v4, v3, v5

    invoke-static {v1, v3}, Ltimber/log/Timber;->i(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 213
    invoke-static {p0, p1, p2}, Lcom/launchdarkly/android/LDClient;->init(Landroid/app/Application;Lcom/launchdarkly/android/LDConfig;Lcom/launchdarkly/android/LDUser;)Ljava/util/concurrent/Future;

    move-result-object p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    int-to-long p1, p3

    .line 215
    :try_start_1
    sget-object v1, Ljava/util/concurrent/TimeUnit;->SECONDS:Ljava/util/concurrent/TimeUnit;

    invoke-interface {p0, p1, p2, v1}, Ljava/util/concurrent/Future;->get(JLjava/util/concurrent/TimeUnit;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/launchdarkly/android/LDClient;
    :try_end_1
    .catch Ljava/lang/InterruptedException; {:try_start_1 .. :try_end_1} :catch_2
    .catch Ljava/util/concurrent/ExecutionException; {:try_start_1 .. :try_end_1} :catch_1
    .catch Ljava/util/concurrent/TimeoutException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    monitor-exit v0

    return-object p0

    :catch_0
    :try_start_2
    const-string p0, "Client did not successfully initialize within %s seconds. It could be taking longer than expected to start up"

    .line 219
    new-array p1, v2, [Ljava/lang/Object;

    invoke-static {p3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p2

    aput-object p2, p1, v5

    invoke-static {p0, p1}, Ltimber/log/Timber;->w(Ljava/lang/String;[Ljava/lang/Object;)V

    goto :goto_1

    :catch_1
    move-exception p0

    goto :goto_0

    :catch_2
    move-exception p0

    :goto_0
    const-string p1, "Exception during Client initialization"

    .line 217
    new-array p2, v5, [Ljava/lang/Object;

    invoke-static {p0, p1, p2}, Ltimber/log/Timber;->e(Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 221
    :goto_1
    sget-object p0, Lcom/launchdarkly/android/LDClient;->instances:Ljava/util/Map;

    const-string p1, "default"

    invoke-interface {p0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/launchdarkly/android/LDClient;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    monitor-exit v0

    return-object p0

    :catchall_0
    move-exception p0

    monitor-exit v0

    throw p0
.end method

.method public static declared-synchronized init(Landroid/app/Application;Lcom/launchdarkly/android/LDConfig;Lcom/launchdarkly/android/LDUser;)Ljava/util/concurrent/Future;
    .locals 9
    .param p0    # Landroid/app/Application;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .param p1    # Lcom/launchdarkly/android/LDConfig;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .param p2    # Lcom/launchdarkly/android/LDUser;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/app/Application;",
            "Lcom/launchdarkly/android/LDConfig;",
            "Lcom/launchdarkly/android/LDUser;",
            ")",
            "Ljava/util/concurrent/Future<",
            "Lcom/launchdarkly/android/LDClient;",
            ">;"
        }
    .end annotation

    const-class v0, Lcom/launchdarkly/android/LDClient;

    monitor-enter v0

    .line 96
    :try_start_0
    invoke-static {p0}, Lcom/launchdarkly/android/LDClient;->validateParameter(Ljava/lang/Object;)Z

    move-result v1

    .line 97
    invoke-static {p1}, Lcom/launchdarkly/android/LDClient;->validateParameter(Ljava/lang/Object;)Z

    move-result v2

    .line 98
    invoke-static {p2}, Lcom/launchdarkly/android/LDClient;->validateParameter(Ljava/lang/Object;)Z

    move-result v3

    if-nez v1, :cond_0

    .line 100
    new-instance p0, Lcom/launchdarkly/android/LaunchDarklyException;

    const-string p1, "Client initialization requires a valid application"

    invoke-direct {p0, p1}, Lcom/launchdarkly/android/LaunchDarklyException;-><init>(Ljava/lang/String;)V

    invoke-static {p0}, Lcom/google/common/util/concurrent/Futures;->immediateFailedFuture(Ljava/lang/Throwable;)Lcom/google/common/util/concurrent/ListenableFuture;

    move-result-object p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v0

    return-object p0

    :cond_0
    if-nez v2, :cond_1

    .line 103
    :try_start_1
    new-instance p0, Lcom/launchdarkly/android/LaunchDarklyException;

    const-string p1, "Client initialization requires a valid configuration"

    invoke-direct {p0, p1}, Lcom/launchdarkly/android/LaunchDarklyException;-><init>(Ljava/lang/String;)V

    invoke-static {p0}, Lcom/google/common/util/concurrent/Futures;->immediateFailedFuture(Ljava/lang/Throwable;)Lcom/google/common/util/concurrent/ListenableFuture;

    move-result-object p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    monitor-exit v0

    return-object p0

    :cond_1
    if-nez v3, :cond_2

    .line 106
    :try_start_2
    new-instance p0, Lcom/launchdarkly/android/LaunchDarklyException;

    const-string p1, "Client initialization requires a valid user"

    invoke-direct {p0, p1}, Lcom/launchdarkly/android/LaunchDarklyException;-><init>(Ljava/lang/String;)V

    invoke-static {p0}, Lcom/google/common/util/concurrent/Futures;->immediateFailedFuture(Ljava/lang/Throwable;)Lcom/google/common/util/concurrent/ListenableFuture;

    move-result-object p0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    monitor-exit v0

    return-object p0

    .line 109
    :cond_2
    :try_start_3
    sget-object v1, Lcom/launchdarkly/android/LDClient;->instances:Ljava/util/Map;

    const/4 v2, 0x0

    if-eqz v1, :cond_3

    const-string p0, "LDClient.init() was called more than once! returning primary instance."

    .line 110
    new-array p1, v2, [Ljava/lang/Object;

    invoke-static {p0, p1}, Ltimber/log/Timber;->w(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 111
    invoke-static {}, Lcom/google/common/util/concurrent/SettableFuture;->create()Lcom/google/common/util/concurrent/SettableFuture;

    move-result-object p0

    .line 112
    sget-object p1, Lcom/launchdarkly/android/LDClient;->instances:Ljava/util/Map;

    const-string p2, "default"

    invoke-interface {p1, p2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    invoke-virtual {p0, p1}, Lcom/google/common/util/concurrent/SettableFuture;->set(Ljava/lang/Object;)Z
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 113
    monitor-exit v0

    return-object p0

    :cond_3
    :try_start_4
    const-string v1, "TLSv1.2"

    .line 120
    invoke-static {v1}, Ljavax/net/ssl/SSLContext;->getInstance(Ljava/lang/String;)Ljavax/net/ssl/SSLContext;
    :try_end_4
    .catch Ljava/security/NoSuchAlgorithmException; {:try_start_4 .. :try_end_4} :catch_0
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    goto :goto_0

    :catch_0
    :try_start_5
    const-string v1, "No TLSv1.2 implementation available, attempting patch."

    .line 122
    new-array v3, v2, [Ljava/lang/Object;

    invoke-static {v1, v3}, Ltimber/log/Timber;->w(Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    .line 124
    :try_start_6
    invoke-virtual {p0}, Landroid/app/Application;->getApplicationContext()Landroid/content/Context;

    move-result-object v1

    invoke-static {v1}, Lcom/google/android/gms/security/ProviderInstaller;->installIfNeeded(Landroid/content/Context;)V
    :try_end_6
    .catch Lcom/google/android/gms/common/GooglePlayServicesRepairableException; {:try_start_6 .. :try_end_6} :catch_2
    .catch Lcom/google/android/gms/common/GooglePlayServicesNotAvailableException; {:try_start_6 .. :try_end_6} :catch_1
    .catchall {:try_start_6 .. :try_end_6} :catchall_0

    goto :goto_0

    :catch_1
    :try_start_7
    const-string v1, "Patch failed, no Google Play Services available."

    .line 128
    new-array v3, v2, [Ljava/lang/Object;

    invoke-static {v1, v3}, Ltimber/log/Timber;->w(Ljava/lang/String;[Ljava/lang/Object;)V

    goto :goto_0

    :catch_2
    const-string v1, "Patch failed, Google Play Services too old."

    .line 126
    new-array v3, v2, [Ljava/lang/Object;

    invoke-static {v1, v3}, Ltimber/log/Timber;->w(Ljava/lang/String;[Ljava/lang/Object;)V

    :goto_0
    const-string v1, "connectivity"

    .line 132
    invoke-virtual {p0, v1}, Landroid/app/Application;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/net/ConnectivityManager;

    .line 133
    invoke-virtual {v1}, Landroid/net/ConnectivityManager;->getActiveNetworkInfo()Landroid/net/NetworkInfo;

    move-result-object v1

    const/4 v3, 0x1

    if-eqz v1, :cond_4

    .line 134
    invoke-virtual {v1}, Landroid/net/NetworkInfo;->isConnectedOrConnecting()Z

    move-result v1

    if-eqz v1, :cond_4

    const/4 v1, 0x1

    goto :goto_1

    :cond_4
    const/4 v1, 0x0

    .line 136
    :goto_1
    new-instance v4, Ljava/util/HashMap;

    invoke-direct {v4}, Ljava/util/HashMap;-><init>()V

    sput-object v4, Lcom/launchdarkly/android/LDClient;->instances:Ljava/util/Map;

    .line 138
    new-instance v4, Ljava/util/HashMap;

    invoke-direct {v4}, Ljava/util/HashMap;-><init>()V

    const-string v5, "LaunchDarkly-id"

    .line 141
    invoke-virtual {p0, v5, v2}, Landroid/app/Application;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    move-result-object v5

    const-string v6, "instanceId"

    .line 143
    invoke-interface {v5, v6}, Landroid/content/SharedPreferences;->contains(Ljava/lang/String;)Z

    move-result v6

    if-nez v6, :cond_5

    .line 144
    invoke-static {}, Ljava/util/UUID;->randomUUID()Ljava/util/UUID;

    move-result-object v6

    invoke-virtual {v6}, Ljava/util/UUID;->toString()Ljava/lang/String;

    move-result-object v6

    const-string v7, "Did not find existing instance id. Saving a new one"

    .line 145
    new-array v8, v2, [Ljava/lang/Object;

    invoke-static {v7, v8}, Ltimber/log/Timber;->i(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 146
    invoke-interface {v5}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v7

    const-string v8, "instanceId"

    .line 147
    invoke-interface {v7, v8, v6}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    .line 148
    invoke-interface {v7}, Landroid/content/SharedPreferences$Editor;->apply()V

    :cond_5
    const-string v6, "instanceId"

    .line 151
    sget-object v7, Lcom/launchdarkly/android/LDClient;->instanceId:Ljava/lang/String;

    invoke-interface {v5, v6, v7}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    sput-object v5, Lcom/launchdarkly/android/LDClient;->instanceId:Ljava/lang/String;

    const-string v5, "Using instance id: %s"

    .line 152
    new-array v3, v3, [Ljava/lang/Object;

    sget-object v6, Lcom/launchdarkly/android/LDClient;->instanceId:Ljava/lang/String;

    aput-object v6, v3, v2

    invoke-static {v5, v3}, Ltimber/log/Timber;->i(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 154
    invoke-static {p0, p1}, Lcom/launchdarkly/android/LDClient;->migrateWhenNeeded(Landroid/app/Application;Lcom/launchdarkly/android/LDConfig;)V

    .line 156
    invoke-virtual {p1}, Lcom/launchdarkly/android/LDConfig;->getMobileKeys()Ljava/util/Map;

    move-result-object v2

    invoke-interface {v2}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v2

    invoke-interface {v2}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_6
    :goto_2
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_8

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/util/Map$Entry;

    .line 157
    new-instance v5, Lcom/launchdarkly/android/LDClient;

    invoke-interface {v3}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ljava/lang/String;

    invoke-direct {v5, p0, p1, v6}, Lcom/launchdarkly/android/LDClient;-><init>(Landroid/app/Application;Lcom/launchdarkly/android/LDConfig;Ljava/lang/String;)V

    .line 158
    iget-object v6, v5, Lcom/launchdarkly/android/LDClient;->userManager:Lcom/launchdarkly/android/UserManager;

    invoke-virtual {v6, p2}, Lcom/launchdarkly/android/UserManager;->setCurrentUser(Lcom/launchdarkly/android/LDUser;)V

    .line 160
    sget-object v6, Lcom/launchdarkly/android/LDClient;->instances:Ljava/util/Map;

    invoke-interface {v3}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v7

    invoke-interface {v6, v7, v5}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 162
    invoke-virtual {v5}, Lcom/launchdarkly/android/LDClient;->isOffline()Z

    move-result v6

    if-nez v6, :cond_6

    if-nez v1, :cond_7

    goto :goto_2

    .line 165
    :cond_7
    iget-object v6, v5, Lcom/launchdarkly/android/LDClient;->eventProcessor:Lcom/launchdarkly/android/EventProcessor;

    invoke-virtual {v6}, Lcom/launchdarkly/android/EventProcessor;->start()V

    .line 166
    invoke-interface {v3}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v3

    iget-object v6, v5, Lcom/launchdarkly/android/LDClient;->updateProcessor:Lcom/launchdarkly/android/UpdateProcessor;

    invoke-interface {v6}, Lcom/launchdarkly/android/UpdateProcessor;->start()Lcom/google/common/util/concurrent/ListenableFuture;

    move-result-object v6

    invoke-interface {v4, v3, v6}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 167
    new-instance v3, Lcom/launchdarkly/android/IdentifyEvent;

    invoke-direct {v3, p2}, Lcom/launchdarkly/android/IdentifyEvent;-><init>(Lcom/launchdarkly/android/LDUser;)V

    invoke-direct {v5, v3}, Lcom/launchdarkly/android/LDClient;->sendEvent(Lcom/launchdarkly/android/Event;)V

    goto :goto_2

    .line 170
    :cond_8
    new-instance p0, Ljava/util/ArrayList;

    invoke-direct {p0}, Ljava/util/ArrayList;-><init>()V

    .line 172
    invoke-interface {v4}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_9
    :goto_3
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result p2

    if-eqz p2, :cond_a

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ljava/util/Map$Entry;

    .line 173
    sget-object v1, Lcom/launchdarkly/android/LDClient;->instances:Ljava/util/Map;

    invoke-interface {p2}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v2

    invoke-interface {v1, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/launchdarkly/android/LDClient;

    invoke-virtual {v1}, Lcom/launchdarkly/android/LDClient;->isOffline()Z

    move-result v1

    if-nez v1, :cond_9

    .line 174
    invoke-interface {p2}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object p2

    invoke-virtual {p0, p2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_3

    .line 178
    :cond_a
    invoke-static {p0}, Lcom/google/common/util/concurrent/Futures;->allAsList(Ljava/lang/Iterable;)Lcom/google/common/util/concurrent/ListenableFuture;

    move-result-object p0

    .line 180
    new-instance p1, Lcom/launchdarkly/android/LDClient$1;

    invoke-direct {p1}, Lcom/launchdarkly/android/LDClient$1;-><init>()V

    .line 185
    invoke-static {}, Lcom/google/common/util/concurrent/MoreExecutors;->directExecutor()Ljava/util/concurrent/Executor;

    move-result-object p2

    .line 180
    invoke-static {p0, p1, p2}, Lcom/google/common/util/concurrent/Futures;->transform(Lcom/google/common/util/concurrent/ListenableFuture;Lcom/google/common/base/Function;Ljava/util/concurrent/Executor;)Lcom/google/common/util/concurrent/ListenableFuture;

    move-result-object p0
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_0

    monitor-exit v0

    return-object p0

    :catchall_0
    move-exception p0

    monitor-exit v0

    throw p0
.end method

.method private static migrateWhenNeeded(Landroid/app/Application;Lcom/launchdarkly/android/LDConfig;)V
    .locals 16

    move-object/from16 v0, p0

    const-string v1, "LaunchDarkly-migrations"

    const/4 v2, 0x0

    .line 313
    invoke-virtual {v0, v1, v2}, Landroid/app/Application;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    move-result-object v1

    const-string v3, "v2.6.0"

    .line 315
    invoke-interface {v1, v3}, Landroid/content/SharedPreferences;->contains(Ljava/lang/String;)Z

    move-result v3

    if-nez v3, :cond_c

    const-string v3, "Migrating to v2.6.0 multi-environment shared preferences"

    .line 316
    new-array v4, v2, [Ljava/lang/Object;

    invoke-static {v3, v4}, Ltimber/log/Timber;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 318
    new-instance v3, Ljava/io/File;

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual/range {p0 .. p0}, Landroid/app/Application;->getFilesDir()Ljava/io/File;

    move-result-object v5

    invoke-virtual {v5}, Ljava/io/File;->getParent()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v5, "/shared_prefs/"

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-direct {v3, v4}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 319
    invoke-virtual {v3}, Ljava/io/File;->listFiles()[Ljava/io/File;

    move-result-object v3

    .line 320
    new-instance v4, Ljava/util/ArrayList;

    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    .line 321
    array-length v5, v3

    const/4 v6, 0x0

    :goto_0
    if-ge v6, v5, :cond_1

    aget-object v7, v3, v6

    .line 322
    invoke-virtual {v7}, Ljava/io/File;->isFile()Z

    move-result v8

    if-eqz v8, :cond_0

    .line 323
    invoke-virtual {v7}, Ljava/io/File;->getName()Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v4, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_0
    add-int/lit8 v6, v6, 0x1

    goto :goto_0

    :cond_1
    const-string v3, "LaunchDarkly-id.xml"

    .line 326
    invoke-virtual {v4, v3}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    const-string v3, "LaunchDarkly-users.xml"

    .line 327
    invoke-virtual {v4, v3}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    const-string v3, "LaunchDarkly-version.xml"

    .line 328
    invoke-virtual {v4, v3}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    const-string v3, "LaunchDarkly-active.xml"

    .line 329
    invoke-virtual {v4, v3}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    const-string v3, "LaunchDarkly-summaryevents.xml"

    .line 330
    invoke-virtual {v4, v3}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    const-string v3, "LaunchDarkly-migrations.xml"

    .line 331
    invoke-virtual {v4, v3}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    .line 333
    invoke-virtual {v4}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v3

    .line 334
    :cond_2
    :goto_1
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_6

    .line 335
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/lang/String;

    const-string v6, "LaunchDarkly-"

    .line 336
    invoke-virtual {v5, v6}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v6

    if-eqz v6, :cond_5

    const-string v6, ".xml"

    invoke-virtual {v5, v6}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    move-result v6

    if-nez v6, :cond_3

    goto :goto_2

    .line 340
    :cond_3
    invoke-virtual/range {p1 .. p1}, Lcom/launchdarkly/android/LDConfig;->getMobileKeys()Ljava/util/Map;

    move-result-object v6

    invoke-interface {v6}, Ljava/util/Map;->values()Ljava/util/Collection;

    move-result-object v6

    invoke-interface {v6}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v6

    :cond_4
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    move-result v7

    if-eqz v7, :cond_2

    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ljava/lang/String;

    .line 341
    invoke-virtual {v5, v7}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v7

    if-eqz v7, :cond_4

    .line 342
    invoke-interface {v3}, Ljava/util/Iterator;->remove()V

    goto :goto_1

    .line 337
    :cond_5
    :goto_2
    invoke-interface {v3}, Ljava/util/Iterator;->remove()V

    goto :goto_1

    .line 348
    :cond_6
    new-instance v3, Ljava/util/ArrayList;

    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    .line 349
    invoke-virtual {v4}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :goto_3
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_7

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/lang/String;

    const/16 v6, 0xd

    .line 350
    invoke-virtual {v5}, Ljava/lang/String;->length()I

    move-result v7

    add-int/lit8 v7, v7, -0x4

    invoke-virtual {v5, v6, v7}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v3, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_3

    .line 354
    :cond_7
    invoke-virtual/range {p1 .. p1}, Lcom/launchdarkly/android/LDConfig;->getMobileKeys()Ljava/util/Map;

    move-result-object v4

    invoke-interface {v4}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v4

    invoke-interface {v4}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v4

    const/4 v6, 0x1

    :goto_4
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v7

    if-eqz v7, :cond_b

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ljava/util/Map$Entry;

    .line 355
    invoke-interface {v7}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ljava/lang/String;

    const-string v8, "LaunchDarkly-users"

    .line 356
    invoke-virtual {v0, v8, v2}, Landroid/app/Application;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    move-result-object v8

    new-instance v9, Ljava/lang/StringBuilder;

    invoke-direct {v9}, Ljava/lang/StringBuilder;-><init>()V

    const-string v10, "LaunchDarkly-"

    invoke-virtual {v9, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v9, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v10, "-users"

    invoke-virtual {v9, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v9}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v9

    .line 357
    invoke-virtual {v0, v9, v2}, Landroid/app/Application;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    move-result-object v9

    .line 356
    invoke-static {v8, v9}, Lcom/launchdarkly/android/LDClient;->copySharedPreferences(Landroid/content/SharedPreferences;Landroid/content/SharedPreferences;)Z

    move-result v8

    const-string v9, "LaunchDarkly-version"

    .line 358
    invoke-virtual {v0, v9, v2}, Landroid/app/Application;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    move-result-object v9

    new-instance v10, Ljava/lang/StringBuilder;

    invoke-direct {v10}, Ljava/lang/StringBuilder;-><init>()V

    const-string v11, "LaunchDarkly-"

    invoke-virtual {v10, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v10, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v11, "-version"

    invoke-virtual {v10, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v10}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v10

    .line 359
    invoke-virtual {v0, v10, v2}, Landroid/app/Application;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    move-result-object v10

    .line 358
    invoke-static {v9, v10}, Lcom/launchdarkly/android/LDClient;->copySharedPreferences(Landroid/content/SharedPreferences;Landroid/content/SharedPreferences;)Z

    move-result v9

    const-string v10, "LaunchDarkly-active"

    .line 360
    invoke-virtual {v0, v10, v2}, Landroid/app/Application;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    move-result-object v10

    new-instance v11, Ljava/lang/StringBuilder;

    invoke-direct {v11}, Ljava/lang/StringBuilder;-><init>()V

    const-string v12, "LaunchDarkly-"

    invoke-virtual {v11, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v11, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v12, "-active"

    invoke-virtual {v11, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v11}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v11

    .line 361
    invoke-virtual {v0, v11, v2}, Landroid/app/Application;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    move-result-object v11

    .line 360
    invoke-static {v10, v11}, Lcom/launchdarkly/android/LDClient;->copySharedPreferences(Landroid/content/SharedPreferences;Landroid/content/SharedPreferences;)Z

    move-result v10

    .line 363
    invoke-virtual {v3}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v11

    const/4 v12, 0x1

    :goto_5
    invoke-interface {v11}, Ljava/util/Iterator;->hasNext()Z

    move-result v13

    if-eqz v13, :cond_9

    invoke-interface {v11}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v13

    check-cast v13, Ljava/lang/String;

    .line 364
    new-instance v14, Ljava/lang/StringBuilder;

    invoke-direct {v14}, Ljava/lang/StringBuilder;-><init>()V

    const-string v15, "LaunchDarkly-"

    invoke-virtual {v14, v15}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v14, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v14}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v14

    invoke-virtual {v0, v14, v2}, Landroid/app/Application;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    move-result-object v14

    new-instance v15, Ljava/lang/StringBuilder;

    invoke-direct {v15}, Ljava/lang/StringBuilder;-><init>()V

    const-string v5, "LaunchDarkly-"

    invoke-virtual {v15, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v15, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v15, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v5, "-user"

    invoke-virtual {v15, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v15}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    .line 365
    invoke-virtual {v0, v5, v2}, Landroid/app/Application;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    move-result-object v5

    .line 364
    invoke-static {v14, v5}, Lcom/launchdarkly/android/LDClient;->copySharedPreferences(Landroid/content/SharedPreferences;Landroid/content/SharedPreferences;)Z

    move-result v5

    if-eqz v12, :cond_8

    if-eqz v5, :cond_8

    const/4 v12, 0x1

    goto :goto_5

    :cond_8
    const/4 v12, 0x0

    goto :goto_5

    :cond_9
    if-eqz v6, :cond_a

    if-eqz v8, :cond_a

    if-eqz v9, :cond_a

    if-eqz v10, :cond_a

    if-eqz v12, :cond_a

    const/4 v6, 0x1

    goto/16 :goto_4

    :cond_a
    const/4 v6, 0x0

    goto/16 :goto_4

    :cond_b
    if-eqz v6, :cond_c

    const-string v4, "Migration to v2.6.0 multi-environment shared preferences successful"

    .line 372
    new-array v5, v2, [Ljava/lang/Object;

    invoke-static {v4, v5}, Ltimber/log/Timber;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 373
    invoke-interface {v1}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v1

    const-string v4, "v2.6.0"

    const-string v5, "v2.6.0"

    invoke-interface {v1, v4, v5}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    move-result-object v1

    invoke-interface {v1}, Landroid/content/SharedPreferences$Editor;->commit()Z

    move-result v1

    if-eqz v1, :cond_c

    const-string v1, "LaunchDarkly-users"

    .line 375
    invoke-virtual {v0, v1, v2}, Landroid/app/Application;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    move-result-object v1

    invoke-interface {v1}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v1

    invoke-interface {v1}, Landroid/content/SharedPreferences$Editor;->clear()Landroid/content/SharedPreferences$Editor;

    move-result-object v1

    invoke-interface {v1}, Landroid/content/SharedPreferences$Editor;->apply()V

    const-string v1, "LaunchDarkly-version"

    .line 376
    invoke-virtual {v0, v1, v2}, Landroid/app/Application;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    move-result-object v1

    invoke-interface {v1}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v1

    invoke-interface {v1}, Landroid/content/SharedPreferences$Editor;->clear()Landroid/content/SharedPreferences$Editor;

    move-result-object v1

    invoke-interface {v1}, Landroid/content/SharedPreferences$Editor;->apply()V

    const-string v1, "LaunchDarkly-active"

    .line 377
    invoke-virtual {v0, v1, v2}, Landroid/app/Application;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    move-result-object v1

    invoke-interface {v1}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v1

    invoke-interface {v1}, Landroid/content/SharedPreferences$Editor;->clear()Landroid/content/SharedPreferences$Editor;

    move-result-object v1

    invoke-interface {v1}, Landroid/content/SharedPreferences$Editor;->apply()V

    const-string v1, "LaunchDarkly-summaryevents"

    .line 378
    invoke-virtual {v0, v1, v2}, Landroid/app/Application;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    move-result-object v1

    invoke-interface {v1}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v1

    invoke-interface {v1}, Landroid/content/SharedPreferences$Editor;->clear()Landroid/content/SharedPreferences$Editor;

    move-result-object v1

    invoke-interface {v1}, Landroid/content/SharedPreferences$Editor;->apply()V

    .line 379
    invoke-virtual {v3}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_6
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_c

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/String;

    .line 380
    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    const-string v5, "LaunchDarkly-"

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0, v3, v2}, Landroid/app/Application;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    move-result-object v3

    invoke-interface {v3}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v3

    invoke-interface {v3}, Landroid/content/SharedPreferences$Editor;->clear()Landroid/content/SharedPreferences$Editor;

    move-result-object v3

    invoke-interface {v3}, Landroid/content/SharedPreferences$Editor;->apply()V

    goto :goto_6

    :cond_c
    return-void
.end method

.method private sendEvent(Lcom/launchdarkly/android/Event;)V
    .locals 1

    .line 895
    invoke-virtual {p0}, Lcom/launchdarkly/android/LDClient;->isOffline()Z

    move-result v0

    if-nez v0, :cond_0

    .line 896
    iget-object v0, p0, Lcom/launchdarkly/android/LDClient;->eventProcessor:Lcom/launchdarkly/android/EventProcessor;

    invoke-virtual {v0, p1}, Lcom/launchdarkly/android/EventProcessor;->sendEvent(Lcom/launchdarkly/android/Event;)Z

    move-result p1

    if-nez p1, :cond_0

    const-string p1, "Exceeded event queue capacity. Increase capacity to avoid dropping events."

    const/4 v0, 0x0

    .line 898
    new-array v0, v0, [Ljava/lang/Object;

    invoke-static {p1, v0}, Ltimber/log/Timber;->w(Ljava/lang/String;[Ljava/lang/Object;)V

    :cond_0
    return-void
.end method

.method private sendFlagRequestEvent(Ljava/lang/String;Lcom/google/gson/JsonElement;Lcom/google/gson/JsonElement;II)V
    .locals 9

    .line 868
    iget-object v0, p0, Lcom/launchdarkly/android/LDClient;->userManager:Lcom/launchdarkly/android/UserManager;

    invoke-virtual {v0}, Lcom/launchdarkly/android/UserManager;->getFlagResponseSharedPreferences()Lcom/launchdarkly/android/response/FlagResponseSharedPreferences;

    move-result-object v0

    invoke-interface {v0, p1}, Lcom/launchdarkly/android/response/FlagResponseSharedPreferences;->getStoredTrackEvents(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 869
    iget-object v0, p0, Lcom/launchdarkly/android/LDClient;->config:Lcom/launchdarkly/android/LDConfig;

    invoke-virtual {v0}, Lcom/launchdarkly/android/LDConfig;->inlineUsersInEvents()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 870
    new-instance v7, Lcom/launchdarkly/android/FeatureRequestEvent;

    iget-object v0, p0, Lcom/launchdarkly/android/LDClient;->userManager:Lcom/launchdarkly/android/UserManager;

    invoke-virtual {v0}, Lcom/launchdarkly/android/UserManager;->getCurrentUser()Lcom/launchdarkly/android/LDUser;

    move-result-object v2

    move-object v0, v7

    move-object v1, p1

    move-object v3, p2

    move-object v4, p3

    move v5, p4

    move v6, p5

    invoke-direct/range {v0 .. v6}, Lcom/launchdarkly/android/FeatureRequestEvent;-><init>(Ljava/lang/String;Lcom/launchdarkly/android/LDUser;Lcom/google/gson/JsonElement;Lcom/google/gson/JsonElement;II)V

    invoke-direct {p0, v7}, Lcom/launchdarkly/android/LDClient;->sendEvent(Lcom/launchdarkly/android/Event;)V

    goto :goto_0

    .line 872
    :cond_0
    new-instance v7, Lcom/launchdarkly/android/FeatureRequestEvent;

    iget-object v0, p0, Lcom/launchdarkly/android/LDClient;->userManager:Lcom/launchdarkly/android/UserManager;

    invoke-virtual {v0}, Lcom/launchdarkly/android/UserManager;->getCurrentUser()Lcom/launchdarkly/android/LDUser;

    move-result-object v0

    invoke-virtual {v0}, Lcom/launchdarkly/android/LDUser;->getKeyAsString()Ljava/lang/String;

    move-result-object v2

    move-object v0, v7

    move-object v1, p1

    move-object v3, p2

    move-object v4, p3

    move v5, p4

    move v6, p5

    invoke-direct/range {v0 .. v6}, Lcom/launchdarkly/android/FeatureRequestEvent;-><init>(Ljava/lang/String;Ljava/lang/String;Lcom/google/gson/JsonElement;Lcom/google/gson/JsonElement;II)V

    invoke-direct {p0, v7}, Lcom/launchdarkly/android/LDClient;->sendEvent(Lcom/launchdarkly/android/Event;)V

    goto :goto_0

    .line 875
    :cond_1
    iget-object v0, p0, Lcom/launchdarkly/android/LDClient;->userManager:Lcom/launchdarkly/android/UserManager;

    invoke-virtual {v0}, Lcom/launchdarkly/android/UserManager;->getFlagResponseSharedPreferences()Lcom/launchdarkly/android/response/FlagResponseSharedPreferences;

    move-result-object v0

    invoke-interface {v0, p1}, Lcom/launchdarkly/android/response/FlagResponseSharedPreferences;->getStoredDebugEventsUntilDate(Ljava/lang/String;)Ljava/lang/Long;

    move-result-object v0

    if-eqz v0, :cond_2

    .line 877
    iget-object v2, p0, Lcom/launchdarkly/android/LDClient;->eventProcessor:Lcom/launchdarkly/android/EventProcessor;

    invoke-virtual {v2}, Lcom/launchdarkly/android/EventProcessor;->getCurrentTimeMs()J

    move-result-wide v2

    .line 878
    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    move-result-wide v4

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v6

    cmp-long v8, v4, v6

    if-lez v8, :cond_2

    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    move-result-wide v4

    cmp-long v0, v4, v2

    if-lez v0, :cond_2

    .line 879
    new-instance v7, Lcom/launchdarkly/android/DebugEvent;

    iget-object v0, p0, Lcom/launchdarkly/android/LDClient;->userManager:Lcom/launchdarkly/android/UserManager;

    invoke-virtual {v0}, Lcom/launchdarkly/android/UserManager;->getCurrentUser()Lcom/launchdarkly/android/LDUser;

    move-result-object v2

    move-object v0, v7

    move-object v1, p1

    move-object v3, p2

    move-object v4, p3

    move v5, p4

    move v6, p5

    invoke-direct/range {v0 .. v6}, Lcom/launchdarkly/android/DebugEvent;-><init>(Ljava/lang/String;Lcom/launchdarkly/android/LDUser;Lcom/google/gson/JsonElement;Lcom/google/gson/JsonElement;II)V

    invoke-direct {p0, v7}, Lcom/launchdarkly/android/LDClient;->sendEvent(Lcom/launchdarkly/android/Event;)V

    .line 884
    :cond_2
    :goto_0
    invoke-direct {p0}, Lcom/launchdarkly/android/LDClient;->sendSummaryEvent()V

    return-void
.end method

.method private sendSummaryEvent()V
    .locals 5

    .line 923
    iget-object v0, p0, Lcom/launchdarkly/android/LDClient;->userManager:Lcom/launchdarkly/android/UserManager;

    invoke-virtual {v0}, Lcom/launchdarkly/android/UserManager;->getSummaryEventSharedPreferences()Lcom/launchdarkly/android/response/SummaryEventSharedPreferences;

    move-result-object v0

    invoke-interface {v0}, Lcom/launchdarkly/android/response/SummaryEventSharedPreferences;->getFeaturesJsonObject()Lcom/google/gson/JsonObject;

    move-result-object v0

    .line 924
    invoke-virtual {v0}, Lcom/google/gson/JsonObject;->keySet()Ljava/util/Set;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/Set;->size()I

    move-result v1

    if-nez v1, :cond_0

    return-void

    :cond_0
    const/4 v1, 0x0

    .line 928
    invoke-virtual {v0}, Lcom/google/gson/JsonObject;->keySet()Ljava/util/Set;

    move-result-object v2

    invoke-interface {v2}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_1
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_2

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/String;

    .line 929
    invoke-virtual {v0, v3}, Lcom/google/gson/JsonObject;->get(Ljava/lang/String;)Lcom/google/gson/JsonElement;

    move-result-object v3

    invoke-virtual {v3}, Lcom/google/gson/JsonElement;->getAsJsonObject()Lcom/google/gson/JsonObject;

    move-result-object v3

    const-string v4, "startDate"

    .line 930
    invoke-virtual {v3, v4}, Lcom/google/gson/JsonObject;->has(Ljava/lang/String;)Z

    move-result v4

    if-eqz v4, :cond_1

    const-string v1, "startDate"

    .line 931
    invoke-virtual {v3, v1}, Lcom/google/gson/JsonObject;->get(Ljava/lang/String;)Lcom/google/gson/JsonElement;

    move-result-object v1

    invoke-virtual {v1}, Lcom/google/gson/JsonElement;->getAsLong()J

    move-result-wide v1

    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    const-string v2, "startDate"

    .line 932
    invoke-virtual {v3, v2}, Lcom/google/gson/JsonObject;->remove(Ljava/lang/String;)Lcom/google/gson/JsonElement;

    .line 936
    :cond_2
    new-instance v2, Lcom/launchdarkly/android/SummaryEvent;

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v3

    invoke-static {v3, v4}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v3

    invoke-direct {v2, v1, v3, v0}, Lcom/launchdarkly/android/SummaryEvent;-><init>(Ljava/lang/Long;Ljava/lang/Long;Lcom/google/gson/JsonObject;)V

    const-string v0, "Sending Summary Event: %s"

    const/4 v1, 0x1

    .line 937
    new-array v1, v1, [Ljava/lang/Object;

    const/4 v3, 0x0

    invoke-virtual {v2}, Lcom/launchdarkly/android/SummaryEvent;->toString()Ljava/lang/String;

    move-result-object v4

    aput-object v4, v1, v3

    invoke-static {v0, v1}, Ltimber/log/Timber;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 938
    iget-object v0, p0, Lcom/launchdarkly/android/LDClient;->eventProcessor:Lcom/launchdarkly/android/EventProcessor;

    invoke-virtual {v0, v2}, Lcom/launchdarkly/android/EventProcessor;->setSummaryEvent(Lcom/launchdarkly/android/SummaryEvent;)V

    return-void
.end method

.method private static declared-synchronized setInstancesOffline()V
    .locals 3

    const-class v0, Lcom/launchdarkly/android/LDClient;

    monitor-enter v0

    .line 785
    :try_start_0
    sget-object v1, Lcom/launchdarkly/android/LDClient;->instances:Ljava/util/Map;

    invoke-interface {v1}, Ljava/util/Map;->values()Ljava/util/Collection;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/launchdarkly/android/LDClient;

    .line 786
    invoke-direct {v2}, Lcom/launchdarkly/android/LDClient;->setOfflineInternal()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    .line 788
    :cond_0
    monitor-exit v0

    return-void

    :catchall_0
    move-exception v1

    monitor-exit v0

    throw v1
.end method

.method private declared-synchronized setOfflineInternal()V
    .locals 2

    monitor-enter p0

    :try_start_0
    const-string v0, "Setting isOffline = true"

    const/4 v1, 0x0

    .line 776
    new-array v1, v1, [Ljava/lang/Object;

    invoke-static {v0, v1}, Ltimber/log/Timber;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 777
    iget-object v0, p0, Lcom/launchdarkly/android/LDClient;->throttler:Lcom/launchdarkly/android/Throttler;

    invoke-virtual {v0}, Lcom/launchdarkly/android/Throttler;->cancel()V

    const/4 v0, 0x1

    .line 778
    iput-boolean v0, p0, Lcom/launchdarkly/android/LDClient;->isOffline:Z

    .line 779
    iget-object v0, p0, Lcom/launchdarkly/android/LDClient;->fetcher:Lcom/launchdarkly/android/FeatureFlagFetcher;

    invoke-interface {v0}, Lcom/launchdarkly/android/FeatureFlagFetcher;->setOffline()V

    .line 780
    invoke-virtual {p0}, Lcom/launchdarkly/android/LDClient;->stopForegroundUpdating()V

    .line 781
    iget-object v0, p0, Lcom/launchdarkly/android/LDClient;->eventProcessor:Lcom/launchdarkly/android/EventProcessor;

    invoke-virtual {v0}, Lcom/launchdarkly/android/EventProcessor;->stop()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 782
    monitor-exit p0

    return-void

    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method private setOnlineStatus()V
    .locals 0

    .line 804
    invoke-static {}, Lcom/launchdarkly/android/LDClient;->setOnlineStatusInstances()V

    return-void
.end method

.method private static setOnlineStatusInstances()V
    .locals 2

    .line 820
    sget-object v0, Lcom/launchdarkly/android/LDClient;->instances:Ljava/util/Map;

    invoke-interface {v0}, Ljava/util/Map;->values()Ljava/util/Collection;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/launchdarkly/android/LDClient;

    .line 821
    invoke-direct {v1}, Lcom/launchdarkly/android/LDClient;->setOnlineStatusInternal()V

    goto :goto_0

    :cond_0
    return-void
.end method

.method private setOnlineStatusInternal()V
    .locals 3

    const-string v0, "Setting isOffline = false"

    const/4 v1, 0x0

    .line 808
    new-array v2, v1, [Ljava/lang/Object;

    invoke-static {v0, v2}, Ltimber/log/Timber;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 809
    iput-boolean v1, p0, Lcom/launchdarkly/android/LDClient;->isOffline:Z

    .line 810
    iget-object v0, p0, Lcom/launchdarkly/android/LDClient;->fetcher:Lcom/launchdarkly/android/FeatureFlagFetcher;

    invoke-interface {v0}, Lcom/launchdarkly/android/FeatureFlagFetcher;->setOnline()V

    .line 811
    iget-boolean v0, p0, Lcom/launchdarkly/android/LDClient;->isAppForegrounded:Z

    if-eqz v0, :cond_0

    .line 812
    invoke-virtual {p0}, Lcom/launchdarkly/android/LDClient;->startForegroundUpdating()V

    goto :goto_0

    .line 814
    :cond_0
    invoke-virtual {p0}, Lcom/launchdarkly/android/LDClient;->startBackgroundPolling()V

    .line 816
    :goto_0
    iget-object v0, p0, Lcom/launchdarkly/android/LDClient;->eventProcessor:Lcom/launchdarkly/android/EventProcessor;

    invoke-virtual {v0}, Lcom/launchdarkly/android/EventProcessor;->start()V

    return-void
.end method

.method private updateSummaryEvents(Ljava/lang/String;Lcom/google/gson/JsonElement;Lcom/google/gson/JsonElement;)V
    .locals 8

    .line 912
    iget-object v0, p0, Lcom/launchdarkly/android/LDClient;->userManager:Lcom/launchdarkly/android/UserManager;

    invoke-virtual {v0}, Lcom/launchdarkly/android/UserManager;->getFlagResponseSharedPreferences()Lcom/launchdarkly/android/response/FlagResponseSharedPreferences;

    move-result-object v0

    invoke-interface {v0, p1}, Lcom/launchdarkly/android/response/FlagResponseSharedPreferences;->getVersionForEvents(Ljava/lang/String;)I

    move-result v5

    .line 913
    iget-object v0, p0, Lcom/launchdarkly/android/LDClient;->userManager:Lcom/launchdarkly/android/UserManager;

    invoke-virtual {v0}, Lcom/launchdarkly/android/UserManager;->getFlagResponseSharedPreferences()Lcom/launchdarkly/android/response/FlagResponseSharedPreferences;

    move-result-object v0

    invoke-interface {v0, p1}, Lcom/launchdarkly/android/response/FlagResponseSharedPreferences;->getStoredVariation(Ljava/lang/String;)I

    move-result v6

    .line 914
    iget-object v0, p0, Lcom/launchdarkly/android/LDClient;->userManager:Lcom/launchdarkly/android/UserManager;

    invoke-virtual {v0}, Lcom/launchdarkly/android/UserManager;->getFlagResponseSharedPreferences()Lcom/launchdarkly/android/response/FlagResponseSharedPreferences;

    move-result-object v0

    invoke-interface {v0, p1}, Lcom/launchdarkly/android/response/FlagResponseSharedPreferences;->containsKey(Ljava/lang/String;)Z

    move-result v0

    xor-int/lit8 v7, v0, 0x1

    .line 916
    iget-object v0, p0, Lcom/launchdarkly/android/LDClient;->userManager:Lcom/launchdarkly/android/UserManager;

    invoke-virtual {v0}, Lcom/launchdarkly/android/UserManager;->getSummaryEventSharedPreferences()Lcom/launchdarkly/android/response/SummaryEventSharedPreferences;

    move-result-object v1

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    invoke-interface/range {v1 .. v7}, Lcom/launchdarkly/android/response/SummaryEventSharedPreferences;->addOrUpdateEvent(Ljava/lang/String;Lcom/google/gson/JsonElement;Lcom/google/gson/JsonElement;IIZ)V

    return-void
.end method

.method private static validateParameter(Ljava/lang/Object;)Z
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(TT;)Z"
        }
    .end annotation

    .line 191
    :try_start_0
    invoke-static {p0}, Lcom/google/common/base/Preconditions;->checkNotNull(Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catch Ljava/lang/NullPointerException; {:try_start_0 .. :try_end_0} :catch_0

    const/4 p0, 0x1

    goto :goto_0

    :catch_0
    const/4 p0, 0x0

    :goto_0
    return p0
.end method


# virtual methods
.method public allFlags()Ljava/util/Map;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "*>;"
        }
    .end annotation

    .line 499
    iget-object v0, p0, Lcom/launchdarkly/android/LDClient;->userManager:Lcom/launchdarkly/android/UserManager;

    invoke-virtual {v0}, Lcom/launchdarkly/android/UserManager;->getCurrentUserSharedPrefs()Landroid/content/SharedPreferences;

    move-result-object v0

    invoke-interface {v0}, Landroid/content/SharedPreferences;->getAll()Ljava/util/Map;

    move-result-object v0

    return-object v0
.end method

.method public boolVariation(Ljava/lang/String;Ljava/lang/Boolean;)Ljava/lang/Boolean;
    .locals 11

    const/4 v0, 0x1

    const/4 v1, 0x0

    const/4 v2, 0x2

    .line 519
    :try_start_0
    iget-object v3, p0, Lcom/launchdarkly/android/LDClient;->userManager:Lcom/launchdarkly/android/UserManager;

    invoke-virtual {v3}, Lcom/launchdarkly/android/UserManager;->getCurrentUserSharedPrefs()Landroid/content/SharedPreferences;

    move-result-object v3

    invoke-virtual {p2}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v4

    invoke-interface {v3, p1, v4}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    move-result v3

    invoke-static {v3}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v3
    :try_end_0
    .catch Ljava/lang/ClassCastException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/NullPointerException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_1

    :catch_0
    move-exception v3

    const-string v4, "Attempted to get boolean flag with a default null value for key: %s Returning fallback: %s"

    .line 523
    new-array v5, v2, [Ljava/lang/Object;

    aput-object p1, v5, v1

    aput-object p2, v5, v0

    invoke-static {v3, v4, v5}, Ltimber/log/Timber;->e(Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V

    goto :goto_0

    :catch_1
    move-exception v3

    const-string v4, "Attempted to get boolean flag that exists as another type for key: %s Returning fallback: %s"

    .line 521
    new-array v5, v2, [Ljava/lang/Object;

    aput-object p1, v5, v1

    aput-object p2, v5, v0

    invoke-static {v3, v4, v5}, Ltimber/log/Timber;->e(Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V

    :goto_0
    move-object v3, p2

    .line 525
    :goto_1
    iget-object v4, p0, Lcom/launchdarkly/android/LDClient;->userManager:Lcom/launchdarkly/android/UserManager;

    invoke-virtual {v4}, Lcom/launchdarkly/android/UserManager;->getFlagResponseSharedPreferences()Lcom/launchdarkly/android/response/FlagResponseSharedPreferences;

    move-result-object v4

    invoke-interface {v4, p1}, Lcom/launchdarkly/android/response/FlagResponseSharedPreferences;->getVersionForEvents(Ljava/lang/String;)I

    move-result v9

    .line 526
    iget-object v4, p0, Lcom/launchdarkly/android/LDClient;->userManager:Lcom/launchdarkly/android/UserManager;

    invoke-virtual {v4}, Lcom/launchdarkly/android/UserManager;->getFlagResponseSharedPreferences()Lcom/launchdarkly/android/response/FlagResponseSharedPreferences;

    move-result-object v4

    invoke-interface {v4, p1}, Lcom/launchdarkly/android/response/FlagResponseSharedPreferences;->getStoredVariation(Ljava/lang/String;)I

    move-result v10

    const/4 v4, 0x0

    if-nez v3, :cond_0

    if-nez p2, :cond_0

    .line 528
    invoke-direct {p0, p1, v4, v4}, Lcom/launchdarkly/android/LDClient;->updateSummaryEvents(Ljava/lang/String;Lcom/google/gson/JsonElement;Lcom/google/gson/JsonElement;)V

    .line 529
    sget-object v7, Lcom/google/gson/JsonNull;->INSTANCE:Lcom/google/gson/JsonNull;

    sget-object v8, Lcom/google/gson/JsonNull;->INSTANCE:Lcom/google/gson/JsonNull;

    move-object v5, p0

    move-object v6, p1

    invoke-direct/range {v5 .. v10}, Lcom/launchdarkly/android/LDClient;->sendFlagRequestEvent(Ljava/lang/String;Lcom/google/gson/JsonElement;Lcom/google/gson/JsonElement;II)V

    goto :goto_2

    :cond_0
    if-nez v3, :cond_1

    .line 531
    new-instance v5, Lcom/google/gson/JsonPrimitive;

    invoke-direct {v5, p2}, Lcom/google/gson/JsonPrimitive;-><init>(Ljava/lang/Boolean;)V

    invoke-direct {p0, p1, v4, v5}, Lcom/launchdarkly/android/LDClient;->updateSummaryEvents(Ljava/lang/String;Lcom/google/gson/JsonElement;Lcom/google/gson/JsonElement;)V

    .line 532
    sget-object v7, Lcom/google/gson/JsonNull;->INSTANCE:Lcom/google/gson/JsonNull;

    new-instance v8, Lcom/google/gson/JsonPrimitive;

    invoke-direct {v8, p2}, Lcom/google/gson/JsonPrimitive;-><init>(Ljava/lang/Boolean;)V

    move-object v5, p0

    move-object v6, p1

    invoke-direct/range {v5 .. v10}, Lcom/launchdarkly/android/LDClient;->sendFlagRequestEvent(Ljava/lang/String;Lcom/google/gson/JsonElement;Lcom/google/gson/JsonElement;II)V

    goto :goto_2

    :cond_1
    if-nez p2, :cond_2

    .line 534
    new-instance p2, Lcom/google/gson/JsonPrimitive;

    invoke-direct {p2, v3}, Lcom/google/gson/JsonPrimitive;-><init>(Ljava/lang/Boolean;)V

    invoke-direct {p0, p1, p2, v4}, Lcom/launchdarkly/android/LDClient;->updateSummaryEvents(Ljava/lang/String;Lcom/google/gson/JsonElement;Lcom/google/gson/JsonElement;)V

    .line 535
    new-instance v7, Lcom/google/gson/JsonPrimitive;

    invoke-direct {v7, v3}, Lcom/google/gson/JsonPrimitive;-><init>(Ljava/lang/Boolean;)V

    sget-object v8, Lcom/google/gson/JsonNull;->INSTANCE:Lcom/google/gson/JsonNull;

    move-object v5, p0

    move-object v6, p1

    invoke-direct/range {v5 .. v10}, Lcom/launchdarkly/android/LDClient;->sendFlagRequestEvent(Ljava/lang/String;Lcom/google/gson/JsonElement;Lcom/google/gson/JsonElement;II)V

    goto :goto_2

    .line 537
    :cond_2
    new-instance v4, Lcom/google/gson/JsonPrimitive;

    invoke-direct {v4, v3}, Lcom/google/gson/JsonPrimitive;-><init>(Ljava/lang/Boolean;)V

    new-instance v5, Lcom/google/gson/JsonPrimitive;

    invoke-direct {v5, p2}, Lcom/google/gson/JsonPrimitive;-><init>(Ljava/lang/Boolean;)V

    invoke-direct {p0, p1, v4, v5}, Lcom/launchdarkly/android/LDClient;->updateSummaryEvents(Ljava/lang/String;Lcom/google/gson/JsonElement;Lcom/google/gson/JsonElement;)V

    .line 538
    new-instance v7, Lcom/google/gson/JsonPrimitive;

    invoke-direct {v7, v3}, Lcom/google/gson/JsonPrimitive;-><init>(Ljava/lang/Boolean;)V

    new-instance v8, Lcom/google/gson/JsonPrimitive;

    invoke-direct {v8, p2}, Lcom/google/gson/JsonPrimitive;-><init>(Ljava/lang/Boolean;)V

    move-object v5, p0

    move-object v6, p1

    invoke-direct/range {v5 .. v10}, Lcom/launchdarkly/android/LDClient;->sendFlagRequestEvent(Ljava/lang/String;Lcom/google/gson/JsonElement;Lcom/google/gson/JsonElement;II)V

    :goto_2
    const-string p2, "boolVariation: returning variation: %s flagKey: %s user key: %s"

    const/4 v4, 0x3

    .line 540
    new-array v4, v4, [Ljava/lang/Object;

    aput-object v3, v4, v1

    aput-object p1, v4, v0

    iget-object p1, p0, Lcom/launchdarkly/android/LDClient;->userManager:Lcom/launchdarkly/android/UserManager;

    invoke-virtual {p1}, Lcom/launchdarkly/android/UserManager;->getCurrentUser()Lcom/launchdarkly/android/LDUser;

    move-result-object p1

    invoke-virtual {p1}, Lcom/launchdarkly/android/LDUser;->getKeyAsString()Ljava/lang/String;

    move-result-object p1

    aput-object p1, v4, v2

    invoke-static {p2, v4}, Ltimber/log/Timber;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    return-object v3
.end method

.method public clearSummaryEventSharedPreferences()V
    .locals 1
    .annotation build Lcom/google/common/annotations/VisibleForTesting;
    .end annotation

    .line 943
    iget-object v0, p0, Lcom/launchdarkly/android/LDClient;->userManager:Lcom/launchdarkly/android/UserManager;

    invoke-virtual {v0}, Lcom/launchdarkly/android/UserManager;->getSummaryEventSharedPreferences()Lcom/launchdarkly/android/response/SummaryEventSharedPreferences;

    move-result-object v0

    invoke-interface {v0}, Lcom/launchdarkly/android/response/SummaryEventSharedPreferences;->clear()V

    return-void
.end method

.method public close()V
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 709
    invoke-static {}, Lcom/launchdarkly/android/LDClient;->closeInstances()V

    return-void
.end method

.method public floatVariation(Ljava/lang/String;Ljava/lang/Float;)Ljava/lang/Float;
    .locals 11

    const/4 v0, 0x1

    const/4 v1, 0x0

    const/4 v2, 0x2

    .line 601
    :try_start_0
    iget-object v3, p0, Lcom/launchdarkly/android/LDClient;->userManager:Lcom/launchdarkly/android/UserManager;

    invoke-virtual {v3}, Lcom/launchdarkly/android/UserManager;->getCurrentUserSharedPrefs()Landroid/content/SharedPreferences;

    move-result-object v3

    invoke-virtual {p2}, Ljava/lang/Float;->floatValue()F

    move-result v4

    invoke-interface {v3, p1, v4}, Landroid/content/SharedPreferences;->getFloat(Ljava/lang/String;F)F

    move-result v3

    invoke-static {v3}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v3
    :try_end_0
    .catch Ljava/lang/ClassCastException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/NullPointerException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_1

    :catch_0
    move-exception v3

    const-string v4, "Attempted to get float flag with a default null value for key: %s Returning fallback: %s"

    .line 605
    new-array v5, v2, [Ljava/lang/Object;

    aput-object p1, v5, v1

    aput-object p2, v5, v0

    invoke-static {v3, v4, v5}, Ltimber/log/Timber;->e(Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V

    goto :goto_0

    :catch_1
    move-exception v3

    const-string v4, "Attempted to get float flag that exists as another type for key: %s Returning fallback: %s"

    .line 603
    new-array v5, v2, [Ljava/lang/Object;

    aput-object p1, v5, v1

    aput-object p2, v5, v0

    invoke-static {v3, v4, v5}, Ltimber/log/Timber;->e(Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V

    :goto_0
    move-object v3, p2

    .line 607
    :goto_1
    iget-object v4, p0, Lcom/launchdarkly/android/LDClient;->userManager:Lcom/launchdarkly/android/UserManager;

    invoke-virtual {v4}, Lcom/launchdarkly/android/UserManager;->getFlagResponseSharedPreferences()Lcom/launchdarkly/android/response/FlagResponseSharedPreferences;

    move-result-object v4

    invoke-interface {v4, p1}, Lcom/launchdarkly/android/response/FlagResponseSharedPreferences;->getVersionForEvents(Ljava/lang/String;)I

    move-result v9

    .line 608
    iget-object v4, p0, Lcom/launchdarkly/android/LDClient;->userManager:Lcom/launchdarkly/android/UserManager;

    invoke-virtual {v4}, Lcom/launchdarkly/android/UserManager;->getFlagResponseSharedPreferences()Lcom/launchdarkly/android/response/FlagResponseSharedPreferences;

    move-result-object v4

    invoke-interface {v4, p1}, Lcom/launchdarkly/android/response/FlagResponseSharedPreferences;->getStoredVariation(Ljava/lang/String;)I

    move-result v10

    const/4 v4, 0x0

    if-nez v3, :cond_0

    if-nez p2, :cond_0

    .line 610
    invoke-direct {p0, p1, v4, v4}, Lcom/launchdarkly/android/LDClient;->updateSummaryEvents(Ljava/lang/String;Lcom/google/gson/JsonElement;Lcom/google/gson/JsonElement;)V

    .line 611
    sget-object v7, Lcom/google/gson/JsonNull;->INSTANCE:Lcom/google/gson/JsonNull;

    sget-object v8, Lcom/google/gson/JsonNull;->INSTANCE:Lcom/google/gson/JsonNull;

    move-object v5, p0

    move-object v6, p1

    invoke-direct/range {v5 .. v10}, Lcom/launchdarkly/android/LDClient;->sendFlagRequestEvent(Ljava/lang/String;Lcom/google/gson/JsonElement;Lcom/google/gson/JsonElement;II)V

    goto :goto_2

    :cond_0
    if-nez v3, :cond_1

    .line 613
    new-instance v5, Lcom/google/gson/JsonPrimitive;

    invoke-direct {v5, p2}, Lcom/google/gson/JsonPrimitive;-><init>(Ljava/lang/Number;)V

    invoke-direct {p0, p1, v4, v5}, Lcom/launchdarkly/android/LDClient;->updateSummaryEvents(Ljava/lang/String;Lcom/google/gson/JsonElement;Lcom/google/gson/JsonElement;)V

    .line 614
    sget-object v7, Lcom/google/gson/JsonNull;->INSTANCE:Lcom/google/gson/JsonNull;

    new-instance v8, Lcom/google/gson/JsonPrimitive;

    invoke-direct {v8, p2}, Lcom/google/gson/JsonPrimitive;-><init>(Ljava/lang/Number;)V

    move-object v5, p0

    move-object v6, p1

    invoke-direct/range {v5 .. v10}, Lcom/launchdarkly/android/LDClient;->sendFlagRequestEvent(Ljava/lang/String;Lcom/google/gson/JsonElement;Lcom/google/gson/JsonElement;II)V

    goto :goto_2

    :cond_1
    if-nez p2, :cond_2

    .line 616
    new-instance p2, Lcom/google/gson/JsonPrimitive;

    invoke-direct {p2, v3}, Lcom/google/gson/JsonPrimitive;-><init>(Ljava/lang/Number;)V

    invoke-direct {p0, p1, p2, v4}, Lcom/launchdarkly/android/LDClient;->updateSummaryEvents(Ljava/lang/String;Lcom/google/gson/JsonElement;Lcom/google/gson/JsonElement;)V

    .line 617
    new-instance v7, Lcom/google/gson/JsonPrimitive;

    invoke-direct {v7, v3}, Lcom/google/gson/JsonPrimitive;-><init>(Ljava/lang/Number;)V

    sget-object v8, Lcom/google/gson/JsonNull;->INSTANCE:Lcom/google/gson/JsonNull;

    move-object v5, p0

    move-object v6, p1

    invoke-direct/range {v5 .. v10}, Lcom/launchdarkly/android/LDClient;->sendFlagRequestEvent(Ljava/lang/String;Lcom/google/gson/JsonElement;Lcom/google/gson/JsonElement;II)V

    goto :goto_2

    .line 619
    :cond_2
    new-instance v4, Lcom/google/gson/JsonPrimitive;

    invoke-direct {v4, v3}, Lcom/google/gson/JsonPrimitive;-><init>(Ljava/lang/Number;)V

    new-instance v5, Lcom/google/gson/JsonPrimitive;

    invoke-direct {v5, p2}, Lcom/google/gson/JsonPrimitive;-><init>(Ljava/lang/Number;)V

    invoke-direct {p0, p1, v4, v5}, Lcom/launchdarkly/android/LDClient;->updateSummaryEvents(Ljava/lang/String;Lcom/google/gson/JsonElement;Lcom/google/gson/JsonElement;)V

    .line 620
    new-instance v7, Lcom/google/gson/JsonPrimitive;

    invoke-direct {v7, v3}, Lcom/google/gson/JsonPrimitive;-><init>(Ljava/lang/Number;)V

    new-instance v8, Lcom/google/gson/JsonPrimitive;

    invoke-direct {v8, p2}, Lcom/google/gson/JsonPrimitive;-><init>(Ljava/lang/Number;)V

    move-object v5, p0

    move-object v6, p1

    invoke-direct/range {v5 .. v10}, Lcom/launchdarkly/android/LDClient;->sendFlagRequestEvent(Ljava/lang/String;Lcom/google/gson/JsonElement;Lcom/google/gson/JsonElement;II)V

    :goto_2
    const-string p2, "floatVariation: returning variation: %s flagKey: %s user key: %s"

    const/4 v4, 0x3

    .line 622
    new-array v4, v4, [Ljava/lang/Object;

    aput-object v3, v4, v1

    aput-object p1, v4, v0

    iget-object p1, p0, Lcom/launchdarkly/android/LDClient;->userManager:Lcom/launchdarkly/android/UserManager;

    invoke-virtual {p1}, Lcom/launchdarkly/android/UserManager;->getCurrentUser()Lcom/launchdarkly/android/LDUser;

    move-result-object p1

    invoke-virtual {p1}, Lcom/launchdarkly/android/LDUser;->getKeyAsString()Ljava/lang/String;

    move-result-object p1

    aput-object p1, v4, v2

    invoke-static {p2, v4}, Ltimber/log/Timber;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    return-object v3
.end method

.method public flush()V
    .locals 0

    .line 738
    invoke-static {}, Lcom/launchdarkly/android/LDClient;->flushInstances()V

    return-void
.end method

.method public getSummaryEventSharedPreferences()Lcom/launchdarkly/android/response/SummaryEventSharedPreferences;
    .locals 1
    .annotation build Lcom/google/common/annotations/VisibleForTesting;
    .end annotation

    .line 948
    iget-object v0, p0, Lcom/launchdarkly/android/LDClient;->userManager:Lcom/launchdarkly/android/UserManager;

    invoke-virtual {v0}, Lcom/launchdarkly/android/UserManager;->getSummaryEventSharedPreferences()Lcom/launchdarkly/android/response/SummaryEventSharedPreferences;

    move-result-object v0

    return-object v0
.end method

.method getUserManager()Lcom/launchdarkly/android/UserManager;
    .locals 1

    .line 952
    iget-object v0, p0, Lcom/launchdarkly/android/LDClient;->userManager:Lcom/launchdarkly/android/UserManager;

    return-object v0
.end method

.method public declared-synchronized identify(Lcom/launchdarkly/android/LDUser;)Ljava/util/concurrent/Future;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/launchdarkly/android/LDUser;",
            ")",
            "Ljava/util/concurrent/Future<",
            "Ljava/lang/Void;",
            ">;"
        }
    .end annotation

    monitor-enter p0

    .line 447
    :try_start_0
    invoke-static {p1}, Lcom/launchdarkly/android/LDClient;->identifyInstances(Lcom/launchdarkly/android/LDUser;)Ljava/util/concurrent/Future;

    move-result-object p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-object p1

    :catchall_0
    move-exception p1

    monitor-exit p0

    throw p1
.end method

.method public intVariation(Ljava/lang/String;Ljava/lang/Integer;)Ljava/lang/Integer;
    .locals 11

    const/4 v0, 0x1

    const/4 v1, 0x0

    const/4 v2, 0x2

    .line 560
    :try_start_0
    iget-object v3, p0, Lcom/launchdarkly/android/LDClient;->userManager:Lcom/launchdarkly/android/UserManager;

    invoke-virtual {v3}, Lcom/launchdarkly/android/UserManager;->getCurrentUserSharedPrefs()Landroid/content/SharedPreferences;

    move-result-object v3

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v4

    int-to-float v4, v4

    invoke-interface {v3, p1, v4}, Landroid/content/SharedPreferences;->getFloat(Ljava/lang/String;F)F

    move-result v3

    float-to-int v3, v3

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3
    :try_end_0
    .catch Ljava/lang/ClassCastException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/NullPointerException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_1

    :catch_0
    move-exception v3

    const-string v4, "Attempted to get integer flag with a default null value for key: %s Returning fallback: %s"

    .line 564
    new-array v5, v2, [Ljava/lang/Object;

    aput-object p1, v5, v1

    aput-object p2, v5, v0

    invoke-static {v3, v4, v5}, Ltimber/log/Timber;->e(Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V

    goto :goto_0

    :catch_1
    move-exception v3

    const-string v4, "Attempted to get integer flag that exists as another type for key: %s Returning fallback: %s"

    .line 562
    new-array v5, v2, [Ljava/lang/Object;

    aput-object p1, v5, v1

    aput-object p2, v5, v0

    invoke-static {v3, v4, v5}, Ltimber/log/Timber;->e(Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V

    :goto_0
    move-object v3, p2

    .line 566
    :goto_1
    iget-object v4, p0, Lcom/launchdarkly/android/LDClient;->userManager:Lcom/launchdarkly/android/UserManager;

    invoke-virtual {v4}, Lcom/launchdarkly/android/UserManager;->getFlagResponseSharedPreferences()Lcom/launchdarkly/android/response/FlagResponseSharedPreferences;

    move-result-object v4

    invoke-interface {v4, p1}, Lcom/launchdarkly/android/response/FlagResponseSharedPreferences;->getVersionForEvents(Ljava/lang/String;)I

    move-result v9

    .line 567
    iget-object v4, p0, Lcom/launchdarkly/android/LDClient;->userManager:Lcom/launchdarkly/android/UserManager;

    invoke-virtual {v4}, Lcom/launchdarkly/android/UserManager;->getFlagResponseSharedPreferences()Lcom/launchdarkly/android/response/FlagResponseSharedPreferences;

    move-result-object v4

    invoke-interface {v4, p1}, Lcom/launchdarkly/android/response/FlagResponseSharedPreferences;->getStoredVariation(Ljava/lang/String;)I

    move-result v10

    const/4 v4, 0x0

    if-nez v3, :cond_0

    if-nez p2, :cond_0

    .line 569
    invoke-direct {p0, p1, v4, v4}, Lcom/launchdarkly/android/LDClient;->updateSummaryEvents(Ljava/lang/String;Lcom/google/gson/JsonElement;Lcom/google/gson/JsonElement;)V

    .line 570
    sget-object v7, Lcom/google/gson/JsonNull;->INSTANCE:Lcom/google/gson/JsonNull;

    sget-object v8, Lcom/google/gson/JsonNull;->INSTANCE:Lcom/google/gson/JsonNull;

    move-object v5, p0

    move-object v6, p1

    invoke-direct/range {v5 .. v10}, Lcom/launchdarkly/android/LDClient;->sendFlagRequestEvent(Ljava/lang/String;Lcom/google/gson/JsonElement;Lcom/google/gson/JsonElement;II)V

    goto :goto_2

    :cond_0
    if-nez v3, :cond_1

    .line 572
    new-instance v5, Lcom/google/gson/JsonPrimitive;

    invoke-direct {v5, p2}, Lcom/google/gson/JsonPrimitive;-><init>(Ljava/lang/Number;)V

    invoke-direct {p0, p1, v4, v5}, Lcom/launchdarkly/android/LDClient;->updateSummaryEvents(Ljava/lang/String;Lcom/google/gson/JsonElement;Lcom/google/gson/JsonElement;)V

    .line 573
    sget-object v7, Lcom/google/gson/JsonNull;->INSTANCE:Lcom/google/gson/JsonNull;

    new-instance v8, Lcom/google/gson/JsonPrimitive;

    invoke-direct {v8, p2}, Lcom/google/gson/JsonPrimitive;-><init>(Ljava/lang/Number;)V

    move-object v5, p0

    move-object v6, p1

    invoke-direct/range {v5 .. v10}, Lcom/launchdarkly/android/LDClient;->sendFlagRequestEvent(Ljava/lang/String;Lcom/google/gson/JsonElement;Lcom/google/gson/JsonElement;II)V

    goto :goto_2

    :cond_1
    if-nez p2, :cond_2

    .line 575
    new-instance p2, Lcom/google/gson/JsonPrimitive;

    invoke-direct {p2, v3}, Lcom/google/gson/JsonPrimitive;-><init>(Ljava/lang/Number;)V

    invoke-direct {p0, p1, p2, v4}, Lcom/launchdarkly/android/LDClient;->updateSummaryEvents(Ljava/lang/String;Lcom/google/gson/JsonElement;Lcom/google/gson/JsonElement;)V

    .line 576
    new-instance v7, Lcom/google/gson/JsonPrimitive;

    invoke-direct {v7, v3}, Lcom/google/gson/JsonPrimitive;-><init>(Ljava/lang/Number;)V

    sget-object v8, Lcom/google/gson/JsonNull;->INSTANCE:Lcom/google/gson/JsonNull;

    move-object v5, p0

    move-object v6, p1

    invoke-direct/range {v5 .. v10}, Lcom/launchdarkly/android/LDClient;->sendFlagRequestEvent(Ljava/lang/String;Lcom/google/gson/JsonElement;Lcom/google/gson/JsonElement;II)V

    goto :goto_2

    .line 578
    :cond_2
    new-instance v4, Lcom/google/gson/JsonPrimitive;

    invoke-direct {v4, v3}, Lcom/google/gson/JsonPrimitive;-><init>(Ljava/lang/Number;)V

    new-instance v5, Lcom/google/gson/JsonPrimitive;

    invoke-direct {v5, p2}, Lcom/google/gson/JsonPrimitive;-><init>(Ljava/lang/Number;)V

    invoke-direct {p0, p1, v4, v5}, Lcom/launchdarkly/android/LDClient;->updateSummaryEvents(Ljava/lang/String;Lcom/google/gson/JsonElement;Lcom/google/gson/JsonElement;)V

    .line 579
    new-instance v7, Lcom/google/gson/JsonPrimitive;

    invoke-direct {v7, v3}, Lcom/google/gson/JsonPrimitive;-><init>(Ljava/lang/Number;)V

    new-instance v8, Lcom/google/gson/JsonPrimitive;

    invoke-direct {v8, p2}, Lcom/google/gson/JsonPrimitive;-><init>(Ljava/lang/Number;)V

    move-object v5, p0

    move-object v6, p1

    invoke-direct/range {v5 .. v10}, Lcom/launchdarkly/android/LDClient;->sendFlagRequestEvent(Ljava/lang/String;Lcom/google/gson/JsonElement;Lcom/google/gson/JsonElement;II)V

    :goto_2
    const-string p2, "intVariation: returning variation: %s flagKey: %s user key: %s"

    const/4 v4, 0x3

    .line 581
    new-array v4, v4, [Ljava/lang/Object;

    aput-object v3, v4, v1

    aput-object p1, v4, v0

    iget-object p1, p0, Lcom/launchdarkly/android/LDClient;->userManager:Lcom/launchdarkly/android/UserManager;

    invoke-virtual {p1}, Lcom/launchdarkly/android/UserManager;->getCurrentUser()Lcom/launchdarkly/android/LDUser;

    move-result-object p1

    invoke-virtual {p1}, Lcom/launchdarkly/android/LDUser;->getKeyAsString()Ljava/lang/String;

    move-result-object p1

    aput-object p1, v4, v2

    invoke-static {p2, v4}, Ltimber/log/Timber;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    return-object v3
.end method

.method public isDisableBackgroundPolling()Z
    .locals 1

    .line 850
    iget-object v0, p0, Lcom/launchdarkly/android/LDClient;->config:Lcom/launchdarkly/android/LDConfig;

    invoke-virtual {v0}, Lcom/launchdarkly/android/LDConfig;->isDisableBackgroundPolling()Z

    move-result v0

    return v0
.end method

.method public isInitialized()Z
    .locals 1

    .line 753
    invoke-virtual {p0}, Lcom/launchdarkly/android/LDClient;->isOffline()Z

    move-result v0

    if-nez v0, :cond_1

    iget-object v0, p0, Lcom/launchdarkly/android/LDClient;->updateProcessor:Lcom/launchdarkly/android/UpdateProcessor;

    invoke-interface {v0}, Lcom/launchdarkly/android/UpdateProcessor;->isInitialized()Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 v0, 0x1

    :goto_1
    return v0
.end method

.method public isOffline()Z
    .locals 1

    .line 758
    iget-boolean v0, p0, Lcom/launchdarkly/android/LDClient;->isOffline:Z

    return v0
.end method

.method public jsonVariation(Ljava/lang/String;Lcom/google/gson/JsonElement;)Lcom/google/gson/JsonElement;
    .locals 12

    const/4 v0, 0x1

    const/4 v1, 0x0

    const/4 v2, 0x2

    .line 683
    :try_start_0
    iget-object v3, p0, Lcom/launchdarkly/android/LDClient;->userManager:Lcom/launchdarkly/android/UserManager;

    invoke-virtual {v3}, Lcom/launchdarkly/android/UserManager;->getCurrentUserSharedPrefs()Landroid/content/SharedPreferences;

    move-result-object v3

    const/4 v4, 0x0

    invoke-interface {v3, p1, v4}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    if-eqz v3, :cond_0

    .line 685
    new-instance v4, Lcom/google/gson/JsonParser;

    invoke-direct {v4}, Lcom/google/gson/JsonParser;-><init>()V

    invoke-virtual {v4, v3}, Lcom/google/gson/JsonParser;->parse(Ljava/lang/String;)Lcom/google/gson/JsonElement;

    move-result-object v3
    :try_end_0
    .catch Ljava/lang/ClassCastException; {:try_start_0 .. :try_end_0} :catch_2
    .catch Ljava/lang/NullPointerException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Lcom/google/gson/JsonSyntaxException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_1

    :cond_0
    move-object v3, p2

    goto :goto_1

    :catch_0
    move-exception v3

    const-string v4, "Attempted to get json (string flag that exists as another type for key: %s Returning fallback: %s"

    .line 692
    new-array v5, v2, [Ljava/lang/Object;

    aput-object p1, v5, v1

    aput-object p2, v5, v0

    invoke-static {v3, v4, v5}, Ltimber/log/Timber;->e(Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V

    goto :goto_0

    :catch_1
    move-exception v3

    const-string v4, "Attempted to get json (string flag with a default null value for key: %s Returning fallback: %s"

    .line 690
    new-array v5, v2, [Ljava/lang/Object;

    aput-object p1, v5, v1

    aput-object p2, v5, v0

    invoke-static {v3, v4, v5}, Ltimber/log/Timber;->e(Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V

    goto :goto_0

    :catch_2
    move-exception v3

    const-string v4, "Attempted to get json (string) flag that exists as another type for key: %s Returning fallback: %s"

    .line 688
    new-array v5, v2, [Ljava/lang/Object;

    aput-object p1, v5, v1

    aput-object p2, v5, v0

    invoke-static {v3, v4, v5}, Ltimber/log/Timber;->e(Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V

    :goto_0
    move-object v3, p2

    .line 694
    :goto_1
    iget-object v4, p0, Lcom/launchdarkly/android/LDClient;->userManager:Lcom/launchdarkly/android/UserManager;

    invoke-virtual {v4}, Lcom/launchdarkly/android/UserManager;->getFlagResponseSharedPreferences()Lcom/launchdarkly/android/response/FlagResponseSharedPreferences;

    move-result-object v4

    invoke-interface {v4, p1}, Lcom/launchdarkly/android/response/FlagResponseSharedPreferences;->getVersionForEvents(Ljava/lang/String;)I

    move-result v10

    .line 695
    iget-object v4, p0, Lcom/launchdarkly/android/LDClient;->userManager:Lcom/launchdarkly/android/UserManager;

    invoke-virtual {v4}, Lcom/launchdarkly/android/UserManager;->getFlagResponseSharedPreferences()Lcom/launchdarkly/android/response/FlagResponseSharedPreferences;

    move-result-object v4

    invoke-interface {v4, p1}, Lcom/launchdarkly/android/response/FlagResponseSharedPreferences;->getStoredVariation(Ljava/lang/String;)I

    move-result v11

    .line 696
    invoke-direct {p0, p1, v3, p2}, Lcom/launchdarkly/android/LDClient;->updateSummaryEvents(Ljava/lang/String;Lcom/google/gson/JsonElement;Lcom/google/gson/JsonElement;)V

    move-object v6, p0

    move-object v7, p1

    move-object v8, v3

    move-object v9, p2

    .line 697
    invoke-direct/range {v6 .. v11}, Lcom/launchdarkly/android/LDClient;->sendFlagRequestEvent(Ljava/lang/String;Lcom/google/gson/JsonElement;Lcom/google/gson/JsonElement;II)V

    const-string p2, "jsonVariation: returning variation: %s flagKey: %s user key: %s"

    const/4 v4, 0x3

    .line 698
    new-array v4, v4, [Ljava/lang/Object;

    aput-object v3, v4, v1

    aput-object p1, v4, v0

    iget-object p1, p0, Lcom/launchdarkly/android/LDClient;->userManager:Lcom/launchdarkly/android/UserManager;

    invoke-virtual {p1}, Lcom/launchdarkly/android/UserManager;->getCurrentUser()Lcom/launchdarkly/android/LDUser;

    move-result-object p1

    invoke-virtual {p1}, Lcom/launchdarkly/android/LDUser;->getKeyAsString()Ljava/lang/String;

    move-result-object p1

    aput-object p1, v4, v2

    invoke-static {p2, v4}, Ltimber/log/Timber;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    return-object v3
.end method

.method public registerFeatureFlagListener(Ljava/lang/String;Lcom/launchdarkly/android/FeatureFlagChangeListener;)V
    .locals 1

    .line 834
    iget-object v0, p0, Lcom/launchdarkly/android/LDClient;->userManager:Lcom/launchdarkly/android/UserManager;

    invoke-virtual {v0, p1, p2}, Lcom/launchdarkly/android/UserManager;->registerListener(Ljava/lang/String;Lcom/launchdarkly/android/FeatureFlagChangeListener;)V

    return-void
.end method

.method public declared-synchronized setOffline()V
    .locals 1

    monitor-enter p0

    .line 772
    :try_start_0
    invoke-static {}, Lcom/launchdarkly/android/LDClient;->setInstancesOffline()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 773
    monitor-exit p0

    return-void

    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method public declared-synchronized setOnline()V
    .locals 1

    monitor-enter p0

    .line 800
    :try_start_0
    iget-object v0, p0, Lcom/launchdarkly/android/LDClient;->throttler:Lcom/launchdarkly/android/Throttler;

    invoke-virtual {v0}, Lcom/launchdarkly/android/Throttler;->attemptRun()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 801
    monitor-exit p0

    return-void

    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method startBackgroundPolling()V
    .locals 2

    .line 888
    iget-object v0, p0, Lcom/launchdarkly/android/LDClient;->application:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/app/Application;

    if-eqz v0, :cond_0

    .line 889
    iget-object v1, p0, Lcom/launchdarkly/android/LDClient;->config:Lcom/launchdarkly/android/LDConfig;

    invoke-virtual {v1}, Lcom/launchdarkly/android/LDConfig;->isDisableBackgroundPolling()Z

    move-result v1

    if-nez v1, :cond_0

    iget-object v1, p0, Lcom/launchdarkly/android/LDClient;->environmentName:Ljava/lang/String;

    invoke-static {v0, v1}, Lcom/launchdarkly/android/Util;->isClientConnected(Landroid/content/Context;Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_0

    .line 890
    invoke-static {v0}, Lcom/launchdarkly/android/PollingUpdater;->startBackgroundPolling(Landroid/content/Context;)V

    :cond_0
    return-void
.end method

.method startForegroundUpdating()V
    .locals 1

    .line 862
    invoke-virtual {p0}, Lcom/launchdarkly/android/LDClient;->isOffline()Z

    move-result v0

    if-nez v0, :cond_0

    .line 863
    iget-object v0, p0, Lcom/launchdarkly/android/LDClient;->updateProcessor:Lcom/launchdarkly/android/UpdateProcessor;

    invoke-interface {v0}, Lcom/launchdarkly/android/UpdateProcessor;->start()Lcom/google/common/util/concurrent/ListenableFuture;

    :cond_0
    return-void
.end method

.method stopForegroundUpdating()V
    .locals 1

    .line 858
    iget-object v0, p0, Lcom/launchdarkly/android/LDClient;->updateProcessor:Lcom/launchdarkly/android/UpdateProcessor;

    invoke-interface {v0}, Lcom/launchdarkly/android/UpdateProcessor;->stop()V

    return-void
.end method

.method public stringVariation(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    .locals 11

    const/4 v0, 0x1

    const/4 v1, 0x0

    const/4 v2, 0x2

    .line 642
    :try_start_0
    iget-object v3, p0, Lcom/launchdarkly/android/LDClient;->userManager:Lcom/launchdarkly/android/UserManager;

    invoke-virtual {v3}, Lcom/launchdarkly/android/UserManager;->getCurrentUserSharedPrefs()Landroid/content/SharedPreferences;

    move-result-object v3

    invoke-interface {v3, p1, p2}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3
    :try_end_0
    .catch Ljava/lang/ClassCastException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/NullPointerException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_1

    :catch_0
    move-exception v3

    const-string v4, "Attempted to get string flag with a default null value for key: %s Returning fallback: %s"

    .line 646
    new-array v5, v2, [Ljava/lang/Object;

    aput-object p1, v5, v1

    aput-object p2, v5, v0

    invoke-static {v3, v4, v5}, Ltimber/log/Timber;->e(Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V

    goto :goto_0

    :catch_1
    move-exception v3

    const-string v4, "Attempted to get string flag that exists as another type for key: %s Returning fallback: %s"

    .line 644
    new-array v5, v2, [Ljava/lang/Object;

    aput-object p1, v5, v1

    aput-object p2, v5, v0

    invoke-static {v3, v4, v5}, Ltimber/log/Timber;->e(Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V

    :goto_0
    move-object v3, p2

    .line 648
    :goto_1
    iget-object v4, p0, Lcom/launchdarkly/android/LDClient;->userManager:Lcom/launchdarkly/android/UserManager;

    invoke-virtual {v4}, Lcom/launchdarkly/android/UserManager;->getFlagResponseSharedPreferences()Lcom/launchdarkly/android/response/FlagResponseSharedPreferences;

    move-result-object v4

    invoke-interface {v4, p1}, Lcom/launchdarkly/android/response/FlagResponseSharedPreferences;->getVersionForEvents(Ljava/lang/String;)I

    move-result v9

    .line 649
    iget-object v4, p0, Lcom/launchdarkly/android/LDClient;->userManager:Lcom/launchdarkly/android/UserManager;

    invoke-virtual {v4}, Lcom/launchdarkly/android/UserManager;->getFlagResponseSharedPreferences()Lcom/launchdarkly/android/response/FlagResponseSharedPreferences;

    move-result-object v4

    invoke-interface {v4, p1}, Lcom/launchdarkly/android/response/FlagResponseSharedPreferences;->getStoredVariation(Ljava/lang/String;)I

    move-result v10

    const/4 v4, 0x0

    if-nez v3, :cond_0

    if-nez p2, :cond_0

    .line 651
    invoke-direct {p0, p1, v4, v4}, Lcom/launchdarkly/android/LDClient;->updateSummaryEvents(Ljava/lang/String;Lcom/google/gson/JsonElement;Lcom/google/gson/JsonElement;)V

    .line 652
    sget-object v7, Lcom/google/gson/JsonNull;->INSTANCE:Lcom/google/gson/JsonNull;

    sget-object v8, Lcom/google/gson/JsonNull;->INSTANCE:Lcom/google/gson/JsonNull;

    move-object v5, p0

    move-object v6, p1

    invoke-direct/range {v5 .. v10}, Lcom/launchdarkly/android/LDClient;->sendFlagRequestEvent(Ljava/lang/String;Lcom/google/gson/JsonElement;Lcom/google/gson/JsonElement;II)V

    goto :goto_2

    :cond_0
    if-nez v3, :cond_1

    .line 654
    new-instance v5, Lcom/google/gson/JsonPrimitive;

    invoke-direct {v5, p2}, Lcom/google/gson/JsonPrimitive;-><init>(Ljava/lang/String;)V

    invoke-direct {p0, p1, v4, v5}, Lcom/launchdarkly/android/LDClient;->updateSummaryEvents(Ljava/lang/String;Lcom/google/gson/JsonElement;Lcom/google/gson/JsonElement;)V

    .line 655
    sget-object v7, Lcom/google/gson/JsonNull;->INSTANCE:Lcom/google/gson/JsonNull;

    new-instance v8, Lcom/google/gson/JsonPrimitive;

    invoke-direct {v8, p2}, Lcom/google/gson/JsonPrimitive;-><init>(Ljava/lang/String;)V

    move-object v5, p0

    move-object v6, p1

    invoke-direct/range {v5 .. v10}, Lcom/launchdarkly/android/LDClient;->sendFlagRequestEvent(Ljava/lang/String;Lcom/google/gson/JsonElement;Lcom/google/gson/JsonElement;II)V

    goto :goto_2

    :cond_1
    if-nez p2, :cond_2

    .line 657
    new-instance p2, Lcom/google/gson/JsonPrimitive;

    invoke-direct {p2, v3}, Lcom/google/gson/JsonPrimitive;-><init>(Ljava/lang/String;)V

    invoke-direct {p0, p1, p2, v4}, Lcom/launchdarkly/android/LDClient;->updateSummaryEvents(Ljava/lang/String;Lcom/google/gson/JsonElement;Lcom/google/gson/JsonElement;)V

    .line 658
    new-instance v7, Lcom/google/gson/JsonPrimitive;

    invoke-direct {v7, v3}, Lcom/google/gson/JsonPrimitive;-><init>(Ljava/lang/String;)V

    sget-object v8, Lcom/google/gson/JsonNull;->INSTANCE:Lcom/google/gson/JsonNull;

    move-object v5, p0

    move-object v6, p1

    invoke-direct/range {v5 .. v10}, Lcom/launchdarkly/android/LDClient;->sendFlagRequestEvent(Ljava/lang/String;Lcom/google/gson/JsonElement;Lcom/google/gson/JsonElement;II)V

    goto :goto_2

    .line 660
    :cond_2
    new-instance v4, Lcom/google/gson/JsonPrimitive;

    invoke-direct {v4, v3}, Lcom/google/gson/JsonPrimitive;-><init>(Ljava/lang/String;)V

    new-instance v5, Lcom/google/gson/JsonPrimitive;

    invoke-direct {v5, p2}, Lcom/google/gson/JsonPrimitive;-><init>(Ljava/lang/String;)V

    invoke-direct {p0, p1, v4, v5}, Lcom/launchdarkly/android/LDClient;->updateSummaryEvents(Ljava/lang/String;Lcom/google/gson/JsonElement;Lcom/google/gson/JsonElement;)V

    .line 661
    new-instance v7, Lcom/google/gson/JsonPrimitive;

    invoke-direct {v7, v3}, Lcom/google/gson/JsonPrimitive;-><init>(Ljava/lang/String;)V

    new-instance v8, Lcom/google/gson/JsonPrimitive;

    invoke-direct {v8, p2}, Lcom/google/gson/JsonPrimitive;-><init>(Ljava/lang/String;)V

    move-object v5, p0

    move-object v6, p1

    invoke-direct/range {v5 .. v10}, Lcom/launchdarkly/android/LDClient;->sendFlagRequestEvent(Ljava/lang/String;Lcom/google/gson/JsonElement;Lcom/google/gson/JsonElement;II)V

    :goto_2
    const-string p2, "stringVariation: returning variation: %s flagKey: %s user key: %s"

    const/4 v4, 0x3

    .line 663
    new-array v4, v4, [Ljava/lang/Object;

    aput-object v3, v4, v1

    aput-object p1, v4, v0

    iget-object p1, p0, Lcom/launchdarkly/android/LDClient;->userManager:Lcom/launchdarkly/android/UserManager;

    invoke-virtual {p1}, Lcom/launchdarkly/android/UserManager;->getCurrentUser()Lcom/launchdarkly/android/LDUser;

    move-result-object p1

    invoke-virtual {p1}, Lcom/launchdarkly/android/LDUser;->getKeyAsString()Ljava/lang/String;

    move-result-object p1

    aput-object p1, v4, v2

    invoke-static {p2, v4}, Ltimber/log/Timber;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    return-object v3
.end method

.method public track(Ljava/lang/String;)V
    .locals 3

    .line 431
    iget-object v0, p0, Lcom/launchdarkly/android/LDClient;->config:Lcom/launchdarkly/android/LDConfig;

    invoke-virtual {v0}, Lcom/launchdarkly/android/LDConfig;->inlineUsersInEvents()Z

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    .line 432
    new-instance v0, Lcom/launchdarkly/android/CustomEvent;

    iget-object v2, p0, Lcom/launchdarkly/android/LDClient;->userManager:Lcom/launchdarkly/android/UserManager;

    invoke-virtual {v2}, Lcom/launchdarkly/android/UserManager;->getCurrentUser()Lcom/launchdarkly/android/LDUser;

    move-result-object v2

    invoke-direct {v0, p1, v2, v1}, Lcom/launchdarkly/android/CustomEvent;-><init>(Ljava/lang/String;Lcom/launchdarkly/android/LDUser;Lcom/google/gson/JsonElement;)V

    invoke-direct {p0, v0}, Lcom/launchdarkly/android/LDClient;->sendEvent(Lcom/launchdarkly/android/Event;)V

    goto :goto_0

    .line 434
    :cond_0
    new-instance v0, Lcom/launchdarkly/android/CustomEvent;

    iget-object v2, p0, Lcom/launchdarkly/android/LDClient;->userManager:Lcom/launchdarkly/android/UserManager;

    invoke-virtual {v2}, Lcom/launchdarkly/android/UserManager;->getCurrentUser()Lcom/launchdarkly/android/LDUser;

    move-result-object v2

    invoke-virtual {v2}, Lcom/launchdarkly/android/LDUser;->getKeyAsString()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v0, p1, v2, v1}, Lcom/launchdarkly/android/CustomEvent;-><init>(Ljava/lang/String;Ljava/lang/String;Lcom/google/gson/JsonElement;)V

    invoke-direct {p0, v0}, Lcom/launchdarkly/android/LDClient;->sendEvent(Lcom/launchdarkly/android/Event;)V

    :goto_0
    return-void
.end method

.method public track(Ljava/lang/String;Lcom/google/gson/JsonElement;)V
    .locals 2

    .line 417
    iget-object v0, p0, Lcom/launchdarkly/android/LDClient;->config:Lcom/launchdarkly/android/LDConfig;

    invoke-virtual {v0}, Lcom/launchdarkly/android/LDConfig;->inlineUsersInEvents()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 418
    new-instance v0, Lcom/launchdarkly/android/CustomEvent;

    iget-object v1, p0, Lcom/launchdarkly/android/LDClient;->userManager:Lcom/launchdarkly/android/UserManager;

    invoke-virtual {v1}, Lcom/launchdarkly/android/UserManager;->getCurrentUser()Lcom/launchdarkly/android/LDUser;

    move-result-object v1

    invoke-direct {v0, p1, v1, p2}, Lcom/launchdarkly/android/CustomEvent;-><init>(Ljava/lang/String;Lcom/launchdarkly/android/LDUser;Lcom/google/gson/JsonElement;)V

    invoke-direct {p0, v0}, Lcom/launchdarkly/android/LDClient;->sendEvent(Lcom/launchdarkly/android/Event;)V

    goto :goto_0

    .line 420
    :cond_0
    new-instance v0, Lcom/launchdarkly/android/CustomEvent;

    iget-object v1, p0, Lcom/launchdarkly/android/LDClient;->userManager:Lcom/launchdarkly/android/UserManager;

    invoke-virtual {v1}, Lcom/launchdarkly/android/UserManager;->getCurrentUser()Lcom/launchdarkly/android/LDUser;

    move-result-object v1

    invoke-virtual {v1}, Lcom/launchdarkly/android/LDUser;->getKeyAsString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, p1, v1, p2}, Lcom/launchdarkly/android/CustomEvent;-><init>(Ljava/lang/String;Ljava/lang/String;Lcom/google/gson/JsonElement;)V

    invoke-direct {p0, v0}, Lcom/launchdarkly/android/LDClient;->sendEvent(Lcom/launchdarkly/android/Event;)V

    :goto_0
    return-void
.end method

.method public unregisterFeatureFlagListener(Ljava/lang/String;Lcom/launchdarkly/android/FeatureFlagChangeListener;)V
    .locals 1

    .line 845
    iget-object v0, p0, Lcom/launchdarkly/android/LDClient;->userManager:Lcom/launchdarkly/android/UserManager;

    invoke-virtual {v0, p1, p2}, Lcom/launchdarkly/android/UserManager;->unregisterListener(Ljava/lang/String;Lcom/launchdarkly/android/FeatureFlagChangeListener;)V

    return-void
.end method
