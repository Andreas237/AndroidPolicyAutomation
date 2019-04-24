.class public Lcom/ibotta/android/mvp/ui/activity/settings/verify/code/VerifyCodeModule;
.super Lcom/ibotta/android/mvp/base/AbstractMvpModule;
.source "VerifyCodeModule.java"


# annotations
.annotation runtime Ldagger/Module;
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/ibotta/android/mvp/base/AbstractMvpModule<",
        "Lcom/ibotta/android/mvp/ui/activity/settings/verify/code/VerifyCodeView;",
        ">;"
    }
.end annotation


# direct methods
.method public constructor <init>(Lcom/ibotta/android/mvp/ui/activity/settings/verify/code/VerifyCodeView;)V
    .locals 0

    .line 22
    invoke-direct {p0, p1}, Lcom/ibotta/android/mvp/base/AbstractMvpModule;-><init>(Lcom/ibotta/android/mvp/base/MvpView;)V

    return-void
.end method


# virtual methods
.method public provideAppConfig(Lcom/ibotta/android/state/app/config/AppConfig;)Lcom/ibotta/android/state/app/config/deviceauth/DeviceAuthenticationAppConfig;
    .locals 0
    .annotation runtime Ldagger/Provides;
    .end annotation

    .line 27
    invoke-interface {p1}, Lcom/ibotta/android/state/app/config/AppConfig;->getDeviceAuthenticationAppConfig()Lcom/ibotta/android/state/app/config/deviceauth/DeviceAuthenticationAppConfig;

    move-result-object p1

    return-object p1
.end method

.method public provideMvpPresenter(Lcom/ibotta/android/mvp/base/MvpPresenterActions;Lcom/ibotta/android/appcache/AppCache;Lcom/ibotta/android/state/user/UserState;Lcom/ibotta/android/state/app/config/deviceauth/DeviceAuthenticationAppConfig;Lcom/ibotta/android/service/api/job/CacheClearJobFactory;)Lcom/ibotta/android/mvp/ui/activity/settings/verify/code/VerifyCodePresenter;
    .locals 7
    .annotation runtime Lcom/ibotta/android/mvp/base/PerActivity;
    .end annotation

    .annotation runtime Ldagger/Provides;
    .end annotation

    .line 37
    new-instance v6, Lcom/ibotta/android/mvp/ui/activity/settings/verify/code/VerifyCodePresenterImpl;

    move-object v0, v6

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    move-object v4, p4

    move-object v5, p5

    invoke-direct/range {v0 .. v5}, Lcom/ibotta/android/mvp/ui/activity/settings/verify/code/VerifyCodePresenterImpl;-><init>(Lcom/ibotta/android/mvp/base/MvpPresenterActions;Lcom/ibotta/android/appcache/AppCache;Lcom/ibotta/android/state/user/UserState;Lcom/ibotta/android/state/app/config/deviceauth/DeviceAuthenticationAppConfig;Lcom/ibotta/android/service/api/job/CacheClearJobFactory;)V

    return-object v6
.end method
