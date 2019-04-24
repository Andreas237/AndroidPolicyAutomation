.class public Lcom/ibotta/android/mvp/ui/activity/settings/verify/phonenumber/VerifyPhoneNumberModule;
.super Lcom/ibotta/android/mvp/base/AbstractMvpModule;
.source "VerifyPhoneNumberModule.java"


# annotations
.annotation runtime Ldagger/Module;
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/ibotta/android/mvp/base/AbstractMvpModule<",
        "Lcom/ibotta/android/mvp/ui/activity/settings/verify/phonenumber/VerifyPhoneNumberView;",
        ">;"
    }
.end annotation


# direct methods
.method public constructor <init>(Lcom/ibotta/android/mvp/ui/activity/settings/verify/phonenumber/VerifyPhoneNumberView;)V
    .locals 0

    .line 21
    invoke-direct {p0, p1}, Lcom/ibotta/android/mvp/base/AbstractMvpModule;-><init>(Lcom/ibotta/android/mvp/base/MvpView;)V

    return-void
.end method


# virtual methods
.method public provideAppConfig(Lcom/ibotta/android/state/app/config/AppConfig;)Lcom/ibotta/android/state/app/config/deviceauth/DeviceAuthenticationAppConfig;
    .locals 0
    .annotation runtime Ldagger/Provides;
    .end annotation

    .line 26
    invoke-interface {p1}, Lcom/ibotta/android/state/app/config/AppConfig;->getDeviceAuthenticationAppConfig()Lcom/ibotta/android/state/app/config/deviceauth/DeviceAuthenticationAppConfig;

    move-result-object p1

    return-object p1
.end method

.method public provideMvpPresenter(Lcom/ibotta/android/mvp/base/MvpPresenterActions;Lcom/ibotta/android/state/user/UserState;Lcom/ibotta/android/util/Formatting;)Lcom/ibotta/android/mvp/ui/activity/settings/verify/phonenumber/VerifyPhoneNumberPresenter;
    .locals 1
    .annotation runtime Lcom/ibotta/android/mvp/base/PerActivity;
    .end annotation

    .annotation runtime Ldagger/Provides;
    .end annotation

    .line 32
    new-instance v0, Lcom/ibotta/android/mvp/ui/activity/settings/verify/phonenumber/VerifyPhoneNumberPresenterImpl;

    invoke-direct {v0, p1, p2, p3}, Lcom/ibotta/android/mvp/ui/activity/settings/verify/phonenumber/VerifyPhoneNumberPresenterImpl;-><init>(Lcom/ibotta/android/mvp/base/MvpPresenterActions;Lcom/ibotta/android/state/user/UserState;Lcom/ibotta/android/util/Formatting;)V

    return-object v0
.end method
