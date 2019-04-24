.class public Lcom/ibotta/android/mvp/ui/activity/settings/verify/phonenumber/VerifyPhoneNumberPresenterImpl;
.super Lcom/ibotta/android/mvp/base/loading/AbstractLoadingMvpPresenter;
.source "VerifyPhoneNumberPresenterImpl.java"

# interfaces
.implements Lcom/ibotta/android/mvp/ui/activity/settings/verify/phonenumber/VerifyPhoneNumberPresenter;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/ibotta/android/mvp/base/loading/AbstractLoadingMvpPresenter<",
        "Lcom/ibotta/android/mvp/ui/activity/settings/verify/phonenumber/VerifyPhoneNumberView;",
        ">;",
        "Lcom/ibotta/android/mvp/ui/activity/settings/verify/phonenumber/VerifyPhoneNumberPresenter;"
    }
.end annotation


# instance fields
.field private countryCode:Lcom/ibotta/android/state/app/config/deviceauth/DeviceAuthenticationAppConfig$CountryCode;

.field private formatting:Lcom/ibotta/android/util/Formatting;

.field private normalizedPhoneNumber:Ljava/lang/String;

.field private phoneNumber:Ljava/lang/String;

.field private userState:Lcom/ibotta/android/state/user/UserState;


# direct methods
.method public constructor <init>(Lcom/ibotta/android/mvp/base/MvpPresenterActions;Lcom/ibotta/android/state/user/UserState;Lcom/ibotta/android/util/Formatting;)V
    .locals 0

    .line 31
    invoke-direct {p0, p1}, Lcom/ibotta/android/mvp/base/loading/AbstractLoadingMvpPresenter;-><init>(Lcom/ibotta/android/mvp/base/MvpPresenterActions;)V

    .line 32
    iput-object p2, p0, Lcom/ibotta/android/mvp/ui/activity/settings/verify/phonenumber/VerifyPhoneNumberPresenterImpl;->userState:Lcom/ibotta/android/state/user/UserState;

    .line 33
    iput-object p3, p0, Lcom/ibotta/android/mvp/ui/activity/settings/verify/phonenumber/VerifyPhoneNumberPresenterImpl;->formatting:Lcom/ibotta/android/util/Formatting;

    return-void
.end method

.method private onSubmitPhoneNumberSuccess(Ljava/lang/String;)V
    .locals 2

    .line 116
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/settings/verify/phonenumber/VerifyPhoneNumberPresenterImpl;->mvpView:Lcom/ibotta/android/mvp/base/MvpView;

    check-cast v0, Lcom/ibotta/android/mvp/ui/activity/settings/verify/phonenumber/VerifyPhoneNumberView;

    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/settings/verify/phonenumber/VerifyPhoneNumberPresenterImpl;->normalizedPhoneNumber:Ljava/lang/String;

    invoke-interface {v0, v1, p1}, Lcom/ibotta/android/mvp/ui/activity/settings/verify/phonenumber/VerifyPhoneNumberView;->launchVerifyCode(Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method private validate()Z
    .locals 2

    .line 93
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/settings/verify/phonenumber/VerifyPhoneNumberPresenterImpl;->formatting:Lcom/ibotta/android/util/Formatting;

    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/settings/verify/phonenumber/VerifyPhoneNumberPresenterImpl;->phoneNumber:Ljava/lang/String;

    invoke-virtual {p0, v1}, Lcom/ibotta/android/mvp/ui/activity/settings/verify/phonenumber/VerifyPhoneNumberPresenterImpl;->getCountryCodePhoneNumber(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v1}, Lcom/ibotta/android/util/Formatting;->normalizeToDigits(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/settings/verify/phonenumber/VerifyPhoneNumberPresenterImpl;->normalizedPhoneNumber:Ljava/lang/String;

    .line 94
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/settings/verify/phonenumber/VerifyPhoneNumberPresenterImpl;->countryCode:Lcom/ibotta/android/state/app/config/deviceauth/DeviceAuthenticationAppConfig$CountryCode;

    invoke-virtual {v0}, Lcom/ibotta/android/state/app/config/deviceauth/DeviceAuthenticationAppConfig$CountryCode;->getRegex()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    move-result-object v0

    .line 95
    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/settings/verify/phonenumber/VerifyPhoneNumberPresenterImpl;->normalizedPhoneNumber:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/regex/Matcher;->matches()Z

    move-result v0

    .line 96
    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/settings/verify/phonenumber/VerifyPhoneNumberPresenterImpl;->mvpView:Lcom/ibotta/android/mvp/base/MvpView;

    check-cast v1, Lcom/ibotta/android/mvp/ui/activity/settings/verify/phonenumber/VerifyPhoneNumberView;

    invoke-interface {v1, v0}, Lcom/ibotta/android/mvp/ui/activity/settings/verify/phonenumber/VerifyPhoneNumberView;->setSendVerificationCodeEnabled(Z)V

    return v0
.end method

.method private verifyPhoneNumber()V
    .locals 3

    .line 110
    new-instance v0, Lcom/ibotta/api/call/customer/verify/CustomerPhoneVerificationsPostCall;

    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/settings/verify/phonenumber/VerifyPhoneNumberPresenterImpl;->userState:Lcom/ibotta/android/state/user/UserState;

    invoke-interface {v1}, Lcom/ibotta/android/state/user/UserState;->getCustomerId()I

    move-result v1

    iget-object v2, p0, Lcom/ibotta/android/mvp/ui/activity/settings/verify/phonenumber/VerifyPhoneNumberPresenterImpl;->normalizedPhoneNumber:Ljava/lang/String;

    invoke-direct {v0, v1, v2}, Lcom/ibotta/api/call/customer/verify/CustomerPhoneVerificationsPostCall;-><init>(ILjava/lang/String;)V

    .line 112
    invoke-virtual {p0, v0}, Lcom/ibotta/android/mvp/ui/activity/settings/verify/phonenumber/VerifyPhoneNumberPresenterImpl;->submitApiCall(Lcom/ibotta/api/ApiCall;)V

    return-void
.end method


# virtual methods
.method protected getCountryCodePhoneNumber(Ljava/lang/String;)Ljava/lang/String;
    .locals 2

    .line 101
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 102
    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/settings/verify/phonenumber/VerifyPhoneNumberPresenterImpl;->countryCode:Lcom/ibotta/android/state/app/config/deviceauth/DeviceAuthenticationAppConfig$CountryCode;

    invoke-virtual {v1}, Lcom/ibotta/android/state/app/config/deviceauth/DeviceAuthenticationAppConfig$CountryCode;->getCode()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1, v1}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v1

    if-nez v1, :cond_0

    .line 103
    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/settings/verify/phonenumber/VerifyPhoneNumberPresenterImpl;->countryCode:Lcom/ibotta/android/state/app/config/deviceauth/DeviceAuthenticationAppConfig$CountryCode;

    invoke-virtual {v1}, Lcom/ibotta/android/state/app/config/deviceauth/DeviceAuthenticationAppConfig$CountryCode;->getCode()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 105
    :cond_0
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 106
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method protected getFetchJobs()Ljava/util/Set;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Set<",
            "Lcom/ibotta/android/service/api/job/ApiJob;",
            ">;"
        }
    .end annotation

    const/4 v0, 0x0

    return-object v0
.end method

.method protected onAbandonFetchJobs()V
    .locals 0

    return-void
.end method

.method public onCountryCodeChanged(Lcom/ibotta/android/state/app/config/deviceauth/DeviceAuthenticationAppConfig$CountryCode;)V
    .locals 0

    .line 53
    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/settings/verify/phonenumber/VerifyPhoneNumberPresenterImpl;->countryCode:Lcom/ibotta/android/state/app/config/deviceauth/DeviceAuthenticationAppConfig$CountryCode;

    return-void
.end method

.method protected onFetchFinishedSuccessfully()V
    .locals 0

    return-void
.end method

.method public onPhoneNumberChanged(Ljava/lang/String;)V
    .locals 0

    .line 58
    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/settings/verify/phonenumber/VerifyPhoneNumberPresenterImpl;->phoneNumber:Ljava/lang/String;

    .line 59
    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/activity/settings/verify/phonenumber/VerifyPhoneNumberPresenterImpl;->validate()Z

    return-void
.end method

.method protected onSubmitJobFailed(Lcom/ibotta/android/service/api/job/SingleApiJob;)V
    .locals 0

    .line 82
    invoke-super {p0, p1}, Lcom/ibotta/android/mvp/base/loading/AbstractLoadingMvpPresenter;->onSubmitJobFailed(Lcom/ibotta/android/service/api/job/SingleApiJob;)V

    return-void
.end method

.method protected onSubmitJobSuccess(Lcom/ibotta/android/service/api/job/SingleApiJob;)V
    .locals 1

    .line 71
    invoke-super {p0, p1}, Lcom/ibotta/android/mvp/base/loading/AbstractLoadingMvpPresenter;->onSubmitJobSuccess(Lcom/ibotta/android/service/api/job/SingleApiJob;)V

    .line 73
    invoke-virtual {p1}, Lcom/ibotta/android/service/api/job/SingleApiJob;->getApiCall()Lcom/ibotta/api/ApiCall;

    move-result-object v0

    instance-of v0, v0, Lcom/ibotta/api/call/customer/verify/CustomerPhoneVerificationsPostCall;

    if-eqz v0, :cond_0

    .line 75
    invoke-virtual {p1}, Lcom/ibotta/android/service/api/job/SingleApiJob;->getApiResponse()Lcom/ibotta/api/ApiResponse;

    move-result-object p1

    check-cast p1, Lcom/ibotta/api/call/customer/verify/CustomerPhoneVerificationsPostResponse;

    .line 76
    invoke-virtual {p1}, Lcom/ibotta/api/call/customer/verify/CustomerPhoneVerificationsPostResponse;->getReferenceId()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p0, p1}, Lcom/ibotta/android/mvp/ui/activity/settings/verify/phonenumber/VerifyPhoneNumberPresenterImpl;->onSubmitPhoneNumberSuccess(Ljava/lang/String;)V

    :cond_0
    return-void
.end method

.method public onVerifyComplete()V
    .locals 1

    .line 89
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/settings/verify/phonenumber/VerifyPhoneNumberPresenterImpl;->mvpView:Lcom/ibotta/android/mvp/base/MvpView;

    check-cast v0, Lcom/ibotta/android/mvp/ui/activity/settings/verify/phonenumber/VerifyPhoneNumberView;

    invoke-interface {v0}, Lcom/ibotta/android/mvp/ui/activity/settings/verify/phonenumber/VerifyPhoneNumberView;->finishSuccessfully()V

    return-void
.end method

.method public onVerifyPhoneNumberClicked()V
    .locals 1

    .line 64
    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/activity/settings/verify/phonenumber/VerifyPhoneNumberPresenterImpl;->validate()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 65
    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/activity/settings/verify/phonenumber/VerifyPhoneNumberPresenterImpl;->verifyPhoneNumber()V

    :cond_0
    return-void
.end method
