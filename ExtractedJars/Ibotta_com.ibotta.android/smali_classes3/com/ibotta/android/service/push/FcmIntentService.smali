.class public Lcom/ibotta/android/service/push/FcmIntentService;
.super Landroid/support/v4/app/JobIntentService;
.source "FcmIntentService.java"


# instance fields
.field protected pushMessaging:Lcom/ibotta/android/service/push/PushMessaging;
    .annotation runtime Ljavax/inject/Inject;
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 23
    invoke-direct {p0}, Landroid/support/v4/app/JobIntentService;-><init>()V

    .line 24
    invoke-static {}, Lcom/ibotta/android/App;->instance()Lcom/ibotta/android/App;

    move-result-object v0

    invoke-virtual {v0}, Lcom/ibotta/android/App;->getMainComponent()Lcom/ibotta/android/di/MainComponent;

    move-result-object v0

    invoke-interface {v0, p0}, Lcom/ibotta/android/di/MainComponent;->inject(Lcom/ibotta/android/service/push/FcmIntentService;)V

    return-void
.end method

.method public static enqueueWork(Landroid/content/Context;Landroid/content/Intent;)V
    .locals 2

    .line 20
    const-class v0, Lcom/ibotta/android/service/push/FcmIntentService;

    sget-object v1, Lcom/ibotta/android/service/JobServiceId;->FCM:Lcom/ibotta/android/service/JobServiceId;

    invoke-virtual {v1}, Lcom/ibotta/android/service/JobServiceId;->ordinal()I

    move-result v1

    invoke-static {p0, v0, v1, p1}, Lcom/ibotta/android/service/push/FcmIntentService;->enqueueWork(Landroid/content/Context;Ljava/lang/Class;ILandroid/content/Intent;)V

    return-void
.end method


# virtual methods
.method protected onHandleWork(Landroid/content/Intent;)V
    .locals 4
    .param p1    # Landroid/content/Intent;
        .annotation runtime Ljavax/annotation/Nonnull;
        .end annotation
    .end param

    const-string v0, "onHandleWork: %1$s"

    const/4 v1, 0x1

    .line 29
    new-array v2, v1, [Ljava/lang/Object;

    const/4 v3, 0x0

    aput-object p1, v2, v3

    invoke-static {v0, v2}, Ltimber/log/Timber;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 30
    invoke-virtual {p1}, Landroid/content/Intent;->getExtras()Landroid/os/Bundle;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 32
    invoke-virtual {v0}, Landroid/os/Bundle;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_0

    .line 33
    iget-object v0, p0, Lcom/ibotta/android/service/push/FcmIntentService;->pushMessaging:Lcom/ibotta/android/service/push/PushMessaging;

    invoke-virtual {v0, p1}, Lcom/ibotta/android/service/push/PushMessaging;->onMessage(Landroid/content/Intent;)V

    goto :goto_0

    :cond_0
    const-string v0, "Ignoring FCM intent: intent=%1$s"

    .line 35
    new-array v1, v1, [Ljava/lang/Object;

    aput-object p1, v1, v3

    invoke-static {v0, v1}, Ltimber/log/Timber;->w(Ljava/lang/String;[Ljava/lang/Object;)V

    :goto_0
    return-void
.end method
