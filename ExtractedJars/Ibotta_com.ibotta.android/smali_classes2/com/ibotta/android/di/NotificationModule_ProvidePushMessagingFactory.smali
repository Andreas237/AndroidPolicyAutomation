.class public final Lcom/ibotta/android/di/NotificationModule_ProvidePushMessagingFactory;
.super Ljava/lang/Object;
.source "NotificationModule_ProvidePushMessagingFactory.java"

# interfaces
.implements Ldagger/internal/Factory;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ldagger/internal/Factory<",
        "Lcom/ibotta/android/service/push/PushMessaging;",
        ">;"
    }
.end annotation


# instance fields
.field private final brazeTrackingProvider:Ljavax/inject/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/tracking/braze/BrazeTracking;",
            ">;"
        }
    .end annotation
.end field

.field private final contextProvider:Ljavax/inject/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/Provider<",
            "Landroid/content/Context;",
            ">;"
        }
    .end annotation
.end field

.field private final fcmStateProvider:Ljavax/inject/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/state/app/fcm/FcmState;",
            ">;"
        }
    .end annotation
.end field

.field private final statusBarNotificationHelperProvider:Ljavax/inject/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/notification/StatusBarNotificationHelper;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljavax/inject/Provider<",
            "Landroid/content/Context;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/state/app/fcm/FcmState;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/notification/StatusBarNotificationHelper;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/tracking/braze/BrazeTracking;",
            ">;)V"
        }
    .end annotation

    .line 31
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 32
    iput-object p1, p0, Lcom/ibotta/android/di/NotificationModule_ProvidePushMessagingFactory;->contextProvider:Ljavax/inject/Provider;

    .line 33
    iput-object p2, p0, Lcom/ibotta/android/di/NotificationModule_ProvidePushMessagingFactory;->fcmStateProvider:Ljavax/inject/Provider;

    .line 34
    iput-object p3, p0, Lcom/ibotta/android/di/NotificationModule_ProvidePushMessagingFactory;->statusBarNotificationHelperProvider:Ljavax/inject/Provider;

    .line 35
    iput-object p4, p0, Lcom/ibotta/android/di/NotificationModule_ProvidePushMessagingFactory;->brazeTrackingProvider:Ljavax/inject/Provider;

    return-void
.end method

.method public static create(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)Lcom/ibotta/android/di/NotificationModule_ProvidePushMessagingFactory;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljavax/inject/Provider<",
            "Landroid/content/Context;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/state/app/fcm/FcmState;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/notification/StatusBarNotificationHelper;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/tracking/braze/BrazeTracking;",
            ">;)",
            "Lcom/ibotta/android/di/NotificationModule_ProvidePushMessagingFactory;"
        }
    .end annotation

    .line 64
    new-instance v0, Lcom/ibotta/android/di/NotificationModule_ProvidePushMessagingFactory;

    invoke-direct {v0, p0, p1, p2, p3}, Lcom/ibotta/android/di/NotificationModule_ProvidePushMessagingFactory;-><init>(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)V

    return-object v0
.end method

.method public static provideInstance(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)Lcom/ibotta/android/service/push/PushMessaging;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljavax/inject/Provider<",
            "Landroid/content/Context;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/state/app/fcm/FcmState;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/notification/StatusBarNotificationHelper;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/tracking/braze/BrazeTracking;",
            ">;)",
            "Lcom/ibotta/android/service/push/PushMessaging;"
        }
    .end annotation

    .line 53
    invoke-interface {p0}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Landroid/content/Context;

    .line 54
    invoke-interface {p1}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/ibotta/android/state/app/fcm/FcmState;

    .line 55
    invoke-interface {p2}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Lcom/ibotta/android/notification/StatusBarNotificationHelper;

    .line 56
    invoke-interface {p3}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object p3

    check-cast p3, Lcom/ibotta/android/tracking/braze/BrazeTracking;

    .line 52
    invoke-static {p0, p1, p2, p3}, Lcom/ibotta/android/di/NotificationModule_ProvidePushMessagingFactory;->proxyProvidePushMessaging(Landroid/content/Context;Lcom/ibotta/android/state/app/fcm/FcmState;Lcom/ibotta/android/notification/StatusBarNotificationHelper;Lcom/ibotta/android/tracking/braze/BrazeTracking;)Lcom/ibotta/android/service/push/PushMessaging;

    move-result-object p0

    return-object p0
.end method

.method public static proxyProvidePushMessaging(Landroid/content/Context;Lcom/ibotta/android/state/app/fcm/FcmState;Lcom/ibotta/android/notification/StatusBarNotificationHelper;Lcom/ibotta/android/tracking/braze/BrazeTracking;)Lcom/ibotta/android/service/push/PushMessaging;
    .locals 0

    .line 77
    invoke-static {p0, p1, p2, p3}, Lcom/ibotta/android/di/NotificationModule;->providePushMessaging(Landroid/content/Context;Lcom/ibotta/android/state/app/fcm/FcmState;Lcom/ibotta/android/notification/StatusBarNotificationHelper;Lcom/ibotta/android/tracking/braze/BrazeTracking;)Lcom/ibotta/android/service/push/PushMessaging;

    move-result-object p0

    const-string p1, "Cannot return null from a non-@Nullable @Provides method"

    .line 76
    invoke-static {p0, p1}, Ldagger/internal/Preconditions;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/ibotta/android/service/push/PushMessaging;

    return-object p0
.end method


# virtual methods
.method public get()Lcom/ibotta/android/service/push/PushMessaging;
    .locals 4

    .line 40
    iget-object v0, p0, Lcom/ibotta/android/di/NotificationModule_ProvidePushMessagingFactory;->contextProvider:Ljavax/inject/Provider;

    iget-object v1, p0, Lcom/ibotta/android/di/NotificationModule_ProvidePushMessagingFactory;->fcmStateProvider:Ljavax/inject/Provider;

    iget-object v2, p0, Lcom/ibotta/android/di/NotificationModule_ProvidePushMessagingFactory;->statusBarNotificationHelperProvider:Ljavax/inject/Provider;

    iget-object v3, p0, Lcom/ibotta/android/di/NotificationModule_ProvidePushMessagingFactory;->brazeTrackingProvider:Ljavax/inject/Provider;

    invoke-static {v0, v1, v2, v3}, Lcom/ibotta/android/di/NotificationModule_ProvidePushMessagingFactory;->provideInstance(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)Lcom/ibotta/android/service/push/PushMessaging;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    .line 13
    invoke-virtual {p0}, Lcom/ibotta/android/di/NotificationModule_ProvidePushMessagingFactory;->get()Lcom/ibotta/android/service/push/PushMessaging;

    move-result-object v0

    return-object v0
.end method
