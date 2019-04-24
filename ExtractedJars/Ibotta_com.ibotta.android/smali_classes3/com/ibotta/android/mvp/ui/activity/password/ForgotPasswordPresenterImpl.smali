.class public Lcom/ibotta/android/mvp/ui/activity/password/ForgotPasswordPresenterImpl;
.super Lcom/ibotta/android/mvp/base/loading/AbstractLoadingMvpPresenter;
.source "ForgotPasswordPresenterImpl.java"

# interfaces
.implements Lcom/ibotta/android/mvp/ui/activity/password/ForgotPasswordPresenter;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/ibotta/android/mvp/base/loading/AbstractLoadingMvpPresenter<",
        "Lcom/ibotta/android/mvp/ui/activity/password/ForgotPasswordView;",
        ">;",
        "Lcom/ibotta/android/mvp/ui/activity/password/ForgotPasswordPresenter;"
    }
.end annotation


# instance fields
.field private final emailState:Lcom/ibotta/android/state/app/email/EmailState;

.field private initialized:Z

.field private final validation:Lcom/ibotta/android/util/Validation;


# direct methods
.method public constructor <init>(Lcom/ibotta/android/mvp/base/MvpPresenterActions;Lcom/ibotta/android/state/app/email/EmailState;Lcom/ibotta/android/util/Validation;)V
    .locals 0

    .line 25
    invoke-direct {p0, p1}, Lcom/ibotta/android/mvp/base/loading/AbstractLoadingMvpPresenter;-><init>(Lcom/ibotta/android/mvp/base/MvpPresenterActions;)V

    .line 26
    iput-object p2, p0, Lcom/ibotta/android/mvp/ui/activity/password/ForgotPasswordPresenterImpl;->emailState:Lcom/ibotta/android/state/app/email/EmailState;

    .line 27
    iput-object p3, p0, Lcom/ibotta/android/mvp/ui/activity/password/ForgotPasswordPresenterImpl;->validation:Lcom/ibotta/android/util/Validation;

    return-void
.end method

.method private isValidEmail(Ljava/lang/String;)Z
    .locals 1

    .line 79
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/password/ForgotPasswordPresenterImpl;->validation:Lcom/ibotta/android/util/Validation;

    invoke-interface {v0, p1}, Lcom/ibotta/android/util/Validation;->isValidEmail(Ljava/lang/String;)Z

    move-result p1

    return p1
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

.method public onEmailChanged(Ljava/lang/String;)V
    .locals 1

    .line 70
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/password/ForgotPasswordPresenterImpl;->mvpView:Lcom/ibotta/android/mvp/base/MvpView;

    check-cast v0, Lcom/ibotta/android/mvp/ui/activity/password/ForgotPasswordView;

    invoke-direct {p0, p1}, Lcom/ibotta/android/mvp/ui/activity/password/ForgotPasswordPresenterImpl;->isValidEmail(Ljava/lang/String;)Z

    move-result p1

    invoke-interface {v0, p1}, Lcom/ibotta/android/mvp/ui/activity/password/ForgotPasswordView;->setResetPasswordEnabled(Z)V

    return-void
.end method

.method protected onFetchFinishedSuccessfully()V
    .locals 0

    return-void
.end method

.method public onResetPasswordClicked(Ljava/lang/String;)V
    .locals 1

    .line 65
    new-instance v0, Lcom/ibotta/api/call/customer/CustomerResetPasswordPutCall;

    invoke-direct {v0, p1}, Lcom/ibotta/api/call/customer/CustomerResetPasswordPutCall;-><init>(Ljava/lang/String;)V

    invoke-virtual {p0, v0}, Lcom/ibotta/android/mvp/ui/activity/password/ForgotPasswordPresenterImpl;->submitApiCall(Lcom/ibotta/api/ApiCall;)V

    return-void
.end method

.method public onResetPasswordMessageShown()V
    .locals 1

    .line 75
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/password/ForgotPasswordPresenterImpl;->mvpView:Lcom/ibotta/android/mvp/base/MvpView;

    check-cast v0, Lcom/ibotta/android/mvp/ui/activity/password/ForgotPasswordView;

    invoke-interface {v0}, Lcom/ibotta/android/mvp/ui/activity/password/ForgotPasswordView;->finish()V

    return-void
.end method

.method public onStart()V
    .locals 2

    .line 32
    invoke-super {p0}, Lcom/ibotta/android/mvp/base/loading/AbstractLoadingMvpPresenter;->onStart()V

    .line 34
    iget-boolean v0, p0, Lcom/ibotta/android/mvp/ui/activity/password/ForgotPasswordPresenterImpl;->initialized:Z

    if-nez v0, :cond_0

    .line 35
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/password/ForgotPasswordPresenterImpl;->emailState:Lcom/ibotta/android/state/app/email/EmailState;

    invoke-interface {v0}, Lcom/ibotta/android/state/app/email/EmailState;->getLastEmailUsed()Ljava/lang/String;

    move-result-object v0

    .line 36
    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/password/ForgotPasswordPresenterImpl;->mvpView:Lcom/ibotta/android/mvp/base/MvpView;

    check-cast v1, Lcom/ibotta/android/mvp/ui/activity/password/ForgotPasswordView;

    invoke-interface {v1, v0}, Lcom/ibotta/android/mvp/ui/activity/password/ForgotPasswordView;->setEmail(Ljava/lang/String;)V

    .line 37
    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/password/ForgotPasswordPresenterImpl;->mvpView:Lcom/ibotta/android/mvp/base/MvpView;

    check-cast v1, Lcom/ibotta/android/mvp/ui/activity/password/ForgotPasswordView;

    invoke-direct {p0, v0}, Lcom/ibotta/android/mvp/ui/activity/password/ForgotPasswordPresenterImpl;->isValidEmail(Ljava/lang/String;)Z

    move-result v0

    invoke-interface {v1, v0}, Lcom/ibotta/android/mvp/ui/activity/password/ForgotPasswordView;->setResetPasswordEnabled(Z)V

    const/4 v0, 0x1

    .line 38
    iput-boolean v0, p0, Lcom/ibotta/android/mvp/ui/activity/password/ForgotPasswordPresenterImpl;->initialized:Z

    :cond_0
    return-void
.end method

.method protected onSubmitJobSuccess(Lcom/ibotta/android/service/api/job/SingleApiJob;)V
    .locals 0

    .line 59
    invoke-super {p0, p1}, Lcom/ibotta/android/mvp/base/loading/AbstractLoadingMvpPresenter;->onSubmitJobSuccess(Lcom/ibotta/android/service/api/job/SingleApiJob;)V

    .line 60
    iget-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/password/ForgotPasswordPresenterImpl;->mvpView:Lcom/ibotta/android/mvp/base/MvpView;

    check-cast p1, Lcom/ibotta/android/mvp/ui/activity/password/ForgotPasswordView;

    invoke-interface {p1}, Lcom/ibotta/android/mvp/ui/activity/password/ForgotPasswordView;->showResetPasswordSuccess()V

    return-void
.end method
