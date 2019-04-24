.class public Lcom/shopkick/app/GCMIntentService;
.super Lcom/google/android/gcm/GCMBaseIntentService;
.source "GCMIntentService.java"

# interfaces
.implements Lcom/shopkick/app/gcm/GCMConstants;


# annotations
.annotation runtime Ljava/lang/Deprecated;
.end annotation


# static fields
.field private static final LOG_TAG:Ljava/lang/String; = "GCMIntentService"


# instance fields
.field private handler:Landroid/os/Handler;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 40
    sget-object v0, Lcom/shopkick/app/GCMIntentService;->GCM_SENDER_IDS:[Ljava/lang/String;

    invoke-direct {p0, v0}, Lcom/google/android/gcm/GCMBaseIntentService;-><init>([Ljava/lang/String;)V

    return-void
.end method


# virtual methods
.method public onCreate()V
    .locals 1

    .line 45
    invoke-super {p0}, Lcom/google/android/gcm/GCMBaseIntentService;->onCreate()V

    .line 46
    new-instance v0, Landroid/os/Handler;

    invoke-direct {v0}, Landroid/os/Handler;-><init>()V

    iput-object v0, p0, Lcom/shopkick/app/GCMIntentService;->handler:Landroid/os/Handler;

    return-void
.end method

.method protected onDeletedMessages(Landroid/content/Context;I)V
    .locals 0

    const-string p1, "GCMIntentService"

    const-string p2, "Received deleted messages notification"

    .line 88
    invoke-static {p1, p2}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    return-void
.end method

.method public onError(Landroid/content/Context;Ljava/lang/String;)V
    .locals 0

    return-void
.end method

.method protected onMessage(Landroid/content/Context;Landroid/content/Intent;)V
    .locals 3

    .line 75
    invoke-virtual {p2}, Landroid/content/Intent;->getExtras()Landroid/os/Bundle;

    move-result-object p2

    const-string v0, "payload"

    invoke-virtual {p2, v0}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    const-string v0, "GCMIntentService"

    .line 76
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Received message "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    if-eqz p2, :cond_0

    const-string v0, ""

    .line 77
    invoke-virtual {p2}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x0

    .line 78
    invoke-static {p2, v0}, Lcom/shopkick/app/fetchers/api/skapi/PushMessage;->fromJson(Ljava/lang/String;Z)Lcom/shopkick/app/fetchers/api/skapi/PushMessage;

    move-result-object p2

    .line 79
    new-instance v0, Lcom/shopkick/app/gcm/PushEventDispatcher;

    iget-object v1, p0, Lcom/shopkick/app/GCMIntentService;->handler:Landroid/os/Handler;

    invoke-direct {v0, p1, v1}, Lcom/shopkick/app/gcm/PushEventDispatcher;-><init>(Landroid/content/Context;Landroid/os/Handler;)V

    .line 80
    new-instance p1, Lcom/shopkick/app/gcm/OsNotificationHandler;

    invoke-direct {p1, v0}, Lcom/shopkick/app/gcm/OsNotificationHandler;-><init>(Lcom/shopkick/app/gcm/PushEventDispatcher;)V

    invoke-virtual {v0, p1}, Lcom/shopkick/app/gcm/PushEventDispatcher;->registerHandler(Lcom/shopkick/app/gcm/PushEventHandler;)V

    .line 81
    invoke-virtual {v0, p2}, Lcom/shopkick/app/gcm/PushEventDispatcher;->setPushMessage(Lcom/shopkick/app/fetchers/api/skapi/PushMessage;)V

    .line 82
    invoke-virtual {v0}, Lcom/shopkick/app/gcm/PushEventDispatcher;->handleEvents()Lcom/shopkick/app/gcm/PushEventHandler$Progress;

    :cond_0
    return-void
.end method

.method protected onRecoverableError(Landroid/content/Context;Ljava/lang/String;)Z
    .locals 0

    .line 97
    invoke-super {p0, p1, p2}, Lcom/google/android/gcm/GCMBaseIntentService;->onRecoverableError(Landroid/content/Context;Ljava/lang/String;)Z

    move-result p1

    return p1
.end method

.method protected onRegistered(Landroid/content/Context;Ljava/lang/String;)V
    .locals 3

    const-string v0, "GCMIntentService"

    .line 51
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Device registered: regId = "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 52
    new-instance v0, Landroid/content/Intent;

    const-string v1, "com.shopkick.app.gcm.intent"

    invoke-direct {v0, v1}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    const-string v1, "com.shopkick.app.gcm.action"

    .line 53
    sget-object v2, Lcom/shopkick/app/gcm/GCMConstants$GCMAction;->Register:Lcom/shopkick/app/gcm/GCMConstants$GCMAction;

    invoke-virtual {v0, v1, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/io/Serializable;)Landroid/content/Intent;

    const-string v1, "registration_id"

    .line 54
    invoke-virtual {v0, v1, p2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 55
    invoke-virtual {p1, v0}, Landroid/content/Context;->sendBroadcast(Landroid/content/Intent;)V

    return-void
.end method

.method protected onUnregistered(Landroid/content/Context;Ljava/lang/String;)V
    .locals 3

    const-string v0, "GCMIntentService"

    const-string v1, "Device unregistered"

    .line 60
    invoke-static {v0, v1}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 61
    invoke-static {p1}, Lcom/google/android/gcm/GCMRegistrar;->isRegisteredOnServer(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 62
    new-instance v0, Landroid/content/Intent;

    const-string v1, "com.shopkick.app.gcm.intent"

    invoke-direct {v0, v1}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    const-string v1, "com.shopkick.app.gcm.action"

    .line 63
    sget-object v2, Lcom/shopkick/app/gcm/GCMConstants$GCMAction;->Unregister:Lcom/shopkick/app/gcm/GCMConstants$GCMAction;

    invoke-virtual {v0, v1, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/io/Serializable;)Landroid/content/Intent;

    const-string v1, "registration_id"

    .line 64
    invoke-virtual {v0, v1, p2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 65
    invoke-virtual {p1, v0}, Landroid/content/Context;->sendBroadcast(Landroid/content/Intent;)V

    goto :goto_0

    :cond_0
    const-string p1, "GCMIntentService"

    const-string p2, "Ignoring unregister callback"

    .line 69
    invoke-static {p1, p2}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    :goto_0
    return-void
.end method
