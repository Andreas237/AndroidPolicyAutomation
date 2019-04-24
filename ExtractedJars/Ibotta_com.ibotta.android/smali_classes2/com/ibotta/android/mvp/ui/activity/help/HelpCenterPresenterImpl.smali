.class public Lcom/ibotta/android/mvp/ui/activity/help/HelpCenterPresenterImpl;
.super Lcom/ibotta/android/mvp/base/loading/AbstractLoadingMvpPresenter;
.source "HelpCenterPresenterImpl.java"

# interfaces
.implements Lcom/ibotta/android/mvp/ui/activity/help/HelpCenterPresenter;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/ibotta/android/mvp/base/loading/AbstractLoadingMvpPresenter<",
        "Lcom/ibotta/android/mvp/ui/activity/help/HelpCenterView;",
        ">;",
        "Lcom/ibotta/android/mvp/ui/activity/help/HelpCenterPresenter;"
    }
.end annotation


# instance fields
.field private helpCenterJob:Lcom/ibotta/android/service/api/job/SingleApiJob;


# direct methods
.method public constructor <init>(Lcom/ibotta/android/mvp/base/MvpPresenterActions;)V
    .locals 0

    .line 22
    invoke-direct {p0, p1}, Lcom/ibotta/android/mvp/base/loading/AbstractLoadingMvpPresenter;-><init>(Lcom/ibotta/android/mvp/base/MvpPresenterActions;)V

    return-void
.end method


# virtual methods
.method protected getFetchJobs()Ljava/util/Set;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Set<",
            "Lcom/ibotta/android/service/api/job/ApiJob;",
            ">;"
        }
    .end annotation

    .line 27
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/help/HelpCenterPresenterImpl;->helpCenterJob:Lcom/ibotta/android/service/api/job/SingleApiJob;

    if-nez v0, :cond_0

    .line 28
    new-instance v0, Lcom/ibotta/android/service/api/job/SingleApiJob;

    new-instance v1, Lcom/ibotta/api/call/help/HelpCenterCall;

    invoke-direct {v1}, Lcom/ibotta/api/call/help/HelpCenterCall;-><init>()V

    invoke-direct {v0, v1}, Lcom/ibotta/android/service/api/job/SingleApiJob;-><init>(Lcom/ibotta/api/ApiCall;)V

    iput-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/help/HelpCenterPresenterImpl;->helpCenterJob:Lcom/ibotta/android/service/api/job/SingleApiJob;

    .line 31
    :cond_0
    new-instance v0, Ljava/util/HashSet;

    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    .line 32
    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/help/HelpCenterPresenterImpl;->helpCenterJob:Lcom/ibotta/android/service/api/job/SingleApiJob;

    invoke-interface {v0, v1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    return-object v0
.end method

.method public launchHelpCenter(Ljava/lang/String;)V
    .locals 1

    .line 70
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/help/HelpCenterPresenterImpl;->mvpView:Lcom/ibotta/android/mvp/base/MvpView;

    check-cast v0, Lcom/ibotta/android/mvp/ui/activity/help/HelpCenterView;

    invoke-interface {v0, p1}, Lcom/ibotta/android/mvp/ui/activity/help/HelpCenterView;->launchHelpCenter(Ljava/lang/String;)V

    return-void
.end method

.method protected onAbandonFetchJobs()V
    .locals 1

    const/4 v0, 0x0

    .line 39
    iput-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/help/HelpCenterPresenterImpl;->helpCenterJob:Lcom/ibotta/android/service/api/job/SingleApiJob;

    return-void
.end method

.method protected onFetchFinishedSuccessfully()V
    .locals 1

    .line 44
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/help/HelpCenterPresenterImpl;->helpCenterJob:Lcom/ibotta/android/service/api/job/SingleApiJob;

    invoke-virtual {v0}, Lcom/ibotta/android/service/api/job/SingleApiJob;->getApiResponse()Lcom/ibotta/api/ApiResponse;

    move-result-object v0

    check-cast v0, Lcom/ibotta/api/call/help/HelpCenterResponse;

    .line 46
    invoke-virtual {v0}, Lcom/ibotta/api/call/help/HelpCenterResponse;->getHelpCenterUrl()Ljava/lang/String;

    move-result-object v0

    .line 48
    invoke-virtual {p0, v0}, Lcom/ibotta/android/mvp/ui/activity/help/HelpCenterPresenterImpl;->launchHelpCenter(Ljava/lang/String;)V

    .line 49
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/help/HelpCenterPresenterImpl;->mvpView:Lcom/ibotta/android/mvp/base/MvpView;

    check-cast v0, Lcom/ibotta/android/mvp/ui/activity/help/HelpCenterView;

    invoke-interface {v0}, Lcom/ibotta/android/mvp/ui/activity/help/HelpCenterView;->finish()V

    return-void
.end method

.method protected onFetchFinishedWithFailures()V
    .locals 1

    .line 54
    invoke-super {p0}, Lcom/ibotta/android/mvp/base/loading/AbstractLoadingMvpPresenter;->onFetchFinishedWithFailures()V

    .line 57
    iget-boolean v0, p0, Lcom/ibotta/android/mvp/ui/activity/help/HelpCenterPresenterImpl;->networkConnectionErrorViewShowing:Z

    if-eqz v0, :cond_0

    .line 58
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/help/HelpCenterPresenterImpl;->mvpView:Lcom/ibotta/android/mvp/base/MvpView;

    check-cast v0, Lcom/ibotta/android/mvp/ui/activity/help/HelpCenterView;

    invoke-interface {v0}, Lcom/ibotta/android/mvp/ui/activity/help/HelpCenterView;->setTitleForLoadFailure()V

    :cond_0
    return-void
.end method

.method public onScreenLoadingCancelled()V
    .locals 1

    .line 64
    invoke-super {p0}, Lcom/ibotta/android/mvp/base/loading/AbstractLoadingMvpPresenter;->onScreenLoadingCancelled()V

    .line 65
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/help/HelpCenterPresenterImpl;->mvpView:Lcom/ibotta/android/mvp/base/MvpView;

    check-cast v0, Lcom/ibotta/android/mvp/ui/activity/help/HelpCenterView;

    invoke-interface {v0}, Lcom/ibotta/android/mvp/ui/activity/help/HelpCenterView;->finish()V

    return-void
.end method
