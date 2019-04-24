.class public Lcom/ibotta/android/mvp/ui/activity/im/terms/ImTermsPresenterImpl;
.super Lcom/ibotta/android/mvp/base/loading/AbstractLoadingMvpPresenter;
.source "ImTermsPresenterImpl.java"

# interfaces
.implements Lcom/ibotta/android/aop/tracking/advice/ImSharePurchaseHistoryAdviceFields;
.implements Lcom/ibotta/android/mvp/ui/activity/im/terms/ImTermsPresenter;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/ibotta/android/mvp/base/loading/AbstractLoadingMvpPresenter<",
        "Lcom/ibotta/android/mvp/ui/activity/im/terms/ImTermsView;",
        ">;",
        "Lcom/ibotta/android/aop/tracking/advice/ImSharePurchaseHistoryAdviceFields;",
        "Lcom/ibotta/android/mvp/ui/activity/im/terms/ImTermsPresenter;"
    }
.end annotation


# static fields
.field private static final synthetic ajc$tjp_0:Lorg/aspectj/lang/JoinPoint$StaticPart;


# instance fields
.field private final cacheClearFactory:Lcom/ibotta/android/service/api/job/CacheClearJobFactory;

.field private homeJob:Lcom/ibotta/android/service/api/job/HomeApiJob;
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation
.end field

.field private isChecked:Z

.field private persistedState:Lcom/ibotta/android/mvp/ui/activity/im/terms/ImTermsPersistedState;

.field private final reducer:Lcom/ibotta/android/mvp/ui/activity/im/terms/ImTermsReducer;

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
            "Lcom/ibotta/android/mvp/ui/activity/im/terms/ImTermsViewState;",
            "Lcom/ibotta/android/mvp/ui/activity/im/terms/ImTermsViewEvents;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 0

    .line 1
    invoke-static {}, Lcom/ibotta/android/mvp/ui/activity/im/terms/ImTermsPresenterImpl;->ajc$preClinit()V

    return-void
.end method

.method public constructor <init>(Lcom/ibotta/android/mvp/base/MvpPresenterActions;Lcom/ibotta/android/views/components/ViewComponent;Lcom/ibotta/android/mvp/ui/activity/im/terms/ImTermsReducer;Lcom/ibotta/api/helper/retailer/RetailerHelper;Lcom/ibotta/android/fragment/retailer/RetailerParcelHelper;Lcom/ibotta/android/state/user/UserState;Lcom/ibotta/android/service/api/job/CacheClearJobFactory;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/ibotta/android/mvp/base/MvpPresenterActions;",
            "Lcom/ibotta/android/views/components/ViewComponent<",
            "Lcom/ibotta/android/mvp/ui/activity/im/terms/ImTermsViewState;",
            "Lcom/ibotta/android/mvp/ui/activity/im/terms/ImTermsViewEvents;",
            ">;",
            "Lcom/ibotta/android/mvp/ui/activity/im/terms/ImTermsReducer;",
            "Lcom/ibotta/api/helper/retailer/RetailerHelper;",
            "Lcom/ibotta/android/fragment/retailer/RetailerParcelHelper;",
            "Lcom/ibotta/android/state/user/UserState;",
            "Lcom/ibotta/android/service/api/job/CacheClearJobFactory;",
            ")V"
        }
    .end annotation

    .line 54
    invoke-direct {p0, p1}, Lcom/ibotta/android/mvp/base/loading/AbstractLoadingMvpPresenter;-><init>(Lcom/ibotta/android/mvp/base/MvpPresenterActions;)V

    const/4 p1, 0x1

    .line 43
    iput-boolean p1, p0, Lcom/ibotta/android/mvp/ui/activity/im/terms/ImTermsPresenterImpl;->isChecked:Z

    .line 55
    iput-object p2, p0, Lcom/ibotta/android/mvp/ui/activity/im/terms/ImTermsPresenterImpl;->viewComponent:Lcom/ibotta/android/views/components/ViewComponent;

    .line 56
    iput-object p3, p0, Lcom/ibotta/android/mvp/ui/activity/im/terms/ImTermsPresenterImpl;->reducer:Lcom/ibotta/android/mvp/ui/activity/im/terms/ImTermsReducer;

    .line 57
    iput-object p4, p0, Lcom/ibotta/android/mvp/ui/activity/im/terms/ImTermsPresenterImpl;->retailerHelper:Lcom/ibotta/api/helper/retailer/RetailerHelper;

    .line 58
    iput-object p5, p0, Lcom/ibotta/android/mvp/ui/activity/im/terms/ImTermsPresenterImpl;->retailerParcelHelper:Lcom/ibotta/android/fragment/retailer/RetailerParcelHelper;

    .line 59
    iput-object p6, p0, Lcom/ibotta/android/mvp/ui/activity/im/terms/ImTermsPresenterImpl;->userState:Lcom/ibotta/android/state/user/UserState;

    .line 60
    iput-object p7, p0, Lcom/ibotta/android/mvp/ui/activity/im/terms/ImTermsPresenterImpl;->cacheClearFactory:Lcom/ibotta/android/service/api/job/CacheClearJobFactory;

    return-void
.end method

.method private static synthetic ajc$preClinit()V
    .locals 10

    .line 1
    new-instance v8, Lorg/aspectj/runtime/reflect/Factory;

    const-string v0, "ImTermsPresenterImpl.java"

    const-class v1, Lcom/ibotta/android/mvp/ui/activity/im/terms/ImTermsPresenterImpl;

    invoke-direct {v8, v0, v1}, Lorg/aspectj/runtime/reflect/Factory;-><init>(Ljava/lang/String;Ljava/lang/Class;)V

    const-string v9, "method-execution"

    const-string v1, "1"

    const-string v2, "onConnectButtonTapped"

    const-string v3, "com.ibotta.android.mvp.ui.activity.im.terms.ImTermsPresenterImpl"

    const-string v4, ""

    const-string v5, ""

    const-string v6, ""

    const-string v7, "void"

    move-object v0, v8

    invoke-virtual/range {v0 .. v7}, Lorg/aspectj/runtime/reflect/Factory;->makeMethodSig(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lorg/aspectj/lang/reflect/MethodSignature;

    move-result-object v0

    const/16 v1, 0x82

    invoke-virtual {v8, v9, v0, v1}, Lorg/aspectj/runtime/reflect/Factory;->makeSJP(Ljava/lang/String;Lorg/aspectj/lang/Signature;I)Lorg/aspectj/lang/JoinPoint$StaticPart;

    move-result-object v0

    sput-object v0, Lcom/ibotta/android/mvp/ui/activity/im/terms/ImTermsPresenterImpl;->ajc$tjp_0:Lorg/aspectj/lang/JoinPoint$StaticPart;

    return-void
.end method

.method private connectImAccount()V
    .locals 3

    .line 139
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/im/terms/ImTermsPresenterImpl;->retailerParcel:Lcom/ibotta/android/fragment/retailer/RetailerParcel;

    if-nez v0, :cond_0

    .line 140
    sget-object v0, Lcom/ibotta/android/crash/IbottaCrashProxy;->IbottaCrashManager:Lcom/ibotta/android/crash/CrashManager;

    new-instance v1, Lcom/ibotta/android/mvp/ui/activity/find/IllegalApiJobStateException;

    const-string v2, "retailerParcel must not be null"

    invoke-direct {v1, v2}, Lcom/ibotta/android/mvp/ui/activity/find/IllegalApiJobStateException;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, v1}, Lcom/ibotta/android/crash/CrashManager;->trackException(Ljava/lang/Throwable;)V

    return-void

    .line 144
    :cond_0
    new-instance v0, Lcom/ibotta/api/call/customer/loyalty/CustomerLoyaltiesPostCall$CallParams;

    invoke-direct {v0}, Lcom/ibotta/api/call/customer/loyalty/CustomerLoyaltiesPostCall$CallParams;-><init>()V

    .line 145
    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/im/terms/ImTermsPresenterImpl;->userState:Lcom/ibotta/android/state/user/UserState;

    invoke-interface {v1}, Lcom/ibotta/android/state/user/UserState;->getCustomerId()I

    move-result v1

    invoke-virtual {v0, v1}, Lcom/ibotta/api/call/customer/loyalty/CustomerLoyaltiesPostCall$CallParams;->setCustomerId(I)V

    .line 146
    sget-object v1, Lcom/ibotta/api/model/customer/CustomerLoyalty$EntryType;->AUXILIARY:Lcom/ibotta/api/model/customer/CustomerLoyalty$EntryType;

    invoke-virtual {v0, v1}, Lcom/ibotta/api/call/customer/loyalty/CustomerLoyaltiesPostCall$CallParams;->setType(Lcom/ibotta/api/model/customer/CustomerLoyalty$EntryType;)V

    .line 147
    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/im/terms/ImTermsPresenterImpl;->retailerParcel:Lcom/ibotta/android/fragment/retailer/RetailerParcel;

    invoke-virtual {v1}, Lcom/ibotta/android/fragment/retailer/RetailerParcel;->getId()I

    move-result v1

    invoke-virtual {v0, v1}, Lcom/ibotta/api/call/customer/loyalty/CustomerLoyaltiesPostCall$CallParams;->setRetailerId(I)V

    .line 148
    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/im/terms/ImTermsPresenterImpl;->persistedState:Lcom/ibotta/android/mvp/ui/activity/im/terms/ImTermsPersistedState;

    invoke-virtual {v1}, Lcom/ibotta/android/mvp/ui/activity/im/terms/ImTermsPersistedState;->getImLoginParcel()Lcom/ibotta/android/mvp/ui/activity/im/login/ImLoginParcel;

    move-result-object v1

    invoke-virtual {v1}, Lcom/ibotta/android/mvp/ui/activity/im/login/ImLoginParcel;->getUserName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/ibotta/api/call/customer/loyalty/CustomerLoyaltiesPostCall$CallParams;->setRetailerUsername(Ljava/lang/String;)V

    .line 149
    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/im/terms/ImTermsPresenterImpl;->persistedState:Lcom/ibotta/android/mvp/ui/activity/im/terms/ImTermsPersistedState;

    invoke-virtual {v1}, Lcom/ibotta/android/mvp/ui/activity/im/terms/ImTermsPersistedState;->getImLoginParcel()Lcom/ibotta/android/mvp/ui/activity/im/login/ImLoginParcel;

    move-result-object v1

    invoke-virtual {v1}, Lcom/ibotta/android/mvp/ui/activity/im/login/ImLoginParcel;->getPassword()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/ibotta/api/call/customer/loyalty/CustomerLoyaltiesPostCall$CallParams;->setRetailerPassword(Ljava/lang/String;)V

    .line 150
    iget-boolean v1, p0, Lcom/ibotta/android/mvp/ui/activity/im/terms/ImTermsPresenterImpl;->isChecked:Z

    invoke-virtual {v0, v1}, Lcom/ibotta/api/call/customer/loyalty/CustomerLoyaltiesPostCall$CallParams;->setShareHistory(Z)V

    .line 152
    new-instance v1, Lcom/ibotta/api/call/customer/loyalty/CustomerLoyaltiesPostCall;

    invoke-direct {v1, v0}, Lcom/ibotta/api/call/customer/loyalty/CustomerLoyaltiesPostCall;-><init>(Lcom/ibotta/api/call/customer/loyalty/CustomerLoyaltiesPostCall$CallParams;)V

    .line 153
    invoke-virtual {p0, v1}, Lcom/ibotta/android/mvp/ui/activity/im/terms/ImTermsPresenterImpl;->submitApiCall(Lcom/ibotta/api/ApiCall;)V

    return-void
.end method

.method private updateViewState()V
    .locals 2

    .line 157
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/im/terms/ImTermsPresenterImpl;->reducer:Lcom/ibotta/android/mvp/ui/activity/im/terms/ImTermsReducer;

    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/im/terms/ImTermsPresenterImpl;->retailerParcel:Lcom/ibotta/android/fragment/retailer/RetailerParcel;

    invoke-virtual {v0, v1}, Lcom/ibotta/android/mvp/ui/activity/im/terms/ImTermsReducer;->create(Lcom/ibotta/android/fragment/retailer/RetailerParcel;)Lcom/ibotta/android/mvp/ui/activity/im/terms/ImTermsViewState;

    move-result-object v0

    .line 158
    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/im/terms/ImTermsPresenterImpl;->viewComponent:Lcom/ibotta/android/views/components/ViewComponent;

    invoke-interface {v1, v0}, Lcom/ibotta/android/views/components/ViewComponent;->updateViewState(Lcom/ibotta/android/views/components/ViewState;)V

    return-void
.end method


# virtual methods
.method protected getFetchJobs()Ljava/util/Set;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Set<",
            "Lcom/ibotta/android/service/api/job/ApiJob;",
            ">;"
        }
    .end annotation

    .line 72
    new-instance v0, Ljava/util/HashSet;

    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    .line 74
    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/im/terms/ImTermsPresenterImpl;->homeJob:Lcom/ibotta/android/service/api/job/HomeApiJob;

    if-nez v1, :cond_0

    .line 75
    new-instance v1, Lcom/ibotta/android/service/api/job/HomeApiJob;

    const/4 v2, 0x0

    invoke-direct {v1, v2}, Lcom/ibotta/android/service/api/job/HomeApiJob;-><init>(I)V

    iput-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/im/terms/ImTermsPresenterImpl;->homeJob:Lcom/ibotta/android/service/api/job/HomeApiJob;

    .line 78
    :cond_0
    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/im/terms/ImTermsPresenterImpl;->homeJob:Lcom/ibotta/android/service/api/job/HomeApiJob;

    invoke-interface {v0, v1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    return-object v0
.end method

.method public getPersistedState()Ljava/lang/Object;
    .locals 1

    .line 125
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/im/terms/ImTermsPresenterImpl;->persistedState:Lcom/ibotta/android/mvp/ui/activity/im/terms/ImTermsPersistedState;

    return-object v0
.end method

.method public getRetailerId()I
    .locals 1

    .line 163
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/im/terms/ImTermsPresenterImpl;->persistedState:Lcom/ibotta/android/mvp/ui/activity/im/terms/ImTermsPersistedState;

    invoke-virtual {v0}, Lcom/ibotta/android/mvp/ui/activity/im/terms/ImTermsPersistedState;->getRetailerId()I

    move-result v0

    return v0
.end method

.method protected onAbandonFetchJobs()V
    .locals 1

    const/4 v0, 0x0

    .line 85
    iput-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/im/terms/ImTermsPresenterImpl;->homeJob:Lcom/ibotta/android/service/api/job/HomeApiJob;

    return-void
.end method

.method public onConnectButtonTapped()V
    .locals 3
    .annotation runtime Lcom/ibotta/android/aop/tracking/TrackingAfter;
        value = .enum Lcom/ibotta/android/aop/tracking/TrackingType;->IM_SHARE_HISTORY:Lcom/ibotta/android/aop/tracking/TrackingType;
    .end annotation

    sget-object v0, Lcom/ibotta/android/mvp/ui/activity/im/terms/ImTermsPresenterImpl;->ajc$tjp_0:Lorg/aspectj/lang/JoinPoint$StaticPart;

    invoke-static {v0, p0, p0}, Lorg/aspectj/runtime/reflect/Factory;->makeJP(Lorg/aspectj/lang/JoinPoint$StaticPart;Ljava/lang/Object;Ljava/lang/Object;)Lorg/aspectj/lang/JoinPoint;

    move-result-object v0

    .line 130
    :try_start_0
    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/activity/im/terms/ImTermsPresenterImpl;->connectImAccount()V
    :try_end_0
    .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0

    .line 131
    invoke-static {}, Lcom/ibotta/android/aop/tracking/TrackingAspect;->aspectOf()Lcom/ibotta/android/aop/tracking/TrackingAspect;

    move-result-object v1

    invoke-virtual {v1, v0}, Lcom/ibotta/android/aop/tracking/TrackingAspect;->after(Lorg/aspectj/lang/JoinPoint;)V

    return-void

    :catch_0
    move-exception v1

    invoke-static {}, Lcom/ibotta/android/aop/tracking/TrackingAspect;->aspectOf()Lcom/ibotta/android/aop/tracking/TrackingAspect;

    move-result-object v2

    invoke-virtual {v2, v0}, Lcom/ibotta/android/aop/tracking/TrackingAspect;->after(Lorg/aspectj/lang/JoinPoint;)V

    throw v1
.end method

.method protected onFetchFinishedSuccessfully()V
    .locals 3

    .line 90
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/im/terms/ImTermsPresenterImpl;->homeJob:Lcom/ibotta/android/service/api/job/HomeApiJob;

    if-nez v0, :cond_0

    .line 91
    sget-object v0, Lcom/ibotta/android/crash/IbottaCrashProxy;->IbottaCrashManager:Lcom/ibotta/android/crash/CrashManager;

    new-instance v1, Lcom/ibotta/android/mvp/ui/activity/find/IllegalApiJobStateException;

    const-string v2, "homeJob should not be null"

    invoke-direct {v1, v2}, Lcom/ibotta/android/mvp/ui/activity/find/IllegalApiJobStateException;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, v1}, Lcom/ibotta/android/crash/CrashManager;->trackException(Ljava/lang/Throwable;)V

    .line 92
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/im/terms/ImTermsPresenterImpl;->mvpView:Lcom/ibotta/android/mvp/base/MvpView;

    check-cast v0, Lcom/ibotta/android/mvp/ui/activity/im/terms/ImTermsView;

    invoke-interface {v0}, Lcom/ibotta/android/mvp/ui/activity/im/terms/ImTermsView;->finish()V

    return-void

    .line 96
    :cond_0
    invoke-virtual {v0}, Lcom/ibotta/android/service/api/job/HomeApiJob;->getApiResponse()Lcom/ibotta/api/ApiResponse;

    move-result-object v0

    check-cast v0, Lcom/ibotta/api/call/home/HomeResponse;

    .line 98
    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/im/terms/ImTermsPresenterImpl;->retailerHelper:Lcom/ibotta/api/helper/retailer/RetailerHelper;

    .line 99
    invoke-virtual {v0}, Lcom/ibotta/api/call/home/HomeResponse;->getRetailersAsModels()Ljava/util/List;

    move-result-object v0

    iget-object v2, p0, Lcom/ibotta/android/mvp/ui/activity/im/terms/ImTermsPresenterImpl;->persistedState:Lcom/ibotta/android/mvp/ui/activity/im/terms/ImTermsPersistedState;

    invoke-virtual {v2}, Lcom/ibotta/android/mvp/ui/activity/im/terms/ImTermsPersistedState;->getRetailerId()I

    move-result v2

    .line 98
    invoke-interface {v1, v0, v2}, Lcom/ibotta/api/helper/retailer/RetailerHelper;->findRetailerById(Ljava/util/List;I)Lcom/ibotta/api/model/RetailerModel;

    move-result-object v0

    .line 100
    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/im/terms/ImTermsPresenterImpl;->retailerParcelHelper:Lcom/ibotta/android/fragment/retailer/RetailerParcelHelper;

    invoke-interface {v1, v0}, Lcom/ibotta/android/fragment/retailer/RetailerParcelHelper;->toRetailerParcel(Lcom/ibotta/api/model/RetailerModel;)Lcom/ibotta/android/fragment/retailer/RetailerParcel;

    move-result-object v0

    iput-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/im/terms/ImTermsPresenterImpl;->retailerParcel:Lcom/ibotta/android/fragment/retailer/RetailerParcel;

    .line 102
    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/activity/im/terms/ImTermsPresenterImpl;->updateViewState()V

    return-void
.end method

.method public onSharedToggled(Z)V
    .locals 0

    .line 135
    iput-boolean p1, p0, Lcom/ibotta/android/mvp/ui/activity/im/terms/ImTermsPresenterImpl;->isChecked:Z

    return-void
.end method

.method protected onSubmitJobSuccess(Lcom/ibotta/android/service/api/job/SingleApiJob;)V
    .locals 1

    .line 107
    invoke-super {p0, p1}, Lcom/ibotta/android/mvp/base/loading/AbstractLoadingMvpPresenter;->onSubmitJobSuccess(Lcom/ibotta/android/service/api/job/SingleApiJob;)V

    .line 109
    invoke-virtual {p1}, Lcom/ibotta/android/service/api/job/SingleApiJob;->getApiCall()Lcom/ibotta/api/ApiCall;

    move-result-object p1

    instance-of p1, p1, Lcom/ibotta/api/call/customer/loyalty/CustomerLoyaltiesPostCall;

    if-eqz p1, :cond_0

    .line 110
    iget-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/im/terms/ImTermsPresenterImpl;->mvpView:Lcom/ibotta/android/mvp/base/MvpView;

    check-cast p1, Lcom/ibotta/android/mvp/ui/activity/im/terms/ImTermsView;

    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/im/terms/ImTermsPresenterImpl;->persistedState:Lcom/ibotta/android/mvp/ui/activity/im/terms/ImTermsPersistedState;

    invoke-virtual {v0}, Lcom/ibotta/android/mvp/ui/activity/im/terms/ImTermsPersistedState;->getRetailerId()I

    move-result v0

    invoke-interface {p1, v0}, Lcom/ibotta/android/mvp/ui/activity/im/terms/ImTermsView;->showGallery(I)V

    .line 113
    iget-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/im/terms/ImTermsPresenterImpl;->cacheClearFactory:Lcom/ibotta/android/service/api/job/CacheClearJobFactory;

    invoke-virtual {p1}, Lcom/ibotta/android/service/api/job/CacheClearJobFactory;->create()Lcom/ibotta/android/service/api/job/CacheClearBatchApiJob;

    move-result-object p1

    const/4 v0, 0x1

    invoke-virtual {p1, v0}, Lcom/ibotta/android/service/api/job/CacheClearBatchApiJob;->clearCustomer(Z)Lcom/ibotta/android/service/api/job/CacheClearBatchApiJob;

    move-result-object p1

    invoke-virtual {p1}, Lcom/ibotta/android/service/api/job/CacheClearBatchApiJob;->clear()V

    :cond_0
    return-void
.end method

.method public onViewsBound()V
    .locals 1

    .line 65
    invoke-super {p0}, Lcom/ibotta/android/mvp/base/loading/AbstractLoadingMvpPresenter;->onViewsBound()V

    .line 66
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/im/terms/ImTermsPresenterImpl;->viewComponent:Lcom/ibotta/android/views/components/ViewComponent;

    invoke-interface {v0, p0}, Lcom/ibotta/android/views/components/ViewComponent;->bindViewEvents(Lcom/ibotta/android/views/components/ViewEvents;)V

    .line 67
    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/activity/im/terms/ImTermsPresenterImpl;->updateViewState()V

    return-void
.end method

.method public setPersistedState(Ljava/lang/Object;)V
    .locals 0

    .line 119
    invoke-super {p0, p1}, Lcom/ibotta/android/mvp/base/loading/AbstractLoadingMvpPresenter;->setPersistedState(Ljava/lang/Object;)V

    .line 120
    check-cast p1, Lcom/ibotta/android/mvp/ui/activity/im/terms/ImTermsPersistedState;

    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/im/terms/ImTermsPresenterImpl;->persistedState:Lcom/ibotta/android/mvp/ui/activity/im/terms/ImTermsPersistedState;

    return-void
.end method

.method public sharedHistory()Z
    .locals 1

    .line 168
    iget-boolean v0, p0, Lcom/ibotta/android/mvp/ui/activity/im/terms/ImTermsPresenterImpl;->isChecked:Z

    return v0
.end method
