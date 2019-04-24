.class public Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/PwiHomePresenterImpl;
.super Lcom/ibotta/android/mvp/base/loading/AbstractLoadingMvpPresenter;
.source "PwiHomePresenterImpl.java"

# interfaces
.implements Lcom/ibotta/android/aop/tracking/advice/PwiHomeAdviceFields;
.implements Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/GooglePayManagerListener;
.implements Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/PwiHomePresenter;
.implements Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/StripeManagerListener;
.implements Lcom/ibotta/android/views/pwi/home/PwiAddMoneyViewEvents;
.implements Lcom/ibotta/android/views/pwi/transactions/PwiTransactionsViewEvents;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/ibotta/android/mvp/base/loading/AbstractLoadingMvpPresenter<",
        "Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/PwiHomeView;",
        ">;",
        "Lcom/ibotta/android/aop/tracking/advice/PwiHomeAdviceFields;",
        "Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/GooglePayManagerListener;",
        "Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/PwiHomePresenter;",
        "Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/StripeManagerListener;",
        "Lcom/ibotta/android/views/pwi/home/PwiAddMoneyViewEvents;",
        "Lcom/ibotta/android/views/pwi/transactions/PwiTransactionsViewEvents;"
    }
.end annotation


# static fields
.field private static final TRANSACTIONS_LIMIT:I = 0xa

.field private static final TXN_PREFIX:Ljava/lang/String; = "txn_"

.field private static final synthetic ajc$tjp_0:Lorg/aspectj/lang/JoinPoint$StaticPart;

.field private static final synthetic ajc$tjp_1:Lorg/aspectj/lang/JoinPoint$StaticPart;

.field private static final synthetic ajc$tjp_2:Lorg/aspectj/lang/JoinPoint$StaticPart;

.field private static final synthetic ajc$tjp_3:Lorg/aspectj/lang/JoinPoint$StaticPart;

.field private static final synthetic ajc$tjp_4:Lorg/aspectj/lang/JoinPoint$StaticPart;

.field private static final synthetic ajc$tjp_5:Lorg/aspectj/lang/JoinPoint$StaticPart;


# instance fields
.field private final appHelper:Lcom/ibotta/android/util/AppHelper;

.field private bgcTransaction:Lcom/ibotta/api/model/pwi/BgcTransaction;

.field private buyableGiftCardModel:Lcom/ibotta/api/model/BuyableGiftCardModel;

.field private contentId:Lcom/ibotta/android/apiandroid/content/ContentId;
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation
.end field

.field private customer:Lcom/stripe/android/model/Customer;

.field private defaultPaymentMethod:Lcom/ibotta/android/views/pwi/home/payments/PaymentOptionRowViewState;

.field private final formatting:Lcom/ibotta/android/util/Formatting;

.field private giftCardJob:Lcom/ibotta/android/service/api/job/SingleApiJob;
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation
.end field

.field private final googlePayManager:Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/GooglePayManager;

.field private googlePayToken:Lcom/stripe/android/model/Token;

.field private final graphQLCallFactory:Lcom/ibotta/android/graphql/GraphQLCallFactory;

.field private hasGooglePaySupport:Z

.field private hasPendingTxn:Z

.field private isFirstTimeCard:Z

.field private orderStartTime:J

.field private paymentAccount:Lcom/ibotta/api/model/pwi/BgcPaymentAccount;

.field private paymentAccountsJob:Lcom/ibotta/android/service/api/job/SingleApiJob;
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation
.end field

.field private pendingTxnJob:Lcom/ibotta/android/service/api/job/SingleApiJob;
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation
.end field

.field private postTxnJob:Lcom/ibotta/android/service/api/job/SingleApiJob;
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation
.end field

.field private postTxnJobCounter:I

.field private purchaseAmount:D

.field private purchaseAmountCents:I

.field private final pwiApiManager:Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/PwiApiManager;

.field private final pwiErrorDialogFactory:Lcom/ibotta/android/mvp/ui/activity/pwi/PwiErrorDialogFactory;

.field private final pwiHomeReducer:Lcom/ibotta/android/pwi/PwiHomeReducer;

.field private final pwiUserState:Lcom/ibotta/android/state/pwi/PwiUserState;

.field private final pwiVariant:Lcom/ibotta/android/features/variant/pwi/PwiVariant;

.field private final recentlyViewedRetailersService:Lcom/ibotta/android/search/recentlyviewed/RecentlyViewedRetailersService;

.field private retailerId:I

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

.field private txnId:Ljava/lang/String;

.field private final userState:Lcom/ibotta/android/state/user/UserState;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    .line 1
    invoke-static {}, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/PwiHomePresenterImpl;->ajc$preClinit()V

    return-void
.end method

.method public constructor <init>(Lcom/ibotta/android/mvp/base/MvpPresenterActions;Lcom/ibotta/android/graphql/GraphQLCallFactory;Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/PwiApiManager;Lcom/ibotta/android/pwi/PwiHomeReducer;Lcom/ibotta/android/state/pwi/PwiUserState;Lcom/ibotta/android/features/variant/pwi/PwiVariant;Lcom/ibotta/android/state/user/UserState;Lcom/ibotta/android/util/Formatting;Lcom/ibotta/android/util/AppHelper;Lcom/ibotta/android/mvp/ui/activity/pwi/PwiErrorDialogFactory;Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/GooglePayManager;Lcom/ibotta/android/search/recentlyviewed/RecentlyViewedRetailersService;)V
    .locals 2

    .line 155
    invoke-direct {p0, p1}, Lcom/ibotta/android/mvp/base/loading/AbstractLoadingMvpPresenter;-><init>(Lcom/ibotta/android/mvp/base/MvpPresenterActions;)V

    const-string p1, ""

    .line 99
    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/PwiHomePresenterImpl;->txnId:Ljava/lang/String;

    const/4 p1, 0x0

    .line 100
    iput p1, p0, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/PwiHomePresenterImpl;->retailerId:I

    const/4 v0, 0x0

    .line 101
    iput-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/PwiHomePresenterImpl;->contentId:Lcom/ibotta/android/apiandroid/content/ContentId;

    .line 108
    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/PwiHomePresenterImpl;->transactions:Ljava/util/List;

    .line 109
    sget-object v0, Lcom/ibotta/android/views/pwi/home/payments/PaymentOptionRowViewState;->ADD_CARD:Lcom/ibotta/android/views/pwi/home/payments/PaymentOptionRowViewState;

    iput-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/PwiHomePresenterImpl;->defaultPaymentMethod:Lcom/ibotta/android/views/pwi/home/payments/PaymentOptionRowViewState;

    const-wide/16 v0, 0x0

    .line 113
    iput-wide v0, p0, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/PwiHomePresenterImpl;->purchaseAmount:D

    .line 114
    iput p1, p0, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/PwiHomePresenterImpl;->purchaseAmountCents:I

    .line 115
    iput p1, p0, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/PwiHomePresenterImpl;->postTxnJobCounter:I

    const-wide/16 v0, 0x0

    .line 116
    iput-wide v0, p0, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/PwiHomePresenterImpl;->orderStartTime:J

    .line 117
    iput-boolean p1, p0, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/PwiHomePresenterImpl;->isFirstTimeCard:Z

    .line 118
    iput-boolean p1, p0, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/PwiHomePresenterImpl;->hasPendingTxn:Z

    .line 119
    iput-boolean p1, p0, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/PwiHomePresenterImpl;->hasGooglePaySupport:Z

    .line 156
    iput-object p2, p0, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/PwiHomePresenterImpl;->graphQLCallFactory:Lcom/ibotta/android/graphql/GraphQLCallFactory;

    .line 157
    iput-object p3, p0, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/PwiHomePresenterImpl;->pwiApiManager:Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/PwiApiManager;

    .line 158
    iput-object p4, p0, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/PwiHomePresenterImpl;->pwiHomeReducer:Lcom/ibotta/android/pwi/PwiHomeReducer;

    .line 159
    iput-object p5, p0, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/PwiHomePresenterImpl;->pwiUserState:Lcom/ibotta/android/state/pwi/PwiUserState;

    .line 160
    iput-object p6, p0, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/PwiHomePresenterImpl;->pwiVariant:Lcom/ibotta/android/features/variant/pwi/PwiVariant;

    .line 161
    iput-object p7, p0, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/PwiHomePresenterImpl;->userState:Lcom/ibotta/android/state/user/UserState;

    .line 162
    iput-object p8, p0, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/PwiHomePresenterImpl;->formatting:Lcom/ibotta/android/util/Formatting;

    .line 163
    iput-object p9, p0, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/PwiHomePresenterImpl;->appHelper:Lcom/ibotta/android/util/AppHelper;

    .line 164
    iput-object p10, p0, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/PwiHomePresenterImpl;->pwiErrorDialogFactory:Lcom/ibotta/android/mvp/ui/activity/pwi/PwiErrorDialogFactory;

    .line 165
    iput-object p11, p0, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/PwiHomePresenterImpl;->googlePayManager:Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/GooglePayManager;

    .line 167
    iget-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/PwiHomePresenterImpl;->pwiApiManager:Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/PwiApiManager;

    invoke-interface {p1, p0}, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/PwiApiManager;->setStripeManagerListener(Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/StripeManagerListener;)V

    .line 168
    iget-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/PwiHomePresenterImpl;->googlePayManager:Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/GooglePayManager;

    invoke-interface {p1, p0}, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/GooglePayManager;->setGooglePayManagerListener(Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/GooglePayManagerListener;)V

    .line 169
    iput-object p12, p0, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/PwiHomePresenterImpl;->recentlyViewedRetailersService:Lcom/ibotta/android/search/recentlyviewed/RecentlyViewedRetailersService;

    return-void
.end method

.method static synthetic access$000(Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/PwiHomePresenterImpl;)V
    .locals 0

    .line 91
    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/PwiHomePresenterImpl;->clearTransactionInformation()V

    return-void
.end method

.method static synthetic access$100(Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/PwiHomePresenterImpl;Lcom/ibotta/android/views/pwi/home/PwiAddMoneyView$PwiPurchaseAmountState;)V
    .locals 0

    .line 91
    invoke-direct {p0, p1}, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/PwiHomePresenterImpl;->initViewStates(Lcom/ibotta/android/views/pwi/home/PwiAddMoneyView$PwiPurchaseAmountState;)V

    return-void
.end method

.method static synthetic access$200(Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/PwiHomePresenterImpl;)V
    .locals 0

    .line 91
    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/PwiHomePresenterImpl;->clearTransactionJobInformation()V

    return-void
.end method

.method static synthetic access$300(Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/PwiHomePresenterImpl;)V
    .locals 0

    .line 91
    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/PwiHomePresenterImpl;->submitTransactionPostJob()V

    return-void
.end method

.method static synthetic access$402(Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/PwiHomePresenterImpl;Z)Z
    .locals 0

    .line 91
    iput-boolean p1, p0, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/PwiHomePresenterImpl;->hasPendingTxn:Z

    return p1
.end method

.method static synthetic access$500(Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/PwiHomePresenterImpl;)Lcom/ibotta/android/state/pwi/PwiUserState;
    .locals 0

    .line 91
    iget-object p0, p0, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/PwiHomePresenterImpl;->pwiUserState:Lcom/ibotta/android/state/pwi/PwiUserState;

    return-object p0
.end method

.method static synthetic access$600(Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/PwiHomePresenterImpl;)V
    .locals 0

    .line 91
    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/PwiHomePresenterImpl;->onPayConfirmation()V

    return-void
.end method

.method private static synthetic ajc$preClinit()V
    .locals 10

    .line 1
    new-instance v8, Lorg/aspectj/runtime/reflect/Factory;

    const-string v0, "PwiHomePresenterImpl.java"

    const-class v1, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/PwiHomePresenterImpl;

    invoke-direct {v8, v0, v1}, Lorg/aspectj/runtime/reflect/Factory;-><init>(Ljava/lang/String;Ljava/lang/Class;)V

    const-string v9, "method-execution"

    const-string v1, "1"

    const-string v2, "onHelpIconClicked"

    const-string v3, "com.ibotta.android.mvp.ui.activity.pwi.v2.home.PwiHomePresenterImpl"

    const-string v4, ""

    const-string v5, ""

    const-string v6, ""

    const-string v7, "void"

    move-object v0, v8

    invoke-virtual/range {v0 .. v7}, Lorg/aspectj/runtime/reflect/Factory;->makeMethodSig(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lorg/aspectj/lang/reflect/MethodSignature;

    move-result-object v0

    const/16 v1, 0x1a3

    invoke-virtual {v8, v9, v0, v1}, Lorg/aspectj/runtime/reflect/Factory;->makeSJP(Ljava/lang/String;Lorg/aspectj/lang/Signature;I)Lorg/aspectj/lang/JoinPoint$StaticPart;

    move-result-object v0

    sput-object v0, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/PwiHomePresenterImpl;->ajc$tjp_0:Lorg/aspectj/lang/JoinPoint$StaticPart;

    const-string v9, "method-execution"

    const-string v1, "1"

    const-string v2, "onManageAllTransactionsClick"

    const-string v3, "com.ibotta.android.mvp.ui.activity.pwi.v2.home.PwiHomePresenterImpl"

    const-string v4, ""

    const-string v5, ""

    const-string v6, ""

    const-string v7, "void"

    move-object v0, v8

    invoke-virtual/range {v0 .. v7}, Lorg/aspectj/runtime/reflect/Factory;->makeMethodSig(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lorg/aspectj/lang/reflect/MethodSignature;

    move-result-object v0

    const/16 v1, 0x1c2

    invoke-virtual {v8, v9, v0, v1}, Lorg/aspectj/runtime/reflect/Factory;->makeSJP(Ljava/lang/String;Lorg/aspectj/lang/Signature;I)Lorg/aspectj/lang/JoinPoint$StaticPart;

    move-result-object v0

    sput-object v0, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/PwiHomePresenterImpl;->ajc$tjp_1:Lorg/aspectj/lang/JoinPoint$StaticPart;

    const-string v9, "method-execution"

    const-string v1, "2"

    const-string v2, "submitTransactionPostJob"

    const-string v3, "com.ibotta.android.mvp.ui.activity.pwi.v2.home.PwiHomePresenterImpl"

    const-string v4, ""

    const-string v5, ""

    const-string v6, ""

    const-string v7, "void"

    move-object v0, v8

    invoke-virtual/range {v0 .. v7}, Lorg/aspectj/runtime/reflect/Factory;->makeMethodSig(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lorg/aspectj/lang/reflect/MethodSignature;

    move-result-object v0

    const/16 v1, 0x21c

    invoke-virtual {v8, v9, v0, v1}, Lorg/aspectj/runtime/reflect/Factory;->makeSJP(Ljava/lang/String;Lorg/aspectj/lang/Signature;I)Lorg/aspectj/lang/JoinPoint$StaticPart;

    move-result-object v0

    sput-object v0, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/PwiHomePresenterImpl;->ajc$tjp_2:Lorg/aspectj/lang/JoinPoint$StaticPart;

    const-string v9, "method-execution"

    const-string v1, "2"

    const-string v2, "onOrderSuccess"

    const-string v3, "com.ibotta.android.mvp.ui.activity.pwi.v2.home.PwiHomePresenterImpl"

    const-string v4, "com.ibotta.android.service.api.job.SingleApiJob"

    const-string v5, "apiJob"

    const-string v6, ""

    const-string v7, "void"

    move-object v0, v8

    invoke-virtual/range {v0 .. v7}, Lorg/aspectj/runtime/reflect/Factory;->makeMethodSig(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lorg/aspectj/lang/reflect/MethodSignature;

    move-result-object v0

    const/16 v1, 0x26f

    invoke-virtual {v8, v9, v0, v1}, Lorg/aspectj/runtime/reflect/Factory;->makeSJP(Ljava/lang/String;Lorg/aspectj/lang/Signature;I)Lorg/aspectj/lang/JoinPoint$StaticPart;

    move-result-object v0

    sput-object v0, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/PwiHomePresenterImpl;->ajc$tjp_3:Lorg/aspectj/lang/JoinPoint$StaticPart;

    const-string v9, "method-execution"

    const-string v1, "2"

    const-string v2, "handlePwiError"

    const-string v3, "com.ibotta.android.mvp.ui.activity.pwi.v2.home.PwiHomePresenterImpl"

    const-string v4, "com.ibotta.api.model.pwi.PwiError:int"

    const-string v5, "pwiError:httpCode"

    const-string v6, ""

    const-string v7, "void"

    move-object v0, v8

    invoke-virtual/range {v0 .. v7}, Lorg/aspectj/runtime/reflect/Factory;->makeMethodSig(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lorg/aspectj/lang/reflect/MethodSignature;

    move-result-object v0

    const/16 v1, 0x2a3

    invoke-virtual {v8, v9, v0, v1}, Lorg/aspectj/runtime/reflect/Factory;->makeSJP(Ljava/lang/String;Lorg/aspectj/lang/Signature;I)Lorg/aspectj/lang/JoinPoint$StaticPart;

    move-result-object v0

    sput-object v0, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/PwiHomePresenterImpl;->ajc$tjp_4:Lorg/aspectj/lang/JoinPoint$StaticPart;

    const-string v9, "method-execution"

    const-string v1, "2"

    const-string v2, "trackOnTransactionsTabViewed"

    const-string v3, "com.ibotta.android.mvp.ui.activity.pwi.v2.home.PwiHomePresenterImpl"

    const-string v4, ""

    const-string v5, ""

    const-string v6, ""

    const-string v7, "void"

    move-object v0, v8

    invoke-virtual/range {v0 .. v7}, Lorg/aspectj/runtime/reflect/Factory;->makeMethodSig(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lorg/aspectj/lang/reflect/MethodSignature;

    move-result-object v0

    const/16 v1, 0x319

    invoke-virtual {v8, v9, v0, v1}, Lorg/aspectj/runtime/reflect/Factory;->makeSJP(Ljava/lang/String;Lorg/aspectj/lang/Signature;I)Lorg/aspectj/lang/JoinPoint$StaticPart;

    move-result-object v0

    sput-object v0, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/PwiHomePresenterImpl;->ajc$tjp_5:Lorg/aspectj/lang/JoinPoint$StaticPart;

    return-void
.end method

.method private clearTransactionInformation()V
    .locals 2

    const-string v0, ""

    .line 632
    iput-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/PwiHomePresenterImpl;->txnId:Ljava/lang/String;

    const/4 v0, 0x0

    .line 633
    iput-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/PwiHomePresenterImpl;->postTxnJob:Lcom/ibotta/android/service/api/job/SingleApiJob;

    const-wide/16 v0, 0x0

    .line 634
    iput-wide v0, p0, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/PwiHomePresenterImpl;->purchaseAmount:D

    const/4 v0, 0x0

    .line 635
    iput v0, p0, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/PwiHomePresenterImpl;->purchaseAmountCents:I

    return-void
.end method

.method private clearTransactionJobInformation()V
    .locals 1

    const-string v0, ""

    .line 639
    iput-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/PwiHomePresenterImpl;->txnId:Ljava/lang/String;

    const/4 v0, 0x0

    .line 640
    iput-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/PwiHomePresenterImpl;->postTxnJob:Lcom/ibotta/android/service/api/job/SingleApiJob;

    return-void
.end method

.method private generateTxnId()V
    .locals 3

    .line 533
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/PwiHomePresenterImpl;->txnId:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 534
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "txn_"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/PwiHomePresenterImpl;->userState:Lcom/ibotta/android/state/user/UserState;

    invoke-interface {v1}, Lcom/ibotta/android/state/user/UserState;->getCustomerId()I

    move-result v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/PwiHomePresenterImpl;->appHelper:Lcom/ibotta/android/util/AppHelper;

    invoke-interface {v1}, Lcom/ibotta/android/util/AppHelper;->getCurrentTime()J

    move-result-wide v1

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/PwiHomePresenterImpl;->txnId:Ljava/lang/String;

    :cond_0
    return-void
.end method

.method private getInputStateForAmount(D)Lcom/ibotta/android/views/pwi/home/PwiAddMoneyView$PwiPurchaseAmountState;
    .locals 3

    const-wide/16 v0, 0x0

    cmpl-double v2, p1, v0

    if-nez v2, :cond_0

    .line 509
    sget-object p1, Lcom/ibotta/android/views/pwi/home/PwiAddMoneyView$PwiPurchaseAmountState;->EMPTY:Lcom/ibotta/android/views/pwi/home/PwiAddMoneyView$PwiPurchaseAmountState;

    return-object p1

    .line 510
    :cond_0
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/PwiHomePresenterImpl;->buyableGiftCardModel:Lcom/ibotta/api/model/BuyableGiftCardModel;

    invoke-interface {v0}, Lcom/ibotta/api/model/BuyableGiftCardModel;->getMaxPurchaseAmount()F

    move-result v0

    float-to-double v0, v0

    cmpl-double v2, p1, v0

    if-gtz v2, :cond_2

    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/PwiHomePresenterImpl;->buyableGiftCardModel:Lcom/ibotta/api/model/BuyableGiftCardModel;

    .line 511
    invoke-interface {v0}, Lcom/ibotta/api/model/BuyableGiftCardModel;->getMinPurchaseAmount()F

    move-result v0

    float-to-double v0, v0

    cmpg-double v2, p1, v0

    if-gez v2, :cond_1

    goto :goto_0

    .line 514
    :cond_1
    sget-object p1, Lcom/ibotta/android/views/pwi/home/PwiAddMoneyView$PwiPurchaseAmountState;->VALID:Lcom/ibotta/android/views/pwi/home/PwiAddMoneyView$PwiPurchaseAmountState;

    return-object p1

    .line 512
    :cond_2
    :goto_0
    sget-object p1, Lcom/ibotta/android/views/pwi/home/PwiAddMoneyView$PwiPurchaseAmountState;->INVALID:Lcom/ibotta/android/views/pwi/home/PwiAddMoneyView$PwiPurchaseAmountState;

    return-object p1
.end method

.method private handleGetTransactionResponse(Lcom/ibotta/android/service/api/job/SingleApiJob;)V
    .locals 1

    .line 600
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/PwiHomePresenterImpl;->mvpView:Lcom/ibotta/android/mvp/base/MvpView;

    check-cast v0, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/PwiHomeView;

    invoke-interface {v0}, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/PwiHomeView;->resetLoadingIndicatorText()V

    .line 602
    :try_start_0
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/PwiHomePresenterImpl;->pwiApiManager:Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/PwiApiManager;

    invoke-interface {v0, p1}, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/PwiApiManager;->getTransactionFromJob(Lcom/ibotta/android/service/api/job/SingleApiJob;)Lcom/ibotta/api/model/pwi/BgcTransaction;

    move-result-object v0

    iput-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/PwiHomePresenterImpl;->bgcTransaction:Lcom/ibotta/api/model/pwi/BgcTransaction;
    :try_end_0
    .catch Lcom/ibotta/android/mvp/ui/activity/find/IllegalApiJobStateException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/IllegalStateException; {:try_start_0 .. :try_end_0} :catch_0

    .line 609
    invoke-direct {p0, p1}, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/PwiHomePresenterImpl;->orderComplete(Lcom/ibotta/android/service/api/job/SingleApiJob;)V

    return-void

    :catch_0
    move-exception p1

    goto :goto_0

    :catch_1
    move-exception p1

    .line 604
    :goto_0
    sget-object v0, Lcom/ibotta/android/crash/IbottaCrashProxy;->IbottaCrashManager:Lcom/ibotta/android/crash/CrashManager;

    invoke-virtual {v0, p1}, Lcom/ibotta/android/crash/CrashManager;->trackException(Ljava/lang/Throwable;)V

    .line 605
    iget-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/PwiHomePresenterImpl;->mvpView:Lcom/ibotta/android/mvp/base/MvpView;

    check-cast p1, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/PwiHomeView;

    invoke-interface {p1}, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/PwiHomeView;->finish()V

    return-void
.end method

.method private handlePostTransactionResponse(Lcom/ibotta/android/service/api/job/SingleApiJob;)V
    .locals 1

    .line 589
    :try_start_0
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/PwiHomePresenterImpl;->pwiApiManager:Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/PwiApiManager;

    invoke-interface {v0, p1}, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/PwiApiManager;->getTransactionFromJob(Lcom/ibotta/android/service/api/job/SingleApiJob;)Lcom/ibotta/api/model/pwi/BgcTransaction;

    move-result-object p1

    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/PwiHomePresenterImpl;->bgcTransaction:Lcom/ibotta/api/model/pwi/BgcTransaction;
    :try_end_0
    .catch Lcom/ibotta/android/mvp/ui/activity/find/IllegalApiJobStateException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/IllegalStateException; {:try_start_0 .. :try_end_0} :catch_0

    .line 596
    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/PwiHomePresenterImpl;->submitPollingJob()V

    return-void

    :catch_0
    move-exception p1

    goto :goto_0

    :catch_1
    move-exception p1

    .line 591
    :goto_0
    sget-object v0, Lcom/ibotta/android/crash/IbottaCrashProxy;->IbottaCrashManager:Lcom/ibotta/android/crash/CrashManager;

    invoke-virtual {v0, p1}, Lcom/ibotta/android/crash/CrashManager;->trackException(Ljava/lang/Throwable;)V

    .line 592
    iget-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/PwiHomePresenterImpl;->mvpView:Lcom/ibotta/android/mvp/base/MvpView;

    check-cast p1, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/PwiHomeView;

    invoke-interface {p1}, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/PwiHomeView;->finish()V

    return-void
.end method

.method private handlePwiError(Lcom/ibotta/api/model/pwi/PwiError;I)V
    .locals 4
    .param p1    # Lcom/ibotta/api/model/pwi/PwiError;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param
    .annotation runtime Lcom/ibotta/android/aop/tracking/TrackingBefore;
        value = .enum Lcom/ibotta/android/aop/tracking/TrackingType;->PWI_ERRORS:Lcom/ibotta/android/aop/tracking/TrackingType;
    .end annotation

    sget-object v0, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/PwiHomePresenterImpl;->ajc$tjp_4:Lorg/aspectj/lang/JoinPoint$StaticPart;

    invoke-static {p2}, Lorg/aspectj/runtime/internal/Conversions;->intObject(I)Ljava/lang/Object;

    move-result-object v1

    invoke-static {v0, p0, p0, p1, v1}, Lorg/aspectj/runtime/reflect/Factory;->makeJP(Lorg/aspectj/lang/JoinPoint$StaticPart;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Lorg/aspectj/lang/JoinPoint;

    move-result-object v0

    .line 675
    invoke-static {}, Lcom/ibotta/android/aop/tracking/TrackingAspect;->aspectOf()Lcom/ibotta/android/aop/tracking/TrackingAspect;

    move-result-object v1

    invoke-virtual {v1, v0}, Lcom/ibotta/android/aop/tracking/TrackingAspect;->before(Lorg/aspectj/lang/JoinPoint;)V

    sget-object v0, Lcom/ibotta/android/crash/IbottaCrashProxy;->IbottaCrashManager:Lcom/ibotta/android/crash/CrashManager;

    new-instance v1, Lcom/ibotta/android/mvp/ui/activity/pwi/PwiErrorException;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "PWI Error with http response code of: "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    .line 676
    iget-object v2, p0, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/PwiHomePresenterImpl;->bgcTransaction:Lcom/ibotta/api/model/pwi/BgcTransaction;

    if-eqz v2, :cond_0

    invoke-virtual {v2}, Lcom/ibotta/api/model/pwi/BgcTransaction;->getStatus()Ljava/lang/String;

    move-result-object v2

    goto :goto_0

    :cond_0
    const-string v2, ""

    :goto_0
    invoke-direct {v1, p2, p1, v2}, Lcom/ibotta/android/mvp/ui/activity/pwi/PwiErrorException;-><init>(Ljava/lang/String;Lcom/ibotta/api/model/pwi/PwiError;Ljava/lang/String;)V

    .line 675
    invoke-virtual {v0, v1}, Lcom/ibotta/android/crash/CrashManager;->trackException(Ljava/lang/Throwable;)V

    .line 678
    iget-object p2, p0, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/PwiHomePresenterImpl;->pwiErrorDialogFactory:Lcom/ibotta/android/mvp/ui/activity/pwi/PwiErrorDialogFactory;

    invoke-virtual {p2, p1}, Lcom/ibotta/android/mvp/ui/activity/pwi/PwiErrorDialogFactory;->shouldRetryTransaction(Lcom/ibotta/api/model/pwi/PwiError;)Z

    move-result p2

    if-eqz p2, :cond_1

    .line 679
    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/PwiHomePresenterImpl;->submitTransactionPostJob()V

    goto :goto_1

    .line 681
    :cond_1
    invoke-static {p1}, Lcom/ibotta/android/mvp/ui/activity/pwi/StripeErrorCode;->getActionFromError(Lcom/ibotta/api/model/pwi/PwiError;)Lcom/ibotta/android/mvp/ui/activity/pwi/PwiErrorDialogAction;

    move-result-object p2

    .line 682
    new-instance v0, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/PwiHomePresenterImpl$1;

    invoke-direct {v0, p0, p2}, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/PwiHomePresenterImpl$1;-><init>(Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/PwiHomePresenterImpl;Lcom/ibotta/android/mvp/ui/activity/pwi/PwiErrorDialogAction;)V

    .line 715
    iget-object p2, p0, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/PwiHomePresenterImpl;->pwiErrorDialogFactory:Lcom/ibotta/android/mvp/ui/activity/pwi/PwiErrorDialogFactory;

    invoke-virtual {p2, p1}, Lcom/ibotta/android/mvp/ui/activity/pwi/PwiErrorDialogFactory;->generateDialogViewStateFromError(Lcom/ibotta/api/model/pwi/PwiError;)Lcom/ibotta/android/views/messages/alert/SemiModalViewState;

    move-result-object p1

    .line 716
    iget-object p2, p0, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/PwiHomePresenterImpl;->mvpView:Lcom/ibotta/android/mvp/base/MvpView;

    check-cast p2, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/PwiHomeView;

    invoke-interface {p2}, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/PwiHomeView;->hideSubmittedJobLoading()V

    .line 717
    iget-object p2, p0, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/PwiHomePresenterImpl;->mvpView:Lcom/ibotta/android/mvp/base/MvpView;

    check-cast p2, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/PwiHomeView;

    invoke-interface {p2, p1, v0}, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/PwiHomeView;->showErrorDialog(Lcom/ibotta/android/views/messages/alert/SemiModalViewState;Lcom/ibotta/android/views/messages/alert/SemiModalViewEvents;)V

    :goto_1
    return-void
.end method

.method private initViewStates(Lcom/ibotta/android/views/pwi/home/PwiAddMoneyView$PwiPurchaseAmountState;)V
    .locals 11

    .line 317
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/PwiHomePresenterImpl;->pwiHomeReducer:Lcom/ibotta/android/pwi/PwiHomeReducer;

    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/PwiHomePresenterImpl;->buyableGiftCardModel:Lcom/ibotta/api/model/BuyableGiftCardModel;

    .line 318
    invoke-virtual {v0, v1}, Lcom/ibotta/android/pwi/PwiHomeReducer;->createToolbarViewState(Lcom/ibotta/api/model/BuyableGiftCardModel;)Lcom/ibotta/android/views/pwi/home/PwiHomeToolbarViewState;

    move-result-object v0

    .line 320
    new-instance v1, Ljava/util/HashMap;

    invoke-direct {v1}, Ljava/util/HashMap;-><init>()V

    .line 321
    sget-object v2, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/PwiHomeTab;->ADD_MONEY:Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/PwiHomeTab;

    iget-object v3, p0, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/PwiHomePresenterImpl;->pwiHomeReducer:Lcom/ibotta/android/pwi/PwiHomeReducer;

    iget-object v4, p0, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/PwiHomePresenterImpl;->defaultPaymentMethod:Lcom/ibotta/android/views/pwi/home/payments/PaymentOptionRowViewState;

    iget-object v5, p0, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/PwiHomePresenterImpl;->buyableGiftCardModel:Lcom/ibotta/api/model/BuyableGiftCardModel;

    iget-wide v6, p0, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/PwiHomePresenterImpl;->purchaseAmount:D

    iget-object v8, p0, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/PwiHomePresenterImpl;->pwiUserState:Lcom/ibotta/android/state/pwi/PwiUserState;

    .line 322
    invoke-interface {v8}, Lcom/ibotta/android/state/pwi/PwiUserState;->isConfirmPurchaseAgain()Z

    move-result v9

    iget-boolean v10, p0, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/PwiHomePresenterImpl;->hasGooglePaySupport:Z

    move-object v8, p1

    .line 321
    invoke-virtual/range {v3 .. v10}, Lcom/ibotta/android/pwi/PwiHomeReducer;->createAddMoneyViewState(Lcom/ibotta/android/views/pwi/home/payments/PaymentOptionRowViewState;Lcom/ibotta/api/model/BuyableGiftCardModel;DLcom/ibotta/android/views/pwi/home/PwiAddMoneyView$PwiPurchaseAmountState;ZZ)Lcom/ibotta/android/views/pwi/home/PwiAddMoneyViewState;

    move-result-object p1

    invoke-interface {v1, v2, p1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 323
    sget-object p1, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/PwiHomeTab;->TRANSACTIONS:Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/PwiHomeTab;

    iget-object v2, p0, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/PwiHomePresenterImpl;->pwiHomeReducer:Lcom/ibotta/android/pwi/PwiHomeReducer;

    iget-object v3, p0, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/PwiHomePresenterImpl;->transactions:Ljava/util/List;

    sget-object v4, Lcom/ibotta/android/views/components/Visibility;->VISIBLE:Lcom/ibotta/android/views/components/Visibility;

    sget-object v5, Lcom/ibotta/android/views/pwi/wallet/SpentFilter;->ALL:Lcom/ibotta/android/views/pwi/wallet/SpentFilter;

    const/4 v6, 0x0

    invoke-virtual {v2, v3, v6, v4, v5}, Lcom/ibotta/android/pwi/PwiHomeReducer;->createTransactionsViewState(Ljava/util/List;ZLcom/ibotta/android/views/components/Visibility;Lcom/ibotta/android/views/pwi/wallet/SpentFilter;)Lcom/ibotta/android/views/pwi/transactions/PwiTransactionsViewState;

    move-result-object v2

    invoke-interface {v1, p1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 329
    iget-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/PwiHomePresenterImpl;->mvpView:Lcom/ibotta/android/mvp/base/MvpView;

    check-cast p1, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/PwiHomeView;

    invoke-interface {p1, v0, v1}, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/PwiHomeView;->setData(Lcom/ibotta/android/views/pwi/home/PwiHomeToolbarViewState;Ljava/util/Map;)V

    return-void
.end method

.method private onAfterPendingTransactionCheck()V
    .locals 3

    .line 728
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/PwiHomePresenterImpl;->mvpView:Lcom/ibotta/android/mvp/base/MvpView;

    check-cast v0, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/PwiHomeView;

    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/PwiHomePresenterImpl;->pwiHomeReducer:Lcom/ibotta/android/pwi/PwiHomeReducer;

    invoke-virtual {v1}, Lcom/ibotta/android/pwi/PwiHomeReducer;->createPendingTxnDialogViewState()Lcom/ibotta/android/views/messages/alert/SemiModalViewState;

    move-result-object v1

    new-instance v2, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/PwiHomePresenterImpl$2;

    invoke-direct {v2, p0}, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/PwiHomePresenterImpl$2;-><init>(Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/PwiHomePresenterImpl;)V

    invoke-interface {v0, v1, v2}, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/PwiHomeView;->showTransactionPendingDialog(Lcom/ibotta/android/views/messages/alert/SemiModalViewState;Lcom/ibotta/android/views/messages/alert/SemiModalViewEvents;)V

    return-void
.end method

.method private onOrderSuccess(Lcom/ibotta/android/service/api/job/SingleApiJob;)V
    .locals 2
    .annotation runtime Lcom/ibotta/android/aop/tracking/TrackingBefore;
        value = .enum Lcom/ibotta/android/aop/tracking/TrackingType;->PWI_ORDER_SUCCESSFULLY_COMPLETE:Lcom/ibotta/android/aop/tracking/TrackingType;
    .end annotation

    sget-object v0, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/PwiHomePresenterImpl;->ajc$tjp_3:Lorg/aspectj/lang/JoinPoint$StaticPart;

    invoke-static {v0, p0, p0, p1}, Lorg/aspectj/runtime/reflect/Factory;->makeJP(Lorg/aspectj/lang/JoinPoint$StaticPart;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Lorg/aspectj/lang/JoinPoint;

    move-result-object v0

    .line 623
    invoke-static {}, Lcom/ibotta/android/aop/tracking/TrackingAspect;->aspectOf()Lcom/ibotta/android/aop/tracking/TrackingAspect;

    move-result-object v1

    invoke-virtual {v1, v0}, Lcom/ibotta/android/aop/tracking/TrackingAspect;->before(Lorg/aspectj/lang/JoinPoint;)V

    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/PwiHomePresenterImpl;->clearTransactionInformation()V

    .line 624
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/PwiHomePresenterImpl;->pwiApiManager:Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/PwiApiManager;

    invoke-interface {v0, p1}, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/PwiApiManager;->updateCacheOnSuccessfulPurchase(Lcom/ibotta/android/service/api/job/SingleApiJob;)V

    .line 625
    iget-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/PwiHomePresenterImpl;->mvpView:Lcom/ibotta/android/mvp/base/MvpView;

    check-cast p1, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/PwiHomeView;

    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/PwiHomePresenterImpl;->bgcTransaction:Lcom/ibotta/api/model/pwi/BgcTransaction;

    invoke-virtual {v0}, Lcom/ibotta/api/model/pwi/BgcTransaction;->getUuid()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x1

    invoke-interface {p1, v0, v1}, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/PwiHomeView;->showBarcodeScreen(Ljava/lang/String;Z)V

    .line 626
    sget-object p1, Lcom/ibotta/android/views/pwi/home/PwiAddMoneyView$PwiPurchaseAmountState;->EMPTY:Lcom/ibotta/android/views/pwi/home/PwiAddMoneyView$PwiPurchaseAmountState;

    invoke-direct {p0, p1}, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/PwiHomePresenterImpl;->initViewStates(Lcom/ibotta/android/views/pwi/home/PwiAddMoneyView$PwiPurchaseAmountState;)V

    .line 627
    iget-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/PwiHomePresenterImpl;->mvpView:Lcom/ibotta/android/mvp/base/MvpView;

    check-cast p1, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/PwiHomeView;

    invoke-interface {p1}, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/PwiHomeView;->showTransactionsTab()V

    .line 628
    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/PwiHomePresenterImpl;->reload()V

    return-void
.end method

.method private onPayConfirmation()V
    .locals 2

    .line 884
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/PwiHomePresenterImpl;->postTxnJob:Lcom/ibotta/android/service/api/job/SingleApiJob;

    if-nez v0, :cond_0

    .line 886
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/PwiHomePresenterImpl;->pwiApiManager:Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/PwiApiManager;

    iget v1, p0, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/PwiHomePresenterImpl;->retailerId:I

    invoke-interface {v0, v1}, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/PwiApiManager;->clearWalletCaches(I)V

    .line 887
    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/PwiHomePresenterImpl;->submitTransactionPostJob()V

    goto :goto_0

    .line 889
    :cond_0
    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/PwiHomePresenterImpl;->submitPollingJob()V

    :goto_0
    return-void
.end method

.method private orderComplete(Lcom/ibotta/android/service/api/job/SingleApiJob;)V
    .locals 3

    .line 613
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/PwiHomePresenterImpl;->pwiUserState:Lcom/ibotta/android/state/pwi/PwiUserState;

    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/PwiHomePresenterImpl;->bgcTransaction:Lcom/ibotta/api/model/pwi/BgcTransaction;

    invoke-virtual {v1}, Lcom/ibotta/api/model/pwi/BgcTransaction;->getUuid()Ljava/lang/String;

    move-result-object v1

    iget v2, p0, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/PwiHomePresenterImpl;->retailerId:I

    invoke-interface {v0, v1, v2}, Lcom/ibotta/android/state/pwi/PwiUserState;->removePendingTransaction(Ljava/lang/String;I)V

    .line 614
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/PwiHomePresenterImpl;->pwiApiManager:Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/PwiApiManager;

    invoke-interface {v0, p1}, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/PwiApiManager;->isFailedTransaction(Lcom/ibotta/android/service/api/job/SingleApiJob;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 615
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/PwiHomePresenterImpl;->bgcTransaction:Lcom/ibotta/api/model/pwi/BgcTransaction;

    invoke-virtual {v0}, Lcom/ibotta/api/model/pwi/BgcTransaction;->getErrorMessage()Lcom/ibotta/api/model/pwi/PwiError;

    move-result-object v0

    invoke-virtual {p1}, Lcom/ibotta/android/service/api/job/SingleApiJob;->getApiResponse()Lcom/ibotta/api/ApiResponse;

    move-result-object p1

    invoke-virtual {p1}, Lcom/ibotta/api/ApiResponse;->getResponseCode()I

    move-result p1

    invoke-direct {p0, v0, p1}, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/PwiHomePresenterImpl;->handlePwiError(Lcom/ibotta/api/model/pwi/PwiError;I)V

    goto :goto_0

    .line 617
    :cond_0
    invoke-direct {p0, p1}, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/PwiHomePresenterImpl;->onOrderSuccess(Lcom/ibotta/android/service/api/job/SingleApiJob;)V

    :goto_0
    return-void
.end method

.method private purchaseFlowWithGooglePay()V
    .locals 4

    .line 896
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/PwiHomePresenterImpl;->pwiUserState:Lcom/ibotta/android/state/pwi/PwiUserState;

    const/4 v1, 0x1

    invoke-interface {v0, v1}, Lcom/ibotta/android/state/pwi/PwiUserState;->setGooglePayAsDefaultPayment(Z)V

    .line 897
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/PwiHomePresenterImpl;->mvpView:Lcom/ibotta/android/mvp/base/MvpView;

    check-cast v0, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/PwiHomeView;

    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/PwiHomePresenterImpl;->googlePayManager:Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/GooglePayManager;

    iget-wide v2, p0, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/PwiHomePresenterImpl;->purchaseAmount:D

    invoke-interface {v1, v2, v3}, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/GooglePayManager;->createPaymentDataRequest(D)Lcom/google/android/gms/tasks/Task;

    move-result-object v1

    invoke-interface {v0, v1}, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/PwiHomeView;->showGooglePayFlow(Lcom/google/android/gms/tasks/Task;)V

    return-void
.end method

.method private showOnboardingForNewUsers()V
    .locals 2

    .line 339
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/PwiHomePresenterImpl;->pwiUserState:Lcom/ibotta/android/state/pwi/PwiUserState;

    invoke-interface {v0}, Lcom/ibotta/android/state/pwi/PwiUserState;->hasCompletedOnboarding()Z

    move-result v0

    if-nez v0, :cond_0

    .line 341
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/PwiHomePresenterImpl;->mvpView:Lcom/ibotta/android/mvp/base/MvpView;

    check-cast v0, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/PwiHomeView;

    const/16 v1, 0x1c

    invoke-interface {v0, v1}, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/PwiHomeView;->showPwiOnboarding(I)V

    :cond_0
    return-void
.end method

.method private showPaymentConfirmation()V
    .locals 7

    .line 862
    new-instance v0, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/PwiHomePresenterImpl$3;

    invoke-direct {v0, p0}, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/PwiHomePresenterImpl$3;-><init>(Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/PwiHomePresenterImpl;)V

    .line 879
    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/PwiHomePresenterImpl;->mvpView:Lcom/ibotta/android/mvp/base/MvpView;

    check-cast v1, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/PwiHomeView;

    iget-object v2, p0, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/PwiHomePresenterImpl;->pwiHomeReducer:Lcom/ibotta/android/pwi/PwiHomeReducer;

    iget-object v3, p0, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/PwiHomePresenterImpl;->buyableGiftCardModel:Lcom/ibotta/api/model/BuyableGiftCardModel;

    iget-wide v4, p0, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/PwiHomePresenterImpl;->purchaseAmount:D

    iget-object v6, p0, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/PwiHomePresenterImpl;->defaultPaymentMethod:Lcom/ibotta/android/views/pwi/home/payments/PaymentOptionRowViewState;

    invoke-virtual {v2, v3, v4, v5, v6}, Lcom/ibotta/android/pwi/PwiHomeReducer;->createConfirmationDialogViewState(Lcom/ibotta/api/model/BuyableGiftCardModel;DLcom/ibotta/android/views/pwi/home/payments/PaymentOptionRowViewState;)Lcom/ibotta/android/views/messages/alert/SemiModalViewState;

    move-result-object v2

    invoke-interface {v1, v2, v0}, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/PwiHomeView;->showPayConfirmationDialog(Lcom/ibotta/android/views/messages/alert/SemiModalViewState;Lcom/ibotta/android/views/messages/alert/SemiModalViewEvents;)V

    return-void
.end method

.method private submitPollingJob()V
    .locals 2

    .line 567
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/PwiHomePresenterImpl;->pwiApiManager:Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/PwiApiManager;

    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/PwiHomePresenterImpl;->txnId:Ljava/lang/String;

    invoke-interface {v0, v1}, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/PwiApiManager;->buildTransactionPollingJob(Ljava/lang/String;)Lcom/ibotta/android/service/api/job/BgcTransactionByIdJob;

    move-result-object v0

    const/4 v1, 0x1

    invoke-virtual {p0, v0, v1}, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/PwiHomePresenterImpl;->submitApiJob(Lcom/ibotta/android/service/api/job/ApiJob;Z)V

    return-void
.end method

.method private submitTransactionPostJob()V
    .locals 9
    .annotation runtime Lcom/ibotta/android/aop/tracking/TrackingAfter;
        value = .enum Lcom/ibotta/android/aop/tracking/TrackingType;->PWI_SUBMIT_ORDER:Lcom/ibotta/android/aop/tracking/TrackingType;
    .end annotation

    sget-object v0, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/PwiHomePresenterImpl;->ajc$tjp_2:Lorg/aspectj/lang/JoinPoint$StaticPart;

    invoke-static {v0, p0, p0}, Lorg/aspectj/runtime/reflect/Factory;->makeJP(Lorg/aspectj/lang/JoinPoint$StaticPart;Ljava/lang/Object;Ljava/lang/Object;)Lorg/aspectj/lang/JoinPoint;

    move-result-object v0

    .line 540
    :try_start_0
    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/PwiHomePresenterImpl;->generateTxnId()V

    .line 541
    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/PwiHomePresenterImpl;->postTxnJob:Lcom/ibotta/android/service/api/job/SingleApiJob;
    :try_end_0
    .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_1

    if-nez v1, :cond_0

    .line 543
    :try_start_1
    sget-object v1, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/PwiHomePresenterImpl$4;->$SwitchMap$com$ibotta$android$views$pwi$home$payments$PaymentOptionRowViewState$Action:[I

    iget-object v2, p0, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/PwiHomePresenterImpl;->defaultPaymentMethod:Lcom/ibotta/android/views/pwi/home/payments/PaymentOptionRowViewState;

    invoke-virtual {v2}, Lcom/ibotta/android/views/pwi/home/payments/PaymentOptionRowViewState;->getAction()Lcom/ibotta/android/views/pwi/home/payments/PaymentOptionRowViewState$Action;

    move-result-object v2

    invoke-virtual {v2}, Lcom/ibotta/android/views/pwi/home/payments/PaymentOptionRowViewState$Action;->ordinal()I

    move-result v2

    aget v1, v1, v2

    packed-switch v1, :pswitch_data_0

    goto :goto_0

    .line 549
    :pswitch_0
    iget-object v2, p0, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/PwiHomePresenterImpl;->pwiApiManager:Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/PwiApiManager;

    iget-object v3, p0, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/PwiHomePresenterImpl;->buyableGiftCardModel:Lcom/ibotta/api/model/BuyableGiftCardModel;

    iget-wide v4, p0, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/PwiHomePresenterImpl;->purchaseAmount:D

    iget-object v6, p0, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/PwiHomePresenterImpl;->txnId:Ljava/lang/String;

    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/PwiHomePresenterImpl;->googlePayToken:Lcom/stripe/android/model/Token;

    .line 550
    invoke-virtual {v1}, Lcom/stripe/android/model/Token;->getId()Ljava/lang/String;

    move-result-object v7

    sget-object v8, Lcom/ibotta/api/call/pwi/BgcPostTransactionCall$CallParams$StripePaymentType;->GOOGLE_PAY_TOKEN:Lcom/ibotta/api/call/pwi/BgcPostTransactionCall$CallParams$StripePaymentType;

    .line 549
    invoke-interface/range {v2 .. v8}, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/PwiApiManager;->buildTransactionPostJob(Lcom/ibotta/api/model/BuyableGiftCardModel;DLjava/lang/String;Ljava/lang/String;Lcom/ibotta/api/call/pwi/BgcPostTransactionCall$CallParams$StripePaymentType;)Lcom/ibotta/android/service/api/job/SingleApiJob;

    move-result-object v1

    iput-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/PwiHomePresenterImpl;->postTxnJob:Lcom/ibotta/android/service/api/job/SingleApiJob;

    goto :goto_0

    .line 545
    :pswitch_1
    iget-object v2, p0, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/PwiHomePresenterImpl;->pwiApiManager:Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/PwiApiManager;

    iget-object v3, p0, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/PwiHomePresenterImpl;->buyableGiftCardModel:Lcom/ibotta/api/model/BuyableGiftCardModel;

    iget-wide v4, p0, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/PwiHomePresenterImpl;->purchaseAmount:D

    iget-object v6, p0, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/PwiHomePresenterImpl;->txnId:Ljava/lang/String;

    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/PwiHomePresenterImpl;->defaultPaymentMethod:Lcom/ibotta/android/views/pwi/home/payments/PaymentOptionRowViewState;

    .line 546
    invoke-virtual {v1}, Lcom/ibotta/android/views/pwi/home/payments/PaymentOptionRowViewState;->getSourceId()Ljava/lang/String;

    move-result-object v7

    sget-object v8, Lcom/ibotta/api/call/pwi/BgcPostTransactionCall$CallParams$StripePaymentType;->STRIPE_CARD_SOURCE:Lcom/ibotta/api/call/pwi/BgcPostTransactionCall$CallParams$StripePaymentType;

    .line 545
    invoke-interface/range {v2 .. v8}, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/PwiApiManager;->buildTransactionPostJob(Lcom/ibotta/api/model/BuyableGiftCardModel;DLjava/lang/String;Ljava/lang/String;Lcom/ibotta/api/call/pwi/BgcPostTransactionCall$CallParams$StripePaymentType;)Lcom/ibotta/android/service/api/job/SingleApiJob;

    move-result-object v1

    iput-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/PwiHomePresenterImpl;->postTxnJob:Lcom/ibotta/android/service/api/job/SingleApiJob;
    :try_end_1
    .catch Ljava/io/UnsupportedEncodingException; {:try_start_1 .. :try_end_1} :catch_0
    .catch Ljava/lang/Throwable; {:try_start_1 .. :try_end_1} :catch_1

    goto :goto_0

    :catch_0
    move-exception v1

    .line 554
    :try_start_2
    sget-object v2, Lcom/ibotta/android/crash/IbottaCrashProxy;->IbottaCrashManager:Lcom/ibotta/android/crash/CrashManager;

    invoke-virtual {v2, v1}, Lcom/ibotta/android/crash/CrashManager;->trackException(Ljava/lang/Throwable;)V

    .line 555
    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/PwiHomePresenterImpl;->mvpView:Lcom/ibotta/android/mvp/base/MvpView;

    check-cast v1, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/PwiHomeView;

    invoke-interface {v1}, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/PwiHomeView;->finish()V

    goto :goto_1

    .line 560
    :cond_0
    :goto_0
    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/PwiHomePresenterImpl;->appHelper:Lcom/ibotta/android/util/AppHelper;

    invoke-interface {v1}, Lcom/ibotta/android/util/AppHelper;->getCurrentTime()J

    move-result-wide v1

    iput-wide v1, p0, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/PwiHomePresenterImpl;->orderStartTime:J

    .line 561
    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/PwiHomePresenterImpl;->pwiUserState:Lcom/ibotta/android/state/pwi/PwiUserState;

    iget-object v2, p0, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/PwiHomePresenterImpl;->txnId:Ljava/lang/String;

    iget v3, p0, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/PwiHomePresenterImpl;->retailerId:I

    invoke-interface {v1, v2, v3}, Lcom/ibotta/android/state/pwi/PwiUserState;->addPendingTransaction(Ljava/lang/String;I)V

    .line 562
    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/PwiHomePresenterImpl;->mvpView:Lcom/ibotta/android/mvp/base/MvpView;

    check-cast v1, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/PwiHomeView;

    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/PwiHomePresenterImpl;->getCardType()Ljava/lang/String;

    move-result-object v2

    invoke-interface {v1, v2}, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/PwiHomeView;->updateChargingCardText(Ljava/lang/String;)V

    .line 563
    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/PwiHomePresenterImpl;->postTxnJob:Lcom/ibotta/android/service/api/job/SingleApiJob;

    const/4 v2, 0x1

    invoke-virtual {p0, v1, v2}, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/PwiHomePresenterImpl;->submitApiJob(Lcom/ibotta/android/service/api/job/ApiJob;Z)V
    :try_end_2
    .catch Ljava/lang/Throwable; {:try_start_2 .. :try_end_2} :catch_1

    .line 564
    :goto_1
    invoke-static {}, Lcom/ibotta/android/aop/tracking/TrackingAspect;->aspectOf()Lcom/ibotta/android/aop/tracking/TrackingAspect;

    move-result-object v1

    invoke-virtual {v1, v0}, Lcom/ibotta/android/aop/tracking/TrackingAspect;->after(Lorg/aspectj/lang/JoinPoint;)V

    return-void

    :catch_1
    move-exception v1

    invoke-static {}, Lcom/ibotta/android/aop/tracking/TrackingAspect;->aspectOf()Lcom/ibotta/android/aop/tracking/TrackingAspect;

    move-result-object v2

    invoke-virtual {v2, v0}, Lcom/ibotta/android/aop/tracking/TrackingAspect;->after(Lorg/aspectj/lang/JoinPoint;)V

    throw v1

    :pswitch_data_0
    .packed-switch 0x2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method private trackOnTransactionsTabViewed()V
    .locals 2
    .annotation runtime Lcom/ibotta/android/aop/tracking/TrackingBefore;
        value = .enum Lcom/ibotta/android/aop/tracking/TrackingType;->PWI_RETAILER_TRANSACTIONS:Lcom/ibotta/android/aop/tracking/TrackingType;
    .end annotation

    sget-object v0, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/PwiHomePresenterImpl;->ajc$tjp_5:Lorg/aspectj/lang/JoinPoint$StaticPart;

    invoke-static {v0, p0, p0}, Lorg/aspectj/runtime/reflect/Factory;->makeJP(Lorg/aspectj/lang/JoinPoint$StaticPart;Ljava/lang/Object;Ljava/lang/Object;)Lorg/aspectj/lang/JoinPoint;

    move-result-object v0

    .line 793
    invoke-static {}, Lcom/ibotta/android/aop/tracking/TrackingAspect;->aspectOf()Lcom/ibotta/android/aop/tracking/TrackingAspect;

    move-result-object v1

    invoke-virtual {v1, v0}, Lcom/ibotta/android/aop/tracking/TrackingAspect;->before(Lorg/aspectj/lang/JoinPoint;)V

    const-string v0, "Tracking transactions tab view impression"

    const/4 v1, 0x0

    new-array v1, v1, [Ljava/lang/Object;

    invoke-static {v0, v1}, Ltimber/log/Timber;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    return-void
.end method


# virtual methods
.method public addNewCard()V
    .locals 1

    .line 424
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/PwiHomePresenterImpl;->mvpView:Lcom/ibotta/android/mvp/base/MvpView;

    check-cast v0, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/PwiHomeView;

    invoke-interface {v0}, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/PwiHomeView;->showAddNewCardActivity()V

    return-void
.end method

.method public getActivityClass()Ljava/lang/Class;
    .locals 1

    .line 781
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/PwiHomePresenterImpl;->mvpView:Lcom/ibotta/android/mvp/base/MvpView;

    check-cast v0, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/PwiHomeView;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    return-object v0
.end method

.method public getBuyableGiftCardModel()Lcom/ibotta/api/model/BuyableGiftCardModel;
    .locals 1

    .line 749
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/PwiHomePresenterImpl;->buyableGiftCardModel:Lcom/ibotta/api/model/BuyableGiftCardModel;

    return-object v0
.end method

.method public getCardType()Ljava/lang/String;
    .locals 2

    .line 764
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/PwiHomePresenterImpl;->defaultPaymentMethod:Lcom/ibotta/android/views/pwi/home/payments/PaymentOptionRowViewState;

    invoke-virtual {v0}, Lcom/ibotta/android/views/pwi/home/payments/PaymentOptionRowViewState;->getAction()Lcom/ibotta/android/views/pwi/home/payments/PaymentOptionRowViewState$Action;

    move-result-object v0

    sget-object v1, Lcom/ibotta/android/views/pwi/home/payments/PaymentOptionRowViewState$Action;->GOOGLE_PAY:Lcom/ibotta/android/views/pwi/home/payments/PaymentOptionRowViewState$Action;

    invoke-virtual {v0, v1}, Lcom/ibotta/android/views/pwi/home/payments/PaymentOptionRowViewState$Action;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 765
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/PwiHomePresenterImpl;->googlePayToken:Lcom/stripe/android/model/Token;

    invoke-virtual {v0}, Lcom/stripe/android/model/Token;->getType()Ljava/lang/String;

    move-result-object v0

    const-string v1, "card"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 766
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/PwiHomePresenterImpl;->googlePayToken:Lcom/stripe/android/model/Token;

    invoke-virtual {v0}, Lcom/stripe/android/model/Token;->getCard()Lcom/stripe/android/model/Card;

    move-result-object v0

    invoke-virtual {v0}, Lcom/stripe/android/model/Card;->getFunding()Ljava/lang/String;

    move-result-object v0

    return-object v0

    .line 768
    :cond_0
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/PwiHomePresenterImpl;->googlePayToken:Lcom/stripe/android/model/Token;

    invoke-virtual {v0}, Lcom/stripe/android/model/Token;->getType()Ljava/lang/String;

    move-result-object v0

    return-object v0

    .line 771
    :cond_1
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/PwiHomePresenterImpl;->defaultPaymentMethod:Lcom/ibotta/android/views/pwi/home/payments/PaymentOptionRowViewState;

    invoke-virtual {v0}, Lcom/ibotta/android/views/pwi/home/payments/PaymentOptionRowViewState;->getCardType()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public getContentId()Lcom/ibotta/android/apiandroid/content/ContentId;
    .locals 1
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation

    .line 372
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/PwiHomePresenterImpl;->contentId:Lcom/ibotta/android/apiandroid/content/ContentId;

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

    .line 186
    new-instance v0, Ljava/util/HashSet;

    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    .line 188
    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/PwiHomePresenterImpl;->giftCardJob:Lcom/ibotta/android/service/api/job/SingleApiJob;

    if-nez v1, :cond_1

    .line 189
    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/PwiHomePresenterImpl;->contentId:Lcom/ibotta/android/apiandroid/content/ContentId;

    if-eqz v1, :cond_0

    .line 191
    new-instance v2, Lcom/ibotta/android/service/api/job/SingleApiJob;

    iget-object v3, p0, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/PwiHomePresenterImpl;->graphQLCallFactory:Lcom/ibotta/android/graphql/GraphQLCallFactory;

    invoke-interface {v3, v1}, Lcom/ibotta/android/graphql/GraphQLCallFactory;->createContentByIdCall(Lcom/ibotta/android/apiandroid/content/ContentId;)Lcom/ibotta/android/graphql/BaseGraphQLApiCall;

    move-result-object v1

    invoke-direct {v2, v1}, Lcom/ibotta/android/service/api/job/SingleApiJob;-><init>(Lcom/ibotta/api/ApiCall;)V

    iput-object v2, p0, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/PwiHomePresenterImpl;->giftCardJob:Lcom/ibotta/android/service/api/job/SingleApiJob;

    goto :goto_0

    .line 192
    :cond_0
    iget v1, p0, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/PwiHomePresenterImpl;->retailerId:I

    if-eqz v1, :cond_1

    .line 195
    new-instance v2, Lcom/ibotta/android/service/api/job/SingleApiJob;

    iget-object v3, p0, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/PwiHomePresenterImpl;->graphQLCallFactory:Lcom/ibotta/android/graphql/GraphQLCallFactory;

    .line 196
    invoke-interface {v3, v1}, Lcom/ibotta/android/graphql/GraphQLCallFactory;->createBuyableGiftCardByRetailerIdGraphQLCall(I)Lcom/ibotta/android/graphql/buyablegiftcard/BuyableGiftCardByRetailerIdGraphQlCall;

    move-result-object v1

    invoke-direct {v2, v1}, Lcom/ibotta/android/service/api/job/SingleApiJob;-><init>(Lcom/ibotta/api/ApiCall;)V

    iput-object v2, p0, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/PwiHomePresenterImpl;->giftCardJob:Lcom/ibotta/android/service/api/job/SingleApiJob;

    .line 200
    :cond_1
    :goto_0
    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/PwiHomePresenterImpl;->paymentAccountsJob:Lcom/ibotta/android/service/api/job/SingleApiJob;

    if-nez v1, :cond_2

    .line 201
    new-instance v1, Lcom/ibotta/android/service/api/job/SingleApiJob;

    new-instance v2, Lcom/ibotta/api/call/pwi/BgcPaymentAccountsCall;

    iget-object v3, p0, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/PwiHomePresenterImpl;->userState:Lcom/ibotta/android/state/user/UserState;

    .line 202
    invoke-interface {v3}, Lcom/ibotta/android/state/user/UserState;->getCustomerId()I

    move-result v3

    iget-object v4, p0, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/PwiHomePresenterImpl;->pwiVariant:Lcom/ibotta/android/features/variant/pwi/PwiVariant;

    invoke-interface {v4}, Lcom/ibotta/android/features/variant/pwi/PwiVariant;->isProduction()Z

    move-result v4

    invoke-direct {v2, v3, v4}, Lcom/ibotta/api/call/pwi/BgcPaymentAccountsCall;-><init>(IZ)V

    invoke-direct {v1, v2}, Lcom/ibotta/android/service/api/job/SingleApiJob;-><init>(Lcom/ibotta/api/ApiCall;)V

    iput-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/PwiHomePresenterImpl;->paymentAccountsJob:Lcom/ibotta/android/service/api/job/SingleApiJob;

    .line 205
    :cond_2
    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/PwiHomePresenterImpl;->transactionsJob:Lcom/ibotta/android/service/api/job/SingleApiJob;

    if-nez v1, :cond_3

    .line 206
    new-instance v1, Lcom/ibotta/api/call/pwi/BuyableGiftCardsCall;

    iget-object v2, p0, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/PwiHomePresenterImpl;->userState:Lcom/ibotta/android/state/user/UserState;

    .line 207
    invoke-interface {v2}, Lcom/ibotta/android/state/user/UserState;->getCustomerId()I

    move-result v2

    iget-object v3, p0, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/PwiHomePresenterImpl;->pwiVariant:Lcom/ibotta/android/features/variant/pwi/PwiVariant;

    invoke-interface {v3}, Lcom/ibotta/android/features/variant/pwi/PwiVariant;->isProduction()Z

    move-result v3

    sget-object v4, Lcom/ibotta/api/call/pwi/BuyableGiftCardsCall;->COMPLETED_STATUS:Ljava/util/Set;

    invoke-direct {v1, v2, v3, v4}, Lcom/ibotta/api/call/pwi/BuyableGiftCardsCall;-><init>(IZLjava/util/Set;)V

    .line 208
    iget v2, p0, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/PwiHomePresenterImpl;->retailerId:I

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {v1, v2}, Lcom/ibotta/api/call/pwi/BuyableGiftCardsCall;->setRetailerId(Ljava/lang/Integer;)V

    const/16 v2, 0xa

    .line 209
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {v1, v2}, Lcom/ibotta/api/call/pwi/BuyableGiftCardsCall;->setLimit(Ljava/lang/Integer;)V

    .line 210
    new-instance v2, Lcom/ibotta/android/service/api/job/SingleApiJob;

    invoke-direct {v2, v1}, Lcom/ibotta/android/service/api/job/SingleApiJob;-><init>(Lcom/ibotta/api/ApiCall;)V

    iput-object v2, p0, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/PwiHomePresenterImpl;->transactionsJob:Lcom/ibotta/android/service/api/job/SingleApiJob;

    .line 213
    :cond_3
    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/PwiHomePresenterImpl;->pwiUserState:Lcom/ibotta/android/state/pwi/PwiUserState;

    iget v2, p0, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/PwiHomePresenterImpl;->retailerId:I

    invoke-interface {v1, v2}, Lcom/ibotta/android/state/pwi/PwiUserState;->hasPendingTransaction(I)Ljava/lang/Boolean;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v1

    if-eqz v1, :cond_4

    .line 215
    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/PwiHomePresenterImpl;->pwiApiManager:Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/PwiApiManager;

    iget-object v2, p0, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/PwiHomePresenterImpl;->pwiUserState:Lcom/ibotta/android/state/pwi/PwiUserState;

    iget v3, p0, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/PwiHomePresenterImpl;->retailerId:I

    invoke-interface {v2, v3}, Lcom/ibotta/android/state/pwi/PwiUserState;->getEarliestPendingTransactionId(I)Ljava/lang/String;

    move-result-object v2

    invoke-interface {v1, v2}, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/PwiApiManager;->buildTransactionByIdJob(Ljava/lang/String;)Lcom/ibotta/android/service/api/job/BgcTransactionByIdJob;

    move-result-object v1

    iput-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/PwiHomePresenterImpl;->pendingTxnJob:Lcom/ibotta/android/service/api/job/SingleApiJob;

    goto :goto_1

    :cond_4
    const/4 v1, 0x0

    .line 217
    iput-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/PwiHomePresenterImpl;->pendingTxnJob:Lcom/ibotta/android/service/api/job/SingleApiJob;

    .line 220
    :goto_1
    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/PwiHomePresenterImpl;->giftCardJob:Lcom/ibotta/android/service/api/job/SingleApiJob;

    if-eqz v1, :cond_5

    .line 221
    invoke-interface {v0, v1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 224
    :cond_5
    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/PwiHomePresenterImpl;->paymentAccountsJob:Lcom/ibotta/android/service/api/job/SingleApiJob;

    if-eqz v1, :cond_6

    .line 225
    invoke-interface {v0, v1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 228
    :cond_6
    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/PwiHomePresenterImpl;->transactionsJob:Lcom/ibotta/android/service/api/job/SingleApiJob;

    if-eqz v1, :cond_7

    .line 229
    invoke-interface {v0, v1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 232
    :cond_7
    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/PwiHomePresenterImpl;->pendingTxnJob:Lcom/ibotta/android/service/api/job/SingleApiJob;

    if-eqz v1, :cond_8

    .line 233
    invoke-interface {v0, v1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    :cond_8
    return-object v0
.end method

.method public getOrderStartTime()J
    .locals 2

    .line 759
    iget-wide v0, p0, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/PwiHomePresenterImpl;->orderStartTime:J

    return-wide v0
.end method

.method public getPaymentAmount()F
    .locals 2

    .line 754
    iget-wide v0, p0, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/PwiHomePresenterImpl;->purchaseAmount:D

    double-to-float v0, v0

    return v0
.end method

.method public getRetailerId()I
    .locals 1

    .line 362
    iget v0, p0, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/PwiHomePresenterImpl;->retailerId:I

    return v0
.end method

.method public getTxnId()Ljava/lang/String;
    .locals 1

    .line 352
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/PwiHomePresenterImpl;->txnId:Ljava/lang/String;

    return-object v0
.end method

.method public getWalletType()Ljava/lang/String;
    .locals 1

    .line 776
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/PwiHomePresenterImpl;->defaultPaymentMethod:Lcom/ibotta/android/views/pwi/home/payments/PaymentOptionRowViewState;

    invoke-virtual {v0}, Lcom/ibotta/android/views/pwi/home/payments/PaymentOptionRowViewState;->getAction()Lcom/ibotta/android/views/pwi/home/payments/PaymentOptionRowViewState$Action;

    move-result-object v0

    invoke-virtual {v0}, Lcom/ibotta/android/views/pwi/home/payments/PaymentOptionRowViewState$Action;->getTrackingName()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public isFirstTimeCard()Z
    .locals 1

    .line 377
    iget-boolean v0, p0, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/PwiHomePresenterImpl;->isFirstTimeCard:Z

    return v0
.end method

.method protected onAbandonFetchJobs()V
    .locals 1

    const/4 v0, 0x0

    .line 241
    iput-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/PwiHomePresenterImpl;->giftCardJob:Lcom/ibotta/android/service/api/job/SingleApiJob;

    .line 242
    iput-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/PwiHomePresenterImpl;->paymentAccountsJob:Lcom/ibotta/android/service/api/job/SingleApiJob;

    .line 243
    iput-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/PwiHomePresenterImpl;->transactionsJob:Lcom/ibotta/android/service/api/job/SingleApiJob;

    return-void
.end method

.method public onBack()V
    .locals 2

    .line 831
    iget v0, p0, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/PwiHomePresenterImpl;->purchaseAmountCents:I

    if-nez v0, :cond_0

    return-void

    .line 836
    :cond_0
    div-int/lit8 v0, v0, 0xa

    iput v0, p0, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/PwiHomePresenterImpl;->purchaseAmountCents:I

    .line 837
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/PwiHomePresenterImpl;->formatting:Lcom/ibotta/android/util/Formatting;

    iget v1, p0, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/PwiHomePresenterImpl;->purchaseAmountCents:I

    invoke-interface {v0, v1}, Lcom/ibotta/android/util/Formatting;->centsToDollars(I)D

    move-result-wide v0

    iput-wide v0, p0, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/PwiHomePresenterImpl;->purchaseAmount:D

    .line 838
    iget-wide v0, p0, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/PwiHomePresenterImpl;->purchaseAmount:D

    invoke-direct {p0, v0, v1}, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/PwiHomePresenterImpl;->getInputStateForAmount(D)Lcom/ibotta/android/views/pwi/home/PwiAddMoneyView$PwiPurchaseAmountState;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/PwiHomePresenterImpl;->initViewStates(Lcom/ibotta/android/views/pwi/home/PwiAddMoneyView$PwiPurchaseAmountState;)V

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

.method public onDetach()V
    .locals 1

    .line 180
    invoke-super {p0}, Lcom/ibotta/android/mvp/base/loading/AbstractLoadingMvpPresenter;->onDetach()V

    .line 181
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/PwiHomePresenterImpl;->recentlyViewedRetailersService:Lcom/ibotta/android/search/recentlyviewed/RecentlyViewedRetailersService;

    invoke-interface {v0}, Lcom/ibotta/android/search/recentlyviewed/RecentlyViewedRetailersService;->cancel()V

    return-void
.end method

.method public onError(ILjava/lang/String;)V
    .locals 4
    .param p2    # Ljava/lang/String;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param

    .line 490
    sget-object v0, Ljava/util/Locale;->US:Ljava/util/Locale;

    const-string v1, "Error retrieving customer from ephemeral key, errorcode = %d, message = %s"

    const/4 v2, 0x2

    new-array v2, v2, [Ljava/lang/Object;

    .line 491
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    const/4 v3, 0x0

    aput-object p1, v2, v3

    const/4 p1, 0x1

    aput-object p2, v2, p1

    .line 490
    invoke-static {v0, v1, v2}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    .line 492
    new-array p2, v3, [Ljava/lang/Object;

    invoke-static {p1, p2}, Ltimber/log/Timber;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 493
    sget-object p2, Lcom/ibotta/android/crash/IbottaCrashProxy;->IbottaCrashManager:Lcom/ibotta/android/crash/CrashManager;

    new-instance v0, Lcom/ibotta/android/mvp/ui/activity/pwi/IbottaStripeException;

    invoke-direct {v0, p1}, Lcom/ibotta/android/mvp/ui/activity/pwi/IbottaStripeException;-><init>(Ljava/lang/String;)V

    invoke-virtual {p2, v0}, Lcom/ibotta/android/crash/CrashManager;->trackException(Ljava/lang/Throwable;)V

    .line 494
    iget-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/PwiHomePresenterImpl;->mvpView:Lcom/ibotta/android/mvp/base/MvpView;

    check-cast p1, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/PwiHomeView;

    invoke-interface {p1}, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/PwiHomeView;->finish()V

    return-void
.end method

.method protected onFetchFinishedSuccessfully()V
    .locals 3

    .line 250
    :try_start_0
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/PwiHomePresenterImpl;->pwiApiManager:Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/PwiApiManager;

    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/PwiHomePresenterImpl;->giftCardJob:Lcom/ibotta/android/service/api/job/SingleApiJob;

    invoke-interface {v0, v1}, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/PwiApiManager;->getBuyableGiftCardModelFromJob(Lcom/ibotta/android/service/api/job/SingleApiJob;)Lcom/ibotta/api/model/BuyableGiftCardModel;

    move-result-object v0

    iput-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/PwiHomePresenterImpl;->buyableGiftCardModel:Lcom/ibotta/api/model/BuyableGiftCardModel;
    :try_end_0
    .catch Lcom/ibotta/android/mvp/ui/activity/find/IllegalApiJobStateException; {:try_start_0 .. :try_end_0} :catch_7
    .catch Ljava/lang/IllegalStateException; {:try_start_0 .. :try_end_0} :catch_6

    .line 258
    iget v0, p0, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/PwiHomePresenterImpl;->retailerId:I

    if-nez v0, :cond_0

    .line 259
    sget-object v0, Lcom/ibotta/android/crash/IbottaCrashProxy;->IbottaCrashManager:Lcom/ibotta/android/crash/CrashManager;

    new-instance v1, Ljava/lang/IllegalStateException;

    const-string v2, "retailerId is 0!"

    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, v1}, Lcom/ibotta/android/crash/CrashManager;->trackException(Ljava/lang/Throwable;)V

    .line 260
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/PwiHomePresenterImpl;->buyableGiftCardModel:Lcom/ibotta/api/model/BuyableGiftCardModel;

    invoke-interface {v0}, Lcom/ibotta/api/model/BuyableGiftCardModel;->getRetailerId()I

    move-result v0

    iput v0, p0, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/PwiHomePresenterImpl;->retailerId:I

    .line 265
    :cond_0
    :try_start_1
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/PwiHomePresenterImpl;->pwiApiManager:Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/PwiApiManager;

    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/PwiHomePresenterImpl;->transactionsJob:Lcom/ibotta/android/service/api/job/SingleApiJob;

    iget-object v2, p0, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/PwiHomePresenterImpl;->giftCardJob:Lcom/ibotta/android/service/api/job/SingleApiJob;

    invoke-interface {v0, v1, v2}, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/PwiApiManager;->getTransactionsFromJob(Lcom/ibotta/android/service/api/job/SingleApiJob;Lcom/ibotta/android/service/api/job/SingleApiJob;)Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/PwiHomePresenterImpl;->transactions:Ljava/util/List;
    :try_end_1
    .catch Lcom/ibotta/android/mvp/ui/activity/find/IllegalApiJobStateException; {:try_start_1 .. :try_end_1} :catch_5
    .catch Ljava/lang/IllegalStateException; {:try_start_1 .. :try_end_1} :catch_4

    const/4 v0, 0x1

    .line 274
    :try_start_2
    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/PwiHomePresenterImpl;->pwiApiManager:Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/PwiApiManager;

    iget-object v2, p0, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/PwiHomePresenterImpl;->paymentAccountsJob:Lcom/ibotta/android/service/api/job/SingleApiJob;

    invoke-interface {v1, v2}, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/PwiApiManager;->getPaymentAccountFromJob(Lcom/ibotta/android/service/api/job/SingleApiJob;)Lcom/ibotta/api/model/pwi/BgcPaymentAccount;

    move-result-object v1

    iput-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/PwiHomePresenterImpl;->paymentAccount:Lcom/ibotta/api/model/pwi/BgcPaymentAccount;
    :try_end_2
    .catch Lcom/ibotta/android/mvp/ui/activity/find/IllegalApiJobStateException; {:try_start_2 .. :try_end_2} :catch_3
    .catch Ljava/lang/IllegalStateException; {:try_start_2 .. :try_end_2} :catch_2
    .catch Lcom/ibotta/android/mvp/ui/activity/pwi/PwiErrorException; {:try_start_2 .. :try_end_2} :catch_1
    .catch Lcom/ibotta/android/mvp/ui/activity/pwi/NoPaymentAccountException; {:try_start_2 .. :try_end_2} :catch_0

    goto :goto_0

    .line 286
    :catch_0
    iput-boolean v0, p0, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/PwiHomePresenterImpl;->isFirstTimeCard:Z

    .line 287
    sget-object v1, Lcom/ibotta/android/views/pwi/home/PwiAddMoneyView$PwiPurchaseAmountState;->NO_CARD:Lcom/ibotta/android/views/pwi/home/PwiAddMoneyView$PwiPurchaseAmountState;

    invoke-direct {p0, v1}, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/PwiHomePresenterImpl;->initViewStates(Lcom/ibotta/android/views/pwi/home/PwiAddMoneyView$PwiPurchaseAmountState;)V

    .line 290
    :goto_0
    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/PwiHomePresenterImpl;->paymentAccount:Lcom/ibotta/api/model/pwi/BgcPaymentAccount;

    if-eqz v1, :cond_1

    .line 291
    iget-object v2, p0, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/PwiHomePresenterImpl;->pwiApiManager:Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/PwiApiManager;

    invoke-interface {v2, v1}, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/PwiApiManager;->initStripeCustomerSession(Lcom/ibotta/api/model/pwi/BgcPaymentAccount;)V

    .line 292
    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/PwiHomePresenterImpl;->pwiApiManager:Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/PwiApiManager;

    invoke-interface {v1}, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/PwiApiManager;->retrieveStripeCurrentCustomer()V

    .line 297
    :cond_1
    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/PwiHomePresenterImpl;->pendingTxnJob:Lcom/ibotta/android/service/api/job/SingleApiJob;

    if-eqz v1, :cond_4

    .line 298
    iget-object v2, p0, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/PwiHomePresenterImpl;->pwiApiManager:Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/PwiApiManager;

    invoke-interface {v2, v1}, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/PwiApiManager;->getTransactionFromJob(Lcom/ibotta/android/service/api/job/SingleApiJob;)Lcom/ibotta/api/model/pwi/BgcTransaction;

    move-result-object v1

    .line 299
    invoke-virtual {v1}, Lcom/ibotta/api/model/pwi/BgcTransaction;->getStatus()Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Lcom/ibotta/android/service/api/job/BgcTransactionByIdJob;->isTransactionComplete(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_2

    .line 300
    iput-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/PwiHomePresenterImpl;->bgcTransaction:Lcom/ibotta/api/model/pwi/BgcTransaction;

    .line 301
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/PwiHomePresenterImpl;->pendingTxnJob:Lcom/ibotta/android/service/api/job/SingleApiJob;

    invoke-direct {p0, v0}, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/PwiHomePresenterImpl;->orderComplete(Lcom/ibotta/android/service/api/job/SingleApiJob;)V

    const/4 v0, 0x0

    .line 302
    iput-boolean v0, p0, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/PwiHomePresenterImpl;->hasPendingTxn:Z

    goto :goto_1

    .line 303
    :cond_2
    iget-boolean v1, p0, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/PwiHomePresenterImpl;->hasPendingTxn:Z

    if-eqz v1, :cond_3

    .line 304
    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/PwiHomePresenterImpl;->onAfterPendingTransactionCheck()V

    .line 305
    sget-object v0, Lcom/ibotta/android/views/pwi/home/PwiAddMoneyView$PwiPurchaseAmountState;->PENDING:Lcom/ibotta/android/views/pwi/home/PwiAddMoneyView$PwiPurchaseAmountState;

    invoke-direct {p0, v0}, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/PwiHomePresenterImpl;->initViewStates(Lcom/ibotta/android/views/pwi/home/PwiAddMoneyView$PwiPurchaseAmountState;)V

    goto :goto_1

    .line 307
    :cond_3
    sget-object v1, Lcom/ibotta/android/views/pwi/home/PwiAddMoneyView$PwiPurchaseAmountState;->PENDING:Lcom/ibotta/android/views/pwi/home/PwiAddMoneyView$PwiPurchaseAmountState;

    invoke-direct {p0, v1}, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/PwiHomePresenterImpl;->initViewStates(Lcom/ibotta/android/views/pwi/home/PwiAddMoneyView$PwiPurchaseAmountState;)V

    .line 308
    iput-boolean v0, p0, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/PwiHomePresenterImpl;->hasPendingTxn:Z

    .line 313
    :cond_4
    :goto_1
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/PwiHomePresenterImpl;->recentlyViewedRetailersService:Lcom/ibotta/android/search/recentlyviewed/RecentlyViewedRetailersService;

    iget v1, p0, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/PwiHomePresenterImpl;->retailerId:I

    invoke-interface {v0, v1}, Lcom/ibotta/android/search/recentlyviewed/RecentlyViewedRetailersService;->markRetailerAsViewed(I)V

    return-void

    :catch_1
    move-exception v0

    .line 280
    sget-object v1, Lcom/ibotta/android/crash/IbottaCrashProxy;->IbottaCrashManager:Lcom/ibotta/android/crash/CrashManager;

    invoke-virtual {v1, v0}, Lcom/ibotta/android/crash/CrashManager;->trackException(Ljava/lang/Throwable;)V

    return-void

    :catch_2
    move-exception v0

    goto :goto_2

    :catch_3
    move-exception v0

    .line 276
    :goto_2
    sget-object v1, Lcom/ibotta/android/crash/IbottaCrashProxy;->IbottaCrashManager:Lcom/ibotta/android/crash/CrashManager;

    invoke-virtual {v1, v0}, Lcom/ibotta/android/crash/CrashManager;->trackException(Ljava/lang/Throwable;)V

    .line 277
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/PwiHomePresenterImpl;->mvpView:Lcom/ibotta/android/mvp/base/MvpView;

    check-cast v0, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/PwiHomeView;

    invoke-interface {v0}, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/PwiHomeView;->finish()V

    return-void

    :catch_4
    move-exception v0

    goto :goto_3

    :catch_5
    move-exception v0

    .line 267
    :goto_3
    sget-object v1, Lcom/ibotta/android/crash/IbottaCrashProxy;->IbottaCrashManager:Lcom/ibotta/android/crash/CrashManager;

    invoke-virtual {v1, v0}, Lcom/ibotta/android/crash/CrashManager;->trackException(Ljava/lang/Throwable;)V

    .line 268
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/PwiHomePresenterImpl;->mvpView:Lcom/ibotta/android/mvp/base/MvpView;

    check-cast v0, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/PwiHomeView;

    invoke-interface {v0}, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/PwiHomeView;->finish()V

    return-void

    :catch_6
    move-exception v0

    goto :goto_4

    :catch_7
    move-exception v0

    .line 252
    :goto_4
    sget-object v1, Lcom/ibotta/android/crash/IbottaCrashProxy;->IbottaCrashManager:Lcom/ibotta/android/crash/CrashManager;

    invoke-virtual {v1, v0}, Lcom/ibotta/android/crash/CrashManager;->trackException(Ljava/lang/Throwable;)V

    .line 253
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/PwiHomePresenterImpl;->mvpView:Lcom/ibotta/android/mvp/base/MvpView;

    check-cast v0, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/PwiHomeView;

    invoke-interface {v0}, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/PwiHomeView;->finish()V

    return-void
.end method

.method public onGooglePayActivityResult(Lcom/google/android/gms/wallet/PaymentData;)V
    .locals 2

    .line 902
    invoke-virtual {p1}, Lcom/google/android/gms/wallet/PaymentData;->getPaymentMethodToken()Lcom/google/android/gms/wallet/PaymentMethodToken;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/wallet/PaymentMethodToken;->getToken()Ljava/lang/String;

    move-result-object v0

    if-nez v0, :cond_0

    .line 904
    iget-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/PwiHomePresenterImpl;->mvpView:Lcom/ibotta/android/mvp/base/MvpView;

    check-cast p1, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/PwiHomeView;

    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/PwiHomePresenterImpl;->pwiErrorDialogFactory:Lcom/ibotta/android/mvp/ui/activity/pwi/PwiErrorDialogFactory;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/ibotta/android/mvp/ui/activity/pwi/PwiErrorDialogFactory;->generateDialogViewStateFromError(Lcom/ibotta/api/model/pwi/PwiError;)Lcom/ibotta/android/views/messages/alert/SemiModalViewState;

    move-result-object v0

    sget-object v1, Lcom/ibotta/android/views/messages/alert/SemiModalViewEvents;->Companion:Lcom/ibotta/android/views/messages/alert/SemiModalViewEvents$Companion;

    invoke-virtual {v1}, Lcom/ibotta/android/views/messages/alert/SemiModalViewEvents$Companion;->getNO_OP()Lcom/ibotta/android/views/messages/alert/SemiModalViewEvents;

    move-result-object v1

    invoke-interface {p1, v0, v1}, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/PwiHomeView;->showErrorDialog(Lcom/ibotta/android/views/messages/alert/SemiModalViewState;Lcom/ibotta/android/views/messages/alert/SemiModalViewEvents;)V

    return-void

    .line 908
    :cond_0
    invoke-virtual {p1}, Lcom/google/android/gms/wallet/PaymentData;->getPaymentMethodToken()Lcom/google/android/gms/wallet/PaymentMethodToken;

    move-result-object p1

    invoke-virtual {p1}, Lcom/google/android/gms/wallet/PaymentMethodToken;->getToken()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Lcom/stripe/android/model/Token;->fromString(Ljava/lang/String;)Lcom/stripe/android/model/Token;

    move-result-object p1

    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/PwiHomePresenterImpl;->googlePayToken:Lcom/stripe/android/model/Token;

    .line 909
    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/PwiHomePresenterImpl;->submitTransactionPostJob()V

    return-void
.end method

.method public onHelpIconClicked()V
    .locals 2
    .annotation runtime Lcom/ibotta/android/aop/tracking/TrackingBefore;
        value = .enum Lcom/ibotta/android/aop/tracking/TrackingType;->PWI_HELP:Lcom/ibotta/android/aop/tracking/TrackingType;
    .end annotation

    sget-object v0, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/PwiHomePresenterImpl;->ajc$tjp_0:Lorg/aspectj/lang/JoinPoint$StaticPart;

    invoke-static {v0, p0, p0}, Lorg/aspectj/runtime/reflect/Factory;->makeJP(Lorg/aspectj/lang/JoinPoint$StaticPart;Ljava/lang/Object;Ljava/lang/Object;)Lorg/aspectj/lang/JoinPoint;

    move-result-object v0

    .line 419
    invoke-static {}, Lcom/ibotta/android/aop/tracking/TrackingAspect;->aspectOf()Lcom/ibotta/android/aop/tracking/TrackingAspect;

    move-result-object v1

    invoke-virtual {v1, v0}, Lcom/ibotta/android/aop/tracking/TrackingAspect;->before(Lorg/aspectj/lang/JoinPoint;)V

    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/PwiHomePresenterImpl;->mvpView:Lcom/ibotta/android/mvp/base/MvpView;

    check-cast v0, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/PwiHomeView;

    const/16 v1, 0x1d

    invoke-interface {v0, v1}, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/PwiHomeView;->showPwiOnboarding(I)V

    return-void
.end method

.method public onIsReadyToPayRequest(Z)V
    .locals 0

    .line 914
    iput-boolean p1, p0, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/PwiHomePresenterImpl;->hasGooglePaySupport:Z

    return-void
.end method

.method public onManageAllTransactionsClick()V
    .locals 2
    .annotation runtime Lcom/ibotta/android/aop/tracking/TrackingBefore;
        value = .enum Lcom/ibotta/android/aop/tracking/TrackingType;->PWI_MANAGE_TRANSACTIONS:Lcom/ibotta/android/aop/tracking/TrackingType;
    .end annotation

    sget-object v0, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/PwiHomePresenterImpl;->ajc$tjp_1:Lorg/aspectj/lang/JoinPoint$StaticPart;

    invoke-static {v0, p0, p0}, Lorg/aspectj/runtime/reflect/Factory;->makeJP(Lorg/aspectj/lang/JoinPoint$StaticPart;Ljava/lang/Object;Ljava/lang/Object;)Lorg/aspectj/lang/JoinPoint;

    move-result-object v0

    .line 450
    invoke-static {}, Lcom/ibotta/android/aop/tracking/TrackingAspect;->aspectOf()Lcom/ibotta/android/aop/tracking/TrackingAspect;

    move-result-object v1

    invoke-virtual {v1, v0}, Lcom/ibotta/android/aop/tracking/TrackingAspect;->before(Lorg/aspectj/lang/JoinPoint;)V

    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/PwiHomePresenterImpl;->mvpView:Lcom/ibotta/android/mvp/base/MvpView;

    check-cast v0, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/PwiHomeView;

    invoke-interface {v0}, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/PwiHomeView;->showWalletScreen()V

    return-void
.end method

.method public onNumberClick(Ljava/lang/String;)V
    .locals 2
    .param p1    # Ljava/lang/String;
        .annotation runtime Ljavax/annotation/Nonnull;
        .end annotation
    .end param

    .line 807
    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/PwiHomePresenterImpl;->clearTransactionJobInformation()V

    const-string v0, "0"

    .line 808
    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 809
    iget p1, p0, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/PwiHomePresenterImpl;->purchaseAmountCents:I

    mul-int/lit8 p1, p1, 0xa

    iput p1, p0, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/PwiHomePresenterImpl;->purchaseAmountCents:I

    goto :goto_0

    :cond_0
    const-string v0, "00"

    .line 810
    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 811
    iget p1, p0, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/PwiHomePresenterImpl;->purchaseAmountCents:I

    mul-int/lit8 p1, p1, 0x64

    iput p1, p0, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/PwiHomePresenterImpl;->purchaseAmountCents:I

    goto :goto_0

    .line 813
    :cond_1
    invoke-static {p1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result p1

    .line 814
    iget v0, p0, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/PwiHomePresenterImpl;->purchaseAmountCents:I

    mul-int/lit8 v0, v0, 0xa

    iput v0, p0, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/PwiHomePresenterImpl;->purchaseAmountCents:I

    .line 815
    iget v0, p0, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/PwiHomePresenterImpl;->purchaseAmountCents:I

    add-int/2addr v0, p1

    iput v0, p0, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/PwiHomePresenterImpl;->purchaseAmountCents:I

    .line 821
    :goto_0
    iget p1, p0, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/PwiHomePresenterImpl;->purchaseAmountCents:I

    const v0, 0xf423f

    if-le p1, v0, :cond_2

    .line 822
    div-int/lit8 p1, p1, 0xa

    iput p1, p0, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/PwiHomePresenterImpl;->purchaseAmountCents:I

    goto :goto_0

    .line 825
    :cond_2
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/PwiHomePresenterImpl;->formatting:Lcom/ibotta/android/util/Formatting;

    invoke-interface {v0, p1}, Lcom/ibotta/android/util/Formatting;->centsToDollars(I)D

    move-result-wide v0

    iput-wide v0, p0, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/PwiHomePresenterImpl;->purchaseAmount:D

    .line 826
    iget-wide v0, p0, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/PwiHomePresenterImpl;->purchaseAmount:D

    invoke-direct {p0, v0, v1}, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/PwiHomePresenterImpl;->getInputStateForAmount(D)Lcom/ibotta/android/views/pwi/home/PwiAddMoneyView$PwiPurchaseAmountState;

    move-result-object p1

    invoke-direct {p0, p1}, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/PwiHomePresenterImpl;->initViewStates(Lcom/ibotta/android/views/pwi/home/PwiAddMoneyView$PwiPurchaseAmountState;)V

    return-void
.end method

.method public onPayClick()V
    .locals 2

    .line 844
    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/PwiHomePresenterImpl;->isLoading()Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    .line 848
    :cond_0
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/PwiHomePresenterImpl;->defaultPaymentMethod:Lcom/ibotta/android/views/pwi/home/payments/PaymentOptionRowViewState;

    sget-object v1, Lcom/ibotta/android/views/pwi/home/payments/PaymentOptionRowViewState;->GOOGLE_PAY:Lcom/ibotta/android/views/pwi/home/payments/PaymentOptionRowViewState;

    invoke-virtual {v0, v1}, Lcom/ibotta/android/views/pwi/home/payments/PaymentOptionRowViewState;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 850
    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/PwiHomePresenterImpl;->purchaseFlowWithGooglePay()V

    return-void

    .line 854
    :cond_1
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/PwiHomePresenterImpl;->pwiUserState:Lcom/ibotta/android/state/pwi/PwiUserState;

    invoke-interface {v0}, Lcom/ibotta/android/state/pwi/PwiUserState;->isConfirmPurchaseAgain()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 855
    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/PwiHomePresenterImpl;->showPaymentConfirmation()V

    goto :goto_0

    .line 857
    :cond_2
    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/PwiHomePresenterImpl;->onPayConfirmation()V

    :goto_0
    return-void
.end method

.method public onPaymentMethodAdded()V
    .locals 0

    .line 414
    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/PwiHomePresenterImpl;->reload()V

    return-void
.end method

.method public onPaymentMethodClicked(Lcom/ibotta/android/views/pwi/home/payments/PaymentOptionRowViewState;)V
    .locals 4

    const-string v0, "Payment selector row clicked: %s, %s"

    const/4 v1, 0x2

    .line 383
    new-array v1, v1, [Ljava/lang/Object;

    invoke-virtual {p1}, Lcom/ibotta/android/views/pwi/home/payments/PaymentOptionRowViewState;->getName()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual {p1}, Lcom/ibotta/android/views/pwi/home/payments/PaymentOptionRowViewState;->getAction()Lcom/ibotta/android/views/pwi/home/payments/PaymentOptionRowViewState$Action;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Ltimber/log/Timber;->v(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 384
    sget-object v0, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/PwiHomePresenterImpl$4;->$SwitchMap$com$ibotta$android$views$pwi$home$payments$PaymentOptionRowViewState$Action:[I

    invoke-virtual {p1}, Lcom/ibotta/android/views/pwi/home/payments/PaymentOptionRowViewState;->getAction()Lcom/ibotta/android/views/pwi/home/payments/PaymentOptionRowViewState$Action;

    move-result-object v1

    invoke-virtual {v1}, Lcom/ibotta/android/views/pwi/home/payments/PaymentOptionRowViewState$Action;->ordinal()I

    move-result v1

    aget v0, v0, v1

    packed-switch v0, :pswitch_data_0

    goto :goto_0

    .line 405
    :pswitch_0
    sget-object p1, Lcom/ibotta/android/views/pwi/home/payments/PaymentOptionRowViewState;->GOOGLE_PAY:Lcom/ibotta/android/views/pwi/home/payments/PaymentOptionRowViewState;

    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/PwiHomePresenterImpl;->defaultPaymentMethod:Lcom/ibotta/android/views/pwi/home/payments/PaymentOptionRowViewState;

    .line 406
    iget-wide v0, p0, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/PwiHomePresenterImpl;->purchaseAmount:D

    invoke-direct {p0, v0, v1}, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/PwiHomePresenterImpl;->getInputStateForAmount(D)Lcom/ibotta/android/views/pwi/home/PwiAddMoneyView$PwiPurchaseAmountState;

    move-result-object p1

    invoke-direct {p0, p1}, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/PwiHomePresenterImpl;->initViewStates(Lcom/ibotta/android/views/pwi/home/PwiAddMoneyView$PwiPurchaseAmountState;)V

    goto :goto_0

    .line 390
    :pswitch_1
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/PwiHomePresenterImpl;->defaultPaymentMethod:Lcom/ibotta/android/views/pwi/home/payments/PaymentOptionRowViewState;

    invoke-virtual {v0, p1}, Lcom/ibotta/android/views/pwi/home/payments/PaymentOptionRowViewState;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 391
    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/PwiHomePresenterImpl;->clearTransactionJobInformation()V

    .line 395
    :cond_0
    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/PwiHomePresenterImpl;->defaultPaymentMethod:Lcom/ibotta/android/views/pwi/home/payments/PaymentOptionRowViewState;

    .line 396
    sget-object p1, Lcom/ibotta/android/views/pwi/home/payments/PaymentOptionRowViewState;->ADD_CARD:Lcom/ibotta/android/views/pwi/home/payments/PaymentOptionRowViewState;

    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/PwiHomePresenterImpl;->defaultPaymentMethod:Lcom/ibotta/android/views/pwi/home/payments/PaymentOptionRowViewState;

    invoke-virtual {p1, v0}, Lcom/ibotta/android/views/pwi/home/payments/PaymentOptionRowViewState;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_2

    .line 397
    iget-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/PwiHomePresenterImpl;->defaultPaymentMethod:Lcom/ibotta/android/views/pwi/home/payments/PaymentOptionRowViewState;

    invoke-virtual {p1}, Lcom/ibotta/android/views/pwi/home/payments/PaymentOptionRowViewState;->isExpired()Z

    move-result p1

    if-eqz p1, :cond_1

    .line 398
    sget-object p1, Lcom/ibotta/android/views/pwi/home/PwiAddMoneyView$PwiPurchaseAmountState;->EXPIRED:Lcom/ibotta/android/views/pwi/home/PwiAddMoneyView$PwiPurchaseAmountState;

    invoke-direct {p0, p1}, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/PwiHomePresenterImpl;->initViewStates(Lcom/ibotta/android/views/pwi/home/PwiAddMoneyView$PwiPurchaseAmountState;)V

    goto :goto_0

    .line 400
    :cond_1
    iget-wide v0, p0, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/PwiHomePresenterImpl;->purchaseAmount:D

    invoke-direct {p0, v0, v1}, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/PwiHomePresenterImpl;->getInputStateForAmount(D)Lcom/ibotta/android/views/pwi/home/PwiAddMoneyView$PwiPurchaseAmountState;

    move-result-object p1

    invoke-direct {p0, p1}, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/PwiHomePresenterImpl;->initViewStates(Lcom/ibotta/android/views/pwi/home/PwiAddMoneyView$PwiPurchaseAmountState;)V

    goto :goto_0

    .line 386
    :pswitch_2
    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/PwiHomePresenterImpl;->addNewCard()V

    :cond_2
    :goto_0
    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public onPendingStatusBarClicked()V
    .locals 0

    .line 429
    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/PwiHomePresenterImpl;->reload()V

    return-void
.end method

.method public onPurchaseBarcodeScreenDismiss()V
    .locals 4

    .line 520
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/PwiHomePresenterImpl;->appHelper:Lcom/ibotta/android/util/AppHelper;

    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/PwiHomePresenterImpl;->bgcTransaction:Lcom/ibotta/api/model/pwi/BgcTransaction;

    invoke-virtual {v1}, Lcom/ibotta/api/model/pwi/BgcTransaction;->getRewardAmount()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v1}, Lcom/ibotta/android/util/AppHelper;->isEmpty(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 521
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/PwiHomePresenterImpl;->mvpView:Lcom/ibotta/android/mvp/base/MvpView;

    check-cast v0, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/PwiHomeView;

    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/PwiHomePresenterImpl;->formatting:Lcom/ibotta/android/util/Formatting;

    iget-object v2, p0, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/PwiHomePresenterImpl;->bgcTransaction:Lcom/ibotta/api/model/pwi/BgcTransaction;

    invoke-virtual {v2}, Lcom/ibotta/api/model/pwi/BgcTransaction;->getRewardAmount()Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Ljava/lang/Double;->valueOf(Ljava/lang/String;)Ljava/lang/Double;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Double;->doubleValue()D

    move-result-wide v2

    invoke-interface {v1, v2, v3}, Lcom/ibotta/android/util/Formatting;->currencyLeadZero(D)Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v1}, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/PwiHomeView;->showCongratsAnimation(Ljava/lang/String;)V

    :cond_0
    return-void
.end method

.method public onRefreshTransactions()V
    .locals 0

    .line 527
    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/PwiHomePresenterImpl;->reload()V

    return-void
.end method

.method public onRetryPollingJobPromptClicked()V
    .locals 0

    .line 723
    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/PwiHomePresenterImpl;->submitPollingJob()V

    return-void
.end method

.method public onRowTapped(Lcom/ibotta/android/views/pwi/transactions/PwiTransactionRowViewState;)V
    .locals 2

    .line 440
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/PwiHomePresenterImpl;->mvpView:Lcom/ibotta/android/mvp/base/MvpView;

    check-cast v0, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/PwiHomeView;

    invoke-virtual {p1}, Lcom/ibotta/android/views/pwi/transactions/PwiTransactionRowViewState;->getTransactionId()Ljava/lang/String;

    move-result-object p1

    const/4 v1, 0x0

    invoke-interface {v0, p1, v1}, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/PwiHomeView;->showBarcodeScreen(Ljava/lang/String;Z)V

    return-void
.end method

.method public onShowPwiRetailersClick()V
    .locals 0

    return-void
.end method

.method public onSpentFilterClick()V
    .locals 0

    return-void
.end method

.method public onStart()V
    .locals 1

    .line 174
    invoke-super {p0}, Lcom/ibotta/android/mvp/base/loading/AbstractLoadingMvpPresenter;->onStart()V

    .line 175
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/PwiHomePresenterImpl;->googlePayManager:Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/GooglePayManager;

    invoke-interface {v0}, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/GooglePayManager;->isReadyToPay()V

    return-void
.end method

.method protected onSubmitJobFailed(Lcom/ibotta/android/service/api/job/SingleApiJob;)V
    .locals 4

    .line 645
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/PwiHomePresenterImpl;->mvpView:Lcom/ibotta/android/mvp/base/MvpView;

    check-cast v0, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/PwiHomeView;

    invoke-interface {v0}, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/PwiHomeView;->hideSubmittedJobLoading()V

    .line 646
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/PwiHomePresenterImpl;->mvpView:Lcom/ibotta/android/mvp/base/MvpView;

    check-cast v0, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/PwiHomeView;

    invoke-interface {v0}, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/PwiHomeView;->resetLoadingIndicatorText()V

    const/4 v0, 0x1

    const/4 v1, 0x0

    if-eqz p1, :cond_0

    .line 647
    invoke-virtual {p1}, Lcom/ibotta/android/service/api/job/SingleApiJob;->getOutcome()Lcom/ibotta/android/service/api/Outcome;

    move-result-object v2

    sget-object v3, Lcom/ibotta/android/service/api/Outcome;->NETWORK_LOST:Lcom/ibotta/android/service/api/Outcome;

    if-ne v2, v3, :cond_0

    const/4 v2, 0x1

    goto :goto_0

    :cond_0
    const/4 v2, 0x0

    :goto_0
    if-nez v2, :cond_6

    .line 648
    iget-object v2, p0, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/PwiHomePresenterImpl;->mvpPresenterActions:Lcom/ibotta/android/mvp/base/MvpPresenterActions;

    invoke-interface {v2}, Lcom/ibotta/android/mvp/base/MvpPresenterActions;->isNetworkConnected()Z

    move-result v2

    if-nez v2, :cond_1

    goto :goto_2

    .line 653
    :cond_1
    invoke-virtual {p1}, Lcom/ibotta/android/service/api/job/SingleApiJob;->getApiResponse()Lcom/ibotta/api/ApiResponse;

    move-result-object v2

    instance-of v2, v2, Lcom/ibotta/api/call/pwi/PwiErrorResponse;

    if-eqz v2, :cond_2

    .line 654
    invoke-virtual {p1}, Lcom/ibotta/android/service/api/job/SingleApiJob;->getApiResponse()Lcom/ibotta/api/ApiResponse;

    move-result-object v0

    check-cast v0, Lcom/ibotta/api/call/pwi/PwiErrorResponse;

    invoke-virtual {v0}, Lcom/ibotta/api/call/pwi/PwiErrorResponse;->getPwiError()Lcom/ibotta/api/model/pwi/PwiError;

    move-result-object v0

    .line 655
    invoke-virtual {p1}, Lcom/ibotta/android/service/api/job/SingleApiJob;->getApiResponse()Lcom/ibotta/api/ApiResponse;

    move-result-object p1

    invoke-virtual {p1}, Lcom/ibotta/api/ApiResponse;->getResponseCode()I

    move-result p1

    .line 654
    invoke-direct {p0, v0, p1}, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/PwiHomePresenterImpl;->handlePwiError(Lcom/ibotta/api/model/pwi/PwiError;I)V

    goto :goto_1

    .line 656
    :cond_2
    invoke-virtual {p1}, Lcom/ibotta/android/service/api/job/SingleApiJob;->getApiCall()Lcom/ibotta/api/ApiCall;

    move-result-object v2

    instance-of v2, v2, Lcom/ibotta/api/call/pwi/BgcPostTransactionCall;

    if-eqz v2, :cond_4

    .line 658
    iget p1, p0, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/PwiHomePresenterImpl;->postTxnJobCounter:I

    const/4 v2, 0x2

    if-ge p1, v2, :cond_3

    add-int/2addr p1, v0

    .line 659
    iput p1, p0, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/PwiHomePresenterImpl;->postTxnJobCounter:I

    .line 660
    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/PwiHomePresenterImpl;->submitTransactionPostJob()V

    goto :goto_1

    .line 662
    :cond_3
    iput v1, p0, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/PwiHomePresenterImpl;->postTxnJobCounter:I

    const/4 p1, 0x0

    const/16 v0, 0x1f8

    .line 663
    invoke-direct {p0, p1, v0}, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/PwiHomePresenterImpl;->handlePwiError(Lcom/ibotta/api/model/pwi/PwiError;I)V

    goto :goto_1

    .line 665
    :cond_4
    invoke-virtual {p1}, Lcom/ibotta/android/service/api/job/SingleApiJob;->getApiCall()Lcom/ibotta/api/ApiCall;

    move-result-object v0

    instance-of v0, v0, Lcom/ibotta/api/call/pwi/BgcTransactionByIdCall;

    if-eqz v0, :cond_5

    .line 667
    iget-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/PwiHomePresenterImpl;->mvpView:Lcom/ibotta/android/mvp/base/MvpView;

    check-cast p1, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/PwiHomeView;

    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/PwiHomePresenterImpl;->pwiHomeReducer:Lcom/ibotta/android/pwi/PwiHomeReducer;

    invoke-virtual {v0}, Lcom/ibotta/android/pwi/PwiHomeReducer;->createOrderedButFailedDialogViewState()Lcom/ibotta/android/views/messages/alert/SemiModalViewState;

    move-result-object v0

    invoke-interface {p1, v0}, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/PwiHomeView;->showOrderedButFailedPrompt(Lcom/ibotta/android/views/messages/alert/SemiModalViewState;)V

    goto :goto_1

    .line 669
    :cond_5
    invoke-super {p0, p1}, Lcom/ibotta/android/mvp/base/loading/AbstractLoadingMvpPresenter;->onSubmitJobFailed(Lcom/ibotta/android/service/api/job/SingleApiJob;)V

    :goto_1
    return-void

    .line 649
    :cond_6
    :goto_2
    iget-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/PwiHomePresenterImpl;->mvpView:Lcom/ibotta/android/mvp/base/MvpView;

    check-cast p1, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/PwiHomeView;

    invoke-interface {p1}, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/PwiHomeView;->showNetworkConnectionErrorDialog()V

    return-void
.end method

.method protected onSubmitJobSuccess(Lcom/ibotta/android/service/api/job/SingleApiJob;)V
    .locals 1

    .line 572
    invoke-super {p0, p1}, Lcom/ibotta/android/mvp/base/loading/AbstractLoadingMvpPresenter;->onSubmitJobSuccess(Lcom/ibotta/android/service/api/job/SingleApiJob;)V

    .line 574
    invoke-virtual {p1}, Lcom/ibotta/android/service/api/job/SingleApiJob;->getApiResponse()Lcom/ibotta/api/ApiResponse;

    move-result-object v0

    instance-of v0, v0, Lcom/ibotta/api/call/pwi/PwiErrorResponse;

    if-eqz v0, :cond_0

    .line 575
    invoke-virtual {p1}, Lcom/ibotta/android/service/api/job/SingleApiJob;->getApiResponse()Lcom/ibotta/api/ApiResponse;

    move-result-object v0

    check-cast v0, Lcom/ibotta/api/call/pwi/PwiErrorResponse;

    invoke-virtual {v0}, Lcom/ibotta/api/call/pwi/PwiErrorResponse;->getPwiError()Lcom/ibotta/api/model/pwi/PwiError;

    move-result-object v0

    .line 576
    invoke-virtual {p1}, Lcom/ibotta/android/service/api/job/SingleApiJob;->getApiResponse()Lcom/ibotta/api/ApiResponse;

    move-result-object p1

    invoke-virtual {p1}, Lcom/ibotta/api/ApiResponse;->getResponseCode()I

    move-result p1

    .line 575
    invoke-direct {p0, v0, p1}, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/PwiHomePresenterImpl;->handlePwiError(Lcom/ibotta/api/model/pwi/PwiError;I)V

    return-void

    .line 580
    :cond_0
    invoke-virtual {p1}, Lcom/ibotta/android/service/api/job/SingleApiJob;->getApiCall()Lcom/ibotta/api/ApiCall;

    move-result-object v0

    instance-of v0, v0, Lcom/ibotta/api/call/pwi/BgcPostTransactionCall;

    if-eqz v0, :cond_1

    .line 581
    invoke-direct {p0, p1}, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/PwiHomePresenterImpl;->handlePostTransactionResponse(Lcom/ibotta/android/service/api/job/SingleApiJob;)V

    goto :goto_0

    .line 582
    :cond_1
    invoke-virtual {p1}, Lcom/ibotta/android/service/api/job/SingleApiJob;->getApiCall()Lcom/ibotta/api/ApiCall;

    move-result-object v0

    instance-of v0, v0, Lcom/ibotta/api/call/pwi/BgcTransactionByIdCall;

    if-eqz v0, :cond_2

    .line 583
    invoke-direct {p0, p1}, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/PwiHomePresenterImpl;->handleGetTransactionResponse(Lcom/ibotta/android/service/api/job/SingleApiJob;)V

    :cond_2
    :goto_0
    return-void
.end method

.method public onSuccess(Lcom/stripe/android/model/Customer;)V
    .locals 3

    .line 461
    :try_start_0
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/PwiHomePresenterImpl;->pwiApiManager:Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/PwiApiManager;

    invoke-interface {v0, p1}, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/PwiApiManager;->getDefaultPaymentMethodFromCustomer(Lcom/stripe/android/model/Customer;)Lcom/ibotta/api/model/pwi/PwiPaymentMethod;

    move-result-object v0

    .line 462
    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/PwiHomePresenterImpl;->pwiHomeReducer:Lcom/ibotta/android/pwi/PwiHomeReducer;

    iget-object v2, p0, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/PwiHomePresenterImpl;->defaultPaymentMethod:Lcom/ibotta/android/views/pwi/home/payments/PaymentOptionRowViewState;

    invoke-virtual {v1, v0, v2}, Lcom/ibotta/android/pwi/PwiHomeReducer;->createPaymentOptionViewState(Lcom/ibotta/api/model/pwi/PwiPaymentMethod;Lcom/ibotta/android/views/pwi/home/payments/PaymentOptionRowViewState;)Lcom/ibotta/android/views/pwi/home/payments/PaymentOptionRowViewState;

    move-result-object v0

    iput-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/PwiHomePresenterImpl;->defaultPaymentMethod:Lcom/ibotta/android/views/pwi/home/payments/PaymentOptionRowViewState;
    :try_end_0
    .catch Lcom/ibotta/android/mvp/ui/activity/pwi/IbottaStripeException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/IllegalStateException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 471
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/PwiHomePresenterImpl;->mvpView:Lcom/ibotta/android/mvp/base/MvpView;

    if-eqz v0, :cond_a

    .line 472
    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/PwiHomePresenterImpl;->customer:Lcom/stripe/android/model/Customer;

    .line 474
    iget-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/PwiHomePresenterImpl;->pwiUserState:Lcom/ibotta/android/state/pwi/PwiUserState;

    invoke-interface {p1}, Lcom/ibotta/android/state/pwi/PwiUserState;->isGooglePayDefaultPayment()Ljava/lang/Boolean;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    if-eqz p1, :cond_0

    sget-object p1, Lcom/ibotta/android/views/pwi/home/payments/PaymentOptionRowViewState;->GOOGLE_PAY:Lcom/ibotta/android/views/pwi/home/payments/PaymentOptionRowViewState;

    goto :goto_0

    :cond_0
    iget-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/PwiHomePresenterImpl;->defaultPaymentMethod:Lcom/ibotta/android/views/pwi/home/payments/PaymentOptionRowViewState;

    :goto_0
    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/PwiHomePresenterImpl;->defaultPaymentMethod:Lcom/ibotta/android/views/pwi/home/payments/PaymentOptionRowViewState;

    .line 475
    iget-boolean p1, p0, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/PwiHomePresenterImpl;->hasPendingTxn:Z

    if-eqz p1, :cond_1

    goto/16 :goto_3

    .line 477
    :cond_1
    iget-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/PwiHomePresenterImpl;->defaultPaymentMethod:Lcom/ibotta/android/views/pwi/home/payments/PaymentOptionRowViewState;

    sget-object v0, Lcom/ibotta/android/views/pwi/home/payments/PaymentOptionRowViewState;->ADD_CARD:Lcom/ibotta/android/views/pwi/home/payments/PaymentOptionRowViewState;

    invoke-virtual {p1, v0}, Lcom/ibotta/android/views/pwi/home/payments/PaymentOptionRowViewState;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_2

    goto/16 :goto_4

    .line 479
    :cond_2
    iget-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/PwiHomePresenterImpl;->defaultPaymentMethod:Lcom/ibotta/android/views/pwi/home/payments/PaymentOptionRowViewState;

    invoke-virtual {p1}, Lcom/ibotta/android/views/pwi/home/payments/PaymentOptionRowViewState;->isExpired()Z

    move-result p1

    if-eqz p1, :cond_9

    goto/16 :goto_5

    :catchall_0
    move-exception v0

    goto/16 :goto_7

    :catch_0
    move-exception v0

    .line 467
    :try_start_1
    invoke-static {v0}, Ltimber/log/Timber;->e(Ljava/lang/Throwable;)V

    .line 468
    sget-object v1, Lcom/ibotta/android/crash/IbottaCrashProxy;->IbottaCrashManager:Lcom/ibotta/android/crash/CrashManager;

    invoke-virtual {v1, v0}, Lcom/ibotta/android/crash/CrashManager;->trackException(Ljava/lang/Throwable;)V

    .line 469
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/PwiHomePresenterImpl;->mvpView:Lcom/ibotta/android/mvp/base/MvpView;

    check-cast v0, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/PwiHomeView;

    invoke-interface {v0}, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/PwiHomeView;->finish()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 471
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/PwiHomePresenterImpl;->mvpView:Lcom/ibotta/android/mvp/base/MvpView;

    if-eqz v0, :cond_a

    .line 472
    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/PwiHomePresenterImpl;->customer:Lcom/stripe/android/model/Customer;

    .line 474
    iget-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/PwiHomePresenterImpl;->pwiUserState:Lcom/ibotta/android/state/pwi/PwiUserState;

    invoke-interface {p1}, Lcom/ibotta/android/state/pwi/PwiUserState;->isGooglePayDefaultPayment()Ljava/lang/Boolean;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    if-eqz p1, :cond_3

    sget-object p1, Lcom/ibotta/android/views/pwi/home/payments/PaymentOptionRowViewState;->GOOGLE_PAY:Lcom/ibotta/android/views/pwi/home/payments/PaymentOptionRowViewState;

    goto :goto_1

    :cond_3
    iget-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/PwiHomePresenterImpl;->defaultPaymentMethod:Lcom/ibotta/android/views/pwi/home/payments/PaymentOptionRowViewState;

    :goto_1
    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/PwiHomePresenterImpl;->defaultPaymentMethod:Lcom/ibotta/android/views/pwi/home/payments/PaymentOptionRowViewState;

    .line 475
    iget-boolean p1, p0, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/PwiHomePresenterImpl;->hasPendingTxn:Z

    if-eqz p1, :cond_4

    goto :goto_3

    .line 477
    :cond_4
    iget-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/PwiHomePresenterImpl;->defaultPaymentMethod:Lcom/ibotta/android/views/pwi/home/payments/PaymentOptionRowViewState;

    sget-object v0, Lcom/ibotta/android/views/pwi/home/payments/PaymentOptionRowViewState;->ADD_CARD:Lcom/ibotta/android/views/pwi/home/payments/PaymentOptionRowViewState;

    invoke-virtual {p1, v0}, Lcom/ibotta/android/views/pwi/home/payments/PaymentOptionRowViewState;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_5

    goto :goto_4

    .line 479
    :cond_5
    iget-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/PwiHomePresenterImpl;->defaultPaymentMethod:Lcom/ibotta/android/views/pwi/home/payments/PaymentOptionRowViewState;

    invoke-virtual {p1}, Lcom/ibotta/android/views/pwi/home/payments/PaymentOptionRowViewState;->isExpired()Z

    move-result p1

    if-eqz p1, :cond_9

    goto :goto_5

    .line 465
    :catch_1
    :try_start_2
    sget-object v0, Lcom/ibotta/android/views/pwi/home/payments/PaymentOptionRowViewState;->ADD_CARD:Lcom/ibotta/android/views/pwi/home/payments/PaymentOptionRowViewState;

    iput-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/PwiHomePresenterImpl;->defaultPaymentMethod:Lcom/ibotta/android/views/pwi/home/payments/PaymentOptionRowViewState;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 471
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/PwiHomePresenterImpl;->mvpView:Lcom/ibotta/android/mvp/base/MvpView;

    if-eqz v0, :cond_a

    .line 472
    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/PwiHomePresenterImpl;->customer:Lcom/stripe/android/model/Customer;

    .line 474
    iget-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/PwiHomePresenterImpl;->pwiUserState:Lcom/ibotta/android/state/pwi/PwiUserState;

    invoke-interface {p1}, Lcom/ibotta/android/state/pwi/PwiUserState;->isGooglePayDefaultPayment()Ljava/lang/Boolean;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    if-eqz p1, :cond_6

    sget-object p1, Lcom/ibotta/android/views/pwi/home/payments/PaymentOptionRowViewState;->GOOGLE_PAY:Lcom/ibotta/android/views/pwi/home/payments/PaymentOptionRowViewState;

    goto :goto_2

    :cond_6
    iget-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/PwiHomePresenterImpl;->defaultPaymentMethod:Lcom/ibotta/android/views/pwi/home/payments/PaymentOptionRowViewState;

    :goto_2
    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/PwiHomePresenterImpl;->defaultPaymentMethod:Lcom/ibotta/android/views/pwi/home/payments/PaymentOptionRowViewState;

    .line 475
    iget-boolean p1, p0, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/PwiHomePresenterImpl;->hasPendingTxn:Z

    if-eqz p1, :cond_7

    .line 476
    :goto_3
    sget-object p1, Lcom/ibotta/android/views/pwi/home/PwiAddMoneyView$PwiPurchaseAmountState;->PENDING:Lcom/ibotta/android/views/pwi/home/PwiAddMoneyView$PwiPurchaseAmountState;

    invoke-direct {p0, p1}, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/PwiHomePresenterImpl;->initViewStates(Lcom/ibotta/android/views/pwi/home/PwiAddMoneyView$PwiPurchaseAmountState;)V

    goto :goto_6

    .line 477
    :cond_7
    iget-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/PwiHomePresenterImpl;->defaultPaymentMethod:Lcom/ibotta/android/views/pwi/home/payments/PaymentOptionRowViewState;

    sget-object v0, Lcom/ibotta/android/views/pwi/home/payments/PaymentOptionRowViewState;->ADD_CARD:Lcom/ibotta/android/views/pwi/home/payments/PaymentOptionRowViewState;

    invoke-virtual {p1, v0}, Lcom/ibotta/android/views/pwi/home/payments/PaymentOptionRowViewState;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_8

    .line 478
    :goto_4
    sget-object p1, Lcom/ibotta/android/views/pwi/home/PwiAddMoneyView$PwiPurchaseAmountState;->NO_CARD:Lcom/ibotta/android/views/pwi/home/PwiAddMoneyView$PwiPurchaseAmountState;

    invoke-direct {p0, p1}, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/PwiHomePresenterImpl;->initViewStates(Lcom/ibotta/android/views/pwi/home/PwiAddMoneyView$PwiPurchaseAmountState;)V

    goto :goto_6

    .line 479
    :cond_8
    iget-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/PwiHomePresenterImpl;->defaultPaymentMethod:Lcom/ibotta/android/views/pwi/home/payments/PaymentOptionRowViewState;

    invoke-virtual {p1}, Lcom/ibotta/android/views/pwi/home/payments/PaymentOptionRowViewState;->isExpired()Z

    move-result p1

    if-eqz p1, :cond_9

    .line 480
    :goto_5
    sget-object p1, Lcom/ibotta/android/views/pwi/home/PwiAddMoneyView$PwiPurchaseAmountState;->EXPIRED:Lcom/ibotta/android/views/pwi/home/PwiAddMoneyView$PwiPurchaseAmountState;

    invoke-direct {p0, p1}, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/PwiHomePresenterImpl;->initViewStates(Lcom/ibotta/android/views/pwi/home/PwiAddMoneyView$PwiPurchaseAmountState;)V

    goto :goto_6

    .line 482
    :cond_9
    iget-wide v0, p0, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/PwiHomePresenterImpl;->purchaseAmount:D

    invoke-direct {p0, v0, v1}, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/PwiHomePresenterImpl;->getInputStateForAmount(D)Lcom/ibotta/android/views/pwi/home/PwiAddMoneyView$PwiPurchaseAmountState;

    move-result-object p1

    invoke-direct {p0, p1}, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/PwiHomePresenterImpl;->initViewStates(Lcom/ibotta/android/views/pwi/home/PwiAddMoneyView$PwiPurchaseAmountState;)V

    :cond_a
    :goto_6
    return-void

    .line 471
    :goto_7
    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/PwiHomePresenterImpl;->mvpView:Lcom/ibotta/android/mvp/base/MvpView;

    if-eqz v1, :cond_f

    .line 472
    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/PwiHomePresenterImpl;->customer:Lcom/stripe/android/model/Customer;

    .line 474
    iget-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/PwiHomePresenterImpl;->pwiUserState:Lcom/ibotta/android/state/pwi/PwiUserState;

    invoke-interface {p1}, Lcom/ibotta/android/state/pwi/PwiUserState;->isGooglePayDefaultPayment()Ljava/lang/Boolean;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    if-eqz p1, :cond_b

    sget-object p1, Lcom/ibotta/android/views/pwi/home/payments/PaymentOptionRowViewState;->GOOGLE_PAY:Lcom/ibotta/android/views/pwi/home/payments/PaymentOptionRowViewState;

    goto :goto_8

    :cond_b
    iget-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/PwiHomePresenterImpl;->defaultPaymentMethod:Lcom/ibotta/android/views/pwi/home/payments/PaymentOptionRowViewState;

    :goto_8
    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/PwiHomePresenterImpl;->defaultPaymentMethod:Lcom/ibotta/android/views/pwi/home/payments/PaymentOptionRowViewState;

    .line 475
    iget-boolean p1, p0, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/PwiHomePresenterImpl;->hasPendingTxn:Z

    if-nez p1, :cond_e

    .line 477
    iget-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/PwiHomePresenterImpl;->defaultPaymentMethod:Lcom/ibotta/android/views/pwi/home/payments/PaymentOptionRowViewState;

    sget-object v1, Lcom/ibotta/android/views/pwi/home/payments/PaymentOptionRowViewState;->ADD_CARD:Lcom/ibotta/android/views/pwi/home/payments/PaymentOptionRowViewState;

    invoke-virtual {p1, v1}, Lcom/ibotta/android/views/pwi/home/payments/PaymentOptionRowViewState;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_d

    .line 479
    iget-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/PwiHomePresenterImpl;->defaultPaymentMethod:Lcom/ibotta/android/views/pwi/home/payments/PaymentOptionRowViewState;

    invoke-virtual {p1}, Lcom/ibotta/android/views/pwi/home/payments/PaymentOptionRowViewState;->isExpired()Z

    move-result p1

    if-eqz p1, :cond_c

    .line 480
    sget-object p1, Lcom/ibotta/android/views/pwi/home/PwiAddMoneyView$PwiPurchaseAmountState;->EXPIRED:Lcom/ibotta/android/views/pwi/home/PwiAddMoneyView$PwiPurchaseAmountState;

    invoke-direct {p0, p1}, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/PwiHomePresenterImpl;->initViewStates(Lcom/ibotta/android/views/pwi/home/PwiAddMoneyView$PwiPurchaseAmountState;)V

    goto :goto_9

    .line 482
    :cond_c
    iget-wide v1, p0, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/PwiHomePresenterImpl;->purchaseAmount:D

    invoke-direct {p0, v1, v2}, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/PwiHomePresenterImpl;->getInputStateForAmount(D)Lcom/ibotta/android/views/pwi/home/PwiAddMoneyView$PwiPurchaseAmountState;

    move-result-object p1

    invoke-direct {p0, p1}, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/PwiHomePresenterImpl;->initViewStates(Lcom/ibotta/android/views/pwi/home/PwiAddMoneyView$PwiPurchaseAmountState;)V

    goto :goto_9

    .line 478
    :cond_d
    sget-object p1, Lcom/ibotta/android/views/pwi/home/PwiAddMoneyView$PwiPurchaseAmountState;->NO_CARD:Lcom/ibotta/android/views/pwi/home/PwiAddMoneyView$PwiPurchaseAmountState;

    invoke-direct {p0, p1}, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/PwiHomePresenterImpl;->initViewStates(Lcom/ibotta/android/views/pwi/home/PwiAddMoneyView$PwiPurchaseAmountState;)V

    goto :goto_9

    .line 476
    :cond_e
    sget-object p1, Lcom/ibotta/android/views/pwi/home/PwiAddMoneyView$PwiPurchaseAmountState;->PENDING:Lcom/ibotta/android/views/pwi/home/PwiAddMoneyView$PwiPurchaseAmountState;

    invoke-direct {p0, p1}, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/PwiHomePresenterImpl;->initViewStates(Lcom/ibotta/android/views/pwi/home/PwiAddMoneyView$PwiPurchaseAmountState;)V

    .line 482
    :cond_f
    :goto_9
    throw v0
.end method

.method public onTransactionActionClick(Lcom/ibotta/android/views/pwi/transactions/PwiTransactionRowViewState;)V
    .locals 0
    .param p1    # Lcom/ibotta/android/views/pwi/transactions/PwiTransactionRowViewState;
        .annotation runtime Ljavax/annotation/Nonnull;
        .end annotation
    .end param

    return-void
.end method

.method public onViewPagerChanged(I)V
    .locals 1

    .line 786
    sget-object v0, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/PwiHomeTab;->TRANSACTIONS:Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/PwiHomeTab;

    invoke-virtual {v0}, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/PwiHomeTab;->ordinal()I

    move-result v0

    if-ne p1, v0, :cond_0

    .line 787
    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/PwiHomePresenterImpl;->trackOnTransactionsTabViewed()V

    :cond_0
    return-void
.end method

.method public onViewsBound()V
    .locals 0

    .line 334
    invoke-super {p0}, Lcom/ibotta/android/mvp/base/loading/AbstractLoadingMvpPresenter;->onViewsBound()V

    .line 335
    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/PwiHomePresenterImpl;->showOnboardingForNewUsers()V

    return-void
.end method

.method public setContentId(Lcom/ibotta/android/apiandroid/content/ContentId;)V
    .locals 0
    .param p1    # Lcom/ibotta/android/apiandroid/content/ContentId;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param

    .line 367
    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/PwiHomePresenterImpl;->contentId:Lcom/ibotta/android/apiandroid/content/ContentId;

    return-void
.end method

.method public setRetailerId(I)V
    .locals 0

    .line 357
    iput p1, p0, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/PwiHomePresenterImpl;->retailerId:I

    return-void
.end method

.method public setTxnId(Ljava/lang/String;)V
    .locals 0

    .line 347
    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/PwiHomePresenterImpl;->txnId:Ljava/lang/String;

    return-void
.end method

.method public showPaymentMethodSelector()V
    .locals 5

    .line 434
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/PwiHomePresenterImpl;->pwiApiManager:Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/PwiApiManager;

    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/PwiHomePresenterImpl;->customer:Lcom/stripe/android/model/Customer;

    invoke-interface {v0, v1}, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/PwiApiManager;->getAllPaymentMethodsFromCustomer(Lcom/stripe/android/model/Customer;)Ljava/util/List;

    move-result-object v0

    .line 435
    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/PwiHomePresenterImpl;->mvpView:Lcom/ibotta/android/mvp/base/MvpView;

    check-cast v1, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/PwiHomeView;

    iget-object v2, p0, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/PwiHomePresenterImpl;->pwiHomeReducer:Lcom/ibotta/android/pwi/PwiHomeReducer;

    iget-object v3, p0, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/PwiHomePresenterImpl;->defaultPaymentMethod:Lcom/ibotta/android/views/pwi/home/payments/PaymentOptionRowViewState;

    iget-boolean v4, p0, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/PwiHomePresenterImpl;->hasGooglePaySupport:Z

    invoke-virtual {v2, v0, v3, v4}, Lcom/ibotta/android/pwi/PwiHomeReducer;->createPaymentMethodSelectorViewState(Ljava/util/List;Lcom/ibotta/android/views/pwi/home/payments/PaymentOptionRowViewState;Z)Lcom/ibotta/android/views/pwi/home/payments/PaymentOptionSelectorViewState;

    move-result-object v0

    invoke-interface {v1, v0}, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/PwiHomeView;->showPaymentMethodSelector(Lcom/ibotta/android/views/pwi/home/payments/PaymentOptionSelectorViewState;)V

    return-void
.end method
