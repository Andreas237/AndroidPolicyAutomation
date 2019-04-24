.class public Lcom/ibotta/android/aop/tracking/advice/ImAccountLoginViewedAdvice;
.super Lcom/ibotta/android/aop/tracking/advice/AbstractTrackingAdvice;
.source "ImAccountLoginViewedAdvice.java"


# direct methods
.method public constructor <init>(Lcom/ibotta/android/tracking/TrackingClient;Lcom/ibotta/android/util/AppHelper;Lcom/ibotta/android/state/user/UserState;)V
    .locals 0

    .line 19
    invoke-direct {p0, p1, p2, p3}, Lcom/ibotta/android/aop/tracking/advice/AbstractTrackingAdvice;-><init>(Lcom/ibotta/android/tracking/TrackingClient;Lcom/ibotta/android/util/AppHelper;Lcom/ibotta/android/state/user/UserState;)V

    return-void
.end method

.method private createProperties(Ljava/lang/Integer;Z)Ljava/util/Map;
    .locals 1
    .param p1    # Ljava/lang/Integer;
        .annotation build Landroid/support/annotation/Nullable;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Integer;",
            "Z)",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation

    .line 37
    invoke-static {}, Lcom/ibotta/android/tracking/AdviceProperties;->builder()Lcom/ibotta/android/tracking/AdviceProperties$Builder;

    move-result-object v0

    .line 38
    invoke-virtual {v0, p1}, Lcom/ibotta/android/tracking/AdviceProperties$Builder;->retailerId(Ljava/lang/Integer;)Lcom/ibotta/android/tracking/AdviceProperties$Builder;

    move-result-object p1

    const-string v0, "ConnectedAccountsLogin"

    .line 39
    invoke-virtual {p1, v0}, Lcom/ibotta/android/tracking/AdviceProperties$Builder;->screenName(Ljava/lang/String;)Lcom/ibotta/android/tracking/AdviceProperties$Builder;

    move-result-object p1

    .line 40
    invoke-static {p2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p2

    invoke-virtual {p1, p2}, Lcom/ibotta/android/tracking/AdviceProperties$Builder;->cameFromCreateFlow(Ljava/lang/Boolean;)Lcom/ibotta/android/tracking/AdviceProperties$Builder;

    move-result-object p1

    .line 41
    invoke-virtual {p1}, Lcom/ibotta/android/tracking/AdviceProperties$Builder;->build()Lcom/ibotta/android/tracking/AdviceProperties;

    move-result-object p1

    .line 42
    invoke-virtual {p1}, Lcom/ibotta/android/tracking/AdviceProperties;->getProperties()Ljava/util/Map;

    move-result-object p1

    return-object p1
.end method


# virtual methods
.method public onExecute(Lorg/aspectj/lang/JoinPoint;)V
    .locals 1

    .line 24
    invoke-interface {p1}, Lorg/aspectj/lang/JoinPoint;->getTarget()Ljava/lang/Object;

    move-result-object v0

    instance-of v0, v0, Lcom/ibotta/android/aop/tracking/advice/ImLoginAdviceFields;

    if-eqz v0, :cond_0

    .line 28
    invoke-interface {p1}, Lorg/aspectj/lang/JoinPoint;->getTarget()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/ibotta/android/aop/tracking/advice/ImLoginAdviceFields;

    .line 29
    invoke-interface {p1}, Lcom/ibotta/android/aop/tracking/advice/ImLoginAdviceFields;->getRetailerIdForTracking()Ljava/lang/Integer;

    move-result-object v0

    .line 30
    invoke-interface {p1}, Lcom/ibotta/android/aop/tracking/advice/ImLoginAdviceFields;->cameFromCreate()Z

    move-result p1

    .line 31
    invoke-direct {p0, v0, p1}, Lcom/ibotta/android/aop/tracking/advice/ImAccountLoginViewedAdvice;->createProperties(Ljava/lang/Integer;Z)Ljava/util/Map;

    move-result-object p1

    const-string v0, "view_page"

    .line 33
    invoke-virtual {p0, v0, p1}, Lcom/ibotta/android/aop/tracking/advice/ImAccountLoginViewedAdvice;->logEvent(Ljava/lang/String;Ljava/util/Map;)V

    return-void

    .line 25
    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "Must implement ImLoginAdviceFields"

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method
