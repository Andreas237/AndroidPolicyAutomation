.class public Lcom/ibotta/android/aop/tracking/advice/UnlockOfferAdvice;
.super Lcom/ibotta/android/aop/tracking/advice/AbstractTrackingAdvice;
.source "UnlockOfferAdvice.java"


# direct methods
.method public constructor <init>(Lcom/ibotta/android/tracking/TrackingClient;Lcom/ibotta/android/util/AppHelper;Lcom/ibotta/android/state/user/UserState;)V
    .locals 0

    .line 18
    invoke-direct {p0, p1, p2, p3}, Lcom/ibotta/android/aop/tracking/advice/AbstractTrackingAdvice;-><init>(Lcom/ibotta/android/tracking/TrackingClient;Lcom/ibotta/android/util/AppHelper;Lcom/ibotta/android/state/user/UserState;)V

    return-void
.end method


# virtual methods
.method public onExecute(Lorg/aspectj/lang/JoinPoint;)V
    .locals 2

    .line 23
    invoke-interface {p1}, Lorg/aspectj/lang/JoinPoint;->getTarget()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/ibotta/android/aop/tracking/advice/EngagementAdviceFields;

    .line 25
    invoke-static {}, Lcom/ibotta/android/tracking/AdviceProperties;->builder()Lcom/ibotta/android/tracking/AdviceProperties$Builder;

    move-result-object v0

    .line 26
    invoke-interface {p1}, Lcom/ibotta/android/aop/tracking/advice/EngagementAdviceFields;->getOfferId()Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/ibotta/android/tracking/AdviceProperties$Builder;->offerId(Ljava/lang/Integer;)Lcom/ibotta/android/tracking/AdviceProperties$Builder;

    .line 28
    invoke-interface {p1}, Lcom/ibotta/android/aop/tracking/advice/EngagementAdviceFields;->getRetailerId()Ljava/lang/Integer;

    move-result-object v1

    if-eqz v1, :cond_0

    .line 29
    invoke-interface {p1}, Lcom/ibotta/android/aop/tracking/advice/EngagementAdviceFields;->getRetailerId()Ljava/lang/Integer;

    move-result-object p1

    invoke-virtual {v0, p1}, Lcom/ibotta/android/tracking/AdviceProperties$Builder;->activatedRetailerId(Ljava/lang/Integer;)Lcom/ibotta/android/tracking/AdviceProperties$Builder;

    :cond_0
    const-string p1, "unlock_offer"

    .line 32
    invoke-virtual {v0}, Lcom/ibotta/android/tracking/AdviceProperties$Builder;->build()Lcom/ibotta/android/tracking/AdviceProperties;

    move-result-object v0

    invoke-virtual {v0}, Lcom/ibotta/android/tracking/AdviceProperties;->getProperties()Ljava/util/Map;

    move-result-object v0

    invoke-virtual {p0, p1, v0}, Lcom/ibotta/android/aop/tracking/advice/UnlockOfferAdvice;->logEvent(Ljava/lang/String;Ljava/util/Map;)V

    return-void
.end method
