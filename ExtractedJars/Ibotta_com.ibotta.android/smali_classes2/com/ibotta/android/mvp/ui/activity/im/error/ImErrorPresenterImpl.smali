.class public Lcom/ibotta/android/mvp/ui/activity/im/error/ImErrorPresenterImpl;
.super Lcom/ibotta/android/mvp/base/loading/AbstractLoadingMvpPresenter;
.source "ImErrorPresenterImpl.java"

# interfaces
.implements Lcom/ibotta/android/mvp/ui/activity/im/ImDisconnectConfirmationListener;
.implements Lcom/ibotta/android/mvp/ui/activity/im/error/ImErrorPresenter;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/ibotta/android/mvp/base/loading/AbstractLoadingMvpPresenter<",
        "Lcom/ibotta/android/mvp/ui/activity/im/error/ImErrorView;",
        ">;",
        "Lcom/ibotta/android/mvp/ui/activity/im/ImDisconnectConfirmationListener;",
        "Lcom/ibotta/android/mvp/ui/activity/im/error/ImErrorPresenter;"
    }
.end annotation


# instance fields
.field private final cacheClearBatchApiJob:Lcom/ibotta/android/service/api/job/CacheClearBatchApiJob;

.field private customer:Lcom/ibotta/api/model/customer/Customer;
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation
.end field

.field private customerJob:Lcom/ibotta/android/service/api/job/SingleApiJob;
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation
.end field

.field private homeJob:Lcom/ibotta/android/service/api/job/HomeApiJob;
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation
.end field

.field private final imUiUtil:Lcom/ibotta/android/mvp/ui/activity/im/ImUiUtil;

.field private persistedState:Lcom/ibotta/android/mvp/ui/activity/im/error/ImErrorPersistedState;

.field private final reducer:Lcom/ibotta/android/mvp/ui/activity/im/error/ImErrorReducer;

.field private final retailerHelper:Lcom/ibotta/api/helper/retailer/RetailerHelper;

.field private retailerParcel:Lcom/ibotta/android/fragment/retailer/RetailerParcel;
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation
.end field

.field private final retailerParcelHelper:Lcom/ibotta/android/fragment/retailer/RetailerParcelHelper;

.field private final userState:Lcom/ibotta/android/state/user/UserState;

.field private final viewComponent:Lcom/ibotta/android/views/components/ViewComponent;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/ibotta/android/views/components/ViewComponent<",
            "Lcom/ibotta/android/mvp/ui/activity/im/error/ImErrorViewState;",
            "Lcom/ibotta/android/mvp/ui/activity/im/error/ImErrorViewEvents;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lcom/ibotta/android/mvp/base/MvpPresenterActions;Lcom/ibotta/android/views/components/ViewComponent;Lcom/ibotta/android/mvp/ui/activity/im/error/ImErrorReducer;Lcom/ibotta/api/helper/retailer/RetailerHelper;Lcom/ibotta/android/fragment/retailer/RetailerParcelHelper;Lcom/ibotta/android/state/user/UserState;Lcom/ibotta/android/mvp/ui/activity/im/ImUiUtil;Lcom/ibotta/android/service/api/job/CacheClearBatchApiJob;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/ibotta/android/mvp/base/MvpPresenterActions;",
            "Lcom/ibotta/android/views/components/ViewComponent<",
            "Lcom/ibotta/android/mvp/ui/activity/im/error/ImErrorViewState;",
            "Lcom/ibotta/android/mvp/ui/activity/im/error/ImErrorViewEvents;",
            ">;",
            "Lcom/ibotta/android/mvp/ui/activity/im/error/ImErrorReducer;",
            "Lcom/ibotta/api/helper/retailer/RetailerHelper;",
            "Lcom/ibotta/android/fragment/retailer/RetailerParcelHelper;",
            "Lcom/ibotta/android/state/user/UserState;",
            "Lcom/ibotta/android/mvp/ui/activity/im/ImUiUtil;",
            "Lcom/ibotta/android/service/api/job/CacheClearBatchApiJob;",
            ")V"
        }
    .end annotation

    .line 58
    invoke-direct {p0, p1}, Lcom/ibotta/android/mvp/base/loading/AbstractLoadingMvpPresenter;-><init>(Lcom/ibotta/android/mvp/base/MvpPresenterActions;)V

    .line 59
    iput-object p2, p0, Lcom/ibotta/android/mvp/ui/activity/im/error/ImErrorPresenterImpl;->viewComponent:Lcom/ibotta/android/views/components/ViewComponent;

    .line 60
    iput-object p3, p0, Lcom/ibotta/android/mvp/ui/activity/im/error/ImErrorPresenterImpl;->reducer:Lcom/ibotta/android/mvp/ui/activity/im/error/ImErrorReducer;

    .line 61
    iput-object p4, p0, Lcom/ibotta/android/mvp/ui/activity/im/error/ImErrorPresenterImpl;->retailerHelper:Lcom/ibotta/api/helper/retailer/RetailerHelper;

    .line 62
    iput-object p5, p0, Lcom/ibotta/android/mvp/ui/activity/im/error/ImErrorPresenterImpl;->retailerParcelHelper:Lcom/ibotta/android/fragment/retailer/RetailerParcelHelper;

    .line 63
    iput-object p6, p0, Lcom/ibotta/android/mvp/ui/activity/im/error/ImErrorPresenterImpl;->userState:Lcom/ibotta/android/state/user/UserState;

    .line 64
    iput-object p7, p0, Lcom/ibotta/android/mvp/ui/activity/im/error/ImErrorPresenterImpl;->imUiUtil:Lcom/ibotta/android/mvp/ui/activity/im/ImUiUtil;

    .line 65
    iput-object p8, p0, Lcom/ibotta/android/mvp/ui/activity/im/error/ImErrorPresenterImpl;->cacheClearBatchApiJob:Lcom/ibotta/android/service/api/job/CacheClearBatchApiJob;

    return-void
.end method

.method private contactIbottaCare()V
    .locals 1

    .line 157
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/im/error/ImErrorPresenterImpl;->mvpView:Lcom/ibotta/android/mvp/base/MvpView;

    check-cast v0, Lcom/ibotta/android/mvp/ui/activity/im/error/ImErrorView;

    invoke-interface {v0}, Lcom/ibotta/android/mvp/ui/activity/im/error/ImErrorView;->showIbottaCareWebView()V

    return-void
.end method

.method private updateViewState()V
    .locals 3

    .line 169
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/im/error/ImErrorPresenterImpl;->reducer:Lcom/ibotta/android/mvp/ui/activity/im/error/ImErrorReducer;

    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/im/error/ImErrorPresenterImpl;->retailerParcel:Lcom/ibotta/android/fragment/retailer/RetailerParcel;

    iget-object v2, p0, Lcom/ibotta/android/mvp/ui/activity/im/error/ImErrorPresenterImpl;->customer:Lcom/ibotta/api/model/customer/Customer;

    invoke-virtual {v0, v1, v2}, Lcom/ibotta/android/mvp/ui/activity/im/error/ImErrorReducer;->create(Lcom/ibotta/android/fragment/retailer/RetailerParcel;Lcom/ibotta/api/model/customer/Customer;)Lcom/ibotta/android/mvp/ui/activity/im/error/ImErrorViewState;

    move-result-object v0

    .line 170
    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/im/error/ImErrorPresenterImpl;->viewComponent:Lcom/ibotta/android/views/components/ViewComponent;

    invoke-interface {v1, v0}, Lcom/ibotta/android/views/components/ViewComponent;->updateViewState(Lcom/ibotta/android/views/components/ViewState;)V

    return-void
.end method


# virtual methods
.method protected getFetchJobs()Ljava/util/Set;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Set<",
            "Lcom/ibotta/android/service/api/job/ApiJob;",
            ">;"
        }
    .end annotation

    .line 77
    new-instance v0, Ljava/util/HashSet;

    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    .line 79
    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/im/error/ImErrorPresenterImpl;->homeJob:Lcom/ibotta/android/service/api/job/HomeApiJob;

    if-nez v1, :cond_0

    .line 80
    new-instance v1, Lcom/ibotta/android/service/api/job/HomeApiJob;

    const/4 v2, 0x0

    invoke-direct {v1, v2}, Lcom/ibotta/android/service/api/job/HomeApiJob;-><init>(I)V

    iput-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/im/error/ImErrorPresenterImpl;->homeJob:Lcom/ibotta/android/service/api/job/HomeApiJob;

    .line 82
    :cond_0
    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/im/error/ImErrorPresenterImpl;->customerJob:Lcom/ibotta/android/service/api/job/SingleApiJob;

    if-nez v1, :cond_1

    .line 83
    new-instance v1, Lcom/ibotta/android/service/api/job/SingleApiJob;

    new-instance v2, Lcom/ibotta/api/call/customer/CustomerByIdCall;

    iget-object v3, p0, Lcom/ibotta/android/mvp/ui/activity/im/error/ImErrorPresenterImpl;->userState:Lcom/ibotta/android/state/user/UserState;

    invoke-interface {v3}, Lcom/ibotta/android/state/user/UserState;->getCustomerId()I

    move-result v3

    invoke-direct {v2, v3}, Lcom/ibotta/api/call/customer/CustomerByIdCall;-><init>(I)V

    invoke-direct {v1, v2}, Lcom/ibotta/android/service/api/job/SingleApiJob;-><init>(Lcom/ibotta/api/ApiCall;)V

    iput-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/im/error/ImErrorPresenterImpl;->customerJob:Lcom/ibotta/android/service/api/job/SingleApiJob;

    .line 86
    :cond_1
    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/im/error/ImErrorPresenterImpl;->homeJob:Lcom/ibotta/android/service/api/job/HomeApiJob;

    invoke-interface {v0, v1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 87
    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/im/error/ImErrorPresenterImpl;->customerJob:Lcom/ibotta/android/service/api/job/SingleApiJob;

    invoke-interface {v0, v1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    return-object v0
.end method

.method public getPersistedState()Ljava/lang/Object;
    .locals 1

    .line 143
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/im/error/ImErrorPresenterImpl;->persistedState:Lcom/ibotta/android/mvp/ui/activity/im/error/ImErrorPersistedState;

    return-object v0
.end method

.method protected onAbandonFetchJobs()V
    .locals 1

    const/4 v0, 0x0

    .line 94
    iput-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/im/error/ImErrorPresenterImpl;->homeJob:Lcom/ibotta/android/service/api/job/HomeApiJob;

    .line 95
    iput-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/im/error/ImErrorPresenterImpl;->customerJob:Lcom/ibotta/android/service/api/job/SingleApiJob;

    return-void
.end method

.method public onDisconnectConfirmTapped(I)V
    .locals 1

    .line 162
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/im/error/ImErrorPresenterImpl;->userState:Lcom/ibotta/android/state/user/UserState;

    .line 163
    invoke-interface {v0}, Lcom/ibotta/android/state/user/UserState;->getCustomerId()I

    move-result v0

    .line 162
    invoke-static {v0, p1}, Lcom/ibotta/api/call/customer/loyalty/CustomerLoyaltiesDeleteCall;->createImDeleteCall(II)Lcom/ibotta/api/call/customer/loyalty/CustomerLoyaltiesDeleteCall;

    move-result-object p1

    .line 165
    invoke-virtual {p0, p1}, Lcom/ibotta/android/mvp/ui/activity/im/error/ImErrorPresenterImpl;->submitApiCall(Lcom/ibotta/api/ApiCall;)V

    return-void
.end method

.method protected onFetchFinishedSuccessfully()V
    .locals 4

    .line 100
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/im/error/ImErrorPresenterImpl;->homeJob:Lcom/ibotta/android/service/api/job/HomeApiJob;

    if-nez v0, :cond_0

    .line 101
    sget-object v0, Lcom/ibotta/android/crash/IbottaCrashProxy;->IbottaCrashManager:Lcom/ibotta/android/crash/CrashManager;

    new-instance v1, Lcom/ibotta/android/mvp/ui/activity/find/IllegalApiJobStateException;

    const-string v2, "homeJob should not be null"

    invoke-direct {v1, v2}, Lcom/ibotta/android/mvp/ui/activity/find/IllegalApiJobStateException;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, v1}, Lcom/ibotta/android/crash/CrashManager;->trackException(Ljava/lang/Throwable;)V

    .line 102
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/im/error/ImErrorPresenterImpl;->mvpView:Lcom/ibotta/android/mvp/base/MvpView;

    check-cast v0, Lcom/ibotta/android/mvp/ui/activity/im/error/ImErrorView;

    invoke-interface {v0}, Lcom/ibotta/android/mvp/ui/activity/im/error/ImErrorView;->finish()V

    return-void

    .line 105
    :cond_0
    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/im/error/ImErrorPresenterImpl;->customerJob:Lcom/ibotta/android/service/api/job/SingleApiJob;

    if-nez v1, :cond_1

    .line 106
    sget-object v0, Lcom/ibotta/android/crash/IbottaCrashProxy;->IbottaCrashManager:Lcom/ibotta/android/crash/CrashManager;

    new-instance v1, Lcom/ibotta/android/mvp/ui/activity/find/IllegalApiJobStateException;

    const-string v2, "customerJob should not be null"

    invoke-direct {v1, v2}, Lcom/ibotta/android/mvp/ui/activity/find/IllegalApiJobStateException;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, v1}, Lcom/ibotta/android/crash/CrashManager;->trackException(Ljava/lang/Throwable;)V

    .line 107
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/im/error/ImErrorPresenterImpl;->mvpView:Lcom/ibotta/android/mvp/base/MvpView;

    check-cast v0, Lcom/ibotta/android/mvp/ui/activity/im/error/ImErrorView;

    invoke-interface {v0}, Lcom/ibotta/android/mvp/ui/activity/im/error/ImErrorView;->finish()V

    return-void

    .line 111
    :cond_1
    invoke-virtual {v0}, Lcom/ibotta/android/service/api/job/HomeApiJob;->getApiResponse()Lcom/ibotta/api/ApiResponse;

    move-result-object v0

    check-cast v0, Lcom/ibotta/api/call/home/HomeResponse;

    .line 112
    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/im/error/ImErrorPresenterImpl;->customerJob:Lcom/ibotta/android/service/api/job/SingleApiJob;

    invoke-virtual {v1}, Lcom/ibotta/android/service/api/job/SingleApiJob;->getApiResponse()Lcom/ibotta/api/ApiResponse;

    move-result-object v1

    check-cast v1, Lcom/ibotta/api/call/customer/CustomerByIdResponse;

    .line 114
    iget-object v2, p0, Lcom/ibotta/android/mvp/ui/activity/im/error/ImErrorPresenterImpl;->retailerHelper:Lcom/ibotta/api/helper/retailer/RetailerHelper;

    .line 115
    invoke-virtual {v0}, Lcom/ibotta/api/call/home/HomeResponse;->getRetailersAsModels()Ljava/util/List;

    move-result-object v0

    iget-object v3, p0, Lcom/ibotta/android/mvp/ui/activity/im/error/ImErrorPresenterImpl;->persistedState:Lcom/ibotta/android/mvp/ui/activity/im/error/ImErrorPersistedState;

    invoke-virtual {v3}, Lcom/ibotta/android/mvp/ui/activity/im/error/ImErrorPersistedState;->getRetailerId()I

    move-result v3

    .line 114
    invoke-interface {v2, v0, v3}, Lcom/ibotta/api/helper/retailer/RetailerHelper;->findRetailerById(Ljava/util/List;I)Lcom/ibotta/api/model/RetailerModel;

    move-result-object v0

    .line 116
    iget-object v2, p0, Lcom/ibotta/android/mvp/ui/activity/im/error/ImErrorPresenterImpl;->retailerParcelHelper:Lcom/ibotta/android/fragment/retailer/RetailerParcelHelper;

    invoke-interface {v2, v0}, Lcom/ibotta/android/fragment/retailer/RetailerParcelHelper;->toRetailerParcel(Lcom/ibotta/api/model/RetailerModel;)Lcom/ibotta/android/fragment/retailer/RetailerParcel;

    move-result-object v0

    iput-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/im/error/ImErrorPresenterImpl;->retailerParcel:Lcom/ibotta/android/fragment/retailer/RetailerParcel;

    .line 118
    invoke-virtual {v1}, Lcom/ibotta/api/call/customer/CustomerByIdResponse;->getCustomer()Lcom/ibotta/api/model/customer/Customer;

    move-result-object v0

    iput-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/im/error/ImErrorPresenterImpl;->customer:Lcom/ibotta/api/model/customer/Customer;

    .line 120
    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/activity/im/error/ImErrorPresenterImpl;->updateViewState()V

    return-void
.end method

.method public onGetHelpButtonTapped()V
    .locals 0

    .line 153
    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/activity/im/error/ImErrorPresenterImpl;->contactIbottaCare()V

    return-void
.end method

.method protected onSubmitJobSuccess(Lcom/ibotta/android/service/api/job/SingleApiJob;)V
    .locals 1

    .line 125
    invoke-super {p0, p1}, Lcom/ibotta/android/mvp/base/loading/AbstractLoadingMvpPresenter;->onSubmitJobSuccess(Lcom/ibotta/android/service/api/job/SingleApiJob;)V

    .line 127
    invoke-virtual {p1}, Lcom/ibotta/android/service/api/job/SingleApiJob;->getApiCall()Lcom/ibotta/api/ApiCall;

    move-result-object p1

    instance-of p1, p1, Lcom/ibotta/api/call/customer/loyalty/CustomerLoyaltiesDeleteCall;

    if-eqz p1, :cond_0

    .line 128
    iget-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/im/error/ImErrorPresenterImpl;->mvpView:Lcom/ibotta/android/mvp/base/MvpView;

    check-cast p1, Lcom/ibotta/android/mvp/ui/activity/im/error/ImErrorView;

    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/im/error/ImErrorPresenterImpl;->persistedState:Lcom/ibotta/android/mvp/ui/activity/im/error/ImErrorPersistedState;

    invoke-virtual {v0}, Lcom/ibotta/android/mvp/ui/activity/im/error/ImErrorPersistedState;->getRetailerId()I

    move-result v0

    invoke-interface {p1, v0}, Lcom/ibotta/android/mvp/ui/activity/im/error/ImErrorView;->showGallery(I)V

    .line 131
    iget-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/im/error/ImErrorPresenterImpl;->cacheClearBatchApiJob:Lcom/ibotta/android/service/api/job/CacheClearBatchApiJob;

    invoke-virtual {p1}, Lcom/ibotta/android/service/api/job/CacheClearBatchApiJob;->clear()V

    :cond_0
    return-void
.end method

.method public onSwitchBackToReceiptSubmissionTapped()V
    .locals 3

    .line 175
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/im/error/ImErrorPresenterImpl;->retailerParcel:Lcom/ibotta/android/fragment/retailer/RetailerParcel;

    if-nez v0, :cond_0

    .line 176
    sget-object v0, Lcom/ibotta/android/crash/IbottaCrashProxy;->IbottaCrashManager:Lcom/ibotta/android/crash/CrashManager;

    new-instance v1, Ljava/lang/IllegalStateException;

    const-string v2, "retailerParcel must not be null"

    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, v1}, Lcom/ibotta/android/crash/CrashManager;->trackException(Ljava/lang/Throwable;)V

    .line 177
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/im/error/ImErrorPresenterImpl;->mvpView:Lcom/ibotta/android/mvp/base/MvpView;

    check-cast v0, Lcom/ibotta/android/mvp/ui/activity/im/error/ImErrorView;

    invoke-interface {v0}, Lcom/ibotta/android/mvp/ui/activity/im/error/ImErrorView;->finish()V

    return-void

    .line 181
    :cond_0
    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/im/error/ImErrorPresenterImpl;->imUiUtil:Lcom/ibotta/android/mvp/ui/activity/im/ImUiUtil;

    invoke-virtual {v0}, Lcom/ibotta/android/fragment/retailer/RetailerParcel;->getId()I

    move-result v0

    iget-object v2, p0, Lcom/ibotta/android/mvp/ui/activity/im/error/ImErrorPresenterImpl;->retailerParcel:Lcom/ibotta/android/fragment/retailer/RetailerParcel;

    invoke-virtual {v2}, Lcom/ibotta/android/fragment/retailer/RetailerParcel;->getName()Ljava/lang/String;

    move-result-object v2

    invoke-interface {v1, v0, v2}, Lcom/ibotta/android/mvp/ui/activity/im/ImUiUtil;->showAreYouSureDialog(ILjava/lang/String;)V

    return-void
.end method

.method public onTryAgainButtonTapped()V
    .locals 2

    .line 148
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/im/error/ImErrorPresenterImpl;->mvpView:Lcom/ibotta/android/mvp/base/MvpView;

    check-cast v0, Lcom/ibotta/android/mvp/ui/activity/im/error/ImErrorView;

    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/im/error/ImErrorPresenterImpl;->persistedState:Lcom/ibotta/android/mvp/ui/activity/im/error/ImErrorPersistedState;

    invoke-virtual {v1}, Lcom/ibotta/android/mvp/ui/activity/im/error/ImErrorPersistedState;->getRetailerId()I

    move-result v1

    invoke-interface {v0, v1}, Lcom/ibotta/android/mvp/ui/activity/im/error/ImErrorView;->showLogin(I)V

    return-void
.end method

.method public onViewsBound()V
    .locals 1

    .line 70
    invoke-super {p0}, Lcom/ibotta/android/mvp/base/loading/AbstractLoadingMvpPresenter;->onViewsBound()V

    .line 71
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/im/error/ImErrorPresenterImpl;->viewComponent:Lcom/ibotta/android/views/components/ViewComponent;

    invoke-interface {v0, p0}, Lcom/ibotta/android/views/components/ViewComponent;->bindViewEvents(Lcom/ibotta/android/views/components/ViewEvents;)V

    .line 72
    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/activity/im/error/ImErrorPresenterImpl;->updateViewState()V

    return-void
.end method

.method public setPersistedState(Ljava/lang/Object;)V
    .locals 0

    .line 137
    invoke-super {p0, p1}, Lcom/ibotta/android/mvp/base/loading/AbstractLoadingMvpPresenter;->setPersistedState(Ljava/lang/Object;)V

    .line 138
    check-cast p1, Lcom/ibotta/android/mvp/ui/activity/im/error/ImErrorPersistedState;

    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/im/error/ImErrorPresenterImpl;->persistedState:Lcom/ibotta/android/mvp/ui/activity/im/error/ImErrorPersistedState;

    return-void
.end method
