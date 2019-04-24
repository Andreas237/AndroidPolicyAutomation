.class public Lcom/ibotta/android/mvp/ui/activity/pwi/v2/wallet/WalletV2PresenterImpl;
.super Lcom/ibotta/android/mvp/base/loading/AbstractLoadingMvpPresenter;
.source "WalletV2PresenterImpl.java"

# interfaces
.implements Lcom/ibotta/android/aop/tracking/advice/PwiWalletAdviceFields;
.implements Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/GooglePayManagerListener;
.implements Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/StripeManagerListener;
.implements Lcom/ibotta/android/mvp/ui/activity/pwi/v2/wallet/WalletV2Presenter;
.implements Lcom/ibotta/android/views/account/wallet/WalletV2ViewEvents;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/ibotta/android/mvp/base/loading/AbstractLoadingMvpPresenter<",
        "Lcom/ibotta/android/mvp/ui/activity/pwi/v2/wallet/WalletV2View;",
        ">;",
        "Lcom/ibotta/android/aop/tracking/advice/PwiWalletAdviceFields;",
        "Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/GooglePayManagerListener;",
        "Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/StripeManagerListener;",
        "Lcom/ibotta/android/mvp/ui/activity/pwi/v2/wallet/WalletV2Presenter;",
        "Lcom/ibotta/android/views/account/wallet/WalletV2ViewEvents;"
    }
.end annotation


# static fields
.field private static final synthetic ajc$tjp_0:Lorg/aspectj/lang/JoinPoint$StaticPart;

.field private static final synthetic ajc$tjp_1:Lorg/aspectj/lang/JoinPoint$StaticPart;

.field private static final synthetic ajc$tjp_2:Lorg/aspectj/lang/JoinPoint$StaticPart;


# instance fields
.field private customer:Lcom/stripe/android/model/Customer;

.field private final googlePayManager:Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/GooglePayManager;

.field private hasGooglePay:Z

.field private homeJob:Lcom/ibotta/android/service/api/job/HomeApiJob;
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation
.end field

.field private isFirstTimeCard:Z

.field private paymentAccount:Lcom/ibotta/api/model/pwi/BgcPaymentAccount;

.field private paymentAccountsJob:Lcom/ibotta/android/service/api/job/SingleApiJob;
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation
.end field

.field private paymentMethods:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/ibotta/api/model/pwi/PwiPaymentMethod;",
            ">;"
        }
    .end annotation
.end field

.field private final pwiApiManager:Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/PwiApiManager;

.field private final pwiHomeReducer:Lcom/ibotta/android/pwi/PwiHomeReducer;

.field private final pwiUserState:Lcom/ibotta/android/state/pwi/PwiUserState;

.field private final pwiVariant:Lcom/ibotta/android/features/variant/pwi/PwiVariant;

.field private final pwiWalletReducer:Lcom/ibotta/android/pwi/PwiWalletV2Reducer;

.field private spentFilter:Lcom/ibotta/android/views/pwi/wallet/SpentFilter;

.field private transactions:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/ibotta/api/model/pwi/BgcTransaction;",
            ">;"
        }
    .end annotation
.end field

.field private transactionsJob:Lcom/ibotta/android/service/api/job/SingleApiJob;
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation
.end field

.field private final userState:Lcom/ibotta/android/state/user/UserState;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    .line 1
    invoke-static {}, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/wallet/WalletV2PresenterImpl;->ajc$preClinit()V

    return-void
.end method

.method public constructor <init>(Lcom/ibotta/android/mvp/base/MvpPresenterActions;Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/PwiApiManager;Lcom/ibotta/android/pwi/PwiHomeReducer;Lcom/ibotta/android/features/variant/pwi/PwiVariant;Lcom/ibotta/android/state/user/UserState;Lcom/ibotta/android/pwi/PwiWalletV2Reducer;Lcom/ibotta/android/state/pwi/PwiUserState;Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/GooglePayManager;)V
    .locals 0

    .line 105
    invoke-direct {p0, p1}, Lcom/ibotta/android/mvp/base/loading/AbstractLoadingMvpPresenter;-><init>(Lcom/ibotta/android/mvp/base/MvpPresenterActions;)V

    const/4 p1, 0x0

    .line 72
    iput-boolean p1, p0, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/wallet/WalletV2PresenterImpl;->isFirstTimeCard:Z

    .line 73
    iput-boolean p1, p0, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/wallet/WalletV2PresenterImpl;->hasGooglePay:Z

    .line 75
    sget-object p1, Lcom/ibotta/android/views/pwi/wallet/SpentFilter;->ALL:Lcom/ibotta/android/views/pwi/wallet/SpentFilter;

    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/wallet/WalletV2PresenterImpl;->spentFilter:Lcom/ibotta/android/views/pwi/wallet/SpentFilter;

    .line 80
    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object p1

    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/wallet/WalletV2PresenterImpl;->transactions:Ljava/util/List;

    .line 81
    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object p1

    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/wallet/WalletV2PresenterImpl;->paymentMethods:Ljava/util/List;

    .line 106
    iput-object p2, p0, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/wallet/WalletV2PresenterImpl;->pwiApiManager:Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/PwiApiManager;

    .line 107
    iput-object p3, p0, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/wallet/WalletV2PresenterImpl;->pwiHomeReducer:Lcom/ibotta/android/pwi/PwiHomeReducer;

    .line 108
    iput-object p4, p0, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/wallet/WalletV2PresenterImpl;->pwiVariant:Lcom/ibotta/android/features/variant/pwi/PwiVariant;

    .line 109
    iput-object p5, p0, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/wallet/WalletV2PresenterImpl;->userState:Lcom/ibotta/android/state/user/UserState;

    .line 110
    iput-object p6, p0, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/wallet/WalletV2PresenterImpl;->pwiWalletReducer:Lcom/ibotta/android/pwi/PwiWalletV2Reducer;

    .line 111
    iput-object p7, p0, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/wallet/WalletV2PresenterImpl;->pwiUserState:Lcom/ibotta/android/state/pwi/PwiUserState;

    .line 112
    iput-object p8, p0, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/wallet/WalletV2PresenterImpl;->googlePayManager:Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/GooglePayManager;

    .line 114
    iget-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/wallet/WalletV2PresenterImpl;->pwiApiManager:Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/PwiApiManager;

    invoke-interface {p1, p0}, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/PwiApiManager;->setStripeManagerListener(Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/StripeManagerListener;)V

    .line 115
    iget-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/wallet/WalletV2PresenterImpl;->googlePayManager:Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/GooglePayManager;

    invoke-interface {p1, p0}, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/GooglePayManager;->setGooglePayManagerListener(Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/GooglePayManagerListener;)V

    return-void
.end method

.method static synthetic access$000(Lcom/ibotta/android/mvp/ui/activity/pwi/v2/wallet/WalletV2PresenterImpl;Lcom/ibotta/android/views/pwi/wallet/WalletPaymentOptionRowViewState;)V
    .locals 0

    .line 68
    invoke-direct {p0, p1}, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/wallet/WalletV2PresenterImpl;->deletePaymentMethod(Lcom/ibotta/android/views/pwi/wallet/WalletPaymentOptionRowViewState;)V

    return-void
.end method

.method private static synthetic ajc$preClinit()V
    .locals 10

    .line 1
    new-instance v8, Lorg/aspectj/runtime/reflect/Factory;

    const-string v0, "WalletV2PresenterImpl.java"

    const-class v1, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/wallet/WalletV2PresenterImpl;

    invoke-direct {v8, v0, v1}, Lorg/aspectj/runtime/reflect/Factory;-><init>(Ljava/lang/String;Ljava/lang/Class;)V

    const-string v9, "method-execution"

    const-string v1, "1"

    const-string v2, "onShowPwiRetailersClick"

    const-string v3, "com.ibotta.android.mvp.ui.activity.pwi.v2.wallet.WalletV2PresenterImpl"

    const-string v4, ""

    const-string v5, ""

    const-string v6, ""

    const-string v7, "void"

    move-object v0, v8

    invoke-virtual/range {v0 .. v7}, Lorg/aspectj/runtime/reflect/Factory;->makeMethodSig(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lorg/aspectj/lang/reflect/MethodSignature;

    move-result-object v0

    const/16 v1, 0x10a

    invoke-virtual {v8, v9, v0, v1}, Lorg/aspectj/runtime/reflect/Factory;->makeSJP(Ljava/lang/String;Lorg/aspectj/lang/Signature;I)Lorg/aspectj/lang/JoinPoint$StaticPart;

    move-result-object v0

    sput-object v0, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/wallet/WalletV2PresenterImpl;->ajc$tjp_0:Lorg/aspectj/lang/JoinPoint$StaticPart;

    const-string v9, "method-execution"

    const-string v1, "1"

    const-string v2, "onTransactionActionsDialogClicked"

    const-string v3, "com.ibotta.android.mvp.ui.activity.pwi.v2.wallet.WalletV2PresenterImpl"

    const-string v4, "com.ibotta.android.views.pwi.transactions.PwiTransactionRowViewState:com.ibotta.android.mvp.ui.dialog.CustomBottomSheetDialog$CustomBottomSheetOption"

    const-string v5, "viewState:option"

    const-string v6, ""

    const-string v7, "void"

    move-object v0, v8

    invoke-virtual/range {v0 .. v7}, Lorg/aspectj/runtime/reflect/Factory;->makeMethodSig(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lorg/aspectj/lang/reflect/MethodSignature;

    move-result-object v0

    const/16 v1, 0x152

    invoke-virtual {v8, v9, v0, v1}, Lorg/aspectj/runtime/reflect/Factory;->makeSJP(Ljava/lang/String;Lorg/aspectj/lang/Signature;I)Lorg/aspectj/lang/JoinPoint$StaticPart;

    move-result-object v0

    sput-object v0, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/wallet/WalletV2PresenterImpl;->ajc$tjp_1:Lorg/aspectj/lang/JoinPoint$StaticPart;

    const-string v9, "method-execution"

    const-string v1, "2"

    const-string v2, "setTransactionSpentStatus"

    const-string v3, "com.ibotta.android.mvp.ui.activity.pwi.v2.wallet.WalletV2PresenterImpl"

    const-string v4, "com.ibotta.android.views.pwi.transactions.PwiTransactionRowViewState"

    const-string v5, "viewState"

    const-string v6, ""

    const-string v7, "void"

    move-object v0, v8

    invoke-virtual/range {v0 .. v7}, Lorg/aspectj/runtime/reflect/Factory;->makeMethodSig(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lorg/aspectj/lang/reflect/MethodSignature;

    move-result-object v0

    const/16 v1, 0x17e

    invoke-virtual {v8, v9, v0, v1}, Lorg/aspectj/runtime/reflect/Factory;->makeSJP(Ljava/lang/String;Lorg/aspectj/lang/Signature;I)Lorg/aspectj/lang/JoinPoint$StaticPart;

    move-result-object v0

    sput-object v0, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/wallet/WalletV2PresenterImpl;->ajc$tjp_2:Lorg/aspectj/lang/JoinPoint$StaticPart;

    return-void
.end method

.method private deletePaymentMethod(Lcom/ibotta/android/views/pwi/wallet/WalletPaymentOptionRowViewState;)V
    .locals 1

    .line 373
    :try_start_0
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/wallet/WalletV2PresenterImpl;->pwiApiManager:Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/PwiApiManager;

    invoke-virtual {p1}, Lcom/ibotta/android/views/pwi/wallet/WalletPaymentOptionRowViewState;->getSourceId()Ljava/lang/String;

    move-result-object p1

    invoke-interface {v0, p1}, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/PwiApiManager;->buildPaymentAccountsDeleteCall(Ljava/lang/String;)Lcom/ibotta/android/service/api/job/SingleApiJob;

    move-result-object p1

    invoke-virtual {p0, p1}, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/wallet/WalletV2PresenterImpl;->submitApiJob(Lcom/ibotta/android/service/api/job/ApiJob;)V
    :try_end_0
    .catch Ljava/io/UnsupportedEncodingException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception p1

    .line 375
    sget-object v0, Lcom/ibotta/android/crash/IbottaCrashProxy;->IbottaCrashManager:Lcom/ibotta/android/crash/CrashManager;

    invoke-virtual {v0, p1}, Lcom/ibotta/android/crash/CrashManager;->trackException(Ljava/lang/Throwable;)V

    .line 376
    iget-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/wallet/WalletV2PresenterImpl;->mvpView:Lcom/ibotta/android/mvp/base/MvpView;

    check-cast p1, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/wallet/WalletV2View;

    invoke-interface {p1}, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/wallet/WalletV2View;->finish()V

    :goto_0
    return-void
.end method

.method private initViewStates()V
    .locals 7

    .line 199
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    .line 200
    sget-object v1, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/wallet/WalletV2Tab;->TRANSACTIONS:Lcom/ibotta/android/mvp/ui/activity/pwi/v2/wallet/WalletV2Tab;

    iget-object v2, p0, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/wallet/WalletV2PresenterImpl;->pwiHomeReducer:Lcom/ibotta/android/pwi/PwiHomeReducer;

    iget-object v3, p0, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/wallet/WalletV2PresenterImpl;->transactions:Ljava/util/List;

    sget-object v4, Lcom/ibotta/android/views/components/Visibility;->GONE:Lcom/ibotta/android/views/components/Visibility;

    iget-object v5, p0, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/wallet/WalletV2PresenterImpl;->spentFilter:Lcom/ibotta/android/views/pwi/wallet/SpentFilter;

    const/4 v6, 0x1

    invoke-virtual {v2, v3, v6, v4, v5}, Lcom/ibotta/android/pwi/PwiHomeReducer;->createTransactionsViewState(Ljava/util/List;ZLcom/ibotta/android/views/components/Visibility;Lcom/ibotta/android/views/pwi/wallet/SpentFilter;)Lcom/ibotta/android/views/pwi/transactions/PwiTransactionsViewState;

    move-result-object v2

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 205
    sget-object v1, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/wallet/WalletV2Tab;->PAYMENT_METHODS:Lcom/ibotta/android/mvp/ui/activity/pwi/v2/wallet/WalletV2Tab;

    iget-object v2, p0, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/wallet/WalletV2PresenterImpl;->pwiHomeReducer:Lcom/ibotta/android/pwi/PwiHomeReducer;

    iget-object v3, p0, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/wallet/WalletV2PresenterImpl;->paymentMethods:Ljava/util/List;

    iget-boolean v4, p0, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/wallet/WalletV2PresenterImpl;->hasGooglePay:Z

    iget-object v5, p0, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/wallet/WalletV2PresenterImpl;->pwiUserState:Lcom/ibotta/android/state/pwi/PwiUserState;

    .line 207
    invoke-interface {v5}, Lcom/ibotta/android/state/pwi/PwiUserState;->isGooglePayDefaultPayment()Ljava/lang/Boolean;

    move-result-object v5

    invoke-virtual {v5}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v5

    .line 206
    invoke-virtual {v2, v3, v4, v5}, Lcom/ibotta/android/pwi/PwiHomeReducer;->createPaymentMethodsViewState(Ljava/util/List;ZZ)Lcom/ibotta/android/views/pwi/wallet/PaymentMethodsViewState;

    move-result-object v2

    .line 205
    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 209
    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/wallet/WalletV2PresenterImpl;->mvpView:Lcom/ibotta/android/mvp/base/MvpView;

    check-cast v1, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/wallet/WalletV2View;

    invoke-interface {v1, v0}, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/wallet/WalletV2View;->updateViewState(Ljava/util/Map;)V

    return-void
.end method

.method private makeGooglePayDefault()V
    .locals 2

    .line 367
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/wallet/WalletV2PresenterImpl;->pwiUserState:Lcom/ibotta/android/state/pwi/PwiUserState;

    const/4 v1, 0x1

    invoke-interface {v0, v1}, Lcom/ibotta/android/state/pwi/PwiUserState;->setGooglePayAsDefaultPayment(Z)V

    .line 368
    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/wallet/WalletV2PresenterImpl;->reload()V

    return-void
.end method

.method private makePaymentMethodDefault(Lcom/ibotta/android/views/pwi/wallet/WalletPaymentOptionRowViewState;)V
    .locals 1

    .line 358
    :try_start_0
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/wallet/WalletV2PresenterImpl;->pwiApiManager:Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/PwiApiManager;

    invoke-virtual {p1}, Lcom/ibotta/android/views/pwi/wallet/WalletPaymentOptionRowViewState;->getSourceId()Ljava/lang/String;

    move-result-object p1

    invoke-interface {v0, p1}, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/PwiApiManager;->buildPaymentAccountsPutCall(Ljava/lang/String;)Lcom/ibotta/android/service/api/job/SingleApiJob;

    move-result-object p1

    invoke-virtual {p0, p1}, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/wallet/WalletV2PresenterImpl;->submitApiJob(Lcom/ibotta/android/service/api/job/ApiJob;)V

    .line 359
    iget-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/wallet/WalletV2PresenterImpl;->pwiUserState:Lcom/ibotta/android/state/pwi/PwiUserState;

    const/4 v0, 0x0

    invoke-interface {p1, v0}, Lcom/ibotta/android/state/pwi/PwiUserState;->setGooglePayAsDefaultPayment(Z)V
    :try_end_0
    .catch Ljava/io/UnsupportedEncodingException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception p1

    .line 361
    sget-object v0, Lcom/ibotta/android/crash/IbottaCrashProxy;->IbottaCrashManager:Lcom/ibotta/android/crash/CrashManager;

    invoke-virtual {v0, p1}, Lcom/ibotta/android/crash/CrashManager;->trackException(Ljava/lang/Throwable;)V

    .line 362
    iget-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/wallet/WalletV2PresenterImpl;->mvpView:Lcom/ibotta/android/mvp/base/MvpView;

    check-cast p1, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/wallet/WalletV2View;

    invoke-interface {p1}, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/wallet/WalletV2View;->finish()V

    :goto_0
    return-void
.end method

.method private setTransactionSpentStatus(Lcom/ibotta/android/views/pwi/transactions/PwiTransactionRowViewState;)V
    .locals 3
    .annotation runtime Lcom/ibotta/android/aop/tracking/TrackingAfter;
        value = .enum Lcom/ibotta/android/aop/tracking/TrackingType;->PWI_SPENT_TOGGLE:Lcom/ibotta/android/aop/tracking/TrackingType;
    .end annotation

    sget-object v0, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/wallet/WalletV2PresenterImpl;->ajc$tjp_2:Lorg/aspectj/lang/JoinPoint$StaticPart;

    invoke-static {v0, p0, p0, p1}, Lorg/aspectj/runtime/reflect/Factory;->makeJP(Lorg/aspectj/lang/JoinPoint$StaticPart;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Lorg/aspectj/lang/JoinPoint;

    move-result-object v0

    .line 382
    :try_start_0
    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/wallet/WalletV2PresenterImpl;->pwiApiManager:Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/PwiApiManager;

    invoke-virtual {p1}, Lcom/ibotta/android/views/pwi/transactions/PwiTransactionRowViewState;->getTransactionId()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p1}, Lcom/ibotta/android/views/pwi/transactions/PwiTransactionRowViewState;->isSpent()Z

    move-result p1

    if-nez p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    invoke-interface {v1, v2, p1}, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/PwiApiManager;->buildTransactionSpentJob(Ljava/lang/String;Z)Lcom/ibotta/android/service/api/job/SingleApiJob;

    move-result-object p1

    invoke-virtual {p0, p1}, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/wallet/WalletV2PresenterImpl;->submitApiJob(Lcom/ibotta/android/service/api/job/ApiJob;)V
    :try_end_0
    .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0

    .line 383
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


# virtual methods
.method public getActivityClass()Ljava/lang/Class;
    .locals 1

    .line 400
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/wallet/WalletV2PresenterImpl;->mvpView:Lcom/ibotta/android/mvp/base/MvpView;

    check-cast v0, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/wallet/WalletV2View;

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

    .line 126
    new-instance v0, Ljava/util/HashSet;

    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    .line 130
    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/wallet/WalletV2PresenterImpl;->homeJob:Lcom/ibotta/android/service/api/job/HomeApiJob;

    if-nez v1, :cond_0

    .line 131
    new-instance v1, Lcom/ibotta/android/service/api/job/HomeApiJob;

    const/4 v2, 0x0

    invoke-direct {v1, v2}, Lcom/ibotta/android/service/api/job/HomeApiJob;-><init>(I)V

    iput-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/wallet/WalletV2PresenterImpl;->homeJob:Lcom/ibotta/android/service/api/job/HomeApiJob;

    .line 134
    :cond_0
    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/wallet/WalletV2PresenterImpl;->paymentAccountsJob:Lcom/ibotta/android/service/api/job/SingleApiJob;

    if-nez v1, :cond_1

    .line 135
    new-instance v1, Lcom/ibotta/android/service/api/job/SingleApiJob;

    new-instance v2, Lcom/ibotta/api/call/pwi/BgcPaymentAccountsCall;

    iget-object v3, p0, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/wallet/WalletV2PresenterImpl;->userState:Lcom/ibotta/android/state/user/UserState;

    .line 136
    invoke-interface {v3}, Lcom/ibotta/android/state/user/UserState;->getCustomerId()I

    move-result v3

    iget-object v4, p0, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/wallet/WalletV2PresenterImpl;->pwiVariant:Lcom/ibotta/android/features/variant/pwi/PwiVariant;

    invoke-interface {v4}, Lcom/ibotta/android/features/variant/pwi/PwiVariant;->isProduction()Z

    move-result v4

    invoke-direct {v2, v3, v4}, Lcom/ibotta/api/call/pwi/BgcPaymentAccountsCall;-><init>(IZ)V

    invoke-direct {v1, v2}, Lcom/ibotta/android/service/api/job/SingleApiJob;-><init>(Lcom/ibotta/api/ApiCall;)V

    iput-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/wallet/WalletV2PresenterImpl;->paymentAccountsJob:Lcom/ibotta/android/service/api/job/SingleApiJob;

    .line 139
    :cond_1
    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/wallet/WalletV2PresenterImpl;->transactionsJob:Lcom/ibotta/android/service/api/job/SingleApiJob;

    if-nez v1, :cond_2

    .line 140
    new-instance v1, Lcom/ibotta/api/call/pwi/BuyableGiftCardsCall;

    iget-object v2, p0, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/wallet/WalletV2PresenterImpl;->userState:Lcom/ibotta/android/state/user/UserState;

    .line 141
    invoke-interface {v2}, Lcom/ibotta/android/state/user/UserState;->getCustomerId()I

    move-result v2

    iget-object v3, p0, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/wallet/WalletV2PresenterImpl;->pwiVariant:Lcom/ibotta/android/features/variant/pwi/PwiVariant;

    invoke-interface {v3}, Lcom/ibotta/android/features/variant/pwi/PwiVariant;->isProduction()Z

    move-result v3

    sget-object v4, Lcom/ibotta/api/call/pwi/BuyableGiftCardsCall;->COMPLETED_STATUS:Ljava/util/Set;

    invoke-direct {v1, v2, v3, v4}, Lcom/ibotta/api/call/pwi/BuyableGiftCardsCall;-><init>(IZLjava/util/Set;)V

    .line 142
    new-instance v2, Lcom/ibotta/android/service/api/job/SingleApiJob;

    invoke-direct {v2, v1}, Lcom/ibotta/android/service/api/job/SingleApiJob;-><init>(Lcom/ibotta/api/ApiCall;)V

    iput-object v2, p0, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/wallet/WalletV2PresenterImpl;->transactionsJob:Lcom/ibotta/android/service/api/job/SingleApiJob;

    .line 145
    :cond_2
    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/wallet/WalletV2PresenterImpl;->homeJob:Lcom/ibotta/android/service/api/job/HomeApiJob;

    if-eqz v1, :cond_3

    .line 146
    invoke-interface {v0, v1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 149
    :cond_3
    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/wallet/WalletV2PresenterImpl;->paymentAccountsJob:Lcom/ibotta/android/service/api/job/SingleApiJob;

    if-eqz v1, :cond_4

    .line 150
    invoke-interface {v0, v1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 153
    :cond_4
    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/wallet/WalletV2PresenterImpl;->transactionsJob:Lcom/ibotta/android/service/api/job/SingleApiJob;

    if-eqz v1, :cond_5

    .line 154
    invoke-interface {v0, v1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    :cond_5
    return-object v0
.end method

.method public isFirstTimeCard()Z
    .locals 1

    .line 300
    iget-boolean v0, p0, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/wallet/WalletV2PresenterImpl;->isFirstTimeCard:Z

    return v0
.end method

.method protected onAbandonFetchJobs()V
    .locals 1

    const/4 v0, 0x0

    .line 162
    iput-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/wallet/WalletV2PresenterImpl;->homeJob:Lcom/ibotta/android/service/api/job/HomeApiJob;

    .line 163
    iput-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/wallet/WalletV2PresenterImpl;->paymentAccountsJob:Lcom/ibotta/android/service/api/job/SingleApiJob;

    .line 164
    iput-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/wallet/WalletV2PresenterImpl;->transactionsJob:Lcom/ibotta/android/service/api/job/SingleApiJob;

    return-void
.end method

.method public onAddNewPaymentMethodClicked()V
    .locals 1

    .line 295
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/wallet/WalletV2PresenterImpl;->mvpView:Lcom/ibotta/android/mvp/base/MvpView;

    check-cast v0, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/wallet/WalletV2View;

    invoke-interface {v0}, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/wallet/WalletV2View;->showAddNewCardActivity()V

    return-void
.end method

.method public onCreateSourceError(Ljava/lang/Exception;)V
    .locals 0

    return-void
.end method

.method public onCreateSourceSuccess(Lcom/stripe/android/model/Source;)V
    .locals 0

    return-void
.end method

.method public onError(ILjava/lang/String;)V
    .locals 4
    .param p2    # Ljava/lang/String;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param

    .line 230
    sget-object v0, Ljava/util/Locale;->US:Ljava/util/Locale;

    const-string v1, "Error retrieving customer from ephemeral key, errorcode = %d, message = %s"

    const/4 v2, 0x2

    new-array v2, v2, [Ljava/lang/Object;

    .line 231
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    const/4 v3, 0x0

    aput-object p1, v2, v3

    const/4 p1, 0x1

    aput-object p2, v2, p1

    .line 230
    invoke-static {v0, v1, v2}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    .line 232
    new-array p2, v3, [Ljava/lang/Object;

    invoke-static {p1, p2}, Ltimber/log/Timber;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 233
    sget-object p2, Lcom/ibotta/android/crash/IbottaCrashProxy;->IbottaCrashManager:Lcom/ibotta/android/crash/CrashManager;

    new-instance v0, Lcom/ibotta/android/mvp/ui/activity/pwi/IbottaStripeException;

    invoke-direct {v0, p1}, Lcom/ibotta/android/mvp/ui/activity/pwi/IbottaStripeException;-><init>(Ljava/lang/String;)V

    invoke-virtual {p2, v0}, Lcom/ibotta/android/crash/CrashManager;->trackException(Ljava/lang/Throwable;)V

    .line 234
    iget-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/wallet/WalletV2PresenterImpl;->mvpView:Lcom/ibotta/android/mvp/base/MvpView;

    check-cast p1, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/wallet/WalletV2View;

    invoke-interface {p1}, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/wallet/WalletV2View;->finish()V

    return-void
.end method

.method protected onFetchFinishedSuccessfully()V
    .locals 3

    .line 171
    :try_start_0
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/wallet/WalletV2PresenterImpl;->pwiApiManager:Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/PwiApiManager;

    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/wallet/WalletV2PresenterImpl;->transactionsJob:Lcom/ibotta/android/service/api/job/SingleApiJob;

    iget-object v2, p0, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/wallet/WalletV2PresenterImpl;->homeJob:Lcom/ibotta/android/service/api/job/HomeApiJob;

    invoke-interface {v0, v1, v2}, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/PwiApiManager;->getTransactionsFromJob(Lcom/ibotta/android/service/api/job/SingleApiJob;Lcom/ibotta/android/service/api/job/HomeApiJob;)Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/wallet/WalletV2PresenterImpl;->transactions:Ljava/util/List;
    :try_end_0
    .catch Lcom/ibotta/android/mvp/ui/activity/find/IllegalApiJobStateException; {:try_start_0 .. :try_end_0} :catch_4

    .line 180
    :try_start_1
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/wallet/WalletV2PresenterImpl;->pwiApiManager:Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/PwiApiManager;

    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/wallet/WalletV2PresenterImpl;->paymentAccountsJob:Lcom/ibotta/android/service/api/job/SingleApiJob;

    invoke-interface {v0, v1}, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/PwiApiManager;->getPaymentAccountFromJob(Lcom/ibotta/android/service/api/job/SingleApiJob;)Lcom/ibotta/api/model/pwi/BgcPaymentAccount;

    move-result-object v0

    iput-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/wallet/WalletV2PresenterImpl;->paymentAccount:Lcom/ibotta/api/model/pwi/BgcPaymentAccount;
    :try_end_1
    .catch Lcom/ibotta/android/mvp/ui/activity/find/IllegalApiJobStateException; {:try_start_1 .. :try_end_1} :catch_3
    .catch Ljava/lang/IllegalStateException; {:try_start_1 .. :try_end_1} :catch_2
    .catch Lcom/ibotta/android/mvp/ui/activity/pwi/PwiErrorException; {:try_start_1 .. :try_end_1} :catch_1
    .catch Lcom/ibotta/android/mvp/ui/activity/pwi/NoPaymentAccountException; {:try_start_1 .. :try_end_1} :catch_0

    goto :goto_0

    :catch_0
    const/4 v0, 0x1

    .line 188
    iput-boolean v0, p0, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/wallet/WalletV2PresenterImpl;->isFirstTimeCard:Z

    .line 189
    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/wallet/WalletV2PresenterImpl;->initViewStates()V

    .line 192
    :goto_0
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/wallet/WalletV2PresenterImpl;->paymentAccount:Lcom/ibotta/api/model/pwi/BgcPaymentAccount;

    if-eqz v0, :cond_0

    .line 193
    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/wallet/WalletV2PresenterImpl;->pwiApiManager:Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/PwiApiManager;

    invoke-interface {v1, v0}, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/PwiApiManager;->initStripeCustomerSession(Lcom/ibotta/api/model/pwi/BgcPaymentAccount;)V

    .line 194
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/wallet/WalletV2PresenterImpl;->pwiApiManager:Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/PwiApiManager;

    invoke-interface {v0}, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/PwiApiManager;->retrieveStripeCurrentCustomer()V

    :cond_0
    return-void

    :catch_1
    move-exception v0

    goto :goto_1

    :catch_2
    move-exception v0

    goto :goto_1

    :catch_3
    move-exception v0

    .line 182
    :goto_1
    sget-object v1, Lcom/ibotta/android/crash/IbottaCrashProxy;->IbottaCrashManager:Lcom/ibotta/android/crash/CrashManager;

    invoke-virtual {v1, v0}, Lcom/ibotta/android/crash/CrashManager;->trackException(Ljava/lang/Throwable;)V

    .line 183
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/wallet/WalletV2PresenterImpl;->mvpView:Lcom/ibotta/android/mvp/base/MvpView;

    check-cast v0, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/wallet/WalletV2View;

    invoke-interface {v0}, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/wallet/WalletV2View;->finish()V

    return-void

    :catch_4
    move-exception v0

    .line 173
    sget-object v1, Lcom/ibotta/android/crash/IbottaCrashProxy;->IbottaCrashManager:Lcom/ibotta/android/crash/CrashManager;

    invoke-virtual {v1, v0}, Lcom/ibotta/android/crash/CrashManager;->trackException(Ljava/lang/Throwable;)V

    .line 174
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/wallet/WalletV2PresenterImpl;->mvpView:Lcom/ibotta/android/mvp/base/MvpView;

    check-cast v0, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/wallet/WalletV2View;

    invoke-interface {v0}, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/wallet/WalletV2View;->finish()V

    return-void
.end method

.method public onGooglePayRowClicked(Lcom/ibotta/android/views/pwi/wallet/WalletPaymentOptionRowViewState;)V
    .locals 1
    .param p1    # Lcom/ibotta/android/views/pwi/wallet/WalletPaymentOptionRowViewState;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    .line 276
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/wallet/WalletV2PresenterImpl;->mvpView:Lcom/ibotta/android/mvp/base/MvpView;

    check-cast v0, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/wallet/WalletV2View;

    invoke-interface {v0, p1}, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/wallet/WalletV2View;->showGooglePayActionsDialog(Lcom/ibotta/android/views/pwi/wallet/WalletPaymentOptionRowViewState;)V

    return-void
.end method

.method public onIsReadyToPayRequest(Z)V
    .locals 0

    const/4 p1, 0x1

    .line 405
    iput-boolean p1, p0, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/wallet/WalletV2PresenterImpl;->hasGooglePay:Z

    return-void
.end method

.method public onManageAllTransactionsClick()V
    .locals 0

    return-void
.end method

.method public onPaymentMethodActionClicked(Lcom/ibotta/android/views/pwi/wallet/WalletPaymentOptionRowViewState;I)V
    .locals 2

    const/4 v0, 0x6

    if-eq p2, v0, :cond_0

    packed-switch p2, :pswitch_data_0

    goto :goto_0

    .line 319
    :pswitch_0
    iget-object p2, p0, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/wallet/WalletV2PresenterImpl;->mvpView:Lcom/ibotta/android/mvp/base/MvpView;

    check-cast p2, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/wallet/WalletV2View;

    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/wallet/WalletV2PresenterImpl;->pwiWalletReducer:Lcom/ibotta/android/pwi/PwiWalletV2Reducer;

    .line 320
    invoke-virtual {v0, p1}, Lcom/ibotta/android/pwi/PwiWalletV2Reducer;->createDeleteCardDialogViewState(Lcom/ibotta/android/views/pwi/wallet/WalletPaymentOptionRowViewState;)Lcom/ibotta/android/views/messages/alert/SemiModalViewState;

    move-result-object v0

    new-instance v1, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/wallet/WalletV2PresenterImpl$1;

    invoke-direct {v1, p0, p1}, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/wallet/WalletV2PresenterImpl$1;-><init>(Lcom/ibotta/android/mvp/ui/activity/pwi/v2/wallet/WalletV2PresenterImpl;Lcom/ibotta/android/views/pwi/wallet/WalletPaymentOptionRowViewState;)V

    .line 319
    invoke-interface {p2, v0, v1}, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/wallet/WalletV2View;->showRemovePaymentMethodConfirmationDialog(Lcom/ibotta/android/views/messages/alert/SemiModalViewState;Lcom/ibotta/android/views/messages/alert/SemiModalViewEvents;)V

    goto :goto_0

    .line 313
    :pswitch_1
    invoke-direct {p0, p1}, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/wallet/WalletV2PresenterImpl;->makePaymentMethodDefault(Lcom/ibotta/android/views/pwi/wallet/WalletPaymentOptionRowViewState;)V

    goto :goto_0

    .line 316
    :cond_0
    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/wallet/WalletV2PresenterImpl;->makeGooglePayDefault()V

    :goto_0
    return-void

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public onPaymentMethodAdded()V
    .locals 0

    .line 306
    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/wallet/WalletV2PresenterImpl;->reload()V

    return-void
.end method

.method public onPaymentMethodRowClicked(Lcom/ibotta/android/views/pwi/wallet/WalletPaymentOptionRowViewState;)V
    .locals 1
    .param p1    # Lcom/ibotta/android/views/pwi/wallet/WalletPaymentOptionRowViewState;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    .line 271
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/wallet/WalletV2PresenterImpl;->mvpView:Lcom/ibotta/android/mvp/base/MvpView;

    check-cast v0, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/wallet/WalletV2View;

    invoke-interface {v0, p1}, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/wallet/WalletV2View;->showPaymentMethodActionsDialog(Lcom/ibotta/android/views/pwi/wallet/WalletPaymentOptionRowViewState;)V

    return-void
.end method

.method public onRefreshTransactions()V
    .locals 0

    .line 353
    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/wallet/WalletV2PresenterImpl;->reload()V

    return-void
.end method

.method public onRowTapped(Lcom/ibotta/android/views/pwi/transactions/PwiTransactionRowViewState;)V
    .locals 1
    .param p1    # Lcom/ibotta/android/views/pwi/transactions/PwiTransactionRowViewState;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    .line 251
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/wallet/WalletV2PresenterImpl;->mvpView:Lcom/ibotta/android/mvp/base/MvpView;

    check-cast v0, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/wallet/WalletV2View;

    invoke-interface {v0, p1}, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/wallet/WalletV2View;->showBarcodeScreen(Lcom/ibotta/android/views/pwi/transactions/PwiTransactionRowViewState;)V

    return-void
.end method

.method public onShowPwiRetailersClick()V
    .locals 2
    .annotation runtime Lcom/ibotta/android/aop/tracking/TrackingBefore;
        value = .enum Lcom/ibotta/android/aop/tracking/TrackingType;->PWI_START_EARNING:Lcom/ibotta/android/aop/tracking/TrackingType;
    .end annotation

    sget-object v0, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/wallet/WalletV2PresenterImpl;->ajc$tjp_0:Lorg/aspectj/lang/JoinPoint$StaticPart;

    invoke-static {v0, p0, p0}, Lorg/aspectj/runtime/reflect/Factory;->makeJP(Lorg/aspectj/lang/JoinPoint$StaticPart;Ljava/lang/Object;Ljava/lang/Object;)Lorg/aspectj/lang/JoinPoint;

    move-result-object v0

    .line 266
    invoke-static {}, Lcom/ibotta/android/aop/tracking/TrackingAspect;->aspectOf()Lcom/ibotta/android/aop/tracking/TrackingAspect;

    move-result-object v1

    invoke-virtual {v1, v0}, Lcom/ibotta/android/aop/tracking/TrackingAspect;->before(Lorg/aspectj/lang/JoinPoint;)V

    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/wallet/WalletV2PresenterImpl;->mvpView:Lcom/ibotta/android/mvp/base/MvpView;

    check-cast v0, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/wallet/WalletV2View;

    invoke-interface {v0}, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/wallet/WalletV2View;->showPwiRetailersScreen()V

    return-void
.end method

.method public onSpentFilterChosen(Lcom/ibotta/android/views/pwi/wallet/SpentFilter;)V
    .locals 0

    .line 392
    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/wallet/WalletV2PresenterImpl;->spentFilter:Lcom/ibotta/android/views/pwi/wallet/SpentFilter;

    .line 393
    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/wallet/WalletV2PresenterImpl;->initViewStates()V

    return-void
.end method

.method public onSpentFilterClick()V
    .locals 4

    .line 387
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/wallet/WalletV2PresenterImpl;->mvpView:Lcom/ibotta/android/mvp/base/MvpView;

    check-cast v0, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/wallet/WalletV2View;

    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/wallet/WalletV2PresenterImpl;->pwiWalletReducer:Lcom/ibotta/android/pwi/PwiWalletV2Reducer;

    iget-object v2, p0, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/wallet/WalletV2PresenterImpl;->transactions:Ljava/util/List;

    iget-object v3, p0, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/wallet/WalletV2PresenterImpl;->spentFilter:Lcom/ibotta/android/views/pwi/wallet/SpentFilter;

    invoke-virtual {v1, v2, v3}, Lcom/ibotta/android/pwi/PwiWalletV2Reducer;->createSpentFilterSelectorViewState(Ljava/util/List;Lcom/ibotta/android/views/pwi/wallet/SpentFilter;)Lcom/ibotta/android/views/pwi/wallet/SpentFilterSelectorViewState;

    move-result-object v1

    invoke-interface {v0, v1}, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/wallet/WalletV2View;->showSpentFilterSelector(Lcom/ibotta/android/views/pwi/wallet/SpentFilterSelectorViewState;)V

    return-void
.end method

.method public onStart()V
    .locals 1

    .line 120
    invoke-super {p0}, Lcom/ibotta/android/mvp/base/loading/AbstractLoadingMvpPresenter;->onStart()V

    .line 121
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/wallet/WalletV2PresenterImpl;->googlePayManager:Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/GooglePayManager;

    invoke-interface {v0}, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/GooglePayManager;->isReadyToPay()V

    return-void
.end method

.method protected onSubmitJobSuccess(Lcom/ibotta/android/service/api/job/SingleApiJob;)V
    .locals 1

    .line 281
    invoke-super {p0, p1}, Lcom/ibotta/android/mvp/base/loading/AbstractLoadingMvpPresenter;->onSubmitJobSuccess(Lcom/ibotta/android/service/api/job/SingleApiJob;)V

    .line 283
    invoke-virtual {p1}, Lcom/ibotta/android/service/api/job/SingleApiJob;->getApiCall()Lcom/ibotta/api/ApiCall;

    move-result-object v0

    instance-of v0, v0, Lcom/ibotta/api/call/pwi/BgcPaymentAccountsDeleteCall;

    if-nez v0, :cond_1

    .line 284
    invoke-virtual {p1}, Lcom/ibotta/android/service/api/job/SingleApiJob;->getApiCall()Lcom/ibotta/api/ApiCall;

    move-result-object v0

    instance-of v0, v0, Lcom/ibotta/api/call/pwi/BgcPaymentAccountsPutCall;

    if-eqz v0, :cond_0

    goto :goto_0

    .line 287
    :cond_0
    invoke-virtual {p1}, Lcom/ibotta/android/service/api/job/SingleApiJob;->getApiCall()Lcom/ibotta/api/ApiCall;

    move-result-object v0

    instance-of v0, v0, Lcom/ibotta/api/call/pwi/BgcTransactionSpentPutCall;

    if-eqz v0, :cond_2

    .line 288
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/wallet/WalletV2PresenterImpl;->pwiApiManager:Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/PwiApiManager;

    invoke-interface {v0, p1}, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/PwiApiManager;->updateCacheOnSuccessfulPurchase(Lcom/ibotta/android/service/api/job/SingleApiJob;)V

    .line 289
    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/wallet/WalletV2PresenterImpl;->reload()V

    goto :goto_1

    .line 286
    :cond_1
    :goto_0
    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/wallet/WalletV2PresenterImpl;->reload()V

    :cond_2
    :goto_1
    return-void
.end method

.method public onSuccess(Lcom/stripe/android/model/Customer;)V
    .locals 2

    .line 215
    :try_start_0
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/wallet/WalletV2PresenterImpl;->pwiApiManager:Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/PwiApiManager;

    invoke-interface {v0, p1}, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/PwiApiManager;->getAllPaymentMethodsFromCustomer(Lcom/stripe/android/model/Customer;)Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/wallet/WalletV2PresenterImpl;->paymentMethods:Ljava/util/List;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 221
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/wallet/WalletV2PresenterImpl;->mvpView:Lcom/ibotta/android/mvp/base/MvpView;

    if-eqz v0, :cond_0

    .line 222
    :goto_0
    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/wallet/WalletV2PresenterImpl;->customer:Lcom/stripe/android/model/Customer;

    .line 223
    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/wallet/WalletV2PresenterImpl;->initViewStates()V

    goto :goto_1

    :catchall_0
    move-exception v0

    goto :goto_2

    :catch_0
    move-exception v0

    .line 217
    :try_start_1
    invoke-static {v0}, Ltimber/log/Timber;->e(Ljava/lang/Throwable;)V

    .line 218
    sget-object v1, Lcom/ibotta/android/crash/IbottaCrashProxy;->IbottaCrashManager:Lcom/ibotta/android/crash/CrashManager;

    invoke-virtual {v1, v0}, Lcom/ibotta/android/crash/CrashManager;->trackException(Ljava/lang/Throwable;)V

    .line 219
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/wallet/WalletV2PresenterImpl;->mvpView:Lcom/ibotta/android/mvp/base/MvpView;

    check-cast v0, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/wallet/WalletV2View;

    invoke-interface {v0}, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/wallet/WalletV2View;->finish()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 221
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/wallet/WalletV2PresenterImpl;->mvpView:Lcom/ibotta/android/mvp/base/MvpView;

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    :goto_1
    return-void

    :goto_2
    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/wallet/WalletV2PresenterImpl;->mvpView:Lcom/ibotta/android/mvp/base/MvpView;

    if-eqz v1, :cond_1

    .line 222
    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/wallet/WalletV2PresenterImpl;->customer:Lcom/stripe/android/model/Customer;

    .line 223
    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/wallet/WalletV2PresenterImpl;->initViewStates()V

    :cond_1
    throw v0
.end method

.method public onTransactionActionClick(Lcom/ibotta/android/views/pwi/transactions/PwiTransactionRowViewState;)V
    .locals 1
    .param p1    # Lcom/ibotta/android/views/pwi/transactions/PwiTransactionRowViewState;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    .line 256
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/wallet/WalletV2PresenterImpl;->mvpView:Lcom/ibotta/android/mvp/base/MvpView;

    check-cast v0, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/wallet/WalletV2View;

    invoke-interface {v0, p1}, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/wallet/WalletV2View;->showTransactionActionsDialog(Lcom/ibotta/android/views/pwi/transactions/PwiTransactionRowViewState;)V

    return-void
.end method

.method public onTransactionActionsDialogClicked(Lcom/ibotta/android/views/pwi/transactions/PwiTransactionRowViewState;Lcom/ibotta/android/mvp/ui/dialog/CustomBottomSheetDialog$CustomBottomSheetOption;)V
    .locals 1
    .annotation runtime Lcom/ibotta/android/aop/tracking/TrackingAfter;
        value = .enum Lcom/ibotta/android/aop/tracking/TrackingType;->PWI_MANAGE_TRANSACTION_ACTION:Lcom/ibotta/android/aop/tracking/TrackingType;
    .end annotation

    sget-object v0, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/wallet/WalletV2PresenterImpl;->ajc$tjp_1:Lorg/aspectj/lang/JoinPoint$StaticPart;

    invoke-static {v0, p0, p0, p1, p2}, Lorg/aspectj/runtime/reflect/Factory;->makeJP(Lorg/aspectj/lang/JoinPoint$StaticPart;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Lorg/aspectj/lang/JoinPoint;

    move-result-object v0

    .line 338
    :try_start_0
    invoke-virtual {p2}, Lcom/ibotta/android/mvp/ui/dialog/CustomBottomSheetDialog$CustomBottomSheetOption;->getId()I

    move-result p2

    packed-switch p2, :pswitch_data_0

    goto :goto_0

    .line 340
    :pswitch_0
    invoke-direct {p0, p1}, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/wallet/WalletV2PresenterImpl;->setTransactionSpentStatus(Lcom/ibotta/android/views/pwi/transactions/PwiTransactionRowViewState;)V

    goto :goto_0

    .line 343
    :pswitch_1
    iget-object p2, p0, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/wallet/WalletV2PresenterImpl;->mvpView:Lcom/ibotta/android/mvp/base/MvpView;

    check-cast p2, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/wallet/WalletV2View;

    invoke-interface {p2, p1}, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/wallet/WalletV2View;->showBarcodeScreen(Lcom/ibotta/android/views/pwi/transactions/PwiTransactionRowViewState;)V

    goto :goto_0

    .line 346
    :pswitch_2
    iget-object p2, p0, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/wallet/WalletV2PresenterImpl;->mvpView:Lcom/ibotta/android/mvp/base/MvpView;

    check-cast p2, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/wallet/WalletV2View;

    invoke-virtual {p1}, Lcom/ibotta/android/views/pwi/transactions/PwiTransactionRowViewState;->getRetailerId()I

    move-result p1

    invoke-interface {p2, p1}, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/wallet/WalletV2View;->showPwiHomeScreen(I)V
    :try_end_0
    .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0

    .line 349
    :goto_0
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

    :pswitch_data_0
    .packed-switch 0x3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
