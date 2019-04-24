.class public Lcom/ibotta/android/mvp/ui/activity/pwi/v2/card/PwiCardInputPresenterImpl;
.super Lcom/ibotta/android/mvp/base/loading/AbstractLoadingMvpPresenter;
.source "PwiCardInputPresenterImpl.java"

# interfaces
.implements Lcom/ibotta/android/aop/tracking/advice/PwiAddPaymentMethodAdviceFields;
.implements Lcom/ibotta/android/mvp/ui/activity/pwi/v2/card/PwiCardInputPresenter;
.implements Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/StripeManagerListener;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/ibotta/android/mvp/base/loading/AbstractLoadingMvpPresenter<",
        "Lcom/ibotta/android/mvp/ui/activity/pwi/v2/card/PwiCardInputView;",
        ">;",
        "Lcom/ibotta/android/aop/tracking/advice/PwiAddPaymentMethodAdviceFields;",
        "Lcom/ibotta/android/mvp/ui/activity/pwi/v2/card/PwiCardInputPresenter;",
        "Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/StripeManagerListener;"
    }
.end annotation


# static fields
.field private static final synthetic ajc$tjp_0:Lorg/aspectj/lang/JoinPoint$StaticPart;

.field private static final synthetic ajc$tjp_1:Lorg/aspectj/lang/JoinPoint$StaticPart;

.field private static final synthetic ajc$tjp_2:Lorg/aspectj/lang/JoinPoint$StaticPart;


# instance fields
.field private final appCache:Lcom/ibotta/android/appcache/AppCache;

.field private isFirstTimeCard:Z

.field private final pwiApiManager:Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/PwiApiManager;

.field private final pwiErrorDialogFactory:Lcom/ibotta/android/mvp/ui/activity/pwi/PwiErrorDialogFactory;

.field private final pwiVariant:Lcom/ibotta/android/features/variant/pwi/PwiVariant;

.field private stripeSource:Lcom/stripe/android/model/Source;

.field private final userState:Lcom/ibotta/android/state/user/UserState;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    .line 1
    invoke-static {}, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/card/PwiCardInputPresenterImpl;->ajc$preClinit()V

    return-void
.end method

.method public constructor <init>(Lcom/ibotta/android/mvp/base/MvpPresenterActions;Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/PwiApiManager;Lcom/ibotta/android/state/user/UserState;Lcom/ibotta/android/mvp/ui/activity/pwi/PwiErrorDialogFactory;Lcom/ibotta/android/appcache/AppCache;Lcom/ibotta/android/features/variant/pwi/PwiVariant;)V
    .locals 0

    .line 65
    invoke-direct {p0, p1}, Lcom/ibotta/android/mvp/base/loading/AbstractLoadingMvpPresenter;-><init>(Lcom/ibotta/android/mvp/base/MvpPresenterActions;)V

    const/4 p1, 0x0

    .line 49
    iput-boolean p1, p0, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/card/PwiCardInputPresenterImpl;->isFirstTimeCard:Z

    .line 66
    iput-object p2, p0, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/card/PwiCardInputPresenterImpl;->pwiApiManager:Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/PwiApiManager;

    .line 67
    iput-object p3, p0, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/card/PwiCardInputPresenterImpl;->userState:Lcom/ibotta/android/state/user/UserState;

    .line 68
    iput-object p4, p0, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/card/PwiCardInputPresenterImpl;->pwiErrorDialogFactory:Lcom/ibotta/android/mvp/ui/activity/pwi/PwiErrorDialogFactory;

    .line 69
    iput-object p5, p0, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/card/PwiCardInputPresenterImpl;->appCache:Lcom/ibotta/android/appcache/AppCache;

    .line 70
    iput-object p6, p0, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/card/PwiCardInputPresenterImpl;->pwiVariant:Lcom/ibotta/android/features/variant/pwi/PwiVariant;

    .line 72
    invoke-interface {p2, p0}, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/PwiApiManager;->setStripeManagerListener(Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/StripeManagerListener;)V

    return-void
.end method

.method private static synthetic ajc$preClinit()V
    .locals 10

    .line 1
    new-instance v8, Lorg/aspectj/runtime/reflect/Factory;

    const-string v0, "PwiCardInputPresenterImpl.java"

    const-class v1, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/card/PwiCardInputPresenterImpl;

    invoke-direct {v8, v0, v1}, Lorg/aspectj/runtime/reflect/Factory;-><init>(Ljava/lang/String;Ljava/lang/Class;)V

    const-string v9, "method-execution"

    const-string v1, "2"

    const-string v2, "handleIgcError"

    const-string v3, "com.ibotta.android.mvp.ui.activity.pwi.v2.card.PwiCardInputPresenterImpl"

    const-string v4, "com.ibotta.api.model.pwi.PwiError:int"

    const-string v5, "pwiError:httpCode"

    const-string v6, ""

    const-string v7, "void"

    move-object v0, v8

    invoke-virtual/range {v0 .. v7}, Lorg/aspectj/runtime/reflect/Factory;->makeMethodSig(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lorg/aspectj/lang/reflect/MethodSignature;

    move-result-object v0

    const/16 v1, 0x75

    invoke-virtual {v8, v9, v0, v1}, Lorg/aspectj/runtime/reflect/Factory;->makeSJP(Ljava/lang/String;Lorg/aspectj/lang/Signature;I)Lorg/aspectj/lang/JoinPoint$StaticPart;

    move-result-object v0

    sput-object v0, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/card/PwiCardInputPresenterImpl;->ajc$tjp_0:Lorg/aspectj/lang/JoinPoint$StaticPart;

    const-string v9, "method-execution"

    const-string v1, "2"

    const-string v2, "handlePostPaymentAccountsResponse"

    const-string v3, "com.ibotta.android.mvp.ui.activity.pwi.v2.card.PwiCardInputPresenterImpl"

    const-string v4, "com.ibotta.api.call.pwi.BgcPaymentAccountsResponse"

    const-string v5, "paymentAccountsResp"

    const-string v6, ""

    const-string v7, "void"

    move-object v0, v8

    invoke-virtual/range {v0 .. v7}, Lorg/aspectj/runtime/reflect/Factory;->makeMethodSig(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lorg/aspectj/lang/reflect/MethodSignature;

    move-result-object v0

    const/16 v1, 0x7f

    invoke-virtual {v8, v9, v0, v1}, Lorg/aspectj/runtime/reflect/Factory;->makeSJP(Ljava/lang/String;Lorg/aspectj/lang/Signature;I)Lorg/aspectj/lang/JoinPoint$StaticPart;

    move-result-object v0

    sput-object v0, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/card/PwiCardInputPresenterImpl;->ajc$tjp_1:Lorg/aspectj/lang/JoinPoint$StaticPart;

    const-string v9, "method-execution"

    const-string v1, "1"

    const-string v2, "onCreateSourceError"

    const-string v3, "com.ibotta.android.mvp.ui.activity.pwi.v2.card.PwiCardInputPresenterImpl"

    const-string v4, "java.lang.Exception"

    const-string v5, "exception"

    const-string v6, ""

    const-string v7, "void"

    move-object v0, v8

    invoke-virtual/range {v0 .. v7}, Lorg/aspectj/runtime/reflect/Factory;->makeMethodSig(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lorg/aspectj/lang/reflect/MethodSignature;

    move-result-object v0

    const/16 v1, 0xac

    invoke-virtual {v8, v9, v0, v1}, Lorg/aspectj/runtime/reflect/Factory;->makeSJP(Ljava/lang/String;Lorg/aspectj/lang/Signature;I)Lorg/aspectj/lang/JoinPoint$StaticPart;

    move-result-object v0

    sput-object v0, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/card/PwiCardInputPresenterImpl;->ajc$tjp_2:Lorg/aspectj/lang/JoinPoint$StaticPart;

    return-void
.end method

.method private handleIgcError(Lcom/ibotta/api/model/pwi/PwiError;I)V
    .locals 5
    .param p1    # Lcom/ibotta/api/model/pwi/PwiError;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param
    .annotation runtime Lcom/ibotta/android/aop/tracking/TrackingAfter;
        value = .enum Lcom/ibotta/android/aop/tracking/TrackingType;->PWI_ADD_PAYMENT_METHOD:Lcom/ibotta/android/aop/tracking/TrackingType;
    .end annotation

    sget-object v0, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/card/PwiCardInputPresenterImpl;->ajc$tjp_0:Lorg/aspectj/lang/JoinPoint$StaticPart;

    invoke-static {p2}, Lorg/aspectj/runtime/internal/Conversions;->intObject(I)Ljava/lang/Object;

    move-result-object v1

    invoke-static {v0, p0, p0, p1, v1}, Lorg/aspectj/runtime/reflect/Factory;->makeJP(Lorg/aspectj/lang/JoinPoint$StaticPart;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Lorg/aspectj/lang/JoinPoint;

    move-result-object v0

    .line 117
    :try_start_0
    sget-object v1, Lcom/ibotta/android/crash/IbottaCrashProxy;->IbottaCrashManager:Lcom/ibotta/android/crash/CrashManager;

    new-instance v2, Lcom/ibotta/android/mvp/ui/activity/pwi/PwiErrorException;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "IGC Error with http response code of: "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    const-string v3, ""

    invoke-direct {v2, p2, p1, v3}, Lcom/ibotta/android/mvp/ui/activity/pwi/PwiErrorException;-><init>(Ljava/lang/String;Lcom/ibotta/api/model/pwi/PwiError;Ljava/lang/String;)V

    invoke-virtual {v1, v2}, Lcom/ibotta/android/crash/CrashManager;->trackException(Ljava/lang/Throwable;)V

    .line 120
    iget-object p2, p0, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/card/PwiCardInputPresenterImpl;->pwiErrorDialogFactory:Lcom/ibotta/android/mvp/ui/activity/pwi/PwiErrorDialogFactory;

    invoke-virtual {p2, p1}, Lcom/ibotta/android/mvp/ui/activity/pwi/PwiErrorDialogFactory;->generateDialogViewStateFromError(Lcom/ibotta/api/model/pwi/PwiError;)Lcom/ibotta/android/views/messages/alert/SemiModalViewState;

    move-result-object p1

    .line 121
    iget-object p2, p0, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/card/PwiCardInputPresenterImpl;->mvpView:Lcom/ibotta/android/mvp/base/MvpView;

    check-cast p2, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/card/PwiCardInputView;

    invoke-interface {p2}, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/card/PwiCardInputView;->hideSubmittedJobLoading()V

    .line 122
    iget-object p2, p0, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/card/PwiCardInputPresenterImpl;->mvpView:Lcom/ibotta/android/mvp/base/MvpView;

    check-cast p2, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/card/PwiCardInputView;

    sget-object v1, Lcom/ibotta/android/views/messages/alert/SemiModalViewEvents;->Companion:Lcom/ibotta/android/views/messages/alert/SemiModalViewEvents$Companion;

    invoke-virtual {v1}, Lcom/ibotta/android/views/messages/alert/SemiModalViewEvents$Companion;->getNO_OP()Lcom/ibotta/android/views/messages/alert/SemiModalViewEvents;

    move-result-object v1

    invoke-interface {p2, p1, v1}, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/card/PwiCardInputView;->showErrorDialog(Lcom/ibotta/android/views/messages/alert/SemiModalViewState;Lcom/ibotta/android/views/messages/alert/SemiModalViewEvents;)V
    :try_end_0
    .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0

    .line 123
    invoke-static {}, Lcom/ibotta/android/aop/tracking/TrackingAspect;->aspectOf()Lcom/ibotta/android/aop/tracking/TrackingAspect;

    move-result-object p1

    invoke-virtual {p1, v0}, Lcom/ibotta/android/aop/tracking/TrackingAspect;->after(Lorg/aspectj/lang/JoinPoint;)V

    return-void

    :catch_0
    move-exception p1

    invoke-static {}, Lcom/ibotta/android/aop/tracking/TrackingAspect;->aspectOf()Lcom/ibotta/android/aop/tracking/TrackingAspect;

    move-result-object p2

    invoke-virtual {p2, v0}, Lcom/ibotta/android/aop/tracking/TrackingAspect;->after(Lorg/aspectj/lang/JoinPoint;)V

    throw p1
.end method

.method private handlePostPaymentAccountsResponse(Lcom/ibotta/api/call/pwi/BgcPaymentAccountsResponse;)V
    .locals 4
    .annotation runtime Lcom/ibotta/android/aop/tracking/TrackingAfter;
        value = .enum Lcom/ibotta/android/aop/tracking/TrackingType;->PWI_ADD_PAYMENT_METHOD:Lcom/ibotta/android/aop/tracking/TrackingType;
    .end annotation

    sget-object v0, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/card/PwiCardInputPresenterImpl;->ajc$tjp_1:Lorg/aspectj/lang/JoinPoint$StaticPart;

    invoke-static {v0, p0, p0, p1}, Lorg/aspectj/runtime/reflect/Factory;->makeJP(Lorg/aspectj/lang/JoinPoint$StaticPart;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Lorg/aspectj/lang/JoinPoint;

    move-result-object v0

    .line 127
    :try_start_0
    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/card/PwiCardInputPresenterImpl;->appCache:Lcom/ibotta/android/appcache/AppCache;

    iget-object v2, p0, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/card/PwiCardInputPresenterImpl;->userState:Lcom/ibotta/android/state/user/UserState;

    .line 128
    invoke-interface {v2}, Lcom/ibotta/android/state/user/UserState;->getCustomerId()I

    move-result v2

    iget-object v3, p0, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/card/PwiCardInputPresenterImpl;->pwiVariant:Lcom/ibotta/android/features/variant/pwi/PwiVariant;

    invoke-interface {v3}, Lcom/ibotta/android/features/variant/pwi/PwiVariant;->isProduction()Z

    move-result v3

    .line 127
    invoke-interface {v1, v2, p1, v3}, Lcom/ibotta/android/appcache/AppCache;->updateCustomerPaymentAccounts(ILcom/ibotta/api/call/pwi/BgcPaymentAccountsResponse;Z)V

    .line 129
    invoke-virtual {p1}, Lcom/ibotta/api/call/pwi/BgcPaymentAccountsResponse;->getBgcPaymentAccount()Lcom/ibotta/api/model/pwi/BgcPaymentAccount;

    move-result-object p1

    .line 132
    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/card/PwiCardInputPresenterImpl;->pwiApiManager:Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/PwiApiManager;

    invoke-interface {v1, p1}, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/PwiApiManager;->initStripeCustomerSession(Lcom/ibotta/api/model/pwi/BgcPaymentAccount;)V

    .line 133
    iget-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/card/PwiCardInputPresenterImpl;->pwiApiManager:Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/PwiApiManager;

    invoke-interface {p1}, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/PwiApiManager;->retrieveStripeCurrentCustomer()V

    .line 134
    iget-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/card/PwiCardInputPresenterImpl;->mvpView:Lcom/ibotta/android/mvp/base/MvpView;

    check-cast p1, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/card/PwiCardInputView;

    invoke-interface {p1}, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/card/PwiCardInputView;->hideSubmittedJobLoading()V

    .line 135
    iget-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/card/PwiCardInputPresenterImpl;->mvpView:Lcom/ibotta/android/mvp/base/MvpView;

    check-cast p1, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/card/PwiCardInputView;

    invoke-interface {p1}, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/card/PwiCardInputView;->finishWithSuccessResult()V
    :try_end_0
    .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0

    .line 136
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

.method private postNewPaymentMethod(Ljava/lang/String;)V
    .locals 3

    .line 184
    :try_start_0
    new-instance v0, Ljava/lang/String;

    const-string v1, "UTF-8"

    invoke-virtual {p1, v1}, Ljava/lang/String;->getBytes(Ljava/lang/String;)[B

    move-result-object p1

    invoke-static {p1}, Lorg/apache/commons/codec/binary/Base64;->encodeBase64([B)[B

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/lang/String;-><init>([B)V
    :try_end_0
    .catch Ljava/io/UnsupportedEncodingException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception p1

    .line 186
    sget-object v0, Lcom/ibotta/android/crash/IbottaCrashProxy;->IbottaCrashManager:Lcom/ibotta/android/crash/CrashManager;

    invoke-virtual {v0, p1}, Lcom/ibotta/android/crash/CrashManager;->trackException(Ljava/lang/Throwable;)V

    .line 187
    iget-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/card/PwiCardInputPresenterImpl;->mvpView:Lcom/ibotta/android/mvp/base/MvpView;

    if-eqz p1, :cond_0

    .line 188
    iget-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/card/PwiCardInputPresenterImpl;->mvpView:Lcom/ibotta/android/mvp/base/MvpView;

    check-cast p1, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/card/PwiCardInputView;

    invoke-interface {p1}, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/card/PwiCardInputView;->finish()V

    :cond_0
    const/4 v0, 0x0

    .line 192
    :goto_0
    new-instance p1, Lcom/ibotta/api/call/pwi/BgcPaymentAccountsPostCall$CallParams;

    invoke-direct {p1}, Lcom/ibotta/api/call/pwi/BgcPaymentAccountsPostCall$CallParams;-><init>()V

    .line 193
    invoke-virtual {p1, v0}, Lcom/ibotta/api/call/pwi/BgcPaymentAccountsPostCall$CallParams;->setSourceToken(Ljava/lang/String;)V

    .line 195
    new-instance v0, Lcom/ibotta/android/service/api/job/SingleApiJob;

    new-instance v1, Lcom/ibotta/api/call/pwi/BgcPaymentAccountsPostCall;

    iget-object v2, p0, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/card/PwiCardInputPresenterImpl;->userState:Lcom/ibotta/android/state/user/UserState;

    invoke-interface {v2}, Lcom/ibotta/android/state/user/UserState;->getCustomerId()I

    move-result v2

    invoke-direct {v1, p1, v2}, Lcom/ibotta/api/call/pwi/BgcPaymentAccountsPostCall;-><init>(Lcom/ibotta/api/call/pwi/BgcPaymentAccountsPostCall$CallParams;I)V

    invoke-direct {v0, v1}, Lcom/ibotta/android/service/api/job/SingleApiJob;-><init>(Lcom/ibotta/api/ApiCall;)V

    const/4 p1, 0x1

    invoke-virtual {p0, v0, p1}, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/card/PwiCardInputPresenterImpl;->submitApiJob(Lcom/ibotta/android/service/api/job/ApiJob;Z)V

    return-void
.end method


# virtual methods
.method public buildNewPaymentSourceFromCard(Lcom/stripe/android/model/Card;)V
    .locals 1

    .line 150
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/card/PwiCardInputPresenterImpl;->mvpView:Lcom/ibotta/android/mvp/base/MvpView;

    check-cast v0, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/card/PwiCardInputView;

    invoke-interface {v0}, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/card/PwiCardInputView;->showSubmittedJobLoading()V

    .line 151
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/card/PwiCardInputPresenterImpl;->pwiApiManager:Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/PwiApiManager;

    invoke-interface {v0, p1}, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/PwiApiManager;->buildNewPaymentSourceFromCard(Lcom/stripe/android/model/Card;)V

    return-void
.end method

.method public getActivityClass()Ljava/lang/Class;
    .locals 1

    .line 202
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/card/PwiCardInputPresenterImpl;->mvpView:Lcom/ibotta/android/mvp/base/MvpView;

    check-cast v0, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/card/PwiCardInputView;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    return-object v0
.end method

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

    .line 77
    new-instance v0, Ljava/util/HashSet;

    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    return-object v0
.end method

.method public getStripeSource()Lcom/stripe/android/model/Source;
    .locals 1

    .line 207
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/card/PwiCardInputPresenterImpl;->stripeSource:Lcom/stripe/android/model/Source;

    return-object v0
.end method

.method public isFirstTimeCard()Z
    .locals 1

    .line 145
    iget-boolean v0, p0, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/card/PwiCardInputPresenterImpl;->isFirstTimeCard:Z

    return v0
.end method

.method protected onAbandonFetchJobs()V
    .locals 0

    return-void
.end method

.method public onCreateSourceError(Ljava/lang/Exception;)V
    .locals 4
    .annotation runtime Lcom/ibotta/android/aop/tracking/TrackingAfter;
        value = .enum Lcom/ibotta/android/aop/tracking/TrackingType;->PWI_ADD_PAYMENT_METHOD:Lcom/ibotta/android/aop/tracking/TrackingType;
    .end annotation

    sget-object v0, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/card/PwiCardInputPresenterImpl;->ajc$tjp_2:Lorg/aspectj/lang/JoinPoint$StaticPart;

    invoke-static {v0, p0, p0, p1}, Lorg/aspectj/runtime/reflect/Factory;->makeJP(Lorg/aspectj/lang/JoinPoint$StaticPart;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Lorg/aspectj/lang/JoinPoint;

    move-result-object v0

    :try_start_0
    const-string v1, "Error creating source: "

    const/4 v2, 0x1

    .line 172
    new-array v2, v2, [Ljava/lang/Object;

    const/4 v3, 0x0

    aput-object p1, v2, v3

    invoke-static {v1, v2}, Ltimber/log/Timber;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 173
    sget-object v1, Lcom/ibotta/android/crash/IbottaCrashProxy;->IbottaCrashManager:Lcom/ibotta/android/crash/CrashManager;

    new-instance v2, Lcom/ibotta/android/mvp/ui/activity/pwi/IbottaStripeException;

    const-string v3, "Error creating source: "

    invoke-direct {v2, v3, p1}, Lcom/ibotta/android/mvp/ui/activity/pwi/IbottaStripeException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    invoke-virtual {v1, v2}, Lcom/ibotta/android/crash/CrashManager;->trackException(Ljava/lang/Throwable;)V

    .line 174
    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/card/PwiCardInputPresenterImpl;->mvpView:Lcom/ibotta/android/mvp/base/MvpView;

    if-eqz v1, :cond_0

    .line 175
    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/card/PwiCardInputPresenterImpl;->mvpView:Lcom/ibotta/android/mvp/base/MvpView;

    check-cast v1, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/card/PwiCardInputView;

    invoke-interface {v1}, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/card/PwiCardInputView;->hideSubmittedJobLoading()V

    .line 176
    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/card/PwiCardInputPresenterImpl;->mvpView:Lcom/ibotta/android/mvp/base/MvpView;

    check-cast v1, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/card/PwiCardInputView;

    invoke-virtual {p1}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object p1

    invoke-interface {v1, p1}, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/card/PwiCardInputView;->showGenericStripeErrorMessage(Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0

    .line 178
    :cond_0
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

.method public onCreateSourceSuccess(Lcom/stripe/android/model/Source;)V
    .locals 0

    .line 166
    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/card/PwiCardInputPresenterImpl;->stripeSource:Lcom/stripe/android/model/Source;

    .line 167
    invoke-virtual {p1}, Lcom/stripe/android/model/Source;->getId()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p0, p1}, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/card/PwiCardInputPresenterImpl;->postNewPaymentMethod(Ljava/lang/String;)V

    return-void
.end method

.method public onError(ILjava/lang/String;)V
    .locals 0
    .param p2    # Ljava/lang/String;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param

    return-void
.end method

.method protected onFetchFinishedSuccessfully()V
    .locals 0

    return-void
.end method

.method protected onSubmitJobFailed(Lcom/ibotta/android/service/api/job/SingleApiJob;)V
    .locals 1

    .line 107
    invoke-virtual {p1}, Lcom/ibotta/android/service/api/job/SingleApiJob;->getApiResponse()Lcom/ibotta/api/ApiResponse;

    move-result-object v0

    instance-of v0, v0, Lcom/ibotta/api/call/pwi/PwiErrorResponse;

    if-eqz v0, :cond_0

    .line 108
    invoke-virtual {p1}, Lcom/ibotta/android/service/api/job/SingleApiJob;->getApiResponse()Lcom/ibotta/api/ApiResponse;

    move-result-object v0

    check-cast v0, Lcom/ibotta/api/call/pwi/PwiErrorResponse;

    invoke-virtual {v0}, Lcom/ibotta/api/call/pwi/PwiErrorResponse;->getPwiError()Lcom/ibotta/api/model/pwi/PwiError;

    move-result-object v0

    .line 109
    invoke-virtual {p1}, Lcom/ibotta/android/service/api/job/SingleApiJob;->getApiResponse()Lcom/ibotta/api/ApiResponse;

    move-result-object p1

    invoke-virtual {p1}, Lcom/ibotta/api/ApiResponse;->getResponseCode()I

    move-result p1

    .line 108
    invoke-direct {p0, v0, p1}, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/card/PwiCardInputPresenterImpl;->handleIgcError(Lcom/ibotta/api/model/pwi/PwiError;I)V

    goto :goto_0

    .line 111
    :cond_0
    invoke-super {p0, p1}, Lcom/ibotta/android/mvp/base/loading/AbstractLoadingMvpPresenter;->onSubmitJobFailed(Lcom/ibotta/android/service/api/job/SingleApiJob;)V

    :goto_0
    return-void
.end method

.method protected onSubmitJobSuccess(Lcom/ibotta/android/service/api/job/SingleApiJob;)V
    .locals 1

    .line 92
    invoke-super {p0, p1}, Lcom/ibotta/android/mvp/base/loading/AbstractLoadingMvpPresenter;->onSubmitJobSuccess(Lcom/ibotta/android/service/api/job/SingleApiJob;)V

    .line 94
    invoke-virtual {p1}, Lcom/ibotta/android/service/api/job/SingleApiJob;->getApiResponse()Lcom/ibotta/api/ApiResponse;

    move-result-object v0

    instance-of v0, v0, Lcom/ibotta/api/call/pwi/PwiErrorResponse;

    if-eqz v0, :cond_0

    .line 95
    invoke-virtual {p1}, Lcom/ibotta/android/service/api/job/SingleApiJob;->getApiResponse()Lcom/ibotta/api/ApiResponse;

    move-result-object v0

    check-cast v0, Lcom/ibotta/api/call/pwi/PwiErrorResponse;

    .line 96
    invoke-virtual {v0}, Lcom/ibotta/api/call/pwi/PwiErrorResponse;->getPwiError()Lcom/ibotta/api/model/pwi/PwiError;

    move-result-object v0

    invoke-virtual {p1}, Lcom/ibotta/android/service/api/job/SingleApiJob;->getApiResponse()Lcom/ibotta/api/ApiResponse;

    move-result-object p1

    invoke-virtual {p1}, Lcom/ibotta/api/ApiResponse;->getResponseCode()I

    move-result p1

    .line 95
    invoke-direct {p0, v0, p1}, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/card/PwiCardInputPresenterImpl;->handleIgcError(Lcom/ibotta/api/model/pwi/PwiError;I)V

    return-void

    .line 100
    :cond_0
    invoke-virtual {p1}, Lcom/ibotta/android/service/api/job/SingleApiJob;->getApiCall()Lcom/ibotta/api/ApiCall;

    move-result-object v0

    instance-of v0, v0, Lcom/ibotta/api/call/pwi/BgcPaymentAccountsPostCall;

    if-eqz v0, :cond_1

    .line 101
    invoke-virtual {p1}, Lcom/ibotta/android/service/api/job/SingleApiJob;->getApiResponse()Lcom/ibotta/api/ApiResponse;

    move-result-object p1

    check-cast p1, Lcom/ibotta/api/call/pwi/BgcPaymentAccountsResponse;

    invoke-direct {p0, p1}, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/card/PwiCardInputPresenterImpl;->handlePostPaymentAccountsResponse(Lcom/ibotta/api/call/pwi/BgcPaymentAccountsResponse;)V

    :cond_1
    return-void
.end method

.method public onSuccess(Lcom/stripe/android/model/Customer;)V
    .locals 0

    return-void
.end method

.method public setFirstTimeCard(Z)V
    .locals 0

    .line 140
    iput-boolean p1, p0, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/card/PwiCardInputPresenterImpl;->isFirstTimeCard:Z

    return-void
.end method
