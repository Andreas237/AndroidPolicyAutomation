.class public Lcom/ibotta/android/aop/tracking/advice/ReceiptOffersDiffAdvice;
.super Lcom/ibotta/android/aop/tracking/advice/AbstractTrackingAdvice;
.source "ReceiptOffersDiffAdvice.java"


# direct methods
.method public constructor <init>(Lcom/ibotta/android/tracking/TrackingClient;Lcom/ibotta/android/util/AppHelper;Lcom/ibotta/android/state/user/UserState;)V
    .locals 0

    .line 14
    invoke-direct {p0, p1, p2, p3}, Lcom/ibotta/android/aop/tracking/advice/AbstractTrackingAdvice;-><init>(Lcom/ibotta/android/tracking/TrackingClient;Lcom/ibotta/android/util/AppHelper;Lcom/ibotta/android/state/user/UserState;)V

    return-void
.end method

.method private logOfferDiffEvent(Lcom/ibotta/android/aop/tracking/advice/ReceiptOfferDiffAdviceFields;J)V
    .locals 6

    .line 28
    invoke-virtual {p1}, Lcom/ibotta/android/aop/tracking/advice/ReceiptOfferDiffAdviceFields;->getRetailerId()I

    move-result v0

    .line 29
    invoke-virtual {p1}, Lcom/ibotta/android/aop/tracking/advice/ReceiptOfferDiffAdviceFields;->getOfferId()I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    .line 30
    invoke-virtual {p1}, Lcom/ibotta/android/aop/tracking/advice/ReceiptOfferDiffAdviceFields;->getOfferAmountType()Ljava/lang/String;

    move-result-object v2

    .line 31
    invoke-virtual {p1}, Lcom/ibotta/android/aop/tracking/advice/ReceiptOfferDiffAdviceFields;->getExpectedQuantity()I

    move-result v3

    .line 32
    invoke-virtual {p1}, Lcom/ibotta/android/aop/tracking/advice/ReceiptOfferDiffAdviceFields;->getActualQuantity()I

    move-result p1

    if-ne v3, p1, :cond_0

    const/4 v4, 0x1

    goto :goto_0

    :cond_0
    const/4 v4, 0x0

    .line 35
    :goto_0
    invoke-static {}, Lcom/ibotta/android/tracking/AdviceProperties;->builder()Lcom/ibotta/android/tracking/AdviceProperties$Builder;

    move-result-object v5

    .line 36
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {v5, v0}, Lcom/ibotta/android/tracking/AdviceProperties$Builder;->retailerId(Ljava/lang/Integer;)Lcom/ibotta/android/tracking/AdviceProperties$Builder;

    move-result-object v0

    .line 37
    invoke-virtual {v0, v1}, Lcom/ibotta/android/tracking/AdviceProperties$Builder;->offerId(Ljava/lang/Integer;)Lcom/ibotta/android/tracking/AdviceProperties$Builder;

    move-result-object v0

    .line 38
    invoke-virtual {v0, v2}, Lcom/ibotta/android/tracking/AdviceProperties$Builder;->offerAmountType(Ljava/lang/String;)Lcom/ibotta/android/tracking/AdviceProperties$Builder;

    move-result-object v0

    .line 39
    invoke-static {p2, p3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p2

    invoke-virtual {v0, p2}, Lcom/ibotta/android/tracking/AdviceProperties$Builder;->eventAt(Ljava/lang/Long;)Lcom/ibotta/android/tracking/AdviceProperties$Builder;

    move-result-object p2

    .line 40
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p3

    invoke-virtual {p2, p3}, Lcom/ibotta/android/tracking/AdviceProperties$Builder;->receiptExpectedQuantity(Ljava/lang/Integer;)Lcom/ibotta/android/tracking/AdviceProperties$Builder;

    move-result-object p2

    .line 41
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-virtual {p2, p1}, Lcom/ibotta/android/tracking/AdviceProperties$Builder;->receiptSubmittedQuantity(Ljava/lang/Integer;)Lcom/ibotta/android/tracking/AdviceProperties$Builder;

    move-result-object p1

    .line 42
    invoke-static {v4}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p2

    invoke-virtual {p1, p2}, Lcom/ibotta/android/tracking/AdviceProperties$Builder;->correctExpectedQuantity(Ljava/lang/Boolean;)Lcom/ibotta/android/tracking/AdviceProperties$Builder;

    move-result-object p1

    .line 43
    invoke-virtual {p1}, Lcom/ibotta/android/tracking/AdviceProperties$Builder;->build()Lcom/ibotta/android/tracking/AdviceProperties;

    move-result-object p1

    const-string p2, "receipt_offer_diff"

    .line 45
    invoke-virtual {p1}, Lcom/ibotta/android/tracking/AdviceProperties;->getProperties()Ljava/util/Map;

    move-result-object p1

    invoke-virtual {p0, p2, p1}, Lcom/ibotta/android/aop/tracking/advice/ReceiptOffersDiffAdvice;->logEvent(Ljava/lang/String;Ljava/util/Map;)V

    return-void
.end method


# virtual methods
.method public onExecute(Lorg/aspectj/lang/JoinPoint;)V
    .locals 3

    .line 19
    invoke-interface {p1}, Lorg/aspectj/lang/JoinPoint;->getTarget()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/ibotta/android/aop/tracking/advice/ReceiptOffersDiffAdviceFields;

    .line 20
    iget-object v0, p0, Lcom/ibotta/android/aop/tracking/advice/ReceiptOffersDiffAdvice;->appHelper:Lcom/ibotta/android/util/AppHelper;

    invoke-interface {v0}, Lcom/ibotta/android/util/AppHelper;->getCurrentTime()J

    move-result-wide v0

    .line 22
    invoke-interface {p1}, Lcom/ibotta/android/aop/tracking/advice/ReceiptOffersDiffAdviceFields;->getReceiptOfferDiffAdviceFields()Ljava/util/List;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/ibotta/android/aop/tracking/advice/ReceiptOfferDiffAdviceFields;

    .line 23
    invoke-direct {p0, v2, v0, v1}, Lcom/ibotta/android/aop/tracking/advice/ReceiptOffersDiffAdvice;->logOfferDiffEvent(Lcom/ibotta/android/aop/tracking/advice/ReceiptOfferDiffAdviceFields;J)V

    goto :goto_0

    :cond_0
    return-void
.end method
