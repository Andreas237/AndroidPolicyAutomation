.class public Lcom/ibotta/android/mvp/ui/activity/earningsdetail/EarningsDetailModule;
.super Lcom/ibotta/android/mvp/base/AbstractMvpModule;
.source "EarningsDetailModule.java"


# annotations
.annotation runtime Ldagger/Module;
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/ibotta/android/mvp/base/AbstractMvpModule<",
        "Lcom/ibotta/android/mvp/ui/activity/earningsdetail/EarningsDetailView;",
        ">;"
    }
.end annotation


# direct methods
.method public constructor <init>(Lcom/ibotta/android/mvp/ui/activity/earningsdetail/EarningsDetailView;)V
    .locals 0

    .line 22
    invoke-direct {p0, p1}, Lcom/ibotta/android/mvp/base/AbstractMvpModule;-><init>(Lcom/ibotta/android/mvp/base/MvpView;)V

    return-void
.end method


# virtual methods
.method public provideApp()Lcom/ibotta/android/App;
    .locals 1
    .annotation runtime Lcom/ibotta/android/mvp/base/PerActivity;
    .end annotation

    .annotation runtime Ldagger/Provides;
    .end annotation

    .line 27
    invoke-static {}, Lcom/ibotta/android/App;->instance()Lcom/ibotta/android/App;

    move-result-object v0

    return-object v0
.end method

.method public provideMvpPresenter(Lcom/ibotta/android/mvp/base/MvpPresenterActions;Lcom/ibotta/android/util/Formatting;Lcom/ibotta/android/state/user/UserState;Lcom/ibotta/api/helper/bonus/BonusHelper;Lcom/ibotta/android/title/TitleBarReducer;)Lcom/ibotta/android/mvp/ui/activity/earningsdetail/EarningsDetailPresenter;
    .locals 7
    .annotation runtime Lcom/ibotta/android/mvp/base/PerActivity;
    .end annotation

    .annotation runtime Ldagger/Provides;
    .end annotation

    .line 37
    new-instance v6, Lcom/ibotta/android/mvp/ui/activity/earningsdetail/EarningsDetailPresenterImpl;

    move-object v0, v6

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    move-object v4, p4

    move-object v5, p5

    invoke-direct/range {v0 .. v5}, Lcom/ibotta/android/mvp/ui/activity/earningsdetail/EarningsDetailPresenterImpl;-><init>(Lcom/ibotta/android/mvp/base/MvpPresenterActions;Lcom/ibotta/android/util/Formatting;Lcom/ibotta/android/state/user/UserState;Lcom/ibotta/api/helper/bonus/BonusHelper;Lcom/ibotta/android/title/TitleBarReducer;)V

    return-object v6
.end method
