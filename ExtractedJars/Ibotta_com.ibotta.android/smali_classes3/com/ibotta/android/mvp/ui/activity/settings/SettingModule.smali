.class public Lcom/ibotta/android/mvp/ui/activity/settings/SettingModule;
.super Lcom/ibotta/android/mvp/base/AbstractMvpModule;
.source "SettingModule.java"


# annotations
.annotation runtime Ldagger/Module;
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/ibotta/android/mvp/base/AbstractMvpModule<",
        "Lcom/ibotta/android/mvp/ui/activity/settings/SettingView;",
        ">;"
    }
.end annotation


# direct methods
.method public constructor <init>(Lcom/ibotta/android/mvp/ui/activity/settings/SettingView;)V
    .locals 0

    .line 25
    invoke-direct {p0, p1}, Lcom/ibotta/android/mvp/base/AbstractMvpModule;-><init>(Lcom/ibotta/android/mvp/base/MvpView;)V

    return-void
.end method

.method public static provideSettingReducer(Lcom/ibotta/android/title/TitleBarReducer;)Lcom/ibotta/android/account/settings/SettingReducer;
    .locals 1
    .annotation runtime Ldagger/Provides;
    .end annotation

    .line 31
    new-instance v0, Lcom/ibotta/android/account/settings/SettingReducer;

    invoke-direct {v0, p0}, Lcom/ibotta/android/account/settings/SettingReducer;-><init>(Lcom/ibotta/android/title/TitleBarReducer;)V

    return-object v0
.end method


# virtual methods
.method public provideMvpPresenter(Lcom/ibotta/android/mvp/base/MvpPresenterActions;Lcom/ibotta/android/state/user/UserState;Lcom/ibotta/android/state/app/config/AppConfig;Lcom/ibotta/android/profile/BuildProfile;Lcom/ibotta/android/service/work/favorites/FavoriteRetailerSettingsFlushWorker;Lcom/ibotta/android/service/work/tracking/TrackingFlushWorker;Lcom/ibotta/android/state/user/LogOutManager;Lcom/ibotta/android/account/settings/SettingReducer;)Lcom/ibotta/android/mvp/ui/activity/settings/SettingPresenter;
    .locals 10
    .annotation runtime Lcom/ibotta/android/mvp/base/PerActivity;
    .end annotation

    .annotation runtime Ldagger/Provides;
    .end annotation

    .line 45
    new-instance v9, Lcom/ibotta/android/mvp/ui/activity/settings/SettingPresenterImpl;

    move-object v0, v9

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    move-object v4, p4

    move-object v5, p5

    move-object/from16 v6, p6

    move-object/from16 v7, p7

    move-object/from16 v8, p8

    invoke-direct/range {v0 .. v8}, Lcom/ibotta/android/mvp/ui/activity/settings/SettingPresenterImpl;-><init>(Lcom/ibotta/android/mvp/base/MvpPresenterActions;Lcom/ibotta/android/state/user/UserState;Lcom/ibotta/android/state/app/config/AppConfig;Lcom/ibotta/android/profile/BuildProfile;Lcom/ibotta/android/service/work/favorites/FavoriteRetailerSettingsFlushWorker;Lcom/ibotta/android/service/work/tracking/TrackingFlushWorker;Lcom/ibotta/android/state/user/LogOutManager;Lcom/ibotta/android/account/settings/SettingReducer;)V

    return-object v9
.end method
