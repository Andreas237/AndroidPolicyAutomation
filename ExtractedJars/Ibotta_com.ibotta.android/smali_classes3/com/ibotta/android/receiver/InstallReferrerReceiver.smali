.class public Lcom/ibotta/android/receiver/InstallReferrerReceiver;
.super Landroid/content/BroadcastReceiver;
.source "InstallReferrerReceiver.java"


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 19
    invoke-direct {p0}, Landroid/content/BroadcastReceiver;-><init>()V

    return-void
.end method


# virtual methods
.method public onReceive(Landroid/content/Context;Landroid/content/Intent;)V
    .locals 4

    const-string v0, "onReceive"

    const/4 v1, 0x0

    .line 22
    new-array v2, v1, [Ljava/lang/Object;

    invoke-static {v0, v2}, Ltimber/log/Timber;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 26
    :try_start_0
    new-instance v0, Lcom/google/android/gms/analytics/CampaignTrackingReceiver;

    invoke-direct {v0}, Lcom/google/android/gms/analytics/CampaignTrackingReceiver;-><init>()V

    .line 27
    invoke-virtual {v0, p1, p2}, Lcom/google/android/gms/analytics/CampaignTrackingReceiver;->onReceive(Landroid/content/Context;Landroid/content/Intent;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v0

    const-string v2, "GA Tracker failed to receive install referrer event."

    .line 29
    new-array v3, v1, [Ljava/lang/Object;

    invoke-static {v0, v2, v3}, Ltimber/log/Timber;->e(Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 30
    sget-object v2, Lcom/ibotta/android/crash/IbottaCrashProxy;->IbottaCrashManager:Lcom/ibotta/android/crash/CrashManager;

    invoke-virtual {v2, v0}, Lcom/ibotta/android/crash/CrashManager;->trackException(Ljava/lang/Throwable;)V

    .line 35
    :goto_0
    :try_start_1
    new-instance v0, Lcom/usebutton/sdk/internal/receivers/InstallNotificationReceiver;

    invoke-direct {v0}, Lcom/usebutton/sdk/internal/receivers/InstallNotificationReceiver;-><init>()V

    invoke-virtual {v0, p1, p2}, Lcom/usebutton/sdk/internal/receivers/InstallNotificationReceiver;->onReceive(Landroid/content/Context;Landroid/content/Intent;)V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    goto :goto_1

    :catch_1
    move-exception v0

    const-string v2, "Button SDK failed to receive install referrer event."

    .line 37
    new-array v3, v1, [Ljava/lang/Object;

    invoke-static {v0, v2, v3}, Ltimber/log/Timber;->e(Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 38
    sget-object v2, Lcom/ibotta/android/crash/IbottaCrashProxy;->IbottaCrashManager:Lcom/ibotta/android/crash/CrashManager;

    invoke-virtual {v2, v0}, Lcom/ibotta/android/crash/CrashManager;->trackException(Ljava/lang/Throwable;)V

    .line 43
    :goto_1
    :try_start_2
    new-instance v0, Lcom/appsflyer/SingleInstallBroadcastReceiver;

    invoke-direct {v0}, Lcom/appsflyer/SingleInstallBroadcastReceiver;-><init>()V

    invoke-virtual {v0, p1, p2}, Lcom/appsflyer/SingleInstallBroadcastReceiver;->onReceive(Landroid/content/Context;Landroid/content/Intent;)V
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_2

    goto :goto_2

    :catch_2
    move-exception p1

    const-string p2, "AppsFlyer failed to receive install referrer event."

    .line 45
    new-array v0, v1, [Ljava/lang/Object;

    invoke-static {p1, p2, v0}, Ltimber/log/Timber;->e(Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 46
    sget-object p2, Lcom/ibotta/android/crash/IbottaCrashProxy;->IbottaCrashManager:Lcom/ibotta/android/crash/CrashManager;

    invoke-virtual {p2, p1}, Lcom/ibotta/android/crash/CrashManager;->trackException(Ljava/lang/Throwable;)V

    :goto_2
    return-void
.end method
