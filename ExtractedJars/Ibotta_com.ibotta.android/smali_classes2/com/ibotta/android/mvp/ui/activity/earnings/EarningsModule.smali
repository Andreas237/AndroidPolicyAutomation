.class public Lcom/ibotta/android/mvp/ui/activity/earnings/EarningsModule;
.super Lcom/ibotta/android/mvp/base/AbstractMvpModule;
.source "EarningsModule.java"


# annotations
.annotation runtime Ldagger/Module;
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/ibotta/android/mvp/base/AbstractMvpModule<",
        "Lcom/ibotta/android/mvp/ui/activity/earnings/EarningsView;",
        ">;"
    }
.end annotation


# direct methods
.method public constructor <init>(Lcom/ibotta/android/mvp/ui/activity/earnings/EarningsView;)V
    .locals 0

    .line 24
    invoke-direct {p0, p1}, Lcom/ibotta/android/mvp/base/AbstractMvpModule;-><init>(Lcom/ibotta/android/mvp/base/MvpView;)V

    return-void
.end method


# virtual methods
.method public provideMvpPresenter(Lcom/ibotta/android/mvp/base/MvpPresenterActions;Lcom/ibotta/android/service/api/ApiWorkSubmitter;Lcom/ibotta/android/state/user/UserState;Lcom/ibotta/api/call/ApiCallFactory;Lcom/ibotta/android/util/Formatting;Lcom/ibotta/android/tracking/Tracker;Lcom/ibotta/api/helper/earnings/EarningsHelper;Lcom/ibotta/android/service/api/job/CacheClearJobFactory;)Lcom/ibotta/android/mvp/ui/activity/earnings/EarningsPresenter;
    .locals 7
    .annotation runtime Lcom/ibotta/android/mvp/base/PerActivity;
    .end annotation

    .annotation runtime Ldagger/Provides;
    .end annotation

    .line 37
    new-instance v4, Lcom/ibotta/android/mvp/ui/activity/earnings/EarningsLoaderImpl;

    invoke-direct {v4, p2, p3, p4, p8}, Lcom/ibotta/android/mvp/ui/activity/earnings/EarningsLoaderImpl;-><init>(Lcom/ibotta/android/service/api/ApiWorkSubmitter;Lcom/ibotta/android/state/user/UserState;Lcom/ibotta/api/call/ApiCallFactory;Lcom/ibotta/android/service/api/job/CacheClearJobFactory;)V

    .line 39
    new-instance p2, Lcom/ibotta/android/mvp/ui/activity/earnings/EarningsPresenterImpl;

    move-object v0, p2

    move-object v1, p1

    move-object v2, p5

    move-object v3, p3

    move-object v5, p6

    move-object v6, p7

    invoke-direct/range {v0 .. v6}, Lcom/ibotta/android/mvp/ui/activity/earnings/EarningsPresenterImpl;-><init>(Lcom/ibotta/android/mvp/base/MvpPresenterActions;Lcom/ibotta/android/util/Formatting;Lcom/ibotta/android/state/user/UserState;Lcom/ibotta/android/mvp/ui/activity/earnings/EarningsLoader;Lcom/ibotta/android/tracking/Tracker;Lcom/ibotta/api/helper/earnings/EarningsHelper;)V

    return-object p2
.end method
