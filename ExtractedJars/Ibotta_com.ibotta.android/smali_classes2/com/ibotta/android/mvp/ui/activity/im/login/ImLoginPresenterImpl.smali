.class public Lcom/ibotta/android/mvp/ui/activity/im/login/ImLoginPresenterImpl;
.super Lcom/ibotta/android/mvp/base/loading/AbstractLoadingMvpPresenter;
.source "ImLoginPresenterImpl.java"

# interfaces
.implements Lcom/ibotta/android/aop/tracking/advice/ImLoginAdviceFields;
.implements Lcom/ibotta/android/mvp/ui/activity/im/login/ImLoginPresenter;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/ibotta/android/mvp/base/loading/AbstractLoadingMvpPresenter<",
        "Lcom/ibotta/android/mvp/ui/activity/im/login/ImLoginView;",
        ">;",
        "Lcom/ibotta/android/aop/tracking/advice/ImLoginAdviceFields;",
        "Lcom/ibotta/android/mvp/ui/activity/im/login/ImLoginPresenter;"
    }
.end annotation


# static fields
.field private static final synthetic ajc$tjp_0:Lorg/aspectj/lang/JoinPoint$StaticPart;

.field private static final synthetic ajc$tjp_1:Lorg/aspectj/lang/JoinPoint$StaticPart;


# instance fields
.field private final appConfig:Lcom/ibotta/android/state/app/config/AppConfig;

.field private enteredEmail:Ljava/lang/String;

.field private enteredPassword:Ljava/lang/String;

.field private homeJob:Lcom/ibotta/android/service/api/job/HomeApiJob;
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation
.end field

.field private final imLoginResources:Lcom/ibotta/android/mvp/ui/activity/im/login/ImLoginResources;

.field private final imUtil:Lcom/ibotta/android/mvp/ui/activity/im/ImUtil;

.field private persistedState:Lcom/ibotta/android/mvp/ui/activity/im/login/ImLoginPersistedState;

.field private final reducer:Lcom/ibotta/android/mvp/ui/activity/im/login/ImLoginReducer;

.field private final retailerHelper:Lcom/ibotta/api/helper/retailer/RetailerHelper;

.field private retailerParcel:Lcom/ibotta/android/fragment/retailer/RetailerParcel;
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation
.end field

.field private final retailerParcelHelper:Lcom/ibotta/android/fragment/retailer/RetailerParcelHelper;

.field private final viewComponent:Lcom/ibotta/android/views/components/ViewComponent;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/ibotta/android/views/components/ViewComponent<",
            "Lcom/ibotta/android/mvp/ui/activity/im/login/ImLoginViewState;",
            "Lcom/ibotta/android/mvp/ui/activity/im/login/ImLoginViewEvents;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 0

    .line 1
    invoke-static {}, Lcom/ibotta/android/mvp/ui/activity/im/login/ImLoginPresenterImpl;->ajc$preClinit()V

    return-void
.end method

.method public constructor <init>(Lcom/ibotta/android/mvp/base/MvpPresenterActions;Lcom/ibotta/android/state/app/config/AppConfig;Lcom/ibotta/android/mvp/ui/activity/im/ImUtil;Lcom/ibotta/android/views/components/ViewComponent;Lcom/ibotta/api/helper/retailer/RetailerHelper;Lcom/ibotta/android/fragment/retailer/RetailerParcelHelper;Lcom/ibotta/android/mvp/ui/activity/im/login/ImLoginReducer;Lcom/ibotta/android/mvp/ui/activity/im/login/ImLoginResources;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/ibotta/android/mvp/base/MvpPresenterActions;",
            "Lcom/ibotta/android/state/app/config/AppConfig;",
            "Lcom/ibotta/android/mvp/ui/activity/im/ImUtil;",
            "Lcom/ibotta/android/views/components/ViewComponent<",
            "Lcom/ibotta/android/mvp/ui/activity/im/login/ImLoginViewState;",
            "Lcom/ibotta/android/mvp/ui/activity/im/login/ImLoginViewEvents;",
            ">;",
            "Lcom/ibotta/api/helper/retailer/RetailerHelper;",
            "Lcom/ibotta/android/fragment/retailer/RetailerParcelHelper;",
            "Lcom/ibotta/android/mvp/ui/activity/im/login/ImLoginReducer;",
            "Lcom/ibotta/android/mvp/ui/activity/im/login/ImLoginResources;",
            ")V"
        }
    .end annotation

    .line 54
    invoke-direct {p0, p1}, Lcom/ibotta/android/mvp/base/loading/AbstractLoadingMvpPresenter;-><init>(Lcom/ibotta/android/mvp/base/MvpPresenterActions;)V

    const-string p1, ""

    .line 38
    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/im/login/ImLoginPresenterImpl;->enteredEmail:Ljava/lang/String;

    const-string p1, ""

    .line 39
    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/im/login/ImLoginPresenterImpl;->enteredPassword:Ljava/lang/String;

    .line 55
    iput-object p2, p0, Lcom/ibotta/android/mvp/ui/activity/im/login/ImLoginPresenterImpl;->appConfig:Lcom/ibotta/android/state/app/config/AppConfig;

    .line 56
    iput-object p3, p0, Lcom/ibotta/android/mvp/ui/activity/im/login/ImLoginPresenterImpl;->imUtil:Lcom/ibotta/android/mvp/ui/activity/im/ImUtil;

    .line 57
    iput-object p4, p0, Lcom/ibotta/android/mvp/ui/activity/im/login/ImLoginPresenterImpl;->viewComponent:Lcom/ibotta/android/views/components/ViewComponent;

    .line 58
    iput-object p5, p0, Lcom/ibotta/android/mvp/ui/activity/im/login/ImLoginPresenterImpl;->retailerHelper:Lcom/ibotta/api/helper/retailer/RetailerHelper;

    .line 59
    iput-object p6, p0, Lcom/ibotta/android/mvp/ui/activity/im/login/ImLoginPresenterImpl;->retailerParcelHelper:Lcom/ibotta/android/fragment/retailer/RetailerParcelHelper;

    .line 60
    iput-object p7, p0, Lcom/ibotta/android/mvp/ui/activity/im/login/ImLoginPresenterImpl;->reducer:Lcom/ibotta/android/mvp/ui/activity/im/login/ImLoginReducer;

    .line 61
    iput-object p8, p0, Lcom/ibotta/android/mvp/ui/activity/im/login/ImLoginPresenterImpl;->imLoginResources:Lcom/ibotta/android/mvp/ui/activity/im/login/ImLoginResources;

    return-void
.end method

.method private accountCreationAlertMessage(Ljava/lang/String;)V
    .locals 1

    .line 161
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/im/login/ImLoginPresenterImpl;->imLoginResources:Lcom/ibotta/android/mvp/ui/activity/im/login/ImLoginResources;

    invoke-virtual {v0, p1}, Lcom/ibotta/android/mvp/ui/activity/im/login/ImLoginResources;->getAccountCreatedAlertTitle(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    .line 162
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/im/login/ImLoginPresenterImpl;->mvpView:Lcom/ibotta/android/mvp/base/MvpView;

    check-cast v0, Lcom/ibotta/android/mvp/ui/activity/im/login/ImLoginView;

    invoke-interface {v0, p1}, Lcom/ibotta/android/mvp/ui/activity/im/login/ImLoginView;->showImAccountCreated(Ljava/lang/String;)V

    .line 163
    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/activity/im/login/ImLoginPresenterImpl;->setAccountMessageShown()V

    return-void
.end method

.method private accountCreationSemiModal(Ljava/lang/String;Ljava/lang/String;)V
    .locals 2

    .line 167
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/im/login/ImLoginPresenterImpl;->imLoginResources:Lcom/ibotta/android/mvp/ui/activity/im/login/ImLoginResources;

    invoke-virtual {v0}, Lcom/ibotta/android/mvp/ui/activity/im/login/ImLoginResources;->getEmailValidationRequiredTitle()Ljava/lang/String;

    move-result-object v0

    .line 168
    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/im/login/ImLoginPresenterImpl;->imLoginResources:Lcom/ibotta/android/mvp/ui/activity/im/login/ImLoginResources;

    invoke-virtual {v1, p1, p2}, Lcom/ibotta/android/mvp/ui/activity/im/login/ImLoginResources;->getEmailValidationRequiredBody(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    .line 169
    iget-object p2, p0, Lcom/ibotta/android/mvp/ui/activity/im/login/ImLoginPresenterImpl;->imLoginResources:Lcom/ibotta/android/mvp/ui/activity/im/login/ImLoginResources;

    invoke-virtual {p2}, Lcom/ibotta/android/mvp/ui/activity/im/login/ImLoginResources;->getEmailValidationRequiredButtonText()Ljava/lang/String;

    move-result-object p2

    .line 171
    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/im/login/ImLoginPresenterImpl;->mvpView:Lcom/ibotta/android/mvp/base/MvpView;

    check-cast v1, Lcom/ibotta/android/mvp/ui/activity/im/login/ImLoginView;

    invoke-interface {v1, v0, p1, p2}, Lcom/ibotta/android/mvp/ui/activity/im/login/ImLoginView;->showAccountCreatedSemiModal(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 172
    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/activity/im/login/ImLoginPresenterImpl;->setAccountMessageShown()V

    return-void
.end method

.method private static synthetic ajc$preClinit()V
    .locals 10

    .line 1
    new-instance v8, Lorg/aspectj/runtime/reflect/Factory;

    const-string v0, "ImLoginPresenterImpl.java"

    const-class v1, Lcom/ibotta/android/mvp/ui/activity/im/login/ImLoginPresenterImpl;

    invoke-direct {v8, v0, v1}, Lorg/aspectj/runtime/reflect/Factory;-><init>(Ljava/lang/String;Ljava/lang/Class;)V

    const-string v9, "method-execution"

    const-string v1, "1"

    const-string v2, "onStart"

    const-string v3, "com.ibotta.android.mvp.ui.activity.im.login.ImLoginPresenterImpl"

    const-string v4, ""

    const-string v5, ""

    const-string v6, ""

    const-string v7, "void"

    move-object v0, v8

    invoke-virtual/range {v0 .. v7}, Lorg/aspectj/runtime/reflect/Factory;->makeMethodSig(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lorg/aspectj/lang/reflect/MethodSignature;

    move-result-object v0

    const/16 v1, 0x42

    invoke-virtual {v8, v9, v0, v1}, Lorg/aspectj/runtime/reflect/Factory;->makeSJP(Ljava/lang/String;Lorg/aspectj/lang/Signature;I)Lorg/aspectj/lang/JoinPoint$StaticPart;

    move-result-object v0

    sput-object v0, Lcom/ibotta/android/mvp/ui/activity/im/login/ImLoginPresenterImpl;->ajc$tjp_0:Lorg/aspectj/lang/JoinPoint$StaticPart;

    const-string v9, "method-execution"

    const-string v1, "1"

    const-string v2, "onCreateAccountLinkTapped"

    const-string v3, "com.ibotta.android.mvp.ui.activity.im.login.ImLoginPresenterImpl"

    const-string v4, ""

    const-string v5, ""

    const-string v6, ""

    const-string v7, "void"

    move-object v0, v8

    invoke-virtual/range {v0 .. v7}, Lorg/aspectj/runtime/reflect/Factory;->makeMethodSig(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lorg/aspectj/lang/reflect/MethodSignature;

    move-result-object v0

    const/16 v1, 0x90

    invoke-virtual {v8, v9, v0, v1}, Lorg/aspectj/runtime/reflect/Factory;->makeSJP(Ljava/lang/String;Lorg/aspectj/lang/Signature;I)Lorg/aspectj/lang/JoinPoint$StaticPart;

    move-result-object v0

    sput-object v0, Lcom/ibotta/android/mvp/ui/activity/im/login/ImLoginPresenterImpl;->ajc$tjp_1:Lorg/aspectj/lang/JoinPoint$StaticPart;

    return-void
.end method

.method private setAccountMessageShown()V
    .locals 2

    .line 176
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/im/login/ImLoginPresenterImpl;->persistedState:Lcom/ibotta/android/mvp/ui/activity/im/login/ImLoginPersistedState;

    invoke-virtual {v0}, Lcom/ibotta/android/mvp/ui/activity/im/login/ImLoginPersistedState;->toBuilder()Lcom/ibotta/android/mvp/ui/activity/im/login/ImLoginPersistedState$Builder;

    move-result-object v0

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lcom/ibotta/android/mvp/ui/activity/im/login/ImLoginPersistedState$Builder;->accountCreationMessageAlreadyShown(Z)Lcom/ibotta/android/mvp/ui/activity/im/login/ImLoginPersistedState$Builder;

    move-result-object v0

    invoke-virtual {v0}, Lcom/ibotta/android/mvp/ui/activity/im/login/ImLoginPersistedState$Builder;->build()Lcom/ibotta/android/mvp/ui/activity/im/login/ImLoginPersistedState;

    move-result-object v0

    iput-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/im/login/ImLoginPresenterImpl;->persistedState:Lcom/ibotta/android/mvp/ui/activity/im/login/ImLoginPersistedState;

    return-void
.end method

.method private showAlertMessageForAccountCreation(Lcom/ibotta/android/fragment/retailer/RetailerParcel;)V
    .locals 2

    .line 148
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/im/login/ImLoginPresenterImpl;->appConfig:Lcom/ibotta/android/state/app/config/AppConfig;

    invoke-interface {v0}, Lcom/ibotta/android/state/app/config/AppConfig;->getImEmailValidationRetailers()Ljava/util/ArrayList;

    move-result-object v0

    invoke-virtual {p1}, Lcom/ibotta/android/fragment/retailer/RetailerParcel;->getId()I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    move-result v0

    .line 149
    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/im/login/ImLoginPresenterImpl;->persistedState:Lcom/ibotta/android/mvp/ui/activity/im/login/ImLoginPersistedState;

    .line 150
    invoke-virtual {v1}, Lcom/ibotta/android/mvp/ui/activity/im/login/ImLoginPersistedState;->isFromCreate()Z

    move-result v1

    if-eqz v1, :cond_0

    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/im/login/ImLoginPresenterImpl;->persistedState:Lcom/ibotta/android/mvp/ui/activity/im/login/ImLoginPersistedState;

    invoke-virtual {v1}, Lcom/ibotta/android/mvp/ui/activity/im/login/ImLoginPersistedState;->isAccountCreationMessageAlreadyShown()Z

    move-result v1

    if-nez v1, :cond_0

    const/4 v1, 0x1

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    if-eqz v0, :cond_1

    if-eqz v1, :cond_1

    .line 153
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/im/login/ImLoginPresenterImpl;->imUtil:Lcom/ibotta/android/mvp/ui/activity/im/ImUtil;

    invoke-interface {v0, p1}, Lcom/ibotta/android/mvp/ui/activity/im/ImUtil;->getFormattedRetailerHost(Lcom/ibotta/android/fragment/retailer/RetailerParcel;)Ljava/lang/String;

    move-result-object v0

    .line 154
    invoke-virtual {p1}, Lcom/ibotta/android/fragment/retailer/RetailerParcel;->getName()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p0, v0, p1}, Lcom/ibotta/android/mvp/ui/activity/im/login/ImLoginPresenterImpl;->accountCreationSemiModal(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_1

    :cond_1
    if-eqz v1, :cond_2

    .line 156
    invoke-virtual {p1}, Lcom/ibotta/android/fragment/retailer/RetailerParcel;->getName()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p0, p1}, Lcom/ibotta/android/mvp/ui/activity/im/login/ImLoginPresenterImpl;->accountCreationAlertMessage(Ljava/lang/String;)V

    :cond_2
    :goto_1
    return-void
.end method

.method private updateViewState()V
    .locals 4

    .line 180
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/im/login/ImLoginPresenterImpl;->reducer:Lcom/ibotta/android/mvp/ui/activity/im/login/ImLoginReducer;

    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/im/login/ImLoginPresenterImpl;->enteredEmail:Ljava/lang/String;

    iget-object v2, p0, Lcom/ibotta/android/mvp/ui/activity/im/login/ImLoginPresenterImpl;->enteredPassword:Ljava/lang/String;

    iget-object v3, p0, Lcom/ibotta/android/mvp/ui/activity/im/login/ImLoginPresenterImpl;->retailerParcel:Lcom/ibotta/android/fragment/retailer/RetailerParcel;

    invoke-virtual {v0, v1, v2, v3}, Lcom/ibotta/android/mvp/ui/activity/im/login/ImLoginReducer;->create(Ljava/lang/String;Ljava/lang/String;Lcom/ibotta/android/fragment/retailer/RetailerParcel;)Lcom/ibotta/android/mvp/ui/activity/im/login/ImLoginViewState;

    move-result-object v0

    .line 181
    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/im/login/ImLoginPresenterImpl;->viewComponent:Lcom/ibotta/android/views/components/ViewComponent;

    invoke-interface {v1, v0}, Lcom/ibotta/android/views/components/ViewComponent;->updateViewState(Lcom/ibotta/android/views/components/ViewState;)V

    return-void
.end method


# virtual methods
.method public cameFromCreate()Z
    .locals 1

    .line 186
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/im/login/ImLoginPresenterImpl;->persistedState:Lcom/ibotta/android/mvp/ui/activity/im/login/ImLoginPersistedState;

    invoke-virtual {v0}, Lcom/ibotta/android/mvp/ui/activity/im/login/ImLoginPersistedState;->isFromCreate()Z

    move-result v0

    return v0
.end method

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

    .line 79
    new-instance v0, Ljava/util/HashSet;

    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    .line 81
    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/im/login/ImLoginPresenterImpl;->homeJob:Lcom/ibotta/android/service/api/job/HomeApiJob;

    if-nez v1, :cond_0

    .line 82
    new-instance v1, Lcom/ibotta/android/service/api/job/HomeApiJob;

    const/4 v2, 0x0

    invoke-direct {v1, v2}, Lcom/ibotta/android/service/api/job/HomeApiJob;-><init>(I)V

    iput-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/im/login/ImLoginPresenterImpl;->homeJob:Lcom/ibotta/android/service/api/job/HomeApiJob;

    .line 85
    :cond_0
    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/im/login/ImLoginPresenterImpl;->homeJob:Lcom/ibotta/android/service/api/job/HomeApiJob;

    invoke-interface {v0, v1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    return-object v0
.end method

.method public getPersistedState()Ljava/lang/Object;
    .locals 1

    .line 121
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/im/login/ImLoginPresenterImpl;->persistedState:Lcom/ibotta/android/mvp/ui/activity/im/login/ImLoginPersistedState;

    return-object v0
.end method

.method public getRetailerIdForTracking()Ljava/lang/Integer;
    .locals 1
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation

    .line 191
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/im/login/ImLoginPresenterImpl;->persistedState:Lcom/ibotta/android/mvp/ui/activity/im/login/ImLoginPersistedState;

    invoke-virtual {v0}, Lcom/ibotta/android/mvp/ui/activity/im/login/ImLoginPersistedState;->getRetailerId()I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    return-object v0
.end method

.method protected onAbandonFetchJobs()V
    .locals 1

    const/4 v0, 0x0

    .line 92
    iput-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/im/login/ImLoginPresenterImpl;->homeJob:Lcom/ibotta/android/service/api/job/HomeApiJob;

    return-void
.end method

.method public onConnectButtonTapped()V
    .locals 4

    .line 138
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/im/login/ImLoginPresenterImpl;->mvpView:Lcom/ibotta/android/mvp/base/MvpView;

    check-cast v0, Lcom/ibotta/android/mvp/ui/activity/im/login/ImLoginView;

    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/im/login/ImLoginPresenterImpl;->persistedState:Lcom/ibotta/android/mvp/ui/activity/im/login/ImLoginPersistedState;

    .line 139
    invoke-virtual {v1}, Lcom/ibotta/android/mvp/ui/activity/im/login/ImLoginPersistedState;->getRetailerId()I

    move-result v1

    iget-object v2, p0, Lcom/ibotta/android/mvp/ui/activity/im/login/ImLoginPresenterImpl;->enteredEmail:Ljava/lang/String;

    iget-object v3, p0, Lcom/ibotta/android/mvp/ui/activity/im/login/ImLoginPresenterImpl;->enteredPassword:Ljava/lang/String;

    invoke-static {v2, v3}, Lcom/ibotta/android/mvp/ui/activity/im/login/ImLoginParcel;->create(Ljava/lang/String;Ljava/lang/String;)Lcom/ibotta/android/mvp/ui/activity/im/login/ImLoginParcel;

    move-result-object v2

    .line 138
    invoke-interface {v0, v1, v2}, Lcom/ibotta/android/mvp/ui/activity/im/login/ImLoginView;->showImTermsAndConditions(ILcom/ibotta/android/mvp/ui/activity/im/login/ImLoginParcel;)V

    return-void
.end method

.method public onCreateAccountLinkTapped()V
    .locals 3
    .annotation runtime Lcom/ibotta/android/aop/tracking/TrackingAfter;
        value = .enum Lcom/ibotta/android/aop/tracking/TrackingType;->IM_ACCOUNT_CREATE_CLICKED:Lcom/ibotta/android/aop/tracking/TrackingType;
    .end annotation

    sget-object v0, Lcom/ibotta/android/mvp/ui/activity/im/login/ImLoginPresenterImpl;->ajc$tjp_1:Lorg/aspectj/lang/JoinPoint$StaticPart;

    invoke-static {v0, p0, p0}, Lorg/aspectj/runtime/reflect/Factory;->makeJP(Lorg/aspectj/lang/JoinPoint$StaticPart;Ljava/lang/Object;Ljava/lang/Object;)Lorg/aspectj/lang/JoinPoint;

    move-result-object v0

    .line 144
    :try_start_0
    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/im/login/ImLoginPresenterImpl;->mvpView:Lcom/ibotta/android/mvp/base/MvpView;

    check-cast v1, Lcom/ibotta/android/mvp/ui/activity/im/login/ImLoginView;

    invoke-interface {v1}, Lcom/ibotta/android/mvp/ui/activity/im/login/ImLoginView;->showImConnect()V
    :try_end_0
    .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0

    .line 145
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

.method public onEmailUpdated(Ljava/lang/String;)V
    .locals 0

    .line 126
    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/im/login/ImLoginPresenterImpl;->enteredEmail:Ljava/lang/String;

    .line 127
    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/activity/im/login/ImLoginPresenterImpl;->updateViewState()V

    return-void
.end method

.method protected onFetchFinishedSuccessfully()V
    .locals 3

    .line 97
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/im/login/ImLoginPresenterImpl;->homeJob:Lcom/ibotta/android/service/api/job/HomeApiJob;

    if-nez v0, :cond_0

    .line 98
    sget-object v0, Lcom/ibotta/android/crash/IbottaCrashProxy;->IbottaCrashManager:Lcom/ibotta/android/crash/CrashManager;

    new-instance v1, Lcom/ibotta/android/mvp/ui/activity/find/IllegalApiJobStateException;

    const-string v2, "homeJob should not be null"

    invoke-direct {v1, v2}, Lcom/ibotta/android/mvp/ui/activity/find/IllegalApiJobStateException;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, v1}, Lcom/ibotta/android/crash/CrashManager;->trackException(Ljava/lang/Throwable;)V

    .line 99
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/im/login/ImLoginPresenterImpl;->mvpView:Lcom/ibotta/android/mvp/base/MvpView;

    check-cast v0, Lcom/ibotta/android/mvp/ui/activity/im/login/ImLoginView;

    invoke-interface {v0}, Lcom/ibotta/android/mvp/ui/activity/im/login/ImLoginView;->finish()V

    return-void

    .line 103
    :cond_0
    invoke-virtual {v0}, Lcom/ibotta/android/service/api/job/HomeApiJob;->getApiResponse()Lcom/ibotta/api/ApiResponse;

    move-result-object v0

    check-cast v0, Lcom/ibotta/api/call/home/HomeResponse;

    .line 105
    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/im/login/ImLoginPresenterImpl;->retailerHelper:Lcom/ibotta/api/helper/retailer/RetailerHelper;

    .line 106
    invoke-virtual {v0}, Lcom/ibotta/api/call/home/HomeResponse;->getRetailersAsModels()Ljava/util/List;

    move-result-object v0

    iget-object v2, p0, Lcom/ibotta/android/mvp/ui/activity/im/login/ImLoginPresenterImpl;->persistedState:Lcom/ibotta/android/mvp/ui/activity/im/login/ImLoginPersistedState;

    invoke-virtual {v2}, Lcom/ibotta/android/mvp/ui/activity/im/login/ImLoginPersistedState;->getRetailerId()I

    move-result v2

    .line 105
    invoke-interface {v1, v0, v2}, Lcom/ibotta/api/helper/retailer/RetailerHelper;->findRetailerById(Ljava/util/List;I)Lcom/ibotta/api/model/RetailerModel;

    move-result-object v0

    .line 107
    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/im/login/ImLoginPresenterImpl;->retailerParcelHelper:Lcom/ibotta/android/fragment/retailer/RetailerParcelHelper;

    invoke-interface {v1, v0}, Lcom/ibotta/android/fragment/retailer/RetailerParcelHelper;->toRetailerParcel(Lcom/ibotta/api/model/RetailerModel;)Lcom/ibotta/android/fragment/retailer/RetailerParcel;

    move-result-object v0

    iput-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/im/login/ImLoginPresenterImpl;->retailerParcel:Lcom/ibotta/android/fragment/retailer/RetailerParcel;

    .line 109
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/im/login/ImLoginPresenterImpl;->retailerParcel:Lcom/ibotta/android/fragment/retailer/RetailerParcel;

    invoke-direct {p0, v0}, Lcom/ibotta/android/mvp/ui/activity/im/login/ImLoginPresenterImpl;->showAlertMessageForAccountCreation(Lcom/ibotta/android/fragment/retailer/RetailerParcel;)V

    .line 110
    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/activity/im/login/ImLoginPresenterImpl;->updateViewState()V

    return-void
.end method

.method public onPasswordUpdated(Ljava/lang/String;)V
    .locals 0

    .line 132
    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/im/login/ImLoginPresenterImpl;->enteredPassword:Ljava/lang/String;

    .line 133
    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/activity/im/login/ImLoginPresenterImpl;->updateViewState()V

    return-void
.end method

.method public onStart()V
    .locals 3
    .annotation runtime Lcom/ibotta/android/aop/tracking/TrackingAfter;
        value = .enum Lcom/ibotta/android/aop/tracking/TrackingType;->IM_ACCOUNT_LOGIN_VIEWED:Lcom/ibotta/android/aop/tracking/TrackingType;
    .end annotation

    sget-object v0, Lcom/ibotta/android/mvp/ui/activity/im/login/ImLoginPresenterImpl;->ajc$tjp_0:Lorg/aspectj/lang/JoinPoint$StaticPart;

    invoke-static {v0, p0, p0}, Lorg/aspectj/runtime/reflect/Factory;->makeJP(Lorg/aspectj/lang/JoinPoint$StaticPart;Ljava/lang/Object;Ljava/lang/Object;)Lorg/aspectj/lang/JoinPoint;

    move-result-object v0

    .line 66
    :try_start_0
    invoke-super {p0}, Lcom/ibotta/android/mvp/base/loading/AbstractLoadingMvpPresenter;->onStart()V
    :try_end_0
    .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0

    .line 68
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

    .line 72
    invoke-super {p0}, Lcom/ibotta/android/mvp/base/loading/AbstractLoadingMvpPresenter;->onViewsBound()V

    .line 73
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/im/login/ImLoginPresenterImpl;->viewComponent:Lcom/ibotta/android/views/components/ViewComponent;

    invoke-interface {v0, p0}, Lcom/ibotta/android/views/components/ViewComponent;->bindViewEvents(Lcom/ibotta/android/views/components/ViewEvents;)V

    .line 74
    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/activity/im/login/ImLoginPresenterImpl;->updateViewState()V

    return-void
.end method

.method public setPersistedState(Ljava/lang/Object;)V
    .locals 0

    .line 115
    invoke-super {p0, p1}, Lcom/ibotta/android/mvp/base/loading/AbstractLoadingMvpPresenter;->setPersistedState(Ljava/lang/Object;)V

    .line 116
    check-cast p1, Lcom/ibotta/android/mvp/ui/activity/im/login/ImLoginPersistedState;

    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/im/login/ImLoginPresenterImpl;->persistedState:Lcom/ibotta/android/mvp/ui/activity/im/login/ImLoginPersistedState;

    return-void
.end method
