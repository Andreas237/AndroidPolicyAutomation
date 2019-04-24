.class public Lcom/ibotta/android/receiver/push/FcmBroadcastReceiver;
.super Landroid/content/BroadcastReceiver;
.source "FcmBroadcastReceiver.java"


# instance fields
.field protected pushMessaging:Lcom/ibotta/android/service/push/PushMessaging;
    .annotation runtime Ljavax/inject/Inject;
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 22
    invoke-direct {p0}, Landroid/content/BroadcastReceiver;-><init>()V

    return-void
.end method


# virtual methods
.method public onReceive(Landroid/content/Context;Landroid/content/Intent;)V
    .locals 2

    .line 28
    invoke-static {}, Lcom/ibotta/android/App;->instance()Lcom/ibotta/android/App;

    move-result-object v0

    invoke-virtual {v0}, Lcom/ibotta/android/App;->getMainComponent()Lcom/ibotta/android/di/MainComponent;

    move-result-object v0

    invoke-interface {v0, p0}, Lcom/ibotta/android/di/MainComponent;->inject(Lcom/ibotta/android/receiver/push/FcmBroadcastReceiver;)V

    .line 30
    invoke-static {p2}, Lcom/appboy/push/AppboyNotificationUtils;->isAppboyPushMessage(Landroid/content/Intent;)Z

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    const-string v0, "Detected a push message meant for Appboy"

    .line 32
    new-array v1, v1, [Ljava/lang/Object;

    invoke-static {v0, v1}, Ltimber/log/Timber;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 33
    iget-object v0, p0, Lcom/ibotta/android/receiver/push/FcmBroadcastReceiver;->pushMessaging:Lcom/ibotta/android/service/push/PushMessaging;

    invoke-virtual {v0, p2}, Lcom/ibotta/android/service/push/PushMessaging;->onAppboyMessage(Landroid/content/Intent;)V

    .line 34
    new-instance v0, Lcom/appboy/AppboyFcmReceiver;

    invoke-direct {v0}, Lcom/appboy/AppboyFcmReceiver;-><init>()V

    invoke-virtual {v0, p1, p2}, Lcom/appboy/AppboyFcmReceiver;->onReceive(Landroid/content/Context;Landroid/content/Intent;)V

    goto :goto_0

    :cond_0
    const-string v0, "Detected a push message"

    .line 36
    new-array v1, v1, [Ljava/lang/Object;

    invoke-static {v0, v1}, Ltimber/log/Timber;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 38
    invoke-static {p1, p2}, Lcom/ibotta/android/service/push/FcmIntentService;->enqueueWork(Landroid/content/Context;Landroid/content/Intent;)V

    :goto_0
    return-void
.end method
