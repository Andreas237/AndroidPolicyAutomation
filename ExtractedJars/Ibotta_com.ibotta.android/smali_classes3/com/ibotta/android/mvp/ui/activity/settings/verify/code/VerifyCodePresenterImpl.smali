.class public Lcom/ibotta/android/mvp/ui/activity/settings/verify/code/VerifyCodePresenterImpl;
.super Lcom/ibotta/android/mvp/base/loading/AbstractLoadingMvpPresenter;
.source "VerifyCodePresenterImpl.java"

# interfaces
.implements Lcom/ibotta/android/mvp/ui/activity/settings/verify/code/VerifyCodePresenter;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/ibotta/android/mvp/base/loading/AbstractLoadingMvpPresenter<",
        "Lcom/ibotta/android/mvp/ui/activity/settings/verify/code/VerifyCodeView;",
        ">;",
        "Lcom/ibotta/android/mvp/ui/activity/settings/verify/code/VerifyCodePresenter;"
    }
.end annotation


# instance fields
.field private final appCache:Lcom/ibotta/android/appcache/AppCache;

.field private final cacheClearFactory:Lcom/ibotta/android/service/api/job/CacheClearJobFactory;

.field private code:Ljava/lang/String;

.field private final deviceAuthConfig:Lcom/ibotta/android/state/app/config/deviceauth/DeviceAuthenticationAppConfig;

.field private state:Lcom/ibotta/android/mvp/ui/activity/settings/verify/code/VerifyCodePresenterState;

.field private final userState:Lcom/ibotta/android/state/user/UserState;


# direct methods
.method public constructor <init>(Lcom/ibotta/android/mvp/base/MvpPresenterActions;Lcom/ibotta/android/appcache/AppCache;Lcom/ibotta/android/state/user/UserState;Lcom/ibotta/android/state/app/config/deviceauth/DeviceAuthenticationAppConfig;Lcom/ibotta/android/service/api/job/CacheClearJobFactory;)V
    .locals 0

    .line 42
    invoke-direct {p0, p1}, Lcom/ibotta/android/mvp/base/loading/AbstractLoadingMvpPresenter;-><init>(Lcom/ibotta/android/mvp/base/MvpPresenterActions;)V

    .line 43
    iput-object p2, p0, Lcom/ibotta/android/mvp/ui/activity/settings/verify/code/VerifyCodePresenterImpl;->appCache:Lcom/ibotta/android/appcache/AppCache;

    .line 44
    iput-object p3, p0, Lcom/ibotta/android/mvp/ui/activity/settings/verify/code/VerifyCodePresenterImpl;->userState:Lcom/ibotta/android/state/user/UserState;

    .line 45
    iput-object p4, p0, Lcom/ibotta/android/mvp/ui/activity/settings/verify/code/VerifyCodePresenterImpl;->deviceAuthConfig:Lcom/ibotta/android/state/app/config/deviceauth/DeviceAuthenticationAppConfig;

    .line 46
    iput-object p5, p0, Lcom/ibotta/android/mvp/ui/activity/settings/verify/code/VerifyCodePresenterImpl;->cacheClearFactory:Lcom/ibotta/android/service/api/job/CacheClearJobFactory;

    .line 47
    new-instance p1, Lcom/ibotta/android/mvp/ui/activity/settings/verify/code/VerifyCodePresenterState;

    invoke-direct {p1}, Lcom/ibotta/android/mvp/ui/activity/settings/verify/code/VerifyCodePresenterState;-><init>()V

    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/settings/verify/code/VerifyCodePresenterImpl;->state:Lcom/ibotta/android/mvp/ui/activity/settings/verify/code/VerifyCodePresenterState;

    return-void
.end method

.method private onCodeVerificationFailed()V
    .locals 2

    .line 168
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/settings/verify/code/VerifyCodePresenterImpl;->userState:Lcom/ibotta/android/state/user/UserState;

    const/4 v1, 0x0

    invoke-interface {v0, v1}, Lcom/ibotta/android/state/user/UserState;->setVerifiedDeviceReferenceId(Ljava/lang/String;)V

    return-void
.end method

.method private onCodeVerificationSuccess(Lcom/ibotta/api/call/customer/verify/CustomerPhoneVerificationsVerifyPostResponse;Lcom/ibotta/api/call/customer/CustomerByIdResponse;)V
    .locals 2

    .line 160
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/settings/verify/code/VerifyCodePresenterImpl;->appCache:Lcom/ibotta/android/appcache/AppCache;

    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/settings/verify/code/VerifyCodePresenterImpl;->userState:Lcom/ibotta/android/state/user/UserState;

    invoke-interface {v1}, Lcom/ibotta/android/state/user/UserState;->getCustomerId()I

    move-result v1

    invoke-interface {v0, v1, p2}, Lcom/ibotta/android/appcache/AppCache;->updateCustomer(ILcom/ibotta/api/call/customer/CustomerByIdResponse;)V

    .line 162
    iget-object p2, p0, Lcom/ibotta/android/mvp/ui/activity/settings/verify/code/VerifyCodePresenterImpl;->userState:Lcom/ibotta/android/state/user/UserState;

    invoke-virtual {p1}, Lcom/ibotta/api/call/customer/verify/CustomerPhoneVerificationsVerifyPostResponse;->getReferenceId()Ljava/lang/String;

    move-result-object p1

    invoke-interface {p2, p1}, Lcom/ibotta/android/state/user/UserState;->setVerifiedDeviceReferenceId(Ljava/lang/String;)V

    .line 164
    iget-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/settings/verify/code/VerifyCodePresenterImpl;->mvpView:Lcom/ibotta/android/mvp/base/MvpView;

    check-cast p1, Lcom/ibotta/android/mvp/ui/activity/settings/verify/code/VerifyCodeView;

    invoke-interface {p1}, Lcom/ibotta/android/mvp/ui/activity/settings/verify/code/VerifyCodeView;->launchVerifyDeviceComplete()V

    return-void
.end method

.method private validate()V
    .locals 2

    .line 152
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/settings/verify/code/VerifyCodePresenterImpl;->deviceAuthConfig:Lcom/ibotta/android/state/app/config/deviceauth/DeviceAuthenticationAppConfig;

    invoke-virtual {v0}, Lcom/ibotta/android/state/app/config/deviceauth/DeviceAuthenticationAppConfig;->getPinRegex()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    move-result-object v0

    .line 153
    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/settings/verify/code/VerifyCodePresenterImpl;->code:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/regex/Matcher;->matches()Z

    move-result v0

    .line 154
    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/settings/verify/code/VerifyCodePresenterImpl;->mvpView:Lcom/ibotta/android/mvp/base/MvpView;

    check-cast v1, Lcom/ibotta/android/mvp/ui/activity/settings/verify/code/VerifyCodeView;

    invoke-interface {v1, v0}, Lcom/ibotta/android/mvp/ui/activity/settings/verify/code/VerifyCodeView;->setVerifyEnabled(Z)V

    return-void
.end method


# virtual methods
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

.method public getPersistedState()Ljava/lang/Object;
    .locals 1

    .line 87
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/settings/verify/code/VerifyCodePresenterImpl;->state:Lcom/ibotta/android/mvp/ui/activity/settings/verify/code/VerifyCodePresenterState;

    return-object v0
.end method

.method public getPhoneNumber()Ljava/lang/String;
    .locals 1

    .line 77
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/settings/verify/code/VerifyCodePresenterImpl;->state:Lcom/ibotta/android/mvp/ui/activity/settings/verify/code/VerifyCodePresenterState;

    invoke-virtual {v0}, Lcom/ibotta/android/mvp/ui/activity/settings/verify/code/VerifyCodePresenterState;->getPhoneNumber()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public getReferenceId()Ljava/lang/String;
    .locals 1

    .line 82
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/settings/verify/code/VerifyCodePresenterImpl;->state:Lcom/ibotta/android/mvp/ui/activity/settings/verify/code/VerifyCodePresenterState;

    invoke-virtual {v0}, Lcom/ibotta/android/mvp/ui/activity/settings/verify/code/VerifyCodePresenterState;->getReferenceId()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method protected onAbandonFetchJobs()V
    .locals 0

    return-void
.end method

.method public onCodeChanged(Ljava/lang/String;)V
    .locals 0

    .line 97
    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/settings/verify/code/VerifyCodePresenterImpl;->code:Ljava/lang/String;

    .line 98
    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/activity/settings/verify/code/VerifyCodePresenterImpl;->validate()V

    return-void
.end method

.method protected onFetchFinishedSuccessfully()V
    .locals 0

    return-void
.end method

.method public onResendVerificationCodeClicked()V
    .locals 3

    .line 110
    new-instance v0, Lcom/ibotta/api/call/customer/verify/CustomerPhoneVerificationsPostCall;

    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/settings/verify/code/VerifyCodePresenterImpl;->userState:Lcom/ibotta/android/state/user/UserState;

    invoke-interface {v1}, Lcom/ibotta/android/state/user/UserState;->getCustomerId()I

    move-result v1

    iget-object v2, p0, Lcom/ibotta/android/mvp/ui/activity/settings/verify/code/VerifyCodePresenterImpl;->state:Lcom/ibotta/android/mvp/ui/activity/settings/verify/code/VerifyCodePresenterState;

    .line 111
    invoke-virtual {v2}, Lcom/ibotta/android/mvp/ui/activity/settings/verify/code/VerifyCodePresenterState;->getPhoneNumber()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v0, v1, v2}, Lcom/ibotta/api/call/customer/verify/CustomerPhoneVerificationsPostCall;-><init>(ILjava/lang/String;)V

    .line 112
    invoke-virtual {p0, v0}, Lcom/ibotta/android/mvp/ui/activity/settings/verify/code/VerifyCodePresenterImpl;->submitApiCall(Lcom/ibotta/api/ApiCall;)V

    return-void
.end method

.method protected onSubmitJobFailed(Lcom/ibotta/android/service/api/job/SingleApiJob;)V
    .locals 0

    .line 141
    invoke-super {p0, p1}, Lcom/ibotta/android/mvp/base/loading/AbstractLoadingMvpPresenter;->onSubmitJobFailed(Lcom/ibotta/android/service/api/job/SingleApiJob;)V

    .line 142
    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/activity/settings/verify/code/VerifyCodePresenterImpl;->onCodeVerificationFailed()V

    return-void
.end method

.method protected onSubmitJobSuccess(Lcom/ibotta/android/service/api/job/SingleApiJob;)V
    .locals 2

    .line 117
    invoke-super {p0, p1}, Lcom/ibotta/android/mvp/base/loading/AbstractLoadingMvpPresenter;->onSubmitJobSuccess(Lcom/ibotta/android/service/api/job/SingleApiJob;)V

    .line 119
    invoke-virtual {p1}, Lcom/ibotta/android/service/api/job/SingleApiJob;->getApiCall()Lcom/ibotta/api/ApiCall;

    move-result-object v0

    instance-of v0, v0, Lcom/ibotta/api/call/customer/verify/CustomerPhoneVerificationsPostCall;

    if-eqz v0, :cond_0

    .line 121
    invoke-virtual {p1}, Lcom/ibotta/android/service/api/job/SingleApiJob;->getApiResponse()Lcom/ibotta/api/ApiResponse;

    move-result-object p1

    check-cast p1, Lcom/ibotta/api/call/customer/verify/CustomerPhoneVerificationsPostResponse;

    .line 122
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/settings/verify/code/VerifyCodePresenterImpl;->state:Lcom/ibotta/android/mvp/ui/activity/settings/verify/code/VerifyCodePresenterState;

    invoke-virtual {p1}, Lcom/ibotta/api/call/customer/verify/CustomerPhoneVerificationsPostResponse;->getReferenceId()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Lcom/ibotta/android/mvp/ui/activity/settings/verify/code/VerifyCodePresenterState;->setReferenceId(Ljava/lang/String;)V

    goto :goto_1

    .line 123
    :cond_0
    invoke-virtual {p1}, Lcom/ibotta/android/service/api/job/SingleApiJob;->getApiCall()Lcom/ibotta/api/ApiCall;

    move-result-object v0

    instance-of v0, v0, Lcom/ibotta/android/api/deviceauth/PinVerificationCall;

    if-eqz v0, :cond_3

    .line 124
    invoke-virtual {p1}, Lcom/ibotta/android/service/api/job/SingleApiJob;->getApiResponse()Lcom/ibotta/api/ApiResponse;

    move-result-object p1

    check-cast p1, Lcom/ibotta/android/api/deviceauth/PinVerificationResponse;

    const/4 v0, 0x0

    if-eqz p1, :cond_1

    .line 129
    invoke-virtual {p1}, Lcom/ibotta/android/api/deviceauth/PinVerificationResponse;->getCustomerPhoneVerificationsVerifyPostResponse()Lcom/ibotta/api/call/customer/verify/CustomerPhoneVerificationsVerifyPostResponse;

    move-result-object v1

    goto :goto_0

    :cond_1
    move-object v1, v0

    :goto_0
    if-eqz p1, :cond_2

    .line 132
    invoke-virtual {p1}, Lcom/ibotta/android/api/deviceauth/PinVerificationResponse;->getCustomerByIdResponse()Lcom/ibotta/api/call/customer/CustomerByIdResponse;

    move-result-object v0

    .line 135
    :cond_2
    invoke-direct {p0, v1, v0}, Lcom/ibotta/android/mvp/ui/activity/settings/verify/code/VerifyCodePresenterImpl;->onCodeVerificationSuccess(Lcom/ibotta/api/call/customer/verify/CustomerPhoneVerificationsVerifyPostResponse;Lcom/ibotta/api/call/customer/CustomerByIdResponse;)V

    :cond_3
    :goto_1
    return-void
.end method

.method public onVerifyCodeClicked()V
    .locals 5

    .line 103
    new-instance v0, Lcom/ibotta/android/api/deviceauth/PinVerificationCall;

    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/settings/verify/code/VerifyCodePresenterImpl;->cacheClearFactory:Lcom/ibotta/android/service/api/job/CacheClearJobFactory;

    iget-object v2, p0, Lcom/ibotta/android/mvp/ui/activity/settings/verify/code/VerifyCodePresenterImpl;->userState:Lcom/ibotta/android/state/user/UserState;

    .line 104
    invoke-interface {v2}, Lcom/ibotta/android/state/user/UserState;->getCustomerId()I

    move-result v2

    iget-object v3, p0, Lcom/ibotta/android/mvp/ui/activity/settings/verify/code/VerifyCodePresenterImpl;->state:Lcom/ibotta/android/mvp/ui/activity/settings/verify/code/VerifyCodePresenterState;

    invoke-virtual {v3}, Lcom/ibotta/android/mvp/ui/activity/settings/verify/code/VerifyCodePresenterState;->getReferenceId()Ljava/lang/String;

    move-result-object v3

    iget-object v4, p0, Lcom/ibotta/android/mvp/ui/activity/settings/verify/code/VerifyCodePresenterImpl;->code:Ljava/lang/String;

    invoke-direct {v0, v1, v2, v3, v4}, Lcom/ibotta/android/api/deviceauth/PinVerificationCall;-><init>(Lcom/ibotta/android/service/api/job/CacheClearJobFactory;ILjava/lang/String;Ljava/lang/String;)V

    .line 105
    invoke-virtual {p0, v0}, Lcom/ibotta/android/mvp/ui/activity/settings/verify/code/VerifyCodePresenterImpl;->submitApiCall(Lcom/ibotta/api/ApiCall;)V

    return-void
.end method

.method public onVerifyComplete()V
    .locals 1

    .line 148
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/settings/verify/code/VerifyCodePresenterImpl;->mvpView:Lcom/ibotta/android/mvp/base/MvpView;

    check-cast v0, Lcom/ibotta/android/mvp/ui/activity/settings/verify/code/VerifyCodeView;

    invoke-interface {v0}, Lcom/ibotta/android/mvp/ui/activity/settings/verify/code/VerifyCodeView;->finishSuccessfully()V

    return-void
.end method

.method public setPersistedState(Ljava/lang/Object;)V
    .locals 0

    .line 92
    check-cast p1, Lcom/ibotta/android/mvp/ui/activity/settings/verify/code/VerifyCodePresenterState;

    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/settings/verify/code/VerifyCodePresenterImpl;->state:Lcom/ibotta/android/mvp/ui/activity/settings/verify/code/VerifyCodePresenterState;

    return-void
.end method

.method public setPhoneNumber(Ljava/lang/String;)V
    .locals 1

    .line 67
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/settings/verify/code/VerifyCodePresenterImpl;->state:Lcom/ibotta/android/mvp/ui/activity/settings/verify/code/VerifyCodePresenterState;

    invoke-virtual {v0, p1}, Lcom/ibotta/android/mvp/ui/activity/settings/verify/code/VerifyCodePresenterState;->setPhoneNumber(Ljava/lang/String;)V

    return-void
.end method

.method public setReferenceId(Ljava/lang/String;)V
    .locals 1

    .line 72
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/settings/verify/code/VerifyCodePresenterImpl;->state:Lcom/ibotta/android/mvp/ui/activity/settings/verify/code/VerifyCodePresenterState;

    invoke-virtual {v0, p1}, Lcom/ibotta/android/mvp/ui/activity/settings/verify/code/VerifyCodePresenterState;->setReferenceId(Ljava/lang/String;)V

    return-void
.end method
