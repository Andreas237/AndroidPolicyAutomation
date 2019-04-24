.class public final Lcom/ibotta/android/di/NotificationModule_ProvideStatusBarNotificationHelperFactory;
.super Ljava/lang/Object;
.source "NotificationModule_ProvideStatusBarNotificationHelperFactory.java"

# interfaces
.implements Ldagger/internal/Factory;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ldagger/internal/Factory<",
        "Lcom/ibotta/android/notification/StatusBarNotificationHelper;",
        ">;"
    }
.end annotation


# instance fields
.field private final appHelperProvider:Ljavax/inject/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/util/AppHelper;",
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

.field private final notificationComposerProvider:Ljavax/inject/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/notification/composer/DefaultNotificationComposer;",
            ">;"
        }
    .end annotation
.end field

.field private final notificationManagerProvider:Ljavax/inject/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/Provider<",
            "Landroid/app/NotificationManager;",
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
            "Lcom/ibotta/android/util/AppHelper;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/notification/composer/DefaultNotificationComposer;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/state/app/fcm/FcmState;",
            ">;",
            "Ljavax/inject/Provider<",
            "Landroid/app/NotificationManager;",
            ">;)V"
        }
    .end annotation

    .line 31
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 32
    iput-object p1, p0, Lcom/ibotta/android/di/NotificationModule_ProvideStatusBarNotificationHelperFactory;->appHelperProvider:Ljavax/inject/Provider;

    .line 33
    iput-object p2, p0, Lcom/ibotta/android/di/NotificationModule_ProvideStatusBarNotificationHelperFactory;->notificationComposerProvider:Ljavax/inject/Provider;

    .line 34
    iput-object p3, p0, Lcom/ibotta/android/di/NotificationModule_ProvideStatusBarNotificationHelperFactory;->fcmStateProvider:Ljavax/inject/Provider;

    .line 35
    iput-object p4, p0, Lcom/ibotta/android/di/NotificationModule_ProvideStatusBarNotificationHelperFactory;->notificationManagerProvider:Ljavax/inject/Provider;

    return-void
.end method

.method public static create(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)Lcom/ibotta/android/di/NotificationModule_ProvideStatusBarNotificationHelperFactory;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/util/AppHelper;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/notification/composer/DefaultNotificationComposer;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/state/app/fcm/FcmState;",
            ">;",
            "Ljavax/inject/Provider<",
            "Landroid/app/NotificationManager;",
            ">;)",
            "Lcom/ibotta/android/di/NotificationModule_ProvideStatusBarNotificationHelperFactory;"
        }
    .end annotation

    .line 64
    new-instance v0, Lcom/ibotta/android/di/NotificationModule_ProvideStatusBarNotificationHelperFactory;

    invoke-direct {v0, p0, p1, p2, p3}, Lcom/ibotta/android/di/NotificationModule_ProvideStatusBarNotificationHelperFactory;-><init>(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)V

    return-object v0
.end method

.method public static provideInstance(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)Lcom/ibotta/android/notification/StatusBarNotificationHelper;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/util/AppHelper;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/notification/composer/DefaultNotificationComposer;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/state/app/fcm/FcmState;",
            ">;",
            "Ljavax/inject/Provider<",
            "Landroid/app/NotificationManager;",
            ">;)",
            "Lcom/ibotta/android/notification/StatusBarNotificationHelper;"
        }
    .end annotation

    .line 53
    invoke-interface {p0}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/ibotta/android/util/AppHelper;

    .line 54
    invoke-interface {p1}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/ibotta/android/notification/composer/DefaultNotificationComposer;

    .line 55
    invoke-interface {p2}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Lcom/ibotta/android/state/app/fcm/FcmState;

    .line 56
    invoke-interface {p3}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object p3

    check-cast p3, Landroid/app/NotificationManager;

    .line 52
    invoke-static {p0, p1, p2, p3}, Lcom/ibotta/android/di/NotificationModule_ProvideStatusBarNotificationHelperFactory;->proxyProvideStatusBarNotificationHelper(Lcom/ibotta/android/util/AppHelper;Lcom/ibotta/android/notification/composer/DefaultNotificationComposer;Lcom/ibotta/android/state/app/fcm/FcmState;Landroid/app/NotificationManager;)Lcom/ibotta/android/notification/StatusBarNotificationHelper;

    move-result-object p0

    return-object p0
.end method

.method public static proxyProvideStatusBarNotificationHelper(Lcom/ibotta/android/util/AppHelper;Lcom/ibotta/android/notification/composer/DefaultNotificationComposer;Lcom/ibotta/android/state/app/fcm/FcmState;Landroid/app/NotificationManager;)Lcom/ibotta/android/notification/StatusBarNotificationHelper;
    .locals 0

    .line 77
    invoke-static {p0, p1, p2, p3}, Lcom/ibotta/android/di/NotificationModule;->provideStatusBarNotificationHelper(Lcom/ibotta/android/util/AppHelper;Lcom/ibotta/android/notification/composer/DefaultNotificationComposer;Lcom/ibotta/android/state/app/fcm/FcmState;Landroid/app/NotificationManager;)Lcom/ibotta/android/notification/StatusBarNotificationHelper;

    move-result-object p0

    const-string p1, "Cannot return null from a non-@Nullable @Provides method"

    .line 76
    invoke-static {p0, p1}, Ldagger/internal/Preconditions;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/ibotta/android/notification/StatusBarNotificationHelper;

    return-object p0
.end method


# virtual methods
.method public get()Lcom/ibotta/android/notification/StatusBarNotificationHelper;
    .locals 4

    .line 40
    iget-object v0, p0, Lcom/ibotta/android/di/NotificationModule_ProvideStatusBarNotificationHelperFactory;->appHelperProvider:Ljavax/inject/Provider;

    iget-object v1, p0, Lcom/ibotta/android/di/NotificationModule_ProvideStatusBarNotificationHelperFactory;->notificationComposerProvider:Ljavax/inject/Provider;

    iget-object v2, p0, Lcom/ibotta/android/di/NotificationModule_ProvideStatusBarNotificationHelperFactory;->fcmStateProvider:Ljavax/inject/Provider;

    iget-object v3, p0, Lcom/ibotta/android/di/NotificationModule_ProvideStatusBarNotificationHelperFactory;->notificationManagerProvider:Ljavax/inject/Provider;

    invoke-static {v0, v1, v2, v3}, Lcom/ibotta/android/di/NotificationModule_ProvideStatusBarNotificationHelperFactory;->provideInstance(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)Lcom/ibotta/android/notification/StatusBarNotificationHelper;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    .line 13
    invoke-virtual {p0}, Lcom/ibotta/android/di/NotificationModule_ProvideStatusBarNotificationHelperFactory;->get()Lcom/ibotta/android/notification/StatusBarNotificationHelper;

    move-result-object v0

    return-object v0
.end method
