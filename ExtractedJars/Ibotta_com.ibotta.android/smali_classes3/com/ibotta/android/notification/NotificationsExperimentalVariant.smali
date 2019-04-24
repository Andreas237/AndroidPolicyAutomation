.class public Lcom/ibotta/android/notification/NotificationsExperimentalVariant;
.super Ljava/lang/Object;
.source "NotificationsExperimentalVariant.java"

# interfaces
.implements Lcom/ibotta/android/features/ExperimentalVariant;
.implements Lcom/ibotta/android/notification/NotificationsVariant;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 11
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public getNotificationsPresenterImpl(Lcom/ibotta/android/state/app/config/AppConfig;Lcom/ibotta/android/mvp/base/MvpPresenterActions;Lcom/ibotta/android/mvp/ui/activity/notifications/NotificationsLoader;Lcom/ibotta/android/mvp/ui/activity/notifications/NotificationsLoader;Lcom/ibotta/android/state/user/UserState;)Lcom/ibotta/android/mvp/ui/activity/notifications/NotificationsPresenter;
    .locals 0

    .line 24
    new-instance p3, Lcom/ibotta/android/mvp/ui/activity/notifications/NotificationsPresenterImplV1;

    invoke-direct {p3, p1, p2, p5}, Lcom/ibotta/android/mvp/ui/activity/notifications/NotificationsPresenterImplV1;-><init>(Lcom/ibotta/android/state/app/config/AppConfig;Lcom/ibotta/android/mvp/base/MvpPresenterActions;Lcom/ibotta/android/state/user/UserState;)V

    return-object p3
.end method

.method public useGraphQL()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method
