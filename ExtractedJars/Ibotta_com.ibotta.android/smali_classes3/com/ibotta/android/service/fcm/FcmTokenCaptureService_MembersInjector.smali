.class public final Lcom/ibotta/android/service/fcm/FcmTokenCaptureService_MembersInjector;
.super Ljava/lang/Object;
.source "FcmTokenCaptureService_MembersInjector.java"

# interfaces
.implements Ldagger/MembersInjector;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ldagger/MembersInjector<",
        "Lcom/ibotta/android/service/fcm/FcmTokenCaptureService;",
        ">;"
    }
.end annotation


# instance fields
.field private final appboyProvider:Ljavax/inject/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/Provider<",
            "Lcom/appboy/Appboy;",
            ">;"
        }
    .end annotation
.end field

.field private final fcmTokenManagerProvider:Ljavax/inject/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/async/device/FcmTokenManager;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Ljavax/inject/Provider;Ljavax/inject/Provider;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/async/device/FcmTokenManager;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/appboy/Appboy;",
            ">;)V"
        }
    .end annotation

    .line 20
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 21
    iput-object p1, p0, Lcom/ibotta/android/service/fcm/FcmTokenCaptureService_MembersInjector;->fcmTokenManagerProvider:Ljavax/inject/Provider;

    .line 22
    iput-object p2, p0, Lcom/ibotta/android/service/fcm/FcmTokenCaptureService_MembersInjector;->appboyProvider:Ljavax/inject/Provider;

    return-void
.end method

.method public static create(Ljavax/inject/Provider;Ljavax/inject/Provider;)Ldagger/MembersInjector;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/async/device/FcmTokenManager;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/appboy/Appboy;",
            ">;)",
            "Ldagger/MembersInjector<",
            "Lcom/ibotta/android/service/fcm/FcmTokenCaptureService;",
            ">;"
        }
    .end annotation

    .line 27
    new-instance v0, Lcom/ibotta/android/service/fcm/FcmTokenCaptureService_MembersInjector;

    invoke-direct {v0, p0, p1}, Lcom/ibotta/android/service/fcm/FcmTokenCaptureService_MembersInjector;-><init>(Ljavax/inject/Provider;Ljavax/inject/Provider;)V

    return-object v0
.end method

.method public static injectAppboy(Lcom/ibotta/android/service/fcm/FcmTokenCaptureService;Lcom/appboy/Appboy;)V
    .locals 0

    .line 42
    iput-object p1, p0, Lcom/ibotta/android/service/fcm/FcmTokenCaptureService;->appboy:Lcom/appboy/Appboy;

    return-void
.end method

.method public static injectFcmTokenManager(Lcom/ibotta/android/service/fcm/FcmTokenCaptureService;Lcom/ibotta/android/async/device/FcmTokenManager;)V
    .locals 0

    .line 38
    iput-object p1, p0, Lcom/ibotta/android/service/fcm/FcmTokenCaptureService;->fcmTokenManager:Lcom/ibotta/android/async/device/FcmTokenManager;

    return-void
.end method


# virtual methods
.method public injectMembers(Lcom/ibotta/android/service/fcm/FcmTokenCaptureService;)V
    .locals 1

    .line 32
    iget-object v0, p0, Lcom/ibotta/android/service/fcm/FcmTokenCaptureService_MembersInjector;->fcmTokenManagerProvider:Ljavax/inject/Provider;

    invoke-interface {v0}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/async/device/FcmTokenManager;

    invoke-static {p1, v0}, Lcom/ibotta/android/service/fcm/FcmTokenCaptureService_MembersInjector;->injectFcmTokenManager(Lcom/ibotta/android/service/fcm/FcmTokenCaptureService;Lcom/ibotta/android/async/device/FcmTokenManager;)V

    .line 33
    iget-object v0, p0, Lcom/ibotta/android/service/fcm/FcmTokenCaptureService_MembersInjector;->appboyProvider:Ljavax/inject/Provider;

    invoke-interface {v0}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/appboy/Appboy;

    invoke-static {p1, v0}, Lcom/ibotta/android/service/fcm/FcmTokenCaptureService_MembersInjector;->injectAppboy(Lcom/ibotta/android/service/fcm/FcmTokenCaptureService;Lcom/appboy/Appboy;)V

    return-void
.end method

.method public bridge synthetic injectMembers(Ljava/lang/Object;)V
    .locals 0

    .line 9
    check-cast p1, Lcom/ibotta/android/service/fcm/FcmTokenCaptureService;

    invoke-virtual {p0, p1}, Lcom/ibotta/android/service/fcm/FcmTokenCaptureService_MembersInjector;->injectMembers(Lcom/ibotta/android/service/fcm/FcmTokenCaptureService;)V

    return-void
.end method
