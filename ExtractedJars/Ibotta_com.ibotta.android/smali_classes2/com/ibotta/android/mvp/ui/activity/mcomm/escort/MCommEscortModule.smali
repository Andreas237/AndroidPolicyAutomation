.class public Lcom/ibotta/android/mvp/ui/activity/mcomm/escort/MCommEscortModule;
.super Lcom/ibotta/android/mvp/base/AbstractMvpModule;
.source "MCommEscortModule.java"


# annotations
.annotation runtime Ldagger/Module;
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/ibotta/android/mvp/base/AbstractMvpModule<",
        "Lcom/ibotta/android/mvp/ui/activity/mcomm/escort/MCommEscortView;",
        ">;"
    }
.end annotation


# direct methods
.method public constructor <init>(Lcom/ibotta/android/mvp/ui/activity/mcomm/escort/MCommEscortView;)V
    .locals 0

    .line 27
    invoke-direct {p0, p1}, Lcom/ibotta/android/mvp/base/AbstractMvpModule;-><init>(Lcom/ibotta/android/mvp/base/MvpView;)V

    return-void
.end method

.method public static provideMcommEscortReducer(Lcom/ibotta/android/title/TitleBarReducer;Landroid/content/res/Resources;)Lcom/ibotta/android/content/mcommescort/McommEscortReducer;
    .locals 1
    .annotation runtime Ldagger/Provides;
    .end annotation

    .line 37
    new-instance v0, Lcom/ibotta/android/content/mcommescort/McommEscortReducer;

    invoke-direct {v0, p0, p1}, Lcom/ibotta/android/content/mcommescort/McommEscortReducer;-><init>(Lcom/ibotta/android/title/TitleBarReducer;Landroid/content/res/Resources;)V

    return-object v0
.end method


# virtual methods
.method public provideApp()Lcom/ibotta/android/App;
    .locals 1
    .annotation runtime Ldagger/Provides;
    .end annotation

    .line 32
    invoke-static {}, Lcom/ibotta/android/App;->instance()Lcom/ibotta/android/App;

    move-result-object v0

    return-object v0
.end method

.method public provideMvpPresenter(Lcom/ibotta/android/mvp/base/MvpPresenterActions;Lcom/ibotta/android/buttonsdk/ButtonSdkManager;Lcom/ibotta/android/state/app/config/AppConfig;Lcom/ibotta/android/mvp/ui/activity/mcomm/escort/strategy/MCommEscortStrategyFactory;Lcom/ibotta/android/util/AppHelper;Lcom/ibotta/android/tracking/proprietary/TrackingQueue;Lcom/ibotta/android/content/mcommescort/McommEscortReducer;)Lcom/ibotta/android/mvp/ui/activity/mcomm/escort/MCommEscortPresenter;
    .locals 9
    .annotation runtime Lcom/ibotta/android/mvp/base/PerActivity;
    .end annotation

    .annotation runtime Ldagger/Provides;
    .end annotation

    .line 49
    new-instance v8, Lcom/ibotta/android/mvp/ui/activity/mcomm/escort/MCommEscortPresenterImpl;

    move-object v0, v8

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    move-object v4, p4

    move-object v5, p5

    move-object v6, p6

    move-object/from16 v7, p7

    invoke-direct/range {v0 .. v7}, Lcom/ibotta/android/mvp/ui/activity/mcomm/escort/MCommEscortPresenterImpl;-><init>(Lcom/ibotta/android/mvp/base/MvpPresenterActions;Lcom/ibotta/android/buttonsdk/ButtonSdkManager;Lcom/ibotta/android/state/app/config/AppConfig;Lcom/ibotta/android/mvp/ui/activity/mcomm/escort/strategy/MCommEscortStrategyFactory;Lcom/ibotta/android/util/AppHelper;Lcom/ibotta/android/tracking/proprietary/TrackingQueue;Lcom/ibotta/android/content/mcommescort/McommEscortReducer;)V

    return-object v8
.end method
