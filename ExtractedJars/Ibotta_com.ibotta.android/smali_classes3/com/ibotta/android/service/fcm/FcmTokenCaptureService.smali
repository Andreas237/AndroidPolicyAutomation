.class public Lcom/ibotta/android/service/fcm/FcmTokenCaptureService;
.super Lcom/google/firebase/iid/FirebaseInstanceIdService;
.source "FcmTokenCaptureService.java"


# instance fields
.field protected appboy:Lcom/appboy/Appboy;
    .annotation runtime Ljavax/inject/Inject;
    .end annotation
.end field

.field protected fcmTokenManager:Lcom/ibotta/android/async/device/FcmTokenManager;
    .annotation runtime Ljavax/inject/Inject;
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 18
    invoke-direct {p0}, Lcom/google/firebase/iid/FirebaseInstanceIdService;-><init>()V

    .line 19
    invoke-static {}, Lcom/ibotta/android/App;->instance()Lcom/ibotta/android/App;

    move-result-object v0

    invoke-virtual {v0}, Lcom/ibotta/android/App;->getMainComponent()Lcom/ibotta/android/di/MainComponent;

    move-result-object v0

    invoke-interface {v0, p0}, Lcom/ibotta/android/di/MainComponent;->inject(Lcom/ibotta/android/service/fcm/FcmTokenCaptureService;)V

    return-void
.end method


# virtual methods
.method public onTokenRefresh()V
    .locals 3

    const/4 v0, 0x0

    .line 25
    :try_start_0
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Registering firebase token: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, p0, Lcom/ibotta/android/service/fcm/FcmTokenCaptureService;->fcmTokenManager:Lcom/ibotta/android/async/device/FcmTokenManager;

    invoke-virtual {v2}, Lcom/ibotta/android/async/device/FcmTokenManager;->getFcmToken()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    new-array v2, v0, [Ljava/lang/Object;

    invoke-static {v1, v2}, Ltimber/log/Timber;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 26
    iget-object v1, p0, Lcom/ibotta/android/service/fcm/FcmTokenCaptureService;->appboy:Lcom/appboy/Appboy;

    iget-object v2, p0, Lcom/ibotta/android/service/fcm/FcmTokenCaptureService;->fcmTokenManager:Lcom/ibotta/android/async/device/FcmTokenManager;

    invoke-virtual {v2}, Lcom/ibotta/android/async/device/FcmTokenManager;->getFcmToken()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Lcom/appboy/Appboy;->registerAppboyPushMessages(Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v1

    const-string v2, "Failed to register FCM token."

    .line 28
    new-array v0, v0, [Ljava/lang/Object;

    invoke-static {v1, v2, v0}, Ltimber/log/Timber;->e(Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 29
    sget-object v0, Lcom/ibotta/android/crash/IbottaCrashProxy;->IbottaCrashManager:Lcom/ibotta/android/crash/CrashManager;

    invoke-virtual {v0, v1}, Lcom/ibotta/android/crash/CrashManager;->trackException(Ljava/lang/Throwable;)V

    :goto_0
    return-void
.end method
