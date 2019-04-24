.class public Lcom/ibotta/android/mvp/ui/activity/login/LoginPresenterImpl;
.super Lcom/ibotta/android/mvp/base/loading/AbstractLoadingMvpPresenter;
.source "LoginPresenterImpl.java"

# interfaces
.implements Lcom/ibotta/android/mvp/ui/activity/login/LoginPresenter;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/ibotta/android/mvp/base/loading/AbstractLoadingMvpPresenter<",
        "Lcom/ibotta/android/mvp/ui/activity/login/LoginView;",
        ">;",
        "Lcom/ibotta/android/mvp/ui/activity/login/LoginPresenter;"
    }
.end annotation


# instance fields
.field private final appHelper:Lcom/ibotta/android/util/AppHelper;

.field private final appTimingTracker:Lcom/ibotta/android/tracking/timing/AppTimingTracker;

.field private final deviceSecurity:Lcom/ibotta/android/security/DeviceSecurity;

.field private final emailState:Lcom/ibotta/android/state/app/email/EmailState;

.field private initialized:Z

.field private loginStartTime:J

.field private final postAuthWorkJobFactory:Lcom/ibotta/android/api/auth/PostAuthWorkJobFactory;

.field private final validation:Lcom/ibotta/android/util/Validation;


# direct methods
.method public constructor <init>(Lcom/ibotta/android/mvp/base/MvpPresenterActions;Lcom/ibotta/android/state/app/email/EmailState;Lcom/ibotta/android/util/Validation;Lcom/ibotta/android/security/DeviceSecurity;Lcom/ibotta/android/tracking/timing/AppTimingTracker;Lcom/ibotta/android/util/AppHelper;Lcom/ibotta/android/api/auth/PostAuthWorkJobFactory;)V
    .locals 0

    .line 43
    invoke-direct {p0, p1}, Lcom/ibotta/android/mvp/base/loading/AbstractLoadingMvpPresenter;-><init>(Lcom/ibotta/android/mvp/base/MvpPresenterActions;)V

    .line 44
    iput-object p2, p0, Lcom/ibotta/android/mvp/ui/activity/login/LoginPresenterImpl;->emailState:Lcom/ibotta/android/state/app/email/EmailState;

    .line 45
    iput-object p3, p0, Lcom/ibotta/android/mvp/ui/activity/login/LoginPresenterImpl;->validation:Lcom/ibotta/android/util/Validation;

    .line 46
    iput-object p4, p0, Lcom/ibotta/android/mvp/ui/activity/login/LoginPresenterImpl;->deviceSecurity:Lcom/ibotta/android/security/DeviceSecurity;

    .line 47
    iput-object p5, p0, Lcom/ibotta/android/mvp/ui/activity/login/LoginPresenterImpl;->appTimingTracker:Lcom/ibotta/android/tracking/timing/AppTimingTracker;

    .line 48
    iput-object p6, p0, Lcom/ibotta/android/mvp/ui/activity/login/LoginPresenterImpl;->appHelper:Lcom/ibotta/android/util/AppHelper;

    .line 49
    iput-object p7, p0, Lcom/ibotta/android/mvp/ui/activity/login/LoginPresenterImpl;->postAuthWorkJobFactory:Lcom/ibotta/android/api/auth/PostAuthWorkJobFactory;

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

.method protected onAbandonFetchJobs()V
    .locals 0

    return-void
.end method

.method protected onFetchFinishedSuccessfully()V
    .locals 0

    return-void
.end method

.method public onForgotPasswordClicked()V
    .locals 1

    .line 104
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/login/LoginPresenterImpl;->mvpView:Lcom/ibotta/android/mvp/base/MvpView;

    check-cast v0, Lcom/ibotta/android/mvp/ui/activity/login/LoginView;

    invoke-interface {v0}, Lcom/ibotta/android/mvp/ui/activity/login/LoginView;->showForgotPassword()V

    return-void
.end method

.method public onLogInChanged(Ljava/lang/String;Ljava/lang/String;)V
    .locals 1

    .line 109
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/login/LoginPresenterImpl;->validation:Lcom/ibotta/android/util/Validation;

    invoke-interface {v0, p1}, Lcom/ibotta/android/util/Validation;->isValidEmail(Ljava/lang/String;)Z

    move-result p1

    .line 110
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/login/LoginPresenterImpl;->validation:Lcom/ibotta/android/util/Validation;

    invoke-interface {v0, p2}, Lcom/ibotta/android/util/Validation;->isEntered(Ljava/lang/String;)Z

    move-result p2

    .line 112
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/login/LoginPresenterImpl;->mvpView:Lcom/ibotta/android/mvp/base/MvpView;

    check-cast v0, Lcom/ibotta/android/mvp/ui/activity/login/LoginView;

    if-eqz p1, :cond_0

    if-eqz p2, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    invoke-interface {v0, p1}, Lcom/ibotta/android/mvp/ui/activity/login/LoginView;->setLogInAllowed(Z)V

    return-void
.end method

.method public onLogInClicked(Ljava/lang/String;Ljava/lang/String;)V
    .locals 2

    .line 79
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/login/LoginPresenterImpl;->appHelper:Lcom/ibotta/android/util/AppHelper;

    invoke-interface {v0}, Lcom/ibotta/android/util/AppHelper;->getCurrentTime()J

    move-result-wide v0

    iput-wide v0, p0, Lcom/ibotta/android/mvp/ui/activity/login/LoginPresenterImpl;->loginStartTime:J

    .line 81
    invoke-static {}, Lcom/ibotta/api/model/auth/Login;->builder()Lcom/ibotta/api/model/auth/Login$Builder;

    move-result-object v0

    sget-object v1, Lcom/ibotta/api/model/auth/AuthType;->IBOTTA:Lcom/ibotta/api/model/auth/AuthType;

    .line 82
    invoke-virtual {v0, v1}, Lcom/ibotta/api/model/auth/Login$Builder;->authType(Lcom/ibotta/api/model/auth/AuthType;)Lcom/ibotta/api/model/auth/Login$Builder;

    move-result-object v0

    .line 83
    invoke-virtual {v0, p1}, Lcom/ibotta/api/model/auth/Login$Builder;->email(Ljava/lang/String;)Lcom/ibotta/api/model/auth/Login$Builder;

    move-result-object p1

    .line 84
    invoke-virtual {p1, p2}, Lcom/ibotta/api/model/auth/Login$Builder;->password(Ljava/lang/String;)Lcom/ibotta/api/model/auth/Login$Builder;

    move-result-object p1

    iget-object p2, p0, Lcom/ibotta/android/mvp/ui/activity/login/LoginPresenterImpl;->deviceSecurity:Lcom/ibotta/android/security/DeviceSecurity;

    .line 85
    invoke-interface {p2}, Lcom/ibotta/android/security/DeviceSecurity;->getUniqueId()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Lcom/ibotta/api/model/auth/Login$Builder;->deviceUdid(Ljava/lang/String;)Lcom/ibotta/api/model/auth/Login$Builder;

    move-result-object p1

    .line 86
    invoke-virtual {p1}, Lcom/ibotta/api/model/auth/Login$Builder;->build()Lcom/ibotta/api/model/auth/Login;

    move-result-object p1

    .line 88
    iget-object p2, p0, Lcom/ibotta/android/mvp/ui/activity/login/LoginPresenterImpl;->postAuthWorkJobFactory:Lcom/ibotta/android/api/auth/PostAuthWorkJobFactory;

    invoke-virtual {p2, p1}, Lcom/ibotta/android/api/auth/PostAuthWorkJobFactory;->createFor(Lcom/ibotta/api/model/auth/Login;)Lcom/ibotta/android/api/auth/PostAuthWorkJob;

    move-result-object p1

    invoke-virtual {p0, p1}, Lcom/ibotta/android/mvp/ui/activity/login/LoginPresenterImpl;->submitApiJob(Lcom/ibotta/android/service/api/job/ApiJob;)V

    return-void
.end method

.method public onStart()V
    .locals 2

    .line 54
    invoke-super {p0}, Lcom/ibotta/android/mvp/base/loading/AbstractLoadingMvpPresenter;->onStart()V

    .line 55
    iget-boolean v0, p0, Lcom/ibotta/android/mvp/ui/activity/login/LoginPresenterImpl;->initialized:Z

    if-nez v0, :cond_0

    .line 56
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/login/LoginPresenterImpl;->mvpView:Lcom/ibotta/android/mvp/base/MvpView;

    check-cast v0, Lcom/ibotta/android/mvp/ui/activity/login/LoginView;

    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/login/LoginPresenterImpl;->emailState:Lcom/ibotta/android/state/app/email/EmailState;

    invoke-interface {v1}, Lcom/ibotta/android/state/app/email/EmailState;->getLastEmailUsed()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v1}, Lcom/ibotta/android/mvp/ui/activity/login/LoginView;->setEmail(Ljava/lang/String;)V

    .line 57
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/login/LoginPresenterImpl;->mvpView:Lcom/ibotta/android/mvp/base/MvpView;

    check-cast v0, Lcom/ibotta/android/mvp/ui/activity/login/LoginView;

    const/4 v1, 0x0

    invoke-interface {v0, v1}, Lcom/ibotta/android/mvp/ui/activity/login/LoginView;->setLogInAllowed(Z)V

    const/4 v0, 0x1

    .line 58
    iput-boolean v0, p0, Lcom/ibotta/android/mvp/ui/activity/login/LoginPresenterImpl;->initialized:Z

    :cond_0
    return-void
.end method

.method protected onSubmitJobSuccess(Lcom/ibotta/android/service/api/job/SingleApiJob;)V
    .locals 4

    .line 93
    invoke-super {p0, p1}, Lcom/ibotta/android/mvp/base/loading/AbstractLoadingMvpPresenter;->onSubmitJobSuccess(Lcom/ibotta/android/service/api/job/SingleApiJob;)V

    .line 96
    iget-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/login/LoginPresenterImpl;->appHelper:Lcom/ibotta/android/util/AppHelper;

    invoke-interface {p1}, Lcom/ibotta/android/util/AppHelper;->getCurrentTime()J

    move-result-wide v0

    iget-wide v2, p0, Lcom/ibotta/android/mvp/ui/activity/login/LoginPresenterImpl;->loginStartTime:J

    sub-long/2addr v0, v2

    .line 97
    iget-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/login/LoginPresenterImpl;->appTimingTracker:Lcom/ibotta/android/tracking/timing/AppTimingTracker;

    invoke-interface {p1, v0, v1}, Lcom/ibotta/android/tracking/timing/AppTimingTracker;->trackTimeToLogin(J)V

    .line 99
    iget-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/login/LoginPresenterImpl;->mvpView:Lcom/ibotta/android/mvp/base/MvpView;

    check-cast p1, Lcom/ibotta/android/mvp/ui/activity/login/LoginView;

    invoke-interface {p1}, Lcom/ibotta/android/mvp/ui/activity/login/LoginView;->notifySuccess()V

    return-void
.end method
