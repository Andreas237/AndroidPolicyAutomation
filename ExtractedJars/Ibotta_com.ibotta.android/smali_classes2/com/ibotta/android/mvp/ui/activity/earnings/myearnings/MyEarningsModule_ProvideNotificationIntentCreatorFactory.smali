.class public final Lcom/ibotta/android/mvp/ui/activity/earnings/myearnings/MyEarningsModule_ProvideNotificationIntentCreatorFactory;
.super Ljava/lang/Object;
.source "MyEarningsModule_ProvideNotificationIntentCreatorFactory.java"

# interfaces
.implements Ldagger/internal/Factory;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ldagger/internal/Factory<",
        "Lcom/ibotta/android/routing/intent/NotificationIntentCreator;",
        ">;"
    }
.end annotation


# instance fields
.field private final module:Lcom/ibotta/android/mvp/ui/activity/earnings/myearnings/MyEarningsModule;

.field private final notificationDetailFactoryProvider:Ljavax/inject/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/mvp/ui/activity/notifications/detail/NotificationDetailFactory;",
            ">;"
        }
    .end annotation
.end field

.field private final notificationRoutingUtilProvider:Ljavax/inject/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/routing/notification/NotificationRoutingUtil;",
            ">;"
        }
    .end annotation
.end field

.field private final routeHandlerProvider:Ljavax/inject/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/routing/RouteHandler;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lcom/ibotta/android/mvp/ui/activity/earnings/myearnings/MyEarningsModule;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/ibotta/android/mvp/ui/activity/earnings/myearnings/MyEarningsModule;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/routing/RouteHandler;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/mvp/ui/activity/notifications/detail/NotificationDetailFactory;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/routing/notification/NotificationRoutingUtil;",
            ">;)V"
        }
    .end annotation

    .line 30
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 31
    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/earnings/myearnings/MyEarningsModule_ProvideNotificationIntentCreatorFactory;->module:Lcom/ibotta/android/mvp/ui/activity/earnings/myearnings/MyEarningsModule;

    .line 32
    iput-object p2, p0, Lcom/ibotta/android/mvp/ui/activity/earnings/myearnings/MyEarningsModule_ProvideNotificationIntentCreatorFactory;->routeHandlerProvider:Ljavax/inject/Provider;

    .line 33
    iput-object p3, p0, Lcom/ibotta/android/mvp/ui/activity/earnings/myearnings/MyEarningsModule_ProvideNotificationIntentCreatorFactory;->notificationDetailFactoryProvider:Ljavax/inject/Provider;

    .line 34
    iput-object p4, p0, Lcom/ibotta/android/mvp/ui/activity/earnings/myearnings/MyEarningsModule_ProvideNotificationIntentCreatorFactory;->notificationRoutingUtilProvider:Ljavax/inject/Provider;

    return-void
.end method

.method public static create(Lcom/ibotta/android/mvp/ui/activity/earnings/myearnings/MyEarningsModule;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)Lcom/ibotta/android/mvp/ui/activity/earnings/myearnings/MyEarningsModule_ProvideNotificationIntentCreatorFactory;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/ibotta/android/mvp/ui/activity/earnings/myearnings/MyEarningsModule;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/routing/RouteHandler;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/mvp/ui/activity/notifications/detail/NotificationDetailFactory;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/routing/notification/NotificationRoutingUtil;",
            ">;)",
            "Lcom/ibotta/android/mvp/ui/activity/earnings/myearnings/MyEarningsModule_ProvideNotificationIntentCreatorFactory;"
        }
    .end annotation

    .line 63
    new-instance v0, Lcom/ibotta/android/mvp/ui/activity/earnings/myearnings/MyEarningsModule_ProvideNotificationIntentCreatorFactory;

    invoke-direct {v0, p0, p1, p2, p3}, Lcom/ibotta/android/mvp/ui/activity/earnings/myearnings/MyEarningsModule_ProvideNotificationIntentCreatorFactory;-><init>(Lcom/ibotta/android/mvp/ui/activity/earnings/myearnings/MyEarningsModule;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)V

    return-object v0
.end method

.method public static provideInstance(Lcom/ibotta/android/mvp/ui/activity/earnings/myearnings/MyEarningsModule;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)Lcom/ibotta/android/routing/intent/NotificationIntentCreator;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/ibotta/android/mvp/ui/activity/earnings/myearnings/MyEarningsModule;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/routing/RouteHandler;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/mvp/ui/activity/notifications/detail/NotificationDetailFactory;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/routing/notification/NotificationRoutingUtil;",
            ">;)",
            "Lcom/ibotta/android/routing/intent/NotificationIntentCreator;"
        }
    .end annotation

    .line 53
    invoke-interface {p1}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/ibotta/android/routing/RouteHandler;

    .line 54
    invoke-interface {p2}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Lcom/ibotta/android/mvp/ui/activity/notifications/detail/NotificationDetailFactory;

    .line 55
    invoke-interface {p3}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object p3

    check-cast p3, Lcom/ibotta/android/routing/notification/NotificationRoutingUtil;

    .line 51
    invoke-static {p0, p1, p2, p3}, Lcom/ibotta/android/mvp/ui/activity/earnings/myearnings/MyEarningsModule_ProvideNotificationIntentCreatorFactory;->proxyProvideNotificationIntentCreator(Lcom/ibotta/android/mvp/ui/activity/earnings/myearnings/MyEarningsModule;Lcom/ibotta/android/routing/RouteHandler;Lcom/ibotta/android/mvp/ui/activity/notifications/detail/NotificationDetailFactory;Lcom/ibotta/android/routing/notification/NotificationRoutingUtil;)Lcom/ibotta/android/routing/intent/NotificationIntentCreator;

    move-result-object p0

    return-object p0
.end method

.method public static proxyProvideNotificationIntentCreator(Lcom/ibotta/android/mvp/ui/activity/earnings/myearnings/MyEarningsModule;Lcom/ibotta/android/routing/RouteHandler;Lcom/ibotta/android/mvp/ui/activity/notifications/detail/NotificationDetailFactory;Lcom/ibotta/android/routing/notification/NotificationRoutingUtil;)Lcom/ibotta/android/routing/intent/NotificationIntentCreator;
    .locals 0

    .line 76
    invoke-virtual {p0, p1, p2, p3}, Lcom/ibotta/android/mvp/ui/activity/earnings/myearnings/MyEarningsModule;->provideNotificationIntentCreator(Lcom/ibotta/android/routing/RouteHandler;Lcom/ibotta/android/mvp/ui/activity/notifications/detail/NotificationDetailFactory;Lcom/ibotta/android/routing/notification/NotificationRoutingUtil;)Lcom/ibotta/android/routing/intent/NotificationIntentCreator;

    move-result-object p0

    const-string p1, "Cannot return null from a non-@Nullable @Provides method"

    .line 75
    invoke-static {p0, p1}, Ldagger/internal/Preconditions;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/ibotta/android/routing/intent/NotificationIntentCreator;

    return-object p0
.end method


# virtual methods
.method public get()Lcom/ibotta/android/routing/intent/NotificationIntentCreator;
    .locals 4

    .line 39
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/earnings/myearnings/MyEarningsModule_ProvideNotificationIntentCreatorFactory;->module:Lcom/ibotta/android/mvp/ui/activity/earnings/myearnings/MyEarningsModule;

    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/earnings/myearnings/MyEarningsModule_ProvideNotificationIntentCreatorFactory;->routeHandlerProvider:Ljavax/inject/Provider;

    iget-object v2, p0, Lcom/ibotta/android/mvp/ui/activity/earnings/myearnings/MyEarningsModule_ProvideNotificationIntentCreatorFactory;->notificationDetailFactoryProvider:Ljavax/inject/Provider;

    iget-object v3, p0, Lcom/ibotta/android/mvp/ui/activity/earnings/myearnings/MyEarningsModule_ProvideNotificationIntentCreatorFactory;->notificationRoutingUtilProvider:Ljavax/inject/Provider;

    invoke-static {v0, v1, v2, v3}, Lcom/ibotta/android/mvp/ui/activity/earnings/myearnings/MyEarningsModule_ProvideNotificationIntentCreatorFactory;->provideInstance(Lcom/ibotta/android/mvp/ui/activity/earnings/myearnings/MyEarningsModule;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)Lcom/ibotta/android/routing/intent/NotificationIntentCreator;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    .line 12
    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/activity/earnings/myearnings/MyEarningsModule_ProvideNotificationIntentCreatorFactory;->get()Lcom/ibotta/android/routing/intent/NotificationIntentCreator;

    move-result-object v0

    return-object v0
.end method
