.class public Lcom/ibotta/android/mvp/ui/activity/settings/verify/VerifyDeviceModule;
.super Lcom/ibotta/android/mvp/base/AbstractMvpModule;
.source "VerifyDeviceModule.java"


# annotations
.annotation runtime Ldagger/Module;
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/ibotta/android/mvp/base/AbstractMvpModule<",
        "Lcom/ibotta/android/mvp/ui/activity/settings/verify/VerifyDeviceView;",
        ">;"
    }
.end annotation


# direct methods
.method public constructor <init>(Lcom/ibotta/android/mvp/ui/activity/settings/verify/VerifyDeviceView;)V
    .locals 0

    .line 19
    invoke-direct {p0, p1}, Lcom/ibotta/android/mvp/base/AbstractMvpModule;-><init>(Lcom/ibotta/android/mvp/base/MvpView;)V

    return-void
.end method


# virtual methods
.method public provideAppConfig(Lcom/ibotta/android/state/app/config/AppConfig;)Lcom/ibotta/android/state/app/config/deviceauth/DeviceAuthenticationAppConfig;
    .locals 0
    .annotation runtime Ldagger/Provides;
    .end annotation

    .line 24
    invoke-interface {p1}, Lcom/ibotta/android/state/app/config/AppConfig;->getDeviceAuthenticationAppConfig()Lcom/ibotta/android/state/app/config/deviceauth/DeviceAuthenticationAppConfig;

    move-result-object p1

    return-object p1
.end method

.method public provideMvpPresenter(Lcom/ibotta/android/mvp/base/MvpPresenterActions;)Lcom/ibotta/android/mvp/ui/activity/settings/verify/VerifyDevicePresenter;
    .locals 1
    .annotation runtime Lcom/ibotta/android/mvp/base/PerActivity;
    .end annotation

    .annotation runtime Ldagger/Provides;
    .end annotation

    .line 29
    new-instance v0, Lcom/ibotta/android/mvp/ui/activity/settings/verify/VerifyDevicePresenterImpl;

    invoke-direct {v0, p1}, Lcom/ibotta/android/mvp/ui/activity/settings/verify/VerifyDevicePresenterImpl;-><init>(Lcom/ibotta/android/mvp/base/MvpPresenterActions;)V

    return-object v0
.end method
