.class public Lcom/ibotta/android/aop/tracking/advice/OfferRetailerIconAdvice;
.super Lcom/ibotta/android/aop/tracking/advice/AbstractTrackingAdvice;
.source "OfferRetailerIconAdvice.java"


# direct methods
.method public constructor <init>(Lcom/ibotta/android/tracking/TrackingClient;Lcom/ibotta/android/util/AppHelper;Lcom/ibotta/android/state/user/UserState;)V
    .locals 0

    .line 16
    invoke-direct {p0, p1, p2, p3}, Lcom/ibotta/android/aop/tracking/advice/AbstractTrackingAdvice;-><init>(Lcom/ibotta/android/tracking/TrackingClient;Lcom/ibotta/android/util/AppHelper;Lcom/ibotta/android/state/user/UserState;)V

    return-void
.end method


# virtual methods
.method public onExecute(Lorg/aspectj/lang/JoinPoint;)V
    .locals 1

    .line 21
    invoke-interface {p1}, Lorg/aspectj/lang/JoinPoint;->getTarget()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/ibotta/android/aop/tracking/advice/RetailerAdviceField;

    .line 22
    invoke-interface {p1}, Lcom/ibotta/android/aop/tracking/advice/RetailerAdviceField;->getRetailerIdForTracking()Ljava/lang/Integer;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 23
    invoke-interface {p1}, Lcom/ibotta/android/aop/tracking/advice/RetailerAdviceField;->getRetailerIdForTracking()Ljava/lang/Integer;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    .line 25
    :goto_0
    invoke-static {}, Lcom/ibotta/android/tracking/AdviceProperties;->builder()Lcom/ibotta/android/tracking/AdviceProperties$Builder;

    move-result-object v0

    .line 26
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-virtual {v0, p1}, Lcom/ibotta/android/tracking/AdviceProperties$Builder;->clickId(Ljava/lang/Integer;)Lcom/ibotta/android/tracking/AdviceProperties$Builder;

    move-result-object p1

    const-string v0, "icon"

    .line 27
    invoke-virtual {p1, v0}, Lcom/ibotta/android/tracking/AdviceProperties$Builder;->clickName(Ljava/lang/String;)Lcom/ibotta/android/tracking/AdviceProperties$Builder;

    move-result-object p1

    const-string v0, "offer_retailer"

    .line 28
    invoke-virtual {p1, v0}, Lcom/ibotta/android/tracking/AdviceProperties$Builder;->clickType(Ljava/lang/String;)Lcom/ibotta/android/tracking/AdviceProperties$Builder;

    move-result-object p1

    .line 29
    invoke-virtual {p1}, Lcom/ibotta/android/tracking/AdviceProperties$Builder;->build()Lcom/ibotta/android/tracking/AdviceProperties;

    move-result-object p1

    const-string v0, "click_action"

    .line 30
    invoke-virtual {p1}, Lcom/ibotta/android/tracking/AdviceProperties;->getProperties()Ljava/util/Map;

    move-result-object p1

    invoke-virtual {p0, v0, p1}, Lcom/ibotta/android/aop/tracking/advice/OfferRetailerIconAdvice;->logEvent(Ljava/lang/String;Ljava/util/Map;)V

    return-void
.end method