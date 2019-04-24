.class public Lcom/ibotta/android/mvp/ui/activity/notifications/detail/NotificationDetailModule;
.super Lcom/ibotta/android/mvp/base/AbstractMvpModule;
.source "NotificationDetailModule.java"


# annotations
.annotation runtime Ldagger/Module;
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/ibotta/android/mvp/base/AbstractMvpModule<",
        "Lcom/ibotta/android/mvp/ui/activity/notifications/detail/NotificationDetailView;",
        ">;"
    }
.end annotation


# direct methods
.method public constructor <init>(Lcom/ibotta/android/mvp/ui/activity/notifications/detail/NotificationDetailView;)V
    .locals 0

    .line 20
    invoke-direct {p0, p1}, Lcom/ibotta/android/mvp/base/AbstractMvpModule;-><init>(Lcom/ibotta/android/mvp/base/MvpView;)V

    return-void
.end method


# virtual methods
.method public provideMvpPresenter(Lcom/ibotta/android/mvp/base/MvpPresenterActions;Lcom/ibotta/android/util/AppHelper;Lcom/ibotta/android/state/user/UserState;Lcom/ibotta/android/tracking/Tracker;)Lcom/ibotta/android/mvp/ui/activity/notifications/detail/NotificationDetailPresenter;
    .locals 1
    .annotation runtime Lcom/ibotta/android/mvp/base/PerActivity;
    .end annotation

    .annotation runtime Ldagger/Provides;
    .end annotation

    .line 29
    new-instance v0, Lcom/ibotta/android/mvp/ui/activity/notifications/detail/NotificationDetailPresenterImpl;

    invoke-direct {v0, p1, p2, p3, p4}, Lcom/ibotta/android/mvp/ui/activity/notifications/detail/NotificationDetailPresenterImpl;-><init>(Lcom/ibotta/android/mvp/base/MvpPresenterActions;Lcom/ibotta/android/util/AppHelper;Lcom/ibotta/android/state/user/UserState;Lcom/ibotta/android/tracking/Tracker;)V

    return-object v0
.end method
