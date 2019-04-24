.class public Lcom/ibotta/android/mvp/ui/activity/notifications/friends/FriendsLikeModule;
.super Lcom/ibotta/android/mvp/base/AbstractMvpModule;
.source "FriendsLikeModule.java"


# annotations
.annotation runtime Ldagger/Module;
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/ibotta/android/mvp/base/AbstractMvpModule<",
        "Lcom/ibotta/android/mvp/ui/activity/notifications/friends/FriendsLikeView;",
        ">;"
    }
.end annotation


# direct methods
.method public constructor <init>(Lcom/ibotta/android/mvp/ui/activity/notifications/friends/FriendsLikeView;)V
    .locals 0

    .line 20
    invoke-direct {p0, p1}, Lcom/ibotta/android/mvp/base/AbstractMvpModule;-><init>(Lcom/ibotta/android/mvp/base/MvpView;)V

    return-void
.end method


# virtual methods
.method public provideFriendsNameComparator(Lcom/ibotta/android/util/Formatting;)Lcom/ibotta/android/fragment/activity/FriendsNameComparator;
    .locals 1
    .annotation runtime Lcom/ibotta/android/mvp/base/PerActivity;
    .end annotation

    .annotation runtime Ldagger/Provides;
    .end annotation

    .line 34
    new-instance v0, Lcom/ibotta/android/fragment/activity/FriendsNameComparator;

    invoke-direct {v0, p1}, Lcom/ibotta/android/fragment/activity/FriendsNameComparator;-><init>(Lcom/ibotta/android/util/Formatting;)V

    return-object v0
.end method

.method public provideMvpPresenter(Lcom/ibotta/android/mvp/base/MvpPresenterActions;Lcom/ibotta/android/state/user/UserState;Lcom/ibotta/android/util/Formatting;Lcom/ibotta/android/fragment/activity/FriendsNameComparator;)Lcom/ibotta/android/mvp/ui/activity/notifications/friends/FriendsLikePresenter;
    .locals 1
    .annotation runtime Lcom/ibotta/android/mvp/base/PerActivity;
    .end annotation

    .annotation runtime Ldagger/Provides;
    .end annotation

    .line 29
    new-instance v0, Lcom/ibotta/android/mvp/ui/activity/notifications/friends/FriendsLikePresenterImpl;

    invoke-direct {v0, p1, p2, p3, p4}, Lcom/ibotta/android/mvp/ui/activity/notifications/friends/FriendsLikePresenterImpl;-><init>(Lcom/ibotta/android/mvp/base/MvpPresenterActions;Lcom/ibotta/android/state/user/UserState;Lcom/ibotta/android/util/Formatting;Lcom/ibotta/android/fragment/activity/FriendsNameComparator;)V

    return-object v0
.end method
