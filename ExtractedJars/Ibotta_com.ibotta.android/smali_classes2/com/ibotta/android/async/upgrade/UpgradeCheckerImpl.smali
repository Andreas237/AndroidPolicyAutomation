.class public Lcom/ibotta/android/async/upgrade/UpgradeCheckerImpl;
.super Ljava/lang/Object;
.source "UpgradeCheckerImpl.java"

# interfaces
.implements Lcom/ibotta/android/async/upgrade/UpgradeChecker;
.implements Lcom/ibotta/android/state/app/config/AppConfigListener;


# annotations
.annotation build Lcom/newrelic/agent/android/instrumentation/Instrumented;
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/ibotta/android/async/upgrade/UpgradeCheckerImpl$UpgradeCheckTask;
    }
.end annotation

.annotation runtime Ljavax/inject/Singleton;
.end annotation


# static fields
.field protected static final CHECK_INTERVAL:J = 0xdbba00L


# instance fields
.field private final buildProfile:Lcom/ibotta/android/profile/BuildProfile;

.field private final globalEventManager:Lcom/ibotta/android/state/GlobalEventManager;

.field private final serverUpgradeState:Lcom/ibotta/android/state/app/upgrade/ServerUpgradeState;

.field protected upgradeCheck:Lcom/ibotta/android/async/upgrade/UpgradeCheckerImpl$UpgradeCheckTask;

.field private final upgradeState:Lcom/ibotta/android/state/app/upgrade/UpgradeState;


# direct methods
.method public constructor <init>(Lcom/ibotta/android/state/app/upgrade/ServerUpgradeState;Lcom/ibotta/android/state/app/upgrade/UpgradeState;Lcom/ibotta/android/state/GlobalEventManager;Lcom/ibotta/android/profile/BuildProfile;)V
    .locals 0

    .line 39
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 40
    iput-object p1, p0, Lcom/ibotta/android/async/upgrade/UpgradeCheckerImpl;->serverUpgradeState:Lcom/ibotta/android/state/app/upgrade/ServerUpgradeState;

    .line 41
    iput-object p2, p0, Lcom/ibotta/android/async/upgrade/UpgradeCheckerImpl;->upgradeState:Lcom/ibotta/android/state/app/upgrade/UpgradeState;

    .line 42
    iput-object p3, p0, Lcom/ibotta/android/async/upgrade/UpgradeCheckerImpl;->globalEventManager:Lcom/ibotta/android/state/GlobalEventManager;

    .line 43
    iput-object p4, p0, Lcom/ibotta/android/async/upgrade/UpgradeCheckerImpl;->buildProfile:Lcom/ibotta/android/profile/BuildProfile;

    return-void
.end method


# virtual methods
.method public checkForRequiredUpgrade()V
    .locals 1

    .line 90
    iget-object v0, p0, Lcom/ibotta/android/async/upgrade/UpgradeCheckerImpl;->serverUpgradeState:Lcom/ibotta/android/state/app/upgrade/ServerUpgradeState;

    invoke-interface {v0}, Lcom/ibotta/android/state/app/upgrade/ServerUpgradeState;->isUpgradeRequired()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 91
    iget-object v0, p0, Lcom/ibotta/android/async/upgrade/UpgradeCheckerImpl;->globalEventManager:Lcom/ibotta/android/state/GlobalEventManager;

    invoke-interface {v0}, Lcom/ibotta/android/state/GlobalEventManager;->onUpgradeRequired()V

    goto :goto_0

    .line 93
    :cond_0
    invoke-virtual {p0}, Lcom/ibotta/android/async/upgrade/UpgradeCheckerImpl;->checkForUpgrade()V

    :goto_0
    return-void
.end method

.method public checkForUpgrade()V
    .locals 5

    .line 60
    invoke-virtual {p0}, Lcom/ibotta/android/async/upgrade/UpgradeCheckerImpl;->isOnMain()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 64
    invoke-virtual {p0}, Lcom/ibotta/android/async/upgrade/UpgradeCheckerImpl;->getCurrentTime()J

    move-result-wide v0

    .line 65
    iget-object v2, p0, Lcom/ibotta/android/async/upgrade/UpgradeCheckerImpl;->upgradeState:Lcom/ibotta/android/state/app/upgrade/UpgradeState;

    invoke-interface {v2}, Lcom/ibotta/android/state/app/upgrade/UpgradeState;->getLastUpgradeCheck()J

    move-result-wide v2

    sub-long/2addr v0, v2

    const-wide/32 v2, 0xdbba00

    cmp-long v4, v0, v2

    if-ltz v4, :cond_0

    const-string v0, "Starting async task to check for upgrade..."

    const/4 v1, 0x0

    .line 69
    new-array v1, v1, [Ljava/lang/Object;

    invoke-static {v0, v1}, Ltimber/log/Timber;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 70
    invoke-virtual {p0}, Lcom/ibotta/android/async/upgrade/UpgradeCheckerImpl;->executeUpgradeCheck()V

    :cond_0
    return-void

    .line 61
    :cond_1
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "UpgradeChecker run() must only be called from the main thread."

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method protected executeUpgradeCheck()V
    .locals 3

    .line 79
    iget-object v0, p0, Lcom/ibotta/android/async/upgrade/UpgradeCheckerImpl;->upgradeCheck:Lcom/ibotta/android/async/upgrade/UpgradeCheckerImpl$UpgradeCheckTask;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    const-string v0, "Upgrade check task already executing."

    .line 80
    new-array v1, v1, [Ljava/lang/Object;

    invoke-static {v0, v1}, Ltimber/log/Timber;->w(Ljava/lang/String;[Ljava/lang/Object;)V

    return-void

    .line 84
    :cond_0
    new-instance v0, Lcom/ibotta/android/async/upgrade/UpgradeCheckerImpl$UpgradeCheckTask;

    invoke-direct {v0, p0}, Lcom/ibotta/android/async/upgrade/UpgradeCheckerImpl$UpgradeCheckTask;-><init>(Lcom/ibotta/android/async/upgrade/UpgradeCheckerImpl;)V

    iput-object v0, p0, Lcom/ibotta/android/async/upgrade/UpgradeCheckerImpl;->upgradeCheck:Lcom/ibotta/android/async/upgrade/UpgradeCheckerImpl$UpgradeCheckTask;

    .line 85
    iget-object v0, p0, Lcom/ibotta/android/async/upgrade/UpgradeCheckerImpl;->upgradeCheck:Lcom/ibotta/android/async/upgrade/UpgradeCheckerImpl$UpgradeCheckTask;

    new-array v1, v1, [Ljava/lang/Void;

    instance-of v2, v0, Landroid/os/AsyncTask;

    if-nez v2, :cond_1

    invoke-virtual {v0, v1}, Lcom/ibotta/android/async/upgrade/UpgradeCheckerImpl$UpgradeCheckTask;->execute([Ljava/lang/Object;)Landroid/os/AsyncTask;

    goto :goto_0

    :cond_1
    check-cast v0, Landroid/os/AsyncTask;

    invoke-static {v0, v1}, Lcom/newrelic/agent/android/instrumentation/AsyncTaskInstrumentation;->execute(Landroid/os/AsyncTask;[Ljava/lang/Object;)Landroid/os/AsyncTask;

    :goto_0
    return-void
.end method

.method protected getAppVersionName()Ljava/lang/String;
    .locals 1
    .annotation build Landroid/support/annotation/VisibleForTesting;
    .end annotation

    .line 155
    iget-object v0, p0, Lcom/ibotta/android/async/upgrade/UpgradeCheckerImpl;->buildProfile:Lcom/ibotta/android/profile/BuildProfile;

    invoke-interface {v0}, Lcom/ibotta/android/profile/BuildProfile;->getAppVersionName()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method protected getCurrentTime()J
    .locals 2
    .annotation build Landroid/support/annotation/VisibleForTesting;
    .end annotation

    .line 150
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    return-wide v0
.end method

.method public getGlobalEventManager()Lcom/ibotta/android/state/GlobalEventManager;
    .locals 1

    .line 55
    iget-object v0, p0, Lcom/ibotta/android/async/upgrade/UpgradeCheckerImpl;->globalEventManager:Lcom/ibotta/android/state/GlobalEventManager;

    return-object v0
.end method

.method public getServerUpgradeState()Lcom/ibotta/android/state/app/upgrade/ServerUpgradeState;
    .locals 1

    .line 47
    iget-object v0, p0, Lcom/ibotta/android/async/upgrade/UpgradeCheckerImpl;->serverUpgradeState:Lcom/ibotta/android/state/app/upgrade/ServerUpgradeState;

    return-object v0
.end method

.method public getUpgradeState()Lcom/ibotta/android/state/app/upgrade/UpgradeState;
    .locals 1

    .line 51
    iget-object v0, p0, Lcom/ibotta/android/async/upgrade/UpgradeCheckerImpl;->upgradeState:Lcom/ibotta/android/state/app/upgrade/UpgradeState;

    return-object v0
.end method

.method protected isOnMain()Z
    .locals 2

    .line 75
    invoke-static {}, Landroid/os/Looper;->myLooper()Landroid/os/Looper;

    move-result-object v0

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v1

    if-ne v0, v1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public onAppConfigChanged()V
    .locals 0

    .line 165
    invoke-virtual {p0}, Lcom/ibotta/android/async/upgrade/UpgradeCheckerImpl;->checkForRequiredUpgrade()V

    return-void
.end method

.method public onUpgradeCheckFinished(Ljava/lang/String;)V
    .locals 6

    const/4 v0, 0x0

    .line 99
    iput-object v0, p0, Lcom/ibotta/android/async/upgrade/UpgradeCheckerImpl;->upgradeCheck:Lcom/ibotta/android/async/upgrade/UpgradeCheckerImpl$UpgradeCheckTask;

    const/4 v0, 0x0

    if-nez p1, :cond_0

    const-string p1, "No upgrade available at this time."

    .line 101
    new-array v0, v0, [Ljava/lang/Object;

    invoke-static {p1, v0}, Ltimber/log/Timber;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    return-void

    .line 105
    :cond_0
    invoke-virtual {p0}, Lcom/ibotta/android/async/upgrade/UpgradeCheckerImpl;->getAppVersionName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0, v1}, Lcom/ibotta/android/async/upgrade/UpgradeCheckerImpl;->parseVersion(Ljava/lang/String;)[I

    move-result-object v1

    .line 106
    invoke-virtual {p0, p1}, Lcom/ibotta/android/async/upgrade/UpgradeCheckerImpl;->parseVersion(Ljava/lang/String;)[I

    move-result-object v2

    const/4 v3, 0x0

    .line 109
    :goto_0
    array-length v4, v1

    if-ge v3, v4, :cond_3

    .line 110
    aget v4, v1, v3

    aget v5, v2, v3

    if-le v4, v5, :cond_1

    goto :goto_1

    .line 114
    :cond_1
    aget v4, v2, v3

    aget v5, v1, v3

    if-le v4, v5, :cond_2

    const/4 v1, 0x1

    goto :goto_2

    :cond_2
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_3
    :goto_1
    const/4 v1, 0x0

    :goto_2
    if-eqz v1, :cond_4

    const-string v1, "App upgrade available."

    .line 121
    new-array v0, v0, [Ljava/lang/Object;

    invoke-static {v1, v0}, Ltimber/log/Timber;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 122
    iget-object v0, p0, Lcom/ibotta/android/async/upgrade/UpgradeCheckerImpl;->globalEventManager:Lcom/ibotta/android/state/GlobalEventManager;

    invoke-interface {v0, p1}, Lcom/ibotta/android/state/GlobalEventManager;->onUpgradeAvailable(Ljava/lang/String;)V

    goto :goto_3

    :cond_4
    const-string p1, "No app upgrade available at this time."

    .line 124
    new-array v0, v0, [Ljava/lang/Object;

    invoke-static {p1, v0}, Ltimber/log/Timber;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 125
    iget-object p1, p0, Lcom/ibotta/android/async/upgrade/UpgradeCheckerImpl;->upgradeState:Lcom/ibotta/android/state/app/upgrade/UpgradeState;

    invoke-interface {p1}, Lcom/ibotta/android/state/app/upgrade/UpgradeState;->ackUpgradeCheck()V

    :goto_3
    return-void
.end method

.method public parseVersion(Ljava/lang/String;)[I
    .locals 6

    const/4 v0, 0x3

    .line 131
    new-array v0, v0, [I

    fill-array-data v0, :array_0

    const-string v1, "\\."

    .line 133
    invoke-virtual {p1, v1}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object p1

    if-eqz p1, :cond_0

    const/4 v1, 0x0

    const/4 v2, 0x0

    .line 135
    :goto_0
    array-length v3, p1

    array-length v4, v0

    invoke-static {v3, v4}, Ljava/lang/Math;->min(II)I

    move-result v3

    if-ge v2, v3, :cond_0

    .line 137
    :try_start_0
    aget-object v3, p1, v2

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(Ljava/lang/String;)Ljava/lang/Integer;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    move-result v3

    aput v3, v0, v2
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_1

    :catch_0
    move-exception v3

    const-string v4, "Failed to parse version string part: "

    .line 139
    new-array v5, v1, [Ljava/lang/Object;

    invoke-static {v3, v4, v5}, Ltimber/log/Timber;->e(Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 140
    invoke-virtual {p0, v3}, Lcom/ibotta/android/async/upgrade/UpgradeCheckerImpl;->trackException(Ljava/lang/Exception;)V

    :goto_1
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_0
    return-object v0

    :array_0
    .array-data 4
        0x0
        0x0
        0x0
    .end array-data
.end method

.method protected trackException(Ljava/lang/Exception;)V
    .locals 1
    .annotation build Landroid/support/annotation/VisibleForTesting;
    .end annotation

    .line 160
    sget-object v0, Lcom/ibotta/android/crash/IbottaCrashProxy;->IbottaCrashManager:Lcom/ibotta/android/crash/CrashManager;

    invoke-virtual {v0, p1}, Lcom/ibotta/android/crash/CrashManager;->trackException(Ljava/lang/Throwable;)V

    return-void
.end method
