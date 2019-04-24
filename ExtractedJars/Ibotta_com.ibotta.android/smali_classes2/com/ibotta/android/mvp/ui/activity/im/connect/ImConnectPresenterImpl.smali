.class public Lcom/ibotta/android/mvp/ui/activity/im/connect/ImConnectPresenterImpl;
.super Lcom/ibotta/android/mvp/base/loading/AbstractLoadingMvpPresenter;
.source "ImConnectPresenterImpl.java"

# interfaces
.implements Lcom/ibotta/android/aop/tracking/advice/RetailerAdviceField;
.implements Lcom/ibotta/android/mvp/ui/activity/im/connect/ImConnectPresenter;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/ibotta/android/mvp/base/loading/AbstractLoadingMvpPresenter<",
        "Lcom/ibotta/android/mvp/ui/activity/im/connect/ImConnectView;",
        ">;",
        "Lcom/ibotta/android/aop/tracking/advice/RetailerAdviceField;",
        "Lcom/ibotta/android/mvp/ui/activity/im/connect/ImConnectPresenter;"
    }
.end annotation


# static fields
.field private static final synthetic ajc$tjp_0:Lorg/aspectj/lang/JoinPoint$StaticPart;


# instance fields
.field private final appConfig:Lcom/ibotta/android/state/app/config/AppConfig;

.field private homeJob:Lcom/ibotta/android/service/api/job/HomeApiJob;
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation
.end field

.field private final reducer:Lcom/ibotta/android/mvp/ui/activity/im/connect/ImConnectReducer;

.field private final retailerHelper:Lcom/ibotta/api/helper/retailer/RetailerHelper;

.field private retailerId:I

.field private retailerParcel:Lcom/ibotta/android/fragment/retailer/RetailerParcel;
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation
.end field

.field private final retailerParcelHelper:Lcom/ibotta/android/fragment/retailer/RetailerParcelHelper;

.field private final viewComponent:Lcom/ibotta/android/views/components/ViewComponent;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/ibotta/android/views/components/ViewComponent<",
            "Lcom/ibotta/android/mvp/ui/activity/im/connect/ImConnectViewState;",
            "Lcom/ibotta/android/mvp/ui/activity/im/connect/ImConnectViewEvents;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 0

    .line 1
    invoke-static {}, Lcom/ibotta/android/mvp/ui/activity/im/connect/ImConnectPresenterImpl;->ajc$preClinit()V

    return-void
.end method

.method public constructor <init>(Lcom/ibotta/android/mvp/base/MvpPresenterActions;Lcom/ibotta/android/views/components/ViewComponent;Lcom/ibotta/android/state/app/config/AppConfig;Lcom/ibotta/android/mvp/ui/activity/im/connect/ImConnectReducer;Lcom/ibotta/api/helper/retailer/RetailerHelper;Lcom/ibotta/android/fragment/retailer/RetailerParcelHelper;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/ibotta/android/mvp/base/MvpPresenterActions;",
            "Lcom/ibotta/android/views/components/ViewComponent<",
            "Lcom/ibotta/android/mvp/ui/activity/im/connect/ImConnectViewState;",
            "Lcom/ibotta/android/mvp/ui/activity/im/connect/ImConnectViewEvents;",
            ">;",
            "Lcom/ibotta/android/state/app/config/AppConfig;",
            "Lcom/ibotta/android/mvp/ui/activity/im/connect/ImConnectReducer;",
            "Lcom/ibotta/api/helper/retailer/RetailerHelper;",
            "Lcom/ibotta/android/fragment/retailer/RetailerParcelHelper;",
            ")V"
        }
    .end annotation

    .line 46
    invoke-direct {p0, p1}, Lcom/ibotta/android/mvp/base/loading/AbstractLoadingMvpPresenter;-><init>(Lcom/ibotta/android/mvp/base/MvpPresenterActions;)V

    .line 47
    iput-object p2, p0, Lcom/ibotta/android/mvp/ui/activity/im/connect/ImConnectPresenterImpl;->viewComponent:Lcom/ibotta/android/views/components/ViewComponent;

    .line 48
    iput-object p3, p0, Lcom/ibotta/android/mvp/ui/activity/im/connect/ImConnectPresenterImpl;->appConfig:Lcom/ibotta/android/state/app/config/AppConfig;

    .line 49
    iput-object p4, p0, Lcom/ibotta/android/mvp/ui/activity/im/connect/ImConnectPresenterImpl;->reducer:Lcom/ibotta/android/mvp/ui/activity/im/connect/ImConnectReducer;

    .line 50
    iput-object p5, p0, Lcom/ibotta/android/mvp/ui/activity/im/connect/ImConnectPresenterImpl;->retailerHelper:Lcom/ibotta/api/helper/retailer/RetailerHelper;

    .line 51
    iput-object p6, p0, Lcom/ibotta/android/mvp/ui/activity/im/connect/ImConnectPresenterImpl;->retailerParcelHelper:Lcom/ibotta/android/fragment/retailer/RetailerParcelHelper;

    return-void
.end method

.method private accountCreationEnabledForRetailer(Lcom/ibotta/android/fragment/retailer/RetailerParcel;)Z
    .locals 2
    .param p1    # Lcom/ibotta/android/fragment/retailer/RetailerParcel;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param

    const/4 v0, 0x1

    if-eqz p1, :cond_0

    .line 118
    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/im/connect/ImConnectPresenterImpl;->appConfig:Lcom/ibotta/android/state/app/config/AppConfig;

    invoke-interface {v1}, Lcom/ibotta/android/state/app/config/AppConfig;->getAccountCreationDisabledRetailers()Ljava/util/ArrayList;

    move-result-object v1

    invoke-virtual {p1}, Lcom/ibotta/android/fragment/retailer/RetailerParcel;->getId()I

    move-result p1

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-virtual {v1, p1}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    move-result p1

    xor-int/2addr v0, p1

    :cond_0
    return v0
.end method

.method private static synthetic ajc$preClinit()V
    .locals 10

    .line 1
    new-instance v8, Lorg/aspectj/runtime/reflect/Factory;

    const-string v0, "ImConnectPresenterImpl.java"

    const-class v1, Lcom/ibotta/android/mvp/ui/activity/im/connect/ImConnectPresenterImpl;

    invoke-direct {v8, v0, v1}, Lorg/aspectj/runtime/reflect/Factory;-><init>(Ljava/lang/String;Ljava/lang/Class;)V

    const-string v9, "method-execution"

    const-string v1, "1"

    const-string v2, "onImAccountLoginClicked"

    const-string v3, "com.ibotta.android.mvp.ui.activity.im.connect.ImConnectPresenterImpl"

    const-string v4, ""

    const-string v5, ""

    const-string v6, ""

    const-string v7, "void"

    move-object v0, v8

    invoke-virtual/range {v0 .. v7}, Lorg/aspectj/runtime/reflect/Factory;->makeMethodSig(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lorg/aspectj/lang/reflect/MethodSignature;

    move-result-object v0

    const/16 v1, 0x6a

    invoke-virtual {v8, v9, v0, v1}, Lorg/aspectj/runtime/reflect/Factory;->makeSJP(Ljava/lang/String;Lorg/aspectj/lang/Signature;I)Lorg/aspectj/lang/JoinPoint$StaticPart;

    move-result-object v0

    sput-object v0, Lcom/ibotta/android/mvp/ui/activity/im/connect/ImConnectPresenterImpl;->ajc$tjp_0:Lorg/aspectj/lang/JoinPoint$StaticPart;

    return-void
.end method

.method private updateViewState()V
    .locals 3

    .line 110
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/im/connect/ImConnectPresenterImpl;->retailerParcel:Lcom/ibotta/android/fragment/retailer/RetailerParcel;

    invoke-direct {p0, v0}, Lcom/ibotta/android/mvp/ui/activity/im/connect/ImConnectPresenterImpl;->accountCreationEnabledForRetailer(Lcom/ibotta/android/fragment/retailer/RetailerParcel;)Z

    move-result v0

    .line 111
    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/im/connect/ImConnectPresenterImpl;->reducer:Lcom/ibotta/android/mvp/ui/activity/im/connect/ImConnectReducer;

    iget-object v2, p0, Lcom/ibotta/android/mvp/ui/activity/im/connect/ImConnectPresenterImpl;->retailerParcel:Lcom/ibotta/android/fragment/retailer/RetailerParcel;

    invoke-virtual {v1, v2, v0}, Lcom/ibotta/android/mvp/ui/activity/im/connect/ImConnectReducer;->create(Lcom/ibotta/android/fragment/retailer/RetailerParcel;Z)Lcom/ibotta/android/mvp/ui/activity/im/connect/ImConnectViewState;

    move-result-object v0

    .line 112
    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/im/connect/ImConnectPresenterImpl;->viewComponent:Lcom/ibotta/android/views/components/ViewComponent;

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

    .line 63
    new-instance v0, Ljava/util/HashSet;

    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    .line 65
    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/im/connect/ImConnectPresenterImpl;->homeJob:Lcom/ibotta/android/service/api/job/HomeApiJob;

    if-nez v1, :cond_0

    .line 66
    new-instance v1, Lcom/ibotta/android/service/api/job/HomeApiJob;

    const/4 v2, 0x0

    invoke-direct {v1, v2}, Lcom/ibotta/android/service/api/job/HomeApiJob;-><init>(I)V

    iput-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/im/connect/ImConnectPresenterImpl;->homeJob:Lcom/ibotta/android/service/api/job/HomeApiJob;

    .line 69
    :cond_0
    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/im/connect/ImConnectPresenterImpl;->homeJob:Lcom/ibotta/android/service/api/job/HomeApiJob;

    invoke-interface {v0, v1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    return-object v0
.end method

.method public getRetailerIdForTracking()Ljava/lang/Integer;
    .locals 1
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation

    .line 130
    iget v0, p0, Lcom/ibotta/android/mvp/ui/activity/im/connect/ImConnectPresenterImpl;->retailerId:I

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    return-object v0
.end method

.method protected onAbandonFetchJobs()V
    .locals 1

    const/4 v0, 0x0

    .line 76
    iput-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/im/connect/ImConnectPresenterImpl;->homeJob:Lcom/ibotta/android/service/api/job/HomeApiJob;

    return-void
.end method

.method protected onFetchFinishedSuccessfully()V
    .locals 3

    .line 81
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/im/connect/ImConnectPresenterImpl;->homeJob:Lcom/ibotta/android/service/api/job/HomeApiJob;

    if-nez v0, :cond_0

    .line 82
    sget-object v0, Lcom/ibotta/android/crash/IbottaCrashProxy;->IbottaCrashManager:Lcom/ibotta/android/crash/CrashManager;

    new-instance v1, Lcom/ibotta/android/mvp/ui/activity/find/IllegalApiJobStateException;

    const-string v2, "homeJob should not be null"

    invoke-direct {v1, v2}, Lcom/ibotta/android/mvp/ui/activity/find/IllegalApiJobStateException;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, v1}, Lcom/ibotta/android/crash/CrashManager;->trackException(Ljava/lang/Throwable;)V

    .line 83
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/im/connect/ImConnectPresenterImpl;->mvpView:Lcom/ibotta/android/mvp/base/MvpView;

    check-cast v0, Lcom/ibotta/android/mvp/ui/activity/im/connect/ImConnectView;

    invoke-interface {v0}, Lcom/ibotta/android/mvp/ui/activity/im/connect/ImConnectView;->finish()V

    return-void

    .line 87
    :cond_0
    invoke-virtual {v0}, Lcom/ibotta/android/service/api/job/HomeApiJob;->getApiResponse()Lcom/ibotta/api/ApiResponse;

    move-result-object v0

    check-cast v0, Lcom/ibotta/api/call/home/HomeResponse;

    .line 89
    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/im/connect/ImConnectPresenterImpl;->retailerHelper:Lcom/ibotta/api/helper/retailer/RetailerHelper;

    invoke-virtual {v0}, Lcom/ibotta/api/call/home/HomeResponse;->getRetailersAsModels()Ljava/util/List;

    move-result-object v0

    iget v2, p0, Lcom/ibotta/android/mvp/ui/activity/im/connect/ImConnectPresenterImpl;->retailerId:I

    invoke-interface {v1, v0, v2}, Lcom/ibotta/api/helper/retailer/RetailerHelper;->findRetailerById(Ljava/util/List;I)Lcom/ibotta/api/model/RetailerModel;

    move-result-object v0

    .line 90
    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/im/connect/ImConnectPresenterImpl;->retailerParcelHelper:Lcom/ibotta/android/fragment/retailer/RetailerParcelHelper;

    invoke-interface {v1, v0}, Lcom/ibotta/android/fragment/retailer/RetailerParcelHelper;->toRetailerParcel(Lcom/ibotta/api/model/RetailerModel;)Lcom/ibotta/android/fragment/retailer/RetailerParcel;

    move-result-object v0

    iput-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/im/connect/ImConnectPresenterImpl;->retailerParcel:Lcom/ibotta/android/fragment/retailer/RetailerParcel;

    .line 92
    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/activity/im/connect/ImConnectPresenterImpl;->updateViewState()V

    return-void
.end method

.method public onImAccountCreateClicked()V
    .locals 3

    .line 97
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/im/connect/ImConnectPresenterImpl;->retailerParcel:Lcom/ibotta/android/fragment/retailer/RetailerParcel;

    if-nez v0, :cond_0

    return-void

    .line 101
    :cond_0
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/im/connect/ImConnectPresenterImpl;->mvpView:Lcom/ibotta/android/mvp/base/MvpView;

    check-cast v0, Lcom/ibotta/android/mvp/ui/activity/im/connect/ImConnectView;

    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/im/connect/ImConnectPresenterImpl;->retailerParcel:Lcom/ibotta/android/fragment/retailer/RetailerParcel;

    invoke-virtual {v1}, Lcom/ibotta/android/fragment/retailer/RetailerParcel;->getCardSignupUrl()Ljava/lang/String;

    move-result-object v1

    iget-object v2, p0, Lcom/ibotta/android/mvp/ui/activity/im/connect/ImConnectPresenterImpl;->retailerParcel:Lcom/ibotta/android/fragment/retailer/RetailerParcel;

    invoke-virtual {v2}, Lcom/ibotta/android/fragment/retailer/RetailerParcel;->getCardSignupCompletionUrl()Ljava/lang/String;

    move-result-object v2

    invoke-interface {v0, v1, v2}, Lcom/ibotta/android/mvp/ui/activity/im/connect/ImConnectView;->showImWeb(Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public onImAccountLoginClicked()V
    .locals 3
    .annotation runtime Lcom/ibotta/android/aop/tracking/TrackingAfter;
        value = .enum Lcom/ibotta/android/aop/tracking/TrackingType;->IM_ACCOUNT_LOGIN_CLICKED:Lcom/ibotta/android/aop/tracking/TrackingType;
    .end annotation

    sget-object v0, Lcom/ibotta/android/mvp/ui/activity/im/connect/ImConnectPresenterImpl;->ajc$tjp_0:Lorg/aspectj/lang/JoinPoint$StaticPart;

    invoke-static {v0, p0, p0}, Lorg/aspectj/runtime/reflect/Factory;->makeJP(Lorg/aspectj/lang/JoinPoint$StaticPart;Ljava/lang/Object;Ljava/lang/Object;)Lorg/aspectj/lang/JoinPoint;

    move-result-object v0

    .line 106
    :try_start_0
    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/im/connect/ImConnectPresenterImpl;->mvpView:Lcom/ibotta/android/mvp/base/MvpView;

    check-cast v1, Lcom/ibotta/android/mvp/ui/activity/im/connect/ImConnectView;

    invoke-interface {v1}, Lcom/ibotta/android/mvp/ui/activity/im/connect/ImConnectView;->showImLogin()V
    :try_end_0
    .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0

    .line 107
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

.method public onViewsBound()V
    .locals 1

    .line 56
    invoke-super {p0}, Lcom/ibotta/android/mvp/base/loading/AbstractLoadingMvpPresenter;->onViewsBound()V

    .line 57
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/im/connect/ImConnectPresenterImpl;->viewComponent:Lcom/ibotta/android/views/components/ViewComponent;

    invoke-interface {v0, p0}, Lcom/ibotta/android/views/components/ViewComponent;->bindViewEvents(Lcom/ibotta/android/views/components/ViewEvents;)V

    .line 58
    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/activity/im/connect/ImConnectPresenterImpl;->updateViewState()V

    return-void
.end method

.method public setRetailerId(I)V
    .locals 0

    .line 125
    iput p1, p0, Lcom/ibotta/android/mvp/ui/activity/im/connect/ImConnectPresenterImpl;->retailerId:I

    return-void
.end method
