.class public Lcom/ibotta/android/aop/tracking/advice/PwiSpentToggleAdvice;
.super Lcom/ibotta/android/aop/tracking/advice/AbstractTrackingAdvice;
.source "PwiSpentToggleAdvice.java"


# instance fields
.field private final screenNameMap:Lcom/ibotta/android/aop/tracking/advice/ScreenNameMap;


# direct methods
.method public constructor <init>(Lcom/ibotta/android/tracking/TrackingClient;Lcom/ibotta/android/util/AppHelper;Lcom/ibotta/android/state/user/UserState;Lcom/ibotta/android/aop/tracking/advice/ScreenNameMap;)V
    .locals 0

    .line 20
    invoke-direct {p0, p1, p2, p3}, Lcom/ibotta/android/aop/tracking/advice/AbstractTrackingAdvice;-><init>(Lcom/ibotta/android/tracking/TrackingClient;Lcom/ibotta/android/util/AppHelper;Lcom/ibotta/android/state/user/UserState;)V

    .line 21
    iput-object p4, p0, Lcom/ibotta/android/aop/tracking/advice/PwiSpentToggleAdvice;->screenNameMap:Lcom/ibotta/android/aop/tracking/advice/ScreenNameMap;

    return-void
.end method

.method private buildAdviceProperties(Lcom/ibotta/android/views/pwi/barcode/PwiBarcodeViewState;Lcom/ibotta/android/aop/tracking/advice/PwiBaseAdviceFields;)Lcom/ibotta/android/tracking/AdviceProperties;
    .locals 2

    .line 47
    invoke-static {}, Lcom/ibotta/android/tracking/AdviceProperties;->builder()Lcom/ibotta/android/tracking/AdviceProperties$Builder;

    move-result-object v0

    .line 48
    invoke-interface {p2}, Lcom/ibotta/android/aop/tracking/advice/PwiBaseAdviceFields;->getActivityClass()Ljava/lang/Class;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/ibotta/android/tracking/AdviceProperties$Builder;->nativeScreenName(Ljava/lang/String;)Lcom/ibotta/android/tracking/AdviceProperties$Builder;

    move-result-object v0

    iget-object v1, p0, Lcom/ibotta/android/aop/tracking/advice/PwiSpentToggleAdvice;->screenNameMap:Lcom/ibotta/android/aop/tracking/advice/ScreenNameMap;

    .line 49
    invoke-interface {p2}, Lcom/ibotta/android/aop/tracking/advice/PwiBaseAdviceFields;->getActivityClass()Ljava/lang/Class;

    move-result-object p2

    invoke-virtual {v1, p2}, Lcom/ibotta/android/aop/tracking/advice/ScreenNameMap;->getScreenName(Ljava/lang/Class;)Ljava/lang/String;

    move-result-object p2

    invoke-virtual {v0, p2}, Lcom/ibotta/android/tracking/AdviceProperties$Builder;->screenName(Ljava/lang/String;)Lcom/ibotta/android/tracking/AdviceProperties$Builder;

    move-result-object p2

    .line 50
    invoke-virtual {p1}, Lcom/ibotta/android/views/pwi/barcode/PwiBarcodeViewState;->getBgcId()I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {p2, v0}, Lcom/ibotta/android/tracking/AdviceProperties$Builder;->paymentId(Ljava/lang/Integer;)Lcom/ibotta/android/tracking/AdviceProperties$Builder;

    move-result-object p2

    .line 51
    invoke-virtual {p1}, Lcom/ibotta/android/views/pwi/barcode/PwiBarcodeViewState;->getRetailerId()I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {p2, v0}, Lcom/ibotta/android/tracking/AdviceProperties$Builder;->retailerId(Ljava/lang/Integer;)Lcom/ibotta/android/tracking/AdviceProperties$Builder;

    move-result-object p2

    .line 52
    invoke-virtual {p1}, Lcom/ibotta/android/views/pwi/barcode/PwiBarcodeViewState;->getRetailerName()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p2, v0}, Lcom/ibotta/android/tracking/AdviceProperties$Builder;->retailerName(Ljava/lang/String;)Lcom/ibotta/android/tracking/AdviceProperties$Builder;

    move-result-object p2

    .line 53
    invoke-virtual {p1}, Lcom/ibotta/android/views/pwi/barcode/PwiBarcodeViewState;->getGiftCardAmountValue()F

    move-result v0

    invoke-static {v0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v0

    invoke-virtual {p2, v0}, Lcom/ibotta/android/tracking/AdviceProperties$Builder;->paymentAmount(Ljava/lang/Float;)Lcom/ibotta/android/tracking/AdviceProperties$Builder;

    move-result-object p2

    .line 54
    invoke-virtual {p1}, Lcom/ibotta/android/views/pwi/barcode/PwiBarcodeViewState;->getRewardAmountValue()F

    move-result v0

    invoke-static {v0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v0

    invoke-virtual {p2, v0}, Lcom/ibotta/android/tracking/AdviceProperties$Builder;->rewardAmount(Ljava/lang/Float;)Lcom/ibotta/android/tracking/AdviceProperties$Builder;

    move-result-object p2

    .line 55
    invoke-virtual {p1}, Lcom/ibotta/android/views/pwi/barcode/PwiBarcodeViewState;->isSpent()Z

    move-result p1

    xor-int/lit8 p1, p1, 0x1

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    invoke-virtual {p2, p1}, Lcom/ibotta/android/tracking/AdviceProperties$Builder;->isSpent(Ljava/lang/Boolean;)Lcom/ibotta/android/tracking/AdviceProperties$Builder;

    move-result-object p1

    .line 56
    invoke-virtual {p1}, Lcom/ibotta/android/tracking/AdviceProperties$Builder;->build()Lcom/ibotta/android/tracking/AdviceProperties;

    move-result-object p1

    return-object p1
.end method

.method private buildAdviceProperties(Lcom/ibotta/android/views/pwi/transactions/PwiTransactionRowViewState;Lcom/ibotta/android/aop/tracking/advice/PwiBaseAdviceFields;)Lcom/ibotta/android/tracking/AdviceProperties;
    .locals 2

    .line 61
    invoke-static {}, Lcom/ibotta/android/tracking/AdviceProperties;->builder()Lcom/ibotta/android/tracking/AdviceProperties$Builder;

    move-result-object v0

    .line 62
    invoke-interface {p2}, Lcom/ibotta/android/aop/tracking/advice/PwiBaseAdviceFields;->getActivityClass()Ljava/lang/Class;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/ibotta/android/tracking/AdviceProperties$Builder;->nativeScreenName(Ljava/lang/String;)Lcom/ibotta/android/tracking/AdviceProperties$Builder;

    move-result-object v0

    iget-object v1, p0, Lcom/ibotta/android/aop/tracking/advice/PwiSpentToggleAdvice;->screenNameMap:Lcom/ibotta/android/aop/tracking/advice/ScreenNameMap;

    .line 63
    invoke-interface {p2}, Lcom/ibotta/android/aop/tracking/advice/PwiBaseAdviceFields;->getActivityClass()Ljava/lang/Class;

    move-result-object p2

    invoke-virtual {v1, p2}, Lcom/ibotta/android/aop/tracking/advice/ScreenNameMap;->getScreenName(Ljava/lang/Class;)Ljava/lang/String;

    move-result-object p2

    invoke-virtual {v0, p2}, Lcom/ibotta/android/tracking/AdviceProperties$Builder;->screenName(Ljava/lang/String;)Lcom/ibotta/android/tracking/AdviceProperties$Builder;

    move-result-object p2

    .line 64
    invoke-virtual {p1}, Lcom/ibotta/android/views/pwi/transactions/PwiTransactionRowViewState;->getBgcId()I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {p2, v0}, Lcom/ibotta/android/tracking/AdviceProperties$Builder;->paymentId(Ljava/lang/Integer;)Lcom/ibotta/android/tracking/AdviceProperties$Builder;

    move-result-object p2

    .line 65
    invoke-virtual {p1}, Lcom/ibotta/android/views/pwi/transactions/PwiTransactionRowViewState;->getRetailerId()I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {p2, v0}, Lcom/ibotta/android/tracking/AdviceProperties$Builder;->retailerId(Ljava/lang/Integer;)Lcom/ibotta/android/tracking/AdviceProperties$Builder;

    move-result-object p2

    .line 66
    invoke-virtual {p1}, Lcom/ibotta/android/views/pwi/transactions/PwiTransactionRowViewState;->getRetailerName()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p2, v0}, Lcom/ibotta/android/tracking/AdviceProperties$Builder;->retailerName(Ljava/lang/String;)Lcom/ibotta/android/tracking/AdviceProperties$Builder;

    move-result-object p2

    .line 67
    invoke-virtual {p1}, Lcom/ibotta/android/views/pwi/transactions/PwiTransactionRowViewState;->getGiftCardAmountValue()F

    move-result v0

    invoke-static {v0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v0

    invoke-virtual {p2, v0}, Lcom/ibotta/android/tracking/AdviceProperties$Builder;->paymentAmount(Ljava/lang/Float;)Lcom/ibotta/android/tracking/AdviceProperties$Builder;

    move-result-object p2

    .line 68
    invoke-virtual {p1}, Lcom/ibotta/android/views/pwi/transactions/PwiTransactionRowViewState;->getRewardAmountValue()F

    move-result v0

    invoke-static {v0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v0

    invoke-virtual {p2, v0}, Lcom/ibotta/android/tracking/AdviceProperties$Builder;->rewardAmount(Ljava/lang/Float;)Lcom/ibotta/android/tracking/AdviceProperties$Builder;

    move-result-object p2

    .line 69
    invoke-virtual {p1}, Lcom/ibotta/android/views/pwi/transactions/PwiTransactionRowViewState;->isSpent()Z

    move-result p1

    xor-int/lit8 p1, p1, 0x1

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    invoke-virtual {p2, p1}, Lcom/ibotta/android/tracking/AdviceProperties$Builder;->isSpent(Ljava/lang/Boolean;)Lcom/ibotta/android/tracking/AdviceProperties$Builder;

    move-result-object p1

    .line 70
    invoke-virtual {p1}, Lcom/ibotta/android/tracking/AdviceProperties$Builder;->build()Lcom/ibotta/android/tracking/AdviceProperties;

    move-result-object p1

    return-object p1
.end method


# virtual methods
.method public onExecute(Lorg/aspectj/lang/JoinPoint;)V
    .locals 4

    .line 26
    invoke-interface {p1}, Lorg/aspectj/lang/JoinPoint;->getTarget()Ljava/lang/Object;

    move-result-object v0

    instance-of v0, v0, Lcom/ibotta/android/aop/tracking/advice/PwiBaseAdviceFields;

    if-eqz v0, :cond_3

    .line 30
    invoke-interface {p1}, Lorg/aspectj/lang/JoinPoint;->getTarget()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/aop/tracking/advice/PwiBaseAdviceFields;

    const/4 v1, 0x0

    .line 33
    invoke-interface {p1}, Lorg/aspectj/lang/JoinPoint;->getArgs()[Ljava/lang/Object;

    move-result-object v2

    const/4 v3, 0x0

    aget-object v2, v2, v3

    instance-of v2, v2, Lcom/ibotta/android/views/pwi/barcode/PwiBarcodeViewState;

    if-eqz v2, :cond_0

    .line 34
    invoke-interface {p1}, Lorg/aspectj/lang/JoinPoint;->getArgs()[Ljava/lang/Object;

    move-result-object p1

    aget-object p1, p1, v3

    check-cast p1, Lcom/ibotta/android/views/pwi/barcode/PwiBarcodeViewState;

    .line 35
    invoke-direct {p0, p1, v0}, Lcom/ibotta/android/aop/tracking/advice/PwiSpentToggleAdvice;->buildAdviceProperties(Lcom/ibotta/android/views/pwi/barcode/PwiBarcodeViewState;Lcom/ibotta/android/aop/tracking/advice/PwiBaseAdviceFields;)Lcom/ibotta/android/tracking/AdviceProperties;

    move-result-object v1

    goto :goto_0

    .line 36
    :cond_0
    invoke-interface {p1}, Lorg/aspectj/lang/JoinPoint;->getArgs()[Ljava/lang/Object;

    move-result-object v2

    aget-object v2, v2, v3

    instance-of v2, v2, Lcom/ibotta/android/views/pwi/transactions/PwiTransactionRowViewState;

    if-eqz v2, :cond_1

    .line 37
    invoke-interface {p1}, Lorg/aspectj/lang/JoinPoint;->getArgs()[Ljava/lang/Object;

    move-result-object p1

    aget-object p1, p1, v3

    check-cast p1, Lcom/ibotta/android/views/pwi/transactions/PwiTransactionRowViewState;

    .line 38
    invoke-direct {p0, p1, v0}, Lcom/ibotta/android/aop/tracking/advice/PwiSpentToggleAdvice;->buildAdviceProperties(Lcom/ibotta/android/views/pwi/transactions/PwiTransactionRowViewState;Lcom/ibotta/android/aop/tracking/advice/PwiBaseAdviceFields;)Lcom/ibotta/android/tracking/AdviceProperties;

    move-result-object v1

    :cond_1
    :goto_0
    if-eqz v1, :cond_2

    const-string p1, "pwi_spent_toggle"

    .line 42
    invoke-virtual {v1}, Lcom/ibotta/android/tracking/AdviceProperties;->getProperties()Ljava/util/Map;

    move-result-object v0

    invoke-virtual {p0, p1, v0}, Lcom/ibotta/android/aop/tracking/advice/PwiSpentToggleAdvice;->logEvent(Ljava/lang/String;Ljava/util/Map;)V

    :cond_2
    return-void

    .line 27
    :cond_3
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "Must implement PwiBarcodeAdviceFields"

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method
