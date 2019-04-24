.class public Lcom/launchdarkly/android/ConnectivityReceiver;
.super Landroid/content/BroadcastReceiver;
.source "ConnectivityReceiver.java"


# static fields
.field static final CONNECTIVITY_CHANGE:Ljava/lang/String; = "android.net.conn.CONNECTIVITY_CHANGE"


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 11
    invoke-direct {p0}, Landroid/content/BroadcastReceiver;-><init>()V

    return-void
.end method


# virtual methods
.method public onReceive(Landroid/content/Context;Landroid/content/Intent;)V
    .locals 3

    .line 17
    invoke-static {p1}, Lcom/launchdarkly/android/Util;->isInternetConnected(Landroid/content/Context;)Z

    move-result p2

    const/4 v0, 0x0

    if-eqz p2, :cond_2

    const-string p2, "Connected to the internet"

    .line 18
    new-array v1, v0, [Ljava/lang/Object;

    invoke-static {p2, v1}, Ltimber/log/Timber;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 20
    :try_start_0
    invoke-static {}, Lcom/launchdarkly/android/LDClient;->getEnvironmentNames()Ljava/util/Set;

    move-result-object p2

    invoke-interface {p2}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object p2

    :cond_0
    :goto_0
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_3

    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    .line 21
    invoke-static {v1}, Lcom/launchdarkly/android/LDClient;->getForMobileKey(Ljava/lang/String;)Lcom/launchdarkly/android/LDClient;

    move-result-object v1

    .line 22
    invoke-virtual {v1}, Lcom/launchdarkly/android/LDClient;->isOffline()Z

    move-result v2

    if-nez v2, :cond_0

    .line 23
    invoke-static {p1}, Lcom/launchdarkly/android/Foreground;->get(Landroid/content/Context;)Lcom/launchdarkly/android/Foreground;

    move-result-object v2

    invoke-virtual {v2}, Lcom/launchdarkly/android/Foreground;->isForeground()Z

    move-result v2

    if-eqz v2, :cond_1

    .line 24
    invoke-virtual {v1}, Lcom/launchdarkly/android/LDClient;->startForegroundUpdating()V

    goto :goto_0

    .line 25
    :cond_1
    invoke-virtual {v1}, Lcom/launchdarkly/android/LDClient;->isDisableBackgroundPolling()Z

    move-result v1

    if-nez v1, :cond_0

    .line 26
    invoke-static {p1}, Lcom/launchdarkly/android/PollingUpdater;->startBackgroundPolling(Landroid/content/Context;)V
    :try_end_0
    .catch Lcom/launchdarkly/android/LaunchDarklyException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception p1

    const-string p2, "Tried to restart foreground updating, but LDClient has not yet been initialized."

    .line 31
    new-array v0, v0, [Ljava/lang/Object;

    invoke-static {p1, p2, v0}, Ltimber/log/Timber;->e(Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V

    goto :goto_2

    :cond_2
    const-string p1, "Not Connected to the internet"

    .line 34
    new-array p2, v0, [Ljava/lang/Object;

    invoke-static {p1, p2}, Ltimber/log/Timber;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 36
    :try_start_1
    invoke-static {}, Lcom/launchdarkly/android/LDClient;->getEnvironmentNames()Ljava/util/Set;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_1
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result p2

    if-eqz p2, :cond_3

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ljava/lang/String;

    .line 37
    invoke-static {p2}, Lcom/launchdarkly/android/LDClient;->getForMobileKey(Ljava/lang/String;)Lcom/launchdarkly/android/LDClient;

    move-result-object p2

    .line 38
    invoke-virtual {p2}, Lcom/launchdarkly/android/LDClient;->stopForegroundUpdating()V
    :try_end_1
    .catch Lcom/launchdarkly/android/LaunchDarklyException; {:try_start_1 .. :try_end_1} :catch_1

    goto :goto_1

    :catch_1
    move-exception p1

    const-string p2, "Tried to stop foreground updating, but LDClient has not yet been initialized."

    .line 41
    new-array v0, v0, [Ljava/lang/Object;

    invoke-static {p1, p2, v0}, Ltimber/log/Timber;->e(Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V

    :cond_3
    :goto_2
    return-void
.end method
