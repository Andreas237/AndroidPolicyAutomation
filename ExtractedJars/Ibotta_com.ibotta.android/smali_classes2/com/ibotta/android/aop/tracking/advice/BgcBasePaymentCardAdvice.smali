.class public abstract Lcom/ibotta/android/aop/tracking/advice/BgcBasePaymentCardAdvice;
.super Lcom/ibotta/android/aop/tracking/advice/AbstractTrackingAdvice;
.source "BgcBasePaymentCardAdvice.java"


# instance fields
.field private final eventType:Ljava/lang/String;


# direct methods
.method public constructor <init>(Lcom/ibotta/android/tracking/TrackingClient;Lcom/ibotta/android/util/AppHelper;Lcom/ibotta/android/state/user/UserState;Ljava/lang/String;)V
    .locals 0

    .line 17
    invoke-direct {p0, p1, p2, p3}, Lcom/ibotta/android/aop/tracking/advice/AbstractTrackingAdvice;-><init>(Lcom/ibotta/android/tracking/TrackingClient;Lcom/ibotta/android/util/AppHelper;Lcom/ibotta/android/state/user/UserState;)V

    .line 18
    iput-object p4, p0, Lcom/ibotta/android/aop/tracking/advice/BgcBasePaymentCardAdvice;->eventType:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method protected abstract createProperties(Lcom/ibotta/android/aop/tracking/advice/BgcPaymentCardAdviceFields;[Ljava/lang/Object;)Lcom/ibotta/android/tracking/AdviceProperties;
.end method

.method public onExecute(Lorg/aspectj/lang/JoinPoint;)V
    .locals 1

    .line 23
    invoke-super {p0, p1}, Lcom/ibotta/android/aop/tracking/advice/AbstractTrackingAdvice;->onExecute(Lorg/aspectj/lang/JoinPoint;)V

    .line 25
    invoke-interface {p1}, Lorg/aspectj/lang/JoinPoint;->getTarget()Ljava/lang/Object;

    move-result-object v0

    instance-of v0, v0, Lcom/ibotta/android/aop/tracking/advice/BgcPaymentCardAdviceFields;

    if-eqz v0, :cond_0

    .line 29
    invoke-interface {p1}, Lorg/aspectj/lang/JoinPoint;->getTarget()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/aop/tracking/advice/BgcPaymentCardAdviceFields;

    .line 30
    invoke-interface {p1}, Lorg/aspectj/lang/JoinPoint;->getArgs()[Ljava/lang/Object;

    move-result-object p1

    invoke-virtual {p0, v0, p1}, Lcom/ibotta/android/aop/tracking/advice/BgcBasePaymentCardAdvice;->createProperties(Lcom/ibotta/android/aop/tracking/advice/BgcPaymentCardAdviceFields;[Ljava/lang/Object;)Lcom/ibotta/android/tracking/AdviceProperties;

    move-result-object p1

    .line 31
    iget-object v0, p0, Lcom/ibotta/android/aop/tracking/advice/BgcBasePaymentCardAdvice;->eventType:Ljava/lang/String;

    invoke-virtual {p1}, Lcom/ibotta/android/tracking/AdviceProperties;->getProperties()Ljava/util/Map;

    move-result-object p1

    invoke-virtual {p0, v0, p1}, Lcom/ibotta/android/aop/tracking/advice/BgcBasePaymentCardAdvice;->logEvent(Ljava/lang/String;Ljava/util/Map;)V

    return-void

    .line 26
    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "Must implement BgcPaymentCardAdviceFields"

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method
