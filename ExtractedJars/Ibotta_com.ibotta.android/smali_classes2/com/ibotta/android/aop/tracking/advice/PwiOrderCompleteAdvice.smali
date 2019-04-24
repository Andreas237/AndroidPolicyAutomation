.class public Lcom/ibotta/android/aop/tracking/advice/PwiOrderCompleteAdvice;
.super Lcom/ibotta/android/aop/tracking/advice/AbstractTrackingAdvice;
.source "PwiOrderCompleteAdvice.java"


# direct methods
.method public constructor <init>(Lcom/ibotta/android/tracking/TrackingClient;Lcom/ibotta/android/util/AppHelper;Lcom/ibotta/android/state/user/UserState;)V
    .locals 0

    .line 17
    invoke-direct {p0, p1, p2, p3}, Lcom/ibotta/android/aop/tracking/advice/AbstractTrackingAdvice;-><init>(Lcom/ibotta/android/tracking/TrackingClient;Lcom/ibotta/android/util/AppHelper;Lcom/ibotta/android/state/user/UserState;)V

    return-void
.end method


# virtual methods
.method public onExecute(Lorg/aspectj/lang/JoinPoint;)V
    .locals 4

    .line 22
    invoke-super {p0, p1}, Lcom/ibotta/android/aop/tracking/advice/AbstractTrackingAdvice;->onExecute(Lorg/aspectj/lang/JoinPoint;)V

    .line 24
    invoke-interface {p1}, Lorg/aspectj/lang/JoinPoint;->getTarget()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/ibotta/android/aop/tracking/advice/PwiHomeAdviceFields;

    .line 25
    invoke-interface {p1}, Lcom/ibotta/android/aop/tracking/advice/PwiHomeAdviceFields;->getBuyableGiftCardModel()Lcom/ibotta/api/model/BuyableGiftCardModel;

    move-result-object v0

    .line 27
    invoke-static {}, Lcom/ibotta/android/tracking/AdviceProperties;->builder()Lcom/ibotta/android/tracking/AdviceProperties$Builder;

    move-result-object v1

    .line 28
    invoke-interface {v0}, Lcom/ibotta/api/model/BuyableGiftCardModel;->getId()I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {v1, v2}, Lcom/ibotta/android/tracking/AdviceProperties$Builder;->paymentId(Ljava/lang/Integer;)Lcom/ibotta/android/tracking/AdviceProperties$Builder;

    move-result-object v1

    .line 29
    invoke-interface {v0}, Lcom/ibotta/api/model/BuyableGiftCardModel;->getRetailerId()I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {v1, v2}, Lcom/ibotta/android/tracking/AdviceProperties$Builder;->retailerId(Ljava/lang/Integer;)Lcom/ibotta/android/tracking/AdviceProperties$Builder;

    move-result-object v1

    .line 30
    invoke-interface {v0}, Lcom/ibotta/api/model/BuyableGiftCardModel;->getName()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Lcom/ibotta/android/tracking/AdviceProperties$Builder;->retailerName(Ljava/lang/String;)Lcom/ibotta/android/tracking/AdviceProperties$Builder;

    move-result-object v0

    .line 31
    invoke-interface {p1}, Lcom/ibotta/android/aop/tracking/advice/PwiHomeAdviceFields;->getPaymentAmount()F

    move-result v1

    invoke-static {v1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/ibotta/android/tracking/AdviceProperties$Builder;->paymentAmount(Ljava/lang/Float;)Lcom/ibotta/android/tracking/AdviceProperties$Builder;

    move-result-object v0

    .line 32
    invoke-interface {p1}, Lcom/ibotta/android/aop/tracking/advice/PwiHomeAdviceFields;->getCardType()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/ibotta/android/tracking/AdviceProperties$Builder;->cardType(Ljava/lang/String;)Lcom/ibotta/android/tracking/AdviceProperties$Builder;

    move-result-object v0

    .line 33
    invoke-interface {p1}, Lcom/ibotta/android/aop/tracking/advice/PwiHomeAdviceFields;->getWalletType()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/ibotta/android/tracking/AdviceProperties$Builder;->walletType(Ljava/lang/String;)Lcom/ibotta/android/tracking/AdviceProperties$Builder;

    move-result-object v0

    .line 34
    invoke-virtual {v0}, Lcom/ibotta/android/tracking/AdviceProperties$Builder;->build()Lcom/ibotta/android/tracking/AdviceProperties;

    move-result-object v0

    .line 36
    invoke-static {}, Lcom/ibotta/android/tracking/AdviceProperties;->builder()Lcom/ibotta/android/tracking/AdviceProperties$Builder;

    move-result-object v1

    .line 37
    invoke-interface {p1}, Lcom/ibotta/android/aop/tracking/advice/PwiHomeAdviceFields;->getOrderStartTime()J

    move-result-wide v2

    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p1

    invoke-virtual {v1, p1}, Lcom/ibotta/android/tracking/AdviceProperties$Builder;->eventStart(Ljava/lang/Long;)Lcom/ibotta/android/tracking/AdviceProperties$Builder;

    move-result-object p1

    iget-object v1, p0, Lcom/ibotta/android/aop/tracking/advice/PwiOrderCompleteAdvice;->appHelper:Lcom/ibotta/android/util/AppHelper;

    .line 38
    invoke-interface {v1}, Lcom/ibotta/android/util/AppHelper;->getCurrentTime()J

    move-result-wide v1

    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    invoke-virtual {p1, v1}, Lcom/ibotta/android/tracking/AdviceProperties$Builder;->eventEnd(Ljava/lang/Long;)Lcom/ibotta/android/tracking/AdviceProperties$Builder;

    move-result-object p1

    .line 39
    invoke-virtual {p1}, Lcom/ibotta/android/tracking/AdviceProperties$Builder;->build()Lcom/ibotta/android/tracking/AdviceProperties;

    move-result-object p1

    const-string v1, "pwi_receive_order"

    .line 41
    invoke-virtual {v0}, Lcom/ibotta/android/tracking/AdviceProperties;->getProperties()Ljava/util/Map;

    move-result-object v0

    invoke-virtual {p0, v1, v0}, Lcom/ibotta/android/aop/tracking/advice/PwiOrderCompleteAdvice;->logEvent(Ljava/lang/String;Ljava/util/Map;)V

    const-string v0, "pwi_time_to_complete_order"

    .line 42
    invoke-virtual {p1}, Lcom/ibotta/android/tracking/AdviceProperties;->getProperties()Ljava/util/Map;

    move-result-object p1

    invoke-virtual {p0, v0, p1}, Lcom/ibotta/android/aop/tracking/advice/PwiOrderCompleteAdvice;->logEvent(Ljava/lang/String;Ljava/util/Map;)V

    return-void
.end method
