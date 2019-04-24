.class public Lcom/ibotta/android/mvp/ui/activity/pwi/v2/barcode/PwiBarcodePresenterImpl;
.super Lcom/ibotta/android/mvp/base/loading/AbstractLoadingMvpPresenter;
.source "PwiBarcodePresenterImpl.java"

# interfaces
.implements Lcom/ibotta/android/aop/tracking/advice/PwiBarcodeAdviceFields;
.implements Lcom/ibotta/android/mvp/ui/activity/pwi/v2/barcode/PwiBarcodePresenter;
.implements Lcom/ibotta/android/views/pwi/barcode/PwiBarcodeViewEvents;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/ibotta/android/mvp/base/loading/AbstractLoadingMvpPresenter<",
        "Lcom/ibotta/android/mvp/ui/activity/pwi/v2/barcode/PwiBarcodeView;",
        ">;",
        "Lcom/ibotta/android/aop/tracking/advice/PwiBarcodeAdviceFields;",
        "Lcom/ibotta/android/mvp/ui/activity/pwi/v2/barcode/PwiBarcodePresenter;",
        "Lcom/ibotta/android/views/pwi/barcode/PwiBarcodeViewEvents;"
    }
.end annotation


# static fields
.field private static final synthetic ajc$tjp_0:Lorg/aspectj/lang/JoinPoint$StaticPart;

.field private static final synthetic ajc$tjp_1:Lorg/aspectj/lang/JoinPoint$StaticPart;

.field private static final synthetic ajc$tjp_2:Lorg/aspectj/lang/JoinPoint$StaticPart;

.field private static final synthetic ajc$tjp_3:Lorg/aspectj/lang/JoinPoint$StaticPart;

.field private static final synthetic ajc$tjp_4:Lorg/aspectj/lang/JoinPoint$StaticPart;

.field private static final synthetic ajc$tjp_5:Lorg/aspectj/lang/JoinPoint$StaticPart;


# instance fields
.field private final appHelper:Lcom/ibotta/android/util/AppHelper;

.field private bgcTransaction:Lcom/ibotta/api/model/pwi/BgcTransaction;

.field private bgcTransactionJob:Lcom/ibotta/android/service/api/job/SingleApiJob;
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation
.end field

.field private final formatting:Lcom/ibotta/android/util/Formatting;

.field private homeJob:Lcom/ibotta/android/service/api/job/HomeApiJob;
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation
.end field

.field private final pwiApiManager:Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/PwiApiManager;

.field private final pwiBarcodeReducer:Lcom/ibotta/android/pwi/PwiBarcodeReducer;

.field private final pwiUserState:Lcom/ibotta/android/state/pwi/PwiUserState;

.field private retailerModel:Lcom/ibotta/api/model/RetailerModel;
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation
.end field

.field private transactionId:Ljava/lang/String;

.field private transactionSpentJob:Lcom/ibotta/android/service/api/job/SingleApiJob;
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation
.end field

.field private final userState:Lcom/ibotta/android/state/user/UserState;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    .line 1
    invoke-static {}, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/barcode/PwiBarcodePresenterImpl;->ajc$preClinit()V

    return-void
.end method

.method public constructor <init>(Lcom/ibotta/android/mvp/base/MvpPresenterActions;Lcom/ibotta/android/util/AppHelper;Lcom/ibotta/android/state/user/UserState;Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/PwiApiManager;Lcom/ibotta/android/pwi/PwiBarcodeReducer;Lcom/ibotta/android/state/pwi/PwiUserState;Lcom/ibotta/android/util/Formatting;)V
    .locals 0

    .line 73
    invoke-direct {p0, p1}, Lcom/ibotta/android/mvp/base/loading/AbstractLoadingMvpPresenter;-><init>(Lcom/ibotta/android/mvp/base/MvpPresenterActions;)V

    .line 74
    iput-object p2, p0, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/barcode/PwiBarcodePresenterImpl;->appHelper:Lcom/ibotta/android/util/AppHelper;

    .line 75
    iput-object p3, p0, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/barcode/PwiBarcodePresenterImpl;->userState:Lcom/ibotta/android/state/user/UserState;

    .line 76
    iput-object p4, p0, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/barcode/PwiBarcodePresenterImpl;->pwiApiManager:Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/PwiApiManager;

    .line 77
    iput-object p5, p0, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/barcode/PwiBarcodePresenterImpl;->pwiBarcodeReducer:Lcom/ibotta/android/pwi/PwiBarcodeReducer;

    .line 78
    iput-object p6, p0, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/barcode/PwiBarcodePresenterImpl;->pwiUserState:Lcom/ibotta/android/state/pwi/PwiUserState;

    .line 79
    iput-object p7, p0, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/barcode/PwiBarcodePresenterImpl;->formatting:Lcom/ibotta/android/util/Formatting;

    return-void
.end method

.method private static synthetic ajc$preClinit()V
    .locals 10

    .line 1
    new-instance v8, Lorg/aspectj/runtime/reflect/Factory;

    const-string v0, "PwiBarcodePresenterImpl.java"

    const-class v1, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/barcode/PwiBarcodePresenterImpl;

    invoke-direct {v8, v0, v1}, Lorg/aspectj/runtime/reflect/Factory;-><init>(Ljava/lang/String;Ljava/lang/Class;)V

    const-string v9, "method-execution"

    const-string v1, "2"

    const-string v2, "onSpentToggled"

    const-string v3, "com.ibotta.android.mvp.ui.activity.pwi.v2.barcode.PwiBarcodePresenterImpl"

    const-string v4, "com.ibotta.android.views.pwi.barcode.PwiBarcodeViewState"

    const-string v5, "viewState"

    const-string v6, ""

    const-string v7, "void"

    move-object v0, v8

    invoke-virtual/range {v0 .. v7}, Lorg/aspectj/runtime/reflect/Factory;->makeMethodSig(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lorg/aspectj/lang/reflect/MethodSignature;

    move-result-object v0

    const/16 v1, 0xc9

    invoke-virtual {v8, v9, v0, v1}, Lorg/aspectj/runtime/reflect/Factory;->makeSJP(Ljava/lang/String;Lorg/aspectj/lang/Signature;I)Lorg/aspectj/lang/JoinPoint$StaticPart;

    move-result-object v0

    sput-object v0, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/barcode/PwiBarcodePresenterImpl;->ajc$tjp_0:Lorg/aspectj/lang/JoinPoint$StaticPart;

    const-string v9, "method-execution"

    const-string v1, "1"

    const-string v2, "onCopyBarcodeClick"

    const-string v3, "com.ibotta.android.mvp.ui.activity.pwi.v2.barcode.PwiBarcodePresenterImpl"

    const-string v4, "com.ibotta.android.views.pwi.barcode.PwiBarcodeViewState"

    const-string v5, "viewState"

    const-string v6, ""

    const-string v7, "void"

    move-object v0, v8

    invoke-virtual/range {v0 .. v7}, Lorg/aspectj/runtime/reflect/Factory;->makeMethodSig(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lorg/aspectj/lang/reflect/MethodSignature;

    move-result-object v0

    const/16 v1, 0xd1

    invoke-virtual {v8, v9, v0, v1}, Lorg/aspectj/runtime/reflect/Factory;->makeSJP(Ljava/lang/String;Lorg/aspectj/lang/Signature;I)Lorg/aspectj/lang/JoinPoint$StaticPart;

    move-result-object v0

    sput-object v0, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/barcode/PwiBarcodePresenterImpl;->ajc$tjp_1:Lorg/aspectj/lang/JoinPoint$StaticPart;

    const-string v9, "method-execution"

    const-string v1, "1"

    const-string v2, "onTermsOfUseClick"

    const-string v3, "com.ibotta.android.mvp.ui.activity.pwi.v2.barcode.PwiBarcodePresenterImpl"

    const-string v4, "com.ibotta.android.views.pwi.barcode.PwiBarcodeViewState"

    const-string v5, "viewState"

    const-string v6, ""

    const-string v7, "void"

    move-object v0, v8

    invoke-virtual/range {v0 .. v7}, Lorg/aspectj/runtime/reflect/Factory;->makeMethodSig(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lorg/aspectj/lang/reflect/MethodSignature;

    move-result-object v0

    const/16 v1, 0xd7

    invoke-virtual {v8, v9, v0, v1}, Lorg/aspectj/runtime/reflect/Factory;->makeSJP(Ljava/lang/String;Lorg/aspectj/lang/Signature;I)Lorg/aspectj/lang/JoinPoint$StaticPart;

    move-result-object v0

    sput-object v0, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/barcode/PwiBarcodePresenterImpl;->ajc$tjp_2:Lorg/aspectj/lang/JoinPoint$StaticPart;

    const-string v9, "method-execution"

    const-string v1, "1"

    const-string v2, "onStartBarcodeLoading"

    const-string v3, "com.ibotta.android.mvp.ui.activity.pwi.v2.barcode.PwiBarcodePresenterImpl"

    const-string v4, ""

    const-string v5, ""

    const-string v6, ""

    const-string v7, "void"

    move-object v0, v8

    invoke-virtual/range {v0 .. v7}, Lorg/aspectj/runtime/reflect/Factory;->makeMethodSig(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lorg/aspectj/lang/reflect/MethodSignature;

    move-result-object v0

    const/16 v1, 0xe7

    invoke-virtual {v8, v9, v0, v1}, Lorg/aspectj/runtime/reflect/Factory;->makeSJP(Ljava/lang/String;Lorg/aspectj/lang/Signature;I)Lorg/aspectj/lang/JoinPoint$StaticPart;

    move-result-object v0

    sput-object v0, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/barcode/PwiBarcodePresenterImpl;->ajc$tjp_3:Lorg/aspectj/lang/JoinPoint$StaticPart;

    const-string v9, "method-execution"

    const-string v1, "1"

    const-string v2, "onStopBarcodeLoading"

    const-string v3, "com.ibotta.android.mvp.ui.activity.pwi.v2.barcode.PwiBarcodePresenterImpl"

    const-string v4, ""

    const-string v5, ""

    const-string v6, ""

    const-string v7, "void"

    move-object v0, v8

    invoke-virtual/range {v0 .. v7}, Lorg/aspectj/runtime/reflect/Factory;->makeMethodSig(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lorg/aspectj/lang/reflect/MethodSignature;

    move-result-object v0

    const/16 v1, 0xec

    invoke-virtual {v8, v9, v0, v1}, Lorg/aspectj/runtime/reflect/Factory;->makeSJP(Ljava/lang/String;Lorg/aspectj/lang/Signature;I)Lorg/aspectj/lang/JoinPoint$StaticPart;

    move-result-object v0

    sput-object v0, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/barcode/PwiBarcodePresenterImpl;->ajc$tjp_4:Lorg/aspectj/lang/JoinPoint$StaticPart;

    const-string v9, "method-execution"

    const-string v1, "1"

    const-string v2, "onRevealCardNumber"

    const-string v3, "com.ibotta.android.mvp.ui.activity.pwi.v2.barcode.PwiBarcodePresenterImpl"

    const-string v4, "com.ibotta.android.views.pwi.barcode.PwiBarcodeViewState"

    const-string v5, "viewState"

    const-string v6, ""

    const-string v7, "void"

    move-object v0, v8

    invoke-virtual/range {v0 .. v7}, Lorg/aspectj/runtime/reflect/Factory;->makeMethodSig(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lorg/aspectj/lang/reflect/MethodSignature;

    move-result-object v0

    const/16 v1, 0xfa

    invoke-virtual {v8, v9, v0, v1}, Lorg/aspectj/runtime/reflect/Factory;->makeSJP(Ljava/lang/String;Lorg/aspectj/lang/Signature;I)Lorg/aspectj/lang/JoinPoint$StaticPart;

    move-result-object v0

    sput-object v0, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/barcode/PwiBarcodePresenterImpl;->ajc$tjp_5:Lorg/aspectj/lang/JoinPoint$StaticPart;

    return-void
.end method

.method private onSpentToggled(Lcom/ibotta/android/views/pwi/barcode/PwiBarcodeViewState;)V
    .locals 3
    .param p1    # Lcom/ibotta/android/views/pwi/barcode/PwiBarcodeViewState;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation runtime Lcom/ibotta/android/aop/tracking/TrackingAfter;
        value = .enum Lcom/ibotta/android/aop/tracking/TrackingType;->PWI_SPENT_TOGGLE:Lcom/ibotta/android/aop/tracking/TrackingType;
    .end annotation

    sget-object v0, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/barcode/PwiBarcodePresenterImpl;->ajc$tjp_0:Lorg/aspectj/lang/JoinPoint$StaticPart;

    invoke-static {v0, p0, p0, p1}, Lorg/aspectj/runtime/reflect/Factory;->makeJP(Lorg/aspectj/lang/JoinPoint$StaticPart;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Lorg/aspectj/lang/JoinPoint;

    move-result-object v0

    .line 201
    :try_start_0
    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/barcode/PwiBarcodePresenterImpl;->pwiApiManager:Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/PwiApiManager;

    invoke-virtual {p1}, Lcom/ibotta/android/views/pwi/barcode/PwiBarcodeViewState;->getTxnId()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p1}, Lcom/ibotta/android/views/pwi/barcode/PwiBarcodeViewState;->isSpent()Z

    move-result p1

    if-nez p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    invoke-interface {v1, v2, p1}, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/PwiApiManager;->buildTransactionSpentJob(Ljava/lang/String;Z)Lcom/ibotta/android/service/api/job/SingleApiJob;

    move-result-object p1

    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/barcode/PwiBarcodePresenterImpl;->transactionSpentJob:Lcom/ibotta/android/service/api/job/SingleApiJob;

    .line 202
    iget-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/barcode/PwiBarcodePresenterImpl;->transactionSpentJob:Lcom/ibotta/android/service/api/job/SingleApiJob;

    invoke-virtual {p0, p1}, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/barcode/PwiBarcodePresenterImpl;->submitApiJob(Lcom/ibotta/android/service/api/job/ApiJob;)V
    :try_end_0
    .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0

    .line 203
    invoke-static {}, Lcom/ibotta/android/aop/tracking/TrackingAspect;->aspectOf()Lcom/ibotta/android/aop/tracking/TrackingAspect;

    move-result-object p1

    invoke-virtual {p1, v0}, Lcom/ibotta/android/aop/tracking/TrackingAspect;->after(Lorg/aspectj/lang/JoinPoint;)V

    return-void

    :catch_0
    move-exception p1

    invoke-static {}, Lcom/ibotta/android/aop/tracking/TrackingAspect;->aspectOf()Lcom/ibotta/android/aop/tracking/TrackingAspect;

    move-result-object v1

    invoke-virtual {v1, v0}, Lcom/ibotta/android/aop/tracking/TrackingAspect;->after(Lorg/aspectj/lang/JoinPoint;)V

    throw p1
.end method

.method private onUpdateRemainingBalance(Lcom/ibotta/android/views/pwi/barcode/PwiBarcodeViewState;D)V
    .locals 1

    .line 195
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/barcode/PwiBarcodePresenterImpl;->pwiApiManager:Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/PwiApiManager;

    invoke-virtual {p1}, Lcom/ibotta/android/views/pwi/barcode/PwiBarcodeViewState;->getTxnId()Ljava/lang/String;

    move-result-object p1

    invoke-interface {v0, p1, p2, p3}, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/PwiApiManager;->buildTransactionUpdateBalanceJob(Ljava/lang/String;D)Lcom/ibotta/android/service/api/job/SingleApiJob;

    move-result-object p1

    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/barcode/PwiBarcodePresenterImpl;->transactionSpentJob:Lcom/ibotta/android/service/api/job/SingleApiJob;

    .line 196
    iget-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/barcode/PwiBarcodePresenterImpl;->transactionSpentJob:Lcom/ibotta/android/service/api/job/SingleApiJob;

    invoke-virtual {p0, p1}, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/barcode/PwiBarcodePresenterImpl;->submitApiJob(Lcom/ibotta/android/service/api/job/ApiJob;)V

    return-void
.end method


# virtual methods
.method public getActivityClass()Ljava/lang/Class;
    .locals 1

    .line 244
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/barcode/PwiBarcodePresenterImpl;->mvpView:Lcom/ibotta/android/mvp/base/MvpView;

    check-cast v0, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/barcode/PwiBarcodeView;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    return-object v0
.end method

.method protected getFetchJobs()Ljava/util/Set;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Set<",
            "Lcom/ibotta/android/service/api/job/ApiJob;",
            ">;"
        }
    .end annotation

    .line 84
    new-instance v0, Ljava/util/HashSet;

    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    .line 86
    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/barcode/PwiBarcodePresenterImpl;->homeJob:Lcom/ibotta/android/service/api/job/HomeApiJob;

    if-nez v1, :cond_0

    .line 87
    new-instance v1, Lcom/ibotta/android/service/api/job/HomeApiJob;

    const/4 v2, 0x0

    invoke-direct {v1, v2}, Lcom/ibotta/android/service/api/job/HomeApiJob;-><init>(I)V

    iput-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/barcode/PwiBarcodePresenterImpl;->homeJob:Lcom/ibotta/android/service/api/job/HomeApiJob;

    .line 90
    :cond_0
    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/barcode/PwiBarcodePresenterImpl;->bgcTransactionJob:Lcom/ibotta/android/service/api/job/SingleApiJob;

    if-nez v1, :cond_1

    .line 91
    new-instance v1, Lcom/ibotta/android/service/api/job/SingleApiJob;

    new-instance v2, Lcom/ibotta/api/call/pwi/BgcTransactionByIdCall;

    iget-object v3, p0, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/barcode/PwiBarcodePresenterImpl;->userState:Lcom/ibotta/android/state/user/UserState;

    invoke-interface {v3}, Lcom/ibotta/android/state/user/UserState;->getCustomerId()I

    move-result v3

    iget-object v4, p0, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/barcode/PwiBarcodePresenterImpl;->transactionId:Ljava/lang/String;

    invoke-direct {v2, v3, v4}, Lcom/ibotta/api/call/pwi/BgcTransactionByIdCall;-><init>(ILjava/lang/String;)V

    invoke-direct {v1, v2}, Lcom/ibotta/android/service/api/job/SingleApiJob;-><init>(Lcom/ibotta/api/ApiCall;)V

    iput-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/barcode/PwiBarcodePresenterImpl;->bgcTransactionJob:Lcom/ibotta/android/service/api/job/SingleApiJob;

    .line 94
    :cond_1
    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/barcode/PwiBarcodePresenterImpl;->homeJob:Lcom/ibotta/android/service/api/job/HomeApiJob;

    invoke-interface {v0, v1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 95
    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/barcode/PwiBarcodePresenterImpl;->bgcTransactionJob:Lcom/ibotta/android/service/api/job/SingleApiJob;

    invoke-interface {v0, v1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    return-object v0
.end method

.method public getTransactionId()Ljava/lang/String;
    .locals 1

    .line 160
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/barcode/PwiBarcodePresenterImpl;->transactionId:Ljava/lang/String;

    return-object v0
.end method

.method protected onAbandonFetchJobs()V
    .locals 1

    const/4 v0, 0x0

    .line 102
    iput-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/barcode/PwiBarcodePresenterImpl;->homeJob:Lcom/ibotta/android/service/api/job/HomeApiJob;

    .line 103
    iput-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/barcode/PwiBarcodePresenterImpl;->bgcTransactionJob:Lcom/ibotta/android/service/api/job/SingleApiJob;

    .line 104
    iput-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/barcode/PwiBarcodePresenterImpl;->transactionSpentJob:Lcom/ibotta/android/service/api/job/SingleApiJob;

    return-void
.end method

.method public onCopyBarcodeClick(Lcom/ibotta/android/views/pwi/barcode/PwiBarcodeViewState;)V
    .locals 3
    .param p1    # Lcom/ibotta/android/views/pwi/barcode/PwiBarcodeViewState;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation runtime Lcom/ibotta/android/aop/tracking/TrackingAfter;
        value = .enum Lcom/ibotta/android/aop/tracking/TrackingType;->PWI_COPY_BARCODE_NUMBER:Lcom/ibotta/android/aop/tracking/TrackingType;
    .end annotation

    sget-object v0, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/barcode/PwiBarcodePresenterImpl;->ajc$tjp_1:Lorg/aspectj/lang/JoinPoint$StaticPart;

    invoke-static {v0, p0, p0, p1}, Lorg/aspectj/runtime/reflect/Factory;->makeJP(Lorg/aspectj/lang/JoinPoint$StaticPart;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Lorg/aspectj/lang/JoinPoint;

    move-result-object v0

    .line 209
    :try_start_0
    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/barcode/PwiBarcodePresenterImpl;->appHelper:Lcom/ibotta/android/util/AppHelper;

    invoke-virtual {p1}, Lcom/ibotta/android/views/pwi/barcode/PwiBarcodeViewState;->getCopyBarcodeNumberText()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p1}, Lcom/ibotta/android/views/pwi/barcode/PwiBarcodeViewState;->getBarcodeNumber()Ljava/lang/String;

    move-result-object p1

    invoke-interface {v1, v2, p1}, Lcom/ibotta/android/util/AppHelper;->copyToClipboard(Ljava/lang/String;Ljava/lang/String;)V

    .line 210
    iget-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/barcode/PwiBarcodePresenterImpl;->mvpView:Lcom/ibotta/android/mvp/base/MvpView;

    check-cast p1, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/barcode/PwiBarcodeView;

    invoke-interface {p1}, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/barcode/PwiBarcodeView;->onCopyBarcodeClick()V
    :try_end_0
    .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0

    .line 211
    invoke-static {}, Lcom/ibotta/android/aop/tracking/TrackingAspect;->aspectOf()Lcom/ibotta/android/aop/tracking/TrackingAspect;

    move-result-object p1

    invoke-virtual {p1, v0}, Lcom/ibotta/android/aop/tracking/TrackingAspect;->after(Lorg/aspectj/lang/JoinPoint;)V

    return-void

    :catch_0
    move-exception p1

    invoke-static {}, Lcom/ibotta/android/aop/tracking/TrackingAspect;->aspectOf()Lcom/ibotta/android/aop/tracking/TrackingAspect;

    move-result-object v1

    invoke-virtual {v1, v0}, Lcom/ibotta/android/aop/tracking/TrackingAspect;->after(Lorg/aspectj/lang/JoinPoint;)V

    throw p1
.end method

.method public onDoneClick()V
    .locals 1

    .line 225
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/barcode/PwiBarcodePresenterImpl;->mvpView:Lcom/ibotta/android/mvp/base/MvpView;

    check-cast v0, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/barcode/PwiBarcodeView;

    invoke-interface {v0}, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/barcode/PwiBarcodeView;->finish()V

    return-void
.end method

.method protected onFetchFinishedSuccessfully()V
    .locals 5

    .line 128
    :try_start_0
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/barcode/PwiBarcodePresenterImpl;->pwiApiManager:Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/PwiApiManager;

    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/barcode/PwiBarcodePresenterImpl;->bgcTransactionJob:Lcom/ibotta/android/service/api/job/SingleApiJob;

    invoke-interface {v0, v1}, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/PwiApiManager;->getTransactionFromJob(Lcom/ibotta/android/service/api/job/SingleApiJob;)Lcom/ibotta/api/model/pwi/BgcTransaction;

    move-result-object v0

    iput-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/barcode/PwiBarcodePresenterImpl;->bgcTransaction:Lcom/ibotta/api/model/pwi/BgcTransaction;
    :try_end_0
    .catch Lcom/ibotta/android/mvp/ui/activity/find/IllegalApiJobStateException; {:try_start_0 .. :try_end_0} :catch_2
    .catch Ljava/lang/IllegalStateException; {:try_start_0 .. :try_end_0} :catch_1

    .line 137
    :try_start_1
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/barcode/PwiBarcodePresenterImpl;->pwiApiManager:Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/PwiApiManager;

    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/barcode/PwiBarcodePresenterImpl;->homeJob:Lcom/ibotta/android/service/api/job/HomeApiJob;

    iget-object v2, p0, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/barcode/PwiBarcodePresenterImpl;->bgcTransaction:Lcom/ibotta/api/model/pwi/BgcTransaction;

    .line 138
    invoke-virtual {v2}, Lcom/ibotta/api/model/pwi/BgcTransaction;->getRetailerId()I

    move-result v2

    .line 137
    invoke-interface {v0, v1, v2}, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/PwiApiManager;->getOptionalRetailerModelWithRetailerIdFromJob(Lcom/ibotta/android/service/api/job/HomeApiJob;I)Lcom/ibotta/api/model/RetailerModel;

    move-result-object v0

    iput-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/barcode/PwiBarcodePresenterImpl;->retailerModel:Lcom/ibotta/api/model/RetailerModel;
    :try_end_1
    .catch Lcom/ibotta/android/mvp/ui/activity/find/IllegalApiJobStateException; {:try_start_1 .. :try_end_1} :catch_0

    .line 145
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/barcode/PwiBarcodePresenterImpl;->mvpView:Lcom/ibotta/android/mvp/base/MvpView;

    check-cast v0, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/barcode/PwiBarcodeView;

    invoke-interface {v0, p0}, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/barcode/PwiBarcodeView;->bindViewEvents(Lcom/ibotta/android/views/pwi/barcode/PwiBarcodeViewEvents;)V

    .line 146
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/barcode/PwiBarcodePresenterImpl;->mvpView:Lcom/ibotta/android/mvp/base/MvpView;

    check-cast v0, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/barcode/PwiBarcodeView;

    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/barcode/PwiBarcodePresenterImpl;->pwiBarcodeReducer:Lcom/ibotta/android/pwi/PwiBarcodeReducer;

    iget-object v2, p0, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/barcode/PwiBarcodePresenterImpl;->retailerModel:Lcom/ibotta/api/model/RetailerModel;

    iget-object v3, p0, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/barcode/PwiBarcodePresenterImpl;->bgcTransaction:Lcom/ibotta/api/model/pwi/BgcTransaction;

    invoke-virtual {v1, v2, v3}, Lcom/ibotta/android/pwi/PwiBarcodeReducer;->createPwiBarcodeViewState(Lcom/ibotta/api/model/RetailerModel;Lcom/ibotta/api/model/pwi/BgcTransaction;)Lcom/ibotta/android/views/pwi/barcode/PwiBarcodeViewState;

    move-result-object v1

    invoke-interface {v0, v1}, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/barcode/PwiBarcodeView;->updateViewState(Lcom/ibotta/android/views/pwi/barcode/PwiBarcodeViewState;)V

    .line 147
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/barcode/PwiBarcodePresenterImpl;->pwiUserState:Lcom/ibotta/android/state/pwi/PwiUserState;

    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/barcode/PwiBarcodePresenterImpl;->bgcTransaction:Lcom/ibotta/api/model/pwi/BgcTransaction;

    invoke-virtual {v1}, Lcom/ibotta/api/model/pwi/BgcTransaction;->getUuid()Ljava/lang/String;

    move-result-object v1

    iget-object v2, p0, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/barcode/PwiBarcodePresenterImpl;->bgcTransaction:Lcom/ibotta/api/model/pwi/BgcTransaction;

    invoke-virtual {v2}, Lcom/ibotta/api/model/pwi/BgcTransaction;->getRetailerId()I

    move-result v2

    invoke-interface {v0, v1, v2}, Lcom/ibotta/android/state/pwi/PwiUserState;->removePendingTransaction(Ljava/lang/String;I)V

    const-string v0, "Transactions Updated Balance: %f"

    const/4 v1, 0x1

    .line 150
    new-array v1, v1, [Ljava/lang/Object;

    const/4 v2, 0x0

    iget-object v3, p0, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/barcode/PwiBarcodePresenterImpl;->bgcTransaction:Lcom/ibotta/api/model/pwi/BgcTransaction;

    invoke-virtual {v3}, Lcom/ibotta/api/model/pwi/BgcTransaction;->getUpdatedBalance()D

    move-result-wide v3

    invoke-static {v3, v4}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v3

    aput-object v3, v1, v2

    invoke-static {v0, v1}, Ltimber/log/Timber;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    return-void

    :catch_0
    move-exception v0

    .line 140
    sget-object v1, Lcom/ibotta/android/crash/IbottaCrashProxy;->IbottaCrashManager:Lcom/ibotta/android/crash/CrashManager;

    invoke-virtual {v1, v0}, Lcom/ibotta/android/crash/CrashManager;->trackException(Ljava/lang/Throwable;)V

    .line 141
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/barcode/PwiBarcodePresenterImpl;->mvpView:Lcom/ibotta/android/mvp/base/MvpView;

    check-cast v0, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/barcode/PwiBarcodeView;

    invoke-interface {v0}, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/barcode/PwiBarcodeView;->finish()V

    return-void

    :catch_1
    move-exception v0

    goto :goto_0

    :catch_2
    move-exception v0

    .line 130
    :goto_0
    sget-object v1, Lcom/ibotta/android/crash/IbottaCrashProxy;->IbottaCrashManager:Lcom/ibotta/android/crash/CrashManager;

    invoke-virtual {v1, v0}, Lcom/ibotta/android/crash/CrashManager;->trackException(Ljava/lang/Throwable;)V

    .line 131
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/barcode/PwiBarcodePresenterImpl;->mvpView:Lcom/ibotta/android/mvp/base/MvpView;

    check-cast v0, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/barcode/PwiBarcodeView;

    invoke-interface {v0}, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/barcode/PwiBarcodeView;->finish()V

    return-void
.end method

.method public onRevealCardNumber(Lcom/ibotta/android/views/pwi/barcode/PwiBarcodeViewState;)V
    .locals 1
    .annotation runtime Lcom/ibotta/android/aop/tracking/TrackingAfter;
        value = .enum Lcom/ibotta/android/aop/tracking/TrackingType;->PWI_REVEAL_CARD_NUMBER:Lcom/ibotta/android/aop/tracking/TrackingType;
    .end annotation

    sget-object v0, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/barcode/PwiBarcodePresenterImpl;->ajc$tjp_5:Lorg/aspectj/lang/JoinPoint$StaticPart;

    invoke-static {v0, p0, p0, p1}, Lorg/aspectj/runtime/reflect/Factory;->makeJP(Lorg/aspectj/lang/JoinPoint$StaticPart;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Lorg/aspectj/lang/JoinPoint;

    move-result-object p1

    .line 250
    invoke-static {}, Lcom/ibotta/android/aop/tracking/TrackingAspect;->aspectOf()Lcom/ibotta/android/aop/tracking/TrackingAspect;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcom/ibotta/android/aop/tracking/TrackingAspect;->after(Lorg/aspectj/lang/JoinPoint;)V

    return-void
.end method

.method public onStartBarcodeLoading()V
    .locals 2
    .annotation runtime Lcom/ibotta/android/aop/tracking/newrelic/NewRelicTimingStart;
        value = .enum Lcom/ibotta/android/aop/tracking/newrelic/NewRelicTimingType;->PWI_BARCODE_LOAD:Lcom/ibotta/android/aop/tracking/newrelic/NewRelicTimingType;
    .end annotation

    sget-object v0, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/barcode/PwiBarcodePresenterImpl;->ajc$tjp_3:Lorg/aspectj/lang/JoinPoint$StaticPart;

    invoke-static {v0, p0, p0}, Lorg/aspectj/runtime/reflect/Factory;->makeJP(Lorg/aspectj/lang/JoinPoint$StaticPart;Ljava/lang/Object;Ljava/lang/Object;)Lorg/aspectj/lang/JoinPoint;

    move-result-object v0

    .line 231
    invoke-static {}, Lcom/ibotta/android/aop/tracking/newrelic/NewRelicTimingAspect;->aspectOf()Lcom/ibotta/android/aop/tracking/newrelic/NewRelicTimingAspect;

    move-result-object v1

    invoke-virtual {v1, v0}, Lcom/ibotta/android/aop/tracking/newrelic/NewRelicTimingAspect;->before(Lorg/aspectj/lang/JoinPoint;)V

    return-void
.end method

.method public onStopBarcodeLoading()V
    .locals 2
    .annotation runtime Lcom/ibotta/android/aop/tracking/newrelic/NewRelicTimingStop;
        value = .enum Lcom/ibotta/android/aop/tracking/newrelic/NewRelicTimingType;->PWI_BARCODE_LOAD:Lcom/ibotta/android/aop/tracking/newrelic/NewRelicTimingType;
    .end annotation

    sget-object v0, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/barcode/PwiBarcodePresenterImpl;->ajc$tjp_4:Lorg/aspectj/lang/JoinPoint$StaticPart;

    invoke-static {v0, p0, p0}, Lorg/aspectj/runtime/reflect/Factory;->makeJP(Lorg/aspectj/lang/JoinPoint$StaticPart;Ljava/lang/Object;Ljava/lang/Object;)Lorg/aspectj/lang/JoinPoint;

    move-result-object v0

    .line 236
    invoke-static {}, Lcom/ibotta/android/aop/tracking/newrelic/NewRelicTimingAspect;->aspectOf()Lcom/ibotta/android/aop/tracking/newrelic/NewRelicTimingAspect;

    move-result-object v1

    invoke-virtual {v1, v0}, Lcom/ibotta/android/aop/tracking/newrelic/NewRelicTimingAspect;->after(Lorg/aspectj/lang/JoinPoint;)V

    return-void
.end method

.method protected onSubmitJobSuccess(Lcom/ibotta/android/service/api/job/SingleApiJob;)V
    .locals 3

    .line 109
    invoke-super {p0, p1}, Lcom/ibotta/android/mvp/base/loading/AbstractLoadingMvpPresenter;->onSubmitJobSuccess(Lcom/ibotta/android/service/api/job/SingleApiJob;)V

    .line 111
    invoke-virtual {p1}, Lcom/ibotta/android/service/api/job/SingleApiJob;->getApiCall()Lcom/ibotta/api/ApiCall;

    move-result-object v0

    instance-of v0, v0, Lcom/ibotta/api/call/pwi/BgcTransactionSpentPutCall;

    if-eqz v0, :cond_0

    .line 113
    :try_start_0
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/barcode/PwiBarcodePresenterImpl;->pwiApiManager:Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/PwiApiManager;

    invoke-interface {v0, p1}, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/PwiApiManager;->getTransactionFromJob(Lcom/ibotta/android/service/api/job/SingleApiJob;)Lcom/ibotta/api/model/pwi/BgcTransaction;

    move-result-object v0

    iput-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/barcode/PwiBarcodePresenterImpl;->bgcTransaction:Lcom/ibotta/api/model/pwi/BgcTransaction;
    :try_end_0
    .catch Lcom/ibotta/android/mvp/ui/activity/find/IllegalApiJobStateException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/IllegalStateException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_1

    :catch_0
    move-exception v0

    goto :goto_0

    :catch_1
    move-exception v0

    .line 115
    :goto_0
    sget-object v1, Lcom/ibotta/android/crash/IbottaCrashProxy;->IbottaCrashManager:Lcom/ibotta/android/crash/CrashManager;

    invoke-virtual {v1, v0}, Lcom/ibotta/android/crash/CrashManager;->trackException(Ljava/lang/Throwable;)V

    .line 116
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/barcode/PwiBarcodePresenterImpl;->mvpView:Lcom/ibotta/android/mvp/base/MvpView;

    check-cast v0, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/barcode/PwiBarcodeView;

    invoke-interface {v0}, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/barcode/PwiBarcodeView;->finish()V

    .line 118
    :goto_1
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/barcode/PwiBarcodePresenterImpl;->pwiApiManager:Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/PwiApiManager;

    invoke-interface {v0, p1}, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/PwiApiManager;->updateCacheOnSuccessfulPurchase(Lcom/ibotta/android/service/api/job/SingleApiJob;)V

    .line 119
    iget-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/barcode/PwiBarcodePresenterImpl;->mvpView:Lcom/ibotta/android/mvp/base/MvpView;

    check-cast p1, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/barcode/PwiBarcodeView;

    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/barcode/PwiBarcodePresenterImpl;->pwiBarcodeReducer:Lcom/ibotta/android/pwi/PwiBarcodeReducer;

    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/barcode/PwiBarcodePresenterImpl;->retailerModel:Lcom/ibotta/api/model/RetailerModel;

    iget-object v2, p0, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/barcode/PwiBarcodePresenterImpl;->bgcTransaction:Lcom/ibotta/api/model/pwi/BgcTransaction;

    invoke-virtual {v0, v1, v2}, Lcom/ibotta/android/pwi/PwiBarcodeReducer;->createPwiBarcodeViewState(Lcom/ibotta/api/model/RetailerModel;Lcom/ibotta/api/model/pwi/BgcTransaction;)Lcom/ibotta/android/views/pwi/barcode/PwiBarcodeViewState;

    move-result-object v0

    invoke-interface {p1, v0}, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/barcode/PwiBarcodeView;->updateViewState(Lcom/ibotta/android/views/pwi/barcode/PwiBarcodeViewState;)V

    .line 120
    iget-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/barcode/PwiBarcodePresenterImpl;->mvpView:Lcom/ibotta/android/mvp/base/MvpView;

    check-cast p1, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/barcode/PwiBarcodeView;

    invoke-interface {p1}, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/barcode/PwiBarcodeView;->onSpentToggled()V

    :cond_0
    return-void
.end method

.method public onTermsOfUseClick(Lcom/ibotta/android/views/pwi/barcode/PwiBarcodeViewState;)V
    .locals 3
    .param p1    # Lcom/ibotta/android/views/pwi/barcode/PwiBarcodeViewState;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation runtime Lcom/ibotta/android/aop/tracking/TrackingAfter;
        value = .enum Lcom/ibotta/android/aop/tracking/TrackingType;->PWI_TERMS_AND_CONDITIONS:Lcom/ibotta/android/aop/tracking/TrackingType;
    .end annotation

    sget-object v0, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/barcode/PwiBarcodePresenterImpl;->ajc$tjp_2:Lorg/aspectj/lang/JoinPoint$StaticPart;

    invoke-static {v0, p0, p0, p1}, Lorg/aspectj/runtime/reflect/Factory;->makeJP(Lorg/aspectj/lang/JoinPoint$StaticPart;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Lorg/aspectj/lang/JoinPoint;

    move-result-object p1

    .line 215
    :try_start_0
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/barcode/PwiBarcodePresenterImpl;->mvpView:Lcom/ibotta/android/mvp/base/MvpView;

    check-cast v0, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/barcode/PwiBarcodeView;

    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/barcode/PwiBarcodePresenterImpl;->pwiBarcodeReducer:Lcom/ibotta/android/pwi/PwiBarcodeReducer;

    iget-object v2, p0, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/barcode/PwiBarcodePresenterImpl;->bgcTransaction:Lcom/ibotta/api/model/pwi/BgcTransaction;

    invoke-virtual {v1, v2}, Lcom/ibotta/android/pwi/PwiBarcodeReducer;->createTermsSemiModalViewState(Lcom/ibotta/api/model/pwi/BgcTransaction;)Lcom/ibotta/android/views/messages/alert/SemiModalViewState;

    move-result-object v1

    invoke-interface {v0, v1}, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/barcode/PwiBarcodeView;->onTermsOfUseClick(Lcom/ibotta/android/views/messages/alert/SemiModalViewState;)V
    :try_end_0
    .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0

    .line 216
    invoke-static {}, Lcom/ibotta/android/aop/tracking/TrackingAspect;->aspectOf()Lcom/ibotta/android/aop/tracking/TrackingAspect;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcom/ibotta/android/aop/tracking/TrackingAspect;->after(Lorg/aspectj/lang/JoinPoint;)V

    return-void

    :catch_0
    move-exception v0

    invoke-static {}, Lcom/ibotta/android/aop/tracking/TrackingAspect;->aspectOf()Lcom/ibotta/android/aop/tracking/TrackingAspect;

    move-result-object v1

    invoke-virtual {v1, p1}, Lcom/ibotta/android/aop/tracking/TrackingAspect;->after(Lorg/aspectj/lang/JoinPoint;)V

    throw v0
.end method

.method public onUpdateBalanceActionsDialogClicked(Lcom/ibotta/android/views/pwi/barcode/PwiBarcodeViewState;Lcom/ibotta/android/mvp/ui/dialog/CustomBottomSheetDialog$CustomBottomSheetOption;)V
    .locals 1

    .line 165
    invoke-virtual {p2}, Lcom/ibotta/android/mvp/ui/dialog/CustomBottomSheetDialog$CustomBottomSheetOption;->getId()I

    move-result v0

    packed-switch v0, :pswitch_data_0

    goto :goto_0

    .line 172
    :pswitch_0
    invoke-direct {p0, p1}, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/barcode/PwiBarcodePresenterImpl;->onSpentToggled(Lcom/ibotta/android/views/pwi/barcode/PwiBarcodeViewState;)V

    goto :goto_0

    .line 169
    :pswitch_1
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/barcode/PwiBarcodePresenterImpl;->mvpView:Lcom/ibotta/android/mvp/base/MvpView;

    check-cast v0, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/barcode/PwiBarcodeView;

    invoke-virtual {p2}, Lcom/ibotta/android/mvp/ui/dialog/CustomBottomSheetDialog$CustomBottomSheetOption;->getId()I

    move-result p2

    invoke-interface {v0, p1, p2}, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/barcode/PwiBarcodeView;->showEditUpdateBalanceDialog(Lcom/ibotta/android/views/pwi/barcode/PwiBarcodeViewState;I)V

    :goto_0
    return-void

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_1
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public onUpdateBalanceClick(Lcom/ibotta/android/views/pwi/barcode/PwiBarcodeViewState;)V
    .locals 1
    .param p1    # Lcom/ibotta/android/views/pwi/barcode/PwiBarcodeViewState;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    .line 220
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/barcode/PwiBarcodePresenterImpl;->mvpView:Lcom/ibotta/android/mvp/base/MvpView;

    check-cast v0, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/barcode/PwiBarcodeView;

    invoke-interface {v0, p1}, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/barcode/PwiBarcodeView;->onUpdateBalanceClick(Lcom/ibotta/android/views/pwi/barcode/PwiBarcodeViewState;)V

    return-void
.end method

.method public onUpdateBalanceReceived(Lcom/ibotta/android/views/pwi/barcode/PwiBarcodeViewState;ILjava/lang/String;)V
    .locals 2

    packed-switch p2, :pswitch_data_0

    goto :goto_0

    .line 187
    :pswitch_0
    iget-object p2, p0, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/barcode/PwiBarcodePresenterImpl;->formatting:Lcom/ibotta/android/util/Formatting;

    invoke-interface {p2, p3}, Lcom/ibotta/android/util/Formatting;->currencyFromString(Ljava/lang/String;)D

    move-result-wide p2

    invoke-direct {p0, p1, p2, p3}, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/barcode/PwiBarcodePresenterImpl;->onUpdateRemainingBalance(Lcom/ibotta/android/views/pwi/barcode/PwiBarcodeViewState;D)V

    goto :goto_0

    .line 182
    :pswitch_1
    iget-object p2, p0, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/barcode/PwiBarcodePresenterImpl;->formatting:Lcom/ibotta/android/util/Formatting;

    .line 184
    invoke-virtual {p1}, Lcom/ibotta/android/views/pwi/barcode/PwiBarcodeViewState;->getGiftCardAmount()Ljava/lang/String;

    move-result-object v0

    invoke-interface {p2, v0}, Lcom/ibotta/android/util/Formatting;->currencyFromString(Ljava/lang/String;)D

    move-result-wide v0

    iget-object p2, p0, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/barcode/PwiBarcodePresenterImpl;->formatting:Lcom/ibotta/android/util/Formatting;

    invoke-interface {p2, p3}, Lcom/ibotta/android/util/Formatting;->currencyFromString(Ljava/lang/String;)D

    move-result-wide p2

    sub-double/2addr v0, p2

    .line 182
    invoke-direct {p0, p1, v0, v1}, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/barcode/PwiBarcodePresenterImpl;->onUpdateRemainingBalance(Lcom/ibotta/android/views/pwi/barcode/PwiBarcodeViewState;D)V

    :goto_0
    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public setTransactionId(Ljava/lang/String;)V
    .locals 0

    .line 155
    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/barcode/PwiBarcodePresenterImpl;->transactionId:Ljava/lang/String;

    return-void
.end method
