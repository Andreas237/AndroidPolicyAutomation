.class public Lcom/ibotta/android/aop/tracking/advice/PwiConfirmPayCancelledAdvice;
.super Lcom/ibotta/android/aop/tracking/advice/AbstractTrackingAdvice;
.source "PwiConfirmPayCancelledAdvice.java"


# direct methods
.method public constructor <init>(Lcom/ibotta/android/tracking/TrackingClient;Lcom/ibotta/android/util/AppHelper;Lcom/ibotta/android/state/user/UserState;)V
    .locals 0

    .line 18
    invoke-direct {p0, p1, p2, p3}, Lcom/ibotta/android/aop/tracking/advice/AbstractTrackingAdvice;-><init>(Lcom/ibotta/android/tracking/TrackingClient;Lcom/ibotta/android/util/AppHelper;Lcom/ibotta/android/state/user/UserState;)V

    return-void
.end method


# virtual methods
.method public onExecute(Lorg/aspectj/lang/JoinPoint;)V
    .locals 1

    .line 23
    invoke-super {p0, p1}, Lcom/ibotta/android/aop/tracking/advice/AbstractTrackingAdvice;->onExecute(Lorg/aspectj/lang/JoinPoint;)V

    const-string p1, "pwi_confirm_payment_cancelled"

    .line 24
    sget-object v0, Lcom/ibotta/android/tracking/AdviceProperties;->EMPTY:Lcom/ibotta/android/tracking/AdviceProperties;

    invoke-virtual {v0}, Lcom/ibotta/android/tracking/AdviceProperties;->getProperties()Ljava/util/Map;

    move-result-object v0

    invoke-virtual {p0, p1, v0}, Lcom/ibotta/android/aop/tracking/advice/PwiConfirmPayCancelledAdvice;->logEvent(Ljava/lang/String;Ljava/util/Map;)V

    return-void
.end method
