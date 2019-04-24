.class Lcom/launchdarkly/android/Util;
.super Ljava/lang/Object;
.source "Util.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/launchdarkly/android/Util$Provider;,
        Lcom/launchdarkly/android/Util$LazySingleton;
    }
.end annotation


# direct methods
.method constructor <init>()V
    .locals 0

    .line 9
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method static isClientConnected(Landroid/content/Context;)Z
    .locals 3

    .line 30
    invoke-static {p0}, Lcom/launchdarkly/android/Util;->isInternetConnected(Landroid/content/Context;)Z

    move-result p0

    const/4 v0, 0x0

    if-eqz p0, :cond_0

    .line 32
    :try_start_0
    invoke-static {}, Lcom/launchdarkly/android/LDClient;->get()Lcom/launchdarkly/android/LDClient;

    move-result-object p0

    invoke-virtual {p0}, Lcom/launchdarkly/android/LDClient;->isOffline()Z

    move-result p0
    :try_end_0
    .catch Lcom/launchdarkly/android/LaunchDarklyException; {:try_start_0 .. :try_end_0} :catch_0

    if-nez p0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :catch_0
    move-exception p0

    const-string v1, "Exception caught when getting LDClient"

    .line 34
    new-array v2, v0, [Ljava/lang/Object;

    invoke-static {p0, v1, v2}, Ltimber/log/Timber;->e(Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V

    return v0

    :cond_0
    :goto_0
    return v0
.end method

.method static isClientConnected(Landroid/content/Context;Ljava/lang/String;)Z
    .locals 2

    .line 47
    invoke-static {p0}, Lcom/launchdarkly/android/Util;->isInternetConnected(Landroid/content/Context;)Z

    move-result p0

    const/4 v0, 0x0

    if-eqz p0, :cond_0

    .line 49
    :try_start_0
    invoke-static {p1}, Lcom/launchdarkly/android/LDClient;->getForMobileKey(Ljava/lang/String;)Lcom/launchdarkly/android/LDClient;

    move-result-object p0

    invoke-virtual {p0}, Lcom/launchdarkly/android/LDClient;->isOffline()Z

    move-result p0
    :try_end_0
    .catch Lcom/launchdarkly/android/LaunchDarklyException; {:try_start_0 .. :try_end_0} :catch_0

    if-nez p0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :catch_0
    move-exception p0

    const-string p1, "Exception caught when getting LDClient"

    .line 51
    new-array v1, v0, [Ljava/lang/Object;

    invoke-static {p0, p1, v1}, Ltimber/log/Timber;->e(Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V

    return v0

    :cond_0
    :goto_0
    return v0
.end method

.method static isInternetConnected(Landroid/content/Context;)Z
    .locals 1

    const-string v0, "connectivity"

    .line 18
    invoke-virtual {p0, v0}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Landroid/net/ConnectivityManager;

    .line 19
    invoke-virtual {p0}, Landroid/net/ConnectivityManager;->getActiveNetworkInfo()Landroid/net/NetworkInfo;

    move-result-object p0

    if-eqz p0, :cond_0

    .line 20
    invoke-virtual {p0}, Landroid/net/NetworkInfo;->isConnectedOrConnecting()Z

    move-result p0

    if-eqz p0, :cond_0

    const/4 p0, 0x1

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    :goto_0
    return p0
.end method
