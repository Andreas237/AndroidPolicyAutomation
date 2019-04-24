.class public Lcom/ibotta/android/aop/tracking/advice/PwiOnboardingNextAdvice;
.super Lcom/ibotta/android/aop/tracking/advice/AbstractTrackingAdvice;
.source "PwiOnboardingNextAdvice.java"


# direct methods
.method public constructor <init>(Lcom/ibotta/android/tracking/TrackingClient;Lcom/ibotta/android/util/AppHelper;Lcom/ibotta/android/state/user/UserState;)V
    .locals 0

    .line 17
    invoke-direct {p0, p1, p2, p3}, Lcom/ibotta/android/aop/tracking/advice/AbstractTrackingAdvice;-><init>(Lcom/ibotta/android/tracking/TrackingClient;Lcom/ibotta/android/util/AppHelper;Lcom/ibotta/android/state/user/UserState;)V

    return-void
.end method


# virtual methods
.method public onExecute(Lorg/aspectj/lang/JoinPoint;)V
    .locals 2

    .line 22
    invoke-interface {p1}, Lorg/aspectj/lang/JoinPoint;->getTarget()Ljava/lang/Object;

    move-result-object v0

    instance-of v0, v0, Lcom/ibotta/android/aop/tracking/advice/PwiOnboardingAdviceFields;

    if-eqz v0, :cond_0

    .line 25
    invoke-interface {p1}, Lorg/aspectj/lang/JoinPoint;->getTarget()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/ibotta/android/aop/tracking/advice/PwiOnboardingAdviceFields;

    .line 27
    invoke-static {}, Lcom/ibotta/android/tracking/AdviceProperties;->builder()Lcom/ibotta/android/tracking/AdviceProperties$Builder;

    move-result-object v0

    .line 28
    invoke-interface {p1}, Lcom/ibotta/android/aop/tracking/advice/PwiOnboardingAdviceFields;->isFirstOnboarding()Z

    move-result v1

    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/ibotta/android/tracking/AdviceProperties$Builder;->firstView(Ljava/lang/Boolean;)Lcom/ibotta/android/tracking/AdviceProperties$Builder;

    move-result-object v0

    .line 29
    invoke-interface {p1}, Lcom/ibotta/android/aop/tracking/advice/PwiOnboardingAdviceFields;->currentPageIndex()I

    move-result p1

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-virtual {v0, p1}, Lcom/ibotta/android/tracking/AdviceProperties$Builder;->listIndex(Ljava/lang/Integer;)Lcom/ibotta/android/tracking/AdviceProperties$Builder;

    move-result-object p1

    .line 30
    invoke-virtual {p1}, Lcom/ibotta/android/tracking/AdviceProperties$Builder;->build()Lcom/ibotta/android/tracking/AdviceProperties;

    move-result-object p1

    const-string v0, "pwi_onboarding_next"

    .line 32
    invoke-virtual {p1}, Lcom/ibotta/android/tracking/AdviceProperties;->getProperties()Ljava/util/Map;

    move-result-object p1

    invoke-virtual {p0, v0, p1}, Lcom/ibotta/android/aop/tracking/advice/PwiOnboardingNextAdvice;->logEvent(Ljava/lang/String;Ljava/util/Map;)V

    return-void

    .line 23
    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "Must implement PwiOnboardingAdviceFields"

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method
