.class public Lo/cls;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 16
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static a(Landroid/content/Context;Landroid/content/Intent;)V
    .locals 5

    .line 29
    invoke-static {p0}, Landroid/support/v4/content/LocalBroadcastManager;->getInstance(Landroid/content/Context;)Landroid/support/v4/content/LocalBroadcastManager;

    move-result-object v4

    .line 30
    const/4 v0, 0x0

    if-ne v0, v4, :cond_0

    .line 31
    const-string v0, "Debug_HiBroadcastManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "sendLocalBroadcast localBroadcastManager == null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/cnr;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 32
    return-void

    .line 34
    :cond_0
    invoke-virtual {v4, p1}, Landroid/support/v4/content/LocalBroadcastManager;->sendBroadcast(Landroid/content/Intent;)Z

    .line 35
    return-void
.end method

.method public static c(Landroid/content/Context;Landroid/content/Intent;)V
    .locals 1

    .line 41
    const-string v0, "com.huawei.hihealth.DEFAULT_PERMISSION"

    invoke-virtual {p0, p1, v0}, Landroid/content/Context;->sendBroadcast(Landroid/content/Intent;Ljava/lang/String;)V

    .line 42
    return-void
.end method

.method public static final d(Landroid/content/Context;Landroid/content/BroadcastReceiver;)V
    .locals 0

    .line 55
    invoke-virtual {p0, p1}, Landroid/content/Context;->unregisterReceiver(Landroid/content/BroadcastReceiver;)V

    .line 56
    return-void
.end method

.method public static final d(Landroid/content/Context;Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;)V
    .locals 2

    .line 48
    const-string v0, "com.huawei.hihealth.DEFAULT_PERMISSION"

    const/4 v1, 0x0

    invoke-virtual {p0, p1, p2, v0, v1}, Landroid/content/Context;->registerReceiver(Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;Ljava/lang/String;Landroid/os/Handler;)Landroid/content/Intent;

    .line 49
    return-void
.end method
