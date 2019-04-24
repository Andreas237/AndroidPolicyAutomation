.class public Lcom/ibotta/android/mvp/ui/activity/mcomm/escort/MCommEscortPresenterImpl;
.super Lcom/ibotta/android/mvp/base/loading/AbstractLoadingMvpPresenter;
.source "MCommEscortPresenterImpl.java"

# interfaces
.implements Lcom/ibotta/android/aop/tracking/advice/LaunchPartnerAppAdviceFields;
.implements Lcom/ibotta/android/mvp/ui/activity/mcomm/escort/MCommEscortPresenter;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/ibotta/android/mvp/base/loading/AbstractLoadingMvpPresenter<",
        "Lcom/ibotta/android/mvp/ui/activity/mcomm/escort/MCommEscortView;",
        ">;",
        "Lcom/ibotta/android/aop/tracking/advice/LaunchPartnerAppAdviceFields;",
        "Lcom/ibotta/android/mvp/ui/activity/mcomm/escort/MCommEscortPresenter;"
    }
.end annotation


# static fields
.field private static final synthetic ajc$tjp_0:Lorg/aspectj/lang/JoinPoint$StaticPart;


# instance fields
.field private final appConfig:Lcom/ibotta/android/state/app/config/AppConfig;

.field private final appHelper:Lcom/ibotta/android/util/AppHelper;

.field private buttonAction:Lcom/usebutton/sdk/action/ButtonAction;
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation
.end field

.field private final buttonSdkManager:Lcom/ibotta/android/buttonsdk/ButtonSdkManager;

.field private mcommEscortParamsParcel:Lcom/ibotta/android/mvp/ui/activity/mcomm/escort/McommEscortParamsParcel;

.field private final mcommEscortReducer:Lcom/ibotta/android/content/mcommescort/McommEscortReducer;

.field private purchasePath:Lcom/usebutton/sdk/purchasepath/PurchasePath;
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation
.end field

.field private strategy:Lcom/ibotta/android/mvp/ui/activity/mcomm/escort/strategy/MCommEscortStrategy;

.field private final strategyFactory:Lcom/ibotta/android/mvp/ui/activity/mcomm/escort/strategy/MCommEscortStrategyFactory;

.field private final trackingQueue:Lcom/ibotta/android/tracking/proprietary/TrackingQueue;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    .line 1
    invoke-static {}, Lcom/ibotta/android/mvp/ui/activity/mcomm/escort/MCommEscortPresenterImpl;->ajc$preClinit()V

    return-void
.end method

.method public constructor <init>(Lcom/ibotta/android/mvp/base/MvpPresenterActions;Lcom/ibotta/android/buttonsdk/ButtonSdkManager;Lcom/ibotta/android/state/app/config/AppConfig;Lcom/ibotta/android/mvp/ui/activity/mcomm/escort/strategy/MCommEscortStrategyFactory;Lcom/ibotta/android/util/AppHelper;Lcom/ibotta/android/tracking/proprietary/TrackingQueue;Lcom/ibotta/android/content/mcommescort/McommEscortReducer;)V
    .locals 0

    .line 64
    invoke-direct {p0, p1}, Lcom/ibotta/android/mvp/base/loading/AbstractLoadingMvpPresenter;-><init>(Lcom/ibotta/android/mvp/base/MvpPresenterActions;)V

    .line 65
    iput-object p2, p0, Lcom/ibotta/android/mvp/ui/activity/mcomm/escort/MCommEscortPresenterImpl;->buttonSdkManager:Lcom/ibotta/android/buttonsdk/ButtonSdkManager;

    .line 66
    iput-object p3, p0, Lcom/ibotta/android/mvp/ui/activity/mcomm/escort/MCommEscortPresenterImpl;->appConfig:Lcom/ibotta/android/state/app/config/AppConfig;

    .line 67
    iput-object p4, p0, Lcom/ibotta/android/mvp/ui/activity/mcomm/escort/MCommEscortPresenterImpl;->strategyFactory:Lcom/ibotta/android/mvp/ui/activity/mcomm/escort/strategy/MCommEscortStrategyFactory;

    .line 68
    iput-object p5, p0, Lcom/ibotta/android/mvp/ui/activity/mcomm/escort/MCommEscortPresenterImpl;->appHelper:Lcom/ibotta/android/util/AppHelper;

    .line 69
    iput-object p6, p0, Lcom/ibotta/android/mvp/ui/activity/mcomm/escort/MCommEscortPresenterImpl;->trackingQueue:Lcom/ibotta/android/tracking/proprietary/TrackingQueue;

    .line 70
    iput-object p7, p0, Lcom/ibotta/android/mvp/ui/activity/mcomm/escort/MCommEscortPresenterImpl;->mcommEscortReducer:Lcom/ibotta/android/content/mcommescort/McommEscortReducer;

    return-void
.end method

.method static synthetic access$000(Lcom/ibotta/android/mvp/ui/activity/mcomm/escort/MCommEscortPresenterImpl;JLcom/ibotta/android/service/api/job/SingleApiJob;)V
    .locals 0

    .line 41
    invoke-direct {p0, p1, p2, p3}, Lcom/ibotta/android/mvp/ui/activity/mcomm/escort/MCommEscortPresenterImpl;->ensureMessageSeen(JLcom/ibotta/android/service/api/job/SingleApiJob;)V

    return-void
.end method

.method private static synthetic ajc$preClinit()V
    .locals 10

    .line 1
    new-instance v8, Lorg/aspectj/runtime/reflect/Factory;

    const-string v0, "MCommEscortPresenterImpl.java"

    const-class v1, Lcom/ibotta/android/mvp/ui/activity/mcomm/escort/MCommEscortPresenterImpl;

    invoke-direct {v8, v0, v1}, Lorg/aspectj/runtime/reflect/Factory;-><init>(Ljava/lang/String;Ljava/lang/Class;)V

    const-string v9, "method-execution"

    const-string v1, "2"

    const-string v2, "trackAppLaunch"

    const-string v3, "com.ibotta.android.mvp.ui.activity.mcomm.escort.MCommEscortPresenterImpl"

    const-string v4, ""

    const-string v5, ""

    const-string v6, ""

    const-string v7, "void"

    move-object v0, v8

    invoke-virtual/range {v0 .. v7}, Lorg/aspectj/runtime/reflect/Factory;->makeMethodSig(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lorg/aspectj/lang/reflect/MethodSignature;

    move-result-object v0

    const/16 v1, 0x10f

    invoke-virtual {v8, v9, v0, v1}, Lorg/aspectj/runtime/reflect/Factory;->makeSJP(Ljava/lang/String;Lorg/aspectj/lang/Signature;I)Lorg/aspectj/lang/JoinPoint$StaticPart;

    move-result-object v0

    sput-object v0, Lcom/ibotta/android/mvp/ui/activity/mcomm/escort/MCommEscortPresenterImpl;->ajc$tjp_0:Lorg/aspectj/lang/JoinPoint$StaticPart;

    return-void
.end method

.method private createCheckoutExtensionViewModel(Lcom/ibotta/api/model/customer/CustomerRetailerLaunch;Lcom/ibotta/android/fragment/retailer/RetailerParcel;)Lcom/ibotta/android/buttonsdk/card/CheckoutExtensionViewModel;
    .locals 3
    .param p1    # Lcom/ibotta/api/model/customer/CustomerRetailerLaunch;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param

    .line 151
    invoke-static {p1}, Ljava9/util/Optional;->ofNullable(Ljava/lang/Object;)Ljava9/util/Optional;

    move-result-object p1

    sget-object v0, Lcom/ibotta/android/mvp/ui/activity/mcomm/escort/-$$Lambda$fv1cgQbZA7_KxLViU2WCndGuWrc;->INSTANCE:Lcom/ibotta/android/mvp/ui/activity/mcomm/escort/-$$Lambda$fv1cgQbZA7_KxLViU2WCndGuWrc;

    .line 152
    invoke-virtual {p1, v0}, Ljava9/util/Optional;->flatMap(Ljava9/util/function/Function;)Ljava9/util/Optional;

    move-result-object p1

    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/mcomm/escort/MCommEscortPresenterImpl;->mvpView:Lcom/ibotta/android/mvp/base/MvpView;

    check-cast v0, Lcom/ibotta/android/mvp/ui/activity/mcomm/escort/MCommEscortView;

    .line 153
    invoke-interface {v0}, Lcom/ibotta/android/mvp/ui/activity/mcomm/escort/MCommEscortView;->getNullCashBackString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Ljava9/util/Optional;->orElse(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/String;

    .line 155
    invoke-static {p2}, Ljava9/util/Optional;->of(Ljava/lang/Object;)Ljava9/util/Optional;

    move-result-object v0

    sget-object v1, Lcom/ibotta/android/mvp/ui/activity/mcomm/escort/-$$Lambda$sW60_sLg9uK7DorUmiu-lM-JX8E;->INSTANCE:Lcom/ibotta/android/mvp/ui/activity/mcomm/escort/-$$Lambda$sW60_sLg9uK7DorUmiu-lM-JX8E;

    .line 156
    invoke-virtual {v0, v1}, Ljava9/util/Optional;->map(Ljava9/util/function/Function;)Ljava9/util/Optional;

    move-result-object v0

    sget-object v1, Lcom/ibotta/android/mvp/ui/activity/mcomm/escort/-$$Lambda$MCommEscortPresenterImpl$6d0HsdErH6PcF7MzmF93feXfcWY;->INSTANCE:Lcom/ibotta/android/mvp/ui/activity/mcomm/escort/-$$Lambda$MCommEscortPresenterImpl$6d0HsdErH6PcF7MzmF93feXfcWY;

    .line 157
    invoke-virtual {v0, v1}, Ljava9/util/Optional;->map(Ljava9/util/function/Function;)Ljava9/util/Optional;

    move-result-object v0

    const-string v1, ""

    .line 158
    invoke-virtual {v0, v1}, Ljava9/util/Optional;->orElse(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    .line 160
    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/mcomm/escort/MCommEscortPresenterImpl;->mvpView:Lcom/ibotta/android/mvp/base/MvpView;

    check-cast v1, Lcom/ibotta/android/mvp/ui/activity/mcomm/escort/MCommEscortView;

    .line 161
    invoke-interface {v1}, Lcom/ibotta/android/mvp/ui/activity/mcomm/escort/MCommEscortView;->getButtonBrowserSubtitle()Ljava/lang/String;

    move-result-object v1

    .line 162
    invoke-virtual {p2}, Lcom/ibotta/android/fragment/retailer/RetailerParcel;->getName()Ljava/lang/String;

    move-result-object v2

    .line 165
    invoke-virtual {p2}, Lcom/ibotta/android/fragment/retailer/RetailerParcel;->getCreditPendingPeriod()Ljava/lang/String;

    move-result-object p2

    .line 160
    invoke-static {v1, v2, p1, v0, p2}, Lcom/ibotta/android/buttonsdk/card/CheckoutExtensionViewModel;->create(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/ibotta/android/buttonsdk/card/CheckoutExtensionViewModel;

    move-result-object p1

    return-object p1
.end method

.method private ensureMessageSeen(JLcom/ibotta/android/service/api/job/SingleApiJob;)V
    .locals 4

    .line 111
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/mcomm/escort/MCommEscortPresenterImpl;->appConfig:Lcom/ibotta/android/state/app/config/AppConfig;

    invoke-interface {v0}, Lcom/ibotta/android/state/app/config/AppConfig;->getButtonSdkSplashDelay()J

    move-result-wide v0

    .line 112
    iget-object v2, p0, Lcom/ibotta/android/mvp/ui/activity/mcomm/escort/MCommEscortPresenterImpl;->appHelper:Lcom/ibotta/android/util/AppHelper;

    invoke-interface {v2}, Lcom/ibotta/android/util/AppHelper;->getCurrentTime()J

    move-result-wide v2

    sub-long/2addr v2, p1

    .line 114
    invoke-virtual {p3}, Lcom/ibotta/android/service/api/job/SingleApiJob;->isSuccessfullyLoaded()Z

    move-result p1

    if-eqz p1, :cond_0

    cmp-long p1, v2, v0

    if-gez p1, :cond_0

    sub-long/2addr v0, v2

    const-string p1, "Sleeping for: %1$d ms"

    const/4 p2, 0x1

    .line 116
    new-array p2, p2, [Ljava/lang/Object;

    const/4 p3, 0x0

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    aput-object v2, p2, p3

    invoke-static {p1, p2}, Ltimber/log/Timber;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 119
    :try_start_0
    invoke-static {v0, v1}, Ljava/lang/Thread;->sleep(J)V
    :try_end_0
    .catch Ljava/lang/InterruptedException; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    :cond_0
    return-void
.end method

.method private getCustomerRetailerLaunchFromApiJob(Lcom/ibotta/android/service/api/job/SingleApiJob;)Lcom/ibotta/api/model/customer/CustomerRetailerLaunch;
    .locals 2
    .param p1    # Lcom/ibotta/android/service/api/job/SingleApiJob;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param

    .line 169
    invoke-static {p1}, Ljava9/util/Optional;->ofNullable(Ljava/lang/Object;)Ljava9/util/Optional;

    move-result-object p1

    sget-object v0, Lcom/ibotta/android/mvp/ui/activity/mcomm/escort/-$$Lambda$_ar0McGnjai_t8tzpfNAdGQKRcY;->INSTANCE:Lcom/ibotta/android/mvp/ui/activity/mcomm/escort/-$$Lambda$_ar0McGnjai_t8tzpfNAdGQKRcY;

    .line 170
    invoke-virtual {p1, v0}, Ljava9/util/Optional;->map(Ljava9/util/function/Function;)Ljava9/util/Optional;

    move-result-object p1

    const-class v0, Lcom/ibotta/api/call/customer/buttonsdk/CustomerRetailerLaunchesResponse;

    invoke-static {v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v1, Lcom/ibotta/android/mvp/ui/activity/mcomm/escort/-$$Lambda$b9Mw9qWx7F1BWrhCS8lI7wudvZ8;

    invoke-direct {v1, v0}, Lcom/ibotta/android/mvp/ui/activity/mcomm/escort/-$$Lambda$b9Mw9qWx7F1BWrhCS8lI7wudvZ8;-><init>(Ljava/lang/Class;)V

    .line 171
    invoke-virtual {p1, v1}, Ljava9/util/Optional;->map(Ljava9/util/function/Function;)Ljava9/util/Optional;

    move-result-object p1

    sget-object v0, Lcom/ibotta/android/mvp/ui/activity/mcomm/escort/-$$Lambda$cK-1lN37RAC2g7iC6VqxzjzGfqU;->INSTANCE:Lcom/ibotta/android/mvp/ui/activity/mcomm/escort/-$$Lambda$cK-1lN37RAC2g7iC6VqxzjzGfqU;

    .line 172
    invoke-virtual {p1, v0}, Ljava9/util/Optional;->map(Ljava9/util/function/Function;)Ljava9/util/Optional;

    move-result-object p1

    const/4 v0, 0x0

    .line 173
    invoke-virtual {p1, v0}, Ljava9/util/Optional;->orElse(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/ibotta/api/model/customer/CustomerRetailerLaunch;

    return-object p1
.end method

.method static synthetic lambda$createCheckoutExtensionViewModel$0(Ljava/lang/String;)Ljava/lang/String;
    .locals 2

    const-string v0, "\r\n"

    const-string v1, "<br/>"

    .line 157
    invoke-virtual {p0, v0, v1}, Ljava/lang/String;->replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method private launchApp(Lcom/ibotta/android/buttonsdk/card/CheckoutExtensionViewModel;Ljava/lang/String;)V
    .locals 3

    .line 233
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/mcomm/escort/MCommEscortPresenterImpl;->buttonAction:Lcom/usebutton/sdk/action/ButtonAction;

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/mcomm/escort/MCommEscortPresenterImpl;->purchasePath:Lcom/usebutton/sdk/purchasepath/PurchasePath;

    if-nez v0, :cond_0

    .line 234
    iget-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/mcomm/escort/MCommEscortPresenterImpl;->mvpView:Lcom/ibotta/android/mvp/base/MvpView;

    check-cast p1, Lcom/ibotta/android/mvp/ui/activity/mcomm/escort/MCommEscortView;

    invoke-interface {p1}, Lcom/ibotta/android/mvp/ui/activity/mcomm/escort/MCommEscortView;->showScreenLoadFailed()V

    return-void

    :cond_0
    const-string v0, "Launching app now..."

    const/4 v1, 0x0

    .line 237
    new-array v1, v1, [Ljava/lang/Object;

    invoke-static {v0, v1}, Ltimber/log/Timber;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    const-string v0, ""

    .line 241
    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/mcomm/escort/MCommEscortPresenterImpl;->buttonAction:Lcom/usebutton/sdk/action/ButtonAction;

    if-eqz v1, :cond_1

    .line 243
    iget-object p2, p0, Lcom/ibotta/android/mvp/ui/activity/mcomm/escort/MCommEscortPresenterImpl;->mvpView:Lcom/ibotta/android/mvp/base/MvpView;

    check-cast p2, Lcom/ibotta/android/mvp/ui/activity/mcomm/escort/MCommEscortView;

    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/mcomm/escort/MCommEscortPresenterImpl;->buttonAction:Lcom/usebutton/sdk/action/ButtonAction;

    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/mcomm/escort/MCommEscortPresenterImpl;->appConfig:Lcom/ibotta/android/state/app/config/AppConfig;

    invoke-interface {v1}, Lcom/ibotta/android/state/app/config/AppConfig;->getButtonBrowserCardDelay()I

    move-result v1

    invoke-interface {p2, v0, p1, v1}, Lcom/ibotta/android/mvp/ui/activity/mcomm/escort/MCommEscortView;->invokeButtonAction(Lcom/usebutton/sdk/action/ButtonAction;Lcom/ibotta/android/buttonsdk/card/CheckoutExtensionViewModel;I)V

    .line 244
    iget-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/mcomm/escort/MCommEscortPresenterImpl;->buttonAction:Lcom/usebutton/sdk/action/ButtonAction;

    invoke-virtual {p1}, Lcom/usebutton/sdk/action/ButtonAction;->getAttributionToken()Ljava/lang/String;

    move-result-object v0

    goto :goto_0

    .line 245
    :cond_1
    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/mcomm/escort/MCommEscortPresenterImpl;->purchasePath:Lcom/usebutton/sdk/purchasepath/PurchasePath;

    if-eqz v1, :cond_3

    .line 246
    invoke-virtual {v1}, Lcom/usebutton/sdk/purchasepath/PurchasePath;->getAttributionToken()Ljava/lang/String;

    move-result-object v0

    .line 248
    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/mcomm/escort/MCommEscortPresenterImpl;->purchasePath:Lcom/usebutton/sdk/purchasepath/PurchasePath;

    instance-of v1, v1, Lcom/usebutton/sdk/internal/purchasepath/PurchasePathPrivate;

    if-eqz v1, :cond_2

    invoke-virtual {p2}, Ljava/lang/String;->isEmpty()Z

    move-result v1

    if-nez v1, :cond_2

    .line 249
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/mcomm/escort/MCommEscortPresenterImpl;->purchasePath:Lcom/usebutton/sdk/purchasepath/PurchasePath;

    move-object v1, v0

    check-cast v1, Lcom/usebutton/sdk/internal/purchasepath/PurchasePathPrivate;

    invoke-virtual {v0}, Lcom/usebutton/sdk/purchasepath/PurchasePath;->getAttributionToken()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0, p2}, Lcom/usebutton/sdk/internal/purchasepath/PurchasePathPrivate;->replaceAll(Ljava/lang/String;Ljava/lang/String;)V

    move-object v0, p2

    .line 255
    :cond_2
    iget-object p2, p0, Lcom/ibotta/android/mvp/ui/activity/mcomm/escort/MCommEscortPresenterImpl;->mvpView:Lcom/ibotta/android/mvp/base/MvpView;

    check-cast p2, Lcom/ibotta/android/mvp/ui/activity/mcomm/escort/MCommEscortView;

    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/mcomm/escort/MCommEscortPresenterImpl;->purchasePath:Lcom/usebutton/sdk/purchasepath/PurchasePath;

    iget-object v2, p0, Lcom/ibotta/android/mvp/ui/activity/mcomm/escort/MCommEscortPresenterImpl;->appConfig:Lcom/ibotta/android/state/app/config/AppConfig;

    invoke-interface {v2}, Lcom/ibotta/android/state/app/config/AppConfig;->getButtonBrowserCardDelay()I

    move-result v2

    invoke-interface {p2, v1, p1, v2}, Lcom/ibotta/android/mvp/ui/activity/mcomm/escort/MCommEscortView;->invokePurchasePath(Lcom/usebutton/sdk/purchasepath/PurchasePath;Lcom/ibotta/android/buttonsdk/card/CheckoutExtensionViewModel;I)V

    .line 259
    :cond_3
    :goto_0
    iget-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/mcomm/escort/MCommEscortPresenterImpl;->buttonSdkManager:Lcom/ibotta/android/buttonsdk/ButtonSdkManager;

    iget-object p2, p0, Lcom/ibotta/android/mvp/ui/activity/mcomm/escort/MCommEscortPresenterImpl;->mcommEscortParamsParcel:Lcom/ibotta/android/mvp/ui/activity/mcomm/escort/McommEscortParamsParcel;

    .line 260
    invoke-virtual {p2}, Lcom/ibotta/android/mvp/ui/activity/mcomm/escort/McommEscortParamsParcel;->getRetailerParcel()Lcom/ibotta/android/fragment/retailer/RetailerParcel;

    move-result-object p2

    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/mcomm/escort/MCommEscortPresenterImpl;->appHelper:Lcom/ibotta/android/util/AppHelper;

    .line 261
    invoke-interface {v1}, Lcom/ibotta/android/util/AppHelper;->getCurrentTime()J

    move-result-wide v1

    .line 259
    invoke-interface {p1, p2, v1, v2, v0}, Lcom/ibotta/android/buttonsdk/ButtonSdkManager;->recordAppLaunch(Lcom/ibotta/android/fragment/retailer/RetailerParcel;JLjava/lang/String;)V

    .line 265
    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/activity/mcomm/escort/MCommEscortPresenterImpl;->trackAppLaunch()V

    return-void
.end method

.method private setTitle()V
    .locals 3

    .line 190
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/mcomm/escort/MCommEscortPresenterImpl;->mcommEscortParamsParcel:Lcom/ibotta/android/mvp/ui/activity/mcomm/escort/McommEscortParamsParcel;

    invoke-virtual {v0}, Lcom/ibotta/android/mvp/ui/activity/mcomm/escort/McommEscortParamsParcel;->getRetailerParcel()Lcom/ibotta/android/fragment/retailer/RetailerParcel;

    move-result-object v0

    invoke-virtual {v0}, Lcom/ibotta/android/fragment/retailer/RetailerParcel;->getName()Ljava/lang/String;

    move-result-object v0

    .line 191
    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/mcomm/escort/MCommEscortPresenterImpl;->appHelper:Lcom/ibotta/android/util/AppHelper;

    invoke-interface {v1, v0}, Lcom/ibotta/android/util/AppHelper;->isEmpty(Ljava/lang/String;)Z

    move-result v1

    if-nez v1, :cond_0

    .line 192
    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/mcomm/escort/MCommEscortPresenterImpl;->mvpView:Lcom/ibotta/android/mvp/base/MvpView;

    check-cast v1, Lcom/ibotta/android/mvp/ui/activity/mcomm/escort/MCommEscortView;

    iget-object v2, p0, Lcom/ibotta/android/mvp/ui/activity/mcomm/escort/MCommEscortPresenterImpl;->mcommEscortReducer:Lcom/ibotta/android/content/mcommescort/McommEscortReducer;

    invoke-virtual {v2, v0}, Lcom/ibotta/android/content/mcommescort/McommEscortReducer;->createTitle(Ljava/lang/String;)Lcom/ibotta/android/views/base/title/TitleBarViewState;

    move-result-object v0

    invoke-interface {v1, v0}, Lcom/ibotta/android/mvp/ui/activity/mcomm/escort/MCommEscortView;->setTitle(Lcom/ibotta/android/views/base/title/TitleBarViewState;)V

    :cond_0
    return-void
.end method

.method private trackAppLaunch()V
    .locals 4
    .annotation runtime Lcom/ibotta/android/aop/tracking/TrackingAfter;
        value = .enum Lcom/ibotta/android/aop/tracking/TrackingType;->LAUNCH_PARTNER_APP:Lcom/ibotta/android/aop/tracking/TrackingType;
    .end annotation

    sget-object v0, Lcom/ibotta/android/mvp/ui/activity/mcomm/escort/MCommEscortPresenterImpl;->ajc$tjp_0:Lorg/aspectj/lang/JoinPoint$StaticPart;

    invoke-static {v0, p0, p0}, Lorg/aspectj/runtime/reflect/Factory;->makeJP(Lorg/aspectj/lang/JoinPoint$StaticPart;Ljava/lang/Object;Ljava/lang/Object;)Lorg/aspectj/lang/JoinPoint;

    move-result-object v0

    .line 271
    :try_start_0
    new-instance v1, Lcom/ibotta/android/tracking/proprietary/event/LaunchAppEvent;

    invoke-direct {v1}, Lcom/ibotta/android/tracking/proprietary/event/LaunchAppEvent;-><init>()V

    .line 272
    iget-object v2, p0, Lcom/ibotta/android/mvp/ui/activity/mcomm/escort/MCommEscortPresenterImpl;->mcommEscortParamsParcel:Lcom/ibotta/android/mvp/ui/activity/mcomm/escort/McommEscortParamsParcel;

    invoke-virtual {v2}, Lcom/ibotta/android/mvp/ui/activity/mcomm/escort/McommEscortParamsParcel;->getEventContext()Lcom/ibotta/android/tracking/proprietary/event/enums/EventContext;

    move-result-object v2

    invoke-virtual {v1, v2}, Lcom/ibotta/android/tracking/proprietary/event/LaunchAppEvent;->setEventContext(Lcom/ibotta/android/tracking/proprietary/event/enums/EventContext;)V

    const/4 v2, 0x1

    .line 273
    invoke-virtual {v1, v2}, Lcom/ibotta/android/tracking/proprietary/event/LaunchAppEvent;->setCounter(I)V

    .line 274
    iget-object v2, p0, Lcom/ibotta/android/mvp/ui/activity/mcomm/escort/MCommEscortPresenterImpl;->appHelper:Lcom/ibotta/android/util/AppHelper;

    invoke-interface {v2}, Lcom/ibotta/android/util/AppHelper;->getCurrentTime()J

    move-result-wide v2

    invoke-virtual {v1, v2, v3}, Lcom/ibotta/android/tracking/proprietary/event/LaunchAppEvent;->setEventAt(J)V

    .line 275
    iget-object v2, p0, Lcom/ibotta/android/mvp/ui/activity/mcomm/escort/MCommEscortPresenterImpl;->mcommEscortParamsParcel:Lcom/ibotta/android/mvp/ui/activity/mcomm/escort/McommEscortParamsParcel;

    invoke-virtual {v2}, Lcom/ibotta/android/mvp/ui/activity/mcomm/escort/McommEscortParamsParcel;->getRetailerParcel()Lcom/ibotta/android/fragment/retailer/RetailerParcel;

    move-result-object v2

    invoke-virtual {v2}, Lcom/ibotta/android/fragment/retailer/RetailerParcel;->getId()I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {v1, v2}, Lcom/ibotta/android/tracking/proprietary/event/LaunchAppEvent;->setRetailerId(Ljava/lang/Integer;)V

    .line 276
    iget-object v2, p0, Lcom/ibotta/android/mvp/ui/activity/mcomm/escort/MCommEscortPresenterImpl;->mcommEscortParamsParcel:Lcom/ibotta/android/mvp/ui/activity/mcomm/escort/McommEscortParamsParcel;

    invoke-virtual {v2}, Lcom/ibotta/android/mvp/ui/activity/mcomm/escort/McommEscortParamsParcel;->getOfferId()Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {v1, v2}, Lcom/ibotta/android/tracking/proprietary/event/LaunchAppEvent;->setOfferId(Ljava/lang/Integer;)V

    .line 277
    iget-object v2, p0, Lcom/ibotta/android/mvp/ui/activity/mcomm/escort/MCommEscortPresenterImpl;->mcommEscortParamsParcel:Lcom/ibotta/android/mvp/ui/activity/mcomm/escort/McommEscortParamsParcel;

    invoke-virtual {v2}, Lcom/ibotta/android/mvp/ui/activity/mcomm/escort/McommEscortParamsParcel;->getProductId()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Lcom/ibotta/android/tracking/proprietary/event/LaunchAppEvent;->setProductId(Ljava/lang/String;)V

    .line 278
    iget-object v2, p0, Lcom/ibotta/android/mvp/ui/activity/mcomm/escort/MCommEscortPresenterImpl;->mcommEscortParamsParcel:Lcom/ibotta/android/mvp/ui/activity/mcomm/escort/McommEscortParamsParcel;

    invoke-virtual {v2}, Lcom/ibotta/android/mvp/ui/activity/mcomm/escort/McommEscortParamsParcel;->getSearchTerm()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Lcom/ibotta/android/tracking/proprietary/event/LaunchAppEvent;->setTerm(Ljava/lang/String;)V

    .line 280
    iget-object v2, p0, Lcom/ibotta/android/mvp/ui/activity/mcomm/escort/MCommEscortPresenterImpl;->trackingQueue:Lcom/ibotta/android/tracking/proprietary/TrackingQueue;

    invoke-interface {v2, v1}, Lcom/ibotta/android/tracking/proprietary/TrackingQueue;->send(Lcom/ibotta/android/tracking/proprietary/event/AbstractEvent;)V
    :try_end_0
    .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0

    .line 281
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

    .line 81
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/mcomm/escort/MCommEscortPresenterImpl;->strategy:Lcom/ibotta/android/mvp/ui/activity/mcomm/escort/strategy/MCommEscortStrategy;

    invoke-interface {v0}, Lcom/ibotta/android/mvp/ui/activity/mcomm/escort/strategy/MCommEscortStrategy;->getFetchJobs()Ljava/util/Set;

    move-result-object v0

    return-object v0
.end method

.method public getMcommEscortParamsParcel()Lcom/ibotta/android/mvp/ui/activity/mcomm/escort/McommEscortParamsParcel;
    .locals 1

    .line 285
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/mcomm/escort/MCommEscortPresenterImpl;->mcommEscortParamsParcel:Lcom/ibotta/android/mvp/ui/activity/mcomm/escort/McommEscortParamsParcel;

    return-object v0
.end method

.method protected onAbandonFetchJobs()V
    .locals 1

    .line 86
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/mcomm/escort/MCommEscortPresenterImpl;->strategy:Lcom/ibotta/android/mvp/ui/activity/mcomm/escort/strategy/MCommEscortStrategy;

    invoke-interface {v0}, Lcom/ibotta/android/mvp/ui/activity/mcomm/escort/strategy/MCommEscortStrategy;->onAbandonFetchJobs()V

    return-void
.end method

.method public onButtonActionAcquired(Lcom/usebutton/sdk/action/ButtonAction;)V
    .locals 3

    .line 198
    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/mcomm/escort/MCommEscortPresenterImpl;->buttonAction:Lcom/usebutton/sdk/action/ButtonAction;

    .line 199
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/mcomm/escort/MCommEscortPresenterImpl;->strategy:Lcom/ibotta/android/mvp/ui/activity/mcomm/escort/strategy/MCommEscortStrategy;

    invoke-interface {v0, p1}, Lcom/ibotta/android/mvp/ui/activity/mcomm/escort/strategy/MCommEscortStrategy;->onButtonActionAcquired(Lcom/usebutton/sdk/action/ButtonAction;)Lcom/ibotta/api/call/customer/buttonsdk/CustomerRetailerLaunchesPostCall;

    move-result-object p1

    if-eqz p1, :cond_0

    .line 201
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/mcomm/escort/MCommEscortPresenterImpl;->appHelper:Lcom/ibotta/android/util/AppHelper;

    invoke-interface {v0}, Lcom/ibotta/android/util/AppHelper;->getCurrentTime()J

    move-result-wide v0

    .line 202
    new-instance v2, Lcom/ibotta/android/mvp/ui/activity/mcomm/escort/MCommEscortPresenterImpl$1;

    invoke-direct {v2, p0, p1, v0, v1}, Lcom/ibotta/android/mvp/ui/activity/mcomm/escort/MCommEscortPresenterImpl$1;-><init>(Lcom/ibotta/android/mvp/ui/activity/mcomm/escort/MCommEscortPresenterImpl;Lcom/ibotta/api/ApiCall;J)V

    invoke-virtual {p0, v2}, Lcom/ibotta/android/mvp/ui/activity/mcomm/escort/MCommEscortPresenterImpl;->submitApiJob(Lcom/ibotta/android/service/api/job/ApiJob;)V

    goto :goto_0

    .line 209
    :cond_0
    iget-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/mcomm/escort/MCommEscortPresenterImpl;->mvpView:Lcom/ibotta/android/mvp/base/MvpView;

    if-eqz p1, :cond_1

    .line 210
    iget-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/mcomm/escort/MCommEscortPresenterImpl;->mvpView:Lcom/ibotta/android/mvp/base/MvpView;

    check-cast p1, Lcom/ibotta/android/mvp/ui/activity/mcomm/escort/MCommEscortView;

    invoke-interface {p1}, Lcom/ibotta/android/mvp/ui/activity/mcomm/escort/MCommEscortView;->showScreenLoadFailed()V

    :cond_1
    :goto_0
    return-void
.end method

.method protected onFetchFinishedSuccessfully()V
    .locals 2

    .line 103
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/mcomm/escort/MCommEscortPresenterImpl;->strategy:Lcom/ibotta/android/mvp/ui/activity/mcomm/escort/strategy/MCommEscortStrategy;

    invoke-interface {v0}, Lcom/ibotta/android/mvp/ui/activity/mcomm/escort/strategy/MCommEscortStrategy;->onFetchFinishedSuccessfully()V

    .line 104
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/mcomm/escort/MCommEscortPresenterImpl;->mcommEscortParamsParcel:Lcom/ibotta/android/mvp/ui/activity/mcomm/escort/McommEscortParamsParcel;

    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/mcomm/escort/MCommEscortPresenterImpl;->strategy:Lcom/ibotta/android/mvp/ui/activity/mcomm/escort/strategy/MCommEscortStrategy;

    invoke-interface {v1}, Lcom/ibotta/android/mvp/ui/activity/mcomm/escort/strategy/MCommEscortStrategy;->getRetailerParcel()Lcom/ibotta/android/fragment/retailer/RetailerParcel;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/ibotta/android/mvp/ui/activity/mcomm/escort/McommEscortParamsParcel;->withRetailer(Lcom/ibotta/android/fragment/retailer/RetailerParcel;)Lcom/ibotta/android/mvp/ui/activity/mcomm/escort/McommEscortParamsParcel;

    move-result-object v0

    iput-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/mcomm/escort/MCommEscortPresenterImpl;->mcommEscortParamsParcel:Lcom/ibotta/android/mvp/ui/activity/mcomm/escort/McommEscortParamsParcel;

    .line 105
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/mcomm/escort/MCommEscortPresenterImpl;->mvpView:Lcom/ibotta/android/mvp/base/MvpView;

    check-cast v0, Lcom/ibotta/android/mvp/ui/activity/mcomm/escort/MCommEscortView;

    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/mcomm/escort/MCommEscortPresenterImpl;->mcommEscortParamsParcel:Lcom/ibotta/android/mvp/ui/activity/mcomm/escort/McommEscortParamsParcel;

    invoke-virtual {v1}, Lcom/ibotta/android/mvp/ui/activity/mcomm/escort/McommEscortParamsParcel;->getRetailerParcel()Lcom/ibotta/android/fragment/retailer/RetailerParcel;

    move-result-object v1

    invoke-interface {v0, v1}, Lcom/ibotta/android/mvp/ui/activity/mcomm/escort/MCommEscortView;->setRetailerParcel(Lcom/ibotta/android/fragment/retailer/RetailerParcel;)V

    .line 106
    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/activity/mcomm/escort/MCommEscortPresenterImpl;->setTitle()V

    return-void
.end method

.method protected onFetchJobFailed(Lcom/ibotta/android/service/api/job/ApiJob;)V
    .locals 1

    .line 97
    invoke-super {p0, p1}, Lcom/ibotta/android/mvp/base/loading/AbstractLoadingMvpPresenter;->onFetchJobFailed(Lcom/ibotta/android/service/api/job/ApiJob;)V

    .line 98
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/mcomm/escort/MCommEscortPresenterImpl;->strategy:Lcom/ibotta/android/mvp/ui/activity/mcomm/escort/strategy/MCommEscortStrategy;

    invoke-interface {v0, p1}, Lcom/ibotta/android/mvp/ui/activity/mcomm/escort/strategy/MCommEscortStrategy;->onFetchJobFailed(Lcom/ibotta/android/service/api/job/ApiJob;)V

    return-void
.end method

.method protected onFetchJobSuccess(Lcom/ibotta/android/service/api/job/ApiJob;)V
    .locals 1

    .line 91
    invoke-super {p0, p1}, Lcom/ibotta/android/mvp/base/loading/AbstractLoadingMvpPresenter;->onFetchJobSuccess(Lcom/ibotta/android/service/api/job/ApiJob;)V

    .line 92
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/mcomm/escort/MCommEscortPresenterImpl;->strategy:Lcom/ibotta/android/mvp/ui/activity/mcomm/escort/strategy/MCommEscortStrategy;

    invoke-interface {v0, p1}, Lcom/ibotta/android/mvp/ui/activity/mcomm/escort/strategy/MCommEscortStrategy;->onFetchJobSuccess(Lcom/ibotta/android/service/api/job/ApiJob;)V

    return-void
.end method

.method public onPurchasePathAcquired(Lcom/usebutton/sdk/purchasepath/PurchasePath;)V
    .locals 3

    .line 216
    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/mcomm/escort/MCommEscortPresenterImpl;->purchasePath:Lcom/usebutton/sdk/purchasepath/PurchasePath;

    .line 217
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/mcomm/escort/MCommEscortPresenterImpl;->strategy:Lcom/ibotta/android/mvp/ui/activity/mcomm/escort/strategy/MCommEscortStrategy;

    invoke-interface {v0, p1}, Lcom/ibotta/android/mvp/ui/activity/mcomm/escort/strategy/MCommEscortStrategy;->onPurchasePathAcquired(Lcom/usebutton/sdk/purchasepath/PurchasePath;)Lcom/ibotta/api/call/customer/buttonsdk/CustomerRetailerLaunchesPostCall;

    move-result-object p1

    if-eqz p1, :cond_0

    .line 219
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/mcomm/escort/MCommEscortPresenterImpl;->appHelper:Lcom/ibotta/android/util/AppHelper;

    invoke-interface {v0}, Lcom/ibotta/android/util/AppHelper;->getCurrentTime()J

    move-result-wide v0

    .line 220
    new-instance v2, Lcom/ibotta/android/mvp/ui/activity/mcomm/escort/MCommEscortPresenterImpl$2;

    invoke-direct {v2, p0, p1, v0, v1}, Lcom/ibotta/android/mvp/ui/activity/mcomm/escort/MCommEscortPresenterImpl$2;-><init>(Lcom/ibotta/android/mvp/ui/activity/mcomm/escort/MCommEscortPresenterImpl;Lcom/ibotta/api/ApiCall;J)V

    invoke-virtual {p0, v2}, Lcom/ibotta/android/mvp/ui/activity/mcomm/escort/MCommEscortPresenterImpl;->submitApiJob(Lcom/ibotta/android/service/api/job/ApiJob;)V

    goto :goto_0

    .line 227
    :cond_0
    iget-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/mcomm/escort/MCommEscortPresenterImpl;->mvpView:Lcom/ibotta/android/mvp/base/MvpView;

    if-eqz p1, :cond_1

    .line 228
    iget-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/mcomm/escort/MCommEscortPresenterImpl;->mvpView:Lcom/ibotta/android/mvp/base/MvpView;

    check-cast p1, Lcom/ibotta/android/mvp/ui/activity/mcomm/escort/MCommEscortView;

    invoke-interface {p1}, Lcom/ibotta/android/mvp/ui/activity/mcomm/escort/MCommEscortView;->showScreenLoadFailed()V

    :cond_1
    :goto_0
    return-void
.end method

.method public onStart()V
    .locals 3

    .line 75
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/mcomm/escort/MCommEscortPresenterImpl;->strategyFactory:Lcom/ibotta/android/mvp/ui/activity/mcomm/escort/strategy/MCommEscortStrategyFactory;

    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/mcomm/escort/MCommEscortPresenterImpl;->mcommEscortParamsParcel:Lcom/ibotta/android/mvp/ui/activity/mcomm/escort/McommEscortParamsParcel;

    iget-object v2, p0, Lcom/ibotta/android/mvp/ui/activity/mcomm/escort/MCommEscortPresenterImpl;->mvpView:Lcom/ibotta/android/mvp/base/MvpView;

    check-cast v2, Lcom/ibotta/android/mvp/ui/activity/mcomm/escort/strategy/AppActionCreator;

    invoke-virtual {v0, v1, v2}, Lcom/ibotta/android/mvp/ui/activity/mcomm/escort/strategy/MCommEscortStrategyFactory;->createStrategy(Lcom/ibotta/android/mvp/ui/activity/mcomm/escort/McommEscortParamsParcel;Lcom/ibotta/android/mvp/ui/activity/mcomm/escort/strategy/AppActionCreator;)Lcom/ibotta/android/mvp/ui/activity/mcomm/escort/strategy/MCommEscortStrategy;

    move-result-object v0

    iput-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/mcomm/escort/MCommEscortPresenterImpl;->strategy:Lcom/ibotta/android/mvp/ui/activity/mcomm/escort/strategy/MCommEscortStrategy;

    .line 76
    invoke-super {p0}, Lcom/ibotta/android/mvp/base/loading/AbstractLoadingMvpPresenter;->onStart()V

    return-void
.end method

.method protected onSubmitJobFailed(Lcom/ibotta/android/service/api/job/SingleApiJob;)V
    .locals 0

    .line 178
    invoke-super {p0, p1}, Lcom/ibotta/android/mvp/base/loading/AbstractLoadingMvpPresenter;->onSubmitJobFailed(Lcom/ibotta/android/service/api/job/SingleApiJob;)V

    .line 179
    iget-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/mcomm/escort/MCommEscortPresenterImpl;->mvpView:Lcom/ibotta/android/mvp/base/MvpView;

    check-cast p1, Lcom/ibotta/android/mvp/ui/activity/mcomm/escort/MCommEscortView;

    invoke-interface {p1}, Lcom/ibotta/android/mvp/ui/activity/mcomm/escort/MCommEscortView;->showFailedToLaunchAppMessage()V

    return-void
.end method

.method protected onSubmitJobSuccess(Lcom/ibotta/android/service/api/job/SingleApiJob;)V
    .locals 2

    .line 128
    invoke-super {p0, p1}, Lcom/ibotta/android/mvp/base/loading/AbstractLoadingMvpPresenter;->onSubmitJobSuccess(Lcom/ibotta/android/service/api/job/SingleApiJob;)V

    .line 129
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/mcomm/escort/MCommEscortPresenterImpl;->strategy:Lcom/ibotta/android/mvp/ui/activity/mcomm/escort/strategy/MCommEscortStrategy;

    invoke-interface {v0}, Lcom/ibotta/android/mvp/ui/activity/mcomm/escort/strategy/MCommEscortStrategy;->getRetailerParcel()Lcom/ibotta/android/fragment/retailer/RetailerParcel;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 132
    invoke-direct {p0, p1}, Lcom/ibotta/android/mvp/ui/activity/mcomm/escort/MCommEscortPresenterImpl;->getCustomerRetailerLaunchFromApiJob(Lcom/ibotta/android/service/api/job/SingleApiJob;)Lcom/ibotta/api/model/customer/CustomerRetailerLaunch;

    move-result-object p1

    .line 135
    invoke-direct {p0, p1, v0}, Lcom/ibotta/android/mvp/ui/activity/mcomm/escort/MCommEscortPresenterImpl;->createCheckoutExtensionViewModel(Lcom/ibotta/api/model/customer/CustomerRetailerLaunch;Lcom/ibotta/android/fragment/retailer/RetailerParcel;)Lcom/ibotta/android/buttonsdk/card/CheckoutExtensionViewModel;

    move-result-object v0

    .line 137
    invoke-static {p1}, Ljava9/util/Optional;->ofNullable(Ljava/lang/Object;)Ljava9/util/Optional;

    move-result-object p1

    sget-object v1, Lcom/ibotta/android/mvp/ui/activity/mcomm/escort/-$$Lambda$nxytwIQ0x-0CDzXMpWkvAq07Unk;->INSTANCE:Lcom/ibotta/android/mvp/ui/activity/mcomm/escort/-$$Lambda$nxytwIQ0x-0CDzXMpWkvAq07Unk;

    .line 138
    invoke-virtual {p1, v1}, Ljava9/util/Optional;->flatMap(Ljava9/util/function/Function;)Ljava9/util/Optional;

    move-result-object p1

    const-string v1, ""

    .line 139
    invoke-virtual {p1, v1}, Ljava9/util/Optional;->orElse(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/String;

    .line 141
    invoke-direct {p0, v0, p1}, Lcom/ibotta/android/mvp/ui/activity/mcomm/escort/MCommEscortPresenterImpl;->launchApp(Lcom/ibotta/android/buttonsdk/card/CheckoutExtensionViewModel;Ljava/lang/String;)V

    .line 142
    iget-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/mcomm/escort/MCommEscortPresenterImpl;->mvpView:Lcom/ibotta/android/mvp/base/MvpView;

    check-cast p1, Lcom/ibotta/android/mvp/ui/activity/mcomm/escort/MCommEscortView;

    invoke-interface {p1}, Lcom/ibotta/android/mvp/ui/activity/mcomm/escort/MCommEscortView;->finish()V

    goto :goto_0

    .line 144
    :cond_0
    iget-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/mcomm/escort/MCommEscortPresenterImpl;->mvpView:Lcom/ibotta/android/mvp/base/MvpView;

    check-cast p1, Lcom/ibotta/android/mvp/ui/activity/mcomm/escort/MCommEscortView;

    invoke-interface {p1}, Lcom/ibotta/android/mvp/ui/activity/mcomm/escort/MCommEscortView;->showScreenLoadFailed()V

    :goto_0
    return-void
.end method

.method public setMcommEscortParamsParcel(Lcom/ibotta/android/mvp/ui/activity/mcomm/escort/McommEscortParamsParcel;)V
    .locals 0

    .line 184
    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/mcomm/escort/MCommEscortPresenterImpl;->mcommEscortParamsParcel:Lcom/ibotta/android/mvp/ui/activity/mcomm/escort/McommEscortParamsParcel;

    .line 185
    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/activity/mcomm/escort/MCommEscortPresenterImpl;->setTitle()V

    return-void
.end method
