.class public Lcom/ibotta/android/mvp/ui/activity/earnings/myearnings/MyEarningsModule;
.super Lcom/ibotta/android/mvp/base/AbstractMvpModule;
.source "MyEarningsModule.java"


# annotations
.annotation runtime Ldagger/Module;
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/ibotta/android/mvp/base/AbstractMvpModule<",
        "Lcom/ibotta/android/mvp/ui/activity/earnings/myearnings/MyEarningsView;",
        ">;"
    }
.end annotation


# direct methods
.method public constructor <init>(Lcom/ibotta/android/mvp/ui/activity/earnings/myearnings/MyEarningsView;)V
    .locals 0

    .line 29
    invoke-direct {p0, p1}, Lcom/ibotta/android/mvp/base/AbstractMvpModule;-><init>(Lcom/ibotta/android/mvp/base/MvpView;)V

    return-void
.end method


# virtual methods
.method public provideMvpPresenter(Lcom/ibotta/android/mvp/base/MvpPresenterActions;Lcom/ibotta/android/util/Formatting;Lcom/ibotta/android/state/user/UserState;Lcom/ibotta/api/helper/earnings/EarningsHelper;Lcom/ibotta/android/service/api/job/ApiJobFactory;)Lcom/ibotta/android/mvp/ui/activity/earnings/myearnings/MyEarningsPresenter;
    .locals 7
    .annotation runtime Lcom/ibotta/android/mvp/base/PerActivity;
    .end annotation

    .annotation runtime Ldagger/Provides;
    .end annotation

    .line 54
    new-instance v6, Lcom/ibotta/android/mvp/ui/activity/earnings/myearnings/MyEarningsPresenterImpl;

    move-object v0, v6

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    move-object v4, p4

    move-object v5, p5

    invoke-direct/range {v0 .. v5}, Lcom/ibotta/android/mvp/ui/activity/earnings/myearnings/MyEarningsPresenterImpl;-><init>(Lcom/ibotta/android/mvp/base/MvpPresenterActions;Lcom/ibotta/android/util/Formatting;Lcom/ibotta/android/state/user/UserState;Lcom/ibotta/api/helper/earnings/EarningsHelper;Lcom/ibotta/android/service/api/job/ApiJobFactory;)V

    return-object v6
.end method

.method public provideNotificationCountManager(Lcom/ibotta/android/state/user/UserState;Lcom/ibotta/android/service/api/job/CacheClearJobFactory;)Lcom/ibotta/android/async/notification/NotificationCountManager;
    .locals 1
    .annotation runtime Lcom/ibotta/android/mvp/base/PerActivity;
    .end annotation

    .annotation runtime Ldagger/Provides;
    .end annotation

    .line 35
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

    .line 43
    new-instance v0, Lcom/ibotta/android/routing/intent/NotificationIntentCreatorImpl;

    invoke-direct {v0, p1, p2, p3}, Lcom/ibotta/android/routing/intent/NotificationIntentCreatorImpl;-><init>(Lcom/ibotta/android/routing/RouteHandler;Lcom/ibotta/android/mvp/ui/activity/notifications/detail/NotificationDetailFactory;Lcom/ibotta/android/routing/notification/NotificationRoutingUtil;)V

    return-object v0
.end method
