.class public final Lcom/ibotta/android/mvp/ui/activity/notifications/NotificationsModule_ProvideNotificationCountManagerFactory;
.super Ljava/lang/Object;
.source "NotificationsModule_ProvideNotificationCountManagerFactory.java"

# interfaces
.implements Ldagger/internal/Factory;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ldagger/internal/Factory<",
        "Lcom/ibotta/android/async/notification/NotificationCountManager;",
        ">;"
    }
.end annotation


# instance fields
.field private final cacheClearFactoryProvider:Ljavax/inject/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/service/api/job/CacheClearJobFactory;",
            ">;"
        }
    .end annotation
.end field

.field private final module:Lcom/ibotta/android/mvp/ui/activity/notifications/NotificationsModule;

.field private final userStateProvider:Ljavax/inject/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/state/user/UserState;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lcom/ibotta/android/mvp/ui/activity/notifications/NotificationsModule;Ljavax/inject/Provider;Ljavax/inject/Provider;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/ibotta/android/mvp/ui/activity/notifications/NotificationsModule;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/state/user/UserState;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/service/api/job/CacheClearJobFactory;",
            ">;)V"
        }
    .end annotation

    .line 26
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 27
    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/notifications/NotificationsModule_ProvideNotificationCountManagerFactory;->module:Lcom/ibotta/android/mvp/ui/activity/notifications/NotificationsModule;

    .line 28
    iput-object p2, p0, Lcom/ibotta/android/mvp/ui/activity/notifications/NotificationsModule_ProvideNotificationCountManagerFactory;->userStateProvider:Ljavax/inject/Provider;

    .line 29
    iput-object p3, p0, Lcom/ibotta/android/mvp/ui/activity/notifications/NotificationsModule_ProvideNotificationCountManagerFactory;->cacheClearFactoryProvider:Ljavax/inject/Provider;

    return-void
.end method

.method public static create(Lcom/ibotta/android/mvp/ui/activity/notifications/NotificationsModule;Ljavax/inject/Provider;Ljavax/inject/Provider;)Lcom/ibotta/android/mvp/ui/activity/notifications/NotificationsModule_ProvideNotificationCountManagerFactory;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/ibotta/android/mvp/ui/activity/notifications/NotificationsModule;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/state/user/UserState;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/service/api/job/CacheClearJobFactory;",
            ">;)",
            "Lcom/ibotta/android/mvp/ui/activity/notifications/NotificationsModule_ProvideNotificationCountManagerFactory;"
        }
    .end annotation

    .line 49
    new-instance v0, Lcom/ibotta/android/mvp/ui/activity/notifications/NotificationsModule_ProvideNotificationCountManagerFactory;

    invoke-direct {v0, p0, p1, p2}, Lcom/ibotta/android/mvp/ui/activity/notifications/NotificationsModule_ProvideNotificationCountManagerFactory;-><init>(Lcom/ibotta/android/mvp/ui/activity/notifications/NotificationsModule;Ljavax/inject/Provider;Ljavax/inject/Provider;)V

    return-object v0
.end method

.method public static provideInstance(Lcom/ibotta/android/mvp/ui/activity/notifications/NotificationsModule;Ljavax/inject/Provider;Ljavax/inject/Provider;)Lcom/ibotta/android/async/notification/NotificationCountManager;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/ibotta/android/mvp/ui/activity/notifications/NotificationsModule;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/state/user/UserState;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/service/api/job/CacheClearJobFactory;",
            ">;)",
            "Lcom/ibotta/android/async/notification/NotificationCountManager;"
        }
    .end annotation

    .line 42
    invoke-interface {p1}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/ibotta/android/state/user/UserState;

    invoke-interface {p2}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Lcom/ibotta/android/service/api/job/CacheClearJobFactory;

    .line 41
    invoke-static {p0, p1, p2}, Lcom/ibotta/android/mvp/ui/activity/notifications/NotificationsModule_ProvideNotificationCountManagerFactory;->proxyProvideNotificationCountManager(Lcom/ibotta/android/mvp/ui/activity/notifications/NotificationsModule;Lcom/ibotta/android/state/user/UserState;Lcom/ibotta/android/service/api/job/CacheClearJobFactory;)Lcom/ibotta/android/async/notification/NotificationCountManager;

    move-result-object p0

    return-object p0
.end method

.method public static proxyProvideNotificationCountManager(Lcom/ibotta/android/mvp/ui/activity/notifications/NotificationsModule;Lcom/ibotta/android/state/user/UserState;Lcom/ibotta/android/service/api/job/CacheClearJobFactory;)Lcom/ibotta/android/async/notification/NotificationCountManager;
    .locals 0

    .line 56
    invoke-virtual {p0, p1, p2}, Lcom/ibotta/android/mvp/ui/activity/notifications/NotificationsModule;->provideNotificationCountManager(Lcom/ibotta/android/state/user/UserState;Lcom/ibotta/android/service/api/job/CacheClearJobFactory;)Lcom/ibotta/android/async/notification/NotificationCountManager;

    move-result-object p0

    const-string p1, "Cannot return null from a non-@Nullable @Provides method"

    .line 55
    invoke-static {p0, p1}, Ldagger/internal/Preconditions;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/ibotta/android/async/notification/NotificationCountManager;

    return-object p0
.end method


# virtual methods
.method public get()Lcom/ibotta/android/async/notification/NotificationCountManager;
    .locals 3

    .line 34
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/notifications/NotificationsModule_ProvideNotificationCountManagerFactory;->module:Lcom/ibotta/android/mvp/ui/activity/notifications/NotificationsModule;

    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/notifications/NotificationsModule_ProvideNotificationCountManagerFactory;->userStateProvider:Ljavax/inject/Provider;

    iget-object v2, p0, Lcom/ibotta/android/mvp/ui/activity/notifications/NotificationsModule_ProvideNotificationCountManagerFactory;->cacheClearFactoryProvider:Ljavax/inject/Provider;

    invoke-static {v0, v1, v2}, Lcom/ibotta/android/mvp/ui/activity/notifications/NotificationsModule_ProvideNotificationCountManagerFactory;->provideInstance(Lcom/ibotta/android/mvp/ui/activity/notifications/NotificationsModule;Ljavax/inject/Provider;Ljavax/inject/Provider;)Lcom/ibotta/android/async/notification/NotificationCountManager;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    .line 11
    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/activity/notifications/NotificationsModule_ProvideNotificationCountManagerFactory;->get()Lcom/ibotta/android/async/notification/NotificationCountManager;

    move-result-object v0

    return-object v0
.end method
