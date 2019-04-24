.class public Lme/pushy/sdk/util/PushyServiceManager;
.super Ljava/lang/Object;


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static startSocketService(Landroid/content/Context;)V
    .locals 2

    invoke-static {p0}, Lme/pushy/sdk/util/PushyAuthentication;->getDeviceCredentials(Landroid/content/Context;)Lme/pushy/sdk/model/PushyDeviceCredentials;

    move-result-object v0

    if-nez v0, :cond_0

    return-void

    :cond_0
    const-string v0, "pushyNotificationsEnabled"

    const/4 v1, 0x1

    invoke-static {v0, v1, p0}, Lme/pushy/sdk/util/PushyPreferences;->getBoolean(Ljava/lang/String;ZLandroid/content/Context;)Z

    move-result v0

    if-nez v0, :cond_1

    const-string p0, "Pushy"

    const-string v0, "Notifications have been disabled by the app"

    invoke-static {p0, v0}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    return-void

    :cond_1
    const-string v0, "Pushy.START"

    invoke-static {p0, v0}, Lme/pushy/sdk/util/PushyServiceManager;->startSocketServiceWithAction(Landroid/content/Context;Ljava/lang/String;)V

    return-void
.end method

.method private static startSocketServiceWithAction(Landroid/content/Context;Ljava/lang/String;)V
    .locals 2

    new-instance v0, Landroid/content/Intent;

    const-class v1, Lme/pushy/sdk/services/PushySocketService;

    invoke-direct {v0, p0, v1}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    invoke-virtual {v0, p1}, Landroid/content/Intent;->setAction(Ljava/lang/String;)Landroid/content/Intent;

    invoke-virtual {p0, v0}, Landroid/content/Context;->startService(Landroid/content/Intent;)Landroid/content/ComponentName;

    return-void
.end method

.method public static stopSocketService(Landroid/content/Context;)V
    .locals 2

    new-instance v0, Landroid/content/Intent;

    const-class v1, Lme/pushy/sdk/services/PushySocketService;

    invoke-direct {v0, p0, v1}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    invoke-virtual {p0, v0}, Landroid/content/Context;->stopService(Landroid/content/Intent;)Z

    return-void
.end method
