.class public Lcom/ibotta/android/aop/tracking/advice/PwiErrorAdvice;
.super Lcom/ibotta/android/aop/tracking/advice/AbstractTrackingAdvice;
.source "PwiErrorAdvice.java"


# instance fields
.field private final screenNameMap:Lcom/ibotta/android/aop/tracking/advice/ScreenNameMap;


# direct methods
.method public constructor <init>(Lcom/ibotta/android/tracking/TrackingClient;Lcom/ibotta/android/util/AppHelper;Lcom/ibotta/android/state/user/UserState;Lcom/ibotta/android/aop/tracking/advice/ScreenNameMap;)V
    .locals 0

    .line 22
    invoke-direct {p0, p1, p2, p3}, Lcom/ibotta/android/aop/tracking/advice/AbstractTrackingAdvice;-><init>(Lcom/ibotta/android/tracking/TrackingClient;Lcom/ibotta/android/util/AppHelper;Lcom/ibotta/android/state/user/UserState;)V

    .line 23
    iput-object p4, p0, Lcom/ibotta/android/aop/tracking/advice/PwiErrorAdvice;->screenNameMap:Lcom/ibotta/android/aop/tracking/advice/ScreenNameMap;

    return-void
.end method


# virtual methods
.method public onExecute(Lorg/aspectj/lang/JoinPoint;)V
    .locals 5

    .line 28
    invoke-super {p0, p1}, Lcom/ibotta/android/aop/tracking/advice/AbstractTrackingAdvice;->onExecute(Lorg/aspectj/lang/JoinPoint;)V

    .line 30
    invoke-interface {p1}, Lorg/aspectj/lang/JoinPoint;->getTarget()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/aop/tracking/advice/PwiHomeAdviceFields;

    .line 31
    invoke-interface {p1}, Lorg/aspectj/lang/JoinPoint;->getArgs()[Ljava/lang/Object;

    move-result-object v1

    const/4 v2, 0x0

    aget-object v1, v1, v2

    check-cast v1, Lcom/ibotta/api/model/pwi/PwiError;

    .line 32
    invoke-interface {p1}, Lorg/aspectj/lang/JoinPoint;->getArgs()[Ljava/lang/Object;

    move-result-object p1

    const/4 v2, 0x1

    aget-object p1, p1, v2

    check-cast p1, Ljava/lang/Integer;

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    .line 34
    invoke-static {}, Lcom/ibotta/android/tracking/AdviceProperties;->builder()Lcom/ibotta/android/tracking/AdviceProperties$Builder;

    move-result-object v2

    .line 35
    invoke-interface {v0}, Lcom/ibotta/android/aop/tracking/advice/PwiHomeAdviceFields;->getActivityClass()Ljava/lang/Class;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Lcom/ibotta/android/tracking/AdviceProperties$Builder;->nativeScreenName(Ljava/lang/String;)Lcom/ibotta/android/tracking/AdviceProperties$Builder;

    move-result-object v2

    iget-object v3, p0, Lcom/ibotta/android/aop/tracking/advice/PwiErrorAdvice;->screenNameMap:Lcom/ibotta/android/aop/tracking/advice/ScreenNameMap;

    .line 36
    invoke-interface {v0}, Lcom/ibotta/android/aop/tracking/advice/PwiHomeAdviceFields;->getActivityClass()Ljava/lang/Class;

    move-result-object v4

    invoke-virtual {v3, v4}, Lcom/ibotta/android/aop/tracking/advice/ScreenNameMap;->getScreenName(Ljava/lang/Class;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Lcom/ibotta/android/tracking/AdviceProperties$Builder;->screenName(Ljava/lang/String;)Lcom/ibotta/android/tracking/AdviceProperties$Builder;

    move-result-object v2

    .line 37
    invoke-interface {v0}, Lcom/ibotta/android/aop/tracking/advice/PwiHomeAdviceFields;->getBuyableGiftCardModel()Lcom/ibotta/api/model/BuyableGiftCardModel;

    move-result-object v0

    invoke-interface {v0}, Lcom/ibotta/api/model/BuyableGiftCardModel;->getRetailerId()I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {v2, v0}, Lcom/ibotta/android/tracking/AdviceProperties$Builder;->retailerId(Ljava/lang/Integer;)Lcom/ibotta/android/tracking/AdviceProperties$Builder;

    move-result-object v0

    if-nez v1, :cond_0

    const-string v1, ""

    goto :goto_0

    .line 38
    :cond_0
    invoke-virtual {v1}, Lcom/ibotta/api/model/pwi/PwiError;->getCode()Ljava/lang/String;

    move-result-object v1

    :goto_0
    invoke-virtual {v0, v1}, Lcom/ibotta/android/tracking/AdviceProperties$Builder;->errorCode(Ljava/lang/String;)Lcom/ibotta/android/tracking/AdviceProperties$Builder;

    move-result-object v0

    .line 39
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-virtual {v0, p1}, Lcom/ibotta/android/tracking/AdviceProperties$Builder;->networkCode(Ljava/lang/Integer;)Lcom/ibotta/android/tracking/AdviceProperties$Builder;

    move-result-object p1

    .line 40
    invoke-virtual {p1}, Lcom/ibotta/android/tracking/AdviceProperties$Builder;->build()Lcom/ibotta/android/tracking/AdviceProperties;

    move-result-object p1

    const-string v0, "errors"

    .line 42
    invoke-virtual {p1}, Lcom/ibotta/android/tracking/AdviceProperties;->getProperties()Ljava/util/Map;

    move-result-object p1

    invoke-virtual {p0, v0, p1}, Lcom/ibotta/android/aop/tracking/advice/PwiErrorAdvice;->logEvent(Ljava/lang/String;Ljava/util/Map;)V

    return-void
.end method
