.class public Lcom/ibotta/android/mvp/ui/activity/settings/verify/VerifyDevicePresenterImpl;
.super Lcom/ibotta/android/mvp/base/loading/AbstractLoadingMvpPresenter;
.source "VerifyDevicePresenterImpl.java"

# interfaces
.implements Lcom/ibotta/android/mvp/ui/activity/settings/verify/VerifyDevicePresenter;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/ibotta/android/mvp/base/loading/AbstractLoadingMvpPresenter<",
        "Lcom/ibotta/android/mvp/ui/activity/settings/verify/VerifyDeviceView;",
        ">;",
        "Lcom/ibotta/android/mvp/ui/activity/settings/verify/VerifyDevicePresenter;"
    }
.end annotation


# direct methods
.method public constructor <init>(Lcom/ibotta/android/mvp/base/MvpPresenterActions;)V
    .locals 0

    .line 17
    invoke-direct {p0, p1}, Lcom/ibotta/android/mvp/base/loading/AbstractLoadingMvpPresenter;-><init>(Lcom/ibotta/android/mvp/base/MvpPresenterActions;)V

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

.method public onStartVerificationClicked()V
    .locals 1

    .line 37
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/settings/verify/VerifyDevicePresenterImpl;->mvpView:Lcom/ibotta/android/mvp/base/MvpView;

    check-cast v0, Lcom/ibotta/android/mvp/ui/activity/settings/verify/VerifyDeviceView;

    invoke-interface {v0}, Lcom/ibotta/android/mvp/ui/activity/settings/verify/VerifyDeviceView;->launchVerifyPhoneNumber()V

    return-void
.end method

.method public onVerifyComplete()V
    .locals 1

    .line 47
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/settings/verify/VerifyDevicePresenterImpl;->mvpView:Lcom/ibotta/android/mvp/base/MvpView;

    check-cast v0, Lcom/ibotta/android/mvp/ui/activity/settings/verify/VerifyDeviceView;

    invoke-interface {v0}, Lcom/ibotta/android/mvp/ui/activity/settings/verify/VerifyDeviceView;->finishSuccessfully()V

    return-void
.end method

.method public onWhyDoThisClicked()V
    .locals 1

    .line 42
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/settings/verify/VerifyDevicePresenterImpl;->mvpView:Lcom/ibotta/android/mvp/base/MvpView;

    check-cast v0, Lcom/ibotta/android/mvp/ui/activity/settings/verify/VerifyDeviceView;

    invoke-interface {v0}, Lcom/ibotta/android/mvp/ui/activity/settings/verify/VerifyDeviceView;->launchWhyDoThis()V

    return-void
.end method
