.class public Lcom/ibotta/android/receiver/push/BrazeBroadcastReceiver;
.super Landroid/support/v4/content/WakefulBroadcastReceiver;
.source "BrazeBroadcastReceiver.java"


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 20
    invoke-direct {p0}, Landroid/support/v4/content/WakefulBroadcastReceiver;-><init>()V

    return-void
.end method


# virtual methods
.method public onReceive(Landroid/content/Context;Landroid/content/Intent;)V
    .locals 7

    .line 23
    invoke-virtual {p1}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v0

    .line 24
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, ".intent.APPBOY_PUSH_RECEIVED"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    .line 25
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ".intent.APPBOY_NOTIFICATION_OPENED"

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 26
    invoke-virtual {p2}, Landroid/content/Intent;->getAction()Ljava/lang/String;

    move-result-object v2

    const-string v3, "Received intent with action %s"

    const/4 v4, 0x1

    .line 27
    new-array v5, v4, [Ljava/lang/Object;

    const/4 v6, 0x0

    aput-object v2, v5, v6

    invoke-static {v3, v5}, Ltimber/log/Timber;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 29
    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    const-string p1, "Received push notification."

    .line 30
    new-array v0, v6, [Ljava/lang/Object;

    invoke-static {p1, v0}, Ltimber/log/Timber;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 31
    invoke-virtual {p2}, Landroid/content/Intent;->getExtras()Landroid/os/Bundle;

    move-result-object p1

    invoke-static {p1}, Lcom/appboy/push/AppboyNotificationUtils;->isUninstallTrackingPush(Landroid/os/Bundle;)Z

    move-result p1

    if-eqz p1, :cond_3

    const-string p1, "Got uninstall tracking push"

    .line 32
    new-array p2, v6, [Ljava/lang/Object;

    invoke-static {p1, p2}, Ltimber/log/Timber;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    goto :goto_1

    .line 34
    :cond_0
    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    const-string v0, "uri"

    .line 42
    invoke-virtual {p2, v0}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    .line 45
    invoke-static {p2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_1

    const-string v0, "Launching deep link %1$s"

    .line 46
    new-array v1, v4, [Ljava/lang/Object;

    aput-object p2, v1, v6

    invoke-static {v0, v1}, Ltimber/log/Timber;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 47
    new-instance v0, Lcom/ibotta/android/routing/intent/RoutingIntentCreator;

    invoke-direct {v0, p1, p2, v6}, Lcom/ibotta/android/routing/intent/RoutingIntentCreator;-><init>(Landroid/content/Context;Ljava/lang/String;Z)V

    invoke-virtual {v0}, Lcom/ibotta/android/routing/intent/RoutingIntentCreator;->create()Landroid/content/Intent;

    move-result-object p2

    goto :goto_0

    .line 49
    :cond_1
    new-instance p2, Lcom/ibotta/android/routing/intent/LaunchIntentCreator;

    invoke-direct {p2, p1, v6}, Lcom/ibotta/android/routing/intent/LaunchIntentCreator;-><init>(Landroid/content/Context;Z)V

    invoke-virtual {p2}, Lcom/ibotta/android/routing/intent/LaunchIntentCreator;->create()Landroid/content/Intent;

    move-result-object p2

    :goto_0
    const/high16 v0, 0x10000000

    .line 52
    invoke-virtual {p2, v0}, Landroid/content/Intent;->addFlags(I)Landroid/content/Intent;

    .line 53
    invoke-virtual {p1, p2}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V

    goto :goto_1

    :cond_2
    const-string p1, "Ignoring intent with unsupported action %s"

    .line 55
    new-array p2, v4, [Ljava/lang/Object;

    aput-object v2, p2, v6

    invoke-static {p1, p2}, Ltimber/log/Timber;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    :cond_3
    :goto_1
    return-void
.end method
