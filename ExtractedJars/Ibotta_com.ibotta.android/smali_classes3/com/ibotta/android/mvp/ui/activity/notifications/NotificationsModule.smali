.class public Lcom/ibotta/android/mvp/ui/activity/notifications/NotificationsModule;
.super Lcom/ibotta/android/mvp/base/AbstractMvpModule;
.source "NotificationsModule.java"


# annotations
.annotation runtime Ldagger/Module;
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/ibotta/android/mvp/base/AbstractMvpModule<",
        "Lcom/ibotta/android/mvp/ui/activity/notifications/NotificationsView;",
        ">;"
    }
.end annotation


# direct methods
.method public constructor <init>(Lcom/ibotta/android/mvp/ui/activity/notifications/NotificationsView;)V
    .locals 0

    .line 35
    invoke-direct {p0, p1}, Lcom/ibotta/android/mvp/base/AbstractMvpModule;-><init>(Lcom/ibotta/android/mvp/base/MvpView;)V

    return-void
.end method


# virtual methods
.method public provideMvpPresenter(Lcom/ibotta/android/service/api/ApiWorkSubmitter;Lcom/ibotta/android/state/app/config/AppConfig;Lcom/ibotta/android/mvp/base/MvpPresenterActions;Lcom/ibotta/android/async/notification/NotificationCountManager;Lcom/ibotta/android/service/api/job/CacheClearJobFactory;Lcom/ibotta/android/state/user/UserState;Lcom/ibotta/android/features/factory/VariantFactory;)Lcom/ibotta/android/mvp/ui/activity/notifications/NotificationsPresenter;
    .locals 8
    .annotation runtime Lcom/ibotta/android/mvp/base/PerActivity;
    .end annotation

    .annotation runtime Ldagger/Provides;
    .end annotation

    .line 64
    new-instance v0, Ljava/util/HashSet;

    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    .line 65
    sget-object v1, Lcom/ibotta/android/notification/call/BaseNotificationsCall$NotificationFilter;->ME:Lcom/ibotta/android/notification/call/BaseNotificationsCall$NotificationFilter;

    invoke-interface {v0, v1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 66
    new-instance v5, Lcom/ibotta/android/mvp/ui/activity/notifications/NotificationsLoaderImpl;

    invoke-direct {v5, p1, v0, p4, p5}, Lcom/ibotta/android/mvp/ui/activity/notifications/NotificationsLoaderImpl;-><init>(Lcom/ibotta/android/service/api/ApiWorkSubmitter;Ljava/util/Set;Lcom/ibotta/android/async/notification/NotificationCountManager;Lcom/ibotta/android/service/api/job/CacheClearJobFactory;)V

    .line 70
    new-instance v0, Ljava/util/HashSet;

    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    .line 71
    sget-object v1, Lcom/ibotta/android/notification/call/BaseNotificationsCall$NotificationFilter;->FRIEND:Lcom/ibotta/android/notification/call/BaseNotificationsCall$NotificationFilter;

    invoke-interface {v0, v1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 72
    new-instance v6, Lcom/ibotta/android/mvp/ui/activity/notifications/NotificationsLoaderImpl;

    invoke-direct {v6, p1, v0, p4, p5}, Lcom/ibotta/android/mvp/ui/activity/notifications/NotificationsLoaderImpl;-><init>(Lcom/ibotta/android/service/api/ApiWorkSubmitter;Ljava/util/Set;Lcom/ibotta/android/async/notification/NotificationCountManager;Lcom/ibotta/android/service/api/job/CacheClearJobFactory;)V

    const-string p1, "graphql_notifications"

    .line 75
    const-class p4, Lcom/ibotta/android/notification/NotificationsVariant;

    .line 76
    invoke-interface {p7, p1, p4}, Lcom/ibotta/android/features/factory/VariantFactory;->getVariant(Ljava/lang/String;Ljava/lang/Class;)Lcom/ibotta/android/features/Variant;

    move-result-object p1

    move-object v2, p1

    check-cast v2, Lcom/ibotta/android/notification/NotificationsVariant;

    move-object v3, p2

    move-object v4, p3

    move-object v7, p6

    .line 79
    invoke-interface/range {v2 .. v7}, Lcom/ibotta/android/notification/NotificationsVariant;->getNotificationsPresenterImpl(Lcom/ibotta/android/state/app/config/AppConfig;Lcom/ibotta/android/mvp/base/MvpPresenterActions;Lcom/ibotta/android/mvp/ui/activity/notifications/NotificationsLoader;Lcom/ibotta/android/mvp/ui/activity/notifications/NotificationsLoader;Lcom/ibotta/android/state/user/UserState;)Lcom/ibotta/android/mvp/ui/activity/notifications/NotificationsPresenter;

    move-result-object p1

    return-object p1
.end method

.method public provideNotificationCountManager(Lcom/ibotta/android/state/user/UserState;Lcom/ibotta/android/service/api/job/CacheClearJobFactory;)Lcom/ibotta/android/async/notification/NotificationCountManager;
    .locals 1
    .annotation runtime Lcom/ibotta/android/mvp/base/PerActivity;
    .end annotation

    .annotation runtime Ldagger/Provides;
    .end annotation

    .line 41
    new-instance v0, Lcom/ibotta/android/async/notification/NotificationCountManager;

    invoke-direct {v0, p1, p2}, Lcom/ibotta/android/async/notification/NotificationCountManager;-><init>(Lcom/ibotta/android/state/user/UserState;Lcom/ibotta/android/service/api/job/CacheClearJobFactory;)V

    return-object v0
.end method

.method public provideNotificationIntentCreator(Lcom/ibotta/android/routing/RouteHandler;Lcom/ibotta/android/mvp/ui/activity/notifications/detail/NotificationDetailFactory;Lcom/ibotta/android/routing/notification/NotificationRoutingUtil;)Lcom/ibotta/android/routing/intent/NotificationIntentCreator;
    .locals 1
    .annotation runtime Lcom/ibotta/android/mvp/base/PerActivity;
    .end annotation

    .annotation runtime Ldagger/Provides;
    .end annotation

    .line 49
    new-instance v0, Lcom/ibotta/android/routing/intent/NotificationIntentCreatorImpl;

    invoke-direct {v0, p1, p2, p3}, Lcom/ibotta/android/routing/intent/NotificationIntentCreatorImpl;-><init>(Lcom/ibotta/android/routing/RouteHandler;Lcom/ibotta/android/mvp/ui/activity/notifications/detail/NotificationDetailFactory;Lcom/ibotta/android/routing/notification/NotificationRoutingUtil;)V

    return-object v0
.end method
